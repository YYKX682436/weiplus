package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac;

/* loaded from: classes7.dex */
public class j implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162501a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162502b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f162503c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.k f162504d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.k kVar, java.lang.String str, java.lang.String str2, boolean z17) {
        this.f162504d = kVar;
        this.f162501a = str;
        this.f162502b = str2;
        this.f162503c = z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.g
    public void a(boolean z17, java.lang.String str) {
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenBusinessView", "openBusinessViewByMiniProgram success");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenBusinessView", "openBusinessViewByMiniProgram fail, reason=%s", str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.k kVar = this.f162504d;
        kVar.f162512h.D(kVar.f162505a, kVar.f162506b, -1, "fail system error");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.g
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 c11808xe47dc718) {
        boolean z17 = !((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).Ni();
        com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1 c3897xbc286aa1 = (com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1) c11808xe47dc718;
        boolean z18 = c3897xbc286aa1.N.D;
        boolean f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.e4.f();
        java.lang.String str = this.f162501a;
        java.lang.String str2 = this.f162502b;
        boolean z19 = this.f162503c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenBusinessView", "openBusinessViewByMiniProgram-onBeforeNavigate, target appId:%s, path:%s, transparent(svr?:%b, compatibility?:%b, app?:%b, app.debug_switch?:%b)", str, str2, java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(f17));
        if (z19 && z17) {
            if (z18 || f17) {
                com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3898xeaad22a8 c3898xeaad22a8 = new com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3898xeaad22a8();
                c3898xeaad22a8.f128821f = k91.z3.TRANSPARENT;
                k91.y3 y3Var = k91.y3.DISABLED;
                c3898xeaad22a8.f128824i = y3Var;
                c3898xeaad22a8.f128825m = y3Var;
                c3897xbc286aa1.B1 = c3898xeaad22a8;
            }
        }
    }
}
