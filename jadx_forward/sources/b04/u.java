package b04;

/* loaded from: classes3.dex */
public final class u extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f98469a;

    public u(int i17) {
        this.f98469a = i17;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outline, "outline");
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f98469a);
    }
}
