package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public abstract class l extends qo0.a implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0, p012xc85e97e9.p093xedfae76a.y {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f194857f;

    /* renamed from: g, reason: collision with root package name */
    public final qo0.c f194858g;

    /* renamed from: h, reason: collision with root package name */
    public final r45.qt2 f194859h;

    /* renamed from: i, reason: collision with root package name */
    public int f194860i;

    /* renamed from: m, reason: collision with root package name */
    public int f194861m;

    /* renamed from: n, reason: collision with root package name */
    public final int f194862n;

    /* renamed from: o, reason: collision with root package name */
    public p012xc85e97e9.p093xedfae76a.b0 f194863o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.view.ViewGroup vg6, qo0.c liveStatus, r45.qt2 qt2Var) {
        super(vg6, liveStatus);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vg6, "vg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveStatus, "liveStatus");
        this.f194857f = vg6;
        this.f194858g = liveStatus;
        this.f194859h = qt2Var;
        this.f194860i = this.f446856d.getVisibility();
        this.f194861m = 65535;
        ae2.in inVar = ae2.in.f85221a;
        this.f194862n = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85365o3).mo141623x754a37bb()).r()).intValue();
        this.f194863o = new p012xc85e97e9.p093xedfae76a.b0(this, true);
    }

    public static void b1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar, android.view.View view, java.lang.String tag, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: notify2ChangeCommentHeight");
        }
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        lVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        if (lVar.x0()) {
            return;
        }
        if (view != null) {
            view.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.j(view, tag, lVar));
        } else {
            lVar.f446856d.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.k(tag, z17, lVar));
        }
    }

    public static /* synthetic */ void q1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar, java.lang.String str, java.lang.Object obj, int i17, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postPortraitAction");
        }
        if ((i17 & 2) != 0) {
            obj = null;
        }
        lVar.p1(str, obj);
    }

    public static /* synthetic */ void s1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar, java.lang.String str, java.lang.Object obj, int i17, int i18, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postPortraitActionDelay");
        }
        if ((i18 & 2) != 0) {
            obj = null;
        }
        if ((i18 & 4) != 0) {
            i17 = android.view.ViewConfiguration.getJumpTapTimeout();
        }
        lVar.r1(str, obj, i17);
    }

    public void B(android.os.Bundle bundle, java.lang.Object obj, long j17) {
    }

    @Override // qo0.a
    public void E0(int i17) {
    }

    @Override // qo0.a
    public void K0(int i17) {
        this.f194860i = i17;
        if (k()) {
            android.content.Context context = R0().getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            if (((pl2.x) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(pl2.x.class)).f438216f && G()) {
                i17 = T0();
            } else if (r() && this.f194861m == 8) {
                i17 = T0();
            }
        } else {
            i17 = 8;
        }
        android.view.ViewGroup viewGroup = this.f446856d;
        viewGroup.setVisibility(i17);
        if (i17 == 0) {
            viewGroup.setAlpha(1.0f);
        }
    }

    @Override // qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.i.f194418a[status.ordinal()] == 1) {
            n1();
        }
    }

    @Override // qo0.a
    public void O0() {
        this.f194863o.i(p012xc85e97e9.p093xedfae76a.n.DESTROYED);
    }

    public p012xc85e97e9.p093xedfae76a.c1 P0(java.lang.Class bu6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bu6, "bu");
        return S0().a(bu6);
    }

    public final void Q0() {
        android.content.Context context = R0().getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (((pl2.x) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(pl2.x.class)).f438216f && G()) {
            return;
        }
        if (r() && this.f194861m == 8) {
            return;
        }
        K0(this.f194860i);
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 R0() {
        qo0.c cVar = this.f194858g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) cVar;
    }

    public final gk2.e S0() {
        qo0.c cVar = this.f194858g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) cVar).m57654xd7793f26();
    }

    public int T0() {
        return 8;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703 U0(java.lang.Class modelClass) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modelClass, "modelClass");
        qo0.c cVar = this.f194858g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = cVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) cVar : null;
        if (k0Var != null) {
            return k0Var.mo57658x143f1b92(modelClass);
        }
        return null;
    }

    public final km2.m V0() {
        qo0.c cVar = this.f194858g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) cVar).m57663xfb7e5820();
    }

    public final dk2.xf W0() {
        return dk2.ef.f314905a.j(R0());
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l X0(java.lang.Class modelClass) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modelClass, "modelClass");
        qo0.c cVar = this.f194858g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = cVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) cVar : null;
        if (k0Var != null) {
            return k0Var.mo57682x2a5e9229(modelClass);
        }
        return null;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 Y0() {
        qo0.c cVar = this.f194858g;
        if (cVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) cVar;
        }
        return null;
    }

    public final tn0.w0 Z0() {
        qo0.c cVar = this.f194858g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = cVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) cVar : null;
        if (k0Var != null) {
            return k0Var.mo57476xdd07d18e();
        }
        return null;
    }

    public boolean a1() {
        android.content.Context context = this.f194857f.getContext();
        if (context == null || !(context instanceof android.app.Activity)) {
            return false;
        }
        android.app.Activity activity = (android.app.Activity) context;
        return activity.isDestroyed() | activity.isFinishing();
    }

    public void c1(boolean z17) {
    }

    public void d1(boolean z17) {
        if (this.f194862n == 1) {
            android.view.ViewGroup viewGroup = this.f446856d;
            viewGroup.forceHasOverlappingRendering(viewGroup.hasOverlappingRendering());
        }
        if (z17) {
            K0(this.f194860i);
        }
    }

    public void e1(boolean z17) {
        if (this.f194862n == 1) {
            this.f446856d.forceHasOverlappingRendering(false);
        }
        if (z17) {
            return;
        }
        K0(this.f194860i);
    }

    public void f1(float f17) {
        if (this.f194862n == 1) {
            this.f446856d.setAlpha(f17);
        }
    }

    public void g1(android.content.res.Configuration configuration) {
    }

    @Override // p012xc85e97e9.p093xedfae76a.y
    /* renamed from: getLifecycle */
    public p012xc85e97e9.p093xedfae76a.o mo273xed6858b4() {
        return this.f194863o;
    }

    public tn0.w0 h() {
        return Z0();
    }

    public void h1(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, boolean z17) {
    }

    public void i1(android.os.Bundle bundle) {
    }

    public void j1(android.os.Bundle bundle, long j17) {
    }

    public void k1(android.content.Intent intent) {
    }

    public void l1(android.os.Bundle bundle, java.lang.Object obj) {
    }

    public void n1() {
    }

    @Override // qo0.a, to0.a
    /* renamed from: name */
    public java.lang.String mo57003x337a8b() {
        return getClass().getSimpleName() + '@' + hashCode();
    }

    public final void p1(java.lang.String action, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        r1(action, obj, 0);
    }

    public gk2.e q5() {
        return S0();
    }

    public final void r1(java.lang.String action, java.lang.Object obj, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        ((mm2.c1) P0(mm2.c1.class)).R5 = true;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("ACTION_POST_PORTRAIT", action);
        if (i17 > 0) {
            bundle.putInt("ACTION_POST_PORTRAIT_DELAY", i17);
        }
        ((mm2.c1) P0(mm2.c1.class)).f410386o2 = new km2.i("EVENT_POST_PORTRAIT_ACTION", bundle, obj);
        R0().m57728x4e476d70(((mm2.c1) P0(mm2.c1.class)).f410346h2, ((mm2.c1) P0(mm2.c1.class)).f410340g2, bundle, obj);
    }

    public dk2.xf z() {
        return W0();
    }

    @Override // qo0.a
    public void z0() {
        if (this.f194863o.f93138c == p012xc85e97e9.p093xedfae76a.n.DESTROYED) {
            this.f194863o = new p012xc85e97e9.p093xedfae76a.b0(this, true);
        }
        this.f194863o.i(p012xc85e97e9.p093xedfae76a.n.RESUMED);
    }
}
