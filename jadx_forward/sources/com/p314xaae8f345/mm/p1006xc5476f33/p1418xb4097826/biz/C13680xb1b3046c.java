package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.biz;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/biz/FinderBizProfileFragment;", "Lzy2/hb;", "Lzy2/h5;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderBaseGridFeedFragment;", "Lab2/g;", "Lab2/a;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment */
/* loaded from: classes2.dex */
public final class C13680xb1b3046c extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15117x9a4d16cb<ab2.g, ab2.a> implements zy2.hb, zy2.h5 {
    public static final /* synthetic */ int M = 0;
    public ab2.g A;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.biz.C13681xd53f292f B;
    public boolean C;
    public long D;
    public boolean E;
    public final jz5.g F;
    public final jz5.g G;
    public final jz5.g H;
    public final jz5.g I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f184294J;
    public final yz5.l K;
    public boolean L;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f184295u;

    /* renamed from: v, reason: collision with root package name */
    public final long f184296v;

    /* renamed from: w, reason: collision with root package name */
    public final int f184297w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f184298x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f184299y;

    /* renamed from: z, reason: collision with root package name */
    public ab2.a f184300z;

    public C13680xb1b3046c(java.lang.String bizUsername, long j17, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUsername, "bizUsername");
        this.f184295u = bizUsername;
        this.f184296v = j17;
        this.f184297w = i17;
        this.f184298x = z17;
        this.f184299y = jz5.h.b(new ab2.r(this));
        this.F = jz5.h.b(new ab2.t(this));
        this.G = jz5.h.b(new ab2.u(this));
        this.H = jz5.h.b(new ab2.v(this));
        this.I = jz5.h.b(new ab2.w(this));
        this.K = new ab2.y(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15117x9a4d16cb
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 A0() {
        ab2.g gVar = this.A;
        if (gVar != null) {
            return gVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01a7  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15117x9a4d16cb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C0(android.view.View r15) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.biz.C13680xb1b3046c.C0(android.view.View):void");
    }

    public final void G0(boolean z17) {
        if (J0().getVisibility() == 0) {
            android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0.0f, J0().getWidth(), 0.0f, 0.0f);
            translateAnimation.setDuration(300L);
            J0().startAnimation(translateAnimation);
            android.view.View J0 = J0();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(J0, arrayList.toArray(), "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment", "btnGone", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            J0.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(J0, "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment", "btnGone", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (!z17) {
                android.view.View K0 = K0();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(K0, arrayList2.toArray(), "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment", "btnGone", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                K0.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(K0, "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment", "btnGone", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View L0 = L0();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(L0, arrayList3.toArray(), "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment", "btnGone", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                L0.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(L0, "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment", "btnGone", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            this.L = false;
            H0().f184309o = false;
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.biz.C13681xd53f292f H0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.biz.C13681xd53f292f c13681xd53f292f = this.B;
        if (c13681xd53f292f != null) {
            return c13681xd53f292f;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedLoader");
        throw null;
    }

    public final android.view.View J0() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.F).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    public final android.view.View K0() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.G).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    public final android.view.View L0() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.H).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    public final void M0() {
        java.lang.String str;
        java.lang.String str2;
        int i17;
        long c17;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = y0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        if (V6 == null || (str = V6.m75945x2fec8307(0)) == null) {
            str = "";
        }
        if (V6 == null || (str2 = V6.m75945x2fec8307(1)) == null) {
            str2 = "";
        }
        int m75939xb282bd08 = V6 != null ? V6.m75939xb282bd08(7) : 0;
        java.lang.String valueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        boolean z17 = this.C;
        int i18 = !z17 ? 1 : 0;
        if (z17) {
            c17 = 0;
            i17 = m75939xb282bd08;
        } else {
            i17 = m75939xb282bd08;
            c17 = c01.id.c() - this.D;
        }
        jSONObject.put("biz_username", this.f184295u);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        g0Var.d(21874, str, str2, 119, java.lang.Integer.valueOf(i18), valueOf, xy2.c.f(V6), r26.i0.t(jSONObject2, ",", ";", false), "", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(c17));
    }

    public final void N0(java.lang.String str, int i17, int i18) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(ya.b.f77502x92235c1b, i18);
        jSONObject.put("watching_feedid", this.f184296v);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        java.lang.String stringExtra = y0().getIntent().getStringExtra("key_context_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(21875, Ri, stringExtra, 119, java.lang.Integer.valueOf(i17), java.lang.String.valueOf(java.lang.System.currentTimeMillis()), str, t17);
    }

    @Override // zy2.h5
    public boolean O() {
        return true;
    }

    @Override // zy2.h5
    public void P() {
        ab2.g gVar = this.A;
        if (gVar == null) {
            return;
        }
        if (gVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56022x4905e9fa = gVar.m56022x4905e9fa();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m56022x4905e9fa, arrayList.toArray(), "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment", "onAppBarLayoutExpand", "()V", "Undefined", "scrollToPosition", "(I)V");
        m56022x4905e9fa.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m56022x4905e9fa, "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment", "onAppBarLayoutExpand", "()V", "Undefined", "scrollToPosition", "(I)V");
    }

    public void P0() {
        ab2.g gVar = this.A;
        if (gVar == null) {
            return;
        }
        if (gVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = gVar.f187713m;
        if (gVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        c22801x87cbdc00.onStopNestedScroll(gVar.m56022x4905e9fa());
        if (this.C) {
            this.C = false;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = y0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
            if (nyVar != null) {
                nyVar.mo58437xaa858cb6();
            }
            M0();
        }
    }

    public void Q0() {
        if (this.C) {
            return;
        }
        if (this.f184300z == null) {
            this.E = true;
            return;
        }
        this.C = true;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = y0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        if (nyVar != null) {
            nyVar.mo58275xd317978f();
        }
        this.D = c01.id.c();
        M0();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    /* renamed from: getLayoutId */
    public int mo48065x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.aeb;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15117x9a4d16cb, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public void mo7517x57429eec() {
        super.mo7517x57429eec();
        H0().f184306i.b("biz-onResume");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onStop */
    public void mo7406xc39f8281() {
        super.mo7406xc39f8281();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = y0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        if (nyVar != null) {
            nyVar.mo47482x6fa9d635();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    public void q0(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.q0(set);
        if (((java.lang.Boolean) ((jz5.n) this.f184299y).mo141623x754a37bb()).booleanValue()) {
            set.remove(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14889x51ce1ce.class);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15117x9a4d16cb
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k0 z0() {
        ab2.a aVar = this.f184300z;
        if (aVar != null) {
            return aVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
        throw null;
    }
}
