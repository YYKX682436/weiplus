package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df;

/* loaded from: classes8.dex */
public class m2 {

    /* renamed from: a, reason: collision with root package name */
    public r45.in6 f256574a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.j f256575b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.C19226x5a0e667d f256576c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.l f256577d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f256578e = false;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f256579f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f256580g = new java.util.HashMap();

    public synchronized void a(int i17, java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewMgr", "addNegDocId begin: %s, %s", java.lang.Integer.valueOf(i17), str);
        s75.d.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.l2(this, i17, str), "addNegDocId");
    }

    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j jVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewMgr", "attachWebViewToActivity %s", java.lang.Integer.valueOf(jVar.hashCode()));
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.j jVar2 = this.f256575b;
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.C19226x5a0e667d c19226x5a0e667d = this.f256576c;
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.l lVar = this.f256577d;
        r45.in6 in6Var = this.f256574a;
        jVar.f256523h = jVar2;
        jVar.f256524i = c19226x5a0e667d;
        jVar.f256526m = lVar;
        lVar.f95859a = jVar;
        jVar.f256521f = in6Var;
        jVar2.f96377d = jVar;
        gm0.j1.d().a(2582, jVar2.f256743n);
        gm0.j1.d().a(2802, jVar2.f256742m);
        gm0.j1.d().a(2906, jVar2.f256741i);
        jVar.f256522g.addView(jVar.f256524i, new android.widget.FrameLayout.LayoutParams(-1, -1));
        jVar.f256524i.setOverScrollMode(0);
        this.f256575b = null;
        this.f256576c = null;
        this.f256577d = null;
        this.f256574a = null;
        this.f256578e = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01b4 A[Catch: Exception -> 0x01be, TRY_LEAVE, TryCatch #0 {Exception -> 0x01be, blocks: (B:24:0x0190, B:27:0x01ab, B:29:0x01b4), top: B:23:0x0190 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(r45.in6 r18, boolean r19, java.util.LinkedList r20) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.m2.c(r45.in6, boolean, java.util.LinkedList):void");
    }

    public void d(int i17, java.lang.String str) {
        this.f256580g.put(java.lang.Integer.valueOf(i17), str);
        try {
            byte[] bytes = str.getBytes(com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(pm4.w.h());
            java.lang.String str2 = a17.f294812f;
            if (str2 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
                com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, m17);
                if (m18.a()) {
                    m18.f294799a.r(m18.f294800b);
                }
            }
            com.p314xaae8f345.mm.vfs.w6.R(pm4.w.h() + i17, bytes);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewMgr", "putNegDataCache write data key: %d length: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(bytes.length));
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TopStory.TopStoryWebViewMgr", e17, "putNegDataCache", new java.lang.Object[0]);
        }
    }
}
