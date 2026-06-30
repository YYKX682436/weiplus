package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui;

/* renamed from: com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI */
/* loaded from: classes15.dex */
public class ActivityC16330x45b4a404 extends com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d implements com.p314xaae8f345.mm.sdk.p2603x2137b148.f7 {
    public static final /* synthetic */ int G1 = 0;
    public java.util.List A;
    public android.graphics.Bitmap A1;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 B;
    public android.graphics.Bitmap B1;
    public android.view.ViewGroup C;
    public android.graphics.Bitmap C1;
    public android.view.ViewGroup D;
    public android.view.View E;
    public java.lang.String F;
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 G;
    public sb3.c H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public int f226602J;
    public long K;
    public java.lang.String L;
    public android.animation.ValueAnimator M;
    public float N;
    public float P;
    public android.util.DisplayMetrics Q;
    public java.lang.String R;
    public java.lang.String S;
    public android.hardware.SensorManager T;
    public float U;
    public int[] V;
    public android.graphics.Bitmap Z;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f226603g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f226604h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f226605i;

    /* renamed from: l1, reason: collision with root package name */
    public android.graphics.Bitmap f226606l1;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f226607m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f226608n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f226609o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f226610p;

    /* renamed from: p0, reason: collision with root package name */
    public android.graphics.Bitmap f226611p0;

    /* renamed from: p1, reason: collision with root package name */
    public android.graphics.Bitmap f226612p1;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f226613q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f226614r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21478xd3361da3 f226615s;

    /* renamed from: t, reason: collision with root package name */
    public java.util.List f226616t;

    /* renamed from: u, reason: collision with root package name */
    public java.util.Map f226617u;

    /* renamed from: v, reason: collision with root package name */
    public java.util.Queue f226618v;

    /* renamed from: w, reason: collision with root package name */
    public ub3.t f226619w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f226620x;

    /* renamed from: x0, reason: collision with root package name */
    public android.graphics.Bitmap f226621x0;

    /* renamed from: x1, reason: collision with root package name */
    public android.graphics.Bitmap f226622x1;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.Button f226623y;

    /* renamed from: y0, reason: collision with root package name */
    public android.graphics.Bitmap f226624y0;

    /* renamed from: y1, reason: collision with root package name */
    public android.graphics.Bitmap f226625y1;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.C16332x7cb9791e f226626z;

    /* renamed from: z1, reason: collision with root package name */
    public android.graphics.Bitmap f226627z1;
    public final c01.zc W = new ub3.j(this);
    public final db5.o4 X = new ub3.k(this);
    public final db5.t4 Y = new ub3.l(this);
    public final e51.f D1 = new ub3.m(this);
    public final e51.f E1 = new ub3.n(this);
    public final android.hardware.SensorEventListener F1 = new ub3.i(this);

    public static android.graphics.Bitmap V6(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.ActivityC16330x45b4a404 activityC16330x45b4a404, int i17, int i18) {
        android.content.res.Resources resources = activityC16330x45b4a404.getResources();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(resources);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI", "createBitmap", "(II)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI", "createBitmap", "(II)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        return android.graphics.Bitmap.createScaledBitmap(decodeResource, i18, i18, false);
    }

