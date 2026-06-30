package bn5;

/* loaded from: classes10.dex */
public final class g extends bn5.f {
    public yz5.a G;
    public boolean H;
    public float I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f104493J;

    public g(android.content.Context context, l45.q qVar) {
        super(context, qVar);
        this.I = 1.0f;
        this.f104476g = this.f104474e;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (((l45.n) m10945xc879b3f2()).n()) {
            h(motionEvent);
        }
        ((l45.n) m10945xc879b3f2()).v(motionEvent);
        if (this.f104493J) {
            java.util.Map map = com.p314xaae8f345.p3210x3857dc.t.f302123a;
            try {
                by5.c4.c("FileReaderXWeb", "setTouchEvent error, invalid param");
            } catch (java.lang.Throwable th6) {
                by5.c4.d("FileReaderXWeb", "setTouchEvent error", th6);
            }
        }
        return this.f104493J;
    }

    @Override // bn5.f
    public boolean f() {
        return true;
    }

    @Override // bn5.f
    /* renamed from: getMinScale */
    public float mo10944x299dd38e() {
        if (((l45.n) m10945xc879b3f2()).f().m() != dl.a.CROP_PHOTO) {
            return super.mo10944x299dd38e();
        }
        int width = m10934x9faf4b34().width() / m10948x9f8562c0().width();
        int height = m10934x9faf4b34().height() / m10948x9f8562c0().height();
        if (width <= height) {
            width = height;
        }
        return width * m10937x9c703c60();
    }

    @Override // bn5.f
    public void i(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        android.graphics.Matrix matrix = this.f104476g;
        if (matrix != null) {
            this.f104474e.set(matrix);
            canvas.setMatrix(this.f104476g);
        } else {
            canvas.setMatrix(m10942xfeaf52d0());
        }
        android.graphics.Bitmap bitmap = ((l45.n) m10945xc879b3f2()).f397998f;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (android.graphics.Paint) null);
        }
        ((l45.n) m10945xc879b3f2()).q(canvas);
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkBoardView", "onSizeChanged " + m10948x9f8562c0().flattenToString() + ", " + i17 + ',' + i19);
        if (m10948x9f8562c0() != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m10948x9f8562c0());
            float width = r1.width() * 1.0f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m10948x9f8562c0());
            if (width / r3.height() > (getWidth() * 1.0f) / getHeight()) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m10948x9f8562c0());
                this.I = (getWidth() * 1.0f) / (r3.width() * 1.0f);
                getHeight();
                android.graphics.Rect m10948x9f8562c0 = m10948x9f8562c0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m10948x9f8562c0);
                m10948x9f8562c0.height();
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m10948x9f8562c0());
                this.I = (getHeight() * 1.0f) / (r3.height() * 1.0f);
                getWidth();
                android.graphics.Rect m10948x9f8562c02 = m10948x9f8562c0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m10948x9f8562c02);
                m10948x9f8562c02.width();
            }
        }
        invalidate();
    }

    /* renamed from: setEnableToResponseSlid */
    public final void m10957xcac06715(boolean z17) {
        this.f104493J = z17;
    }
}
