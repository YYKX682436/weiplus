package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class z3 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f202048d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f202049e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b4 f202050f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f202051g;

    public z3(android.view.View view, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b4 b4Var, java.lang.String str) {
        this.f202048d = view;
        this.f202049e = h0Var;
        this.f202050f = b4Var;
        this.f202051g = str;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.view.View view = this.f202048d;
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        java.lang.Object element = this.f202049e.f391656d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(element, "element");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14315xbe4ed405 c14315xbe4ed405 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14315xbe4ed405) element;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = this.f202050f.f199353a.getContext();
        ((ke0.e) xVar).getClass();
        java.lang.String spannableString = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.n(context, this.f202051g, 0.0f).toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(spannableString, "toString(...)");
        int width = view.getWidth();
        java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14315xbe4ed405.f197426x1;
        c14315xbe4ed405.o(spannableString, 5, width, true, null, false, false);
    }
}
