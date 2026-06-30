package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2079xd1075a44;

/* renamed from: com.tencent.mm.plugin.setting.ui.widget.FontSelectorView */
/* loaded from: classes5.dex */
public class C17657x77c04133 extends android.view.View {

    /* renamed from: v, reason: collision with root package name */
    public static java.lang.ref.SoftReference f243566v = null;

    /* renamed from: w, reason: collision with root package name */
    public static int f243567w = 8;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f243568d;

    /* renamed from: e, reason: collision with root package name */
    public int f243569e;

    /* renamed from: f, reason: collision with root package name */
    public int f243570f;

    /* renamed from: g, reason: collision with root package name */
    public int f243571g;

    /* renamed from: h, reason: collision with root package name */
    public int f243572h;

    /* renamed from: i, reason: collision with root package name */
    public float f243573i;

    /* renamed from: m, reason: collision with root package name */
    public float f243574m;

    /* renamed from: n, reason: collision with root package name */
    public int f243575n;

    /* renamed from: o, reason: collision with root package name */
    public int f243576o;

    /* renamed from: p, reason: collision with root package name */
    public int f243577p;

    /* renamed from: q, reason: collision with root package name */
    public int f243578q;

    /* renamed from: r, reason: collision with root package name */
    public int f243579r;

    /* renamed from: s, reason: collision with root package name */
    public w24.b f243580s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f243581t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f243582u;

    public C17657x77c04133(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f243568d = new java.util.ArrayList(8);
        this.f243569e = 0;
        this.f243570f = 0;
        this.f243571g = 0;
        this.f243572h = 0;
        this.f243573i = 0.0f;
        this.f243574m = 0.0f;
        this.f243575n = 0;
        this.f243576o = 0;
        this.f243577p = 0;
        this.f243578q = 0;
        this.f243579r = 0;
        this.f243580s = null;
        this.f243581t = false;
        this.f243582u = false;
    }

