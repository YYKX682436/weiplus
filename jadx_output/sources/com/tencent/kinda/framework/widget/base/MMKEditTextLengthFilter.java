package com.tencent.kinda.framework.widget.base;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J>\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0016J\u0012\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/tencent/kinda/framework/widget/base/MMKEditTextLengthFilter;", "Landroid/text/InputFilter;", "maxEnglishChar", "", "(I)V", "filter", "", ya.b.SOURCE, "start", "end", "dest", "Landroid/text/Spanned;", "destStart", "destEnd", "getTextCount", "str", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MMKEditTextLengthFilter implements android.text.InputFilter {
    private final int maxEnglishChar;

    public MMKEditTextLengthFilter(int i17) {
        this.maxEnglishChar = i17;
    }

    private final int getTextCount(java.lang.CharSequence str) {
        if (str != null) {
            return com.tencent.mm.ui.tools.v4.e(str.toString(), com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_1);
        }
        return 0;
    }

    @Override // android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence source, int start, int end, android.text.Spanned dest, int destStart, int destEnd) {
        int textCount = (this.maxEnglishChar - getTextCount(dest)) + getTextCount(java.lang.String.valueOf(dest != null ? dest.subSequence(destStart, destEnd) : null));
        if (textCount < 0) {
            return "";
        }
        if (getTextCount(source) <= textCount) {
            return source;
        }
        if (source != null) {
            return source.subSequence(start, textCount + start);
        }
        return null;
    }
}
