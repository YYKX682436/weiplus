package bn1;

/* loaded from: classes3.dex */
public final class m extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f104345a;

    public m(float f17) {
        this.f104345a = f17;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outline, "outline");
        int width = view.getWidth();
        float height = view.getHeight();
        float f17 = this.f104345a;
        outline.setRoundRect(0, 0, width, (int) (height + f17), f17);
    }
}
