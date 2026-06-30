package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoFragment;", "Lcom/tencent/mm/plugin/profile/ui/tab/list/BaseBizProfileFragment;", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabVideoFragment */
/* loaded from: classes11.dex */
public final class C16903x22327ac extends com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.AbstractC16894x4f59e657 {

    /* renamed from: p, reason: collision with root package name */
    public final boolean f235978p;

    /* renamed from: q, reason: collision with root package name */
    public final int f235979q;

    /* renamed from: r, reason: collision with root package name */
    public wr3.z1 f235980r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.List f235981s = new java.util.ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16915x1471bfda f235982t;

    public C16903x22327ac(boolean z17, int i17) {
        this.f235978p = z17;
        this.f235979q = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.AbstractC16894x4f59e657, zy2.h5
    public void P() {
        if (this.f235982t == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16915x1471bfda q07 = q0();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(q07, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoFragment", "onAppBarLayoutExpand", "()V", "Undefined", "scrollToPosition", "(I)V");
        q07.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(q07, "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoFragment", "onAppBarLayoutExpand", "()V", "Undefined", "scrollToPosition", "(I)V");
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inflater, "inflater");
        android.view.View inflate = inflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a1e, viewGroup, false);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.lqa);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f235982t = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16915x1471bfda) findViewById;
        q0().mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(mo7430x19263085()));
        android.os.Bundle m7436x8619eaa0 = m7436x8619eaa0();
        java.lang.String string = m7436x8619eaa0 != null ? m7436x8619eaa0.getString("contact") : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        this.f235944d = string;
        this.f235980r = new wr3.z1(this.f235981s, j0(), this.f235978p, this.f235979q);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.y2 m7957x4145728 = q0().m7957x4145728();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m7957x4145728, "getRecycledViewPool(...)");
        m7957x4145728.e(0, 20);
        q0().m7971xa810ec34(m7957x4145728);
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16915x1471bfda q07 = q0();
        wr3.z1 z1Var = this.f235980r;
        if (z1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mVideoAdapter");
            throw null;
        }
        q07.mo7960x6cab2c8d(z1Var);
        q0().m67699xa386e40(new wr3.a2(this));
        return inflate;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        java.util.LinkedList linkedList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.mo7518x594b1124(view, bundle);
        java.util.List list = this.f235981s;
        if (((java.util.ArrayList) list).isEmpty()) {
            r45.gl glVar = m0().f470770h;
            boolean z17 = false;
            if (glVar != null && (linkedList = glVar.f456856d) != null && (!linkedList.isEmpty())) {
                z17 = true;
            }
            if (z17) {
                java.util.LinkedList Msg = m0().f470770h.f456856d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Msg, "Msg");
                ((java.util.ArrayList) list).addAll(Msg);
                wr3.z1 z1Var = this.f235980r;
                if (z1Var == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mVideoAdapter");
                    throw null;
                }
                z1Var.m8146xced61ae5();
            }
        }
        wr3.z1 z1Var2 = this.f235980r;
        if (z1Var2 != null) {
            z1Var2.f530464n = new wr3.b2(this);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mVideoAdapter");
            throw null;
        }
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16915x1471bfda q0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16915x1471bfda c16915x1471bfda = this.f235982t;
        if (c16915x1471bfda != null) {
            return c16915x1471bfda;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRecyclerView");
        throw null;
    }
}
