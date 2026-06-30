package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class ai extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements zy2.t7 {

    /* renamed from: d, reason: collision with root package name */
    public gx2.q f215310d;

    /* renamed from: e, reason: collision with root package name */
    public p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f215311e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f215312f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f215312f = new java.util.concurrent.CopyOnWriteArrayList();
    }

    public static gx2.q R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ai aiVar, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment, android.view.ViewGroup viewGroup, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.vh factory, int i17, java.lang.Object obj) {
        android.view.ViewGroup viewGroup2;
        boolean z17;
        hx2.i m132452x647851f2;
        if ((i17 & 2) != 0) {
            viewGroup = null;
        }
        if ((i17 & 4) != 0) {
            factory = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.vh();
        }
        aiVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(factory, "factory");
        if (viewGroup == null) {
            android.view.View decorView = aiVar.m158354x19263085().getWindow().getDecorView();
            viewGroup2 = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
            if (viewGroup2 == null) {
                return null;
            }
        } else {
            viewGroup2 = viewGroup;
        }
        gx2.q qVar = aiVar.f215310d;
        android.view.View a17 = (qVar == null || (m132452x647851f2 = qVar.m132452x647851f2()) == null) ? null : m132452x647851f2.a();
        android.view.ViewGroup viewGroup3 = a17 instanceof android.view.ViewGroup ? (android.view.ViewGroup) a17 : null;
        if (viewGroup3 == null) {
            viewGroup3 = new android.widget.FrameLayout(aiVar.m80379x76847179());
            viewGroup3.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            viewGroup3.setId(com.p314xaae8f345.mm.R.id.f566049eh4);
            viewGroup3.setBackgroundColor(viewGroup3.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
            z17 = true;
        } else {
            z17 = false;
        }
        gx2.q qVar2 = aiVar.f215310d;
        if (qVar2 != null && z17) {
            qVar2.m132471x9b4eeb66(new hx2.c(viewGroup3));
        }
        if (aiVar.f215310d == null || viewGroup != null) {
            gx2.a aVar = new gx2.a();
            aVar.f358870c = factory.b(aiVar.m80379x76847179());
            hx2.i component = factory.a(aiVar.m80379x76847179());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
            aVar.f358871d = component;
            aVar.f358872e = new hx2.c(viewGroup3);
            aVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.uh(aiVar));
            android.app.Activity context = aiVar.m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            aVar.f358873f = new hx2.b(context, true);
            aiVar.f215310d = aVar.b(viewGroup2);
        }
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83 = fragment instanceof com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 ? (com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83) fragment : null;
        if (c22584xf7d97e83 != null) {
            c22584xf7d97e83.q0(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.yh(aiVar));
        }
        gx2.q qVar3 = aiVar.f215310d;
        if (qVar3 != null) {
            qVar3.m132480x7ba98ee6(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.zh(aiVar));
        }
        viewGroup3.removeAllViews();
        p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = aiVar.m158354x19263085().mo7595x9cdc264().m7630xb2c12e75();
        m7630xb2c12e75.k(com.p314xaae8f345.mm.R.id.f566049eh4, fragment, null);
        m7630xb2c12e75.f();
        aiVar.f215311e = fragment;
        return aiVar.f215310d;
    }

    public final void O6(com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a onOpenDrawerListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onOpenDrawerListener, "onOpenDrawerListener");
        this.f215312f.add(onOpenDrawerListener);
    }

    public final void P6() {
        gx2.q qVar = this.f215310d;
        if (qVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1.b(qVar, false, null, false, null, 15, null);
        }
    }

    public final gx2.q Q6(android.view.View customContent) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(customContent, "customContent");
        android.view.View decorView = m158354x19263085().getWindow().getDecorView();
        android.view.ViewGroup viewGroup = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
        if (viewGroup == null) {
            return null;
        }
        android.content.Context m80379x76847179 = m80379x76847179();
        if (m80379x76847179 == null) {
            m80379x76847179 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        int c17 = com.p314xaae8f345.mm.ui.bl.c(m80379x76847179);
        android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        int i18 = b17.x;
        int i19 = b17.y;
        java.lang.System.nanoTime();
        boolean z17 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (z17) {
            i17 = i19 - c17;
        } else {
            if (i19 >= i18) {
                i18 = i19;
            }
            i17 = i18 - c17;
        }
        float a17 = i17 * kx2.a.f394811a.a(m80379x76847179());
        gx2.q qVar = this.f215310d;
        if (qVar != null) {
            if (qVar != null) {
                qVar.m132471x9b4eeb66(new hx2.c(customContent));
            }
            gx2.q qVar2 = this.f215310d;
            if (qVar2 != null) {
                qVar2.mo62645x46e30de3(a17);
            }
        }
        if (this.f215310d == null) {
            gx2.a aVar = new gx2.a();
            aVar.f358870c = a17;
            aVar.f358871d = new hx2.g(m80379x76847179(), 0, 0, 0, false, false, 62, null);
            aVar.f358872e = new hx2.c(customContent);
            aVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.uh(this));
            aVar.f358873f = new hx2.b(m80379x76847179(), true);
            this.f215310d = aVar.b(viewGroup);
        }
        gx2.q qVar3 = this.f215310d;
        if (qVar3 != null) {
            qVar3.m132480x7ba98ee6(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.wh(this));
        }
        gx2.q qVar4 = this.f215310d;
        if (qVar4 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1.m(qVar4, false, 1, null);
        }
        return this.f215310d;
    }

    public final void S6(com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a onOpenDrawerListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onOpenDrawerListener, "onOpenDrawerListener");
        this.f215312f.remove(onOpenDrawerListener);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        gx2.q qVar = this.f215310d;
        if (!(qVar != null ? qVar.isDrawerOpen : false)) {
            return super.mo2274xbdc3c5dc();
        }
        P6();
        return true;
    }
}
