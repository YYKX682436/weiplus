package bd4;

/* loaded from: classes4.dex */
public final class a2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bd4.f2 f19294d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f19295e;

    public a2(bd4.f2 f2Var, boolean z17) {
        this.f19294d = f2Var;
        this.f19295e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$selectAllText$1");
        bd4.f2 f2Var = this.f19294d;
        f2Var.D();
        wl5.x m17 = f2Var.m();
        if (m17 != null) {
            m17.L = this.f19295e;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$selectAllText$1");
    }
}
