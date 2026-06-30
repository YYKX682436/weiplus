package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd;

/* loaded from: classes2.dex */
public final class e extends h92.d {

    /* renamed from: g, reason: collision with root package name */
    public final boolean f183237g;

    public e(boolean z17) {
        this.f183237g = z17;
    }

    @Override // h92.d, h92.a
    public void g(android.content.Context context, android.widget.FrameLayout headerLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headerLayout, "headerLayout");
        ((ra0.v) i95.n0.c(ra0.v.class)).getClass();
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.adk, headerLayout);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        this.f361223e = inflate;
    }

    @Override // h92.d, h92.a
    public void h(android.content.Context context, com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 rlLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rlLayout, "rlLayout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rlLayout.m82555x4905e9fa(), "<set-?>");
        java.lang.Object parent = rlLayout.getParent();
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view != null) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.bottomMargin = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561203c7);
                view.setLayoutParams(layoutParams2);
                view.requestLayout();
            }
        }
    }

    @Override // h92.d, h92.a
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.api.p1420xac8f1cfd.C13638xb683e9ec k(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd.f(context, null, this.f183237g, 2, null);
    }

    @Override // h92.d, h92.a
    public void l(android.content.Context context, android.widget.FrameLayout footerLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(footerLayout, "footerLayout");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.adi, footerLayout);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f361224f = inflate;
        inflate.findViewById(com.p314xaae8f345.mm.R.id.b0n).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd.d(this));
    }
}
