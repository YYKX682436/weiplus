package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class zg implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderNewManagementUI f110803a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMSwitchBtn f110804b;

    public zg(com.tencent.mm.plugin.finder.feed.ui.FinderNewManagementUI finderNewManagementUI, com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn) {
        this.f110803a = finderNewManagementUI;
        this.f110804b = mMSwitchBtn;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        com.tencent.mm.plugin.finder.feed.ui.FinderNewManagementUI context = this.f110803a;
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = this.f110804b;
        if (!z17) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            com.tencent.mm.plugin.finder.feed.ui.yg ygVar = new com.tencent.mm.plugin.finder.feed.ui.yg(mMSwitchBtn);
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) context, 1, true);
            k0Var.q(context.getResources().getString(com.tencent.mm.R.string.o17), 17);
            k0Var.f211872n = new ya2.n(1, context);
            k0Var.f211881s = new ya2.o(1, ygVar, context);
            k0Var.f211854d = new ya2.p(ygVar);
            k0Var.f211892z = new ya2.q(1, context, 0L);
            k0Var.v();
            return;
        }
        mMSwitchBtn.setCheck(true);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        androidx.appcompat.app.AppCompatActivity context2 = context.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_ACCOUNT_SELF_CONTINUE_WATCH_INT_SYNC, 1);
        hb2.e eVar = hb2.e.f280035e;
        ya2.m mVar = new ya2.m(context2);
        eVar.getClass();
        r45.mh2 mh2Var = new r45.mh2();
        mh2Var.set(0, 1);
        hb2.w0.m(eVar, mh2Var, mVar, false, false, null, null, 60, null);
    }
}
