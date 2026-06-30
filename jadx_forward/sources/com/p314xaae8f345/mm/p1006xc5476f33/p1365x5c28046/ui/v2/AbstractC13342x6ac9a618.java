package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment */
/* loaded from: classes15.dex */
public abstract class AbstractC13342x6ac9a618 extends com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 implements i12.q, android.widget.AdapterView.OnItemClickListener, android.widget.AbsListView.OnScrollListener, db5.l5, db5.k5, db5.j5, com.p314xaae8f345.mm.p944x882e457a.u0, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.h0, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.i0, ec0.e, l75.q0 {
    public z12.l A;
    public byte[] B;
    public int C;
    public boolean D;
    public long F;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.j0 L;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.j f179765d;

    /* renamed from: e, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.app.b f179766e;

    /* renamed from: f, reason: collision with root package name */
    public android.app.ProgressDialog f179767f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f179768g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.p1373xacc57f2c.C13370x510fae49 f179769h;

    /* renamed from: i, reason: collision with root package name */
    public h22.c f179770i;

    /* renamed from: m, reason: collision with root package name */
    public i22.b f179771m;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.C13344xe2832fe2 f179773o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.GestureDetectorOnGestureListenerC21510x15ed9d8c f179774p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ListView f179775q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f179776r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f179777s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f179778t;

    /* renamed from: u, reason: collision with root package name */
    public j12.b f179779u;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.s f179781w;

    /* renamed from: z, reason: collision with root package name */
    public z12.t f179784z;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Boolean f179772n = java.lang.Boolean.TRUE;

    /* renamed from: v, reason: collision with root package name */
    public int f179780v = -1;

    /* renamed from: x, reason: collision with root package name */
    public java.util.LinkedList f179782x = new java.util.LinkedList();

    /* renamed from: y, reason: collision with root package name */
    public java.util.LinkedList f179783y = new java.util.LinkedList();
    public boolean E = false;
    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6419xd51df726 G = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.b();
    public java.lang.String H = "";
    public boolean I = false;

    /* renamed from: J, reason: collision with root package name */
    public boolean f179764J = false;
    public boolean K = false;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 M = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.b(this);
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d N = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5327x7bab71d4>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment.2
        {
            this.f39173x3fe91575 = 449099204;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5327x7bab71d4 c5327x7bab71d4) {
            j12.f fVar;
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5327x7bab71d4 c5327x7bab71d42 = c5327x7bab71d4;
            if (c5327x7bab71d42 == null) {
                return false;
            }
            am.t4 t4Var = c5327x7bab71d42.f135640g;
            java.lang.String str = t4Var.f89512a;
            int i17 = t4Var.f89513b;
            int i18 = t4Var.f89514c;
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.AbstractC13342x6ac9a618 abstractC13342x6ac9a618 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.AbstractC13342x6ac9a618.this;
            j12.b bVar = abstractC13342x6ac9a618.f179779u;
            if (bVar == null || (fVar = bVar.f378685e) == null) {
                return false;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = abstractC13342x6ac9a618.M;
            if (i17 == 6) {
                android.os.Message obtain = android.os.Message.obtain();
                obtain.getData().putString("product_id", str);
                obtain.getData().putInt("progress", i18);
                obtain.what = 131075;
                if (n3Var != null) {
                    n3Var.mo50308x2936bf5f(obtain);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "product status:%d", java.lang.Integer.valueOf(i17));
                android.os.Message obtain2 = android.os.Message.obtain();
                obtain2.getData().putString("product_id", str);
                obtain2.getData().putInt("status", i17);
                obtain2.what = 131076;
                if (n3Var != null) {
                    n3Var.mo50308x2936bf5f(obtain2);
                }
            }
            fVar.g(str);
            return false;
        }
    };
    public final android.view.MenuItem.OnMenuItemClickListener P = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.c(this);

    @Override // db5.j5
    public boolean A5() {
        return false;
    }

