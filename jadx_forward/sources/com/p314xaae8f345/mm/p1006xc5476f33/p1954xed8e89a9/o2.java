package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9;

/* loaded from: classes11.dex */
public class o2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f235101d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f235102e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f235103f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f235104g;

    public o2(android.content.Intent intent, int i17, int i18, java.lang.String str) {
        this.f235101d = intent;
        this.f235102e = i17;
        this.f235103f = i18;
        this.f235104g = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6992x3ac5162 c6992x3ac5162 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6992x3ac5162();
        android.content.Intent intent = this.f235101d;
        c6992x3ac5162.f143062d = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.wi(intent);
        c6992x3ac5162.f143068j = intent.getIntExtra("CONTACT_INFO_UI_SUB_SOURCE", 0);
        c6992x3ac5162.f143063e = this.f235102e;
        c6992x3ac5162.f143064f = this.f235103f;
        java.lang.String str = this.f235104g;
        c6992x3ac5162.f143065g = c6992x3ac5162.b(dm.i4.f66875xa013b0d5, str, true);
        c6992x3ac5162.f143067i = c6992x3ac5162.b("TextStatusID", ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).Vi(str), true);
        if (intent.getIntExtra("key_label_click_source", 0) > 0) {
            c6992x3ac5162.f143062d = 22L;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.wi(intent) == 60) {
            java.lang.String stringExtra = intent.getStringExtra("key_text_status_comment_id");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                try {
                    cl0.g gVar = new cl0.g();
                    gVar.h("from_status_comment", stringExtra);
                    c6992x3ac5162.f143073o = c6992x3ac5162.b("ExtraSourceInfo", gVar.toString(), true);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SubCoreProfile", "report16055, exp=" + e17.toString());
                }
            }
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.f235111e;
        if (z3Var != null && z3Var.d1().equals(str)) {
            java.lang.Boolean bool = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.f235112f;
            if (bool == null) {
                c6992x3ac5162.f143069k = 0L;
            } else {
                c6992x3ac5162.f143069k = bool.booleanValue() ? 1L : 2L;
            }
            java.lang.Boolean bool2 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.f235113g;
            if (bool2 == null) {
                c6992x3ac5162.f143070l = 0L;
            } else {
                c6992x3ac5162.f143070l = bool2.booleanValue() ? 1L : 2L;
            }
            c6992x3ac5162.f143071m = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.f235111e.V) ? 2L : 1L;
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.f235111e;
            int i17 = z3Var2.I;
            if (i17 == 0) {
                c6992x3ac5162.f143072n = 0L;
            } else {
                c6992x3ac5162.f143072n = i17 == 1 ? 1L : 2L;
            }
            c6992x3ac5162.f143071m = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z3Var2.V) ? 2L : 1L;
        }
        c6992x3ac5162.k();
    }
}
