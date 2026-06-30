package com.tencent.mm.plugin.appbrand.jsapi.autofill;

/* loaded from: classes9.dex */
public class URLSpanNoUnderline extends android.text.style.URLSpan {
    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
