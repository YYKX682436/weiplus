package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes3.dex */
public final class v3 extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Rect f292369a;

    /* renamed from: b, reason: collision with root package name */
    public float f292370b;

    public v3(int i17, int i18, float f17) {
        this.f292369a = new android.graphics.Rect(0, 0, i17, i18);
        this.f292370b = f17;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outline, "outline");
        outline.setRoundRect(this.f292369a, this.f292370b);
    }
}
