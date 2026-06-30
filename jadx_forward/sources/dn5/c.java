package dn5;

/* loaded from: classes10.dex */
public abstract class c extends android.view.View {
    public static final int[] D = {-1, -16777216, -707825, -17592, -16535286, -15172610, -7054596, -449092};
    public int A;
    public int B;
    public boolean C;

    /* renamed from: d, reason: collision with root package name */
    public final float f323570d;

    /* renamed from: e, reason: collision with root package name */
    public final l45.q f323571e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Bitmap f323572f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Bitmap f323573g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Bitmap f323574h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Bitmap f323575i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Bitmap f323576m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.Bitmap f323577n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.Bitmap f323578o;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.Bitmap f323579p;

    /* renamed from: q, reason: collision with root package name */
    public int f323580q;

    /* renamed from: r, reason: collision with root package name */
    public int f323581r;

    /* renamed from: s, reason: collision with root package name */
    public int f323582s;

    /* renamed from: t, reason: collision with root package name */
    public android.graphics.Rect[] f323583t;

    /* renamed from: u, reason: collision with root package name */
    public android.graphics.Rect[] f323584u;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.Rect f323585v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f323586w;

    /* renamed from: x, reason: collision with root package name */
    public android.graphics.Paint f323587x;

    /* renamed from: y, reason: collision with root package name */
    public android.graphics.Paint f323588y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f323589z;

