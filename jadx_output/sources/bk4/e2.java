package bk4;

/* loaded from: classes8.dex */
public final class e2 extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f21462a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f21463b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f21464c;

    public e2(boolean z17, boolean z18, float f17) {
        this.f21462a = z17;
        this.f21463b = z18;
        this.f21464c = f17;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(outline, "outline");
        boolean z17 = this.f21463b;
        boolean z18 = this.f21462a;
        if (z18 && z17) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f21464c);
            return;
        }
        if (!z18) {
            if (z17) {
                outline.setRoundRect(0, (int) (0 - this.f21464c), view.getWidth(), view.getHeight(), this.f21464c);
            }
        } else {
            int width = view.getWidth();
            float height = view.getHeight();
            float f17 = this.f21464c;
            outline.setRoundRect(0, 0, width, (int) (height + f17), f17);
        }
    }
}
