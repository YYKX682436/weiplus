package og1;

/* loaded from: classes7.dex */
public final class f extends og1.c {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f426677d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f426678e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f426679f;

    /* renamed from: g, reason: collision with root package name */
    public final int f426680g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f426681h;

    public f(java.lang.String str, java.lang.String str2, boolean z17, k91.d5 d5Var) {
        super(new r45.xc7(), new r45.zc7());
        com.p314xaae8f345.mm.p2495xc50a8b8b.g f17;
        this.f426677d = str;
        this.f426678e = str2;
        this.f426679f = "MicroMsg.WALaunchCgiWxaAttrSync";
        this.f426680g = 1151;
        this.f426681h = "/cgi-bin/mmbiz-bin/wxaattr/wxaattrsync";
        r45.xc7 xc7Var = (r45.xc7) this.f149953a;
        xc7Var.f471515d = str;
        xc7Var.f471517f = str2;
        if (z17) {
            f17 = null;
        } else {
            if (str == null || str.length() == 0) {
                if (str2 == null || str2.length() == 0) {
                    throw new java.lang.IllegalArgumentException("both username & appId is empty");
                }
                f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.q.f(str2);
            } else {
                f17 = k91.j4.i1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.ij().n1(str, "syncVersion"));
            }
        }
        xc7Var.f471516e = f17;
        if (d5Var != null) {
            ((r45.xc7) this.f149953a).f471518g = d5Var.c();
            ((r45.xc7) this.f149953a).f471519h = d5Var.b();
            ((r45.xc7) this.f149953a).f471520i = d5Var.a();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("<init> hash:");
        sb6.append(hashCode());
        sb6.append(", username:");
        sb6.append(str);
        sb6.append(", appId:");
        sb6.append(str2);
        sb6.append(", cleanUpdate:");
        sb6.append(z17);
        sb6.append(", instanceId:");
        java.lang.String str3 = ((r45.xc7) this.f149953a).f471518g;
        sb6.append(str3 == null ? "" : str3);
        sb6.append(", scene:");
        sb6.append(((r45.xc7) this.f149953a).f471519h);
        sb6.append(", source:");
        sb6.append(wz0.a.a(((r45.xc7) this.f149953a).f471520i));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WALaunchCgiWxaAttrSync", sb6.toString());
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.c
    public int a() {
        return this.f426680g;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.c
    public java.lang.String b() {
        return this.f426679f;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.c
    public java.lang.String c() {
        return this.f426681h;
    }

    @Override // og1.c
    public java.lang.String f() {
        return this.f426678e;
    }

    @Override // og1.c
    public java.lang.String g() {
        return this.f426677d;
    }
}
