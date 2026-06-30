package com.p314xaae8f345.mm.ui.p2738xb1dfbddb;

/* loaded from: classes3.dex */
public final class f extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f291465a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f291466b;

    public f(int i17, float f17) {
        this.f291465a = i17;
        this.f291466b = f17;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outline, "outline");
        int height = view.getHeight();
        outline.setRoundRect(0, 0, view.getWidth(), (int) (this.f291465a + ((height - r1) * this.f291466b)), 0.0f);
    }
}
