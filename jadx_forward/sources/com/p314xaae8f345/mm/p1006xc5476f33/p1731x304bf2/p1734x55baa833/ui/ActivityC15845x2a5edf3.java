package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui;

@db5.a(m123858x6ac9171 = 3)
@gm0.a2
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.game.chatroom.ui.GameImagePreviewUI */
/* loaded from: classes12.dex */
public class ActivityC15845x2a5edf3 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f220351q = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.view.GestureDetector f220352d;

    /* renamed from: e, reason: collision with root package name */
    public x33.e f220353e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f220354f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f220355g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f220356h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f220357i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f220358m = true;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f220359n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f220360o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f220361p;

    public final android.graphics.Bitmap T6(java.lang.String str) {
        if (str == null) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameImagePreviewUI", str);
        android.graphics.Bitmap e17 = n11.a.b().e(str + "_" + com.p314xaae8f345.mm.vfs.w6.k(str));
        if (e17 != null && !e17.isRecycled()) {
            return e17;
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(options);
        arrayList.add(str);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/ui/GameImagePreviewUI", "extractBitmap", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeFile = android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0), (android.graphics.BitmapFactory.Options) arrayList.get(1));
        yj0.a.e(obj, decodeFile, "com/tencent/mm/plugin/game/chatroom/ui/GameImagePreviewUI", "extractBitmap", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameImagePreviewUI", java.lang.String.valueOf(options.outWidth) + ", " + java.lang.String.valueOf(options.outHeight));
        if (decodeFile != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameImagePreviewUI", "recycle bitmap:%s", decodeFile.toString());
            decodeFile.recycle();
        }
        android.graphics.Bitmap i07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.i0(str);
        if (i07 == null && com.p314xaae8f345.mm.sdk.p2603x2137b148.C20996x490c1edf.m77704x21a6596e(str) && com.p314xaae8f345.mm.sdk.p2603x2137b148.C20996x490c1edf.m77709xef66a801(str)) {
            i07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.C20996x490c1edf.m77707x6317a40f(str);
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(i07 == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameImagePreviewUI", "Progressive jpeg, result isNull:%b", objArr);
        }
        if (i07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameImagePreviewUI", "getSuitableBmp fail, temBmp is null, filePath = ".concat(str));
            return null;
        }
        n11.a.b().o(str + "_" + com.p314xaae8f345.mm.vfs.w6.k(str), i07);
        return i07;
    }

    public final void U6(java.lang.String str, boolean z17) {
        android.graphics.Bitmap bitmap;
        boolean z18;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        try {
            this.f220353e.f533166d.setVisibility(8);
            this.f220353e.f533164b.setVisibility(8);
            this.f220353e.f533167e.setVisibility(8);
            this.f220353e.f533165c.setVisibility(8);
            int i17 = 1;
            if (rq5.a.d(str)) {
                bitmap = null;
                z18 = true;
            } else {
                bitmap = T6(str);
                z18 = false;
            }
            if (!((bitmap == null || bitmap.isRecycled() || (bitmap.getWidth() <= 1024 && bitmap.getHeight() <= 1024)) ? false : true) && com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.c(str)) {
                try {
                    this.f220353e.f533164b.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
                    this.f220353e.f533164b.setVisibility(0);
                    this.f220353e.f533164b.m64938x75cc54fa(str);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GameImagePreviewUI", e17, "", new java.lang.Object[0]);
                    this.f220353e.f533164b.setVisibility(0);
                    this.f220353e.f533164b.setImageBitmap(bitmap);
                }
            } else if (bitmap != null && !bitmap.isRecycled()) {
                this.f220353e.f533164b.setVisibility(8);
                com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a = this.f220353e.f533165c;
                c21524xecd57b9a.setEnabled(true);
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.l1.f274350a;
                int i18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.u1.f274536a.f274566a;
                if (width < i18 && height < i18) {
                    i17 = 0;
                }
                if (c21524xecd57b9a.getLayerType() != i17) {
                    c21524xecd57b9a.setLayerType(i17, null);
                }
                c21524xecd57b9a.m79195x464b3146(false);
                int width2 = bitmap.getWidth();
                int height2 = bitmap.getHeight();
                c21524xecd57b9a.f279184o = width2;
                c21524xecd57b9a.f279185p = height2;
                c21524xecd57b9a.setImageBitmap(bitmap);
                c21524xecd57b9a.setVisibility(0);
            } else if (!z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameImagePreviewUI", "load image failed");
            } else if (this.f220353e.f533167e.getVisibility() == 8) {
                V6(this.f220353e.f533167e, str);
            }
            if (z17) {
                return;
            }
            this.f220360o = str;
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameImagePreviewUI", "Catch Exception");
        }
    }

    public final void V6(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f c21537x5f41189f, java.lang.String str) {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        android.graphics.Bitmap d17 = com.p314xaae8f345.mm.p786x600aa8b.e.d(str, options);
        if (d17 != null) {
            d17.recycle();
        }
        c21537x5f41189f.setVisibility(0);
        c21537x5f41189f.setOnLongClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.h(this));
        c21537x5f41189f.m79320x1a6eb00e(com.p314xaae8f345.mm.sdk.p2603x2137b148.l.a(str));
        int i17 = options.outWidth;
        int i18 = options.outHeight;
        c21537x5f41189f.f149752h = i17;
        c21537x5f41189f.f149753i = i18;
        c21537x5f41189f.i();
        c21537x5f41189f.t(str, null);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.GestureDetector gestureDetector = this.f220352d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/ui/GameImagePreviewUI", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/plugin/game/chatroom/ui/GameImagePreviewUI", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        getWindow().addFlags(67108864);
        m78505x1ef531b7(true);
        this.f220352d = new android.view.GestureDetector(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.d(this));
        android.view.View inflate = android.view.LayoutInflater.from(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bge, (android.view.ViewGroup) null, false);
        int i17 = com.p314xaae8f345.mm.R.id.h88;
        com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 c16077xb54fe366 = (com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.h88);
        if (c16077xb54fe366 != null) {
            i17 = com.p314xaae8f345.mm.R.id.jut;
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.jut);
            if (c21524xecd57b9a != null) {
                i17 = com.p314xaae8f345.mm.R.id.lc6;
                android.widget.ProgressBar progressBar = (android.widget.ProgressBar) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.lc6);
                if (progressBar != null) {
                    i17 = com.p314xaae8f345.mm.R.id.pr8;
                    com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f c21537x5f41189f = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.pr8);
                    if (c21537x5f41189f != null) {
                        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) inflate;
                        this.f220353e = new x33.e(relativeLayout, c16077xb54fe366, c21524xecd57b9a, progressBar, c21537x5f41189f);
                        setContentView(relativeLayout);
                        this.f220354f = getIntent().getStringExtra("img_aeskey");
                        this.f220355g = getIntent().getStringExtra("img_url");
                        this.f220356h = getIntent().getStringExtra("img_md5");
                        this.f220361p = getIntent().getStringExtra("img_thumb");
                        java.lang.String m17 = s33.y.m(this.f220355g, false);
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m17) || !com.p314xaae8f345.mm.vfs.w6.j(m17)) {
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f220361p) && com.p314xaae8f345.mm.vfs.w6.j(this.f220361p)) {
                                U6(this.f220361p, true);
                            }
                            this.f220357i = e43.c.a(false, this.f220355g, this.f220354f, this.f220356h, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.e(this));
                        } else {
                            this.f220358m = false;
                            U6(m17, false);
                        }
                        this.f220353e.f533167e.m45747xe60f5d4e(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.g(this));
                        if (this.f220358m) {
                            this.f220353e.f533166d.setVisibility(0);
                            return;
                        }
                        return;
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f220357i != null) {
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di(this.f220357i);
        }
    }
}
