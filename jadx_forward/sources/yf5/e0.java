package yf5;

/* loaded from: classes11.dex */
public final class e0 implements db5.v8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yf5.g0 f543398a;

    public e0(yf5.g0 g0Var) {
        this.f543398a = g0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // db5.v8
    public final java.lang.CharSequence a(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21526xca364659 c21526xca364659, java.lang.CharSequence charSequence, java.lang.String str, int i17, int i18) {
        java.lang.CharSequence ellipsize;
        java.lang.String str2;
        java.lang.String str3 = str;
        float textSize = c21526xca364659.m79227x74f59ea8().getTextSize();
        yf5.g0 g0Var = this.f543398a;
        int b17 = i65.a.b(g0Var.f543409a, i18);
        float f17 = b17;
        c21526xca364659.m79227x74f59ea8().setTextSize(f17);
        float measureText = c21526xca364659.m79227x74f59ea8().measureText(" " + str3);
        c21526xca364659.m79227x74f59ea8().setTextSize(textSize);
        int measuredWidth = (c21526xca364659.getMeasuredWidth() - c21526xca364659.m79214xb70a2a4c()) - c21526xca364659.m79213xdc9a71d7();
        double d17 = measuredWidth;
        if (measureText >= 0.6d * d17) {
            ellipsize = android.text.TextUtils.ellipsize(charSequence, c21526xca364659.m79227x74f59ea8(), (float) (d17 * 0.4d), android.text.TextUtils.TruncateAt.END);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ellipsize, "ellipsize(...)");
            float measureText2 = c21526xca364659.m79227x74f59ea8().measureText(ellipsize.toString());
            c21526xca364659.m79227x74f59ea8().setTextSize(f17);
            ?? ellipsize2 = android.text.TextUtils.ellipsize(str3, c21526xca364659.m79227x74f59ea8(), (measuredWidth - measureText2) - 20, android.text.TextUtils.TruncateAt.END);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ellipsize2, "ellipsize(...)");
            c21526xca364659.m79227x74f59ea8().setTextSize(textSize);
            str2 = ellipsize2;
        } else {
            ellipsize = android.text.TextUtils.ellipsize(charSequence, c21526xca364659.m79227x74f59ea8(), measuredWidth - measureText, android.text.TextUtils.TruncateAt.END);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ellipsize, "ellipsize(...)");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            str2 = str3;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = g0Var.f543409a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append((java.lang.Object) ellipsize);
        sb6.append(' ');
        sb6.append((java.lang.Object) str2);
        java.lang.String sb7 = sb6.toString();
        ((ke0.e) xVar).getClass();
        android.text.SpannableString i19 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, sb7);
        android.content.res.ColorStateList e17 = i65.a.e(g0Var.f543409a, i17);
        i19.setSpan(new android.text.style.TextAppearanceSpan(null, 0, b17, e17, e17), ellipsize.length() + 1, ellipsize.length() + 1 + str2.length(), 33);
        return i19;
    }
}
