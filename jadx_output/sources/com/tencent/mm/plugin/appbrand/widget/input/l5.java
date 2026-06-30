package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes14.dex */
public enum l5 {
    ;

    public static int a(android.widget.EditText editText, float f17, float f18) {
        android.text.Editable editableText;
        android.text.TextPaint paint;
        if (editText == null) {
            return -1;
        }
        int paddingTop = editText.getPaddingTop();
        android.text.Layout layout = editText.getLayout();
        if (layout == null || (editableText = editText.getEditableText()) == null || (paint = editText.getPaint()) == null) {
            return -1;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        for (int i17 = 0; i17 < layout.getLineCount(); i17++) {
            layout.getLineBounds(i17, rect);
            paddingTop += rect.height();
            if (paddingTop >= f18) {
                int lineStart = layout.getLineStart(i17);
                int lineEnd = layout.getLineEnd(i17);
                if (i17 != layout.getLineCount() - 1) {
                    lineEnd = java.lang.Math.max(lineEnd - 1, lineStart);
                }
                if (lineStart == lineEnd) {
                    return lineStart;
                }
                android.text.style.RelativeSizeSpan[] relativeSizeSpanArr = (android.text.style.RelativeSizeSpan[]) editableText.getSpans(lineStart, lineEnd, android.text.style.RelativeSizeSpan.class);
                float f19 = 1.0f;
                if (relativeSizeSpanArr != null) {
                    for (android.text.style.RelativeSizeSpan relativeSizeSpan : relativeSizeSpanArr) {
                        f19 = relativeSizeSpan.getSizeChange();
                    }
                }
                java.lang.String charSequence = editableText.subSequence(lineStart, lineEnd).toString();
                float[] fArr = new float[charSequence.length()];
                paint.getTextWidths(charSequence, fArr);
                float f27 = 0.0f;
                for (int i18 = 0; i18 < charSequence.length(); i18++) {
                    f27 += fArr[i18] * f19;
                    if (i18 == charSequence.length() - 1 && f17 >= f27) {
                        return lineStart + charSequence.length();
                    }
                    if (f27 >= f17 || i18 == charSequence.length() - 1) {
                        return lineStart + i18;
                    }
                }
            }
        }
        return -1;
    }

    public static com.tencent.mm.plugin.appbrand.widget.input.l5 valueOf(java.lang.String str) {
        android.support.v4.media.f.a(java.lang.Enum.valueOf(com.tencent.mm.plugin.appbrand.widget.input.l5.class, str));
        return null;
    }
}
