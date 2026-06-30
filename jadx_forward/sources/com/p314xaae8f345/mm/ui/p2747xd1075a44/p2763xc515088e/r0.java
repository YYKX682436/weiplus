package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e;

/* loaded from: classes7.dex */
public final class r0 implements android.widget.NumberPicker.Formatter {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.StringBuilder f293859a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object[] f293860b;

    /* renamed from: c, reason: collision with root package name */
    public char f293861c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.Formatter f293862d;

    public r0() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        this.f293859a = sb6;
        this.f293860b = new java.lang.Object[1];
        this.f293862d = new java.util.Formatter(sb6, java.util.Locale.getDefault());
        this.f293861c = '0';
    }

    @Override // android.widget.NumberPicker.Formatter
    public java.lang.String format(int i17) {
        java.util.Locale locale = java.util.Locale.getDefault();
        char c17 = this.f293861c;
        java.lang.StringBuilder sb6 = this.f293859a;
        if (c17 != '0') {
            this.f293862d = new java.util.Formatter(sb6, locale);
            this.f293861c = '0';
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Object[] objArr = this.f293860b;
        objArr[0] = valueOf;
        sb6.delete(0, sb6.length());
        this.f293862d.format("%02d", objArr);
        return this.f293862d.toString();
    }
}
