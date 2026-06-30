package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class o8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveCreateVisitorModeUI f110366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f110367e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f110368f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8(com.tencent.mm.plugin.finder.feed.ui.FinderLiveCreateVisitorModeUI finderLiveCreateVisitorModeUI, int i17, java.lang.String str) {
        super(0);
        this.f110366d = finderLiveCreateVisitorModeUI;
        this.f110367e = i17;
        this.f110368f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.plugin.finder.feed.ui.FinderLiveCreateVisitorModeUI.S;
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveCreateVisitorModeUI finderLiveCreateVisitorModeUI = this.f110366d;
        boolean z17 = true;
        finderLiveCreateVisitorModeUI.e7(true);
        if (this.f110367e == -200066) {
            java.lang.String str = this.f110368f;
            if (str != null && str.length() != 0) {
                z17 = false;
            }
            if (z17) {
                str = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dbk);
            }
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(finderLiveCreateVisitorModeUI.getContext());
            u1Var.g(str);
            java.lang.String string = finderLiveCreateVisitorModeUI.getContext().getResources().getString(com.tencent.mm.R.string.d3z);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            u1Var.n(string);
            u1Var.l(new com.tencent.mm.plugin.finder.feed.ui.a9(finderLiveCreateVisitorModeUI));
            u1Var.q(false);
        } else {
            db5.t7.makeText(finderLiveCreateVisitorModeUI, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dbk), 0).show();
        }
        return jz5.f0.f302826a;
    }
}