    @Override // db5.k5
    public boolean E0() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.h0
    public void E5(i12.c cVar) {
        if (cVar.f() == 9) {
            u0(m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572116z4));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.j0 j0Var = this.L;
        j0Var.f179099k = this.G;
        j0Var.f179100l = q0() && com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.o.a().f179121d;
        if (q0()) {
            int i17 = cVar.f368705d;
            if (i17 >= 0 && i17 < this.f179779u.f()) {
                this.L.f179094f = 3;
            } else if (cVar.f368705d < this.f179779u.f() || cVar.f368705d >= this.f179779u.k() + this.f179779u.f()) {
                this.L.f179094f = 1;
            } else {
                this.L.f179094f = 19;
            }
        } else {
            this.L.f179094f = 2;
        }
        this.L.c(cVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.i0
    public void I0(boolean z17) {
        this.B = null;
        this.f179780v = -1;
        w0(z17, false);
    }

    @Override // db5.l5
    public boolean J6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "[onBottomLoadData] startLoadRemoteEmoji.");
        w0(true, false);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: getForceOrientation */
    public int mo54830x663c095b() {
        return 1;
    }

    @Override // ec0.e
    public void i3(java.util.ArrayList arrayList) {
        if (this.f179779u == null) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.M;
        if (n3Var != null) {
            n3Var.mo50307xb9e94560(131074, 50L);
        }
        j12.c.a(arrayList, this.f179779u.f378685e);
    }

    public void l0(android.os.Bundle bundle) {
        super.mo7495x78cb4fa(bundle);
    }

    public void m0(int i17, int i18, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        this.D = false;
        android.view.View view = this.f179776r;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "dealNetGetEmotionList", "(IILcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "dealNetGetEmotionList", "(IILcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!(i17 == 0 || i17 == 4)) {
            if (this.E) {
                return;
            }
            android.view.View view2 = this.f179777s;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "dealNetGetEmotionListErr", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "dealNetGetEmotionListErr", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f179774p.setVisibility(8);
            this.f179778t.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572033wu);
            return;
        }
        android.view.View view3 = this.f179777s;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "dealNetGetEmotionList", "(IILcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "dealNetGetEmotionList", "(IILcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f179774p.setVisibility(0);
        z12.t tVar = (z12.t) m1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.s I = z12.t.I(tVar.J());
        this.B = tVar.f550902p;
        if (i18 == 0) {
            r45.we3 J2 = tVar.J();
            x0(this.f179780v, I, false);
            if (J2 != null) {
                J2.f470635y = 0L;
            }
            if (this.f179780v == -1) {
                gm0.j1.e().j(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.h(this, J2));
            }
            this.f179780v = 0;
            return;
        }
        if (i18 == 2) {
            r45.we3 J3 = tVar.J();
            x0(this.f179780v, I, false);
            j12.c.b(this.f179779u.f378685e, this);
            if (J3 != null) {
                J3.f470635y = 0L;
            }
            if (this.f179780v == -1) {
                gm0.j1.e().j(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.h(this, J3));
            }
            this.f179780v = 2;
            return;
        }
        if (i18 == 3) {
            x0(this.f179780v, I, false);
            this.f179780v = 1;
            return;
        }
        android.view.View view4 = this.f179777s;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "dealNetGetEmotionListUnKnow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "dealNetGetEmotionListUnKnow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f179774p.setVisibility(8);
        this.f179778t.setText(com.p314xaae8f345.mm.R.C30867xcad56011.byu);
    }

    public abstract int n0();

    public final void o0(j12.i iVar, int i17) {
        int i18;
        int i19;
        if (iVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "item is null.");
            return;
        }
        boolean g17 = this.f179779u.g(i17);
        boolean z17 = false;
        if (iVar.f378699a == j12.h.cellset) {
            r45.kj0 kj0Var = iVar.f378702d;
            if (kj0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "banner set is null. do nothing");
                return;
            } else {
                y12.m.a(mo7438x76847179(), kj0Var, false);
                return;
            }
        }
        r45.zj0 zj0Var = iVar.f378700b;
        if (zj0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "summary is null. do nothing");
            return;
        }
        if (q0() && com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.o.a().f179121d) {
            z17 = true;
        }
        java.lang.String valueOf = java.lang.String.valueOf(i17 + 1);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6419xd51df726 c6419xd51df726 = this.G;
        c6419xd51df726.p(valueOf);
        c6419xd51df726.u(zj0Var.f473661d);
        c6419xd51df726.q(z17 ? zj0Var.f473680z : zj0Var.f473678x);
        c6419xd51df726.f137605f = 3;
        c6419xd51df726.r(java.lang.String.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.l(zj0Var.D)));
        c6419xd51df726.t(java.lang.String.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.n(zj0Var.D)));
        c6419xd51df726.s(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.m(zj0Var.D));
        c6419xd51df726.v(iVar.f378709k);
        c6419xd51df726.k();
        if (q0()) {
            if (i17 >= 0 && i17 < this.f179779u.f()) {
                i19 = 3;
            } else if (i17 < this.f179779u.f() || i17 >= this.f179779u.k() + this.f179779u.f()) {
                i19 = 1;
            } else {
                i18 = 19;
            }
            y12.m.d(mo7438x76847179(), zj0Var, false, i19, iVar.f378704f, iVar.f378703e, mo78409x676b27cd().getIntent().getStringExtra("to_talker_name"), 5, this.G, g17, this.H);
        }
        i18 = 2;
        i19 = i18;
        y12.m.d(mo7438x76847179(), zj0Var, false, i19, iVar.f378704f, iVar.f378703e, mo78409x676b27cd().getIntent().getStringExtra("to_talker_name"), 5, this.G, g17, this.H);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onActivityCreated */
    public void mo7495x78cb4fa(android.os.Bundle bundle) {
        super.mo7495x78cb4fa(bundle);
        this.K = true;
        j12.b r07 = r0();
        this.f179779u = r07;
        r07.f378686f = this;
        android.view.View mo26077x4ff8c0f0 = mo26077x4ff8c0f0(com.p314xaae8f345.mm.R.id.dez);
        this.f179777s = mo26077x4ff8c0f0;
        this.f179778t = (android.widget.TextView) mo26077x4ff8c0f0.findViewById(com.p314xaae8f345.mm.R.id.df9);
        android.view.View inflate = m78382x7412b47a().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a7p, (android.view.ViewGroup) null);
        this.f179776r = inflate;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "initMoreBottom", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(inflate, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "initMoreBottom", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int a17 = ym5.x.a(mo7438x76847179(), 12.0f);
        h22.f fVar = new h22.f(false, false, false, 0L, 0, 0, 0, 127, null);
        fVar.f359831c = true;
        fVar.f359834f = a17;
        fVar.f359829a = true;
        fVar.f359835g = a17;
        fVar.f359832d = 5000L;
        int a18 = ym5.x.a(mo7438x76847179(), 19.04f);
        int a19 = ym5.x.a(mo7438x76847179(), 24.0f);
        int a27 = ym5.x.a(mo7438x76847179(), 176.0f);
        android.view.View inflate2 = com.p314xaae8f345.mm.ui.id.b(mo7438x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a8a, (android.view.ViewGroup) null, false);
        this.f179768g = inflate2;
        inflate2.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f77698x3cb0744);
        this.f179769h = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.p1373xacc57f2c.C13370x510fae49) this.f179768g.findViewById(com.p314xaae8f345.mm.R.id.de9);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, a27);
        layoutParams.setMargins(0, a18, 0, a19);
        this.f179769h.setLayoutParams(layoutParams);
        android.content.Context context = this.f179769h.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        h22.c cVar = new h22.c(context, new java.util.LinkedList());
        this.f179770i = cVar;
        this.f179769h.b(fVar, cVar);
        this.f179771m = new i22.b();
        android.widget.ListView listView = (android.widget.ListView) mo26077x4ff8c0f0(android.R.id.list);
        this.f179775q = listView;
        listView.addHeaderView(this.f179768g);
        if (!q0()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.C13344xe2832fe2 c13344xe2832fe2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.C13344xe2832fe2(mo7438x76847179());
            this.f179773o = c13344xe2832fe2;
            c13344xe2832fe2.m54833x6b8182d0(8);
            this.f179773o.m54832x9894c420(false);
            this.f179775q.addHeaderView(this.f179773o);
        }
        this.f179775q.addFooterView(this.f179776r);
        this.f179775q.setAdapter((android.widget.ListAdapter) this.f179779u);
        if (q0()) {
            this.f179775q.setOnItemClickListener(this);
        } else {
            ((i12.s) this.f179779u).f368774r = this;
        }
        this.f179775q.setOnScrollListener(this);
        this.f179775q.setLongClickable(false);
        this.f179775q.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.f(this));
        this.f179779u.getClass();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.GestureDetectorOnGestureListenerC21510x15ed9d8c gestureDetectorOnGestureListenerC21510x15ed9d8c = (com.p314xaae8f345.mm.ui.p2642x2e06d1.GestureDetectorOnGestureListenerC21510x15ed9d8c) mo26077x4ff8c0f0(com.p314xaae8f345.mm.R.id.ill);
        this.f179774p = gestureDetectorOnGestureListenerC21510x15ed9d8c;
        if (gestureDetectorOnGestureListenerC21510x15ed9d8c != null) {
            gestureDetectorOnGestureListenerC21510x15ed9d8c.m79098x563f5e7a(false);
            this.f179774p.m79079xcab5c565(this);
            this.f179774p.m79090x3b8dba10(this);
            this.f179774p.m79078x1c273745(this);
            this.f179774p.m79082x1e1922a0(false);
            this.f179774p.m79085xcc8bf2ed(false);
            this.f179774p.m79087xceaf442d(true);
        }
        if (this.I) {
            p0();
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onActivityResult */
    public void mo7496x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo7496x9d4787cb(i17, i18, intent);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.j0 j0Var = this.L;
        if (j0Var != null) {
            j0Var.b(i17, i18, intent);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "mPayOrDownloadComponent have no init.");
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onAttach */
    public void mo7497x3b13c504(android.app.Activity activity) {
        super.mo7497x3b13c504(activity);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.p1373xacc57f2c.C13370x510fae49 c13370x510fae49 = this.f179769h;
        if (c13370x510fae49 != null) {
            c13370x510fae49.requestLayout();
        }
        m78405xf1bfa104(1);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.ui.AbstractC21367x9cbb2930, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        super.mo7398x3e5a77bb(bundle);
        m78405xf1bfa104(1);
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.a()) {
            this.f179766e = al5.p0.N(((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) mo78409x676b27cd()).mo2533x106ab264());
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(mo7438x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569441ba, (android.view.ViewGroup) null);
            this.f179765d = new com.p314xaae8f345.mm.ui.j(inflate);
            inflate.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
            this.f179766e.I(new android.graphics.drawable.ColorDrawable(m7460x893a2f6f().getColor(android.R.color.transparent)));
            this.f179766e.F(false);
            this.f179766e.B(false);
            this.f179766e.E(false);
            this.f179766e.D(true);
            this.f179766e.y(inflate);
            this.f179766e.L();
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.u().booleanValue()) {
                this.f179765d.f(com.p314xaae8f345.mm.R.C30867xcad56011.byw);
            } else {
                this.f179765d.f(com.p314xaae8f345.mm.R.C30867xcad56011.byb);
            }
            this.f179765d.c(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.d(this));
            m78710xb0dfae51(true);
            m78627x84f07bce(0, com.p314xaae8f345.mm.R.raw.f78368xa86f0fea, new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.e(this));
        }
        this.N.mo48813x58998cd();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().b().add(this);
        if (m78645x9f88d943() != null) {
            m78645x9f88d943().mo82173x2c7f5575(m7460x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77698x3cb0744));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.view.View mo7503x18bad100 = super.mo7503x18bad100(layoutInflater, viewGroup, bundle);
        m7568x9c2f1725(false);
        return mo7503x18bad100;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.ui.AbstractC21367x9cbb2930, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        super.mo7504xac79a11b();
        j12.b bVar = this.f179779u;
        if (bVar != null) {
            bVar.a();
            this.f179779u = null;
        }
        this.N.mo48814x2efc64();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().b().mo49775xc84af884(this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroyView */
    public void mo7399xa6664a60() {
        super.mo7399xa6664a60();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDetach */
    public void mo7400x3f5eee52() {
        super.mo7400x3f5eee52();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        int headerViewsCount = i17 - this.f179775q.getHeaderViewsCount();
        if (headerViewsCount < 0 || headerViewsCount >= this.f179779u.getCount()) {
            yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        j12.i item = this.f179779u.getItem(headerViewsCount);
        o0(item, headerViewsCount);
        if (q0() && this.f179779u.k() > 0 && headerViewsCount >= this.f179779u.f() && headerViewsCount < this.f179779u.f() + this.f179779u.k() && item.f378700b != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            r45.zj0 zj0Var = item.f378700b;
            g0Var.d(13223, 1, zj0Var.f473661d, zj0Var.f473663f, 1, 0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var;
        if (android.text.TextUtils.isEmpty(str) || !str.equals("delete_group") || (n3Var = this.M) == null) {
            return;
        }
        n3Var.mo50307xb9e94560(131074, 50L);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onPause */
    public void mo7512xb01dfb57() {
        super.mo7512xb01dfb57();
        gm0.j1.n().f354821b.q(411, this);
        gm0.j1.n().f354821b.q(com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60877x93282336, this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public void mo7517x57429eec() {
        j12.f fVar;
        super.mo7517x57429eec();
        this.f179769h.c();
        this.f179770i.z();
        gm0.j1.n().f354821b.a(411, this);
        gm0.j1.n().f354821b.a(com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60877x93282336, this);
        if (this.I) {
            j12.b bVar = this.f179779u;
            if (bVar != null && (fVar = bVar.f378685e) != null) {
                fVar.d();
                this.f179779u.m();
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            if (((java.lang.Boolean) c17.l(208900, bool)).booleanValue()) {
                I0(false);
                gm0.j1.u().c().w(208900, bool);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        int i19;
        int i27;
        int i28;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onSceneEnd errType:%d,errCode:%d,errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        android.app.ProgressDialog progressDialog = this.f179767f;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f179767f.dismiss();
        }
        int mo808xfb85f7b0 = m1Var.mo808xfb85f7b0();
        if (mo808xfb85f7b0 != 411) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiStoreV2BaseFragment", "unknow scene type.");
            return;
        }
        if (m1Var instanceof z12.t) {
            z12.t tVar = (z12.t) m1Var;
            int n07 = n0();
            int i29 = tVar.f550895f;
            if (i29 == n07) {
                if (tVar.J() != null) {
                    if (this.f179779u.c() > 0 || !q0()) {
                        i19 = 0;
                    } else {
                        i19 = tVar.J().f470630t == null ? 0 : tVar.J().f470630t.size();
                        this.f179779u.o(i19);
                    }
                    i27 = tVar.J().f470627q;
                    i28 = tVar.J().f470628r;
                } else {
                    i19 = 0;
                    i27 = 0;
                    i28 = 0;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onSceneEnd setSize:%d hotcount:%d recentHotCount:%d type:%d getSceneType:%d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(mo808xfb85f7b0), java.lang.Integer.valueOf(i29));
                j12.b bVar = this.f179779u;
                if (bVar != null && bVar.k() <= 0 && q0()) {
                    j12.b bVar2 = this.f179779u;
                    bVar2.p(i27 + bVar2.c());
                    this.f179779u.q(i28);
                }
                m0(i17, i18, m1Var);
                if (q0()) {
                    if (tVar.J() != null && tVar.J().f470630t != null && tVar.J().f470630t.size() > 0) {
                        for (int i37 = 0; i37 < tVar.J().f470630t.size(); i37++) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13223, 0, java.lang.Integer.valueOf(((r45.kj0) tVar.J().f470630t.get(i37)).f460262g), ((r45.kj0) tVar.J().f470630t.get(i37)).f460260e, 0);
                        }
                    }
                    if (tVar.J().f470628r <= 0 || tVar.J().f470619f == null || tVar.J().f470619f.size() <= tVar.J().f470627q + tVar.J().f470628r) {
                        return;
                    }
                    for (int i38 = 0; i38 < tVar.J().f470628r; i38++) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13223, 0, ((r45.zj0) tVar.J().f470619f.get(tVar.J().f470627q + i38)).f473661d, ((r45.zj0) tVar.J().f470619f.get(tVar.J().f470627q + i38)).f473663f, 1);
                    }
                }
            }
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        if (i17 == 0 && absListView.getLastVisiblePosition() == absListView.getCount() - 1) {
            if (this.f179780v == 0 || this.D) {
                yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
                return;
            } else {
                w0(true, false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "[onScrollStateChanged] startLoadRemoteEmoji.");
            }
        }
        if (i17 == 0) {
            t0();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onStart */
    public void mo7405xb05099c3() {
        super.mo7405xb05099c3();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onStop */
    public void mo7406xc39f8281() {
        super.mo7406xc39f8281();
        h22.h hVar = this.f179769h.f180025h;
        if (hVar != null) {
            hVar.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: onVisibilityChanged */
    public void mo54831x93512b23(boolean z17) {
        super.mo54831x93512b23(z17);
        h22.c cVar = this.f179770i;
        if (cVar == null) {
            return;
        }
        cVar.f359820m = z17;
    }

    public void p0() {
        int i17;
        int i18;
        this.f179764J = true;
        this.F = java.lang.System.currentTimeMillis();
        r45.gd5 gd5Var = new r45.gd5();
        long j17 = this.F;
        gd5Var.f456674f = j17;
        this.G.f137603d = j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "initeData: %s", java.lang.Long.valueOf(j17));
        try {
            this.B = gd5Var.mo14344x5f01b1f6();
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.emoji.EmojiStoreV2BaseFragment", e17, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.j0 j0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.j0();
        this.L = j0Var;
        j0Var.f179092d = mo78409x676b27cd();
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.j0 j0Var2 = this.L;
        j0Var2.f179093e = this;
        j0Var2.f179089a = this.f179779u;
        if (q0()) {
            this.L.f179094f = 1;
        } else {
            this.L.f179094f = 2;
        }
        this.L.f179095g = this;
        this.C = mo78409x676b27cd().getIntent().getIntExtra("preceding_scence", 5);
        n0();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        r45.we3 z07 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().e().z0(n0());
        if (z07 != null) {
            z07.f470635y = 0L;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.s I = z12.t.I(z07);
        n0();
        if (I != null && I.f179133b.size() > 0) {
            this.E = true;
            android.view.View view = this.f179777s;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "loadCache", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "loadCache", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f179774p.setVisibility(0);
            x0(this.f179780v, I, true);
            if (z07 != null) {
                java.util.LinkedList linkedList = z07.f470630t;
                r3 = linkedList != null ? linkedList.size() : 0;
                int i19 = z07.f470627q;
                i18 = z07.f470628r;
                i17 = r3;
                r3 = i19;
            } else {
                i17 = 0;
                i18 = 0;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "load cache hotcount:%d type:%d", java.lang.Integer.valueOf(r3), java.lang.Integer.valueOf(n0()));
            if (this.f179779u != null && q0()) {
                this.f179779u.p(r3 + i17);
                this.f179779u.q(i18);
            }
            j12.c.b(this.f179779u.f378685e, this);
        }
        s0(this.B);
        gm0.j1.n().f354821b.g(this.f179784z);
    }

    public abstract boolean q0();

    public abstract j12.b r0();

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.i0
    public void s(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.A = new z12.l(str, str2, str3, null, str5);
        gm0.j1.n().f354821b.g(this.A);
    }

    public void s0(byte[] bArr) {
        int n07 = n0();
        int i17 = this.C;
        if (bArr != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "[refreshNetSceneGetEmotionList] request buffer %s", bArr.toString());
            this.f179784z = new z12.t(n07, bArr, i17, false);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "[refreshNetSceneGetEmotionList] request buffer is null.");
            this.f179784z = new z12.t(n07, i17);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: setUserVisibleHint */
    public void mo7583x951b248c(boolean z17) {
        h22.h hVar;
        super.mo7583x951b248c(z17);
        this.I = z17;
        if (!this.f179764J && this.K) {
            p0();
        } else if (z17) {
            t0();
        }
        boolean z18 = this.I;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.M;
        if (z18) {
            if (n3Var != null) {
                n3Var.mo50307xb9e94560(131077, 0L);
                return;
            }
            return;
        }
        if (n3Var != null) {
            n3Var.mo50303x856b99f0(131077);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.p1373xacc57f2c.C13370x510fae49 c13370x510fae49 = this.f179769h;
        if (c13370x510fae49 == null || (hVar = c13370x510fae49.f180025h) == null) {
            return;
        }
        hVar.removeCallbacksAndMessages(null);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: supportNavigationSwipeBack */
    public boolean mo25471x430f73e() {
        return false;
    }

    public void t0() {
    }

    public void u0(java.lang.String str) {
        if (m78397x697ca065()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "[showLoadingDialog] acitivity is finished.");
        } else {
            this.f179767f = db5.e1.Q(mo78409x676b27cd(), m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), str, true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.i(this));
        }
    }

    public void w0(boolean z17, boolean z18) {
        if (this.D) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "isLoading");
            return;
        }
        this.D = true;
        if (z17) {
            android.view.View view = this.f179776r;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "startLoadRemoteEmoji", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "startLoadRemoteEmoji", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        s0(this.B);
        gm0.j1.n().f354821b.g(this.f179784z);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "[startLoadRemoteEmoji] doScene GetEmotionListNetScene");
        if (z17 || z18) {
            return;
        }
        u0(m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x0(int r6, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.s r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.AbstractC13342x6ac9a618.x0(int, com.tencent.mm.plugin.emoji.model.s, boolean):void");
    }
}
