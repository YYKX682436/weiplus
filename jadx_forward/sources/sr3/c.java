package sr3;

/* loaded from: classes11.dex */
public final class c implements sr3.g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f493367a;

    /* renamed from: b, reason: collision with root package name */
    public final long f493368b;

    /* renamed from: c, reason: collision with root package name */
    public final int f493369c;

    /* renamed from: d, reason: collision with root package name */
    public final sr3.f f493370d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f493371e;

    /* renamed from: f, reason: collision with root package name */
    public sr3.f f493372f;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 globalContext, boolean z17, long j17, int i17, sr3.f fVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(globalContext, "globalContext");
        this.f493367a = z17;
        this.f493368b = j17;
        this.f493369c = i17;
        this.f493370d = fVar;
        this.f493371e = new java.lang.ref.WeakReference(globalContext);
    }

    @Override // sr3.g
    public boolean a() {
        return this.f493367a;
    }

    @Override // sr3.g
    public int b() {
        return this.f493369c;
    }

    @Override // sr3.g
    public long c() {
        return this.f493368b;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0165  */
    @Override // sr3.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public sr3.d d(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 r23, com.p314xaae8f345.mm.p2621x8fb0427b.z3 r24, r45.wl r25, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1963x2eefaa.C16893x570516c7 r26, int r27, boolean r28, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 r29, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 r30, java.util.List r31) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sr3.c.d(com.tencent.mm.plugin.profile.ui.ContactInfoUI, com.tencent.mm.storage.z3, r45.wl, com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher, int, boolean, com.tencent.mm.plugin.profile.ui.tab.m0, androidx.fragment.app.Fragment, java.util.List):sr3.d");
    }

    @Override // sr3.g
    public java.util.List e(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 context, com.p314xaae8f345.mm.p2621x8fb0427b.z3 contact, r45.wl wlVar, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1963x2eefaa.C16893x570516c7 dataFetcher, int i17, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 m0Var, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d46702;
        java.util.LinkedList linkedList;
        r45.gl glVar;
        java.util.LinkedList linkedList2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataFetcher, "dataFetcher");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int intExtra = context.getIntent().getIntExtra("biz_profile_tab_type", 0);
        if (intExtra > 1) {
            intExtra = 0;
        }
        if (intExtra == 1) {
            if (((wlVar == null || (glVar = wlVar.f470770h) == null || (linkedList2 = glVar.f456856d) == null || !linkedList2.isEmpty()) ? false : true) && wlVar.f470779t != 1) {
                return arrayList;
            }
        }
        if (wlVar != null) {
            if (!wlVar.f470765J) {
                arrayList.add(new sr3.e(j(context, contact, wlVar, dataFetcher, i17, z17, m0Var), null, 0));
            }
            r45.tj6 tj6Var = wlVar.D;
            if (tj6Var != null && tj6Var.f468041d) {
                arrayList.add(new sr3.e(k(context, contact, wlVar, dataFetcher, i17, z17, m0Var), null, 1));
            }
            r45.tj6 tj6Var2 = wlVar.C;
            if (tj6Var2 != null && tj6Var2.f468041d) {
                arrayList.add(new sr3.e(h(context, contact, wlVar, dataFetcher, i17, z17, m0Var), null, 2));
            }
            r45.tj6 tj6Var3 = wlVar.E;
            if (tj6Var3 != null && tj6Var3.f468041d) {
                arrayList.add(new sr3.e(i(context, contact, wlVar, dataFetcher, i17, z17, m0Var), null, 3));
            }
            r45.gl glVar2 = wlVar.f470770h;
            boolean z18 = ((glVar2 == null || (linkedList = glVar2.f456856d) == null) ? false : linkedList.isEmpty() ^ true) && wlVar.f470779t == 0;
            boolean z19 = wlVar.f470779t == 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizAccountTypeConfig", "init, VideoTabType is " + wlVar.f470779t);
            if (z19) {
                if (componentCallbacksC1101xa17d4670 == null) {
                    zy2.ib ibVar = (zy2.ib) i95.n0.c(zy2.ib.class);
                    java.lang.String d17 = contact.d1();
                    long longExtra = context.getIntent().getLongExtra("finder_feed_id", 0L);
                    boolean z27 = this.f493367a;
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.q4) ibVar).getClass();
                    if (d17 == null) {
                        d17 = "";
                    }
                    componentCallbacksC1101xa17d46702 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.biz.C13680xb1b3046c(d17, longExtra, i17, z27);
                } else {
                    componentCallbacksC1101xa17d46702 = componentCallbacksC1101xa17d4670;
                }
                arrayList.add(new sr3.e(componentCallbacksC1101xa17d46702, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m_z), 4));
            } else if (z18) {
                arrayList.add(new sr3.e(l(context, contact, wlVar, dataFetcher, i17, m0Var), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572274ak3), 4));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b6  */
    @Override // sr3.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public sr3.f f(android.content.Context r22, com.p314xaae8f345.mm.p2621x8fb0427b.z3 r23) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sr3.c.f(android.content.Context, com.tencent.mm.storage.z3):sr3.f");
    }

    @Override // sr3.g
    public sr3.a g() {
        return sr3.a.f493362e;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.C16896x9c3648e7 h(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 context, com.p314xaae8f345.mm.p2621x8fb0427b.z3 contact, r45.wl bizProfileResp, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1963x2eefaa.C16893x570516c7 dataFetcher, int i17, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 m0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizProfileResp, "bizProfileResp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataFetcher, "dataFetcher");
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.C16896x9c3648e7 c16896x9c3648e7 = new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.C16896x9c3648e7(this.f493367a, i17, this);
        c16896x9c3648e7.f235946f = new r45.wl();
        c16896x9c3648e7.m0().C = bizProfileResp.C;
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String d17 = contact.d1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
        h73.e.d(bundle, "contact", d17);
        c16896x9c3648e7.mo7562xe26dab14(bundle);
        c16896x9c3648e7.B0(dataFetcher);
        c16896x9c3648e7.f235963t = this.f493368b;
        c16896x9c3648e7.f235948h = m0Var;
        c16896x9c3648e7.f235964u = z17;
        return c16896x9c3648e7;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.C16898x9edd2407 i(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 context, com.p314xaae8f345.mm.p2621x8fb0427b.z3 contact, r45.wl bizProfileResp, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1963x2eefaa.C16893x570516c7 dataFetcher, int i17, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 m0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizProfileResp, "bizProfileResp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataFetcher, "dataFetcher");
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.C16898x9edd2407 c16898x9edd2407 = new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.C16898x9edd2407(this.f493367a, i17, this);
        c16898x9edd2407.f235946f = new r45.wl();
        c16898x9edd2407.m0().E = bizProfileResp.E;
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String d17 = contact.d1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
        h73.e.d(bundle, "contact", d17);
        c16898x9edd2407.mo7562xe26dab14(bundle);
        c16898x9edd2407.B0(dataFetcher);
        c16898x9edd2407.f235963t = this.f493368b;
        c16898x9edd2407.f235948h = m0Var;
        c16898x9edd2407.f235964u = z17;
        return c16898x9edd2407;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.C16901x75950f2 j(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 context, com.p314xaae8f345.mm.p2621x8fb0427b.z3 contact, r45.wl bizProfileResp, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1963x2eefaa.C16893x570516c7 dataFetcher, int i17, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 m0Var) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizProfileResp, "bizProfileResp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataFetcher, "dataFetcher");
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.C16901x75950f2 c16901x75950f2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.C16901x75950f2(this);
        c16901x75950f2.f235970s = z17;
        r45.wl wlVar = new r45.wl();
        wlVar.f470768f = bizProfileResp.f470768f;
        wlVar.f470777r = bizProfileResp.f470777r;
        c16901x75950f2.f235946f = wlVar;
        r45.gl glVar = bizProfileResp.f470768f;
        r45.gl glVar2 = c16901x75950f2.f235973v;
        if (glVar != null && (linkedList = glVar.f456856d) != null && (linkedList2 = glVar2.f456856d) != null) {
            linkedList2.addAll(linkedList);
        }
        r45.gl glVar3 = bizProfileResp.f470768f;
        glVar2.f456859g = glVar3 != null ? glVar3.f456859g : null;
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String d17 = contact.d1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
        h73.e.d(bundle, "contact", d17);
        c16901x75950f2.mo7562xe26dab14(bundle);
        c16901x75950f2.f235971t = this.f493367a;
        c16901x75950f2.f235945e = dataFetcher;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = dataFetcher.f235811f;
        if (abstractActivityC21394xb3d2c0cf != null && (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2)) {
            gr3.c.f356384d.put(gr3.c.f356381a.a((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2) abstractActivityC21394xb3d2c0cf, "msglist"), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
        c16901x75950f2.n0().f235815m.mo7806x9d92d11c(c16901x75950f2, new wr3.d1(c16901x75950f2));
        c16901x75950f2.n0().f235816n.mo7806x9d92d11c(c16901x75950f2, new wr3.e1(c16901x75950f2));
        c16901x75950f2.n0().f235821s.mo7806x9d92d11c(c16901x75950f2, new wr3.f1(c16901x75950f2));
        c16901x75950f2.n0().f235822t.mo7806x9d92d11c(c16901x75950f2, new wr3.j1(c16901x75950f2));
        c16901x75950f2.n0().f235823u.mo7806x9d92d11c(c16901x75950f2, new wr3.k1(c16901x75950f2));
        c16901x75950f2.f235969r = this.f493368b;
        c16901x75950f2.f235948h = m0Var;
        c16901x75950f2.f235967p = this;
        return c16901x75950f2;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.C16902xea1741fb k(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 context, com.p314xaae8f345.mm.p2621x8fb0427b.z3 contact, r45.wl bizProfileResp, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1963x2eefaa.C16893x570516c7 dataFetcher, int i17, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 m0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizProfileResp, "bizProfileResp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataFetcher, "dataFetcher");
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.C16902xea1741fb c16902xea1741fb = new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.C16902xea1741fb(this.f493367a, i17, this);
        c16902xea1741fb.f235946f = new r45.wl();
        c16902xea1741fb.m0().D = bizProfileResp.D;
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String d17 = contact.d1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
        h73.e.d(bundle, "contact", d17);
        c16902xea1741fb.mo7562xe26dab14(bundle);
        c16902xea1741fb.B0(dataFetcher);
        c16902xea1741fb.f235963t = this.f493368b;
        c16902xea1741fb.f235948h = m0Var;
        c16902xea1741fb.f235964u = z17;
        return c16902xea1741fb;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.C16903x22327ac l(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 context, com.p314xaae8f345.mm.p2621x8fb0427b.z3 contact, r45.wl bizProfileResp, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1963x2eefaa.C16893x570516c7 dataFetcher, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 m0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizProfileResp, "bizProfileResp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataFetcher, "dataFetcher");
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.C16903x22327ac c16903x22327ac = new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.C16903x22327ac(this.f493367a, i17);
        c16903x22327ac.f235946f = new r45.wl();
        c16903x22327ac.m0().f470770h = bizProfileResp.f470770h;
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String d17 = contact.d1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
        h73.e.d(bundle, "contact", d17);
        c16903x22327ac.mo7562xe26dab14(bundle);
        c16903x22327ac.f235945e = dataFetcher;
        c16903x22327ac.n0().f235815m.mo7806x9d92d11c(c16903x22327ac, new wr3.c2(c16903x22327ac));
        c16903x22327ac.n0().f235817o.mo7806x9d92d11c(c16903x22327ac, new wr3.d2(c16903x22327ac));
        c16903x22327ac.f235948h = m0Var;
        return c16903x22327ac;
    }
}
