package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes3.dex */
public final class xg implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f111065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f111066e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f111067f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f111068g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f111069h;

    public xg(kotlin.jvm.internal.h0 h0Var, int i17, com.tencent.mm.ui.MMActivity mMActivity, zy2.i5 i5Var, zy2.i5 i5Var2) {
        this.f111065d = h0Var;
        this.f111066e = i17;
        this.f111067f = mMActivity;
        this.f111068g = i5Var;
        this.f111069h = i5Var2;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        gm0.j1.d().q(6276, this);
        kotlin.jvm.internal.h0 h0Var = this.f111065d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var2 = (com.tencent.mm.ui.widget.dialog.u3) h0Var.f310123d;
        if ((u3Var2 != null && u3Var2.isShowing()) && (u3Var = (com.tencent.mm.ui.widget.dialog.u3) h0Var.f310123d) != null) {
            u3Var.dismiss();
        }
        com.tencent.mm.ui.MMActivity mMActivity = this.f111067f;
        if (i17 != 0 || i18 != 0) {
            com.tencent.mm.plugin.finder.feed.jh jhVar = com.tencent.mm.plugin.finder.feed.jh.f107101a;
            com.tencent.mm.plugin.finder.feed.jh.f107104d = 0;
            pm0.v.X(new com.tencent.mm.plugin.finder.feed.wg(i18, mMActivity, this.f111069h));
            return;
        }
        java.lang.String string = this.f111066e == 1 ? mMActivity.getContext().getString(com.tencent.mm.R.string.eb9) : mMActivity.getContext().getString(com.tencent.mm.R.string.eb7);
        kotlin.jvm.internal.o.d(string);
        db5.t7.m(mMActivity.getContext(), string);
        com.tencent.mm.plugin.finder.feed.jh jhVar2 = com.tencent.mm.plugin.finder.feed.jh.f107101a;
        tx2.i0 i0Var = com.tencent.mm.plugin.finder.feed.jh.f107102b;
        com.tencent.mm.plugin.finder.feed.jh.f107102b = null;
        if (i0Var != null) {
            i0Var.a();
        }
        this.f111068g.a(java.lang.Integer.valueOf(com.tencent.mm.plugin.finder.feed.jh.f107104d));
    }
}
