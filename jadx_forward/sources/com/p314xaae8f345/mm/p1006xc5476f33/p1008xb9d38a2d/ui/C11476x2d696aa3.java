package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* renamed from: com.tencent.mm.plugin.account.ui.WelcomeSelectView */
/* loaded from: classes14.dex */
public class C11476x2d696aa3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractC11477x63317107 {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f155229d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f155230e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f155231f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f155232g;

    /* renamed from: h, reason: collision with root package name */
    public android.content.Context f155233h;

    public C11476x2d696aa3(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context);
    }

    public final void b(android.content.Context context) {
        this.f155233h = context;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d_b, this);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.mjf);
        this.f155229d = findViewById;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(findViewById, "<this>");
        com.p314xaae8f345.mm.ui.a4.e(findViewById, true, false, 2, null);
        this.f155230e = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.mje);
        this.f155231f = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.mjy);
        this.f155232g = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f569261pl5);
        android.view.View view = this.f155229d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/WelcomeSelectView", "initView", "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/account/ui/WelcomeSelectView", "initView", "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f155232g.setVisibility(8);
        this.f155232g.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.g(context, com.p314xaae8f345.mm.R.C30856x58c7259.f559540v, com.p314xaae8f345.mm.R.C30867xcad56011.f571997vs));
        this.f155232g.setAccessibilityDelegate(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.tj(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public C11476x2d696aa3(android.content.Context context) {
        super(context);
        b(context);
    }
}
