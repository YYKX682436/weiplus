package cd4;

/* loaded from: classes4.dex */
public class a implements android.text.style.LineHeightSpan {

    /* renamed from: d, reason: collision with root package name */
    public final int f122191d;

    public a(int i17) {
        this.f122191d = i17;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(java.lang.CharSequence charSequence, int i17, int i18, int i19, int i27, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        yd4.d[] dVarArr;
        yd4.d[] dVarArr2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("chooseHeight", "com.tencent.mm.plugin.sns.ui.improve.view.fix.ExcludeInnerLineSpaceSpan");
        int i28 = fontMetricsInt.descent - fontMetricsInt.ascent;
        if (i28 <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("chooseHeight", "com.tencent.mm.plugin.sns.ui.improve.view.fix.ExcludeInnerLineSpaceSpan");
            return;
        }
        if (pc4.d.f434943a.D()) {
            if ((charSequence instanceof android.text.Spanned) && (dVarArr2 = (yd4.d[]) ((android.text.Spanned) charSequence).getSpans(i17, i18, yd4.d.class)) != null && dVarArr2.length > 0) {
                yd4.d dVar = dVarArr2[0];
                dVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCommentSpecialType", "com.tencent.mm.plugin.sns.ui.view.VerticalAlignAlphaImageSpan");
                boolean z17 = dVar.f542617f;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCommentSpecialType", "com.tencent.mm.plugin.sns.ui.view.VerticalAlignAlphaImageSpan");
                if (z17 && i17 != 0) {
                    int b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 4);
                    fontMetricsInt.ascent += b17;
                    fontMetricsInt.descent += b17;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("chooseHeight", "com.tencent.mm.plugin.sns.ui.improve.view.fix.ExcludeInnerLineSpaceSpan");
                return;
            }
        } else if ((charSequence instanceof android.text.SpannedString) && (dVarArr = (yd4.d[]) ((android.text.SpannedString) charSequence).getSpans(i17, i18, yd4.d.class)) != null && dVarArr.length > 0) {
            yd4.d dVar2 = dVarArr[0];
            dVar2.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCommentSpecialType", "com.tencent.mm.plugin.sns.ui.view.VerticalAlignAlphaImageSpan");
            boolean z18 = dVar2.f542617f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCommentSpecialType", "com.tencent.mm.plugin.sns.ui.view.VerticalAlignAlphaImageSpan");
            if (z18 && i17 != 0) {
                int b18 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 4);
                fontMetricsInt.ascent += b18;
                fontMetricsInt.descent += b18;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("chooseHeight", "com.tencent.mm.plugin.sns.ui.improve.view.fix.ExcludeInnerLineSpaceSpan");
            return;
        }
        int i29 = this.f122191d;
        int round = java.lang.Math.round(fontMetricsInt.descent * ((i29 * 1.0f) / i28));
        fontMetricsInt.descent = round;
        fontMetricsInt.ascent = round - i29;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("chooseHeight", "com.tencent.mm.plugin.sns.ui.improve.view.fix.ExcludeInnerLineSpaceSpan");
    }
}
