package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes12.dex */
public class k3 implements p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener {
    public static long A;

    /* renamed from: y, reason: collision with root package name */
    public static int f282654y;

    /* renamed from: z, reason: collision with root package name */
    public static int f282655z;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.g1 f282662m;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.Bitmap f282671v;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.i6 f282656d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.i6(1, "chatting-image-gallery-lazy-loader", 1);

    /* renamed from: e, reason: collision with root package name */
    public final android.util.SparseArray f282657e = new android.util.SparseArray();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f282658f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final android.util.SparseArray f282659g = new android.util.SparseArray();

    /* renamed from: h, reason: collision with root package name */
    public final android.util.SparseArray f282660h = new android.util.SparseArray();

    /* renamed from: i, reason: collision with root package name */
    public final android.util.SparseArray f282661i = new android.util.SparseArray();

    /* renamed from: n, reason: collision with root package name */
    public int f282663n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f282664o = -1;

    /* renamed from: p, reason: collision with root package name */
    public final kk.j f282665p = new jt0.i(400, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.c3(this), com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k3.class);

    /* renamed from: q, reason: collision with root package name */
    public final kk.j f282666q = new jt0.i(5, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.d3(this), com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k3.class);

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f282667r = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final android.util.SparseIntArray f282668s = new android.util.SparseIntArray();

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedList f282669t = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public final java.util.LinkedList f282670u = new java.util.LinkedList();

    /* renamed from: w, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f282672w = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();

    /* renamed from: x, reason: collision with root package name */
    public boolean f282673x = false;

    public k3(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.g1 g1Var) {
        this.f282662m = g1Var;
    }

