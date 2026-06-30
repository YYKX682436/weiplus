package rp1;

/* loaded from: classes14.dex */
public class n2 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Bitmap f480020d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Paint f480021e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Paint f480022f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Path f480023g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Rect f480024h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.RectF f480025i;

    /* renamed from: m, reason: collision with root package name */
    public int f480026m;

    /* renamed from: n, reason: collision with root package name */
    public int f480027n;

    /* renamed from: o, reason: collision with root package name */
    public int f480028o;

    /* renamed from: p, reason: collision with root package name */
    public int f480029p;

    /* renamed from: q, reason: collision with root package name */
    public int f480030q;

    /* renamed from: r, reason: collision with root package name */
    public int f480031r;

    /* renamed from: s, reason: collision with root package name */
    public int f480032s;

    /* renamed from: t, reason: collision with root package name */
    public int f480033t;

    /* renamed from: u, reason: collision with root package name */
    public int f480034u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f480035v;

    /* renamed from: w, reason: collision with root package name */
    public int f480036w;

    /* renamed from: x, reason: collision with root package name */
    public android.animation.AnimatorListenerAdapter f480037x;

    public n2(android.content.Context context, android.graphics.Bitmap bitmap) {
        super(context);
        this.f480034u = -1;
        this.f480021e = new android.graphics.Paint();
        this.f480023g = new android.graphics.Path();
        this.f480022f = new android.graphics.Paint();
        this.f480022f.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN));
        this.f480020d = bitmap;
        this.f480032s = bitmap.getWidth();
        this.f480033t = bitmap.getHeight();
        this.f480024h = new android.graphics.Rect(0, 0, this.f480032s, this.f480033t);
        android.graphics.RectF rectF = new android.graphics.RectF();
        this.f480025i = rectF;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        int i17 = this.f480032s;
        rectF.right = i17;
        rectF.bottom = this.f480033t;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransformToFloatBallAnimationMaskView", java.lang.String.format("init: mWidth:%d mHeight:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f480033t)));
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        if (this.f480035v) {
            canvas.translate(this.f480026m, 0.0f);
        }
        this.f480023g.reset();
        android.graphics.Path path = this.f480023g;
        android.graphics.RectF rectF = this.f480025i;
        int i17 = this.f480027n;
        path.addRoundRect(rectF, i17, i17, android.graphics.Path.Direction.CW);
        canvas.clipPath(this.f480023g);
        android.graphics.Bitmap bitmap = this.f480020d;
        android.graphics.Rect rect = this.f480024h;
        canvas.drawBitmap(bitmap, rect, rect, this.f480021e);
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(this.f480032s, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.f480033t, 1073741824));
    }

    /* renamed from: setContentStartPosX */
    public void m162839x4b34b00f(int i17) {
        this.f480034u = i17;
    }

    /* renamed from: setListener */
    public void m162840xc6cf6336(android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        this.f480037x = animatorListenerAdapter;
    }
}
