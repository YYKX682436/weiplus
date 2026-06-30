package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public class o3 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y {

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f283937v = {1040187441, 1409286193, 1442840625};

    /* renamed from: w, reason: collision with root package name */
    public static final java.lang.String[] f283938w = {"msgId", "type", "createTime", "talker", "content", "isSend", "imgPath", "reserved", "flag", "status"};

    /* renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f283939s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f283940t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f283941u;

    public o3(android.content.Context context) {
        super(context);
        this.f283939s = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f283940t = new java.util.concurrent.ConcurrentHashMap();
        this.f283941u = new java.util.concurrent.ConcurrentHashMap();
    }

    public static java.util.Map p(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.o3 o3Var, java.util.List list) {
        o3Var.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        if (!list.isEmpty() && !o3Var.f283939s.get()) {
            java.lang.String X8 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).X8(o3Var.f284075e);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            int i17 = 0;
            for (int i18 = 0; i18 < 10; i18++) {
                if (i18 > 0) {
                    sb6.append(",");
                }
                sb6.append(f283938w[i18]);
            }
            java.lang.String[] strArr = {"SELECT " + ((java.lang.Object) sb6) + " FROM " + X8 + " WHERE msgId IN (", ")"};
            java.lang.String str = strArr[0];
            java.lang.String str2 = strArr[1];
            int size = ((list.size() + 100) - 1) / 100;
            java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(size);
            while (i17 < list.size()) {
                int i19 = i17 + 100;
                int min = java.lang.Math.min(i19, list.size());
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                for (int i27 = i17; i27 < min; i27++) {
                    if (i27 > i17) {
                        sb7.append(",");
                    }
                    sb7.append(list.get(i27));
                }
                ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.s3(o3Var, str + sb7.toString() + str2, concurrentHashMap, countDownLatch));
                i17 = i19;
            }
            try {
                countDownLatch.await();
            } catch (java.lang.InterruptedException unused) {
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicHistoryListPresenter", "[perf] batchRawQuery:%dms, batches:%d, msgIds:%d, found:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(list.size()), java.lang.Integer.valueOf(concurrentHashMap.size()));
        }
        return concurrentHashMap;
    }

    public static void q(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.o3 o3Var, java.util.List list, java.util.Map map, com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var, java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue) {
        o3Var.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (list.isEmpty() || o3Var.f283939s.get()) {
            return;
        }
        int size = list.size();
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(((size + 50) - 1) / 50);
        int i17 = 0;
        while (i17 < size) {
            int i18 = i17 + 50;
            ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.t3(o3Var, i17, java.lang.Math.min(i18, size), list, map, a3Var, concurrentLinkedQueue, countDownLatch));
            i17 = i18;
        }
        try {
            countDownLatch.await();
        } catch (java.lang.InterruptedException unused) {
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicHistoryListPresenter", "[perf] Phase1c-parse:%dms, validItems:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(concurrentLinkedQueue.size()));
    }

    public static com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.a4 r(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.o3 o3Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var) {
        o3Var.getClass();
        ot0.q v17 = ot0.q.v(f9Var.j());
        if (v17 == null) {
            return null;
        }
        int i17 = v17.f430199i;
        if (!(3 == i17 || i17 == 76 || i17 == 92)) {
            return null;
        }
        java.lang.String j17 = o3Var.j(f9Var, com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(o3Var.f284075e), false);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(j17, true);
        java.lang.String z07 = a3Var != null ? a3Var.z0(j17) : "";
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.a4 a4Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.a4(null);
        a4Var.f283642a = f9Var;
        a4Var.f283643b = v17;
        if (n17 != null) {
            j17 = n17.d1();
        }
        a4Var.f283644c = j17;
        a4Var.f283645d = n17 != null ? n17.f2() : "";
        a4Var.f283646e = n17 != null ? n17.w0() : "";
        a4Var.f283647f = z07;
        return a4Var;
    }

    @Override // zb5.h
    public void a(boolean z17) {
        o();
        this.f284076f.P(z17);
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.q3(this), "HistoryLoadData");
    }

    @Override // zb5.h
    public java.lang.String b() {
        return this.f284074d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571522hp);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.j0
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 c(android.view.ViewGroup viewGroup, int i17) {
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.c4(this, android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571128d34, viewGroup, false));
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.j0
    public void d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, int i18) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.j0
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 e(android.view.ViewGroup viewGroup, int i17) {
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.j0
    public void f(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.e0 e0Var, int i17, int i18) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.c4 c4Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.c4) e0Var;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.b4 b4Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.b4) h(i17);
        if (b4Var == null) {
            return;
        }
        c4Var.f279936f.setText(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.w6.c(this.f284074d, b4Var.f279941a));
        long j17 = b4Var.f279944d;
        c4Var.f283682n = j17;
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        android.graphics.Bitmap m07 = m11.b1.Di().m0(null, b4Var.f283662l, i65.a.g(this.f284074d), false);
        if (m07 == null || m07.isRecycled()) {
            android.graphics.Bitmap Di = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Di(b4Var.f283660j, 1, i65.a.g(this.f284074d));
            if (Di == null || Di.isRecycled()) {
                c4Var.f283680i.setImageResource(com.p314xaae8f345.mm.R.raw.f78435x7b83bce4);
            } else {
                c4Var.f283680i.setImageBitmap(Di);
            }
        } else {
            c4Var.f283680i.setImageBitmap(m07);
        }
        java.lang.String str = (java.lang.String) this.f283941u.get(java.lang.Long.valueOf(j17));
        if (str != null) {
            android.widget.TextView textView = c4Var.f283681m;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            textView.setText(str);
            c4Var.i(c4Var.f283681m, this.f284077g.f279966e);
        } else {
            android.widget.TextView textView2 = c4Var.f283681m;
            java.lang.String str2 = b4Var.f283665o;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str2 == null) {
                str2 = "";
            }
            textView2.setText(str2);
        }
        java.lang.String str3 = b4Var.f283663m;
        java.lang.String str4 = b4Var.f283664n;
        java.lang.String str5 = b4Var.f283665o;
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z3(this, str3, str4, str5, j17, b4Var, c4Var));
    }

    @Override // zb5.h
    public java.lang.String g() {
        return this.f284074d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571522hp);
    }

    @Override // zb5.h
    /* renamed from: getType */
    public int mo79812xfb85f7b0() {
        return 3;
    }

    @Override // zb5.h
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.i0 i() {
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.x3(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y
    public int k() {
        return 4;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z
    /* renamed from: onDetach */
    public void mo79813x3f5eee52() {
        this.f283939s.set(true);
        super.mo79813x3f5eee52();
    }
}
