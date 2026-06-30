package ep1;

/* loaded from: classes3.dex */
public final class r extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f337189a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f337190b;

    public r(float f17, float f18) {
        this.f337189a = f17;
        this.f337190b = f18;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outline, "outline");
        float f17 = this.f337189a;
        outline.setRoundRect(0, (int) f17, view.getWidth(), view.getHeight() - ((int) f17), this.f337190b);
    }
}
