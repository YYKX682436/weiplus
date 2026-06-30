package c84;

/* loaded from: classes4.dex */
public class d extends bh5.l {

    /* renamed from: e, reason: collision with root package name */
    public boolean f39705e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context, int i17) {
        super(context, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // bh5.l, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ad.widget.MMAdFullScreenDialog");
        super.onCreate(bundle);
        if (this.f39705e) {
            android.view.Window window = getWindow();
            android.view.WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
            if (attributes != null) {
                attributes.windowAnimations = 0;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ad.widget.MMAdFullScreenDialog");
    }
}
