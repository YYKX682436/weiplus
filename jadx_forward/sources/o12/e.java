package o12;

/* loaded from: classes10.dex */
public final class e extends o12.k {

    /* renamed from: b, reason: collision with root package name */
    public static final o12.e f423678b = new o12.e();

    public e() {
        super(null);
    }

    @Override // o12.k
    public boolean a(android.graphics.Rect rect, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rect, "rect");
        int i27 = rect.left;
        return i27 - i19 < i17 && i27 + i19 > i17 && rect.top < i18 && rect.bottom > i18;
    }

    @Override // o12.k
    public void b(android.view.View view, android.graphics.Rect rect, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rect, "rect");
        rect.left = e06.p.f(rect.left + i17, view.getPaddingLeft(), rect.right - i19);
    }

    @Override // o12.k
    public void c(android.view.View view, android.graphics.Rect rect, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rect, "rect");
        int width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        int width2 = rect.width() - (i17 * 2);
        boolean z17 = false;
        if (i19 <= width2 && width2 <= width) {
            z17 = true;
        }
        if (z17) {
            int i27 = rect.left + i17;
            rect.left = i27;
            rect.top += i17;
            rect.right = i27 - i17;
            rect.bottom -= i17;
        }
    }
}
