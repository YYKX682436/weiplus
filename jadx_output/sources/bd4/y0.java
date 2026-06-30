package bd4;

/* loaded from: classes4.dex */
public final class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView f19413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f19414e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f19415f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19416g;

    public y0(com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView improveRecyclerView, int i17, int i18, int i19) {
        this.f19413d = improveRecyclerView;
        this.f19414e = i17;
        this.f19415f = i18;
        this.f19416g = i19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView$safeForceScrollToPosition$2$onGlobalLayout$1");
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView improveRecyclerView = this.f19413d;
        int i17 = this.f19414e;
        androidx.recyclerview.widget.k3 p07 = improveRecyclerView.p0(i17);
        int top = (p07 == null || (view = p07.itemView) == null) ? 0 : view.getTop();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("forceScrollToPosition view:");
        sb6.append(p07 != null ? p07.itemView : null);
        sb6.append(" offset:");
        sb6.append(top);
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.RecyclerView", sb6.toString());
        int i18 = this.f19415f;
        if (top == i18) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView$safeForceScrollToPosition$2$onGlobalLayout$1");
            return;
        }
        int i19 = this.f19416g + 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$safeForceScrollToPosition", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView");
        improveRecyclerView.g1(i17, i18, i19);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$safeForceScrollToPosition", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView$safeForceScrollToPosition$2$onGlobalLayout$1");
    }
}
