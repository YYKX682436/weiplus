package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2TabView */
/* loaded from: classes11.dex */
public class C13353xcecbd7a3 extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f179851d;

    /* renamed from: e, reason: collision with root package name */
    public int f179852e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Bitmap f179853f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f179854g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f179855h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Matrix f179856i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.C21407xddef161a f179857m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.C21407xddef161a f179858n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.h0 f179859o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View.OnClickListener f179860p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f179861q;

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2TabView$2, reason: invalid class name */
    /* loaded from: classes11.dex */
    public class AnonymousClass2 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5323x54b61078> {
        public AnonymousClass2(p012xc85e97e9.p093xedfae76a.y yVar) {
            super(yVar);
            this.f39173x3fe91575 = -1836181400;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5323x54b61078 c5323x54b61078) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.g0(this));
            return false;
        }
    }

    public C13353xcecbd7a3(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f179852e = 0;
        this.f179856i = new android.graphics.Matrix();
        this.f179860p = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.f0(this);
        this.f179861q = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.C13353xcecbd7a3.AnonymousClass2(com.p314xaae8f345.mm.app.a0.f134821d);
        a();
    }

    public final void a() {
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        this.f179854g = linearLayout;
        linearLayout.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw);
        this.f179854g.setId(com.p314xaae8f345.mm.R.id.deh);
        this.f179854g.setOrientation(0);
        addView(this.f179854g, new android.widget.RelativeLayout.LayoutParams(-1, -2));
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        this.f179855h = imageView;
        imageView.setImageMatrix(this.f179856i);
        this.f179855h.setScaleType(android.widget.ImageView.ScaleType.MATRIX);
        this.f179855h.setId(com.p314xaae8f345.mm.R.id.dei);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, i65.a.b(getContext(), 3));
        layoutParams.addRule(8, com.p314xaae8f345.mm.R.id.deh);
        addView(this.f179855h, layoutParams);
        com.p314xaae8f345.mm.ui.C21407xddef161a c21407xddef161a = new com.p314xaae8f345.mm.ui.C21407xddef161a(getContext(), 0);
        c21407xddef161a.setTag(0);
        android.view.View.OnClickListener onClickListener = this.f179860p;
        c21407xddef161a.setOnClickListener(onClickListener);
        this.f179857m = c21407xddef161a;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.o.a().f179122e)) {
            this.f179857m.m78773x765074af(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.o.a().f179122e);
        } else if (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.o.a().f179121d) {
            this.f179857m.m78772x765074af(com.p314xaae8f345.mm.R.C30867xcad56011.byx);
        } else {
            this.f179857m.m78772x765074af(com.p314xaae8f345.mm.R.C30867xcad56011.byw);
        }
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.aci));
        layoutParams2.weight = 1.0f;
        this.f179854g.addView(this.f179857m, layoutParams2);
        com.p314xaae8f345.mm.ui.C21407xddef161a c21407xddef161a2 = new com.p314xaae8f345.mm.ui.C21407xddef161a(getContext(), 1);
        c21407xddef161a2.setTag(1);
        c21407xddef161a2.setOnClickListener(onClickListener);
        this.f179858n = c21407xddef161a2;
        c21407xddef161a2.m78772x765074af(com.p314xaae8f345.mm.R.C30867xcad56011.f572644bz2);
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.aci));
        layoutParams3.weight = 1.0f;
        this.f179854g.addView(this.f179858n, layoutParams3);
    }

    /* renamed from: getCurentIndex */
    public int m54837x9b4013b1() {
        return this.f179852e;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        int i28 = (i19 - i17) / 2;
        this.f179851d = i28;
        android.graphics.Bitmap bitmap = this.f179853f;
        if ((bitmap == null || bitmap.getWidth() != i28) && i28 > 0) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            android.graphics.Bitmap bitmap2 = this.f179853f;
            objArr[0] = java.lang.Integer.valueOf(bitmap2 == null ? -1 : bitmap2.getWidth());
            objArr[1] = java.lang.Integer.valueOf(i28);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiStoreV2TabView", "sharp width changed, from %d to %d", objArr);
            int b17 = i65.a.b(getContext(), 3);
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(b17));
            arrayList.add(java.lang.Integer.valueOf(i28));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2TabView", "initSharpBarBitmap", "(I)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2TabView", "initSharpBarBitmap", "(I)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            this.f179853f = createBitmap;
            new android.graphics.Canvas(this.f179853f).drawColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaq));
            android.graphics.Matrix matrix = this.f179856i;
            matrix.setTranslate(this.f179851d * (this.f179852e + 0.0f), 0.0f);
            this.f179855h.setImageMatrix(matrix);
            this.f179855h.setImageBitmap(this.f179853f);
        }
        m54840x684367d(this.f179852e);
    }

    /* renamed from: setOnTabClickListener */
    public void m54838x97cfa8c8(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.h0 h0Var) {
        this.f179859o = h0Var;
    }

    /* renamed from: setPersonTabUnReadCount */
    public void m54839xdc6425e2(java.lang.String str) {
        com.p314xaae8f345.mm.ui.C21407xddef161a c21407xddef161a = this.f179858n;
        if (c21407xddef161a != null) {
            c21407xddef161a.m78775x2636cab1(str);
        }
    }

    /* renamed from: setTo */
    public void m54840x684367d(int i17) {
        this.f179852e = i17;
        this.f179857m.m78774x1c5c5ff4(i17 == 0 ? getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaq) : getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        this.f179858n.m78774x1c5c5ff4(this.f179852e == 1 ? getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaq) : getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
    }

    public C13353xcecbd7a3(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f179852e = 0;
        this.f179856i = new android.graphics.Matrix();
        this.f179860p = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.f0(this);
        this.f179861q = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.C13353xcecbd7a3.AnonymousClass2(com.p314xaae8f345.mm.app.a0.f134821d);
        a();
    }
}
