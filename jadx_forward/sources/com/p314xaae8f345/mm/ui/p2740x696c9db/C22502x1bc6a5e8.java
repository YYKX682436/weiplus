package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* renamed from: com.tencent.mm.ui.tools.FilterImageView */
/* loaded from: classes15.dex */
public class C22502x1bc6a5e8 extends android.widget.LinearLayout {

    /* renamed from: r, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2740x696c9db.n3[] f291574r = {new com.p314xaae8f345.mm.ui.p2740x696c9db.n3(new com.p314xaae8f345.mm.ui.p2740x696c9db.m3("原图", "原圖", "Normal"), "icon.png", 0, 0, "MatteOrigin.jpg", 0), new com.p314xaae8f345.mm.ui.p2740x696c9db.n3(new com.p314xaae8f345.mm.ui.p2740x696c9db.m3("LOMO", "LOMO", "LOMO"), "nuowei_mask%02d.jpg", 2, 1, "0004.jpg", 2), new com.p314xaae8f345.mm.ui.p2740x696c9db.n3(new com.p314xaae8f345.mm.ui.p2740x696c9db.m3("麦田", "麥田", "Wheat"), "0062_%02d.jpg", 2, 2, "0062.jpg", 20), new com.p314xaae8f345.mm.ui.p2740x696c9db.n3(new com.p314xaae8f345.mm.ui.p2740x696c9db.m3("玻璃镜", "玻璃鏡", "Glossy"), "habi_mask%02d.jpg", 1, 3, "0005.jpg", 4), new com.p314xaae8f345.mm.ui.p2740x696c9db.n3(new com.p314xaae8f345.mm.ui.p2740x696c9db.m3("拍立得", "拍立得", "Polaroid"), "0063_%02d.jpg", 2, 4, "0063.jpg", 21), new com.p314xaae8f345.mm.ui.p2740x696c9db.n3(new com.p314xaae8f345.mm.ui.p2740x696c9db.m3("湖水", "湖水", "Lake"), "0061_%02d.jpg", 1, 5, "0061.jpg", 19), new com.p314xaae8f345.mm.ui.p2740x696c9db.n3(new com.p314xaae8f345.mm.ui.p2740x696c9db.m3("黄昏", "黃昏", "Twilight"), "0030_mask%01d.jpg", 1, 6, "0030.jpg", 7), new com.p314xaae8f345.mm.ui.p2740x696c9db.n3(new com.p314xaae8f345.mm.ui.p2740x696c9db.m3("黑白", "黑白", "B&W"), "0065_%02d.jpg", 1, 7, "0065.jpg", 22), new com.p314xaae8f345.mm.ui.p2740x696c9db.n3(new com.p314xaae8f345.mm.ui.p2740x696c9db.m3("铜版画", "銅版畫", "Aquatint"), "0032_mask%01d.jpg", 1, 8, "0032.jpg", 9), new com.p314xaae8f345.mm.ui.p2740x696c9db.n3(new com.p314xaae8f345.mm.ui.p2740x696c9db.m3("圆珠笔", "圓珠筆", "Pen"), "0035_mask%01d.jpg", 1, 9, "0035.jpg", 18), new com.p314xaae8f345.mm.ui.p2740x696c9db.n3(new com.p314xaae8f345.mm.ui.p2740x696c9db.m3("海报", "海報", "Poster"), "0036_mask%01d.jpg", 0, 10, "0036.jpg", 17), new com.p314xaae8f345.mm.ui.p2740x696c9db.n3(new com.p314xaae8f345.mm.ui.p2740x696c9db.m3("素描", "素描", "Portrait"), "icon.jpg", 0, 11, "0040.jpg", 12)};

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f291575d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f291576e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f291577f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f291578g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.C22500x8bcca9d0 f291579h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Bitmap f291580i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21500x7be515c9 f291581m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.l3 f291582n;

    /* renamed from: o, reason: collision with root package name */
    public int f291583o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Runnable f291584p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.Runnable f291585q;

