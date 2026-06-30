package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ow extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {
    public int A;
    public final int B;
    public final int C;
    public final int D;
    public volatile boolean E;
    public volatile boolean F;
    public final long G;
    public final int H;
    public final int I;

    /* renamed from: J, reason: collision with root package name */
    public final int f195318J;
    public final int K;
    public final long L;
    public final float M;
    public final float N;
    public final int P;
    public final java.util.ArrayList Q;
    public volatile long R;
    public final int[] S;
    public final int T;
    public int U;
    public volatile boolean V;
    public volatile boolean W;
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 X;
    public final jz5.g Y;
    public final java.util.concurrent.ConcurrentLinkedQueue Z;

    /* renamed from: l1, reason: collision with root package name */
    public final jz5.g f195319l1;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f195320p;

    /* renamed from: p0, reason: collision with root package name */
    public final float f195321p0;

    /* renamed from: p1, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f195322p1;

    /* renamed from: q, reason: collision with root package name */
    public final float f195323q;

    /* renamed from: r, reason: collision with root package name */
    public final float f195324r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f195325s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f195326t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p997x94b162ad.SurfaceHolderCallbackC11316x2d046220 f195327u;

    /* renamed from: v, reason: collision with root package name */
    public final zl2.b f195328v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.ArrayList f195329w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.ArrayList f195330x;

    /* renamed from: x0, reason: collision with root package name */
    public final java.util.Map f195331x0;

    /* renamed from: y, reason: collision with root package name */
    public java.util.ArrayList f195332y;

    /* renamed from: y0, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 f195333y0;

    /* renamed from: z, reason: collision with root package name */
    public java.util.ArrayList f195334z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow(android.view.ViewGroup root, qo0.c statusMonitor, en2.a aVar) {
        super(root, statusMonitor, null);
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f195320p = "Finder.FinderLiveLikeConfettiPlugin";
        this.f195323q = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y;
        this.f195324r = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x;
        this.f195325s = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.pv(root));
        this.f195326t = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.xv(root));
        this.f195328v = new zl2.b();
        this.f195329w = (aVar == null || (arrayList2 = aVar.f336811a) == null) ? new java.util.ArrayList() : arrayList2;
        this.f195330x = (aVar == null || (arrayList = aVar.f336812b) == null) ? new java.util.ArrayList() : arrayList;
        this.f195332y = new java.util.ArrayList();
        this.f195334z = new java.util.ArrayList();
        this.A = 100;
        this.B = 1;
        this.C = 2;
        this.D = 4;
        this.G = 200L;
        this.H = com.p314xaae8f345.mm.ui.zk.a(root.getContext(), 48);
        this.I = com.p314xaae8f345.mm.ui.zk.a(root.getContext(), 40);
        this.f195318J = com.p314xaae8f345.mm.ui.zk.a(root.getContext(), 40);
        this.K = (com.p314xaae8f345.mm.ui.bl.b(root.getContext()).y / 2) - com.p314xaae8f345.mm.ui.zk.a(root.getContext(), 24);
        com.p314xaae8f345.mm.ui.zk.a(root.getContext(), 60);
        this.L = 2500L;
        this.M = -360.0f;
        this.N = 50.0f;
        this.P = com.p314xaae8f345.mm.ui.zk.a(root.getContext(), 160);
        this.Q = new java.util.ArrayList();
        this.S = new int[]{0, 0};
        this.T = 8;
        this.X = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ov(this);
        this.Y = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mw(this));
        this.Z = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f195321p0 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_LIKE_SPEED_INT_SYNC, 100) * 0.01f;
        this.f195331x0 = new java.util.LinkedHashMap();
        this.f195333y0 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jw(this);
        this.f195319l1 = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kw(this));
        if (!vd2.v2.f517474m) {
            root.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mv(this));
        }
        this.f195322p1 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wv(this));
    }

    public static final void t1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow owVar) {
        int i17;
        int[] iArr = owVar.S;
        int i18 = iArr[0];
        if (i18 <= 0 || (i17 = iArr[1]) <= 0 || i18 >= owVar.f195324r || i17 >= owVar.f195323q) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(owVar.f195320p, "[checkXyArray] likeXyArray:" + iArr[0] + ',' + iArr[1]);
            owVar.D1();
        }
    }

    public final android.widget.FrameLayout A1() {
        return (android.widget.FrameLayout) this.f195325s.mo141623x754a37bb();
    }

    public final android.widget.RelativeLayout B1() {
        return (android.widget.RelativeLayout) ((jz5.n) this.f195326t).mo141623x754a37bb();
    }

    public final void C1(boolean z17) {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.a()) {
            E1(z17);
        } else {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.yv(this, z17));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if ((((mm2.n0) P0(mm2.n0.class)).f410806r) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D1() {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow.D1():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E1(boolean r10) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow.E1(boolean):void");
    }

    public final int F1(int i17) {
        if (i17 > 0) {
            return c06.e.f119249d.e(0, i17);
        }
        java.lang.String str = this.f195320p;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[nextInt] param:" + i17 + " is not positive,stack:");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c(str, "nextInt", new java.lang.Object[0]);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    public final android.graphics.Bitmap G1() {
        android.graphics.Bitmap bitmap;
        int i17 = 0;
        int i18 = 100;
        if (this.W) {
            if (this.f195330x.size() <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f195320p, "rollNextBitmap: applaudBitmaps is empty");
                return null;
            }
            bitmap = F1(100) < 25 ? (android.graphics.Bitmap) this.f195330x.get(0) : (android.graphics.Bitmap) this.f195330x.get(1);
        } else {
            if (this.f195329w.size() <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f195320p, "rollNextBitmap: confettiBitmaps is empty");
                return null;
            }
            java.util.ArrayList arrayList = this.f195329w;
            bitmap = (android.graphics.Bitmap) arrayList.get(F1(arrayList.size()));
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmap);
        if (this.f195332y.size() > 0 && this.A > 0) {
            synchronized (this.f195332y) {
                java.util.Iterator it = this.f195334z.iterator();
                if (!it.hasNext()) {
                    throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
                }
                java.lang.Object next = it.next();
                while (it.hasNext()) {
                    next = java.lang.Integer.valueOf(((java.lang.Number) next).intValue() + ((java.lang.Number) it.next()).intValue());
                }
                int intValue = ((java.lang.Number) next).intValue();
                if (intValue >= 100) {
                    i18 = intValue;
                }
                int F1 = F1(i18);
                if (F1 > intValue) {
                    return bitmap;
                }
                for (java.lang.Object obj : this.f195334z) {
                    int i19 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    int intValue2 = ((java.lang.Number) obj).intValue();
                    if (F1 <= intValue2) {
                        android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) kz5.n0.a0(this.f195332y, i17);
                        if (bitmap2 != null) {
                            bitmap = bitmap2;
                        }
                        return bitmap;
                    }
                    F1 -= intValue2;
                    i17 = i19;
                }
            }
        }
        return bitmap;
    }

    public final void H1() {
        java.util.ArrayList arrayList = this.f195329w;
        int size = arrayList.size();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.br7);
        android.view.ViewGroup viewGroup = this.f446856d;
        if (size == 0) {
            android.content.res.Resources resources = viewGroup.getContext().getResources();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.f563457br3));
            arrayList2.add(resources);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(obj, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveLikeConfettiPlugin", "setupConfig", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList2.get(0), ((java.lang.Integer) arrayList2.get(1)).intValue());
            yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveLikeConfettiPlugin", "setupConfig", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            int i17 = no0.i.f420260a;
            int i18 = no0.i.f420260a;
            android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(decodeResource, i18, i18, true);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createScaledBitmap, "createScaledBitmap(...)");
            android.content.res.Resources resources2 = viewGroup.getContext().getResources();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.f563458br4));
            arrayList3.add(resources2);
            java.lang.Object obj2 = new java.lang.Object();
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(obj2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveLikeConfettiPlugin", "setupConfig", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource2 = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList3.get(0), ((java.lang.Integer) arrayList3.get(1)).intValue());
            yj0.a.e(obj2, decodeResource2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveLikeConfettiPlugin", "setupConfig", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createScaledBitmap2 = android.graphics.Bitmap.createScaledBitmap(decodeResource2, i18, i18, true);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createScaledBitmap2, "createScaledBitmap(...)");
            android.content.res.Resources resources3 = viewGroup.getContext().getResources();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.f563459br5));
            arrayList4.add(resources3);
            java.lang.Object obj3 = new java.lang.Object();
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(obj3, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveLikeConfettiPlugin", "setupConfig", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource3 = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList4.get(0), ((java.lang.Integer) arrayList4.get(1)).intValue());
            yj0.a.e(obj3, decodeResource3, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveLikeConfettiPlugin", "setupConfig", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createScaledBitmap3 = android.graphics.Bitmap.createScaledBitmap(decodeResource3, i18, i18, true);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createScaledBitmap3, "createScaledBitmap(...)");
            android.content.res.Resources resources4 = viewGroup.getContext().getResources();
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.br6));
            arrayList5.add(resources4);
            java.lang.Object obj4 = new java.lang.Object();
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(obj4, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveLikeConfettiPlugin", "setupConfig", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource4 = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList5.get(0), ((java.lang.Integer) arrayList5.get(1)).intValue());
            yj0.a.e(obj4, decodeResource4, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveLikeConfettiPlugin", "setupConfig", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createScaledBitmap4 = android.graphics.Bitmap.createScaledBitmap(decodeResource4, i18, i18, true);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createScaledBitmap4, "createScaledBitmap(...)");
            android.content.res.Resources resources5 = viewGroup.getContext().getResources();
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(valueOf);
            arrayList6.add(resources5);
            java.lang.Object obj5 = new java.lang.Object();
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(obj5, arrayList6.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveLikeConfettiPlugin", "setupConfig", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource5 = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList6.get(0), ((java.lang.Integer) arrayList6.get(1)).intValue());
            yj0.a.e(obj5, decodeResource5, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveLikeConfettiPlugin", "setupConfig", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createScaledBitmap5 = android.graphics.Bitmap.createScaledBitmap(decodeResource5, i18, i18, true);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createScaledBitmap5, "createScaledBitmap(...)");
            android.content.res.Resources resources6 = viewGroup.getContext().getResources();
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.br8));
            arrayList7.add(resources6);
            java.lang.Object obj6 = new java.lang.Object();
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(obj6, arrayList7.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveLikeConfettiPlugin", "setupConfig", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource6 = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList7.get(0), ((java.lang.Integer) arrayList7.get(1)).intValue());
            yj0.a.e(obj6, decodeResource6, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveLikeConfettiPlugin", "setupConfig", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createScaledBitmap6 = android.graphics.Bitmap.createScaledBitmap(decodeResource6, i18, i18, true);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createScaledBitmap6, "createScaledBitmap(...)");
            arrayList.add(createScaledBitmap);
            arrayList.add(createScaledBitmap2);
            arrayList.add(createScaledBitmap3);
            arrayList.add(createScaledBitmap4);
            arrayList.add(createScaledBitmap5);
            arrayList.add(createScaledBitmap6);
        }
        java.util.ArrayList arrayList8 = this.f195330x;
        if (arrayList8.size() == 0) {
            android.content.res.Resources resources7 = viewGroup.getContext().getResources();
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList9.add(valueOf);
            arrayList9.add(resources7);
            java.lang.Object obj7 = new java.lang.Object();
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(obj7, arrayList9.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveLikeConfettiPlugin", "setupConfig", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource7 = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList9.get(0), ((java.lang.Integer) arrayList9.get(1)).intValue());
            yj0.a.e(obj7, decodeResource7, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveLikeConfettiPlugin", "setupConfig", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            int i19 = no0.i.f420260a;
            int i27 = no0.i.f420260a;
            android.graphics.Bitmap createScaledBitmap7 = android.graphics.Bitmap.createScaledBitmap(decodeResource7, i27, i27, true);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createScaledBitmap7, "createScaledBitmap(...)");
            android.content.res.Resources resources8 = viewGroup.getContext().getResources();
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            arrayList10.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.br9));
            arrayList10.add(resources8);
            java.lang.Object obj8 = new java.lang.Object();
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(obj8, arrayList10.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveLikeConfettiPlugin", "setupConfig", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource8 = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList10.get(0), ((java.lang.Integer) arrayList10.get(1)).intValue());
            yj0.a.e(obj8, decodeResource8, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveLikeConfettiPlugin", "setupConfig", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createScaledBitmap8 = android.graphics.Bitmap.createScaledBitmap(decodeResource8, i27, i27, true);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createScaledBitmap8, "createScaledBitmap(...)");
            arrayList8.add(createScaledBitmap7);
            arrayList8.add(createScaledBitmap8);
        }
    }

    public final void I1(java.util.List cheerIconInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cheerIconInfo, "cheerIconInfo");
        this.f195332y = new java.util.ArrayList();
        this.f195334z = new java.util.ArrayList();
        this.A = 0;
        java.util.LinkedList<r45.h30> linkedList = new java.util.LinkedList();
        linkedList.addAll(cheerIconInfo);
        for (r45.h30 h30Var : linkedList) {
            this.A += h30Var.m75939xb282bd08(1);
            java.lang.String m75945x2fec8307 = h30Var.m75945x2fec8307(0);
            int m75939xb282bd08 = h30Var.m75939xb282bd08(1);
            r45.mb4 mb4Var = new r45.mb4();
            mb4Var.set(9, com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(m75945x2fec8307));
            mb4Var.set(0, m75945x2fec8307);
            mb4Var.set(1, m75945x2fec8307);
            java.lang.String k17 = hc2.l.k(m75945x2fec8307);
            mb4Var.set(46, k17);
            mb4Var.set(47, k17);
            mn2.c1 c1Var = new mn2.c1(mb4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f, null, null, 12, null);
            mn2.g1 g1Var = mn2.g1.f411508a;
            wo0.c a17 = g1Var.e().a(c1Var);
            a17.g(g1Var.h(mn2.f1.f411486d));
            a17.f529406d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.lw(this, m75939xb282bd08);
            a17.a();
        }
    }

    public final void J1() {
        if (((mm2.c1) P0(mm2.c1.class)).E3.f411001a) {
            if (((mm2.c1) P0(mm2.c1.class)).E3.f411004d != 0) {
                I1(((mm2.c1) P0(mm2.c1.class)).E3.f411002b);
                return;
            }
            this.f195332y.clear();
            this.f195334z.clear();
            this.A = 0;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void K0(int i17) {
        ae2.in inVar = ae2.in.f85221a;
        if (((java.lang.Boolean) ((nb2.a) ((jz5.n) ae2.in.O5).mo141623x754a37bb()).r()).booleanValue()) {
            i17 = 8;
        }
        super.K0(i17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v59, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r10v15, types: [java.lang.Object] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        java.lang.String str;
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        java.lang.String string4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        super.M0(status, bundle);
        int ordinal = status.ordinal();
        if (ordinal == 7) {
            if (!((mm2.c1) P0(mm2.c1.class)).Q4) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f195320p, "startOtherMicUserTime: enableLikeMicAudience is false");
                return;
            }
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.b4) ((jz5.n) this.f195319l1).mo141623x754a37bb()).d();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.b4) ((jz5.n) this.f195319l1).mo141623x754a37bb();
            long j17 = this.G;
            b4Var.c(j17, j17);
            return;
        }
        km2.q qVar = null;
        if (ordinal == 8) {
            this.f195322p1.mo50303x856b99f0(this.C);
            this.f195322p1.mo50303x856b99f0(this.B);
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.b4) ((jz5.n) this.Y).mo141623x754a37bb()).d();
            this.X = null;
            this.R = 0L;
            this.F = false;
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.b4) ((jz5.n) this.f195319l1).mo141623x754a37bb()).d();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f195320p, "CLOSE_LIVE " + this + " ,postLikeWork:" + this.F);
            return;
        }
        if (ordinal == 32) {
            int i17 = bundle != null ? bundle.getInt("PARAM_LIVE_LIKE_CONFETTI_X") : 100;
            int i18 = bundle != null ? bundle.getInt("PARAM_LIVE_LIKE_CONFETTI_Y") : 100;
            boolean z17 = bundle != null ? bundle.getBoolean("PARAM_LIVE_LIKE_CONFETTI_FROM_SCREEN") : false;
            android.graphics.Bitmap G1 = G1();
            if (G1 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f195320p, "emitLikeConfettiToAnchor: bitmap is null");
            } else {
                x1(G1, i17, i18, z17, this.M, this.N, 1.0f);
            }
            this.E = true;
            if (this.W) {
                ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
                r0Var.getClass();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("trigger", 1);
                ml2.r0.hj(r0Var, ml2.b4.f408763g, null, 0L, jSONObject.toString(), null, null, null, null, 244, null);
                r0Var.f409417w++;
            }
            this.f195322p1.mo50303x856b99f0(this.B);
            this.f195322p1.mo50307xb9e94560(this.B, 1000L);
            return;
        }
        if (ordinal == 123) {
            if (!((mm2.c1) P0(mm2.c1.class)).F || pm0.v.z((int) ((mm2.c1) P0(mm2.c1.class)).f410399q, 512)) {
                K0(8);
                return;
            }
            K0(0);
            java.util.List<km2.q> list = ((mm2.o4) S0().a(mm2.o4.class)).f410860v;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-audienceLinkMicUserList>(...)");
            synchronized (list) {
                for (km2.q qVar2 : list) {
                    dk2.ga gaVar = (dk2.ga) ((java.util.LinkedHashMap) this.f195331x0).get(qVar2.f390708f);
                    if (gaVar != null) {
                        long j18 = qVar2.f390726x;
                        long j19 = gaVar.f315046a;
                        long j27 = gaVar.f315047b;
                        if (j18 > j19) {
                            gaVar.f315047b = j27 + (j18 - j19);
                            gaVar.f315046a = j18;
                        }
                    }
                }
            }
            long j28 = ((mm2.c1) S0().a(mm2.c1.class)).I1;
            if (j28 <= 0 || this.E) {
                return;
            }
            this.f195322p1.mo50311x7ab51103(this.f195322p1.mo50292x733c63a2(this.C, java.lang.Long.valueOf(j28)), 300L);
            return;
        }
        if (ordinal == 130) {
            boolean z18 = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR") : false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f195320p, "FINDER_LIVE_CLEAR_SCREEN isClear=" + z18);
            com.p314xaae8f345.mm.p997x94b162ad.SurfaceHolderCallbackC11316x2d046220 surfaceHolderCallbackC11316x2d046220 = this.f195327u;
            if (surfaceHolderCallbackC11316x2d046220 != null) {
                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z18);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(4);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(surfaceHolderCallbackC11316x2d046220, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "invisibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Integer.valueOf(intValue));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(surfaceHolderCallbackC11316x2d046220, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveLikeConfettiPlugin", "statusChange", "(Lcom/tencent/mm/live/plugin/ILiveStatus$LiveStatus;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                surfaceHolderCallbackC11316x2d046220.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(surfaceHolderCallbackC11316x2d046220, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveLikeConfettiPlugin", "statusChange", "(Lcom/tencent/mm/live/plugin/ILiveStatus$LiveStatus;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(surfaceHolderCallbackC11316x2d046220, "com/tencent/mm/kt/CommonKt", "invisibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ?? r07 = (android.view.View) pm0.v.E(valueOf, surfaceHolderCallbackC11316x2d046220);
                if (r07 == 0) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(0);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(surfaceHolderCallbackC11316x2d046220, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "invisibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(java.lang.Integer.valueOf(intValue2));
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(surfaceHolderCallbackC11316x2d046220, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveLikeConfettiPlugin", "statusChange", "(Lcom/tencent/mm/live/plugin/ILiveStatus$LiveStatus;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    surfaceHolderCallbackC11316x2d046220.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(surfaceHolderCallbackC11316x2d046220, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveLikeConfettiPlugin", "statusChange", "(Lcom/tencent/mm/live/plugin/ILiveStatus$LiveStatus;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    yj0.a.f(surfaceHolderCallbackC11316x2d046220, "com/tencent/mm/kt/CommonKt", "invisibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    surfaceHolderCallbackC11316x2d046220 = r07;
                }
                return;
            }
            return;
        }
        if (ordinal == 151) {
            this.W = true;
            this.f195322p1.mo50303x856b99f0(this.D);
            this.f195322p1.mo50307xb9e94560(this.D, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
            return;
        }
        if (ordinal == 187) {
            tn0.w0 w0Var = dk2.ef.f314911d;
            r10 = w0Var != null && w0Var.X();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f195320p, "FINDER_LIVE_JOIN_LIVE_SUCCESS inLinkMic=" + r10);
            C1(r10);
            return;
        }
        if (ordinal == 191) {
            boolean z19 = pm0.v.z(((mm2.c1) P0(mm2.c1.class)).f410340g2, 524288);
            boolean z27 = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", false) : false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f195320p, "FINDER_LIVE_MODE_SWITCH isLivePaused=" + z19 + " isAudioMode=" + z27);
            if (!z19 && !z27) {
                r10 = false;
            }
            C1(r10);
            return;
        }
        if (ordinal == 206) {
            if ((bundle == null || bundle.getBoolean("PARAM_FINDER_LIVE_LIKE_ENABLE", true)) ? false : true) {
                K0(8);
                return;
            } else {
                K0(0);
                return;
            }
        }
        if (ordinal == 199) {
            C1(true);
            return;
        }
        if (ordinal == 200) {
            C1(false);
            return;
        }
        switch (ordinal) {
            case 156:
                if (bundle == null || (str = bundle.getString("PARAM_FINDER_LIVE_HEAD_URL")) == null) {
                    str = "";
                }
                int i19 = bundle != null ? bundle.getInt("PARAM_LIVE_LIKE_CONFETTI_X") : 100;
                int i27 = bundle != null ? bundle.getInt("PARAM_LIVE_LIKE_CONFETTI_Y") : 100;
                this.Q.add(0, str);
                v1(i19, i27);
                return;
            case 157:
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(this, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.rv(this, bundle != null ? bundle.getInt("PARAM_LIVE_LIKE_CONFETTI_X") : 100, bundle != null ? bundle.getInt("PARAM_LIVE_LIKE_CONFETTI_Y") : 100, null), 3, null);
                return;
            case 158:
                if (bundle == null || (string = bundle.getString("PARAM_LIVE_SESSION_ID")) == null) {
                    return;
                }
                boolean z28 = bundle.getBoolean("PARAM_LIVE_LIKE_CONFETTI_FROM_SCREEN");
                dk2.ga gaVar2 = (dk2.ga) ((java.util.LinkedHashMap) this.f195331x0).get(string);
                if (gaVar2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f195320p, "emitLikeConfettiToOther: confettiModel is null");
                    return;
                } else {
                    gaVar2.a(S0().f354008i);
                    z1(gaVar2, z28);
                    return;
                }
            case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.e0.f33785x366c91de /* 159 */:
                if (bundle == null || (string2 = bundle.getString("PARAM_LIVE_SESSION_ID")) == null) {
                    return;
                }
                java.lang.String string5 = bundle.getString("PARAM_FINDER_LIVE_HEAD_URL");
                if (string5 != null && string5.length() != 0) {
                    r10 = false;
                }
                if (r10) {
                    return;
                }
                dk2.ga gaVar3 = (dk2.ga) ((java.util.LinkedHashMap) this.f195331x0).get(string2);
                if (gaVar3 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f195320p, "emitLikeConfettiToOther: confettiModel is null");
                    return;
                } else {
                    gaVar3.a(S0().f354008i);
                    w1(gaVar3, string5);
                    return;
                }
            case 160:
                if (bundle == null || (string3 = bundle.getString("PARAM_LIVE_SESSION_ID")) == null) {
                    return;
                }
                int i28 = bundle.getInt("PARAM_LIVE_LIKE_CONFETTI_X");
                int i29 = bundle.getInt("PARAM_LIVE_LIKE_CONFETTI_Y");
                float f17 = bundle.getFloat("PARAM_LIVE_LIKE_CONFETTI_DISPLAY_SCALE");
                dk2.ga gaVar4 = (dk2.ga) ((java.util.LinkedHashMap) this.f195331x0).get(string3);
                if (gaVar4 == null) {
                    java.util.List list2 = ((mm2.o4) P0(mm2.o4.class)).f410860v;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list2, "<get-audienceLinkMicUserList>(...)");
                    synchronized (list2) {
                        java.util.Iterator it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                ?? next = it.next();
                                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((km2.q) next).f390708f, string3)) {
                                    qVar = next;
                                }
                            }
                        }
                    }
                    km2.q qVar3 = qVar;
                    long j29 = qVar3 != null ? qVar3.f390726x : 0L;
                    this.f195331x0.put(string3, new dk2.ga(string3, j29, j29, 0L, 0L, 0, 0, 0.0f, false, null, 1016, null));
                    gaVar4 = (dk2.ga) ((java.util.LinkedHashMap) this.f195331x0).get(string3);
                }
                if (gaVar4 != null) {
                    gaVar4.f315049d = i28;
                }
                if (gaVar4 != null) {
                    gaVar4.f315050e = i29;
                }
                if (gaVar4 != null) {
                    gaVar4.f315051f = f17;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f195320p, "FINDER_LIVE_POST_LIKE_TO_OTHER_ADD_MIC_USER sessionId=".concat(string3));
                return;
            case 161:
                if (bundle == null || (string4 = bundle.getString("PARAM_LIVE_SESSION_ID")) == null) {
                    return;
                }
                this.f195331x0.remove(string4);
                return;
            default:
                return;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        super.O0();
        this.f195332y.clear();
        this.f195334z.clear();
        this.A = 0;
        this.V = true;
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.b4) ((jz5.n) this.Y).mo141623x754a37bb()).d();
        this.X = null;
        this.R = 0L;
        this.F = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f195320p, "unMount " + this + " ,postLikeWork:" + this.F);
        this.f195322p1.mo50303x856b99f0(this.C);
        this.f195322p1.mo50303x856b99f0(this.B);
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.b4) ((jz5.n) this.f195319l1).mo141623x754a37bb()).d();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l
    public void c1(boolean z17) {
        if (z17) {
            return;
        }
        this.f446856d.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iw(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return x0() ? !((mm2.g0) P0(mm2.g0.class)).T6() : ((mm2.g0) P0(mm2.g0.class)).U6();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return true;
    }

    public final void u1(int i17, int i18, int i19, int i27, int i28, java.lang.String str) {
        if (str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f195320p, "emitHighLightLike: headUrl is empty");
            return;
        }
        boolean D0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, c01.z1.r());
        android.view.ViewGroup viewGroup = this.f446856d;
        if (D0) {
            android.graphics.PointF pointF = new android.graphics.PointF(i17, i18);
            android.graphics.PointF pointF2 = new android.graphics.PointF(i19, i27);
            android.widget.ImageView imageView = new android.widget.ImageView(viewGroup.getContext());
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(imageView, str);
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(i28, i28);
            marginLayoutParams.setMarginStart(i17);
            marginLayoutParams.topMargin = i18;
            imageView.setLayoutParams(marginLayoutParams);
            B1().addView(imageView);
            imageView.setAlpha(0.0f);
            imageView.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gw(imageView, this, pointF, pointF2));
            return;
        }
        float f17 = i17;
        float f18 = i18;
        android.graphics.PointF pointF3 = new android.graphics.PointF(f17, f18);
        float f19 = i27;
        android.graphics.PointF pointF4 = new android.graphics.PointF(i19, f19);
        android.graphics.PointF pointF5 = new android.graphics.PointF(f17, f18 - ((f18 - f19) * 0.3f));
        android.graphics.PointF pointF6 = new android.graphics.PointF(i19 - F1(this.f195318J), f19);
        float f27 = pointF5.x;
        float f28 = pointF5.y - pointF6.y;
        if (f28 < 1.0f) {
            f28 = 1.0f;
        }
        int F1 = F1((int) (f28 / 2));
        float f29 = pointF6.y;
        float f37 = f29 + ((pointF5.y - f29) * 0.25f) + F1;
        float f38 = com.p314xaae8f345.mm.ui.bl.b(viewGroup.getContext()).x - i28;
        if (f27 > f38) {
            f27 = f38;
        }
        android.graphics.PointF pointF7 = new android.graphics.PointF(f27, f37);
        mn2.g1 g1Var = mn2.g1.f411508a;
        wo0.c b17 = g1Var.a().b(new mn2.n(str, null, 2, null), g1Var.h(mn2.f1.f411490h));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dw dwVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dw(this, i28, str, i17, i18, pointF3, pointF4, pointF5, pointF7, pointF6);
        b17.getClass();
        b17.f529406d = dwVar;
        b17.f();
    }

    public final void v1(int i17, int i18) {
        java.util.ArrayList arrayList = this.Q;
        if (arrayList.size() <= 0) {
            return;
        }
        java.lang.Object remove = arrayList.remove(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(remove, "removeAt(...)");
        u1(i17, i18, i17, this.K, this.I, (java.lang.String) remove);
    }

    public final void w1(dk2.ga gaVar, java.lang.String str) {
        float f17 = gaVar.f315051f;
        int i17 = (int) (this.I * f17);
        int i18 = i17 / 2;
        int i19 = gaVar.f315049d - i18;
        int i27 = gaVar.f315050e - i18;
        u1(i19, i27, i19, (int) (i27 - ((this.P * this.f195321p0) * f17)), i17, str);
    }

    public final void x1(android.graphics.Bitmap bitmap, int i17, int i18, boolean z17, float f17, float f18, float f19) {
        g51.a bVar;
        boolean z18 = pm0.v.z(((mm2.c1) P0(mm2.c1.class)).f410340g2, 524288);
        tn0.w0 w0Var = dk2.ef.f314911d;
        boolean z19 = false;
        boolean z27 = (z18 || (w0Var != null && w0Var.X()) || ((mm2.c1) P0(mm2.c1.class)).l7()) ? false : true;
        if (this.f195327u != null && z27) {
            z19 = true;
        }
        if (A1() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f195320p, "emitLikeConfettiToOther: confettiRoot is null");
            return;
        }
        e51.k kVar = new e51.k(i17, i18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qv qvVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qv(bitmap, z17, f19);
        zl2.b bVar2 = this.f195328v;
        android.content.Context context = this.f446856d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        if (z19) {
            android.widget.FrameLayout A1 = A1();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(A1, "<get-confettiRoot>(...)");
            bVar = new g51.c(A1);
        } else {
            bVar = new g51.b(A1());
        }
        e51.j a17 = bVar2.a(context, qvVar, kVar, bVar);
        a17.f(f17, f18);
        a17.d();
        if (!z19) {
            a17.g();
            return;
        }
        com.p314xaae8f345.mm.p997x94b162ad.SurfaceHolderCallbackC11316x2d046220 surfaceHolderCallbackC11316x2d046220 = this.f195327u;
        if (surfaceHolderCallbackC11316x2d046220 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f195320p, "emitLikeConfetti: confettiSurfaceRenderRoot is null, cannot add confetti");
            return;
        }
        if (surfaceHolderCallbackC11316x2d046220.f153892d) {
            if (surfaceHolderCallbackC11316x2d046220.getVisibility() != 0) {
                e51.e eVar = surfaceHolderCallbackC11316x2d046220.f153895g;
                if (eVar != null) {
                    android.os.Message obtain = android.os.Message.obtain();
                    obtain.what = 3;
                    eVar.sendMessage(obtain);
                    return;
                }
                return;
            }
            e51.e eVar2 = surfaceHolderCallbackC11316x2d046220.f153895g;
            if (eVar2 != null) {
                android.os.Message obtain2 = android.os.Message.obtain();
                obtain2.what = 2;
                obtain2.obj = a17;
                eVar2.sendMessage(obtain2);
            }
        }
    }

    public final java.lang.Object y1(android.graphics.Bitmap bitmap, int i17, int i18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        java.lang.Object poll = this.Z.poll();
        h0Var.f391656d = poll;
        if (poll == null) {
            android.widget.ImageView imageView = new android.widget.ImageView(this.f446856d.getContext());
            int i19 = no0.i.f420260a;
            int i27 = no0.i.f420260a;
            imageView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(i27, i27));
            h0Var.f391656d = imageView;
        }
        java.lang.Object element = h0Var.f391656d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(element, "element");
        android.widget.ImageView imageView2 = (android.widget.ImageView) element;
        imageView2.setImageBitmap(bitmap);
        imageView2.setAlpha(0.0f);
        imageView2.setScaleX(0.0f);
        imageView2.setScaleY(0.0f);
        imageView2.setRotation(0.0f);
        pm0.v.B(imageView2);
        A1().addView((android.view.View) h0Var.f391656d);
        ((android.widget.ImageView) h0Var.f391656d).setX(i17);
        ((android.widget.ImageView) h0Var.f391656d).setY(i18);
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(h0Var.f391656d, (android.util.Property<java.lang.Object, java.lang.Float>) android.view.View.SCALE_X, 0.0f, 1.5f, 1.3f);
        ofFloat.setDuration(400L);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(h0Var.f391656d, (android.util.Property<java.lang.Object, java.lang.Float>) android.view.View.SCALE_Y, 0.0f, 1.5f, 1.3f);
        ofFloat2.setDuration(400L);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(h0Var.f391656d, (android.util.Property<java.lang.Object, java.lang.Float>) android.view.View.ROTATION, -30.0f, 0.0f);
        ofFloat3.setDuration(400L);
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(h0Var.f391656d, (android.util.Property<java.lang.Object, java.lang.Float>) android.view.View.ALPHA, 0.0f, 1.0f);
        ofFloat4.setDuration(250L);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(h0Var.f391656d, (android.util.Property<java.lang.Object, java.lang.Float>) android.view.View.ALPHA, 1.0f, 0.0f);
        ofFloat5.setDuration(250L);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tv tvVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tv(this, h0Var);
        rVar.m(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.sv(animatorSet, ofFloat5, tvVar));
        animatorSet.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.uv(rVar, ofFloat5, this, tvVar));
        animatorSet.start();
        java.lang.Object j17 = rVar.j();
        return j17 == pz5.a.f440719d ? j17 : jz5.f0.f384359a;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        super.z0();
        this.V = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb44 = ((je2.h) P0(je2.h.class)).f380766f;
        c14227x4262fb44.f193193d = true;
        c14227x4262fb44.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hw(this));
    }

    public final void z1(dk2.ga gaVar, boolean z17) {
        java.util.ArrayList arrayList = this.f195329w;
        if (arrayList.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f195320p, "emitLikeConfettiToOther: confettiBitmaps is empty");
            return;
        }
        java.lang.Object obj = arrayList.get(F1(arrayList.size()));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        float f17 = gaVar.f315051f;
        int i17 = gaVar.f315049d;
        int i18 = this.H;
        int i19 = i17 - (i18 / 2);
        int i27 = gaVar.f315050e - (i18 / 2);
        float f18 = this.M;
        float f19 = this.f195321p0;
        x1(bitmap, i19, i27, z17, f18 * f19 * f17, this.N * f19 * f17, f17);
    }
}
