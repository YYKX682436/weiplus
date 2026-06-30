package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabPicFragment;", "Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabCommonFragment;", "Lwr3/m1;", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabPicFragment */
/* loaded from: classes11.dex */
public final class C16902xea1741fb extends com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.AbstractC16899xcafbd5ba<wr3.m1> {

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f235976w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16914xdd3f84a5 f235977x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16902xea1741fb(boolean z17, int i17, sr3.g config) {
        super(z17, i17, config);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        this.f235976w = "BizProfileTabPicFragment";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.AbstractC16899xcafbd5ba
    public void A0(java.util.List msgList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgList, "msgList");
        if (mo7438x76847179() == null || !(mo7438x76847179() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2)) {
            return;
        }
        android.content.Context mo7438x76847179 = mo7438x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo7438x76847179, "null cannot be cast to non-null type com.tencent.mm.plugin.profile.ui.ContactInfoUI");
        gr3.c cVar = gr3.c.f356381a;
        java.lang.String a17 = gr3.c.f356381a.a((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2) mo7438x76847179, "piclist");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = gr3.c.f356384d;
        java.lang.Long l17 = (java.lang.Long) concurrentHashMap.get(a17);
        if (l17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizProfileMonitor", "recordPicMsgListLoadEnd: startTime is null for " + a17);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(2127L, 32L, java.lang.System.currentTimeMillis() - l17.longValue(), false);
            concurrentHashMap.remove(a17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.AbstractC16899xcafbd5ba
    public void C0() {
        if (n0().f235811f == null || !(n0().f235811f instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2)) {
            return;
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = n0().f235811f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(abstractActivityC21394xb3d2c0cf, "null cannot be cast to non-null type com.tencent.mm.plugin.profile.ui.ContactInfoUI");
        gr3.c cVar = gr3.c.f356381a;
        gr3.c.f356384d.put(gr3.c.f356381a.a((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2) abstractActivityC21394xb3d2c0cf, "piclist"), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.AbstractC16899xcafbd5ba
    public void F0(r45.wl bizProfileResp, r45.tj6 tj6Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizProfileResp, "bizProfileResp");
        bizProfileResp.D = tj6Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.AbstractC16899xcafbd5ba
    public boolean G0(vr3.h outBoxData) {
        r45.p5 p5Var;
        java.util.LinkedList linkedList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outBoxData, "outBoxData");
        r45.s5 s5Var = outBoxData.f521164a;
        return (s5Var != null && (p5Var = s5Var.f467047i) != null && (linkedList = p5Var.f464287e) != null && (linkedList.isEmpty() ^ true)) && ((r45.o5) s5Var.f467047i.f464287e.get(0)).f463456p == 8;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16914xdd3f84a5 J0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16914xdd3f84a5 c16914xdd3f84a5 = this.f235977x;
        if (c16914xdd3f84a5 != null) {
            return c16914xdd3f84a5;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.AbstractC16899xcafbd5ba, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.AbstractC16894x4f59e657, zy2.h5
    public void P() {
        try {
            if (this.f235977x != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16914xdd3f84a5 J0 = J0();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(J0, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabPicFragment", "onAppBarLayoutExpand", "()V", "Undefined", "scrollToPosition", "(I)V");
                J0.a1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(J0, "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabPicFragment", "onAppBarLayoutExpand", "()V", "Undefined", "scrollToPosition", "(I)V");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f235976w, "onAppBarLayoutExpand: recyclerView error: " + e17);
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inflater, "inflater");
        android.view.View inflate = inflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e3a, viewGroup, false);
        android.content.Context context = inflater.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16915x1471bfda(context);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.lqa);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f235977x = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16914xdd3f84a5) findViewById;
        J0().mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1(2, 1));
        J0().N(new wr3.k(J0().getContext()));
        android.os.Bundle m7436x8619eaa0 = m7436x8619eaa0();
        java.lang.String string = m7436x8619eaa0 != null ? m7436x8619eaa0.getString("contact") : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        this.f235944d = string;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(j0(), true);
        android.content.Context context2 = inflater.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(n17);
        this.f235965v = new wr3.m1(context2, j0(), this.f235959p, this.f235960q, this.f235963t, this.f235964u, this.f235961r, n17);
        wr3.m1 m1Var = (wr3.m1) r0();
        android.content.Context context3 = J0().getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
        int e17 = fq1.e.f347040a.e(context3);
        int round = java.lang.Math.round(es.h.b(context3) * 8.0f);
        int i17 = e17 - (round * 2);
        int i18 = i17 / 2;
        m1Var.f530370x = i18;
        m1Var.f530371y = (int) ((i18 * 3.0d) / 4.0d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizProfileTabPicAdapter", "initLayoutParams: screenWidth=" + e17 + ", spacing=" + round + ", availableWidth=" + i17 + ", itemWidth=" + m1Var.f530370x + ", itemHeight=" + m1Var.f530371y);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.y2 m7957x4145728 = J0().m7957x4145728();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m7957x4145728, "getRecycledViewPool(...)");
        m7957x4145728.e(0, 20);
        J0().m7971xa810ec34(m7957x4145728);
        J0().mo7960x6cab2c8d(r0());
        J0().m67696xa386e40(new wr3.n1(this));
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.AbstractC16899xcafbd5ba, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.mo7518x594b1124(view, bundle);
        p0(this.f235976w, new wr3.o1(this), new wr3.p1(this), new wr3.q1(this), new wr3.r1(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.AbstractC16899xcafbd5ba
    public java.util.ArrayList q0(r45.wl wlVar) {
        synchronized (this) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (wlVar != null) {
                r45.tj6 tj6Var = wlVar.D;
                if ((tj6Var != null ? tj6Var.f468043f : null) != null && !tj6Var.f468043f.f469886e.isEmpty()) {
                    J0().m67691x7e5a7937(true);
                    return new java.util.ArrayList(wlVar.D.f468043f.f469886e);
                }
            }
            return arrayList;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.AbstractC16899xcafbd5ba
    /* renamed from: s0, reason: from getter */
    public java.lang.String getF235976w() {
        return this.f235976w;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.AbstractC16899xcafbd5ba
    public r45.tj6 t0(r45.wl bizProfileResp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizProfileResp, "bizProfileResp");
        return bizProfileResp.D;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.AbstractC16899xcafbd5ba
    public java.lang.String u0() {
        return "PicTab";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.AbstractC16899xcafbd5ba
    public p012xc85e97e9.p093xedfae76a.j0 w0(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1963x2eefaa.C16893x570516c7 dataFetcher) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataFetcher, "dataFetcher");
        return dataFetcher.f235825w;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.AbstractC16899xcafbd5ba
    public void x0(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1963x2eefaa.C16893x570516c7 n07 = n0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1963x2eefaa.C16893x570516c7.g(n07, n07.B, new vr3.n(n07), 5, gVar, n07.f235819q, null, 32, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.AbstractC16899xcafbd5ba
    public void y0(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1963x2eefaa.C16893x570516c7 dataFetcher, p012xc85e97e9.p093xedfae76a.k0 observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataFetcher, "dataFetcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        dataFetcher.f235819q.mo7806x9d92d11c(this, observer);
    }
}
