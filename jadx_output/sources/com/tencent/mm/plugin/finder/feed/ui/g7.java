package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class g7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorCommentManagerUI f110077d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorCommentManagerUI finderLiveAnchorCommentManagerUI) {
        super(1);
        this.f110077d = finderLiveAnchorCommentManagerUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        int i17 = com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorCommentManagerUI.f109322J;
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorCommentManagerUI finderLiveAnchorCommentManagerUI = this.f110077d;
        finderLiveAnchorCommentManagerUI.getClass();
        if (!(str == null || str.length() == 0)) {
            dk2.q4 q4Var = dk2.q4.f233938a;
            androidx.appcompat.app.AppCompatActivity context = finderLiveAnchorCommentManagerUI.getContext();
            gk2.e eVar = new gk2.e(null, 1, null);
            androidx.appcompat.app.AppCompatActivity context2 = finderLiveAnchorCommentManagerUI.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            dk2.q4.j(q4Var, context, eVar, false, str, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) pf5.z.f353948a.a(context2).c(zy2.ra.class))).V6(), false, null, 96, null);
        }
        return jz5.f0.f302826a;
    }
}
