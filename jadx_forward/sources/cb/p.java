package cb;

/* loaded from: classes13.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.SharedPreferences f121696a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f121697b;

    /* renamed from: c, reason: collision with root package name */
    public final cb.g0 f121698c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f121699d;

    public p(android.content.Context context) {
        boolean isEmpty;
        cb.g0 g0Var = new cb.g0();
        this.f121699d = new x.b();
        this.f121697b = context;
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f121696a = sharedPreferences;
        this.f121698c = g0Var;
        java.io.File file = new java.io.File(b3.l.m9711xb657be0f(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    isEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (isEmpty) {
                    return;
                }
                c();
                com.p176xb6135e39.p271xde6bf207.iid.C2743x723fba17.b().n();
            }
        } catch (java.io.IOException e17) {
            if (android.util.Log.isLoggable("FirebaseInstanceId", 3)) {
                java.lang.String valueOf = java.lang.String.valueOf(e17.getMessage());
                if (valueOf.length() != 0) {
                    "Error creating file in no backup dir: ".concat(valueOf);
                }
            }
        }
    }

    public static java.lang.String a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 4 + java.lang.String.valueOf(str2).length() + java.lang.String.valueOf(str3).length());
        sb6.append(str);
        sb6.append("|T|");
        sb6.append(str2);
        sb6.append("|");
        sb6.append(str3);
        return sb6.toString();
    }

    public static java.lang.String d(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 3 + java.lang.String.valueOf(str2).length());
        sb6.append(str);
        sb6.append("|S|");
        sb6.append(str2);
        return sb6.toString();
    }

    public final synchronized java.lang.String b() {
        java.lang.String string = this.f121696a.getString("topic_operaion_queue", null);
        if (string != null) {
            java.lang.String[] split = string.split(",");
            if (split.length > 1 && !android.text.TextUtils.isEmpty(split[1])) {
                return split[1];
            }
        }
        return null;
    }

    public final synchronized void c() {
        ((x.n) this.f121699d).clear();
        android.content.Context context = this.f121697b;
        java.io.File m9711xb657be0f = b3.l.m9711xb657be0f(context);
        if (m9711xb657be0f == null || !m9711xb657be0f.isDirectory()) {
            m9711xb657be0f = context.getFilesDir();
        }
        for (java.io.File file : m9711xb657be0f.listFiles()) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
        this.f121696a.edit().clear().commit();
    }
}
