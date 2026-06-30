package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/StatusAlbumUI;", "Lcom/tencent/mm/ui/MMFragment;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.textstatus.ui.StatusAlbumUI */
/* loaded from: classes11.dex */
public final class C18619x86b32cd1 extends com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f254996d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f254997e;

    /* renamed from: g, reason: collision with root package name */
    public bk4.d f254999g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f255000h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f255001i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f255002m;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f254998f = new java.util.ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View.OnLongClickListener f255003n = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.b3(this);

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: dealContentView */
    public void mo26076x2105eeb2(android.view.View v17) {
        pj4.p0 p0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        super.mo26076x2105eeb2(v17);
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = mo7430x19263085();
        if (mo7430x19263085 != null) {
            ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Zi(mo7430x19263085, new o04.e(pj4.p0.class, 9, true));
            pj4.p0 p0Var2 = (pj4.p0) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(mo7430x19263085, 9, pj4.p0.class);
            if (p0Var2 != null) {
                try {
                    p0Var = (pj4.p0) ((q04.r) ((xs.j1) i95.n0.c(xs.j1.class))).wi(9, "TextStatusCardExposed");
                } catch (java.lang.Throwable unused) {
                    p0Var = null;
                }
                p0Var2.f436769d = p0Var != null ? p0Var.f436769d : null;
            }
        }
        android.view.View findViewById = v17.findViewById(com.p314xaae8f345.mm.R.id.lqa);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) findViewById;
        this.f254997e = c22849x81a93d25;
        c22849x81a93d25.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(mo7438x76847179(), 1, false));
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.textstatus.ui.StatusAlbumUI$buildItemConverts$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                return type == 0 ? new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2267x5897e6f.a(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18619x86b32cd1.this.f255003n) : new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2267x5897e6f.a(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18619x86b32cd1.this.f255003n);
            }
        }, this.f254998f, true);
        c22848x6ddd90cf.F = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.u2(c22848x6ddd90cf, this);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = this.f254997e;
        if (c22849x81a93d252 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rvSelfHistory");
            throw null;
        }
        c22849x81a93d252.mo7960x6cab2c8d(c22848x6ddd90cf);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d253 = this.f254997e;
        if (c22849x81a93d253 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rvSelfHistory");
            throw null;
        }
        c22849x81a93d253.N(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.v2(this));
        android.view.View findViewById2 = v17.findViewById(com.p314xaae8f345.mm.R.id.m6e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) findViewById2;
        this.f254996d = c22801x87cbdc00;
        c22801x87cbdc00.m82683xb165a19d(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.y2(this, c22848x6ddd90cf));
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc002 = this.f254996d;
        if (c22801x87cbdc002 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRefreshLayout");
            throw null;
        }
        this.f254999g = new bk4.d(c22848x6ddd90cf, c22801x87cbdc002, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusAlbumUI", "init OK");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: getLayoutId */
    public int getF153758d() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d09;
    }

    public final void l0() {
        fj4.a aVar;
        mj4.h hVar;
        java.util.Iterator it = this.f254998f.iterator();
        int i17 = 0;
        int i18 = 0;
        while (it.hasNext()) {
            in5.c cVar = (in5.c) it.next();
            if ((cVar instanceof fj4.a) && (hVar = (aVar = (fj4.a) cVar).f344757e) != null) {
                long j17 = ((mj4.k) hVar).f408600b.f76512x81959a6e * 1000;
                java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f);
                java.util.Date parse = simpleDateFormat.parse(simpleDateFormat.format(java.lang.Long.valueOf(j17)));
                java.util.Calendar calendar = java.util.Calendar.getInstance();
                calendar.setTime(parse);
                int i19 = calendar.get(1);
                int i27 = calendar.get(5);
                if (i19 != i17) {
                    aVar.f344758f = android.text.format.DateFormat.format(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jxl), j17).toString();
                    i17 = i19;
                } else {
                    aVar.f344758f = "";
                }
                if (i27 != i18) {
                    aVar.f344759g = android.text.format.DateFormat.format(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jwc), j17).toString();
                    i18 = i27;
                } else {
                    aVar.f344759g = "";
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.ui.AbstractC21367x9cbb2930, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        super.mo7398x3e5a77bb(bundle);
        mo78694xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f571517hg);
        mo78682x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.t2(this));
        gm0.j1.d().a(5967, this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.ui.AbstractC21367x9cbb2930, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        super.mo7504xac79a11b();
        bk4.d dVar = this.f254999g;
        if (dVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dataLoader");
            throw null;
        }
        gm0.j1.d().q(4245, dVar.f102982i);
        gm0.j1.d().q(5967, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        boolean z17;
        if (m1Var instanceof ej4.a) {
            if (i17 == 0 && i18 == 0) {
                z17 = true;
            } else {
                android.app.Activity mo7438x76847179 = mo7438x76847179();
                if (mo7438x76847179 != null) {
                    db5.e1.s(mo7438x76847179, mo7438x76847179.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574893jv3), "");
                }
                z17 = false;
            }
            if (z17) {
                java.util.ArrayList arrayList = this.f254998f;
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    in5.c cVar = (in5.c) it.next();
                    if (cVar instanceof fj4.a) {
                        mj4.h hVar = ((fj4.a) cVar).f344757e;
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(hVar != null ? ((mj4.k) hVar).l() : null, ((ej4.a) m1Var).f334853d)) {
                            arrayList.remove(cVar);
                            break;
                        }
                    }
                }
                l0();
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f254997e;
                if (c22849x81a93d25 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rvSelfHistory");
                    throw null;
                }
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c22849x81a93d25.mo7946xf939df19();
                if (mo7946xf939df19 != null) {
                    mo7946xf939df19.m8146xced61ae5();
                }
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f255002m;
        if (u3Var != null) {
            u3Var.dismiss();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: onVisibilityChanged */
    public void mo54831x93512b23(boolean z17) {
        super.mo54831x93512b23(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusAlbumUI", "[onVisibilityChanged]" + z17 + ' ' + this.f255001i);
        if (!z17 || this.f255001i) {
            return;
        }
        bk4.d dVar = this.f254999g;
        if (dVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dataLoader");
            throw null;
        }
        gm0.j1.d().g(new ej4.f(dVar.f102979f, null, null, null, null, 30, null));
        this.f255001i = true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: setUserVisibleHint */
    public void mo7583x951b248c(boolean z17) {
        super.mo7583x951b248c(z17);
        if (z17) {
            qj4.s.p(qj4.s.f445491a, 1L, 0L, null, 6, null);
            ((qj4.v) ((bi4.z0) i95.n0.c(bi4.z0.class))).Ui();
            ((qj4.v) ((bi4.z0) i95.n0.c(bi4.z0.class))).Ri();
        } else {
            java.util.Stack stack = ((qj4.v) ((bi4.z0) i95.n0.c(bi4.z0.class))).f445493e;
            if (!stack.empty()) {
                stack.pop();
            }
            ((qj4.v) ((bi4.z0) i95.n0.c(bi4.z0.class))).Di();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: supportNavigationSwipeBack */
    public boolean mo25471x430f73e() {
        return false;
    }
}
