package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class b4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f232582d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f232583e;

    /* renamed from: f, reason: collision with root package name */
    public long f232584f;

    /* renamed from: g, reason: collision with root package name */
    public int f232585g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f232586h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4 f232587i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(int i17, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4 h4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f232586h = i17;
        this.f232587i = h4Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.b4(this.f232586h, this.f232587i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.b4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        fm3.q qVar;
        java.lang.Object g17;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var;
        long j17;
        gk4.b effector;
        kk4.b player;
        kk4.b player2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f232585g;
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4 h4Var = this.f232587i;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refreshVideo: ");
            int i18 = this.f232586h;
            sb6.append(i18);
            sb6.append(' ');
            sb6.append(h4Var.f232702p);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.Mv.MusicMvMakerFixEditUIC", sb6.toString(), new java.lang.Object[0]);
            if (h4Var.f232702p >= 0) {
                kk4.d dVar = h4Var.f232709w;
                if ((dVar == null || (player2 = dVar.getPlayer()) == null || !((kk4.v) player2).s()) ? false : true) {
                    java.lang.Object obj2 = h4Var.f232694e.get(h4Var.f232702p);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
                    fm3.q qVar2 = (fm3.q) obj2;
                    kk4.d dVar2 = h4Var.f232709w;
                    jk4.a aVar2 = (dVar2 == null || (player = dVar2.getPlayer()) == null) ? null : ((kk4.v) player).L;
                    kk4.d dVar3 = h4Var.f232709w;
                    fm3.j0.f345611a.j(h4Var.m158354x19263085(), h4Var.f232705s, h4Var.f232702p, qVar2, aVar2, (dVar3 == null || (effector = dVar3.getEffector()) == null) ? null : ((gk4.h0) effector).f354091c);
                }
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = h4Var.S6().p0(i18);
            if (p07 == null) {
                return f0Var;
            }
            java.lang.Object obj3 = h4Var.f232694e.get(i18);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj3, "get(...)");
            qVar = (fm3.q) obj3;
            h4Var.f232702p = i18;
            if (qVar.f345644i) {
                kl3.t.g().a().c(qVar.f345640e);
            }
            fm3.o oVar = qVar.f345646n;
            long d17 = oVar != null ? oVar.d() : 0L;
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.a4 a4Var = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.a4(qVar, null);
            this.f232582d = p07;
            this.f232583e = qVar;
            this.f232584f = d17;
            this.f232585g = 1;
            g17 = p3325xe03a0797.p3326xc267989b.l.g(p0Var, a4Var, this);
            if (g17 == aVar) {
                return aVar;
            }
            long j18 = d17;
            k3Var = p07;
            j17 = j18;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j17 = this.f232584f;
            fm3.q qVar3 = (fm3.q) this.f232583e;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var2 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) this.f232582d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            k3Var = k3Var2;
            qVar = qVar3;
            g17 = obj;
        }
        dk4.a aVar3 = (dk4.a) g17;
        if (aVar3 == null) {
            return f0Var;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvMakerFixEditUIC", "refreshVideo mediaInfo:" + aVar3);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) k3Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.oy7);
        java.lang.Object obj4 = h4Var.f232709w;
        android.view.View view = obj4 instanceof android.view.View ? (android.view.View) obj4 : null;
        if ((view != null ? view.getParent() : null) != null) {
            java.lang.Object obj5 = h4Var.f232709w;
            android.view.View view2 = obj5 instanceof android.view.View ? (android.view.View) obj5 : null;
            android.view.ViewParent parent = view2 != null ? view2.getParent() : null;
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                java.lang.Object obj6 = h4Var.f232709w;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj6, "null cannot be cast to non-null type android.view.View");
                viewGroup.removeView((android.view.View) obj6);
            }
        }
        frameLayout.removeAllViews();
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        java.lang.Object obj7 = h4Var.f232709w;
        android.view.View view3 = obj7 instanceof android.view.View ? (android.view.View) obj7 : null;
        if (view3 != null) {
            frameLayout.addView(view3, layoutParams);
        }
        ((android.widget.ProgressBar) k3Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.kp6)).setProgress(0);
        kk4.d dVar4 = h4Var.f232709w;
        if (dVar4 != 0) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18691x35cf85c9) dVar4).d();
            android.view.View view4 = dVar4 instanceof android.view.View ? (android.view.View) dVar4 : null;
            if (view4 != null) {
                view4.setKeepScreenOn(true);
            }
            kk4.b player3 = dVar4.getPlayer();
            if (player3 != null) {
                ((kk4.v) player3).R();
            }
            dVar4.mo71992xdb50e870(aVar3);
            kk4.b player4 = dVar4.getPlayer();
            if (player4 != null) {
                ((kk4.v) player4).f390118j = true;
            }
            kk4.b player5 = dVar4.getPlayer();
            if (player5 != null) {
                ((kk4.v) player5).C(true);
            }
            kk4.b player6 = dVar4.getPlayer();
            if (player6 != null) {
                ((kk4.v) player6).A(true);
            }
            gk4.b.a(dVar4.getEffector(), 0.0f, 1, null);
            kk4.b player7 = dVar4.getPlayer();
            if (player7 != null) {
                ((kk4.v) player7).H(j17, (qVar.f345641f - qVar.f345640e) + j17);
            }
            kk4.b player8 = dVar4.getPlayer();
            if (player8 != null) {
                ((kk4.v) player8).O();
            }
            kk4.b player9 = dVar4.getPlayer();
            if (player9 != null) {
                ((kk4.v) player9).I(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.z3(qVar, j17, k3Var), 30L);
            }
        }
        return f0Var;
    }
}