    public final void W6() {
        int width = this.f226615s.getWidth() - (((java.util.ArrayList) this.f226616t).size() * getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561097g));
        if (width <= 0) {
            this.f226615s.setPadding(0, 0, 0, 0);
        } else {
            int i17 = width / 2;
            this.f226615s.setPadding(i17, 0, i17, 0);
        }
    }

    public final void X6() {
        android.graphics.Bitmap bitmap;
        int[] iArr;
        int i17 = 0;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.I)) {
            kd0.k2 k2Var = (kd0.k2) i95.n0.c(kd0.k2.class);
            java.lang.String str = this.I;
            ((jd0.w1) k2Var).getClass();
            int[] iArr2 = new int[2];
            boolean z17 = et5.h.f338209a;
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54059x396cc171);
            int e17 = et5.h.e(allocateDirect, iArr2, str, 12, 1, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c, -1);
            byte[] f17 = et5.h.f(allocateDirect);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QRCodeBitmapFactory", "createColorfulQRCodeBitmap result: %d, matrix: %s", java.lang.Integer.valueOf(e17), f17);
            if (f17 == null || e17 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QRCodeBitmapFactory", "result %d %s", java.lang.Integer.valueOf(e17), com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
                bitmap = null;
            } else {
                android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
                int i18 = displayMetrics.widthPixels;
                int i19 = displayMetrics.heightPixels;
                if (i18 >= i19) {
                    i18 = i19;
                }
                int i27 = (int) (i18 * 0.8d);
                int i28 = iArr2[0];
                int i29 = (int) (i28 * 0.1d);
                int i37 = i28 + (i29 * 2);
                int i38 = i27 / i37;
                if (i38 == 0) {
                    i38 = 1;
                }
                int i39 = i29 * i38;
                int i47 = i38 * i37;
                int i48 = i38 * 2;
                int i49 = (iArr2[1] * i38) + (i29 * i48);
                android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(config);
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(i49));
                arrayList.add(java.lang.Integer.valueOf(i47));
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/qrcode/encoder/QRCodeBitmapFactory", "createColorfulQRCodeBitmap", "(Landroid/content/Context;[B[III)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                bitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                yj0.a.e(obj, bitmap, "com/tencent/mm/qrcode/encoder/QRCodeBitmapFactory", "createColorfulQRCodeBitmap", "(Landroid/content/Context;[B[III)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                int[] iArr3 = new int[i47 * i49];
                int i57 = i38 / 2;
                int i58 = i48 + i57;
                int i59 = (i38 * 3) + i57;
                android.graphics.Canvas canvas = new android.graphics.Canvas(bitmap);
                android.graphics.Paint paint = new android.graphics.Paint();
                paint.setAntiAlias(true);
                java.util.Arrays.fill(iArr3, -1);
                int i66 = 6;
                int[] iArr4 = {i59, i59, (((iArr2[0] - 1) - 3) * i38) + i57, i59, i59, (((iArr2[1] - 1) - 3) * i38) + i57};
                int i67 = 0;
                while (i67 < iArr2[1]) {
                    int i68 = i17;
                    while (true) {
                        int i69 = iArr2[i17];
                        if (i68 < i69) {
                            if (f17[(i67 * i69) + i68] == 1) {
                                if ((i67 < 0 || i67 > i66 || i68 < 0 || i68 > i66) && (i67 < 0 || i67 > i66 || i68 < i69 - 7 || i68 > i69 - 1)) {
                                    int i76 = iArr2[1];
                                    if (i67 < i76 - 7 || i67 > i76 - 1 || i68 < 0 || i68 > i66) {
                                        boolean[] zArr = new boolean[10];
                                        zArr[5] = true;
                                        iArr = iArr4;
                                        if (zArr[(int) (java.lang.Math.random() * 10.0d)]) {
                                            for (int i77 = 0; i77 < i38; i77++) {
                                                for (int i78 = 0; i78 < i38; i78++) {
                                                    iArr3[(((i67 * i38) + i39 + i77) * i47) + (i68 * i38) + i39 + i78] = -3041484;
                                                }
                                            }
                                        } else {
                                            for (int i79 = 0; i79 < i38; i79++) {
                                                for (int i86 = 0; i86 < i38; i86++) {
                                                    iArr3[(((i67 * i38) + i39 + i79) * i47) + (i68 * i38) + i39 + i86] = -2598591;
                                                }
                                            }
                                            i68++;
                                            iArr4 = iArr;
                                            i66 = 6;
                                            i17 = 0;
                                        }
                                    }
                                }
                                for (int i87 = 0; i87 < i38; i87++) {
                                    for (int i88 = 0; i88 < i38; i88++) {
                                        iArr3[(((i67 * i38) + i39 + i87) * i47) + (i68 * i38) + i39 + i88] = -1;
                                    }
                                }
                                iArr = iArr4;
                            } else {
                                iArr = iArr4;
                            }
                            i68++;
                            iArr4 = iArr;
                            i66 = 6;
                            i17 = 0;
                        }
                    }
                    i67++;
                    i66 = 6;
                    i17 = 0;
                }
                int[] iArr5 = iArr4;
                int i89 = -1;
                int i96 = -2598591;
                bitmap.setPixels(iArr3, 0, i47, 0, 0, i47, i49);
                int i97 = 0;
                int i98 = 3;
                while (i97 < i98) {
                    paint.setColor(i96);
                    paint.setStyle(android.graphics.Paint.Style.FILL);
                    int i99 = (i97 * 2) + 1;
                    canvas.drawCircle(iArr5[r2] + i39, iArr5[i99] + i39, i59, paint);
                    paint.setColor(-1);
                    canvas.drawCircle(iArr5[r2] + i39, iArr5[i99] + i39, i58, paint);
                    i97++;
                    i98 = 3;
                    i96 = -2598591;
                }
                int i100 = 0;
                while (i100 < i98) {
                    paint.setColor(-3041484);
                    paint.setStyle(android.graphics.Paint.Style.FILL);
                    int i101 = i100 * 2;
                    int i102 = iArr5[i101] + i39;
                    int i103 = (i38 * 1) / 4;
                    int i104 = iArr5[i101 + 1] + i39;
                    canvas.drawRect((i102 - i38) - i103, (i104 - i38) - i103, i102 + i38 + i103, i104 + i38 + i103, paint);
                    i100++;
                    i98 = 3;
                }
                int i105 = 0;
                while (i105 < i98) {
                    paint.setColor(i89);
                    paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
                    android.graphics.Path path = new android.graphics.Path();
                    int i106 = i105 * 2;
                    int i107 = (i38 * 1) / 4;
                    int i108 = i106 + 1;
                    path.moveTo(((iArr5[i106] + i39) - i38) - i107, ((iArr5[i108] + i39) - i38) - i107);
                    int i109 = i38 / 4;
                    path.quadTo(iArr5[i106] + i39, (iArr5[i108] + i39) - i38, r7 + i38 + i109, r2 - i107);
                    path.lineTo(((iArr5[i106] + i39) - i38) - i107, ((iArr5[i108] + i39) - i38) - i107);
                    path.close();
                    canvas.drawPath(path, paint);
                    path.moveTo(((iArr5[i106] + i39) - i38) - i107, ((iArr5[i108] + i39) - i38) - i107);
                    path.quadTo((iArr5[i106] + i39) - i38, iArr5[i108] + i39, r2 - i109, r12 + i38 + i107);
                    path.lineTo(((iArr5[i106] + i39) - i38) - i107, ((iArr5[i108] + i39) - i38) - i107);
                    path.close();
                    canvas.drawPath(path, paint);
                    path.moveTo(iArr5[i106] + i39 + i38 + i107, iArr5[i108] + i39 + i38 + i107);
                    path.quadTo(iArr5[i106] + i39, iArr5[i108] + i39 + i38, (r2 - i38) - i109, r12 + i107);
                    path.lineTo(iArr5[i106] + i39 + i38 + i107, iArr5[i108] + i39 + i38 + i107);
                    path.close();
                    canvas.drawPath(path, paint);
                    path.moveTo(iArr5[i106] + i39 + i38 + i107, iArr5[i108] + i39 + i38 + i107);
                    path.quadTo(iArr5[i106] + i39 + i38, iArr5[i108] + i39, r2 + i109, (r12 - i38) - i107);
                    path.lineTo(iArr5[i106] + i39 + i38 + i107, iArr5[i108] + i39 + i38 + i107);
                    path.close();
                    canvas.drawPath(path, paint);
                    i105++;
                    i98 = 3;
                    i89 = -1;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QRCodeBitmapFactory", "createBitmap %s", bitmap);
            }
            this.f226610p.setImageBitmap(bitmap);
        }
        if (this.f226602J > 0) {
            this.f226610p.setPadding(0, 0, 0, 0);
            this.f226613q.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573955gl1));
            this.f226613q.setVisibility(0);
            this.f226614r.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573955gl1));
            this.f226620x.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573954gl0, java.lang.Integer.valueOf(this.f226602J)));
            this.f226620x.setVisibility(0);
            this.f226623y.setVisibility(8);
            return;
        }
        this.f226610p.setPadding(i65.a.b(this, 5), i65.a.b(this, 5), i65.a.b(this, 5), i65.a.b(this, 5));
        this.f226610p.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c9v);
        this.f226620x.setVisibility(8);
        this.f226623y.setVisibility(0);
        this.f226613q.setVisibility(4);
        android.view.View view = this.f226603g;
        view.setPadding(view.getPaddingLeft(), o25.n1.a(this), this.f226603g.getPaddingRight(), this.f226603g.getPaddingBottom());
        if (((java.util.ArrayList) this.f226616t).size() > 0) {
            this.f226614r.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.gkv));
        } else {
            this.f226614r.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.gkw));
        }
    }

    public final void Y6() {
        if (((java.util.ArrayList) this.A).size() != this.f226602J) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LuckyMoneyF2FQRCodeUI", "shuffle cards: %d", java.lang.Integer.valueOf(((java.util.ArrayList) this.A).size()), java.lang.Integer.valueOf(this.f226602J));
            ((java.util.ArrayList) this.A).clear();
            for (int i17 = 0; i17 < this.f226602J; i17++) {
                android.view.View inflate = android.view.LayoutInflater.from(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bue, (android.view.ViewGroup) this.f226626z, false);
                ((android.widget.FrameLayout.LayoutParams) inflate.getLayoutParams()).gravity = 81;
                ((java.util.ArrayList) this.A).add(inflate);
            }
            this.f226626z.m66061x2999f369(this.A);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.buf;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.Q = getResources().getDisplayMetrics();
        this.f226616t = new java.util.ArrayList();
        this.f226617u = new java.util.HashMap();
        this.f226618v = new java.util.LinkedList();
        this.A = new java.util.ArrayList();
        int[] iArr = new int[6];
        this.V = iArr;
        iArr[0] = iArr[0] + 1;
        this.G = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new ub3.o(this), true);
        this.f226604h = findViewById(com.p314xaae8f345.mm.R.id.j1v);
        this.f226603g = findViewById(com.p314xaae8f345.mm.R.id.plt);
        this.f226614r = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.j1r);
        this.f226613q = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.j1s);
        this.U = this.f226614r.getAlpha();
        this.f226610p = (android.widget.ImageView) this.f226604h.findViewById(com.p314xaae8f345.mm.R.id.j1q);
        this.f226615s = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21478xd3361da3) findViewById(com.p314xaae8f345.mm.R.id.j1t);
        ub3.t tVar = new ub3.t(this, null);
        this.f226619w = tVar;
        this.f226615s.setAdapter((android.widget.ListAdapter) tVar);
        this.f226615s.setOnItemClickListener(new ub3.p(this));
        this.f226615s.m78896x4d4eb3e5(new ub3.q(this));
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.j1p);
        this.f226623y = button;
        button.setOnClickListener(new ub3.r(this));
        this.f226620x = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.j1x);
        this.f226605i = findViewById(com.p314xaae8f345.mm.R.id.j1w);
        mo54448x9c8c0d33(new ub3.c(this));
        mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573957gl3));
        mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f78355x20db789a, new ub3.d(this));
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560875wx));
        mo78530x8b45058f();
        this.C = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.j1k);
        this.D = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.j1j);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.j1m);
        this.E = findViewById;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI", "initQRCodeView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        findViewById.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI", "initQRCodeView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("sensor");
        this.T = sensorManager;
        sensorManager.registerListener(this.F1, sensorManager.getDefaultSensor(1), 3);
        this.H = new sb3.c(2, 3);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.C16332x7cb9791e c16332x7cb9791e = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.C16332x7cb9791e) findViewById(com.p314xaae8f345.mm.R.id.j1y);
        this.f226626z = c16332x7cb9791e;
        ub3.v0 v0Var = new ub3.v0();
        v0Var.f507676c = 4;
        v0Var.f507674a = 2;
        v0Var.f507675b = 4;
        v0Var.f507678e = 300;
        v0Var.f507677d = 0.0f;
        c16332x7cb9791e.m66067xa14a7a19(v0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.C16332x7cb9791e.E = this.Q;
        this.f226626z.m66065xa11bd7a7(android.animation.ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L));
        this.f226626z.m66066xdc10697b(new ub3.e(this));
        this.f226626z.m66062x31d2166(new ub3.f(this));
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add("touch_card.m4a");
        hashSet.add("select_card.m4a");
        for (int i17 = 1; i17 <= 8; i17++) {
            hashSet.add("music" + i17 + ".m4a");
        }
        hashSet.add("packet_received.m4a");
        hashSet.add("most_lucky.m4a");
        hashSet.add("whistle.m4a");
        sb3.c cVar = this.H;
        cVar.getClass();
        gm0.j1.e().j(new sb3.a(cVar, hashSet, new java.lang.ref.WeakReference(this)));
        cVar.f486968a.setOnLoadCompleteListener(new sb3.b(cVar));
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.M = ofFloat;
        ofFloat.setDuration(300L);
        this.M.setStartDelay(3000L);
        this.M.addUpdateListener(new ub3.g(this));
        X6();
        getWindow().addFlags(128);
        if (com.p314xaae8f345.mm.p2802xd031a825.ui.r1.P()) {
            getWindow().addFlags(8192);
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_revert_overlay_hidden, false) || android.os.Build.VERSION.SDK_INT < 31) {
                return;
            }
            try {
                if (b3.l.m9698x3fed0563(mo55332x76847179(), "android.permission.HIDE_OVERLAY_WINDOWS") == 0) {
                    getWindow().setHideOverlayWindows(true);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LuckyMoneyF2FQRCodeUI", "no permission");
                    jx3.f.INSTANCE.mo68478xbd3cda5f(28867, "100");
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("LuckyMoneyF2FQRCodeUI", e17, "", new java.lang.Object[0]);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14007, java.lang.Integer.valueOf(this.V[0]), java.lang.Integer.valueOf(this.V[1]), java.lang.Integer.valueOf(this.V[2]), java.lang.Integer.valueOf(this.V[3]), java.lang.Integer.valueOf(this.V[4]), java.lang.Integer.valueOf(this.V[5]));
        sb3.c cVar = this.H;
        cVar.f486971d = true;
        cVar.f486968a.release();
        getWindow().clearFlags(128);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        android.hardware.SensorManager sensorManager = this.T;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.F1);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        m66165x5406100e(new tb3.e(), true);
        this.G.c(60000L, 60000L);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) ((vg3.f4) i95.n0.c(vg3.f4.class))).getClass();
        c01.ad.f118594a.b("ffopenwxhb", this.W, true);
        m66163x14f40144(1990);
        m66163x14f40144(1987);
        m66163x14f40144(1971);
        android.view.WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (attributes.screenBrightness < 0.85f) {
            attributes.screenBrightness = 0.85f;
            getWindow().setAttributes(attributes);
        }
        ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.t) ((ct.d3) i95.n0.c(ct.d3.class))).wi(this, this);
        android.hardware.SensorManager sensorManager = this.T;
        if (sensorManager != null) {
            sensorManager.registerListener(this.F1, sensorManager.getDefaultSensor(1), 3);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d
    /* renamed from: onSceneEnd */
    public boolean mo66056x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LuckyMoneyF2FQRCodeUI", "errType: %d,errCode: %d,errMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 != 0 || i18 != 0) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                return true;
            }
            db5.e1.s(this, str, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv));
            return true;
        }
        if (m1Var instanceof tb3.e) {
            tb3.e eVar = (tb3.e) m1Var;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(this.F, eVar.f498544f) && !this.F.equals(eVar.f498544f)) {
                ((java.util.ArrayList) this.f226616t).clear();
                ((java.util.HashMap) this.f226617u).clear();
                ((java.util.LinkedList) this.f226618v).clear();
                this.f226619w.notifyDataSetChanged();
                this.L = "";
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(eVar.f498544f)) {
                this.F = eVar.f498544f;
            }
            this.I = eVar.f498545g;
            this.f226602J = eVar.f498548m;
            this.R = eVar.f498547i;
            this.S = eVar.f498546h;
            X6();
            Y6();
            if (this.f226602J == 0) {
                this.G.d();
            }
            if (((java.util.ArrayList) this.f226616t).size() != 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.F)) {
                return true;
            }
            m66165x5406100e(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.v5(this.F, 5, 0, null, "v1.0"), false);
            return true;
        }
        if (m1Var instanceof tb3.a) {
            this.F = "";
            this.I = "";
            this.f226602J = 0;
            ((java.util.ArrayList) this.f226616t).clear();
            this.L = "";
            this.f226619w.notifyDataSetChanged();
            X6();
            Y6();
            this.G.d();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.R)) {
                db5.e1.T(this, this.R);
            }
            this.S = "";
            return true;
        }
        if (!(m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.v5)) {
            if (!(m1Var instanceof tb3.b)) {
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LuckyMoneyF2FQRCodeUI", "onSceneEnd NetSceneF2FLuckyMoneyInvalid");
            tb3.b bVar = (tb3.b) m1Var;
            int i19 = bVar.f498516f;
            java.lang.String str2 = bVar.f498517g;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LuckyMoneyF2FQRCodeUI", "retcode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e1 e1Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.v5) m1Var).f227198h;
        this.K = e1Var.f226779r;
        java.util.LinkedList linkedList = e1Var.M;
        if (linkedList == null || linkedList.size() <= 0) {
            return true;
        }
        for (int i27 = 0; i27 < linkedList.size(); i27++) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h5 h5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h5) linkedList.get(i27);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h5Var.f226850i)) {
                if (!((java.util.ArrayList) this.f226616t).contains(h5Var.f226850i)) {
                    ((java.util.ArrayList) this.f226616t).add(h5Var.f226850i);
                    java.lang.String str3 = h5Var.f226852n;
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h5Var.f226851m)) {
                        this.L = str3;
                    }
                    ((java.util.HashMap) this.f226617u).put(h5Var.f226850i, str3);
                }
            }
        }
        W6();
        this.f226619w.notifyDataSetChanged();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        this.G.d();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) ((vg3.f4) i95.n0.c(vg3.f4.class))).getClass();
        c01.ad.f118594a.h("ffopenwxhb", this.W, true);
        m66169xf6ff5b27(1990);
        m66169xf6ff5b27(1987);
        m66169xf6ff5b27(1971);
        ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.t) ((ct.d3) i95.n0.c(ct.d3.class))).Bi(this, this);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LuckyMoneyF2FQRCodeUI", "screenShot");
        if (this.f226602J > 0) {
            java.lang.String str2 = this.I;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LuckyMoneyF2FQRCodeUI", "invalidQRCode");
            m66165x5406100e(new tb3.b(str2), false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LuckyMoneyF2FQRCodeUI", "getQRCode");
            m66165x5406100e(new tb3.e(), false);
            X6();
            int[] iArr = this.V;
            iArr[1] = iArr[1] + 1;
            db5.e1.s(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573956gl2), null);
        }
    }
}
