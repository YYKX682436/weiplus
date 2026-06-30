package vm2;

/* loaded from: classes3.dex */
public final class z extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final int f519667d;

    /* renamed from: e, reason: collision with root package name */
    public final int f519668e;

    /* renamed from: f, reason: collision with root package name */
    public final int f519669f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Paint f519670g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f519671h;

    /* renamed from: i, reason: collision with root package name */
    public final int f519672i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(android.content.Context context, int i17, int i18, int i19) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f519667d = i17;
        this.f519668e = i18;
        this.f519669f = i19;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f519670g = paint;
        this.f519672i = i19 - i18;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setAntiAlias(true);
    }

    /* renamed from: getColor */
    public final int m172319x7444d5ad() {
        return this.f519667d;
    }

    /* renamed from: getSelectedStokeWidth */
    public final int m172320xaa97f58f() {
        return this.f519669f;
    }

    /* renamed from: getUnselectedStokeWidth */
    public final int m172321x81344a68() {
        return this.f519668e;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        android.graphics.Paint paint = this.f519670g;
        paint.setColor(-1);
        boolean z17 = this.f519671h;
        int i17 = this.f519669f;
        int i18 = this.f519667d;
        if (z17) {
            canvas.drawCircle(width, height, width, paint);
            paint.setColor(i18);
            canvas.drawCircle(width, height, width - i17, paint);
        } else {
            canvas.drawCircle(width, height, width - this.f519672i, paint);
            paint.setColor(i18);
            canvas.drawCircle(width, height, width - i17, paint);
        }
        super.onDraw(canvas);
    }

    /* renamed from: setHasSelected */
    public final void m172322x62966993(boolean z17) {
        if (this.f519671h != z17) {
            this.f519671h = z17;
            invalidate();
        }
    }
}
