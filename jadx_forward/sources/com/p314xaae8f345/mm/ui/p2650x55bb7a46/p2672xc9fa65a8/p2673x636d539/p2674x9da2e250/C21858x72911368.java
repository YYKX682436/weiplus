package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2672xc9fa65a8.p2673x636d539.p2674x9da2e250;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiNormalResultFragment;", "Lcom/tencent/mm/ui/component/UIComponentFragment;", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiNormalResultFragment */
/* loaded from: classes9.dex */
public final class C21858x72911368 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639 {

    /* renamed from: n, reason: collision with root package name */
    public final int f284214n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f284215o;

    /* renamed from: p, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f284216p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f284217q;

    /* renamed from: r, reason: collision with root package name */
    public zd5.n f284218r;

    /* renamed from: s, reason: collision with root package name */
    public int f284219s;

    public C21858x72911368(int i17) {
        this.f284214n = i17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    /* renamed from: getLayoutId */
    public int mo48065x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bcq;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    /* renamed from: l0 */
    public java.util.Set getF204828n() {
        return kz5.r0.f395535d;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    public void o0() {
        p012xc85e97e9.p093xedfae76a.g0 g0Var;
        yj0.a.a("com/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiNormalResultFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleFocused", "()V", this);
        super.o0();
        ee5.t2 s07 = s0();
        boolean z17 = ((s07 == null || (g0Var = s07.f333586i) == null) ? null : (ae5.n) g0Var.mo3195x754a37bb()) == ae5.n.f85967f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiNormalResultFragment", "onUserVisibleFocused >> " + this.f284214n + ", " + z17 + ", " + this.f284219s);
        if (z17) {
            de5.a aVar = de5.a.f310929a;
            int i17 = this.f284219s;
            p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = mo7430x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo7430x19263085);
            pf5.z zVar = pf5.z.f435481a;
            if (!(mo7430x19263085 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            int R6 = ((ee5.z) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) mo7430x19263085).a(ee5.z.class)).R6();
            p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x192630852 = mo7430x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo7430x192630852);
            pf5.z zVar2 = pf5.z.f435481a;
            if (!(mo7430x192630852 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            aVar.h(i17, R6, ((ee5.z) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) mo7430x192630852).a(ee5.z.class)).P6());
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiNormalResultFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleFocused", "()V");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        p012xc85e97e9.p093xedfae76a.g0 g0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inflater, "inflater");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCreateView >> resultType: ");
        int i17 = this.f284214n;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiNormalResultFragment", sb6.toString());
        if (this.f284215o == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiNormalResultFragment", "onCreateView >> inflate view resultType: " + i17);
            android.view.View mo7503x18bad100 = super.mo7503x18bad100(inflater, viewGroup, bundle);
            this.f284215o = mo7503x18bad100;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = mo7503x18bad100 != null ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) mo7503x18bad100.findViewById(com.p314xaae8f345.mm.R.id.gg6) : null;
            this.f284216p = c1163xf1deaba4;
            if (c1163xf1deaba4 != null) {
                c1163xf1deaba4.setOnTouchListener(new be5.d(this));
            }
            android.view.View view = this.f284215o;
            this.f284217q = view != null ? (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.kcl) : null;
            ee5.t2 s07 = s0();
            if (((s07 == null || (g0Var = s07.f333586i) == null) ? null : (ae5.n) g0Var.mo3195x754a37bb()) == ae5.n.f85967f) {
                ee5.t2 s08 = s0();
                r0(s08 != null ? s08.f333587m : null);
            }
            ee5.t2 s09 = s0();
            p012xc85e97e9.p093xedfae76a.g0 g0Var2 = s09 != null ? s09.f333586i : null;
            if (g0Var2 != null) {
                g0Var2.mo7806x9d92d11c(this, new be5.c(this));
            }
        }
        return this.f284215o;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    public void p0() {
        yj0.a.a("com/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiNormalResultFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleUnFocused", "()V", this);
        super.p0();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiNormalResultFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleUnFocused", "()V");
    }

