package bk4;

/* loaded from: classes8.dex */
public final class e2 extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f102995a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f102996b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f102997c;

    public e2(boolean z17, boolean z18, float f17) {
        this.f102995a = z17;
        this.f102996b = z18;
        this.f102997c = f17;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outline, "outline");
        boolean z17 = this.f102996b;
        boolean z18 = this.f102995a;
        if (z18 && z17) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f102997c);
            return;
        }
        if (!z18) {
            if (z17) {
                outline.setRoundRect(0, (int) (0 - this.f102997c), view.getWidth(), view.getHeight(), this.f102997c);
            }
        } else {
            int width = view.getWidth();
            float height = view.getHeight();
            float f17 = this.f102997c;
            outline.setRoundRect(0, 0, width, (int) (height + f17), f17);
        }
    }
}
