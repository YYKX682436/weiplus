package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public class n extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y {

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f283883u = {553648177, 587202609};

    /* renamed from: v, reason: collision with root package name */
    public static final java.lang.String[] f283884v = {"msgId", "type", "createTime", "talker", "content", "isSend", "msgSvrId", "imgPath", "reserved", "flag", "status"};

    /* renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f283885s;

    /* renamed from: t, reason: collision with root package name */
    public final o11.g f283886t;

    public n(android.content.Context context) {
        super(context);
        this.f283885s = new java.util.concurrent.atomic.AtomicBoolean(false);
        o11.f fVar = new o11.f();
        fVar.f423624o = com.p314xaae8f345.mm.R.raw.f78439x49c3a51a;
        int b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 50);
        int b18 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 50);
        fVar.f423619j = b17;
        fVar.f423620k = b18;
        fVar.f423610a = true;
        this.f283886t = fVar.a();
    }

    public static java.util.Map p(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n nVar, java.util.List list) {
        nVar.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        if (!list.isEmpty() && !nVar.f283885s.get()) {
            java.lang.String X8 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).X8(nVar.f284075e);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            int i17 = 0;
            for (int i18 = 0; i18 < 11; i18++) {
                if (i18 > 0) {
                    sb6.append(",");
                }
                sb6.append(f283884v[i18]);
            }
            java.lang.String[] strArr = {"SELECT " + ((java.lang.Object) sb6) + " FROM " + X8 + " WHERE msgId IN (", ")"};
            java.lang.String str = strArr[0];
            java.lang.String str2 = strArr[1];
            int size = ((list.size() + 200) - 1) / 200;
            java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(size);
            while (i17 < list.size()) {
                int i19 = i17 + 200;
                int min = java.lang.Math.min(i19, list.size());
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                for (int i27 = i17; i27 < min; i27++) {
                    if (i27 > i17) {
                        sb7.append(",");
                    }
                    sb7.append(list.get(i27));
                }
                ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.d(nVar, str + sb7.toString() + str2, concurrentHashMap, countDownLatch));
                i17 = i19;
            }
            try {
                countDownLatch.await();
            } catch (java.lang.InterruptedException unused) {
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandHistoryListPresenter", "[perf] batchRawQuery:%dms, batches:%d, msgIds:%d, found:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(list.size()), java.lang.Integer.valueOf(concurrentHashMap.size()));
        }
        return concurrentHashMap;
    }

    public static void q(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n nVar, java.util.List list, java.util.Map map, com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var, java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue) {
        nVar.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (list.isEmpty() || nVar.f283885s.get()) {
            return;
        }
        int size = list.size();
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(((size + 50) - 1) / 50);
        int i17 = 0;
        while (i17 < size) {
            int i18 = i17 + 50;
            ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.e(nVar, i17, java.lang.Math.min(i18, size), list, map, a3Var, concurrentLinkedQueue, countDownLatch));
            i17 = i18;
        }
        try {
            countDownLatch.await();
        } catch (java.lang.InterruptedException unused) {
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandHistoryListPresenter", "[perf] Phase1c-parse:%dms, validItems:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(concurrentLinkedQueue.size()));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.l r(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n r12, com.p314xaae8f345.mm.p2621x8fb0427b.f9 r13, com.p314xaae8f345.mm.p2621x8fb0427b.a3 r14) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n.r(com.tencent.mm.ui.chatting.presenter.n, com.tencent.mm.storage.f9, com.tencent.mm.storage.a3):com.tencent.mm.ui.chatting.presenter.l");
    }

    @Override // zb5.h
    public void a(boolean z17) {
        o();
        this.f284076f.P(z17);
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.b(this), "HistoryLoadData");
    }

    @Override // zb5.h
    public java.lang.String b() {
        return this.f284074d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.icc);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.j0
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 c(android.view.ViewGroup viewGroup, int i17) {
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.m(this, android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.i_, viewGroup, false));
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
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.m mVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.m) e0Var;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.k kVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.k) h(i17);
        ot0.a aVar = (ot0.a) kVar.f283824k.y(ot0.a.class);
        if (aVar == null || aVar.f429899v != 1) {
            mVar.f283865m.setVisibility(8);
        } else {
            mVar.f283865m.setVisibility(0);
        }
        java.lang.String str = kVar.f283826m;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        o11.g gVar = this.f283886t;
        java.lang.String str2 = kVar.f283827n;
        if (K0) {
            mVar.f283866n.setVisibility(8);
            n11.a.b().h(str2, mVar.f283864i, gVar);
            return;
        }
        mVar.f283866n.setVisibility(0);
        android.widget.TextView textView = mVar.f279937g;
        java.lang.CharSequence text = textView.getText();
        android.widget.TextView textView2 = mVar.f283866n;
        textView2.setText(text);
        textView.setText(str);
        mVar.i(textView2, this.f284077g.f279966e);
        java.lang.String str3 = kVar.f283828o;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            n11.a.b().h(str2, mVar.f283864i, gVar);
        } else {
            l01.d0.f396294a.n(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.j(this, mVar, kVar), str3, null, ((ij1.j) ((k01.u0) i95.n0.c(k01.u0.class))).Bi(45, 45));
        }
    }

    @Override // zb5.h
    public java.lang.String g() {
        return this.f284074d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.icc);
    }

    @Override // zb5.h
    /* renamed from: getType */
    public int mo79812xfb85f7b0() {
        return 33;
    }

    @Override // zb5.h
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.i0 i() {
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.i(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y
    public int k() {
        return 6;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z
    /* renamed from: onDetach */
    public void mo79813x3f5eee52() {
        this.f283885s.set(true);
        super.mo79813x3f5eee52();
    }

    public final void s(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.k kVar, java.lang.String str) {
        java.lang.String d17 = te5.e2.d(pt0.f0.Li(this.f284075e, kVar.f279944d));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17) || !te5.e2.a(str, d17)) {
            return;
        }
        ot0.q qVar = kVar.f283824k;
        ot0.a aVar = (ot0.a) qVar.y(ot0.a.class);
        if (aVar == null) {
            aVar = new ot0.a();
            qVar.f(aVar);
        }
        aVar.R = d17;
    }
}
