package bd4;

/* loaded from: classes4.dex */
public final class z1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bd4.f2 f19425d;

    public z1(bd4.f2 f2Var) {
        this.f19425d = f2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$restoreCursorHandleAfterDrag$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("restoreCursorHandleIfAllowed$default", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        bd4.f2 f2Var = this.f19425d;
        f2Var.y(false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("restoreCursorHandleIfAllowed$default", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        if (bd4.f2.d(f2Var).length() > 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$isListViewScrolling$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            boolean z17 = f2Var.f19340u;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$isListViewScrolling$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            if (!z17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$showOperateMenuInternal", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                f2Var.E();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$showOperateMenuInternal", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$restoreCursorHandleAfterDrag$1");
    }
}
