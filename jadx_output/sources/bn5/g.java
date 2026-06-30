package bn5;

/* loaded from: classes10.dex */
public final class g extends bn5.f {
    public yz5.a G;
    public boolean H;
    public float I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f22960J;

    public g(android.content.Context context, l45.q qVar) {
        super(context, qVar);
        this.I = 1.0f;
        this.f22943g = this.f22941e;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (((l45.n) getPresenter()).n()) {
            h(motionEvent);
        }
        ((l45.n) getPresenter()).v(motionEvent);
        if (this.f22960J) {
            java.util.Map map = com.tencent.xweb.t.f220590a;
            try {
                by5.c4.c("FileReaderXWeb", "setTouchEvent error, invalid param");
            } catch (java.lang.Throwable th6) {
                by5.c4.d("FileReaderXWeb", "setTouchEvent error", th6);
            }
        }
        return this.f22960J;
    }

    @Override // bn5.f
    public boolean f() {
        return true;
    }

    @Override // bn5.f
    public float getMinScale() {
        if (((l45.n) getPresenter()).f().m() != dl.a.CROP_PHOTO) {
            return super.getMinScale();
        }
        int width = getBoardRect().width() / getRawLayoutRect().width();
        int height = getBoardRect().height() / getRawLayoutRect().height();
        if (width <= height) {
            width = height;
        }
        return width * getCurScale();
    }

    @Override // bn5.f
    public void i(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        android.graphics.Matrix matrix = this.f22943g;
        if (matrix != null) {
            this.f22941e.set(matrix);
            canvas.setMatrix(this.f22943g);
        } else {
            canvas.setMatrix(getMainMatrix());
        }
        android.graphics.Bitmap bitmap = ((l45.n) getPresenter()).f316465f;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (android.graphics.Paint) null);
        }
        ((l45.n) getPresenter()).q(canvas);
        if (this.H) {
            this.H = false;
            yz5.a aVar = this.G;
            if (aVar != null) {
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkBoardView", "onSizeChanged " + getRawLayoutRect().flattenToString() + ", " + i17 + ',' + i19);
        if (getRawLayoutRect() != null) {
            kotlin.jvm.internal.o.d(getRawLayoutRect());
            float width = r1.width() * 1.0f;
            kotlin.jvm.internal.o.d(getRawLayoutRect());
            if (width / r3.height() > (getWidth() * 1.0f) / getHeight()) {
                kotlin.jvm.internal.o.d(getRawLayoutRect());
                this.I = (getWidth() * 1.0f) / (r3.width() * 1.0f);
                getHeight();
                android.graphics.Rect rawLayoutRect = getRawLayoutRect();
                kotlin.jvm.internal.o.d(rawLayoutRect);
                rawLayoutRect.height();
            } else {
                kotlin.jvm.internal.o.d(getRawLayoutRect());
                this.I = (getHeight() * 1.0f) / (r3.height() * 1.0f);
                getWidth();
                android.graphics.Rect rawLayoutRect2 = getRawLayoutRect();
                kotlin.jvm.internal.o.d(rawLayoutRect2);
                rawLayoutRect2.width();
            }
        }
        invalidate();
    }

    public final void setEnableToResponseSlid(boolean z17) {
        this.f22960J = z17;
    }
}
