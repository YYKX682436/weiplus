package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557;

/* loaded from: classes8.dex */
public final class f0 extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375 {

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f159198g;

    /* renamed from: h, reason: collision with root package name */
    public android.text.SpannableStringBuilder f159199h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(android.content.Context context) {
        super(context, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        setTextSize(0, i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561462j9));
        setVerticalScrollBarEnabled(true);
        setMovementMethod(new android.text.method.ScrollingMovementMethod());
        this.f159198g = new java.util.LinkedList();
        this.f159199h = new android.text.SpannableStringBuilder();
    }

    public final void b(java.lang.String str, int i17) {
        java.util.LinkedList linkedList = this.f159198g;
        if (1000 <= linkedList.size()) {
            this.f159199h.delete(0, ((java.lang.String) linkedList.removeFirst()).length());
        }
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(i17), 0, str.length(), 33);
        this.f159199h.append((java.lang.CharSequence) spannableString);
        setText(this.f159199h);
        post(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.e0(this));
        linkedList.addLast(str);
    }
}
