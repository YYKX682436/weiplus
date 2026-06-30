package bn5;

/* loaded from: classes10.dex */
public final class m extends bn5.f {
    public final java.lang.String G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.content.Context context, l45.q presenter) {
        super(context, presenter);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(presenter, "presenter");
        this.G = "MicroMsg.StickerBoardView";
        android.graphics.Rect rect = ((l45.n) presenter).f316461b.f364236f;
        this.f22941e.reset();
        this.f22944h.set(0, 0, rect.right - rect.left, rect.bottom - rect.top);
    }

    @Override // bn5.f
    public void a() {
    }

    @Override // bn5.f
    public boolean f() {
        return false;
    }

    @Override // bn5.f
    public android.graphics.Rect getAliveRect() {
        android.graphics.Rect aliveRect;
        java.lang.String str;
        if (super.getAliveRect().isEmpty()) {
            aliveRect = getBoardRect();
            str = "getBoardRect(...)";
        } else {
            aliveRect = super.getAliveRect();
            str = "getAliveRect(...)";
        }
        kotlin.jvm.internal.o.f(aliveRect, str);
        return aliveRect;
    }

    @Override // bn5.f
    public void j() {
        super.j();
        if (this.f22951r != null) {
            android.graphics.Rect rect = ((l45.n) getPresenter()).f316461b.f364236f;
            android.graphics.Matrix matrix = this.f22941e;
            matrix.reset();
            this.f22944h.set(0, 0, rect.right - rect.left, rect.bottom - rect.top);
            matrix.postTranslate(rect.left, rect.top);
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.tencent.mars.xlog.Log.i(this.G, "onAttachedToWindow: ");
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.tencent.mars.xlog.Log.i(this.G, "onDetachedFromWindow: ");
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        canvas.drawColor(0);
        canvas.save();
        android.graphics.Bitmap bitmap = ((l45.n) getPresenter()).f316465f;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (android.graphics.Paint) null);
        }
        canvas.restore();
        ((l45.n) getPresenter()).q(canvas);
    }

    @Override // bn5.f, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (((l45.n) getPresenter()).n()) {
            h(motionEvent);
        }
        return ((l45.n) getPresenter()).v(motionEvent) || ((l45.n) getPresenter()).f316467h;
    }
}
