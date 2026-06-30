package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabMsgFragment;", "Lcom/tencent/mm/plugin/profile/ui/tab/list/BaseBizProfileFragment;", "wr3/u0", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabMsgFragment */
/* loaded from: classes11.dex */
public final class C16901x75950f2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.AbstractC16894x4f59e657 {

    /* renamed from: p, reason: collision with root package name */
    public sr3.g f235967p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f235968q;

    /* renamed from: r, reason: collision with root package name */
    public long f235969r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f235970s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f235971t;

    /* renamed from: u, reason: collision with root package name */
    public wr3.t0 f235972u;

    /* renamed from: v, reason: collision with root package name */
    public final r45.gl f235973v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.LinkedList f235974w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16920x131f5742 f235975x;

    public C16901x75950f2(sr3.g config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        this.f235967p = config;
        this.f235968q = "BizProfileTabMsgFragment";
        r45.gl glVar = new r45.gl();
        glVar.f456856d = new java.util.LinkedList();
        glVar.f456859g = new r45.ul();
        this.f235973v = glVar;
        this.f235974w = new java.util.LinkedList();
    }

    public static final java.util.ArrayList q0(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.C16901x75950f2 c16901x75950f2, r45.wl wlVar) {
        java.util.ArrayList arrayList;
        r45.vm vmVar;
        synchronized (c16901x75950f2) {
            arrayList = new java.util.ArrayList();
            if (wlVar != null && (vmVar = wlVar.f470777r) != null && !vmVar.f469886e.isEmpty()) {
                arrayList = new java.util.ArrayList(wlVar.f470777r.f469886e);
            }
        }
        return arrayList;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.AbstractC16894x4f59e657, zy2.h5
    public void P() {
        try {
            if (this.f235975x != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16920x131f5742 r07 = r0();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(r07, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabMsgFragment", "onAppBarLayoutExpand", "()V", "Undefined", "scrollToPosition", "(I)V");
                r07.a1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(r07, "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabMsgFragment", "onAppBarLayoutExpand", "()V", "Undefined", "scrollToPosition", "(I)V");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f235968q, "onAppBarLayoutExpand: recyclerView error: " + e17);
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inflater, "inflater");
        android.view.View inflate = inflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a1c, viewGroup, false);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.lqa);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f235975x = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16920x131f5742) findViewById;
        android.os.Bundle m7436x8619eaa0 = m7436x8619eaa0();
        java.lang.String string = m7436x8619eaa0 != null ? m7436x8619eaa0.getString("contact") : null;
        com.p314xaae8f345.mm.p2621x8fb0427b.e8 q17 = c01.d9.b().q();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) q17).n(string, true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16920x131f5742 r07 = r0();
        android.content.Context mo7438x76847179 = mo7438x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo7438x76847179);
        r07.N(new wr3.u0(mo7438x76847179));
        android.content.Context mo7438x768471792 = mo7438x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo7438x768471792);
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 m0Var = this.f235948h;
        int i17 = m0Var != null ? m0Var.f236000v : 0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(n17);
        this.f235972u = new wr3.t0(mo7438x768471792, i17, n17, this.f235969r, this.f235970s, this.f235971t, this.f235967p, "", this);
        r0().mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(inflate.getContext()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16920x131f5742 r08 = r0();
        wr3.t0 t0Var = this.f235972u;
        if (t0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mAdapter");
            throw null;
        }
        r08.mo7960x6cab2c8d(t0Var);
        wr3.t0 t0Var2 = this.f235972u;
        if (t0Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mAdapter");
            throw null;
        }
        t0Var2.D.mo48813x58998cd();
        ((java.util.HashSet) t0Var2.f530347d.f530355a).clear();
        android.content.Context context = t0Var2.f530412m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        int e17 = fq1.e.f347040a.e(context);
        int round = e17 - (java.lang.Math.round(es.h.b(context) * 8.0f) * 3);
        t0Var2.A = round / 2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(t0Var2.f530419t, "initLayoutParams: screenWidth=" + e17 + ", availableWidth=" + round + ", itemWidth=" + t0Var2.A);
        r0().m67699xa386e40(new wr3.v0(this));
        if (m0().f470768f != null) {
            wr3.t0 t0Var3 = this.f235972u;
            if (t0Var3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mAdapter");
                throw null;
            }
            r45.gl MsgList = m0().f470768f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(MsgList, "MsgList");
            t0Var3.N(MsgList, java.lang.Integer.valueOf(m0().f470768f.f456861i), m0().f470768f.f456860h, this.f235974w);
            if (mo7438x76847179() != null && (mo7438x76847179() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2)) {
                android.content.Context mo7438x768471793 = mo7438x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo7438x768471793, "null cannot be cast to non-null type com.tencent.mm.plugin.profile.ui.ContactInfoUI");
                java.lang.String a17 = gr3.c.f356381a.a((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2) mo7438x768471793, "msglist");
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = gr3.c.f356384d;
                java.lang.Long l17 = (java.lang.Long) concurrentHashMap.get(a17);
                if (l17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizProfileMonitor", "recordMsgListLoadEnd: startTime is null for " + a17);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(2127L, 31L, java.lang.System.currentTimeMillis() - l17.longValue(), false);
                    concurrentHashMap.remove(a17);
                }
            }
        }
        wr3.t0 t0Var4 = this.f235972u;
        if (t0Var4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mAdapter");
            throw null;
        }
        t0Var4.f530348e = new wr3.w0(this);
        p0(this.f235968q, new wr3.x0(this), new wr3.y0(this), new wr3.z0(this), new wr3.a1(this));
        wr3.t0 t0Var5 = this.f235972u;
        if (t0Var5 != null) {
            t0Var5.f530352i = new wr3.b1(this);
            return inflate;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mAdapter");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        super.mo7504xac79a11b();
        wr3.t0 t0Var = this.f235972u;
        if (t0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mAdapter");
            throw null;
        }
        t0Var.D.mo48814x2efc64();
        ((java.util.HashSet) t0Var.f530347d.f530355a).clear();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onPause */
    public void mo7512xb01dfb57() {
        super.mo7512xb01dfb57();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public void mo7517x57429eec() {
        super.mo7517x57429eec();
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16920x131f5742 r0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16920x131f5742 c16920x131f5742 = this.f235975x;
        if (c16920x131f5742 != null) {
            return c16920x131f5742;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRecyclerView");
        throw null;
    }

    public final boolean s0(r45.s5 msg, yz5.l primary, yz5.l fallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(primary, "primary");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fallback, "fallback");
        java.util.LinkedList linkedList = msg.f467047i.f464287e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(linkedList);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : linkedList) {
            if (!((java.lang.Boolean) primary.mo146xb9724478(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        if (!(arrayList.size() != linkedList.size())) {
            return false;
        }
        if (!arrayList.isEmpty()) {
            msg.f467047i.f464287e = new java.util.LinkedList(arrayList);
            return true;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : linkedList) {
            if (!((java.lang.Boolean) fallback.mo146xb9724478(obj2)).booleanValue()) {
                arrayList2.add(obj2);
            }
        }
        if (!(arrayList2.size() != linkedList.size()) || !(!arrayList2.isEmpty())) {
            return false;
        }
        msg.f467047i.f464287e = new java.util.LinkedList(arrayList2);
        return true;
    }
}
