package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2749xdcc86614;

/* renamed from: com.tencent.mm.ui.widget.bottomsheet.ViewTitleWithAnimation */
/* loaded from: classes8.dex */
public class C22660xcf62c98b extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f293068d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f293069e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f293070f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f293071g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f293072h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f293073i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewGroup f293074m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f293075n;

    public C22660xcf62c98b(android.content.Context context) {
        super(context);
        a(context);
    }

    public final void a(android.content.Context context) {
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569764nr, this);
        this.f293068d = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.oqh);
        this.f293075n = findViewById(com.p314xaae8f345.mm.R.id.ofq);
        this.f293069e = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.hlr);
        this.f293070f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f569002oq0);
        this.f293071g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.omm);
        this.f293072h = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.hmo);
        this.f293073i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.omn);
        this.f293074m = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.hw8);
    }

    /* renamed from: getIconImageView */
    public android.widget.ImageView m81535x54a3ca71() {
        return this.f293069e;
    }

    /* renamed from: setCompanyText */
    public void m81536x51ee2988(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            this.f293071g.setVisibility(8);
        } else {
            this.f293071g.setVisibility(0);
            this.f293071g.setText(str);
        }
    }

    /* renamed from: setSubTitle */
    public void m81537xf9fefa7a(java.lang.String str) {
        this.f293070f.setText(str);
    }

    /* renamed from: setTitle */
    public void m81538x53bfe316(java.lang.String str) {
        this.f293068d.setText(str);
    }

    /* renamed from: setTopPaddingVisibility */
    public void m81539x4078f8b0(int i17) {
        android.view.View view = this.f293075n;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/widget/bottomsheet/ViewTitleWithAnimation", "setTopPaddingVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/widget/bottomsheet/ViewTitleWithAnimation", "setTopPaddingVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public C22660xcf62c98b(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public C22660xcf62c98b(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a(context);
    }
}
