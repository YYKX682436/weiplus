package b44;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b44.b f17818d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b44.b bVar) {
        super(0);
        this.f17818d = bVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.drawable.WaterMarkDrawable$textBound$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.drawable.WaterMarkDrawable$textBound$2");
        android.graphics.Rect rect = new android.graphics.Rect();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTextPaint$p", "com.tencent.mm.plugin.sns.ad.drawable.WaterMarkDrawable");
        b44.b bVar = this.f17818d;
        android.text.TextPaint textPaint = bVar.f17823e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTextPaint$p", "com.tencent.mm.plugin.sns.ad.drawable.WaterMarkDrawable");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getText$p", "com.tencent.mm.plugin.sns.ad.drawable.WaterMarkDrawable");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getText$p", "com.tencent.mm.plugin.sns.ad.drawable.WaterMarkDrawable");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getText$p", "com.tencent.mm.plugin.sns.ad.drawable.WaterMarkDrawable");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getText$p", "com.tencent.mm.plugin.sns.ad.drawable.WaterMarkDrawable");
        java.lang.String str = bVar.f17819a;
        textPaint.getTextBounds(str, 0, str.length(), rect);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.drawable.WaterMarkDrawable$textBound$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.drawable.WaterMarkDrawable$textBound$2");
        return rect;
    }
}
