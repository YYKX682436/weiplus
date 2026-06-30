package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class wh extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderPostPlaySquareContainerFragment f110700d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh(com.tencent.mm.plugin.finder.feed.ui.FinderPostPlaySquareContainerFragment finderPostPlaySquareContainerFragment) {
        super(0);
        this.f110700d = finderPostPlaySquareContainerFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.fragment.app.FragmentActivity activity = this.f110700d.getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        return (com.tencent.mm.ui.MMActivity) activity;
    }
}
