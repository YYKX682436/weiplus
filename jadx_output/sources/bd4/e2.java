package bd4;

/* loaded from: classes4.dex */
public final class e2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bd4.f2 f19314d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f19315e;

    public e2(bd4.f2 f2Var, boolean z17) {
        this.f19314d = f2Var;
        this.f19315e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wl5.x m17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$userSwitchContentState$1$1");
        bd4.f2 f2Var = this.f19314d;
        f2Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setContentStateChanging", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setContentStateChanging", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        if (this.f19315e && (m17 = f2Var.m()) != null) {
            m17.L = false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$userSwitchContentState$1$1");
    }
}
