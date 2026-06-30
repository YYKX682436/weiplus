package ad4;

/* loaded from: classes4.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f3212d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f3213e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f3214f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3215g;

    public z(android.view.View view, android.widget.TextView textView, android.widget.TextView textView2, int i17) {
        this.f3212d = view;
        this.f3213e = textView;
        this.f3214f = textView2;
        this.f3215g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion$applyFoldingLogic$1");
        android.view.View view = this.f3212d;
        if (view.isAttachedToWindow()) {
            ad4.c0.f3175a.a(view, this.f3213e, this.f3214f, this.f3215g);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion$applyFoldingLogic$1");
    }
}
