package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class r2 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 f190413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f190414e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f190415f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f190416g;

    public r2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var, java.lang.Runnable runnable, so2.y0 y0Var, boolean z17) {
        this.f190413d = a7Var;
        this.f190414e = runnable;
        this.f190415f = y0Var;
        this.f190416g = z17;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.kh2 req = (r45.kh2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var = this.f190413d;
        yw2.a0 a0Var = a7Var.f187749o;
        if (a0Var != null) {
            a0Var.s().removeCallbacks(this.f190414e);
        }
        int m75939xb282bd08 = ret.m75939xb282bd08(1);
        android.content.Context context = a7Var.f187740d;
        so2.y0 y0Var = this.f190415f;
        if (m75939xb282bd08 != 0) {
            a7Var.G1 = null;
            y0Var.f492236d.u0().m76106x1d32ee50(0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MenuItemCreateListener", "comment black list failed:" + ret.m75939xb282bd08(1));
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var.b(com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
            e4Var.f293309c = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e7h);
            e4Var.c();
            return;
        }
        y0Var.f492236d.u0().m76106x1d32ee50(1);
        if (!this.f190416g) {
            android.app.Dialog dialog = a7Var.F1;
            if (dialog != null) {
                dialog.dismiss();
            }
            int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var2.b(com.p314xaae8f345.mm.R.raw.f79676xdf4900bc);
            e4Var2.f293309c = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e7g);
            e4Var2.c();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7.h(a7Var, y0Var, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MenuItemCreateListener", "comment black list succ");
    }
}
