package com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958;

/* loaded from: classes.dex */
public final class a extends in5.s0 {

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f224869n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.ImageView f224870o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.TextView f224871p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.TextView f224872q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.CheckBox f224873r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f224874s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.TextView f224875t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.view.View convertView) {
        super(convertView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(convertView, "convertView");
        android.content.Context context = convertView.getContext();
        android.view.View findViewById = convertView.findViewById(com.p314xaae8f345.mm.R.id.a_4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
        this.f224870o = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = convertView.findViewById(com.p314xaae8f345.mm.R.id.odf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        this.f224871p = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = convertView.findViewById(com.p314xaae8f345.mm.R.id.cut);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        this.f224872q = (android.widget.TextView) findViewById3;
        this.f224869n = convertView.findViewById(com.p314xaae8f345.mm.R.id.che);
        android.view.View findViewById4 = convertView.findViewById(com.p314xaae8f345.mm.R.id.mie);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById4, "null cannot be cast to non-null type android.widget.CheckBox");
        this.f224873r = (android.widget.CheckBox) findViewById4;
        android.widget.ImageView imageView = (android.widget.ImageView) convertView.findViewById(com.p314xaae8f345.mm.R.id.c8h);
        android.view.View findViewById5 = convertView.findViewById(com.p314xaae8f345.mm.R.id.kjo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById5, "null cannot be cast to non-null type android.widget.TextView");
        this.f224875t = (android.widget.TextView) findViewById5;
        this.f224874s = convertView.findViewById(com.p314xaae8f345.mm.R.id.c8i);
        if (imageView != null) {
            imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f81106x4448d04, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77768x20e836)));
        }
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        convertView.setTag(this);
    }
}
