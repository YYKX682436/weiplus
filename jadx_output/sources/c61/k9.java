package c61;

/* loaded from: classes3.dex */
public final class k9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.g5 f39106d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ug5.v f39107e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9(zy2.g5 g5Var, ug5.v vVar) {
        super(0);
        this.f39106d = g5Var;
        this.f39107e = vVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object obj = this.f39106d;
        boolean z17 = obj instanceof android.view.View;
        android.view.View view = z17 ? (android.view.View) obj : null;
        android.view.ViewParent parent = view != null ? view.getParent() : null;
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            com.tencent.mars.xlog.Log.i("FinderVideoSurfaceViewService", "onPerformStart#onFirstFrame " + this.f39107e.f427660c);
            viewGroup.removeView(z17 ? (android.view.View) obj : null);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.findersdk.api.IFinderFluentVideoView");
            zy2.p7 p7Var = (zy2.p7) obj;
            ((com.tencent.mm.plugin.finder.video.FinderFluentVideoView) p7Var).r0();
            if (!(obj instanceof zy2.p7)) {
                p7Var = null;
            }
            if (p7Var != null) {
                p7Var.setFirstVideoFrameRenderedAfterSurfaceChange(null);
            }
        }
        return jz5.f0.f302826a;
    }
}
