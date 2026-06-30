package ad4;

/* loaded from: classes4.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f3169d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f3170e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f3171f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f3172g;

    public a0(android.view.View view, android.widget.TextView textView, android.widget.TextView textView2, android.view.View view2) {
        this.f3169d = view;
        this.f3170e = textView;
        this.f3171f = textView2;
        this.f3172g = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion$applyFoldingLogic$2");
        android.view.View view = this.f3169d;
        if (view.isAttachedToWindow()) {
            ad4.c0.f3175a.a(view, this.f3170e, this.f3171f, this.f3172g.getWidth());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion$applyFoldingLogic$2");
    }
}
