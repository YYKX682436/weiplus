package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5;

/* renamed from: com.tencent.mm.plugin.scanner.view.ScanProductDetectRectView */
/* loaded from: classes3.dex */
public class C17346xe5e5429e extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Rect f241434d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f241435e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Bitmap f241436f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Bitmap f241437g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Bitmap f241438h;

    /* renamed from: i, reason: collision with root package name */
    public int f241439i;

    /* renamed from: m, reason: collision with root package name */
    public int f241440m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.Paint f241441n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Paint f241442o;

    public C17346xe5e5429e(android.content.Context context) {
        super(context);
        this.f241435e = null;
        this.f241436f = null;
        this.f241437g = null;
        this.f241438h = null;
        this.f241439i = 0;
        this.f241440m = 0;
        this.f241441n = new android.graphics.Paint();
        this.f241442o = new android.graphics.Paint();
        a();
    }

    public final void a() {
        android.content.res.Resources resources = getResources();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.cel));
        arrayList.add(resources);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/scanner/view/ScanProductDetectRectView", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/scanner/view/ScanProductDetectRectView", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        this.f241435e = decodeResource;
        android.content.res.Resources resources2 = getResources();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.cen));
        arrayList2.add(resources2);
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/view/ScanProductDetectRectView", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource2 = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList2.get(0), ((java.lang.Integer) arrayList2.get(1)).intValue());
        yj0.a.e(obj2, decodeResource2, "com/tencent/mm/plugin/scanner/view/ScanProductDetectRectView", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        this.f241436f = decodeResource2;
        android.content.res.Resources resources3 = getResources();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.cek));
        arrayList3.add(resources3);
        java.lang.Object obj3 = new java.lang.Object();
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(obj3, arrayList3.toArray(), "com/tencent/mm/plugin/scanner/view/ScanProductDetectRectView", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource3 = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList3.get(0), ((java.lang.Integer) arrayList3.get(1)).intValue());
        yj0.a.e(obj3, decodeResource3, "com/tencent/mm/plugin/scanner/view/ScanProductDetectRectView", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        this.f241437g = decodeResource3;
        android.content.res.Resources resources4 = getResources();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.cem));
        arrayList4.add(resources4);
        java.lang.Object obj4 = new java.lang.Object();
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(obj4, arrayList4.toArray(), "com/tencent/mm/plugin/scanner/view/ScanProductDetectRectView", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource4 = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList4.get(0), ((java.lang.Integer) arrayList4.get(1)).intValue());
        yj0.a.e(obj4, decodeResource4, "com/tencent/mm/plugin/scanner/view/ScanProductDetectRectView", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        this.f241438h = decodeResource4;
        this.f241439i = this.f241435e.getWidth();
        this.f241440m = this.f241435e.getHeight();
        this.f241441n.setAntiAlias(true);
        this.f241442o.setAntiAlias(true);
    }

    /* renamed from: getRect */
    public android.graphics.Rect m68911xfb84c25a() {
        return new android.graphics.Rect(this.f241434d);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.clipRect(this.f241434d, android.graphics.Region.Op.DIFFERENCE);
        canvas.drawRect(this.f241434d, this.f241441n);
        canvas.restore();
        android.graphics.Bitmap bitmap = this.f241435e;
        android.graphics.Rect rect = this.f241434d;
        float f17 = rect.left;
        float f18 = rect.top;
        android.graphics.Paint paint = this.f241442o;
        canvas.drawBitmap(bitmap, f17, f18, paint);
        android.graphics.Bitmap bitmap2 = this.f241436f;
        android.graphics.Rect rect2 = this.f241434d;
        canvas.drawBitmap(bitmap2, rect2.right - this.f241439i, rect2.top, paint);
        android.graphics.Bitmap bitmap3 = this.f241437g;
        android.graphics.Rect rect3 = this.f241434d;
        canvas.drawBitmap(bitmap3, rect3.left, rect3.bottom - this.f241440m, paint);
        android.graphics.Bitmap bitmap4 = this.f241438h;
        android.graphics.Rect rect4 = this.f241434d;
        canvas.drawBitmap(bitmap4, rect4.right - this.f241439i, rect4.bottom - this.f241440m, paint);
    }

    /* renamed from: setRect */
    public void m68912x764f8966(android.graphics.Rect rect) {
        this.f241434d = rect;
    }

    public C17346xe5e5429e(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f241435e = null;
        this.f241436f = null;
        this.f241437g = null;
        this.f241438h = null;
        this.f241439i = 0;
        this.f241440m = 0;
        this.f241441n = new android.graphics.Paint();
        this.f241442o = new android.graphics.Paint();
        a();
    }

    public C17346xe5e5429e(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f241435e = null;
        this.f241436f = null;
        this.f241437g = null;
        this.f241438h = null;
        this.f241439i = 0;
        this.f241440m = 0;
        this.f241441n = new android.graphics.Paint();
        this.f241442o = new android.graphics.Paint();
        a();
    }
}
