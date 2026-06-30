package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

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

    /* renamed from: valueOf */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l5 m53493xdce0328(java.lang.String str) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(java.lang.Enum.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l5.class, str));
        return null;
    }
}
