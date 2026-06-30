package com.tencent.mm.plugin.ball.ui;

/* loaded from: classes14.dex */
public class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f93309d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.ResultReceiver f93310e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.ui.q0 f93311f;

    public l0(com.tencent.mm.plugin.ball.ui.q0 q0Var, boolean z17, android.os.ResultReceiver resultReceiver) {
        this.f93311f = q0Var;
        this.f93309d = z17;
        this.f93310e = resultReceiver;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.ball.ui.n nVar = this.f93311f.f93346d;
        if (nVar != null) {
            op1.a aVar = nVar.f93328m;
            aVar.getClass();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            aVar.f347235a = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.ball.view.FloatBallView floatBallView = nVar.f93318c;
            if (floatBallView == null || nVar.f93319d == null) {
                return;
            }
            floatBallView.H(false, null);
            nVar.f93319d.setInLongPressMode(false);
            nVar.f93319d.setForceShowFloatMenu(true);
            nVar.f93319d.i(null, this.f93310e);
            nVar.f93330o = this.f93309d;
        }
    }
}
