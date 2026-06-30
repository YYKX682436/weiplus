package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class r2 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f108880d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f108881e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f108882f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f108883g;

    public r2(com.tencent.mm.plugin.finder.feed.a7 a7Var, java.lang.Runnable runnable, so2.y0 y0Var, boolean z17) {
        this.f108880d = a7Var;
        this.f108881e = runnable;
        this.f108882f = y0Var;
        this.f108883g = z17;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.kh2 req = (r45.kh2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        com.tencent.mm.plugin.finder.feed.a7 a7Var = this.f108880d;
        yw2.a0 a0Var = a7Var.f106216o;
        if (a0Var != null) {
            a0Var.s().removeCallbacks(this.f108881e);
        }
        int integer = ret.getInteger(1);
        android.content.Context context = a7Var.f106207d;
        so2.y0 y0Var = this.f108882f;
        if (integer != 0) {
            a7Var.G1 = null;
            y0Var.f410703d.u0().setBlacklist_flag(0);
            com.tencent.mars.xlog.Log.i("Finder.MenuItemCreateListener", "comment black list failed:" + ret.getInteger(1));
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.b(com.tencent.mm.R.raw.icons_filled_info);
            e4Var.f211776c = context.getString(com.tencent.mm.R.string.e7h);
            e4Var.c();
            return;
        }
        y0Var.f410703d.u0().setBlacklist_flag(1);
        if (!this.f108883g) {
            android.app.Dialog dialog = a7Var.F1;
            if (dialog != null) {
                dialog.dismiss();
            }
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var2.b(com.tencent.mm.R.raw.icons_filled_check_mark);
            e4Var2.f211776c = context.getString(com.tencent.mm.R.string.e7g);
            e4Var2.c();
        }
        com.tencent.mm.plugin.finder.feed.a7.h(a7Var, y0Var, false);
        com.tencent.mars.xlog.Log.i("Finder.MenuItemCreateListener", "comment black list succ");
    }
}
