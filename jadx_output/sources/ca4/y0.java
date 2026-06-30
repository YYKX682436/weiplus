package ca4;

/* loaded from: classes3.dex */
public class y0 extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Float f40064a;

    public y0(java.lang.Float f17) {
        this.f40064a = f17;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOutline", "com.tencent.mm.plugin.sns.data.SnsUtil$2");
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f40064a.floatValue());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOutline", "com.tencent.mm.plugin.sns.data.SnsUtil$2");
    }
}
