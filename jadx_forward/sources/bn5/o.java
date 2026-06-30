package bn5;

/* loaded from: classes10.dex */
public final class o extends bn5.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.content.Context context, l45.q presenter) {
        super(context, presenter);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
        android.graphics.Rect rect = ((l45.n) presenter).f397994b.f445769f;
        this.f104474e.reset();
        this.f104477h.set(0, 0, rect.right - rect.left, rect.bottom - rect.top);
        this.f104474e.postTranslate(rect.left, rect.top);
    }

    @Override // bn5.f
    public void a() {
    }

    @Override // bn5.f
    public boolean f() {
        return false;
    }

    @Override // bn5.f
    /* renamed from: getAliveRect */
    public android.graphics.Rect mo10933x81daa99b() {
        android.graphics.Rect mo10933x81daa99b;
        java.lang.String str;
        if (super.mo10933x81daa99b().isEmpty()) {
            mo10933x81daa99b = m10934x9faf4b34();
            str = "getBoardRect(...)";
        } else {
            mo10933x81daa99b = super.mo10933x81daa99b();
            str = "getAliveRect(...)";
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo10933x81daa99b, str);
        return mo10933x81daa99b;
    }

    @Override // bn5.f
    public void j() {
        super.j();
        if (this.f104484r != null) {
            android.graphics.Rect rect = ((l45.n) m10945xc879b3f2()).f397994b.f445769f;
            android.graphics.Matrix matrix = this.f104474e;
            matrix.reset();
            this.f104477h.set(0, 0, rect.right - rect.left, rect.bottom - rect.top);
            matrix.postTranslate(rect.left, rect.top);
        }
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        canvas.drawColor(0);
        canvas.setMatrix(this.f104474e);
        canvas.save();
        android.graphics.Bitmap bitmap = ((l45.n) m10945xc879b3f2()).f397998f;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (android.graphics.Paint) null);
        }
        canvas.restore();
        ((l45.n) m10945xc879b3f2()).q(canvas);
    }

    @Override // bn5.f, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (((l45.n) m10945xc879b3f2()).n()) {
            h(motionEvent);
        }
        return ((l45.n) m10945xc879b3f2()).v(motionEvent) || ((l45.n) m10945xc879b3f2()).f398000h;
    }
}
