package k91;

/* loaded from: classes7.dex */
public class k1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.d {

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f387190o;

    /* renamed from: p, reason: collision with root package name */
    public final r45.xc7 f387191p;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k1(java.lang.String r8, java.lang.String r9, boolean r10) {
        /*
            r7 = this;
            r4 = 0
            r5 = 0
            r45.y50 r6 = new r45.y50
            r6.<init>()
            r0 = 1
            r6.f472332f = r0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k91.k1.<init>(java.lang.String, java.lang.String, boolean):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.d
    public r45.y50 A() {
        return this.f387191p.f471520i;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.d
    public java.lang.String B() {
        java.lang.String str = this.f387191p.f471518g;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return str == null ? "" : str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.d
    public java.lang.String C() {
        java.lang.String str = this.f387191p.f471515d;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return str == null ? "" : str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.d, com.p314xaae8f345.mm.p944x882e457a.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        super.x(i17, i18, str, (r45.zc7) fVar, m1Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiWxaAttrSync", "onCgiBack errType:%d, errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.d
    public pq5.g u() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f387190o.f152243a.f152217a;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.a.a(((r45.xc7) fVar).f471517f, ((r45.xc7) fVar).f471515d)) {
            return null;
        }
        return pq5.h.d(new k91.j1(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.d
    public void x(int i17, int i18, java.lang.String str, r45.js5 js5Var, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        super.x(i17, i18, str, (r45.zc7) js5Var, m1Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiWxaAttrSync", "onCgiBack errType:%d, errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.d
    public java.lang.String y() {
        java.lang.String str = this.f387191p.f471517f;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return str == null ? "" : str;
    }

    public k1(java.lang.String str, java.lang.String str2, boolean z17, java.lang.String str3, int i17, r45.y50 y50Var) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g f17;
        java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.xc7 xc7Var = new r45.xc7();
        this.f387191p = xc7Var;
        xc7Var.f471515d = str;
        if (z17) {
            f17 = null;
        } else {
            f17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.q.f(str2) : k91.j4.i1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.ij().n1(str, "syncVersion"));
        }
        xc7Var.f471516e = f17;
        xc7Var.f471517f = str2;
        xc7Var.f471518g = str3;
        xc7Var.f471519h = i17;
        java.util.Objects.requireNonNull(y50Var);
        xc7Var.f471520i = y50Var;
        xc7Var.f471522n = wo.w0.m();
        java.lang.String str5 = android.os.Build.VERSION.RELEASE;
        xc7Var.f471523o = str5;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x7.a();
        if (a17 != null) {
            r45.fd7 fd7Var = new r45.fd7();
            xc7Var.f471521m = fd7Var;
            fd7Var.f455779d = a17.i();
            xc7Var.f471525q = a17.W0();
        }
        xc7Var.f471524p = str5;
        lVar.f152197a = xc7Var;
        lVar.f152198b = new r45.zc7();
        lVar.f152200d = 1151;
        lVar.f152199c = "/cgi-bin/mmbiz-bin/wxaattr/wxaattrsync";
        com.p314xaae8f345.mm.p944x882e457a.o a18 = lVar.a();
        this.f387190o = a18;
        p(a18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiWxaAttrSync", "<init> hash:%d, username:%s, appId:%s, cleanUpdate:%b, instanceId:%s, scene:%d, source:%s", java.lang.Integer.valueOf(hashCode()), str, str2, java.lang.Boolean.valueOf(z17), str3, java.lang.Integer.valueOf(i17), wz0.a.a(y50Var));
    }
}
