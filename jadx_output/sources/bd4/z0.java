package bd4;

/* loaded from: classes4.dex */
public final class z0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView f19421d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f19422e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f19423f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19424g;

    public z0(com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView improveRecyclerView, int i17, int i18, int i19) {
        this.f19421d = improveRecyclerView;
        this.f19422e = i17;
        this.f19423f = i18;
        this.f19424g = i19;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGlobalLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView$safeForceScrollToPosition$2");
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView improveRecyclerView = this.f19421d;
        improveRecyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        improveRecyclerView.postDelayed(new bd4.y0(improveRecyclerView, this.f19422e, this.f19423f, this.f19424g), 5L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGlobalLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView$safeForceScrollToPosition$2");
    }
}
