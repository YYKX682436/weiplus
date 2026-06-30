package xk0;

/* loaded from: classes10.dex */
public final class n extends yk0.a {
    public final android.graphics.Rect G;
    public final java.lang.String H;
    public final java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public volatile boolean f536530J;
    public final jz5.g K;
    public final jz5.g L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.content.Context context, android.graphics.Matrix matrix, java.lang.String id6, android.graphics.Rect layerRect, android.graphics.Rect maxInteractRect, android.graphics.Rect safeInteractRect, java.lang.String filePath, java.lang.String str) {
        super(context, matrix, id6, layerRect, maxInteractRect, false, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(matrix, "matrix");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layerRect, "layerRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(maxInteractRect, "maxInteractRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(safeInteractRect, "safeInteractRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        this.G = safeInteractRect;
        this.H = filePath;
        this.I = str;
        this.K = jz5.h.b(new xk0.m(this, layerRect));
        this.L = jz5.h.b(new xk0.l(this));
        this.f536490o = 0.0f;
    }

    @Override // yk0.a
    public java.lang.String F() {
        return "MicroMsg.PictureItem[" + hashCode() + ']';
    }

    public final android.graphics.Bitmap H() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.L).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.graphics.Bitmap) mo141623x754a37bb;
    }

    public final android.util.Size I() {
        return (android.util.Size) ((jz5.n) this.K).mo141623x754a37bb();
    }

    @Override // yk0.a, xk0.f
    public void i(android.graphics.Canvas canvas) {
        android.graphics.Bitmap bitmap;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.i(canvas);
        if ((H().isRecycled() || (bitmap = this.f536485g) == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bitmap, H()) || this.f536485g.isRecycled()) ? false : true) {
            H().recycle();
        }
    }

    @Override // xk0.f
    public android.graphics.Bitmap p() {
        if (this.f536485g == null) {
            this.f536485g = H();
        }
        F();
        this.f536485g.hashCode();
        H().hashCode();
        android.graphics.Bitmap mEmojiBoxBmp = this.f536485g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mEmojiBoxBmp, "mEmojiBoxBmp");
        return mEmojiBoxBmp;
    }

    @Override // xk0.f
    public java.lang.String q() {
        return hashCode() + '_' + this.H;
    }
}
