package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class b implements db5.v8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.e f288147a;

    public b(com.p314xaae8f345.mm.ui.p2690x38b72420.e eVar) {
        this.f288147a = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.CharSequence] */
    @Override // db5.v8
    public java.lang.CharSequence a(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21526xca364659 c21526xca364659, java.lang.CharSequence charSequence, java.lang.String str, int i17, int i18) {
        java.lang.CharSequence ellipsize;
        java.lang.String str2;
        java.lang.String str3 = str;
        float textSize = c21526xca364659.m79227x74f59ea8().getTextSize();
        com.p314xaae8f345.mm.ui.p2690x38b72420.e eVar = this.f288147a;
        int b17 = i65.a.b(eVar.f290554h, i18);
        float f17 = b17;
        c21526xca364659.m79227x74f59ea8().setTextSize(f17);
        float measureText = c21526xca364659.m79227x74f59ea8().measureText(" " + str3);
        c21526xca364659.m79227x74f59ea8().setTextSize(textSize);
        int measuredWidth = (c21526xca364659.getMeasuredWidth() - c21526xca364659.m79214xb70a2a4c()) - c21526xca364659.m79213xdc9a71d7();
        double d17 = measuredWidth;
        if (measureText >= 0.6d * d17) {
            ellipsize = android.text.TextUtils.ellipsize(charSequence, c21526xca364659.m79227x74f59ea8(), (float) (d17 * 0.4d), android.text.TextUtils.TruncateAt.END);
            float measureText2 = c21526xca364659.m79227x74f59ea8().measureText(ellipsize.toString());
            c21526xca364659.m79227x74f59ea8().setTextSize(f17);
            ?? ellipsize2 = android.text.TextUtils.ellipsize(str3, c21526xca364659.m79227x74f59ea8(), (measuredWidth - measureText2) - 20.0f, android.text.TextUtils.TruncateAt.END);
            c21526xca364659.m79227x74f59ea8().setTextSize(textSize);
            str2 = ellipsize2;
        } else {
            ellipsize = android.text.TextUtils.ellipsize(charSequence, c21526xca364659.m79227x74f59ea8(), measuredWidth - measureText, android.text.TextUtils.TruncateAt.END);
            str2 = str3;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        ((ke0.e) xVar).getClass();
        android.text.SpannableString i19 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(eVar.f290554h, ((java.lang.Object) ellipsize) + " " + ((java.lang.Object) str2));
        android.content.res.ColorStateList e17 = i65.a.e(eVar.f290554h, i17);
        i19.setSpan(new android.text.style.TextAppearanceSpan(null, 0, b17, e17, e17), ellipsize.length() + 1, ellipsize.length() + 1 + str2.length(), 33);
        return i19;
    }
}
