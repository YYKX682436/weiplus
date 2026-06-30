package xk3;

/* loaded from: classes3.dex */
public final class n extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f536584a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f536585b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f536586c;

    public n(boolean z17, boolean z18, float f17) {
        this.f536584a = z17;
        this.f536585b = z18;
        this.f536586c = f17;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outline, "outline");
        boolean z17 = this.f536585b;
        boolean z18 = this.f536584a;
        if (z18 && z17) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f536586c);
            return;
        }
        if (!z18) {
            if (z17) {
                outline.setRoundRect(0, (int) (0 - this.f536586c), view.getWidth(), view.getHeight(), this.f536586c);
            }
        } else {
            int width = view.getWidth();
            float height = view.getHeight();
            float f17 = this.f536586c;
            outline.setRoundRect(0, 0, width, (int) (height + f17), f17);
        }
    }
}
