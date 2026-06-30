package uy3;

/* loaded from: classes2.dex */
public final class s0 implements com.p314xaae8f345.mm.p944x882e457a.u0, xq1.g {

    /* renamed from: d, reason: collision with root package name */
    public final wq1.d f513527d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.y f513528e;

    public s0(wq1.d uiComponent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiComponent, "uiComponent");
        this.f513527d = uiComponent;
        gm0.j1.d().a(1532, this);
    }

    @Override // xq1.g
    public void a(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanBoxWebData", "requestDataFromServer requestId: %s, queryJson: %s", str, str2);
        if (str2 == null || str2.length() == 0) {
            return;
        }
        try {
            if (this.f513528e != null) {
                gm0.j1.d().d(this.f513528e);
            }
            this.f513528e = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.y(str, str2, 1);
            gm0.j1.d().g(this.f513528e);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanBoxWebData", e17, "requestDataFromServer exception", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String str2;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        objArr[2] = str;
        java.lang.String str3 = null;
        objArr[3] = m1Var != null ? java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanBoxWebData", "onSceneEnd errType: %d, errCode: %d, errMsg: %s, scene type: %s", objArr);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m1Var, this.f513528e)) {
            xq1.f u17 = this.f513527d.u();
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.y yVar = this.f513528e;
            if (yVar == null || (str2 = yVar.f240632d) == null) {
                str2 = "";
            }
            if (yVar != null) {
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = yVar.f240634f.f152244b.f152233a;
                r45.xi xiVar = fVar != null ? (r45.xi) fVar : null;
                if (xiVar != null) {
                    str3 = xiVar.f471647d;
                }
            }
            u17.a(str2, i18, str, str3 != null ? str3 : "");
        }
    }
}
