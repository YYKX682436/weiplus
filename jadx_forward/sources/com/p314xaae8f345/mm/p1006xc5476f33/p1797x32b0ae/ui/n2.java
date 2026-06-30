package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui;

/* loaded from: classes13.dex */
public final class n2 extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f225982a;

    public n2(boolean z17) {
        this.f225982a = z17;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outline, "outline");
        if (this.f225982a) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
        } else {
            float b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 8);
            outline.setRoundRect(0, 0, view.getWidth(), (int) (view.getHeight() + b17), b17);
        }
    }
}
