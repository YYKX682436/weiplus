package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabAudioFragment;", "Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabCommonFragment;", "Lwr3/v;", "wr3/w", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabAudioFragment */
/* loaded from: classes11.dex */
public final class C16898x9edd2407 extends com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.AbstractC16899xcafbd5ba<wr3.v> {

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f235957w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16915x1471bfda f235958x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16898x9edd2407(boolean z17, int i17, sr3.g config) {
        super(z17, i17, config);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        this.f235957w = "BizProfileTabAudioFragment";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.AbstractC16899xcafbd5ba
    public void F0(r45.wl bizProfileResp, r45.tj6 tj6Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizProfileResp, "bizProfileResp");
        bizProfileResp.E = tj6Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.AbstractC16899xcafbd5ba
    public boolean G0(vr3.h outBoxData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outBoxData, "outBoxData");
        return false;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16915x1471bfda J0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16915x1471bfda c16915x1471bfda = this.f235958x;
        if (c16915x1471bfda != null) {
            return c16915x1471bfda;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRecyclerView");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.AbstractC16899xcafbd5ba, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.AbstractC16894x4f59e657, zy2.h5
    public void P() {
        try {
            if (this.f235958x != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16915x1471bfda J0 = J0();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(J0, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabAudioFragment", "onAppBarLayoutExpand", "()V", "Undefined", "scrollToPosition", "(I)V");
                J0.a1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(J0, "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabAudioFragment", "onAppBarLayoutExpand", "()V", "Undefined", "scrollToPosition", "(I)V");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f235957w, "onAppBarLayoutExpand: recyclerView error: " + e17);
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inflater, "inflater");
        android.view.View inflate = inflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e3_, viewGroup, false);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.lqa);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f235958x = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16915x1471bfda) findViewById;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16915x1471bfda J0 = J0();
        android.content.Context mo7438x76847179 = mo7438x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo7438x76847179);
        J0.N(new wr3.w(mo7438x76847179));
        J0().mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(inflate.getContext()));
        android.os.Bundle m7436x8619eaa0 = m7436x8619eaa0();
        java.lang.String string = m7436x8619eaa0 != null ? m7436x8619eaa0.getString("contact") : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        this.f235944d = string;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(j0(), true);
        android.content.Context context = inflater.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(n17);
        this.f235965v = new wr3.v(context, j0(), this.f235959p, this.f235960q, this.f235963t, this.f235964u, this.f235961r, n17, this);
        ((wr3.v) r0()).f530433z.mo48813x58998cd();
        J0().mo7960x6cab2c8d(r0());
        J0().m67699xa386e40(new wr3.x(this));
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.AbstractC16899xcafbd5ba, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.mo7518x594b1124(view, bundle);
        p0(this.f235957w, new wr3.y(this), wr3.z.f530455d, new wr3.a0(this), new wr3.b0(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.AbstractC16899xcafbd5ba
    public java.util.ArrayList q0(r45.wl wlVar) {
        synchronized (this) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (wlVar != null) {
                r45.tj6 tj6Var = wlVar.E;
                if ((tj6Var != null ? tj6Var.f468043f : null) != null && !tj6Var.f468043f.f469886e.isEmpty()) {
                    return new java.util.ArrayList(wlVar.E.f468043f.f469886e);
                }
            }
            return arrayList;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.AbstractC16899xcafbd5ba
    /* renamed from: s0, reason: from getter */
    public java.lang.String getF235957w() {
        return this.f235957w;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.AbstractC16899xcafbd5ba
    public r45.tj6 t0(r45.wl bizProfileResp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizProfileResp, "bizProfileResp");
        return bizProfileResp.E;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.AbstractC16899xcafbd5ba
    public java.lang.String u0() {
        return "AudioList";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.AbstractC16899xcafbd5ba
    public p012xc85e97e9.p093xedfae76a.j0 w0(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1963x2eefaa.C16893x570516c7 dataFetcher) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataFetcher, "dataFetcher");
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.AbstractC16899xcafbd5ba
    public void x0(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1963x2eefaa.C16893x570516c7 n07 = n0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1963x2eefaa.C16893x570516c7.g(n07, n07.C, new vr3.m(n07), 6, gVar, n07.f235820r, null, 32, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.AbstractC16899xcafbd5ba
    public void y0(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1963x2eefaa.C16893x570516c7 dataFetcher, p012xc85e97e9.p093xedfae76a.k0 observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataFetcher, "dataFetcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        dataFetcher.f235820r.mo7806x9d92d11c(this, observer);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.AbstractC16899xcafbd5ba
    public void z0(wr3.f0 f0Var) {
        wr3.v adapter = (wr3.v) f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        adapter.f530433z.mo48814x2efc64();
    }
}
