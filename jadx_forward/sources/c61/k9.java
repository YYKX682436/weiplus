package c61;

/* loaded from: classes3.dex */
public final class k9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.g5 f120639d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ug5.v f120640e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9(zy2.g5 g5Var, ug5.v vVar) {
        super(0);
        this.f120639d = g5Var;
        this.f120640e = vVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object obj = this.f120639d;
        boolean z17 = obj instanceof android.view.View;
        android.view.View view = z17 ? (android.view.View) obj : null;
        android.view.ViewParent parent = view != null ? view.getParent() : null;
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoSurfaceViewService", "onPerformStart#onFirstFrame " + this.f120640e.f509193c);
            viewGroup.removeView(z17 ? (android.view.View) obj : null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.findersdk.api.IFinderFluentVideoView");
            zy2.p7 p7Var = (zy2.p7) obj;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15176x3a5a59de) p7Var).r0();
            if (!(obj instanceof zy2.p7)) {
                p7Var = null;
            }
            if (p7Var != null) {
                p7Var.mo61223x32e9c3b6(null);
            }
        }
        return jz5.f0.f384359a;
    }
}
