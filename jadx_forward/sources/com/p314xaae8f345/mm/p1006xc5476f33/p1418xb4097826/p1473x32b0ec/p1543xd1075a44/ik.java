package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class ik {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f200211a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.ViewGroup f200212b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f200213c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c f200214d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f200215e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f200216f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f200217g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f200218h;

    public ik(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, android.view.ViewGroup licenseContainer, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(licenseContainer, "licenseContainer");
        this.f200211a = activity;
        this.f200212b = licenseContainer;
        this.f200213c = aVar;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c) licenseContainer.findViewById(com.p314xaae8f345.mm.R.id.fgg);
        this.f200214d = c22613xe7040d9c;
        android.widget.TextView tipTv = (android.widget.TextView) licenseContainer.findViewById(com.p314xaae8f345.mm.R.id.fgi);
        this.f200215e = tipTv;
        android.widget.TextView textView = (android.widget.TextView) licenseContainer.findViewById(com.p314xaae8f345.mm.R.id.fgf);
        android.widget.TextView textView2 = (android.widget.TextView) licenseContainer.findViewById(com.p314xaae8f345.mm.R.id.fgk);
        android.view.View findViewById = licenseContainer.findViewById(com.p314xaae8f345.mm.R.id.fgd);
        this.f200216f = findViewById;
        android.view.View findViewById2 = licenseContainer.findViewById(com.p314xaae8f345.mm.R.id.fge);
        this.f200217g = findViewById2;
        c22613xe7040d9c.setTranslationY(com.p314xaae8f345.mm.ui.bl.b(activity).y);
        c22613xe7040d9c.m81307xf9cef5a7(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ek(this));
        android.view.ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += com.p314xaae8f345.mm.ui.bl.c(licenseContainer.getContext());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tipTv, "tipTv");
        b(tipTv);
        textView2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.fk(this));
        textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gk(this));
        com.p314xaae8f345.mm.ui.fk.a(textView2);
        com.p314xaae8f345.mm.ui.fk.a(textView);
        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hk(this));
    }

    public final void a() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c contentGroup = this.f200214d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(contentGroup, "contentGroup");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c.b(contentGroup, null, 1, null);
    }

    public final void b(android.widget.TextView textView) {
        android.text.SpannableString h17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b3.f183555a.h(this.f200211a, com.p314xaae8f345.mm.R.C30867xcad56011.dgj, this.f200218h);
        textView.setHighlightColor(textView.getContext().getResources().getColor(android.R.color.transparent));
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        textView.setText(h17);
    }
}
