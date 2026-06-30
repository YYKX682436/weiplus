package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* renamed from: com.tencent.mm.ui.tools.CropImageView */
/* loaded from: classes15.dex */
public class C22500x8bcca9d0 extends android.widget.ImageView {
    public static final /* synthetic */ int F = 0;
    public com.p314xaae8f345.mm.ui.p2740x696c9db.a3 A;
    public boolean B;
    public final android.view.View.OnTouchListener C;
    public boolean D;
    public android.graphics.drawable.Drawable E;

    /* renamed from: d, reason: collision with root package name */
    public boolean f291544d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f291545e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f291546f;

    /* renamed from: g, reason: collision with root package name */
    public float f291547g;

    /* renamed from: h, reason: collision with root package name */
    public float f291548h;

    /* renamed from: i, reason: collision with root package name */
    public float f291549i;

    /* renamed from: m, reason: collision with root package name */
    public float f291550m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.PointF f291551n;

    /* renamed from: o, reason: collision with root package name */
    public float f291552o;

    /* renamed from: p, reason: collision with root package name */
    public float f291553p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f291554q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f291555r;

    /* renamed from: s, reason: collision with root package name */
    public float f291556s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f291557t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f291558u;

    /* renamed from: v, reason: collision with root package name */
    public wu5.c f291559v;

    /* renamed from: w, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f291560w;

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f291561x;

    /* renamed from: y, reason: collision with root package name */
    public long f291562y;

    /* renamed from: z, reason: collision with root package name */
    public int f291563z;

    public C22500x8bcca9d0(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f291544d = true;
        this.f291546f = false;
        this.f291551n = new android.graphics.PointF();
        this.f291552o = 0.0f;
        this.f291553p = 0.0f;
        this.f291554q = false;
        this.f291555r = false;
        this.f291556s = 1.0f;
        this.f291557t = false;
        this.f291558u = false;
        this.f291559v = null;
        this.f291560w = new com.p314xaae8f345.mm.ui.p2740x696c9db.w2(this);
        this.f291561x = new com.p314xaae8f345.mm.ui.p2740x696c9db.x2(this);
        this.f291563z = 0;
        this.B = true;
        com.p314xaae8f345.mm.ui.p2740x696c9db.z2 z2Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.z2(this);
        this.C = z2Var;
        this.D = false;
        setOnTouchListener(z2Var);
    }

    public void a() {
        float f17 = this.f291556s * 1.0666f;
        this.f291556s = f17;
        if (this.f291544d && 4.0f < f17) {
            this.f291556s = 4.0f;
            return;
        }
        android.graphics.PointF pointF = this.f291551n;
        float f18 = pointF.x;
        float f19 = pointF.y;
        float[] fArr = {f18, f19};
        float[] fArr2 = {f18, f19};
        getImageMatrix().mapPoints(fArr2);
        getImageMatrix().postScale(1.0666f, 1.0666f);
        getImageMatrix().mapPoints(fArr);
        getImageMatrix().postTranslate((fArr2[0] - fArr[0]) / 2.0f, (fArr2[1] - fArr[1]) / 2.0f);
        setImageBitmap(this.f291545e);
        invalidate();
    }

    public void b() {
        float f17 = this.f291556s * 0.9375f;
        this.f291556s = f17;
        if (0.4f > f17) {
            this.f291556s = 0.4f;
            return;
        }
        android.graphics.PointF pointF = this.f291551n;
        float f18 = pointF.x;
        float f19 = pointF.y;
        float[] fArr = {f18, f19};
        float[] fArr2 = {f18, f19};
        getImageMatrix().mapPoints(fArr2);
        getImageMatrix().postScale(0.9375f, 0.9375f);
        getImageMatrix().mapPoints(fArr);
        getImageMatrix().postTranslate((fArr2[0] - fArr[0]) / 2.0f, (fArr2[1] - fArr[1]) / 2.0f);
        setImageBitmap(this.f291545e);
        invalidate();
    }

    /* renamed from: getBmp */
    public android.graphics.Bitmap m81066xb5882e4f() {
        return this.f291545e;
    }

    /* renamed from: getGifHeight */
    public int m81067xd6aa9b55() {
        android.graphics.drawable.Drawable drawable;
        return (!this.D || (drawable = this.E) == null) ? getHeight() : drawable.getIntrinsicHeight();
    }

    /* renamed from: getGifWidth */
    public int m81068xaceb25d8() {
        android.graphics.drawable.Drawable drawable;
        return (!this.D || (drawable = this.E) == null) ? getWidth() : drawable.getIntrinsicWidth();
    }

    /* renamed from: getRotateCount */
    public int m81069x476aeb3e() {
        return this.f291563z;
    }

    /* renamed from: setEnableOprate */
    public void m81070x2b9fb326(boolean z17) {
        this.B = z17;
    }

    /* renamed from: setGifPath */
    public void m81071xb2d06f47(java.lang.String str) {
        try {
            this.D = true;
            android.graphics.drawable.Drawable a17 = og5.g.a(str, str);
            this.E = a17;
            setImageDrawable(a17);
        } catch (java.lang.Exception unused) {
            this.D = false;
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap bitmap) {
        this.D = false;
        this.f291545e = bitmap;
        android.graphics.PointF pointF = this.f291551n;
        if (pointF != null && bitmap != null) {
            pointF.set(bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        }
        super.setImageBitmap(bitmap);
    }

    /* renamed from: setLimitZoomIn */
    public void m81072xc78c7e31(boolean z17) {
        this.f291544d = z17;
    }

    /* renamed from: setOnShortClick */
    public void m81073xba21ab2d(com.p314xaae8f345.mm.ui.p2740x696c9db.a3 a3Var) {
        this.A = a3Var;
    }
}
