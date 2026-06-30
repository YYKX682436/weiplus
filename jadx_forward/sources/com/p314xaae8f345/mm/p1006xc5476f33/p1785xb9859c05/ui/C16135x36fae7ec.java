package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallDynamicTextView */
/* loaded from: classes13.dex */
public class C16135x36fae7ec extends android.widget.TextView {

    /* renamed from: d, reason: collision with root package name */
    public double f224143d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f224144e;

    /* renamed from: f, reason: collision with root package name */
    public double f224145f;

    /* renamed from: g, reason: collision with root package name */
    public double f224146g;

    /* renamed from: h, reason: collision with root package name */
    public final int f224147h;

    /* renamed from: i, reason: collision with root package name */
    public final int f224148i;

    /* renamed from: m, reason: collision with root package name */
    public final java.text.DecimalFormat f224149m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f224150n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f224151o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f224152p;

    public C16135x36fae7ec(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f224147h = 4000;
        this.f224148i = 50;
        this.f224149m = new java.text.DecimalFormat("0.00");
        this.f224150n = "";
        this.f224151o = "";
        this.f224152p = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.t1(this);
        getViewTreeObserver().addOnGlobalLayoutListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.u1(this));
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.C16135x36fae7ec c16135x36fae7ec, double d17) {
        if (d17 == c16135x36fae7ec.f224146g) {
            c16135x36fae7ec.setText(c16135x36fae7ec.f224144e);
            return;
        }
        c16135x36fae7ec.setText(c16135x36fae7ec.f224150n + c16135x36fae7ec.f224149m.format(d17) + c16135x36fae7ec.f224151o);
    }

    public void b(java.lang.String str, java.lang.String str2) {
        if (str == null || str.length() <= 0 || str2 == null || str2.length() <= 0) {
            setText(str2);
            return;
        }
        java.lang.String str3 = "";
        for (int i17 = 0; i17 < str.length() && !java.lang.Character.isDigit(str.charAt(i17)); i17++) {
            try {
                str3 = str3 + str.charAt(i17);
            } catch (java.lang.NumberFormatException unused) {
                setText(str2);
                return;
            }
        }
        java.lang.String str4 = "";
        for (int length = str.length() - 1; length > 0 && !java.lang.Character.isDigit(str.charAt(length)); length--) {
            str4 = str4 + str.charAt(length);
        }
        this.f224145f = java.lang.Double.parseDouble(str.substring(str3.length(), str.length() - str4.length()));
        this.f224150n = "";
        for (int i18 = 0; i18 < str2.length() && !java.lang.Character.isDigit(str2.charAt(i18)); i18++) {
            this.f224150n += str2.charAt(i18);
        }
        this.f224151o = "";
        for (int length2 = str2.length() - 1; length2 > 0 && !java.lang.Character.isDigit(str2.charAt(length2)); length2--) {
            this.f224151o += str2.charAt(length2);
        }
        try {
            double parseDouble = java.lang.Double.parseDouble(str2.substring(this.f224150n.length(), str2.length() - this.f224151o.length()));
            this.f224146g = parseDouble;
            this.f224144e = str2;
            double d17 = (parseDouble - this.f224145f) / (this.f224147h / this.f224148i);
            this.f224143d = d17;
            if (d17 == 0.0d) {
                setText(str2);
                return;
            }
            this.f224143d = new java.math.BigDecimal(this.f224143d).setScale(2, 4).doubleValue();
            if (isShown()) {
                this.f224152p.mo50305x3d8a09a2(1);
            }
        } catch (java.lang.NumberFormatException unused2) {
            setText(str2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        getMeasuredHeight();
    }

    /* renamed from: setLocHeight */
    public void m65178xe8e8e245(int i17) {
    }

    public C16135x36fae7ec(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f224147h = 4000;
        this.f224148i = 50;
        this.f224149m = new java.text.DecimalFormat("0.00");
        this.f224150n = "";
        this.f224151o = "";
        this.f224152p = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.t1(this);
        getViewTreeObserver().addOnGlobalLayoutListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.u1(this));
    }
}
