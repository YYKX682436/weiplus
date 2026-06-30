package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes3.dex */
public final class m4 extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f255619a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f255620b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f255621c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f255622d;

    public m4(int i17, int i18, float f17, int i19) {
        this.f255619a = i17;
        this.f255620b = i18;
        this.f255621c = f17;
        this.f255622d = i19;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outline, "outline");
        int width = view.getWidth();
        float f17 = this.f255621c;
        if (width != 0 && view.getHeight() != 0) {
            float width2 = this.f255619a / view.getWidth();
            float height = this.f255620b / view.getHeight();
            view.setScaleX(width2 + ((1.0f - width2) * f17));
            view.setScaleY(height + ((1.0f - height) * f17));
        }
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (((double) f17) >= 0.9d ? java.lang.Float.valueOf(0.0f) : java.lang.Integer.valueOf(this.f255622d)).floatValue());
    }
}
