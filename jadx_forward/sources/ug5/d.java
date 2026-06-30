package ug5;

/* loaded from: classes3.dex */
public final class d extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Path f509118d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        setWillNotDraw(false);
    }

    public final void a(android.graphics.RectF rect, float f17, float f18, float f19, float f27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rect, "rect");
        android.graphics.Path path = new android.graphics.Path();
        path.addRoundRect(rect, new float[]{f17, f18, f19, f18, f19, f27, f17, f27}, android.graphics.Path.Direction.CW);
        this.f509118d = path;
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        android.graphics.Path path = this.f509118d;
        if (path == null) {
            super.draw(canvas);
            return;
        }
        canvas.save();
        try {
            canvas.clipPath(path);
            super.draw(canvas);
        } finally {
            canvas.restore();
        }
    }
}
