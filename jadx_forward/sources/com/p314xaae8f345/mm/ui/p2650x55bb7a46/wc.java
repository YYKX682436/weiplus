package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class wc implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f287753d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f287754e;

    public wc(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.content.Context context) {
        this.f287753d = f9Var;
        this.f287754e = context;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String str = ((java.lang.Object) menuItem.getTitle()) + "";
        java.lang.String Ai = ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).Ai(this.f287753d);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Ai)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LongClickBrandServiceHelper", "Transfer fileName erro: fileName null");
            return;
        }
        w21.w0 j17 = w21.x0.j(Ai);
        java.lang.String r17 = w21.x0.r(str, Ai, j17 == null ? 0 : j17.f524028l);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LongClickBrandServiceHelper", "connector click[voice]: to[%s] filePath[%s]", str, r17);
        c01.d9.e().g(new w21.o(r17, 1));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10424, 34, 2, str);
        android.content.Context context = this.f287754e;
        db5.e1.T(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572081y7));
    }
}
