package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes3.dex */
public final class p4 extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f255696a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f255697b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f255698c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18624x35d9f9b5 f255699d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f255700e;

    public p4(int i17, int i18, float f17, com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18624x35d9f9b5 activityC18624x35d9f9b5, int i19) {
        this.f255696a = i17;
        this.f255697b = i18;
        this.f255698c = f17;
        this.f255699d = activityC18624x35d9f9b5;
        this.f255700e = i19;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outline, "outline");
        if (view.getWidth() != 0 && view.getHeight() != 0) {
            float f17 = this.f255698c;
            view.setScaleX((((this.f255696a / view.getWidth()) - 1.0f) * f17) + 1.0f);
            view.setScaleY((((this.f255697b / view.getHeight()) - 1.0f) * f17) + 1.0f);
            if (f17 >= 0.6f) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.h4 h4Var = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18624x35d9f9b5.f255011o;
                this.f255699d.W6().setAlpha(((f17 - 0.6f) / 0.4f) * 1.0f);
            }
        }
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f255700e);
    }
}
