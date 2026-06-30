package com.p314xaae8f345.mm.ui;

/* renamed from: com.tencent.mm.ui.DoubleTabView */
/* loaded from: classes11.dex */
public class C21354xd0cc2aa9 extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f278165d;

    /* renamed from: e, reason: collision with root package name */
    public int f278166e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Bitmap f278167f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f278168g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f278169h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Matrix f278170i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.C21407xddef161a f278171m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.C21407xddef161a f278172n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f278173o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f278174p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.q3 f278175q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View.OnClickListener f278176r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f278177s;

    public C21354xd0cc2aa9(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f278166e = 0;
        this.f278170i = new android.graphics.Matrix();
        this.f278176r = new com.p314xaae8f345.mm.ui.p3(this);
        this.f278177s = false;
        a();
    }

    public final void a() {
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        this.f278168g = linearLayout;
        linearLayout.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw);
        this.f278168g.setId(com.p314xaae8f345.mm.R.id.d2k);
        this.f278168g.setOrientation(0);
        addView(this.f278168g, new android.widget.RelativeLayout.LayoutParams(-1, -2));
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        this.f278169h = imageView;
        imageView.setImageMatrix(this.f278170i);
        this.f278169h.setScaleType(android.widget.ImageView.ScaleType.MATRIX);
        this.f278169h.setId(com.p314xaae8f345.mm.R.id.d2l);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, i65.a.b(getContext(), 3));
        layoutParams.addRule(8, com.p314xaae8f345.mm.R.id.d2k);
        addView(this.f278169h, layoutParams);
        com.p314xaae8f345.mm.ui.C21407xddef161a c21407xddef161a = new com.p314xaae8f345.mm.ui.C21407xddef161a(getContext(), 0);
        c21407xddef161a.setTag(0);
        android.view.View.OnClickListener onClickListener = this.f278176r;
        c21407xddef161a.setOnClickListener(onClickListener);
        this.f278171m = c21407xddef161a;
        c21407xddef161a.m78773x765074af(this.f278173o);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.aci));
        layoutParams2.weight = 1.0f;
        this.f278168g.addView(this.f278171m, layoutParams2);
        com.p314xaae8f345.mm.ui.C21407xddef161a c21407xddef161a2 = new com.p314xaae8f345.mm.ui.C21407xddef161a(getContext(), 1);
        c21407xddef161a2.setTag(1);
        c21407xddef161a2.setOnClickListener(onClickListener);
        this.f278172n = c21407xddef161a2;
        c21407xddef161a2.m78773x765074af(this.f278174p);
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.aci));
        layoutParams3.weight = 1.0f;
        this.f278168g.addView(this.f278172n, layoutParams3);
    }

    /* renamed from: getCurentIndex */
    public int m78373x9b4013b1() {
        return this.f278166e;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        int i28 = (i19 - i17) / 2;
        this.f278165d = i28;
        android.graphics.Bitmap bitmap = this.f278167f;
        if (bitmap == null || bitmap.getWidth() != i28) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            android.graphics.Bitmap bitmap2 = this.f278167f;
            objArr[0] = java.lang.Integer.valueOf(bitmap2 == null ? -1 : bitmap2.getWidth());
            objArr[1] = java.lang.Integer.valueOf(i28);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.DoubleTabView", "sharp width changed, from %d to %d", objArr);
            int b17 = i65.a.b(getContext(), 3);
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(b17));
            arrayList.add(java.lang.Integer.valueOf(i28));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/DoubleTabView", "initSharpBarBitmap", "(I)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/ui/DoubleTabView", "initSharpBarBitmap", "(I)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            this.f278167f = createBitmap;
            new android.graphics.Canvas(this.f278167f).drawColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaq));
            android.graphics.Matrix matrix = this.f278170i;
            matrix.setTranslate(this.f278165d * (this.f278166e + 0.0f), 0.0f);
            this.f278169h.setImageMatrix(matrix);
            this.f278169h.setImageBitmap(this.f278167f);
        }
        m78380x684367d(this.f278166e);
    }

    /* renamed from: setFirstTabString */
    public void m78374x60ecd038(java.lang.String str) {
        this.f278173o = str;
        this.f278171m.m78773x765074af(str);
        this.f278171m.setContentDescription(str + "，" + getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.igy));
        requestLayout();
    }

    /* renamed from: setFirstTabUnReadCount */
    public void m78375x393792b9(java.lang.String str) {
        com.p314xaae8f345.mm.ui.C21407xddef161a c21407xddef161a = this.f278171m;
        if (c21407xddef161a != null) {
            c21407xddef161a.m78775x2636cab1(str);
        }
    }

    /* renamed from: setOnTabClickListener */
    public void m78376x97cfa8c8(com.p314xaae8f345.mm.ui.q3 q3Var) {
        this.f278175q = q3Var;
    }

    /* renamed from: setSecondTabString */
    public void m78377x66145130(java.lang.String str) {
        this.f278174p = str;
        this.f278172n.m78773x765074af(str);
        this.f278172n.setContentDescription(str + "，" + getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.igy));
        requestLayout();
    }

    /* renamed from: setSecondTabUnReadCount */
    public void m78378x67f1ecc1(java.lang.String str) {
        com.p314xaae8f345.mm.ui.C21407xddef161a c21407xddef161a = this.f278172n;
        if (c21407xddef161a != null) {
            c21407xddef161a.m78775x2636cab1(str);
        }
    }

    /* renamed from: setThirdTabString */
    public void m78379xadd03b61(java.lang.String str) {
        throw null;
    }

    /* renamed from: setTo */
    public void m78380x684367d(int i17) {
        this.f278166e = i17;
        this.f278171m.m78774x1c5c5ff4(i17 == 0 ? getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaq) : getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        this.f278172n.m78774x1c5c5ff4(this.f278166e == 1 ? getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaq) : getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
    }

    public C21354xd0cc2aa9(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f278166e = 0;
        this.f278170i = new android.graphics.Matrix();
        this.f278176r = new com.p314xaae8f345.mm.ui.p3(this);
        this.f278177s = false;
        a();
    }
}
