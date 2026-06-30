package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout */
/* loaded from: classes9.dex */
public class C19128xb2665675 extends android.widget.LinearLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final int f261721h = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 288);

    /* renamed from: i, reason: collision with root package name */
    public static final int f261722i = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 20);

    /* renamed from: m, reason: collision with root package name */
    public static final int f261723m = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 11);

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f261724d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 f261725e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f261726f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 f261727g;

    public C19128xb2665675(android.content.Context context) {
        super(context);
        b();
    }

    public void a() {
        if (this.f261726f.getVisibility() != 8) {
            post(new et4.j(this));
        }
    }

    public final void b() {
        android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f571170d90, this);
        this.f261724d = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ppg);
        this.f261725e = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) findViewById(com.p314xaae8f345.mm.R.id.pph);
        this.f261726f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ppj);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e0913 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) findViewById(com.p314xaae8f345.mm.R.id.ppi);
        this.f261727g = c19659x677e0913;
        android.graphics.drawable.Drawable drawable = c19659x677e0913.getDrawable();
        if (drawable != null) {
            drawable.setColorFilter(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77687x3cb06c5), android.graphics.PorterDuff.Mode.SRC_ATOP);
        }
    }

    public C19128xb2665675(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public C19128xb2665675(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        b();
    }
}