    public final void r0(java.util.ArrayList arrayList) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dealResult >> ");
        sb6.append(this.f284214n);
        sb6.append(", ");
        boolean z17 = true;
        sb6.append(arrayList == null || arrayList.isEmpty());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiNormalResultFragment", sb6.toString());
        int size = arrayList != null ? arrayList.size() : 0;
        this.f284219s = size;
        de5.a aVar = de5.a.f310929a;
        pf5.u uVar = pf5.u.f435469a;
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = mo7430x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo7430x19263085);
        int R6 = ((ee5.z) uVar.b(mo7430x19263085).a(ee5.z.class)).R6();
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x192630852 = mo7430x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo7430x192630852);
        aVar.h(size, R6, ((ee5.z) uVar.b(mo7430x192630852).a(ee5.z.class)).P6());
        if (arrayList != null && !arrayList.isEmpty()) {
            z17 = false;
        }
        if (z17) {
            android.widget.TextView textView = this.f284217q;
            if (textView != null) {
                ee5.t2 s07 = s0();
                textView.setText(s07 != null ? s07.O6() : null);
            }
            android.widget.TextView textView2 = this.f284217q;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f284216p;
            if (c1163xf1deaba4 == null) {
                return;
            }
            c1163xf1deaba4.setVisibility(8);
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f284216p;
        if (c1163xf1deaba42 != null) {
            c1163xf1deaba42.setVisibility(0);
        }
        android.widget.TextView textView3 = this.f284217q;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        zd5.n nVar = this.f284218r;
        if (nVar == null) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = this.f284216p;
            if (c1163xf1deaba43 != null) {
                c1163xf1deaba43.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(mo7430x19263085()));
            }
            ee5.t2 s08 = s0();
            zd5.n P6 = s08 != null ? s08.P6() : null;
            this.f284218r = P6;
            if (P6 != null) {
                p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x192630853 = mo7430x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo7430x192630853);
                java.lang.String query = ((ee5.e3) uVar.b(mo7430x192630853).a(ee5.e3.class)).f333403f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiNormalResultAdapter", "updateCurrentQuery >> ".concat(query));
                P6.f553235g = query;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba44 = this.f284216p;
            if (c1163xf1deaba44 == null) {
                return;
            }
            c1163xf1deaba44.mo7960x6cab2c8d(this.f284218r);
            return;
        }
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x192630854 = mo7430x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo7430x192630854);
        java.lang.String query2 = ((ee5.e3) uVar.b(mo7430x192630854).a(ee5.e3.class)).f333403f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query2, "query");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiNormalResultAdapter", "updateCurrentQuery >> ".concat(query2));
        nVar.f553235g = query2;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba45 = this.f284216p;
        if (c1163xf1deaba45 != null) {
            c1163xf1deaba45.mo7960x6cab2c8d(null);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba46 = this.f284216p;
        if (c1163xf1deaba46 != null) {
            c1163xf1deaba46.mo7960x6cab2c8d(this.f284218r);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba47 = this.f284216p;
        if (c1163xf1deaba47 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(c1163xf1deaba47, arrayList2.toArray(), "com/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiNormalResultFragment", "dealResult", "(Ljava/util/ArrayList;)V", "Undefined", "scrollToPosition", "(I)V");
            c1163xf1deaba47.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(c1163xf1deaba47, "com/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiNormalResultFragment", "dealResult", "(Ljava/util/ArrayList;)V", "Undefined", "scrollToPosition", "(I)V");
        }
    }

    public final ee5.t2 s0() {
        switch (this.f284214n) {
            case 1:
                p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = mo7430x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo7430x19263085);
                pf5.z zVar = pf5.z.f435481a;
                if (mo7430x19263085 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) {
                    return (ee5.t2) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) mo7430x19263085).a(ee5.v0.class);
                }
                throw new java.lang.IllegalStateException("Check failed.".toString());
            case 2:
                p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x192630852 = mo7430x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo7430x192630852);
                pf5.z zVar2 = pf5.z.f435481a;
                if (mo7430x192630852 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) {
                    return (ee5.t2) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) mo7430x192630852).a(ee5.m2.class);
                }
                throw new java.lang.IllegalStateException("Check failed.".toString());
            case 3:
                p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x192630853 = mo7430x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo7430x192630853);
                pf5.z zVar3 = pf5.z.f435481a;
                if (mo7430x192630853 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) {
                    return (ee5.t2) zVar3.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) mo7430x192630853).a(ee5.n1.class);
                }
                throw new java.lang.IllegalStateException("Check failed.".toString());
            case 4:
                p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x192630854 = mo7430x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo7430x192630854);
                pf5.z zVar4 = pf5.z.f435481a;
                if (mo7430x192630854 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) {
                    return (ee5.t2) zVar4.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) mo7430x192630854).a(ee5.v1.class);
                }
                throw new java.lang.IllegalStateException("Check failed.".toString());
            case 5:
                p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x192630855 = mo7430x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo7430x192630855);
                pf5.z zVar5 = pf5.z.f435481a;
                if (mo7430x192630855 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) {
                    return (ee5.t2) zVar5.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) mo7430x192630855).a(ee5.n0.class);
                }
                throw new java.lang.IllegalStateException("Check failed.".toString());
            case 6:
                p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x192630856 = mo7430x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo7430x192630856);
                pf5.z zVar6 = pf5.z.f435481a;
                if (mo7430x192630856 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) {
                    return (ee5.t2) zVar6.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) mo7430x192630856).a(ee5.h2.class);
                }
                throw new java.lang.IllegalStateException("Check failed.".toString());
            case 7:
                p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x192630857 = mo7430x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo7430x192630857);
                pf5.z zVar7 = pf5.z.f435481a;
                if (mo7430x192630857 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) {
                    return (ee5.t2) zVar7.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) mo7430x192630857).a(ee5.d1.class);
                }
                throw new java.lang.IllegalStateException("Check failed.".toString());
            case 8:
                p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x192630858 = mo7430x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo7430x192630858);
                pf5.z zVar8 = pf5.z.f435481a;
                if (mo7430x192630858 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) {
                    return (ee5.t2) zVar8.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) mo7430x192630858).a(ee5.a2.class);
                }
                throw new java.lang.IllegalStateException("Check failed.".toString());
            case 9:
                p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x192630859 = mo7430x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo7430x192630859);
                pf5.z zVar9 = pf5.z.f435481a;
                if (mo7430x192630859 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) {
                    return (ee5.t2) zVar9.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) mo7430x192630859).a(ee5.i1.class);
                }
                throw new java.lang.IllegalStateException("Check failed.".toString());
            case 10:
                p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x1926308510 = mo7430x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo7430x1926308510);
                pf5.z zVar10 = pf5.z.f435481a;
                if (mo7430x1926308510 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) {
                    return (ee5.t2) zVar10.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) mo7430x1926308510).a(ee5.s1.class);
                }
                throw new java.lang.IllegalStateException("Check failed.".toString());
            default:
                return null;
        }
    }
}
