package r9;

/* loaded from: classes7.dex */
public final class q implements r9.k {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f474938a;

    /* renamed from: b, reason: collision with root package name */
    public final r9.k0 f474939b;

    /* renamed from: c, reason: collision with root package name */
    public final r9.k f474940c;

    /* renamed from: d, reason: collision with root package name */
    public r9.k f474941d;

    /* renamed from: e, reason: collision with root package name */
    public r9.k f474942e;

    /* renamed from: f, reason: collision with root package name */
    public r9.k f474943f;

    /* renamed from: g, reason: collision with root package name */
    public r9.k f474944g;

    /* renamed from: h, reason: collision with root package name */
    public r9.k f474945h;

    public q(android.content.Context context, r9.k0 k0Var, r9.k kVar) {
        this.f474938a = context.getApplicationContext();
        this.f474939b = k0Var;
        kVar.getClass();
        this.f474940c = kVar;
    }

    @Override // r9.k
    public int a(byte[] bArr, int i17, int i18) {
        return this.f474945h.a(bArr, i17, i18);
    }

    @Override // r9.k
    public long b(r9.n nVar) {
        boolean z17 = true;
        t9.a.d(this.f474945h == null);
        java.lang.String scheme = nVar.f474916a.getScheme();
        int i17 = t9.d0.f498031a;
        android.net.Uri uri = nVar.f474916a;
        java.lang.String scheme2 = uri.getScheme();
        if (!android.text.TextUtils.isEmpty(scheme2) && !scheme2.equals("file")) {
            z17 = false;
        }
        android.content.Context context = this.f474938a;
        r9.k0 k0Var = this.f474939b;
        if (z17) {
            if (uri.getPath().startsWith("/android_asset/")) {
                if (this.f474942e == null) {
                    this.f474942e = new r9.d(context, k0Var);
                }
                this.f474945h = this.f474942e;
            } else {
                if (this.f474941d == null) {
                    this.f474941d = new r9.u(k0Var);
                }
                this.f474945h = this.f474941d;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f474942e == null) {
                this.f474942e = new r9.d(context, k0Var);
            }
            this.f474945h = this.f474942e;
        } else if ("content".equals(scheme)) {
            if (this.f474943f == null) {
                this.f474943f = new r9.g(context, k0Var);
            }
            this.f474945h = this.f474943f;
        } else {
            boolean equals = "rtmp".equals(scheme);
            r9.k kVar = this.f474940c;
            if (equals) {
                if (this.f474944g == null) {
                    try {
                        this.f474944g = (r9.k) java.lang.Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
                    } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
                    }
                    if (this.f474944g == null) {
                        this.f474944g = kVar;
                    }
                }
                this.f474945h = this.f474944g;
            } else {
                this.f474945h = kVar;
            }
        }
        return this.f474945h.b(nVar);
    }

    @Override // r9.k
    /* renamed from: close */
    public void mo10286x5a5ddf8() {
        r9.k kVar = this.f474945h;
        if (kVar != null) {
            try {
                kVar.mo10286x5a5ddf8();
            } finally {
                this.f474945h = null;
            }
        }
    }

    @Override // r9.k
    /* renamed from: getUri */
    public android.net.Uri mo10287xb5887636() {
        r9.k kVar = this.f474945h;
        if (kVar == null) {
            return null;
        }
        return kVar.mo10287xb5887636();
    }
}
