package lm4;

/* loaded from: classes3.dex */
public final class c extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f401074a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f401075b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f401076c;

    public c(boolean z17, boolean z18, float f17) {
        this.f401074a = z17;
        this.f401075b = z18;
        this.f401076c = f17;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outline, "outline");
        boolean z17 = this.f401075b;
        boolean z18 = this.f401074a;
        if (z18 && z17) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f401076c);
            return;
        }
        if (!z18) {
            if (z17) {
                outline.setRoundRect(0, (int) (0 - this.f401076c), view.getWidth(), view.getHeight(), this.f401076c);
            }
        } else {
            int width = view.getWidth();
            float height = view.getHeight();
            float f17 = this.f401076c;
            outline.setRoundRect(0, 0, width, (int) (height + f17), f17);
        }
    }
}
