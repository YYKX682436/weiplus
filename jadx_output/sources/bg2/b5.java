package bg2;

/* loaded from: classes2.dex */
public final class b5 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.c5 f19943d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(bg2.c5 c5Var) {
        super(3);
        this.f19943d = c5Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.view.ViewGroup viewGroup;
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        com.tencent.mm.plugin.finder.video.FinderLivePlayView playerView = (com.tencent.mm.plugin.finder.video.FinderLivePlayView) obj3;
        kotlin.jvm.internal.o.g(playerView, "playerView");
        in5.s0 s0Var = this.f19943d.f417141d.f417149i;
        if (s0Var != null && (viewGroup = (android.view.ViewGroup) s0Var.p(com.tencent.mm.R.id.f484625ey0)) != null) {
            int i17 = com.tencent.mm.plugin.finder.video.FinderLivePlayView.f130597p1;
            playerView.h(viewGroup, intValue, intValue2, false);
        }
        return jz5.f0.f302826a;
    }
}
