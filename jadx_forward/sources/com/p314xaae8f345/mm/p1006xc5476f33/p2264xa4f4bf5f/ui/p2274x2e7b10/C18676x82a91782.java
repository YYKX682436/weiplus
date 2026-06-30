package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10;

/* renamed from: com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC */
/* loaded from: classes11.dex */
public final class C18676x82a91782 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {
    public java.lang.ref.WeakReference A;
    public com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6124x1b34039a B;
    public com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6125x933f58e7 C;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d D;

    /* renamed from: d, reason: collision with root package name */
    public boolean f255306d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f255307e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f255308f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f255309g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f255310h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f255311i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f255312m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Set f255313n;

    /* renamed from: o, reason: collision with root package name */
    public int f255314o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.HashMap f255315p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.ref.WeakReference f255316q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f255317r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f255318s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f255319t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f255320u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f255321v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f255322w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f255323x;

    /* renamed from: y, reason: collision with root package name */
    public final android.view.GestureDetector f255324y;

    /* renamed from: z, reason: collision with root package name */
    public final android.view.GestureDetector f255325z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18676x82a91782(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f255309g = "";
        this.f255310h = "";
        this.f255311i = new java.util.LinkedHashMap();
        this.f255312m = new java.util.LinkedHashMap();
        this.f255313n = new java.util.LinkedHashSet();
        this.f255314o = -1;
        this.f255315p = new java.util.HashMap();
        this.f255319t = true;
        this.f255323x = "SCENE_DEFAULT";
        this.f255324y = new android.view.GestureDetector(activity, new uj4.j(this));
        this.f255325z = new android.view.GestureDetector(activity, new uj4.g(this, activity));
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.D = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6131xf75dfaeb>(a0Var) { // from class: com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC$squareScrollListener$1
            {
                this.f39173x3fe91575 = 525584091;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6131xf75dfaeb c6131xf75dfaeb) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6131xf75dfaeb event = c6131xf75dfaeb;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.ay ayVar = event.f136403g;
                int i17 = ayVar.f87728b;
                int i18 = ayVar.f87729c;
                java.lang.String str = ayVar.f87727a;
                com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782 c18676x82a91782 = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782.this;
                c18676x82a91782.m158359x1e885992().putExtra("KEY_START_CARD_ANIM_X_OFFSET", i17);
                c18676x82a91782.m158359x1e885992().putExtra("KEY_START_CARD_ANIM_Y_OFFSET", i18);
                c18676x82a91782.m158359x1e885992().putExtra("KEY_USER_NAME", str);
                return false;
            }
        };
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.w1 O6() {
        in5.s0 s0Var;
        java.lang.ref.WeakReference weakReference = this.f255307e;
        if (weakReference == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TextStatus.TextStatusCardFeedUIC", "getActivateMultiStatusCardView error,null ref");
            return null;
        }
        in5.s0 s0Var2 = (in5.s0) weakReference.get();
        if (s0Var2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TextStatus.TextStatusCardFeedUIC", "getActivateMultiStatusCardView error,null holder");
            return null;
        }
        java.lang.Object obj = s0Var2.f374657h;
        if (obj == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TextStatus.TextStatusCardFeedUIC", "getActivateMultiStatusCardView error,null tag");
            return null;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.w1)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TextStatus.TextStatusCardFeedUIC", "getActivateMultiStatusCardView error,wrong type:" + obj);
            return null;
        }
        java.lang.ref.WeakReference weakReference2 = this.f255307e;
        java.lang.Object obj2 = (weakReference2 == null || (s0Var = (in5.s0) weakReference2.get()) == null) ? null : s0Var.f374657h;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.w1 w1Var = obj2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.w1 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.w1) obj2 : null;
        if (w1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TextStatus.TextStatusCardFeedUIC", "getActivateMultiStatusCardView fail");
        }
        return w1Var;
    }

    public final bi4.n0 P6() {
        in5.s0 Q6 = Q6();
        java.lang.Object obj = Q6 != null ? Q6.f374657h : null;
        if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3) obj;
        }
        return null;
    }

    public final in5.s0 Q6() {
        java.lang.ref.WeakReference weakReference = this.f255308f;
        if (weakReference != null) {
            return (in5.s0) weakReference.get();
        }
        return null;
    }

    public final cj4.q1 R6() {
        java.lang.String str = this.f255323x;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "SCENE_MORE_TAB") ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "SCENE_CONTACT_PROFILE") ? this.f255320u ? cj4.q1.f123554e : cj4.q1.f123555f : cj4.q1.f123553d;
    }

    public final boolean S6() {
        return (m158359x1e885992().getIntExtra("KEY_START_CARD_ANIM_X_OFFSET", -1) == -1 || m158359x1e885992().getIntExtra("KEY_START_CARD_ANIM_Y_OFFSET", -1) == -1) ? false : true;
    }

    public final void T6(android.widget.RelativeLayout itemView, int i17, int i18, boolean z17) {
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b;
        in5.s0 s0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        java.lang.ref.WeakReference weakReference = this.f255316q;
        java.lang.Object obj = (weakReference == null || (s0Var = (in5.s0) weakReference.get()) == null) ? null : s0Var.f374657h;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3 q3Var = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3) obj : null;
        java.lang.String str = q3Var != null ? q3Var.f255732p : null;
        if (str == null ? false : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, en1.a.a())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusCardFeedUIC", "playLikePAG: skip");
            return;
        }
        java.lang.ref.WeakReference weakReference2 = this.A;
        if (weakReference2 != null && (c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) weakReference2.get()) != null) {
            c22789xd23e9a9b.n();
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = new com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b(m158354x19263085());
        int dimension = (int) m158354x19263085().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561216ci);
        itemView.addView(c22789xd23e9a9b2);
        android.view.ViewGroup.LayoutParams layoutParams = c22789xd23e9a9b2.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.width = dimension;
            layoutParams2.height = dimension;
            if (z17) {
                int i19 = i17 + dimension;
                if (i19 > itemView.getWidth()) {
                    layoutParams2.addRule(11, -1);
                    layoutParams2.removeRule(9);
                    layoutParams2.rightMargin = itemView.getWidth() - i19;
                    layoutParams2.leftMargin = 0;
                } else {
                    layoutParams2.addRule(9, -1);
                    layoutParams2.removeRule(11);
                    layoutParams2.leftMargin = i17;
                    layoutParams2.rightMargin = 0;
                }
                int i27 = dimension + i18;
                if (i27 > itemView.getHeight()) {
                    layoutParams2.addRule(12, -1);
                    layoutParams2.removeRule(10);
                    layoutParams2.bottomMargin = itemView.getHeight() - i27;
                    layoutParams2.topMargin = 0;
                } else {
                    layoutParams2.addRule(10, -1);
                    layoutParams2.removeRule(12);
                    layoutParams2.topMargin = i18;
                    layoutParams2.bottomMargin = 0;
                }
            } else {
                layoutParams2.addRule(13, -1);
            }
        }
        c22789xd23e9a9b2.a(new uj4.i(c22789xd23e9a9b2, itemView));
        c22789xd23e9a9b2.o(bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20317xb8a521db()) == 1);
        android.content.res.AssetManager assets = m80379x76847179().getAssets();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(assets, "getAssets(...)");
        c22789xd23e9a9b2.k(assets, "status_like_bmp.pag");
        c22789xd23e9a9b2.g();
        c22789xd23e9a9b2.setRotation(z17 ? new java.util.Random().nextInt(31) - 15 : 0);
        this.A = new java.lang.ref.WeakReference(c22789xd23e9a9b2);
    }

    public final void U6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusCardFeedUIC", "reset: ");
        java.util.Map map = this.f255311i;
        java.util.Iterator it = ((java.util.LinkedHashMap) map).values().iterator();
        while (it.hasNext()) {
            ((bi4.n0) it.next()).c();
        }
        ((java.util.LinkedHashMap) map).clear();
        ((java.util.LinkedHashMap) this.f255312m).clear();
        this.f255315p.clear();
        this.D.mo48814x2efc64();
        this.f255313n.clear();
        this.f255308f = null;
        this.f255307e = null;
        this.f255314o = -1;
        this.f255309g = "";
        this.f255310h = "";
    }

    public final void V6(yz5.a aVar) {
        if (this.f255319t) {
            in5.s0 Q6 = Q6();
            java.lang.Object obj = Q6 != null ? Q6.f374657h : null;
            bi4.n0 n0Var = obj instanceof bi4.n0 ? (bi4.n0) obj : null;
            if (n0Var != null) {
                n0Var.a();
            }
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
        }
    }

    public final void W6(boolean z17) {
        java.lang.ref.WeakReference weakReference = this.f255307e;
        in5.s0 s0Var = weakReference != null ? (in5.s0) weakReference.get() : null;
        java.lang.Object obj = s0Var != null ? s0Var.f374657h : null;
        if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.w1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.w1 w1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.w1) obj;
            int m71907xfa36d49f = w1Var.m71907xfa36d49f();
            w1Var.i(m71907xfa36d49f, z17, false);
            w1Var.f(m71907xfa36d49f);
            w1Var.h(m71907xfa36d49f);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        in5.s0 Q6 = Q6();
        java.lang.Object obj = Q6 != null ? Q6.f374657h : null;
        bi4.n0 n0Var = obj instanceof bi4.n0 ? (bi4.n0) obj : null;
        if (n0Var != null) {
            n0Var.mo10629xbdc3c5dc();
        }
        return super.mo2274xbdc3c5dc();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("KEY_FROM_SCENE");
        if (stringExtra == null) {
            stringExtra = "SCENE_DEFAULT";
        }
        this.f255323x = stringExtra;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(stringExtra, "SCENE_DEFAULT") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f255323x, "SCENE_HISTORY_FEED")) {
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TEXT_STATUS_CARD_FEED_ENTER_TIMES_INT;
            int r17 = c17.r(u3Var, 0);
            this.f255306d = r17 < 3;
            gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(r17 + 1));
        }
        if (S6()) {
            this.D.mo48813x58998cd();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateBefore */
    public void mo2277xb2f1ab1a(android.os.Bundle bundle) {
        super.mo2277xb2f1ab1a(bundle);
        if (b21.m.c()) {
            b21.m.j();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        U6();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        boolean z17 = false;
        this.f255322w = false;
        in5.s0 Q6 = Q6();
        java.lang.Object obj = Q6 != null ? Q6.f374657h : null;
        bi4.n0 n0Var = obj instanceof bi4.n0 ? (bi4.n0) obj : null;
        if (n0Var != null) {
            n0Var.d();
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        android.app.Activity m80379x76847179 = m80379x76847179();
        objArr[0] = m80379x76847179 != null ? java.lang.Boolean.valueOf(m80379x76847179.isFinishing()) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusCardFeedUIC", "onPause() called isFinishing:%s", objArr);
        android.app.Activity m80379x768471792 = m80379x76847179();
        if (m80379x768471792 != null && m80379x768471792.isFinishing()) {
            z17 = true;
        }
        if (z17) {
            in5.s0 Q62 = Q6();
            java.lang.Object obj2 = Q62 != null ? Q62.f374657h : null;
            bi4.n0 n0Var2 = obj2 instanceof bi4.n0 ? (bi4.n0) obj2 : null;
            if (n0Var2 != null) {
                n0Var2.S5(203L);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        this.f255322w = true;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f255323x, "SCENE_HISTORY_FEED")) {
            android.app.Activity context = m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ac.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ac) a17).O6(true);
        }
        V6(null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusCardFeedUIC", "onResume() called");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStart */
    public void mo2286xb05099c3() {
        super.mo2286xb05099c3();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        super.mo2287xc39f8281();
    }
}