    public C22502x1bc6a5e8(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f291583o = 0;
        android.app.Activity activity = (android.app.Activity) context;
        this.f291575d = activity;
        android.view.View inflate = android.view.View.inflate(activity, com.p314xaae8f345.mm.R.C30864xbddafb2a.a3a, this);
        this.f291579h = (com.p314xaae8f345.mm.ui.p2740x696c9db.C22500x8bcca9d0) inflate.findViewById(com.p314xaae8f345.mm.R.id.cn6);
        this.f291578g = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.cne);
        this.f291577f = inflate.findViewById(com.p314xaae8f345.mm.R.id.cn_);
        this.f291579h.setOnTouchListener(null);
        this.f291581m = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21500x7be515c9) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565524cn3);
        com.p314xaae8f345.mm.ui.p2740x696c9db.l3 l3Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.l3(this);
        this.f291582n = l3Var;
        this.f291581m.setAdapter((android.widget.ListAdapter) l3Var);
        this.f291581m.invalidate();
        this.f291581m.setOnItemClickListener(new com.p314xaae8f345.mm.ui.p2740x696c9db.j3(this));
    }

    public static boolean a(com.p314xaae8f345.mm.ui.p2740x696c9db.C22502x1bc6a5e8 c22502x1bc6a5e8, java.lang.String str, int i17, int i18) {
        if (i18 == 0) {
            android.graphics.Bitmap bitmap = c22502x1bc6a5e8.f291580i;
            bitmap.setPixels(c22502x1bc6a5e8.f291576e, 0, bitmap.getWidth(), 0, 0, c22502x1bc6a5e8.f291580i.getWidth(), c22502x1bc6a5e8.f291580i.getHeight());
            c22502x1bc6a5e8.f291579h.invalidate();
            return true;
        }
        int width = c22502x1bc6a5e8.f291580i.getWidth() * c22502x1bc6a5e8.f291580i.getHeight();
        int[][] iArr = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, i17, width);
        for (int i19 = 0; i19 < i17; i19++) {
            java.lang.String format = java.lang.String.format(str, java.lang.Integer.valueOf(i19));
            java.io.InputStream inputStream = null;
            try {
                try {
                    inputStream = c22502x1bc6a5e8.f291575d.getAssets().open("filter/" + format);
                    byte[] bArr = new byte[width];
                    inputStream.read(bArr);
                    android.graphics.Bitmap G = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.G(bArr);
                    inputStream.close();
                    inputStream.close();
                    if (G != null) {
                        android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(G, c22502x1bc6a5e8.f291580i.getWidth(), c22502x1bc6a5e8.f291580i.getHeight(), true);
                        if (G != createScaledBitmap) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FilterView", "recycle bitmap:%s", G.toString());
                            G.recycle();
                        }
                        if (createScaledBitmap != null) {
                            createScaledBitmap.getPixels(iArr[i19], 0, createScaledBitmap.getWidth(), 0, 0, createScaledBitmap.getWidth(), createScaledBitmap.getHeight());
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FilterView", "recycle bitmap:%s", createScaledBitmap.toString());
                            createScaledBitmap.recycle();
                        }
                    }
                    return false;
                } catch (java.lang.Exception e17) {
                    throw e17;
                }
            } catch (java.lang.Throwable th6) {
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p2493x1bc889d6.C19768x79419c1a c19768x79419c1a = new com.p314xaae8f345.mm.p2493x1bc889d6.C19768x79419c1a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FilterView", "src.len:" + c22502x1bc6a5e8.f291576e.length);
        for (int i27 = 0; i27 < iArr.length; i27++) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FilterView", "mask[" + i27 + "].len:" + iArr[i27].length);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FilterView", "before filter");
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22503x487350fb.m81086x42e92137(i18, c22502x1bc6a5e8.f291576e, iArr, i17, c22502x1bc6a5e8.f291580i.getWidth(), c22502x1bc6a5e8.f291580i.getHeight(), c19768x79419c1a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FilterView", "after filter");
        android.graphics.Bitmap bitmap2 = c22502x1bc6a5e8.f291580i;
        bitmap2.setPixels(c19768x79419c1a.f38865x6ac9171, 0, bitmap2.getWidth(), 0, 0, c22502x1bc6a5e8.f291580i.getWidth(), c22502x1bc6a5e8.f291580i.getHeight());
        c22502x1bc6a5e8.f291579h.invalidate();
        return true;
    }

    public void b(java.lang.String str, int i17) {
        int i18 = i17 % 180;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FilterView", "filePath before fiterBmp:" + str);
        android.graphics.Bitmap bitmap = this.f291580i;
        if (bitmap == null || bitmap.isRecycled()) {
            this.f291580i = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.T(str, 480, 480, false), i17);
        }
        this.f291580i.getWidth();
        this.f291580i.getHeight();
        int[] iArr = new int[this.f291580i.getWidth() * this.f291580i.getHeight()];
        this.f291576e = iArr;
        android.graphics.Bitmap bitmap2 = this.f291580i;
        bitmap2.getPixels(iArr, 0, bitmap2.getWidth(), 0, 0, this.f291580i.getWidth(), this.f291580i.getHeight());
        this.f291579h.setImageBitmap(this.f291580i);
    }

    /* renamed from: getCropAreaView */
    public android.view.View m81075x12d191f8() {
        return this.f291577f;
    }

    /* renamed from: getCropImageIV */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.C22500x8bcca9d0 m81076xc859e9e2() {
        return this.f291579h;
    }

    /* renamed from: getFilterBmp */
    public android.graphics.Bitmap m81077xcae45837() {
        return this.f291580i;
    }

    /* renamed from: getFilterId */
    public int m81078x50de1429() {
        return this.f291583o;
    }

    /* renamed from: setCropMaskBackground */
    public void m81079xdffe2fec(int i17) {
        android.widget.ImageView imageView = this.f291578g;
        if (imageView != null) {
            imageView.setBackgroundResource(i17);
        }
    }

    /* renamed from: setCropMaskVisible */
    public void m81080x15e23e74(int i17) {
        android.widget.ImageView imageView = this.f291578g;
        if (imageView != null) {
            imageView.setVisibility(i17);
        }
    }

    /* renamed from: setImage */
    public void m81081x53266a19(android.graphics.Bitmap bitmap) {
        this.f291580i = bitmap;
    }

    /* renamed from: setLimitZoomIn */
    public void m81082xc78c7e31(boolean z17) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22500x8bcca9d0 c22500x8bcca9d0 = this.f291579h;
        if (c22500x8bcca9d0 != null) {
            c22500x8bcca9d0.m81072xc78c7e31(z17);
        }
    }

    /* renamed from: setMatrix */
    public void m81083x17d9eec3(android.graphics.Matrix matrix) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22500x8bcca9d0 c22500x8bcca9d0 = this.f291579h;
        if (c22500x8bcca9d0 != null) {
            c22500x8bcca9d0.setImageMatrix(matrix);
        }
    }

    /* renamed from: setOnConfirmImp */
    public void m81084x908eadad(java.lang.Runnable runnable) {
        this.f291584p = runnable;
    }

    /* renamed from: setOnExitImp */
    public void m81085x5cff9cad(java.lang.Runnable runnable) {
        this.f291585q = runnable;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        if (i17 == 0) {
            this.f291582n.notifyDataSetChanged();
            this.f291581m.invalidate();
        }
        super.setVisibility(i17);
    }
}
