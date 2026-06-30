package jb5;

/* loaded from: classes13.dex */
public final class b extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2647x2e3067.p2648x3306ec.AbstractC21594xdda0f29a f380395a;

    public b(com.p314xaae8f345.mm.ui.p2647x2e3067.p2648x3306ec.AbstractC21594xdda0f29a abstractC21594xdda0f29a) {
        this.f380395a = abstractC21594xdda0f29a;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outline, "outline");
        android.graphics.drawable.Drawable background = this.f380395a.getBackground();
        if (background != null) {
            background.getOutline(outline);
        }
        outline.setAlpha(1.0f);
    }
}
