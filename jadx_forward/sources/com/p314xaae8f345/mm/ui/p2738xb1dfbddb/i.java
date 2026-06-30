package com.p314xaae8f345.mm.ui.p2738xb1dfbddb;

/* loaded from: classes3.dex */
public final class i extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f291471a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f291472b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f291473c;

    public i(int i17, int i18, float f17) {
        this.f291471a = i17;
        this.f291472b = i18;
        this.f291473c = f17;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outline, "outline");
        outline.setRoundRect(0, 0, view.getWidth(), (int) (this.f291471a + ((this.f291472b - r0) * this.f291473c)), 0.0f);
    }
}
