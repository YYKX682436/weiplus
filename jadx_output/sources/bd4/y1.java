package bd4;

/* loaded from: classes4.dex */
public final class y1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bd4.f2 f19417d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f19418e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f19419f;

    public y1(bd4.f2 f2Var, int i17, boolean z17) {
        this.f19417d = f2Var;
        this.f19418e = i17;
        this.f19419f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$onListViewScrollEnd$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getListViewScrollVersion$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        bd4.f2 f2Var = this.f19417d;
        int i17 = f2Var.f19341v;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getListViewScrollVersion$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        if (i17 != this.f19418e) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$onListViewScrollEnd$1");
            return;
        }
        wl5.x m17 = f2Var.m();
        if (m17 != null) {
            m17.L = false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setListViewScrolling$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        f2Var.f19340u = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setListViewScrolling$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        if (this.f19419f) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$onListViewScrollEnd$1");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$isSelectionOutOfVisibleArea", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        boolean t17 = f2Var.t();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$isSelectionOutOfVisibleArea", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        if (t17) {
            f2Var.k();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$onListViewScrollEnd$1");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$restoreCursorHandleIfAllowed", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        f2Var.y(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$restoreCursorHandleIfAllowed", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$isDownInSelectionOnTouch$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        boolean z17 = f2Var.f19336q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$isDownInSelectionOnTouch$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setDownInSelectionOnTouch$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            f2Var.f19336q = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setDownInSelectionOnTouch$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$showOperateMenuInternal", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            f2Var.E();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$showOperateMenuInternal", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$onListViewScrollEnd$1");
    }
}
