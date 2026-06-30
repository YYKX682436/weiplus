package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class zc implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f287821d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f287822e;

    public zc(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.content.Context context) {
        this.f287821d = f9Var;
        this.f287822e = context;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String str = ((java.lang.Object) menuItem.getTitle()) + "";
        wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f287821d;
        java.lang.String z07 = f9Var.z0();
        ((vf0.y1) x1Var).getClass();
        t21.v2 h17 = t21.d3.h(z07);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LongClickBrandServiceHelper", "connector click[video]: to[%s] imgPath[%s]", str, f9Var.z0());
        dk5.c2 c2Var = new dk5.c2();
        android.content.Context context = this.f287822e;
        java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
        android.content.Context context2 = this.f287822e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(context, string, context2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572085yb), true, true, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.yc(this, c2Var));
        c2Var.f316075b = context2;
        c2Var.f316079f = f9Var.z0();
        c2Var.f316074a = Q;
        c2Var.f316081h = str;
        c2Var.f316077d = h17.f496555t;
        c2Var.f316078e = h17.f496548m;
        c2Var.execute(new java.lang.Object[0]);
        c01.sc.d().a(c01.sc.f118994d, null);
        db5.e1.T(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572081y7));
    }
}
