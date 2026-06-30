package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J>\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0016J\u0012\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/tencent/kinda/framework/widget/base/MMKEditTextLengthFilter;", "Landroid/text/InputFilter;", "maxEnglishChar", "", "(I)V", "filter", "", ya.b.f77502x92235c1b, "start", "end", "dest", "Landroid/text/Spanned;", "destStart", "destEnd", "getTextCount", "str", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.kinda.framework.widget.base.MMKEditTextLengthFilter */
/* loaded from: classes5.dex */
public final class C3332x87bfa540 implements android.text.InputFilter {
    private final int maxEnglishChar;

    public C3332x87bfa540(int i17) {
        this.maxEnglishChar = i17;
    }

    /* renamed from: getTextCount */
    private final int m26892xc008c12c(java.lang.CharSequence str) {
        if (str != null) {
            return com.p314xaae8f345.mm.ui.p2740x696c9db.v4.e(str.toString(), com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_1);
        }
        return 0;
    }

    @Override // android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence source, int start, int end, android.text.Spanned dest, int destStart, int destEnd) {
        int m26892xc008c12c = (this.maxEnglishChar - m26892xc008c12c(dest)) + m26892xc008c12c(java.lang.String.valueOf(dest != null ? dest.subSequence(destStart, destEnd) : null));
        if (m26892xc008c12c < 0) {
            return "";
        }
        if (m26892xc008c12c(source) <= m26892xc008c12c) {
            return source;
        }
        if (source != null) {
            return source.subSequence(start, m26892xc008c12c + start);
        }
        return null;
    }
}
