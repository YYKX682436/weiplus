package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes3.dex */
public final class pw extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185830a;

    public pw(in5.s0 s0Var) {
        this.f185830a = s0Var;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outline, "outline");
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f185830a.f374654e.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561953xf));
    }
}
