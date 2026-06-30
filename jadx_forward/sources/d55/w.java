package d55;

/* loaded from: classes12.dex */
public class w implements d55.x {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f308153a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f308154b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Bundle f308155c = new android.os.Bundle();

    /* renamed from: d, reason: collision with root package name */
    public android.content.SharedPreferences f308156d;

    public w(android.content.Context context, java.lang.String str) {
        this.f308153a = context;
        this.f308154b = str;
    }

    @Override // d55.x
    public /* bridge */ /* synthetic */ d55.x a() {
        e();
        return this;
    }

    public final void b() {
        if (this.f308156d == null) {
            throw new java.lang.IllegalStateException("Persis#load() has not yet been called");
        }
    }

    @Override // d55.x
    public /* bridge */ /* synthetic */ d55.x c() {
        h();
        return this;
    }

    @Override // d55.x
    public d55.x d() {
        b();
        f().apply();
        return this;
    }

    public d55.w e() {
        this.f308156d = this.f308153a.getSharedPreferences(this.f308154b, 4);
        return this;
    }

    public final android.content.SharedPreferences.Editor f() {
        android.content.SharedPreferences.Editor edit = this.f308156d.edit();
        android.os.Bundle bundle = this.f308155c;
        for (java.lang.String str : bundle.keySet()) {
            java.lang.Object obj = bundle.get(str);
            if (obj != null) {
                java.lang.String obj2 = obj.toString();
                if (d55.n0.b(obj2)) {
                    try {
                        edit.putLong(str, java.lang.Long.parseLong(obj2));
                    } catch (java.lang.Throwable unused) {
                    }
                } else if (obj2.equalsIgnoreCase("true") || obj2.equalsIgnoreCase("false")) {
                    edit.putBoolean(str, java.lang.Boolean.parseBoolean(obj2));
                } else {
                    edit.putString(str, obj2);
                }
            }
        }
        return edit;
    }

    public d55.w g(java.lang.String str, long j17) {
        b();
        this.f308155c.putLong(str, j17);
        return this;
    }

    @Override // d55.x
    /* renamed from: getBoolean */
    public boolean mo123524x41a8a7f2(java.lang.String str, boolean z17) {
        b();
        android.os.Bundle bundle = this.f308155c;
        return bundle.containsKey(str) ? bundle.getBoolean(str) : this.f308156d.getBoolean(str, z17);
    }

    @Override // d55.x
    /* renamed from: getInt */
    public int mo123525xb58848b9(java.lang.String str, int i17) {
        return d55.n0.d(mo123526xfb822ef2(str, i17), i17);
    }

    @Override // d55.x
    /* renamed from: getLong */
    public long mo123526xfb822ef2(java.lang.String str, long j17) {
        b();
        android.os.Bundle bundle = this.f308155c;
        if (bundle.containsKey(str)) {
            return bundle.getLong(str);
        }
        android.content.SharedPreferences sharedPreferences = this.f308156d;
        if (!sharedPreferences.contains(str)) {
            return j17;
        }
        try {
            return sharedPreferences.getLong(str, j17);
        } catch (java.lang.Throwable unused) {
            try {
                return sharedPreferences.getInt(str, 0);
            } catch (java.lang.Throwable unused2) {
                return j17;
            }
        }
    }

    @Override // d55.x
    /* renamed from: getString */
    public java.lang.String mo123527x2fec8307(java.lang.String str, java.lang.String str2) {
        b();
        android.os.Bundle bundle = this.f308155c;
        return bundle.containsKey(str) ? bundle.getString(str) : this.f308156d.getString(str, str2);
    }

    public d55.w h() {
        b();
        f().commit();
        return this;
    }

    @Override // d55.x
    /* renamed from: putBoolean */
    public d55.x mo123528x1c849219(java.lang.String str, boolean z17) {
        b();
        this.f308155c.putBoolean(str, z17);
        return this;
    }

    @Override // d55.x
    /* renamed from: putInt */
    public d55.x mo123529xc5c55e60(java.lang.String str, int i17) {
        g(str, i17);
        return this;
    }

    @Override // d55.x
    /* renamed from: putLong */
    public /* bridge */ /* synthetic */ d55.x mo123530xf2e7ce2b(java.lang.String str, long j17) {
        g(str, j17);
        return this;
    }

    @Override // d55.x
    /* renamed from: putString */
    public d55.x mo123531xe4673800(java.lang.String str, java.lang.String str2) {
        b();
        this.f308155c.putString(str, str2);
        return this;
    }
}