    public final void a() {
        java.lang.ref.SoftReference softReference = f243566v;
        if (softReference == null || softReference.get() == null) {
            android.content.res.Resources resources = getResources();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.f563369c60));
            arrayList.add(resources);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/widget/FontSelectorView", "checkBitmap", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/setting/ui/widget/FontSelectorView", "checkBitmap", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            f243566v = new java.lang.ref.SoftReference(decodeResource);
        }
    }

    public final int b(float f17) {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setTextSize(f17);
        paint.setAntiAlias(true);
        return (int) java.lang.Math.ceil(paint.getFontMetrics().bottom);
    }

    /* renamed from: getSliderIndex */
    public int m69109xd52b6b3b() {
        return this.f243579r;
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
        int i17 = this.f243569e;
        int i18 = this.f243571g;
        canvas.drawLine(i17, i18, width - i17, i18, paint);
        for (int i19 = 0; i19 < f243567w; i19++) {
            int i27 = this.f243569e;
            int i28 = this.f243572h;
            int i29 = this.f243571g;
            canvas.drawLine((i28 * i19) + i27, i29 - b17, i27 + (i28 * i19), i29 + b17, paint);
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) f243566v.get();
        if (bitmap == null) {
            a();
        }
        canvas.drawBitmap(bitmap, this.f243576o, this.f243577p, (android.graphics.Paint) null);
        java.lang.String string = getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.inn);
        getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.inm);
        getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ino);
        float e17 = com.p314xaae8f345.mm.ui.zk.e(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia) * i65.a.y(getContext());
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setTextSize(e17);
        int measureText = (int) paint2.measureText(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2968x9376332f);
        int b18 = b(e17);
        paint2.setColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        paint2.setAntiAlias(true);
        canvas.drawText(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2968x9376332f, this.f243569e - (measureText / 2), (this.f243571g - b18) - (bitmap.getHeight() / 3), paint2);
        float e18 = com.p314xaae8f345.mm.ui.zk.e(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia);
        i65.a.x(getContext());
        paint2.setTextSize(e18 * 1.0f);
        canvas.drawText(string, (this.f243569e + (this.f243572h * 1)) - (((int) paint2.measureText(string)) / 2), (this.f243571g - b(r2)) - (bitmap.getHeight() / 3), paint2);
        paint2.setTextSize(com.p314xaae8f345.mm.ui.zk.e(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia) * i65.a.v(getContext()));
        canvas.drawText(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2968x9376332f, (this.f243569e + (this.f243572h * (f243567w - 1))) - (((int) paint2.measureText(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2968x9376332f)) / 2), (this.f243571g - b(r1)) - (bitmap.getHeight() / 3), paint2);
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        a();
        java.util.List list = this.f243568d;
        ((java.util.ArrayList) list).clear();
        setClickable(true);
        this.f243569e = i65.a.b(getContext(), 30);
        this.f243570f = i65.a.b(getContext(), 10);
        int width = getWidth();
        this.f243571g = this.f243570f + (getHeight() / 2);
        f243567w = 8;
        this.f243572h = (width - (this.f243569e * 2)) / (8 - 1);
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) f243566v.get();
        if (bitmap == null) {
            a();
            bitmap = (android.graphics.Bitmap) f243566v.get();
        }
        for (int i28 = 0; i28 < f243567w; i28++) {
            w24.c cVar = new w24.c(null);
            cVar.f524141a = (this.f243569e + (this.f243572h * i28)) - (bitmap.getWidth() / 2);
            cVar.f524142b = this.f243571g - (bitmap.getHeight() / 2);
            cVar.f524143c = this.f243569e + (this.f243572h * i28) + (bitmap.getWidth() / 2);
            cVar.f524144d = this.f243571g + (bitmap.getHeight() / 2);
            ((java.util.ArrayList) list).add(cVar);
        }
        int i29 = this.f243579r;
        this.f243575n = i29;
        if (this.f243578q >= 0) {
            this.f243576o = ((w24.c) ((java.util.ArrayList) list).get(i29)).f524141a;
        } else if (this.f243576o <= ((w24.c) ((java.util.ArrayList) list).get(i29)).f524143c - (this.f243572h / 2)) {
            this.f243576o = ((w24.c) ((java.util.ArrayList) list).get(this.f243575n)).f524141a;
        } else {
            this.f243576o = ((w24.c) ((java.util.ArrayList) list).get(this.f243575n)).f524143c;
        }
        this.f243577p = ((w24.c) ((java.util.ArrayList) list).get(this.f243575n)).f524142b;
        invalidate();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        java.util.List list = this.f243568d;
        int i17 = 0;
        if (action == 0) {
            this.f243573i = motionEvent.getX();
            this.f243574m = motionEvent.getY();
            w24.c cVar = (w24.c) ((java.util.ArrayList) list).get(this.f243575n);
            float f17 = this.f243573i;
            if (f17 >= cVar.f524141a && f17 <= cVar.f524143c) {
                float f18 = this.f243574m;
                if (f18 >= cVar.f524142b && f18 <= cVar.f524144d) {
                    i17 = 1;
                }
            }
            if (i17 != 0) {
                this.f243581t = true;
                return true;
            }
            this.f243582u = true;
            return super.onTouchEvent(motionEvent);
        }
        if (action != 1) {
            if (action != 2) {
                return true;
            }
            if (!this.f243581t) {
                return super.onTouchEvent(motionEvent);
            }
            float x17 = motionEvent.getX();
            float y17 = motionEvent.getY();
            this.f243578q = (int) (x17 - this.f243573i);
            this.f243576o = (int) (x17 - this.f243569e);
            this.f243573i = x17;
            this.f243574m = y17;
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            w24.c cVar2 = (w24.c) arrayList.get(0);
            w24.c cVar3 = (w24.c) arrayList.get(f243567w - 1);
            int i18 = this.f243576o;
            int i19 = cVar2.f524141a;
            if (i18 > i19) {
                int i27 = cVar3.f524141a;
                if (i18 < i27) {
                    while (true) {
                        if (i17 >= f243567w) {
                            break;
                        }
                        w24.c cVar4 = (w24.c) arrayList.get(i17);
                        int i28 = this.f243576o;
                        if (i28 < cVar4.f524141a - 5 || i28 > cVar4.f524143c + 5) {
                            i17++;
                        } else {
                            this.f243575n = i17;
                            this.f243579r = i17;
                            w24.b bVar = this.f243580s;
                            if (bVar != null) {
                                ((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.wb) bVar).a(i17);
                            }
                        }
                    }
                } else {
                    this.f243576o = i27;
                }
            } else {
                this.f243576o = i19;
            }
            invalidate();
            return true;
        }
        if (!this.f243581t) {
            if (!this.f243582u) {
                return super.onTouchEvent(motionEvent);
            }
            float x18 = motionEvent.getX();
            float y18 = motionEvent.getY();
            if (java.lang.Math.abs(x18 - this.f243573i) <= 10.0f && java.lang.Math.abs(y18 - this.f243574m) <= 10.0f) {
                int i29 = 0;
                while (true) {
                    if (i29 >= f243567w) {
                        break;
                    }
                    int i37 = ((w24.c) ((java.util.ArrayList) list).get(i29)).f524141a;
                    if (x18 < i37 - 5 || x18 > r4.f524143c + 5) {
                        i29++;
                    } else {
                        this.f243575n = i29;
                        this.f243579r = i29;
                        this.f243576o = i37;
                        w24.b bVar2 = this.f243580s;
                        if (bVar2 != null) {
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.wb) bVar2).a(i29);
                        }
                    }
                }
            }
            this.f243582u = false;
            invalidate();
            return true;
        }
        int i38 = 0;
        while (true) {
            if (i38 >= f243567w - 1) {
                break;
            }
            java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
            w24.c cVar5 = (w24.c) arrayList2.get(i38);
            int i39 = i38 + 1;
            w24.c cVar6 = (w24.c) arrayList2.get(i39);
            int i47 = this.f243576o;
            int i48 = cVar5.f524141a;
            int i49 = this.f243572h / 2;
            if (i47 <= i49 + i48 && i47 >= i48) {
                this.f243575n = i38;
                this.f243576o = i48;
                break;
            }
            int i57 = cVar6.f524141a;
            if (i47 >= i57 - i49 && i47 <= i57) {
                this.f243575n = i39;
                this.f243576o = i57;
                break;
            }
            i38 = i39;
        }
        int i58 = this.f243575n;
        this.f243579r = i58;
        w24.b bVar3 = this.f243580s;
        if (bVar3 != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.wb) bVar3).a(i58);
        }
        invalidate();
        this.f243581t = false;
        return true;
    }

    /* renamed from: setOnChangeListener */
    public void m69110xb9da30c5(w24.b bVar) {
        this.f243580s = bVar;
    }

    /* renamed from: setSliderIndex */
    public void m69111x6b90deaf(int i17) {
        int min = java.lang.Math.min(7, java.lang.Math.max(0, i17));
        this.f243579r = min;
        w24.b bVar = this.f243580s;
        if (bVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.wb) bVar).a(min);
        }
    }

    public C17657x77c04133(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f243568d = new java.util.ArrayList(8);
        this.f243569e = 0;
        this.f243570f = 0;
        this.f243571g = 0;
        this.f243572h = 0;
        this.f243573i = 0.0f;
        this.f243574m = 0.0f;
        this.f243575n = 0;
        this.f243576o = 0;
        this.f243577p = 0;
        this.f243578q = 0;
        this.f243579r = 0;
        this.f243580s = null;
        this.f243581t = false;
        this.f243582u = false;
    }
}
