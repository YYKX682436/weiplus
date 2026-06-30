package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.FontChooserView */
/* loaded from: classes5.dex */
public class C19484x7a29c291 extends android.view.View {

    /* renamed from: v, reason: collision with root package name */
    public static java.lang.ref.SoftReference f268557v = null;

    /* renamed from: w, reason: collision with root package name */
    public static int f268558w = 8;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f268559d;

    /* renamed from: e, reason: collision with root package name */
    public int f268560e;

    /* renamed from: f, reason: collision with root package name */
    public int f268561f;

    /* renamed from: g, reason: collision with root package name */
    public int f268562g;

    /* renamed from: h, reason: collision with root package name */
    public int f268563h;

    /* renamed from: i, reason: collision with root package name */
    public float f268564i;

    /* renamed from: m, reason: collision with root package name */
    public float f268565m;

    /* renamed from: n, reason: collision with root package name */
    public int f268566n;

    /* renamed from: o, reason: collision with root package name */
    public int f268567o;

    /* renamed from: p, reason: collision with root package name */
    public int f268568p;

    /* renamed from: q, reason: collision with root package name */
    public int f268569q;

    /* renamed from: r, reason: collision with root package name */
    public int f268570r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.w0 f268571s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f268572t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f268573u;

    public C19484x7a29c291(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f268559d = new java.util.ArrayList(8);
        this.f268560e = 0;
        this.f268561f = 0;
        this.f268562g = 0;
        this.f268563h = 0;
        this.f268564i = 0.0f;
        this.f268565m = 0.0f;
        this.f268566n = 0;
        this.f268567o = 0;
        this.f268568p = 0;
        this.f268569q = 0;
        this.f268570r = 0;
        this.f268571s = null;
        this.f268572t = false;
        this.f268573u = false;
    }

