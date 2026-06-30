package th1;

/* loaded from: classes7.dex */
public final class g extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f500853d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f500854e;

    /* renamed from: f, reason: collision with root package name */
    public final th1.f f500855f;

    public g(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18, int i19, int i27, int i28, th1.c cVar, java.lang.String str5, int i29, boolean z17, boolean z18, th1.f fVar) {
        long j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneJSOperateWxData", "<init> hash[%d], pubVersionCode [%d], pubVersionName [%s], appId [%s], data [%s], grantScope [%s], versionType [%d], opt [%d], extScene [%d]  sessionId [%s]  avatarOpt [%d] routeType[%s]", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(i17), str, str2, str3, str4, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), str5, java.lang.Integer.valueOf(i29), cVar);
        com.p314xaae8f345.mm.p944x882e457a.o a17 = th1.d.a(cVar).a();
        this.f500853d = a17;
        r45.m24 m24Var = (r45.m24) a17.f152243a.f152217a;
        m24Var.f461622d = str2;
        m24Var.f461623e = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(str3.getBytes() == null ? new byte[0] : str3.getBytes());
        m24Var.f461624f = str4;
        m24Var.f461626h = i18;
        m24Var.f461625g = i27;
        m24Var.f461628m = i19;
        m24Var.f461630o = i29;
        m24Var.f461629n = str5;
        m24Var.f461631p = z17;
        m24Var.f461632q = z18;
        r45.nd7 nd7Var = new r45.nd7();
        m24Var.f461627i = nd7Var;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            try {
                j17 = c01.id.c();
            } catch (java.lang.Exception unused) {
                j17 = -1;
            }
        } else {
            j17 = c01.id.b();
        }
        nd7Var.f462831g = j17;
        r45.pe7 pe7Var = new r45.pe7();
        pe7Var.f464524e = str;
        pe7Var.f464523d = i17;
        r45.nd7 nd7Var2 = m24Var.f461627i;
        nd7Var2.f462832h = pe7Var;
        if (i28 > 0) {
            nd7Var2.f462829e = i28;
        }
        this.f500855f = fVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode());
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f500853d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneJSOperateWxData", "doScene hash=%d, funcid=%d", valueOf, java.lang.Integer.valueOf(oVar.f152246d));
        this.f500854e = u0Var;
        return mo9409x10f9447a(sVar, oVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1133;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneJSOperateWxData", "onGYNetEnd, hash[%d] errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f500854e;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
        th1.f fVar = this.f500855f;
        if (fVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.i3) fVar).a(i18, i19, str, this);
        }
    }
}
