package eb;

/* loaded from: classes13.dex */
public final class c {

    /* renamed from: f, reason: collision with root package name */
    public static eb.c f332224f;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f332225a;

    /* renamed from: b, reason: collision with root package name */
    public android.os.Bundle f332226b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.reflect.Method f332227c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.reflect.Method f332228d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f332229e = new java.util.concurrent.atomic.AtomicInteger((int) android.os.SystemClock.elapsedRealtime());

    public c(android.content.Context context) {
        this.f332225a = context.getApplicationContext();
    }

    public static java.lang.String a(android.os.Bundle bundle, java.lang.String str) {
        java.lang.String string = bundle.getString(str);
        return string == null ? bundle.getString(str.replace("gcm.n.", "gcm.notification.")) : string;
    }

    public static void b(android.content.Intent intent, android.os.Bundle bundle) {
        for (java.lang.String str : bundle.keySet()) {
            if (str.startsWith("google.c.a.") || str.equals("from")) {
                intent.putExtra(str, bundle.getString(str));
            }
        }
    }

    public final android.os.Bundle c() {
        android.content.pm.ApplicationInfo applicationInfo;
        android.os.Bundle bundle;
        android.content.Context context = this.f332225a;
        android.os.Bundle bundle2 = this.f332226b;
        if (bundle2 != null) {
            return bundle2;
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            applicationInfo = null;
        }
        if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
            return android.os.Bundle.EMPTY;
        }
        this.f332226b = bundle;
        return bundle;
    }

    public final boolean d(int i17) {
        if (android.os.Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            return !(this.f332225a.getResources().getDrawable(i17, null) instanceof android.graphics.drawable.AdaptiveIconDrawable);
        } catch (android.content.res.Resources.NotFoundException unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String e(android.os.Bundle r12, java.lang.String r13) {
        /*
            r11 = this;
            java.lang.String r0 = a(r12, r13)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto Lb
            return r0
        Lb:
            java.lang.String r0 = java.lang.String.valueOf(r13)
            java.lang.String r1 = "_loc_key"
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r0 = a(r12, r0)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            r3 = 0
            if (r2 == 0) goto L21
            return r3
        L21:
            android.content.Context r2 = r11.f332225a
            android.content.res.Resources r4 = r2.getResources()
            java.lang.String r5 = "string"
            java.lang.String r2 = r2.getPackageName()
            int r2 = r4.getIdentifier(r0, r5, r2)
            r5 = 6
            if (r2 != 0) goto L66
            java.lang.String r12 = java.lang.String.valueOf(r13)
            int r13 = r1.length()
            if (r13 == 0) goto L43
            java.lang.String r12 = r12.concat(r1)
            goto L49
        L43:
            java.lang.String r13 = new java.lang.String
            r13.<init>(r12)
            r12 = r13
        L49:
            java.lang.String r12 = r12.substring(r5)
            java.lang.String r12 = java.lang.String.valueOf(r12)
            int r12 = r12.length()
            int r12 = r12 + 49
            java.lang.String r13 = java.lang.String.valueOf(r0)
            int r13 = r13.length()
            int r12 = r12 + r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r12)
            return r3
        L66:
            java.lang.String r1 = java.lang.String.valueOf(r13)
            java.lang.String r6 = "_loc_args"
            java.lang.String r1 = r1.concat(r6)
            java.lang.String r12 = a(r12, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r12)
            if (r1 == 0) goto L7c
        L7a:
            r8 = r3
            goto Lb8
        L7c:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: org.json.JSONException -> L93
            r1.<init>(r12)     // Catch: org.json.JSONException -> L93
            int r7 = r1.length()     // Catch: org.json.JSONException -> L93
            java.lang.String[] r8 = new java.lang.String[r7]     // Catch: org.json.JSONException -> L93
            r9 = 0
        L88:
            if (r9 >= r7) goto Lb8
            java.lang.Object r10 = r1.opt(r9)     // Catch: org.json.JSONException -> L93
            r8[r9] = r10     // Catch: org.json.JSONException -> L93
            int r9 = r9 + 1
            goto L88
        L93:
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r13 = r13.concat(r6)
            java.lang.String r13 = r13.substring(r5)
            java.lang.String r13 = java.lang.String.valueOf(r13)
            int r13 = r13.length()
            int r13 = r13 + 41
            java.lang.String r12 = java.lang.String.valueOf(r12)
            int r12 = r12.length()
            int r13 = r13 + r12
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r13)
            goto L7a
        Lb8:
            if (r8 != 0) goto Lbf
            java.lang.String r12 = r4.getString(r2)
            return r12
        Lbf:
            java.lang.String r12 = r4.getString(r2, r8)     // Catch: java.util.MissingFormatArgumentException -> Lc4
            return r12
        Lc4:
            java.lang.String r12 = java.util.Arrays.toString(r8)
            java.lang.String r13 = java.lang.String.valueOf(r0)
            int r13 = r13.length()
            int r13 = r13 + 58
            java.lang.String r12 = java.lang.String.valueOf(r12)
            int r12 = r12.length()
            int r13 = r13 + r12
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r13)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.c.e(android.os.Bundle, java.lang.String):java.lang.String");
    }
}
