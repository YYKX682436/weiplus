package m22;

/* loaded from: classes13.dex */
public final class t extends android.view.View.DragShadowBuilder {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(android.view.View view) {
        super(view);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
    }

    @Override // android.view.View.DragShadowBuilder
    public void onDrawShadow(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        canvas.save();
        canvas.scale(1.3f, 1.3f);
        getView().draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View.DragShadowBuilder
    public void onProvideShadowMetrics(android.graphics.Point size, android.graphics.Point touch) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(size, "size");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(touch, "touch");
        int width = (int) (getView().getWidth() * 1.5f);
        int height = (int) (getView().getHeight() * 1.5f);
        size.set(width, height);
        touch.set(width / 2, height / 2);
    }
}
