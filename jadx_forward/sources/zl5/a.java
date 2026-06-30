package zl5;

/* loaded from: classes3.dex */
public final class a extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f555616a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f555617b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f555618c;

    public a(boolean z17, boolean z18, float f17) {
        this.f555616a = z17;
        this.f555617b = z18;
        this.f555618c = f17;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outline, "outline");
        boolean z17 = this.f555617b;
        boolean z18 = this.f555616a;
        if (z18 && z17) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f555618c);
            return;
        }
        if (!z18) {
            if (z17) {
                outline.setRoundRect(0, (int) (0 - this.f555618c), view.getWidth(), view.getHeight(), this.f555618c);
            }
        } else {
            int width = view.getWidth();
            float height = view.getHeight();
            float f17 = this.f555618c;
            outline.setRoundRect(0, 0, width, (int) (height + f17), f17);
        }
    }
}
