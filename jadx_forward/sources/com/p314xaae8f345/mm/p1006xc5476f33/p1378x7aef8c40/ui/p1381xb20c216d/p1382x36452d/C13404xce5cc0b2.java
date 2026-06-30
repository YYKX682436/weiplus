package com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.p1382x36452d;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fB\u001d\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\rJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/emojicapture/ui/editor/text/FontAnimTextView;", "Landroid/widget/ImageView;", "", "getText", "", "getTextColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emojicapture_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.emojicapture.ui.editor.text.FontAnimTextView */
/* loaded from: classes10.dex */
public final class C13404xce5cc0b2 extends android.widget.ImageView {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f180309r = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String[] f180310d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Typeface[] f180311e;

    /* renamed from: f, reason: collision with root package name */
    public int f180312f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Runnable f180313g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.CharSequence f180314h;

    /* renamed from: i, reason: collision with root package name */
    public final int f180315i;

    /* renamed from: m, reason: collision with root package name */
    public int f180316m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.Bitmap[] f180317n;

    /* renamed from: o, reason: collision with root package name */
    public final c32.e f180318o;

    /* renamed from: p, reason: collision with root package name */
    public int f180319p;

    /* renamed from: q, reason: collision with root package name */
    public int f180320q;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0099 A[LOOP:1: B:14:0x0097->B:15:0x0099, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C13404xce5cc0b2(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            c32.b r8 = new c32.b
            r8.<init>(r6)
            r6.f180313g = r8
            r8 = -1
            r6.f180319p = r8
            r6.f180320q = r8
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r7)
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2131166844(0x7f07067c, float:1.7947945E38)
            float r7 = r7.getDimension(r8)
            f11.j r8 = f11.j.b()
            boolean r8 = r8.a()
            r9 = 0
            r0 = 0
            r1 = 1
            if (r8 == 0) goto L72
            java.lang.String r8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d()
            java.lang.String r2 = "zh_TW"
            boolean r2 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r8, r2)
            if (r2 == 0) goto L39
            r8 = r1
            goto L40
        L39:
            java.lang.String r2 = "zh_HK"
            boolean r8 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r8, r2)
        L40:
            r8 = r8 ^ r1
            if (r8 == 0) goto L72
            f11.j r8 = f11.j.b()
            r8.getClass()
            java.lang.String r8 = f11.j.f340094d
            java.lang.String r1 = f11.j.f340093c
            java.lang.String[] r8 = new java.lang.String[]{r8, r1}
            r6.f180310d = r8
            c32.d r1 = new c32.d
            int r7 = (int) r7
            r1.<init>(r8, r7)
            r6.f180318o = r1
            r7 = 2
            android.graphics.Typeface[] r8 = new android.graphics.Typeface[r7]
            r1 = r0
        L60:
            if (r1 >= r7) goto L6f
            java.lang.String[] r2 = r6.f180310d
            r2 = r2[r1]
            android.graphics.Typeface r2 = android.graphics.Typeface.createFromFile(r2)
            r8[r1] = r2
            int r1 = r1 + 1
            goto L60
        L6f:
            r6.f180311e = r8
            goto L90
        L72:
            java.lang.String r7 = ""
            java.lang.String[] r7 = new java.lang.String[]{r7}
            r6.f180310d = r7
            com.tencent.mm.plugin.report.service.g0 r7 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE
            r2 = 933(0x3a5, double:4.61E-321)
            r4 = 3
            r7.B(r2, r4)
            c32.a r7 = new c32.a
            r7.<init>()
            r6.f180318o = r7
            android.graphics.Typeface[] r7 = new android.graphics.Typeface[r1]
            r7[r0] = r9
            r6.f180311e = r7
        L90:
            android.graphics.Typeface[] r7 = r6.f180311e
            int r7 = r7.length
            r6.f180315i = r7
            android.graphics.Bitmap[] r8 = new android.graphics.Bitmap[r7]
        L97:
            if (r0 >= r7) goto L9e
            r8[r0] = r9
            int r0 = r0 + 1
            goto L97
        L9e:
            r6.f180317n = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.p1382x36452d.C13404xce5cc0b2.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if ((r0.length() > 0) == true) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r9 = this;
            java.lang.CharSequence r0 = r9.f180314h
            r1 = 0
            if (r0 == 0) goto L12
            int r0 = r0.length()
            r2 = 1
            if (r0 <= 0) goto Le
            r0 = r2
            goto Lf
        Le:
            r0 = r1
        Lf:
            if (r0 != r2) goto L12
            goto L13
        L12:
            r2 = r1
        L13:
            if (r2 == 0) goto L27
            android.graphics.Bitmap[] r3 = r9.f180317n
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            kz5.v.u(r3, r4, r5, r6, r7, r8)
            r9.f180316m = r1
            r9.f180312f = r1
            r9.b()
            goto L30
        L27:
            java.lang.Runnable r0 = r9.f180313g
            r9.removeCallbacks(r0)
            r0 = 0
            r9.setImageBitmap(r0)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.p1382x36452d.C13404xce5cc0b2.a():void");
    }

    public final void b() {
        int i17 = this.f180316m + 1;
        this.f180316m = i17;
        this.f180316m = i17 % this.f180315i;
        int i18 = this.f180312f;
        android.graphics.Typeface[] typefaceArr = this.f180311e;
        android.graphics.Typeface typeface = typefaceArr[i18];
        java.lang.String str = this.f180310d[i18];
        c32.e eVar = this.f180318o;
        eVar.b(str);
        int i19 = this.f180312f + 1;
        this.f180312f = i19;
        this.f180312f = i19 % typefaceArr.length;
        int i27 = this.f180316m;
        android.graphics.Bitmap[] bitmapArr = this.f180317n;
        if (bitmapArr[i27] == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13402x98569b01 c13402x98569b01 = new com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13402x98569b01(getContext(), null);
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            c13402x98569b01.m54958x8e6ff544(width);
            c13402x98569b01.m54959x7109da80(eVar);
            c13402x98569b01.m54960x4e4ad719(typeface);
            c13402x98569b01.b(this.f180314h, this.f180319p, this.f180320q, true);
            c13402x98569b01.measure(android.view.View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), 0);
            int measuredWidth = c13402x98569b01.getMeasuredWidth();
            int measuredHeight = c13402x98569b01.getMeasuredHeight();
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(measuredHeight));
            arrayList.add(java.lang.Integer.valueOf(measuredWidth));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/emojicapture/ui/editor/text/FontAnimTextView", "createTextBitmap", "(Landroid/graphics/Typeface;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/emojicapture/ui/editor/text/FontAnimTextView", "createTextBitmap", "(Landroid/graphics/Typeface;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
            android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
            canvas.save();
            c13402x98569b01.draw(canvas);
            canvas.restore();
            bitmapArr[this.f180316m] = createBitmap;
        }
        java.lang.Runnable runnable = this.f180313g;
        removeCallbacks(runnable);
        postDelayed(runnable, 100L);
        setImageBitmap(bitmapArr[this.f180316m]);
    }

    public final void c(java.lang.CharSequence charSequence, int i17, int i18) {
        this.f180314h = charSequence;
        this.f180319p = i17;
        this.f180320q = i18;
        a();
    }

    /* renamed from: getText, reason: from getter */
    public final java.lang.CharSequence getF180314h() {
        return this.f180314h;
    }

    /* renamed from: getTextColor, reason: from getter */
    public final int getF180319p() {
        return this.f180319p;
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        if (i17 != i19) {
            a();
        }
    }

    public C13404xce5cc0b2(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
