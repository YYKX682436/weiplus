package cd4;

/* loaded from: classes4.dex */
public class a implements android.text.style.LineHeightSpan {

    /* renamed from: d, reason: collision with root package name */
    public final int f40658d;

    public a(int i17) {
        this.f40658d = i17;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(java.lang.CharSequence charSequence, int i17, int i18, int i19, int i27, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        yd4.d[] dVarArr;
        yd4.d[] dVarArr2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("chooseHeight", "com.tencent.mm.plugin.sns.ui.improve.view.fix.ExcludeInnerLineSpaceSpan");
        int i28 = fontMetricsInt.descent - fontMetricsInt.ascent;
        if (i28 <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("chooseHeight", "com.tencent.mm.plugin.sns.ui.improve.view.fix.ExcludeInnerLineSpaceSpan");
            return;
        }
        if (pc4.d.f353410a.D()) {
            if ((charSequence instanceof android.text.Spanned) && (dVarArr2 = (yd4.d[]) ((android.text.Spanned) charSequence).getSpans(i17, i18, yd4.d.class)) != null && dVarArr2.length > 0) {
                yd4.d dVar = dVarArr2[0];
                dVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommentSpecialType", "com.tencent.mm.plugin.sns.ui.view.VerticalAlignAlphaImageSpan");
                boolean z17 = dVar.f461084f;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentSpecialType", "com.tencent.mm.plugin.sns.ui.view.VerticalAlignAlphaImageSpan");
                if (z17 && i17 != 0) {
                    int b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 4);
                    fontMetricsInt.ascent += b17;
                    fontMetricsInt.descent += b17;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("chooseHeight", "com.tencent.mm.plugin.sns.ui.improve.view.fix.ExcludeInnerLineSpaceSpan");
                return;
            }
        } else if ((charSequence instanceof android.text.SpannedString) && (dVarArr = (yd4.d[]) ((android.text.SpannedString) charSequence).getSpans(i17, i18, yd4.d.class)) != null && dVarArr.length > 0) {
            yd4.d dVar2 = dVarArr[0];
            dVar2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommentSpecialType", "com.tencent.mm.plugin.sns.ui.view.VerticalAlignAlphaImageSpan");
            boolean z18 = dVar2.f461084f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentSpecialType", "com.tencent.mm.plugin.sns.ui.view.VerticalAlignAlphaImageSpan");
            if (z18 && i17 != 0) {
                int b18 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 4);
                fontMetricsInt.ascent += b18;
                fontMetricsInt.descent += b18;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("chooseHeight", "com.tencent.mm.plugin.sns.ui.improve.view.fix.ExcludeInnerLineSpaceSpan");
            return;
        }
        int i29 = this.f40658d;
        int round = java.lang.Math.round(fontMetricsInt.descent * ((i29 * 1.0f) / i28));
        fontMetricsInt.descent = round;
        fontMetricsInt.ascent = round - i29;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("chooseHeight", "com.tencent.mm.plugin.sns.ui.improve.view.fix.ExcludeInnerLineSpaceSpan");
    }
}