    public final void a() {
        java.lang.ref.SoftReference softReference = f268557v;
        if (softReference == null || softReference.get() == null) {
            android.content.res.Resources resources = getResources();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.f563369c60));
            arrayList.add(resources);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/widget/FontChooserView", "checkBitmap", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/webview/ui/tools/widget/FontChooserView", "checkBitmap", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            f268557v = new java.lang.ref.SoftReference(decodeResource);
        }
    }

    public final int b(float f17) {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setTextSize(f17);
        paint.setAntiAlias(true);
        return (int) java.lang.Math.ceil(paint.getFontMetrics().bottom);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (canvas == null) {
            return;
        }
        a();
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setARGB(255, 152, 152, 152);
        paint.setStrokeWidth(2.0f);
        int width = getWidth();
        int b17 = i65.a.b(getContext(), 5);
        int i17 = this.f268560e;
        int i18 = this.f268562g;
        canvas.drawLine(i17, i18, width - i17, i18, paint);
        for (int i19 = 0; i19 < f268558w; i19++) {
            int i27 = this.f268560e;
            int i28 = this.f268563h;
            int i29 = this.f268562g;
            canvas.drawLine((i28 * i19) + i27, i29 - b17, i27 + (i28 * i19), i29 + b17, paint);
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) f268557v.get();
        if (bitmap == null) {
            a();
        }
        canvas.drawBitmap(bitmap, this.f268567o, this.f268568p, (android.graphics.Paint) null);
        java.lang.String string = getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l7f);
        getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l7e);
        getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l7g);
        float e17 = com.p314xaae8f345.mm.ui.zk.e(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia) * i65.a.y(getContext());
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setTextSize(e17);
        int measureText = (int) paint2.measureText(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2968x9376332f);
        int b18 = b(e17);
        paint2.setColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        paint2.setAntiAlias(true);
        canvas.drawText(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2968x9376332f, this.f268560e - (measureText / 2), (this.f268562g - b18) - (bitmap.getHeight() / 3), paint2);
        float e18 = com.p314xaae8f345.mm.ui.zk.e(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia);
        i65.a.x(getContext());
        paint2.setTextSize(e18 * 1.0f);
        canvas.drawText(string, (this.f268560e + (this.f268563h * 1)) - (((int) paint2.measureText(string)) / 2), (this.f268562g - b(r2)) - (bitmap.getHeight() / 3), paint2);
        paint2.setTextSize(com.p314xaae8f345.mm.ui.zk.e(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia) * i65.a.v(getContext()));
        canvas.drawText(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2968x9376332f, (this.f268560e + (this.f268563h * (f268558w - 1))) - (((int) paint2.measureText(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2968x9376332f)) / 2), (this.f268562g - b(r1)) - (bitmap.getHeight() / 3), paint2);
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        a();
        java.util.List list = this.f268559d;
        ((java.util.ArrayList) list).clear();
        setClickable(true);
        this.f268560e = i65.a.b(getContext(), 30);
        this.f268561f = i65.a.b(getContext(), 10);
        int width = getWidth();
        this.f268562g = this.f268561f + (getHeight() / 2);
        f268558w = 8;
        this.f268563h = (width - (this.f268560e * 2)) / (8 - 1);
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) f268557v.get();
        if (bitmap == null) {
            a();
            bitmap = (android.graphics.Bitmap) f268557v.get();
        }
        for (int i28 = 0; i28 < f268558w; i28++) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x0 x0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x0(null);
            x0Var.f269126a = (this.f268560e + (this.f268563h * i28)) - (bitmap.getWidth() / 2);
            x0Var.f269127b = this.f268562g - (bitmap.getHeight() / 2);
            x0Var.f269128c = this.f268560e + (this.f268563h * i28) + (bitmap.getWidth() / 2);
            x0Var.f269129d = this.f268562g + (bitmap.getHeight() / 2);
            ((java.util.ArrayList) list).add(x0Var);
        }
        int i29 = this.f268570r;
        this.f268566n = i29;
        if (this.f268569q >= 0) {
            this.f268567o = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x0) ((java.util.ArrayList) list).get(i29)).f269126a;
        } else if (this.f268567o <= ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x0) ((java.util.ArrayList) list).get(i29)).f269128c - (this.f268563h / 2)) {
            this.f268567o = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x0) ((java.util.ArrayList) list).get(this.f268566n)).f269126a;
        } else {
            this.f268567o = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x0) ((java.util.ArrayList) list).get(this.f268566n)).f269128c;
        }
        this.f268568p = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x0) ((java.util.ArrayList) list).get(this.f268566n)).f269127b;
        invalidate();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        java.util.List list = this.f268559d;
        int i17 = 0;
        if (action == 0) {
            this.f268564i = motionEvent.getX();
            this.f268565m = motionEvent.getY();
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x0 x0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x0) ((java.util.ArrayList) list).get(this.f268566n);
            float f17 = this.f268564i;
            if (f17 >= x0Var.f269126a && f17 <= x0Var.f269128c) {
                float f18 = this.f268565m;
                if (f18 >= x0Var.f269127b && f18 <= x0Var.f269129d) {
                    i17 = 1;
                }
            }
            if (i17 != 0) {
                this.f268572t = true;
                return true;
            }
            this.f268573u = true;
            return super.onTouchEvent(motionEvent);
        }
        if (action != 1) {
            if (action != 2) {
                return true;
            }
            if (!this.f268572t) {
                return super.onTouchEvent(motionEvent);
            }
            float x17 = motionEvent.getX();
            float y17 = motionEvent.getY();
            this.f268569q = (int) (x17 - this.f268564i);
            this.f268567o = (int) (x17 - this.f268560e);
            this.f268564i = x17;
            this.f268565m = y17;
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x0 x0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x0) arrayList.get(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x0 x0Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x0) arrayList.get(f268558w - 1);
            int i18 = this.f268567o;
            int i19 = x0Var2.f269126a;
            if (i18 > i19) {
                int i27 = x0Var3.f269126a;
                if (i18 < i27) {
                    while (true) {
                        if (i17 >= f268558w) {
                            break;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x0 x0Var4 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x0) arrayList.get(i17);
                        int i28 = this.f268567o;
                        if (i28 < x0Var4.f269126a - 5 || i28 > x0Var4.f269128c + 5) {
                            i17++;
                        } else {
                            this.f268566n = i17;
                            this.f268570r = i17;
                            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.w0 w0Var = this.f268571s;
                            if (w0Var != null) {
                                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.xc) w0Var).a(i17);
                            }
                        }
                    }
                } else {
                    this.f268567o = i27;
                }
            } else {
                this.f268567o = i19;
            }
            invalidate();
            return true;
        }
        if (!this.f268572t) {
            if (!this.f268573u) {
                return super.onTouchEvent(motionEvent);
            }
            float x18 = motionEvent.getX();
            float y18 = motionEvent.getY();
            if (java.lang.Math.abs(x18 - this.f268564i) <= 10.0f && java.lang.Math.abs(y18 - this.f268565m) <= 10.0f) {
                int i29 = 0;
                while (true) {
                    if (i29 >= f268558w) {
                        break;
                    }
                    int i37 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x0) ((java.util.ArrayList) list).get(i29)).f269126a;
                    if (x18 < i37 - 5 || x18 > r4.f269128c + 5) {
                        i29++;
                    } else {
                        this.f268566n = i29;
                        this.f268570r = i29;
                        this.f268567o = i37;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.w0 w0Var2 = this.f268571s;
                        if (w0Var2 != null) {
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.xc) w0Var2).a(i29);
                        }
                    }
                }
            }
            this.f268573u = false;
            invalidate();
            return true;
        }
        int i38 = 0;
        while (true) {
            if (i38 >= f268558w - 1) {
                break;
            }
            java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x0 x0Var5 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x0) arrayList2.get(i38);
            int i39 = i38 + 1;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x0 x0Var6 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x0) arrayList2.get(i39);
            int i47 = this.f268567o;
            int i48 = x0Var5.f269126a;
            int i49 = this.f268563h / 2;
            if (i47 <= i49 + i48 && i47 >= i48) {
                this.f268566n = i38;
                this.f268567o = i48;
                break;
            }
            int i57 = x0Var6.f269126a;
            if (i47 >= i57 - i49 && i47 <= i57) {
                this.f268566n = i39;
                this.f268567o = i57;
                break;
            }
            i38 = i39;
        }
        int i58 = this.f268566n;
        this.f268570r = i58;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.w0 w0Var3 = this.f268571s;
        if (w0Var3 != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.xc) w0Var3).a(i58);
        }
        invalidate();
        this.f268572t = false;
        return true;
    }

    /* renamed from: setOnChangeListener */
    public void m74795xb9da30c5(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.w0 w0Var) {
        this.f268571s = w0Var;
    }

    /* renamed from: setSliderIndex */
    public void m74796x6b90deaf(int i17) {
        this.f268570r = i17;
    }

    public C19484x7a29c291(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f268559d = new java.util.ArrayList(8);
        this.f268560e = 0;
        this.f268561f = 0;
        this.f268562g = 0;
        this.f268563h = 0;
        this.f268564i = 0.0f;
        this.f268565m = 0.0f;
        this.f268566n = 0;
        this.f268567o = 0;
        this.f268568p = 0;
        this.f268569q = 0;
        this.f268570r = 0;
        this.f268571s = null;
        this.f268572t = false;
        this.f268573u = false;
    }
}
