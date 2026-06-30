package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes12.dex */
public class r4 implements y60.h {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f273397a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f273398b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f273399c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f273400d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.HashMap f273401e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.HashMap f273402f;

    /* renamed from: g, reason: collision with root package name */
    public jt0.i f273403g;

    /* renamed from: h, reason: collision with root package name */
    public android.util.SparseArray f273404h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.n4 f273405i;

    /* renamed from: j, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.n4 f273406j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f273407k;

    /* renamed from: l, reason: collision with root package name */
    public final y60.g f273408l;

    /* renamed from: m, reason: collision with root package name */
    public final x51.r0 f273409m;

    public r4(int i17, y60.g gVar) {
        this(i17);
        this.f273408l = gVar;
    }

    public static java.lang.String c(java.lang.String str, java.lang.String str2, int i17, int i18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "null";
        }
        sb6.append(str);
        sb6.append("_");
        if (str2 == null) {
            str2 = "null";
        }
        sb6.append(str2);
        sb6.append("_");
        sb6.append(i17);
        sb6.append("_");
        sb6.append(i18);
        return sb6.toString();
    }

    public void a(android.widget.ImageView imageView, java.lang.String[] strArr, java.lang.String str, int i17, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageEngine", "attach thumb image %s url %s", java.lang.Integer.valueOf(imageView.hashCode()), str);
        if (this.f273407k) {
            if (this.f273397a) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ImageEngine", "on attach, isQuit, return");
                return;
            }
            if ((strArr == null || strArr.length <= 0) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ImageEngine", "attach from file path fail, path and url are null or empty");
                e(imageView, i17);
                return;
            }
            boolean z17 = false;
            java.lang.String c17 = c((strArr == null || strArr.length <= 0) ? null : strArr[0], str, i18, i19);
            synchronized (this.f273398b) {
                java.lang.String str2 = (java.lang.String) this.f273402f.get(imageView);
                if (str2 != null) {
                    this.f273401e.remove(str2);
                }
                this.f273402f.put(imageView, c17);
            }
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) this.f273403g.get(c17);
            if (bitmap != null && !bitmap.isRecycled()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageEngine", "doRender from cache %s key %s, bmp width:%s, height:%s", java.lang.Integer.valueOf(imageView.hashCode()), c17, java.lang.Integer.valueOf(bitmap.getWidth()), java.lang.Integer.valueOf(bitmap.getHeight()));
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p4.a(imageView, bitmap);
                return;
            }
            if (strArr != null && strArr.length > 1) {
                int i27 = 1;
                while (true) {
                    if (i27 >= strArr.length) {
                        break;
                    }
                    android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) this.f273403g.get(c(strArr[i27], str, i18, i19));
                    if (bitmap2 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageEngine", "get next render bmp, width:%s, height:%s", java.lang.Integer.valueOf(bitmap2.getWidth()), java.lang.Integer.valueOf(bitmap2.getHeight()));
                        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p4.a(imageView, bitmap2);
                        z17 = true;
                        break;
                    }
                    i27++;
                }
            }
            if (!z17) {
                e(imageView, i17);
            }
            synchronized (this.f273398b) {
                this.f273401e.put(c17, imageView);
            }
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.n4 n4Var = this.f273406j;
            java.util.LinkedList linkedList = n4Var.f273324b;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.o4 o4Var = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.o4) (linkedList.isEmpty() ? n4Var.a() : linkedList.removeFirst());
            o4Var.f273337d = strArr;
            o4Var.f273338e = str;
            o4Var.f273339f = c17;
            o4Var.f273340g = i18;
            o4Var.f273341h = i19;
            this.f273399c.mo50294x9395cba4(o4Var);
        }
    }

    public void b() {
        this.f273397a = true;
        this.f273399c.mo50283x2f1920ea().f538836b.g();
        x51.w0.e(this.f273409m);
        android.util.SparseArray sparseArray = this.f273404h;
        jt0.i iVar = this.f273403g;
        this.f273404h = new android.util.SparseArray();
        this.f273403g = new jt0.i(1, getClass());
        s75.d.b(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.j4(this, sparseArray, iVar), "ImageEngine_destroy_" + java.lang.System.currentTimeMillis());
    }

    public x51.o0 d(java.lang.String str, java.lang.String str2, int i17, int i18) {
        y60.g gVar = this.f273408l;
        if (gVar == null) {
            return null;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.sa) gVar).getClass();
        return new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.j3(str, str2, i17, i18);
    }

    public final void e(android.widget.ImageView imageView, int i17) {
        if (i17 == 0) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p4.a(imageView, null);
            return;
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) this.f273404h.get(i17);
        if (bitmap == null) {
            bitmap = bp.b.m10969xb866ec1c(imageView.getResources(), i17, null);
            this.f273404h.put(i17, bitmap);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p4.a(imageView, bitmap);
    }

    public r4(int i17) {
        this.f273397a = false;
        this.f273398b = new byte[0];
        this.f273407k = true;
        this.f273408l = null;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l4 l4Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l4(this);
        this.f273409m = l4Var;
        this.f273401e = new java.util.HashMap();
        this.f273402f = new java.util.HashMap();
        xu5.b a17 = xu5.b.a("ImageEngine");
        this.f273399c = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(a17);
        this.f273400d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f273405i = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g4(this, 16, a17);
        this.f273406j = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h4(this, 16, xu5.b.b());
        this.f273404h = new android.util.SparseArray();
        this.f273403g = new jt0.i(i17, new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.i4(this), getClass());
        x51.w0.a(l4Var);
    }
}