    public c(android.content.Context context, l45.q qVar) {
        super(context);
        this.f323570d = getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561943x5);
        this.f323580q = -1;
        this.f323581r = -1;
        this.f323582s = -1;
        this.f323589z = false;
        this.A = -1;
        this.B = -1;
        this.C = true;
        setId(com.p314xaae8f345.mm.R.id.afb);
        this.f323571e = qVar;
        g();
    }

    public void a() {
        if (this.f323583t == null) {
            this.f323583t = new android.graphics.Rect[m125835xa778e22f()];
        }
        int m125837xac175617 = (int) (this.f323570d + (m125837xac175617() / 2.0f));
        int m125837xac1756172 = (int) m125837xac175617();
        for (int i17 = 0; i17 < m125835xa778e22f(); i17++) {
            this.f323583t[i17] = new android.graphics.Rect(m125837xac175617 - m125837xac1756172, mo125834x6ce0e74e(), m125837xac175617 + m125837xac1756172, mo125834x6ce0e74e() + getMeasuredHeight());
            m125837xac175617 = (int) (m125837xac175617 + m125840xc0c9f613() + m125837xac175617());
        }
        if (f(this.f323580q) == qk.g6.DOODLE) {
            if (this.f323584u == null) {
                this.f323584u = new android.graphics.Rect[8];
            }
            if (this.f323585v == null) {
                this.f323585v = new android.graphics.Rect();
            }
            float dimension = getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561845u9);
            float f17 = dimension * 2.0f;
            float f18 = 8;
            float measuredWidth = (((getMeasuredWidth() - m125838xa209cf27()) - this.f323578o.getWidth()) - (f17 * f18)) / f18;
            int i18 = (int) f17;
            int m125838xa209cf27 = (int) ((m125838xa209cf27() / 2) + dimension + 5.0f);
            int mo125834x6ce0e74e = (int) (((mo125834x6ce0e74e() - f17) / 2.0f) + dimension);
            for (int i19 = 0; i19 < 8; i19++) {
                this.f323584u[i19] = new android.graphics.Rect(m125838xa209cf27 - i18, mo125834x6ce0e74e - i18, m125838xa209cf27 + i18, mo125834x6ce0e74e + i18);
                m125838xa209cf27 = (int) (m125838xa209cf27 + measuredWidth + f17);
            }
            int measuredWidth2 = (getMeasuredWidth() - (m125838xa209cf27() / 2)) - (this.f323578o.getWidth() / 2);
            this.f323585v.set(measuredWidth2 - this.f323578o.getWidth(), 0, measuredWidth2 + this.f323578o.getWidth(), mo125834x6ce0e74e());
        }
    }

    public abstract android.graphics.Bitmap b(qk.g6 g6Var, boolean z17);

    public void c(android.graphics.Canvas canvas) {
        float b17;
        if (f(this.f323580q) == qk.g6.DOODLE) {
            float dimension = getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561845u9);
            float f17 = dimension * 2.0f;
            float f18 = 8;
            float measuredWidth = (((getMeasuredWidth() - m125838xa209cf27()) - this.f323578o.getWidth()) - (f17 * f18)) / f18;
            float m125838xa209cf27 = (m125838xa209cf27() / 2) + dimension + cm5.h.b(1.5f);
            float mo125834x6ce0e74e = ((mo125834x6ce0e74e() - f17) / 2.0f) + dimension;
            int i17 = 0;
            while (i17 < 8) {
                if (this.B == i17) {
                    b17 = cm5.h.b(2.0f);
                    this.C = false;
                } else {
                    b17 = (this.C && i17 == 2) ? cm5.h.b(2.0f) : 0.0f;
                }
                this.f323588y.setColor(-1);
                canvas.drawCircle(m125838xa209cf27, mo125834x6ce0e74e, cm5.h.b(1.5f) + dimension + b17, this.f323588y);
                this.f323588y.setColor(D[i17]);
                canvas.drawCircle(m125838xa209cf27, mo125834x6ce0e74e, b17 + dimension, this.f323588y);
                m125838xa209cf27 += measuredWidth + f17;
                i17++;
            }
            android.graphics.Paint paint = new android.graphics.Paint();
            if (i()) {
                paint.setAlpha(255);
            } else {
                paint.setAlpha(160);
            }
            canvas.drawBitmap((this.f323586w && i()) ? this.f323579p : this.f323578o, (getMeasuredWidth() - (m125838xa209cf27() / 2)) - this.f323578o.getWidth(), (mo125834x6ce0e74e() - this.f323578o.getHeight()) / 2, paint);
        }
    }

    public android.graphics.Bitmap d(qk.g6 g6Var, boolean z17) {
        int ordinal = g6Var.ordinal();
        android.graphics.Bitmap bitmap = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : z17 ? this.f323577n : this.f323576m : z17 ? this.f323575i : this.f323574h : z17 ? this.f323573g : this.f323572f;
        return bitmap == null ? b(g6Var, z17) : bitmap;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        int x17 = (int) motionEvent.getX();
        int y17 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i17 = 0;
            while (true) {
                if (i17 >= m125835xa778e22f()) {
                    break;
                }
                if (this.f323583t[i17].contains(x17, y17)) {
                    this.A = i17;
                    postInvalidate();
                    break;
                }
                if (mo125834x6ce0e74e() > 0) {
                    android.graphics.Rect rect = this.f323585v;
                    if (rect == null || !rect.contains(x17, y17)) {
                        k(x17, y17);
                    } else {
                        this.f323586w = true;
                        postInvalidate();
                    }
                }
                i17++;
            }
        } else if (action == 1 || action == 3) {
            int i18 = 0;
            while (true) {
                if (i18 >= m125835xa778e22f()) {
                    break;
                }
                if (this.f323583t[i18].contains(x17, y17) && this.A == i18) {
                    if (j(i18)) {
                        int i19 = this.A;
                        if (i19 != this.f323580q) {
                            this.f323580q = i19;
                        } else {
                            this.f323580q = -1;
                        }
                    }
                    if (!this.f323589z) {
                        this.f323582s = this.f323581r;
                        if (j(i18)) {
                            this.f323581r = this.f323580q;
                            l45.n nVar = (l45.n) m125839xc879b3f2();
                            nVar.getClass();
                            new l45.a(nVar).a(f(this.f323580q));
                        } else {
                            this.f323581r = i18;
                            l45.n nVar2 = (l45.n) m125839xc879b3f2();
                            nVar2.getClass();
                            new l45.a(nVar2).a(f(i18));
                        }
                    }
                }
                i18++;
            }
            if (mo125834x6ce0e74e() > 0) {
                android.graphics.Rect rect2 = this.f323585v;
                if (rect2 != null && rect2.contains(x17, y17) && this.f323586w) {
                    l45.n nVar3 = (l45.n) m125839xc879b3f2();
                    nVar3.getClass();
                    new l45.a(nVar3).b(f(this.f323580q), -1, null);
                } else {
                    l(x17, y17);
                }
            }
            this.f323586w = false;
            this.A = -1;
            requestLayout();
            postInvalidate();
        }
        return true;
    }

    public int e(int i17) {
        if (i17 < 0 || i17 >= 8) {
            return -65536;
        }
        return D[i17];
    }

    public qk.g6 f(int i17) {
        return (i17 < 0 || i17 >= m125835xa778e22f()) ? qk.g6.DEFAULT : ((l45.n) m125839xc879b3f2()).f397993a.mo177315x6a8721b3()[i17];
    }

    public void g() {
        new android.graphics.Paint(1).setColor(-16711936);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f323587x = paint;
        paint.setColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560431k7));
        this.f323587x.setStrokeWidth(0.6f);
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.f323588y = paint2;
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        this.f323588y.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.f323579p = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.K0(getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f81271x873da528));
        this.f323578o = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.K0(getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f81270x5ce8d8a2));
        this.f323572f = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.K0(getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f78980xc996b1a));
        this.f323573g = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.K0(getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f78979xf2f48701));
        this.f323574h = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.K0(getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f81187xb35a86));
        this.f323575i = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.K0(getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f81172xe55b616d));
        android.content.res.Resources resources = getResources();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.f78058xfd1d65cd));
        arrayList.add(resources);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/view/footer/BaseFooterView", "initBitmap", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.e(obj, decodeResource, "com/tencent/mm/view/footer/BaseFooterView", "initBitmap", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        this.f323576m = decodeResource;
        android.content.res.Resources resources2 = getResources();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.f78052x258d9274));
        arrayList2.add(resources2);
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/view/footer/BaseFooterView", "initBitmap", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource2 = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList2.get(0), ((java.lang.Integer) arrayList2.get(1)).intValue());
        yj0.a.e(obj2, decodeResource2, "com/tencent/mm/view/footer/BaseFooterView", "initBitmap", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        this.f323577n = decodeResource2;
    }

    /* renamed from: getCurFeatureType */
    public qk.g6 mo125833x34c1de6() {
        return f(this.f323581r);
    }

    /* renamed from: getDetailHeight */
    public int mo125834x6ce0e74e() {
        if (f(this.f323580q) == qk.g6.DOODLE) {
            return (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561945x7);
        }
        return 0;
    }

    /* renamed from: getFeatureCount */
    public int m125835xa778e22f() {
        return ((l45.n) m125839xc879b3f2()).f397993a.mo177315x6a8721b3().length;
    }

    /* renamed from: getHeightSpacing */
    public float m125836x40295d66() {
        return ((getMeasuredHeight() - mo125834x6ce0e74e()) - m125837xac175617()) / 2.0f;
    }

    /* renamed from: getIconWidth */
    public float m125837xac175617() {
        if (d(qk.g6.DOODLE, false) == null) {
            return 0.0f;
        }
        return r0.getWidth();
    }

    /* renamed from: getPaddingLeftAndRight */
    public int m125838xa209cf27() {
        return (int) (this.f323570d * 2.0f);
    }

    /* renamed from: getPresenter */
    public l45.q m125839xc879b3f2() {
        return this.f323571e;
    }

    /* renamed from: getWidthSpacing */
    public float m125840xc0c9f613() {
        return ((getMeasuredWidth() - (m125835xa778e22f() * m125837xac175617())) - m125838xa209cf27()) / (m125835xa778e22f() - 1);
    }

    public void h(android.graphics.Canvas canvas) {
        if (mo125834x6ce0e74e() > 0) {
            canvas.drawLine(0.0f, mo125834x6ce0e74e(), getMeasuredWidth(), mo125834x6ce0e74e(), this.f323587x);
            c(canvas);
        }
        float m125836x40295d66 = m125836x40295d66() + mo125834x6ce0e74e();
        float f17 = this.f323570d;
        int i17 = 0;
        while (i17 < m125835xa778e22f()) {
            android.graphics.Bitmap d17 = d(((l45.n) m125839xc879b3f2()).f397993a.mo177315x6a8721b3()[i17], this.A == i17 || i17 == this.f323580q);
            if (d17 != null) {
                canvas.drawBitmap(d17, f17, m125836x40295d66, (android.graphics.Paint) null);
            }
            f17 += m125840xc0c9f613() + m125837xac175617();
            i17++;
        }
    }

    public boolean i() {
        dl.b d17 = ((l45.n) m125839xc879b3f2()).d(mo125833x34c1de6());
        if (d17 == null) {
            return false;
        }
        return d17.o();
    }

    public boolean j(int i17) {
        int ordinal = f(i17).ordinal();
        if (ordinal == 1) {
            return true;
        }
        if (ordinal == 2 || ordinal != 3) {
        }
        return false;
    }

    public void k(int i17, int i18) {
        if (f(this.f323580q).ordinal() != 1 || this.f323584u == null) {
            return;
        }
        int i19 = 0;
        while (true) {
            android.graphics.Rect[] rectArr = this.f323584u;
            if (i19 >= rectArr.length) {
                return;
            }
            if (rectArr[i19].contains(i17, i18)) {
                this.B = i19;
                this.C = false;
                return;
            }
            i19++;
        }
    }

    public void l(int i17, int i18) {
        if (f(this.f323580q).ordinal() != 1) {
            return;
        }
        int i19 = 0;
        while (true) {
            android.graphics.Rect[] rectArr = this.f323584u;
            if (rectArr == null || i19 >= rectArr.length) {
                return;
            }
            if (rectArr[i19].contains(i17, i18) && i19 == this.B) {
                l45.n nVar = (l45.n) m125839xc879b3f2();
                nVar.getClass();
                new l45.a(nVar).b(qk.g6.DOODLE, i19, null);
                return;
            }
            i19++;
        }
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(0);
        h(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        int size = (android.view.View.MeasureSpec.getSize(i17) - getPaddingLeft()) - getPaddingRight();
        int dimension = (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561946x8);
        if (mo125834x6ce0e74e() > 0) {
            dimension += mo125834x6ce0e74e();
        }
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(size, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(dimension, 1073741824));
        a();
    }

    /* renamed from: setCurFeatureType */
    public void m125841xcb4285f2(qk.g6 g6Var) {
        int i17 = 0;
        while (true) {
            if (i17 >= m125835xa778e22f()) {
                i17 = -1;
                break;
            } else if (((l45.n) m125839xc879b3f2()).f397993a.mo177315x6a8721b3()[i17] == g6Var) {
                break;
            } else {
                i17++;
            }
        }
        if (j(i17)) {
            this.f323580q = i17;
        } else {
            this.f323580q = -1;
        }
        this.f323581r = i17;
        requestLayout();
        invalidate();
    }

    /* renamed from: setFooterVisible */
    public void m125842x2f328115(boolean z17) {
        if (z17) {
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559256k);
            loadAnimation.setAnimationListener(new dn5.a(this));
            startAnimation(loadAnimation);
        } else {
            android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559257l);
            loadAnimation2.setAnimationListener(new dn5.b(this));
            startAnimation(loadAnimation2);
        }
    }

    /* renamed from: setHideFooter */
    public void m125843x1adb0b7f(boolean z17) {
        this.f323589z = z17;
    }
}
