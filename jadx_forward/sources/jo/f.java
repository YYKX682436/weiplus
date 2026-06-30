package jo;

/* loaded from: classes13.dex */
public final class f extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p653x55bb7a46.p658xd1075a44.C10395x48f00a39 f382402a;

    public f(com.p314xaae8f345.mm.p653x55bb7a46.p658xd1075a44.C10395x48f00a39 c10395x48f00a39) {
        this.f382402a = c10395x48f00a39;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outline, "outline");
        int width = view.getWidth();
        int height = view.getHeight();
        if (width <= 0 || height <= 0) {
            outline.setEmpty();
            return;
        }
        float min = java.lang.Math.min(width * 0.5f, height * 0.5f);
        com.p314xaae8f345.mm.p653x55bb7a46.p658xd1075a44.C10395x48f00a39 c10395x48f00a39 = this.f382402a;
        float clipRadius = c10395x48f00a39.getClipRadius() + c10395x48f00a39.getOuterStrokeWidth();
        outline.setRoundRect(0, 0, width, height, clipRadius > min ? min : clipRadius);
    }
}
