package nm4;

/* loaded from: classes3.dex */
public final class q extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final float f420040a;

    public q(float f17) {
        this.f420040a = f17;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outline, "outline");
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f420040a);
    }
}
