package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class r4 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderGameLivePostUI f110480d;

    public r4(com.tencent.mm.plugin.finder.feed.ui.FinderGameLivePostUI finderGameLivePostUI) {
        this.f110480d = finderGameLivePostUI;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        pk2.j9 j9Var;
        com.tencent.mm.plugin.finder.live.widget.e5 e5Var;
        com.tencent.mm.plugin.finder.live.viewmodel.s4 s4Var = (com.tencent.mm.plugin.finder.live.viewmodel.s4) obj;
        com.tencent.mm.plugin.finder.feed.ui.FinderGameLivePostUI activity = this.f110480d;
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.live.viewmodel.s5 s5Var = (com.tencent.mm.plugin.finder.live.viewmodel.s5) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.live.viewmodel.s5.class);
        int i17 = s4Var.f117393b;
        pk2.o9 o9Var = s5Var.f117394d;
        if (o9Var == null || (j9Var = o9Var.f356084g) == null || (e5Var = j9Var.f355886b) == null) {
            return;
        }
        e5Var.a(i17, s4Var.f117392a);
    }
}
