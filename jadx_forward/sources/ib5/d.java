package ib5;

/* loaded from: classes13.dex */
public class d implements ib5.f {

    /* renamed from: d, reason: collision with root package name */
    public ib5.e f371784d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Canvas f371785e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Bitmap f371786f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f371787g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.ViewGroup f371788h;

    /* renamed from: l, reason: collision with root package name */
    public boolean f371792l;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.drawable.Drawable f371795o;

    /* renamed from: q, reason: collision with root package name */
    public boolean f371797q;

    /* renamed from: r, reason: collision with root package name */
    public final android.graphics.Paint f371798r;

    /* renamed from: s, reason: collision with root package name */
    public int f371799s;

    /* renamed from: a, reason: collision with root package name */
    public float f371781a = 16.0f;

    /* renamed from: b, reason: collision with root package name */
    public float f371782b = 1.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f371783c = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Rect f371789i = new android.graphics.Rect();

    /* renamed from: j, reason: collision with root package name */
    public final int[] f371790j = new int[2];

    /* renamed from: k, reason: collision with root package name */
    public final android.view.ViewTreeObserver.OnPreDrawListener f371791k = new ib5.a(this);

    /* renamed from: m, reason: collision with root package name */
    public boolean f371793m = true;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Runnable f371794n = new ib5.b(this);

    /* renamed from: p, reason: collision with root package name */
    public boolean f371796p = true;

    public d(android.view.View view, android.view.ViewGroup viewGroup) {
        boolean z17 = true;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f371798r = paint;
        this.f371788h = viewGroup;
        this.f371787g = view;
        this.f371784d = new ib5.i();
        paint.setFilterBitmap(true);
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (((int) java.lang.Math.ceil(measuredHeight / 8.0f)) != 0 && ((int) java.lang.Math.ceil(measuredWidth / 8.0f)) != 0) {
            z17 = false;
        }
        if (z17) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new ib5.c(this));
        } else {
            l(measuredWidth, measuredHeight);
        }
    }

    @Override // ib5.f
    public void a(android.graphics.Canvas canvas) {
        this.f371792l = true;
        if (this.f371793m) {
            android.graphics.drawable.Drawable drawable = this.f371795o;
            if (drawable == null) {
                this.f371786f.eraseColor(0);
            } else {
                drawable.draw(this.f371785e);
            }
            boolean z17 = this.f371797q;
            android.view.ViewGroup viewGroup = this.f371788h;
            if (z17) {
                viewGroup.draw(this.f371785e);
            } else {
                this.f371785e.save();
                m();
                viewGroup.draw(this.f371785e);
                this.f371785e.restore();
            }
            this.f371786f = this.f371784d.b(this.f371786f, this.f371781a);
            canvas.save();
            canvas.scale(this.f371782b * 8.0f, this.f371783c * 8.0f);
            canvas.drawBitmap(this.f371786f, 0.0f, 0.0f, this.f371798r);
            canvas.restore();
        }
    }

    @Override // ib5.f
    public void b(android.graphics.Canvas canvas) {
        this.f371787g.post(this.f371794n);
    }

    @Override // ib5.f
    public void c(ib5.e eVar) {
        this.f371784d = eVar;
    }

    @Override // ib5.f
    public void d(boolean z17) {
        this.f371793m = z17;
        i(z17);
        this.f371787g.invalidate();
    }

    @Override // ib5.f
    /* renamed from: destroy */
    public void mo135040x5cd39ffa() {
        i(false);
        this.f371784d.mo135041x5cd39ffa();
        android.graphics.Bitmap bitmap = this.f371786f;
        if (bitmap != null) {
            bitmap.recycle();
        }
    }

    @Override // ib5.f
    public void e(boolean z17) {
        this.f371796p = z17;
    }

    @Override // ib5.f
    public void f(int i17) {
        this.f371799s = i17;
    }

    @Override // ib5.f
    public void g() {
        android.view.View view = this.f371787g;
        l(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // ib5.f
    public void h(float f17) {
        this.f371781a = f17;
    }

    @Override // ib5.f
    public void i(boolean z17) {
        android.view.View view = this.f371787g;
        android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        android.view.ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f371791k;
        viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        if (z17) {
            view.getViewTreeObserver().addOnPreDrawListener(onPreDrawListener);
        }
    }

    @Override // ib5.f
    public void j(android.graphics.drawable.Drawable drawable) {
        this.f371795o = drawable;
    }

    @Override // ib5.f
    public void k(boolean z17) {
        this.f371797q = z17;
    }

    public void l(int i17, int i18) {
        double d17 = i18 / 8.0f;
        boolean z17 = ((int) java.lang.Math.ceil(d17)) == 0 || ((int) java.lang.Math.ceil((double) (((float) i17) / 8.0f))) == 0;
        android.view.View view = this.f371787g;
        if (z17) {
            this.f371793m = false;
            view.setWillNotDraw(true);
            i(false);
            return;
        }
        this.f371793m = true;
        view.setWillNotDraw(false);
        int ceil = (int) java.lang.Math.ceil(i17 / 8.0f);
        int ceil2 = (int) java.lang.Math.ceil(d17);
        int i19 = ceil % 16;
        int i27 = i19 == 0 ? ceil : (ceil - i19) + 16;
        int i28 = ceil2 % 16;
        int i29 = i28 == 0 ? ceil2 : (ceil2 - i28) + 16;
        this.f371783c = ceil2 / i29;
        this.f371782b = ceil / i27;
        android.graphics.Bitmap.Config a17 = this.f371784d.a();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(a17);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i29));
        arrayList.add(java.lang.Integer.valueOf(i27));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/blur/BlockingBlurController", "allocateBitmap", "(II)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/ui/blur/BlockingBlurController", "allocateBitmap", "(II)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        this.f371786f = createBitmap;
        this.f371785e = new android.graphics.Canvas(this.f371786f);
        i(true);
        if (this.f371797q) {
            m();
        }
    }

    public final void m() {
        android.view.View view = this.f371787g;
        android.graphics.Rect rect = this.f371789i;
        view.getDrawingRect(rect);
        if (this.f371796p) {
            try {
                this.f371788h.offsetDescendantRectToMyCoords(view, rect);
            } catch (java.lang.IllegalArgumentException unused) {
                this.f371796p = false;
            }
        } else {
            int[] iArr = this.f371790j;
            view.getLocationInWindow(iArr);
            rect.offset(iArr[0], iArr[1]);
        }
        rect.offset(0, this.f371799s);
        float f17 = this.f371782b * 8.0f;
        float f18 = this.f371783c * 8.0f;
        this.f371785e.translate(((-rect.left) / f17) - (view.getTranslationX() / f17), ((-rect.top) / f18) - (view.getTranslationY() / f18));
        this.f371785e.scale(1.0f / f17, 1.0f / f18);
    }
}
