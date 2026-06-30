package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class p4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderGameLiveAuthUI f110395d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(com.tencent.mm.plugin.finder.feed.ui.FinderGameLiveAuthUI finderGameLiveAuthUI) {
        super(0);
        this.f110395d = finderGameLiveAuthUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.ui.FinderGameLiveAuthUI activity = this.f110395d;
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        ((com.tencent.mm.plugin.finder.live.viewmodel.k2) zVar.a(activity).a(com.tencent.mm.plugin.finder.live.viewmodel.k2.class)).O6();
        activity.f109280z = true;
        androidx.appcompat.app.AppCompatActivity context = activity.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
        yl2.g1 g1Var = new yl2.g1((com.tencent.mm.ui.MMFragmentActivity) context, 0, 0L, 6, null);
        g1Var.f463012e = false;
        activity.B = g1Var;
        androidx.lifecycle.c1 a17 = zVar.a(activity).a(com.tencent.mm.plugin.finder.live.viewmodel.k2.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        pf5.e.launchUI$default((pf5.e) a17, null, null, new com.tencent.mm.plugin.finder.feed.ui.o4(activity, null), 3, null);
        return jz5.f0.f302826a;
    }
}