    public final void a(int i17, android.graphics.Bitmap bitmap) {
        android.util.SparseArray sparseArray = this.f282657e;
        if (sparseArray.get(i17) == null) {
            return;
        }
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t2) this.f282662m).E(0L, "", (android.view.View) ((java.lang.ref.WeakReference) sparseArray.get(i17)).get(), (java.lang.String) this.f282659g.get(i17), bitmap);
        f(i17);
    }

    public void b(android.widget.ImageView imageView, java.lang.String str, int i17) {
        java.util.LinkedList linkedList = this.f282669t;
        if (linkedList.contains(str)) {
            return;
        }
        int hashCode = imageView.hashCode();
        f(hashCode);
        this.f282658f.put(str, java.lang.Integer.valueOf(hashCode));
        this.f282659g.put(hashCode, str);
        this.f282657e.put(hashCode, new java.lang.ref.WeakReference(imageView));
        linkedList.add(str);
        this.f282670u.add(java.lang.Integer.valueOf(i17));
        g();
    }

    public boolean c(android.widget.ImageView imageView, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryLazyLoader", "loadThumb position %s", java.lang.Integer.valueOf(i17));
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((jt0.i) this.f282665p).i(i17 + "");
        if (bitmap == null || bitmap.isRecycled()) {
            return false;
        }
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t2) this.f282662m).E(0L, "", imageView, null, bitmap);
        return true;
    }

    public void d(int i17, android.graphics.Bitmap bitmap) {
        int i18 = this.f282664o;
        if (i17 == i18 || i18 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryLazyLoader", "notifyBitmapLoaded cache bitmap, position: %d", java.lang.Integer.valueOf(i17));
            this.f282671v = bitmap;
        }
    }

    public final void e(int i17) {
        if (((lt0.f) this.f282665p).k(i17 + "")) {
            return;
        }
        gm0.j1.e().k(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.h3(this, i17), 300L);
    }

    public final void f(int i17) {
        android.util.SparseArray sparseArray = this.f282659g;
        if (sparseArray.get(i17) != null) {
            java.lang.String str = (java.lang.String) sparseArray.get(i17);
            this.f282657e.remove(i17);
            sparseArray.remove(i17);
            this.f282658f.remove(str);
            this.f282660h.remove(i17);
        }
    }

    public final void g() {
        if (this.f282673x) {
            return;
        }
        java.util.LinkedList linkedList = this.f282669t;
        if (linkedList.size() == 0) {
            return;
        }
        java.lang.String str = (java.lang.String) linkedList.removeLast();
        int intValue = ((java.lang.Integer) this.f282670u.removeLast()).intValue();
        if (this.f282658f.containsKey(str)) {
            this.f282673x = true;
            this.f282656d.a(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.j3(this, str, intValue));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(java.lang.String r8, android.graphics.Bitmap r9) {
        /*
            r7 = this;
            r0 = 0
            if (r9 != 0) goto L5
        L3:
            r1 = r0
            goto L46
        L5:
            int r1 = r9.getWidth()
            long r1 = (long) r1
            int r3 = r9.getHeight()
            long r3 = (long) r3
            long r1 = r1 * r3
            int r3 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k3.f282655z
            if (r3 == 0) goto L18
            int r3 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k3.f282654y
            if (r3 != 0) goto L3c
        L18:
            android.content.Context r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            int r3 = r3.widthPixels
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k3.f282654y = r3
            android.content.Context r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            int r3 = r3.heightPixels
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k3.f282655z = r3
            int r3 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k3.f282654y
            long r3 = (long) r3
            long r5 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k3.A
            long r3 = r3 * r5
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k3.A = r3
        L3c:
            long r3 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k3.A
            r5 = 2
            long r3 = r3 * r5
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L3
            r1 = 1
        L46:
            java.lang.String r2 = "MicroMsg.ImageGalleryLazyLoader"
            if (r1 == 0) goto L50
            java.lang.String r8 = "file %s too big to cache"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r8)
            return
        L50:
            kk.j r1 = r7.f282666q
            jt0.i r1 = (jt0.i) r1
            r1.j(r8, r9)
            com.tencent.mm.ui.chatting.gallery.k4 r1 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.j4.f282594a
            kk.j r3 = r1.f282674a
            lt0.f r3 = (lt0.f) r3
            boolean r3 = r3.k(r8)
            if (r3 == 0) goto L7a
            java.lang.String r3 = "update origCache and preload cache"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r3)
            kk.j r1 = r1.f282674a     // Catch: java.lang.Exception -> L71
            jt0.i r1 = (jt0.i) r1     // Catch: java.lang.Exception -> L71
            r1.j(r8, r9)     // Catch: java.lang.Exception -> L71
            goto L7a
        L71:
            r8 = move-exception
            java.lang.String r9 = "update preload cache failed"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r8, r9, r0)
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k3.h(java.lang.String, android.graphics.Bitmap):void");
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrollStateChanged */
    public void mo8331xcb2941fe(int i17) {
        this.f282663n = i17;
        boolean z17 = true;
        if (this.f282662m == null && i17 != 0) {
            z17 = false;
        }
        if (z17) {
            android.util.SparseArray sparseArray = this.f282660h;
            int size = sparseArray.size();
            int[] iArr = new int[size];
            for (int i18 = 0; i18 < size; i18++) {
                iArr[i18] = sparseArray.keyAt(i18);
            }
            for (int i19 = 0; i19 < size; i19++) {
                int i27 = iArr[i19];
                a(i27, (android.graphics.Bitmap) sparseArray.get(i27));
            }
        }
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrolled */
    public void mo8332xf210c75a(int i17, float f17, int i18) {
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageSelected */
    public void mo8333x510f45c9(int i17) {
        if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t2) this.f282662m).f282419d.f282626h.f282388f) {
            int i18 = this.f282664o;
            if (i18 == -1) {
                int i19 = 0;
                while (true) {
                    if (i19 != 0) {
                        int i27 = i17 + i19;
                        int i28 = i17 + 3;
                        if (i27 > i28 && i17 - i19 < java.lang.Math.max(i17 - 3, 0)) {
                            break;
                        }
                        if (i27 <= i28) {
                            e(i27);
                        }
                        int i29 = i17 - i19;
                        if (i29 >= java.lang.Math.max(i17 - 3, 0)) {
                            e(i29);
                        }
                    } else {
                        e(i17);
                    }
                    i19++;
                }
            } else if (i18 > i17) {
                e(java.lang.Math.max(i17 - 3, 0));
            } else if (i18 < i17) {
                e(i17 + 3);
            }
            this.f282664o = i17;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t2 t2Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t2) this.f282662m;
            if (t2Var != null) {
                if (t2Var.f282419d.c(i17, true) != null) {
                    this.f282671v = null;
                    return;
                }
                com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f f17 = t2Var.f282419d.f(this.f282664o, true);
                if (f17 != null) {
                    this.f282671v = f17.m45727x91da4e25();
                }
            }
        }
    }
}
