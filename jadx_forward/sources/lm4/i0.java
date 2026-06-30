package lm4;

/* loaded from: classes14.dex */
public final class i0 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 f401101d;

    /* renamed from: e, reason: collision with root package name */
    public int f401102e;

    /* renamed from: f, reason: collision with root package name */
    public lm4.b0 f401103f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.FrameLayout f401104g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f401105h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f401106i;

    /* renamed from: m, reason: collision with root package name */
    public int f401107m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f401108n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f401109o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f401105h = true;
        this.f401106i = "";
        this.f401108n = "TingPlayerDrawerUIC";
        this.f401109o = new java.util.concurrent.CopyOnWriteArrayList();
    }

    public final void O6(android.content.Intent intent, int i17, lm4.c0 tingPlayerDrawerType) {
        java.lang.String stringExtra;
        java.lang.String stringExtra2;
        boolean z17;
        lm4.b0 b0Var;
        android.view.View view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tingPlayerDrawerType, "tingPlayerDrawerType");
        lm4.c0 c0Var = lm4.c0.f401077d;
        java.lang.String str = "";
        if (tingPlayerDrawerType != c0Var ? (stringExtra = intent.getStringExtra("Contact_User")) == null : (stringExtra = intent.getStringExtra("finder_username")) == null) {
            stringExtra = "";
        }
        this.f401106i = stringExtra;
        if (tingPlayerDrawerType != c0Var ? (stringExtra2 = intent.getStringExtra("Contact_Scene_Note")) != null : (stringExtra2 = intent.getStringExtra("key_extra_info")) != null) {
            str = stringExtra2;
        }
        int hashCode = (this.f401106i + tingPlayerDrawerType + str).hashCode();
        int i18 = this.f401102e;
        r8 = null;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c = null;
        int i19 = com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c;
        if (i18 == hashCode) {
            if (tingPlayerDrawerType != lm4.c0.f401078e) {
                i19 = com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f;
            }
            lm4.b0 b0Var2 = this.f401103f;
            java.lang.Object m146026x8dffbaba = b0Var2 != null ? b0Var2.m146026x8dffbaba() : null;
            mm4.e eVar = m146026x8dffbaba instanceof mm4.e ? (mm4.e) m146026x8dffbaba : null;
            if (eVar != null) {
                eVar.f(i19);
            }
            lm4.b0 b0Var3 = this.f401103f;
            if (b0Var3 != null) {
                b0Var3.j(-b0Var3.edgeAttached, false);
                return;
            }
            return;
        }
        lm4.c0 c0Var2 = lm4.c0.f401078e;
        int i27 = tingPlayerDrawerType == c0Var2 ? com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c : com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f;
        lm4.b0 b0Var4 = this.f401103f;
        if (b0Var4 == null) {
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(m80379x76847179());
            frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            frameLayout.setId(com.p314xaae8f345.mm.R.id.o9m);
            frameLayout.setBackgroundColor(frameLayout.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
            this.f401104g = frameLayout;
            float n17 = i17 > 0 ? i17 : (float) (com.p314xaae8f345.mm.ui.bk.n(1.0f) * 0.7d);
            lm4.l lVar = new lm4.l();
            lVar.f401113a = n17;
            z17 = true;
            lVar.f401114b = new mm4.e(m80379x76847179(), i27, 0, 0, false, 28, null);
            android.widget.FrameLayout frameLayout2 = this.f401104g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(frameLayout2);
            lVar.f401115c = new mm4.a(frameLayout2);
            ((java.util.HashSet) lVar.f401116d).add(new lm4.d0(this));
            android.view.View mo144222x4ff8c0f0 = mo144222x4ff8c0f0(android.R.id.content);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f0, "findViewById(...)");
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) mo144222x4ff8c0f0;
            android.content.Context context = viewGroup.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            if (lVar.f401113a == 0.0f) {
                throw new java.lang.IllegalStateException("expandHeight should not be zero");
            }
            lm4.b0 b0Var5 = new lm4.b0(context, lVar);
            viewGroup.removeView(b0Var5);
            viewGroup.addView(b0Var5);
            this.f401103f = b0Var5;
            b0Var5.m146047xfadc8465(new lm4.e0(this));
        } else {
            z17 = true;
            mm4.g m146026x8dffbaba2 = b0Var4.m146026x8dffbaba();
            mm4.e eVar2 = m146026x8dffbaba2 instanceof mm4.e ? (mm4.e) m146026x8dffbaba2 : null;
            if (eVar2 != null) {
                eVar2.f(i27);
            }
            if (i17 > 0 && (b0Var = this.f401103f) != null) {
                b0Var.mo72258x46e30de3(i17);
            }
        }
        intent.putExtra("key_is_auto_report", false);
        intent.putExtra("key_enter_dialog", z17);
        p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = m158354x19263085().mo7595x9cdc264().m7630xb2c12e75();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m7630xb2c12e75, "beginTransaction(...)");
        android.widget.FrameLayout frameLayout3 = this.f401104g;
        if (frameLayout3 != null) {
            frameLayout3.removeAllViews();
        }
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 b17 = lk5.q0.b(tingPlayerDrawerType == c0Var ? "com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI" : "com.tencent.mm.plugin.profile.ui.DialogContactInfoUI", intent, false, 4, null);
        this.f401101d = b17;
        b17.q0(new lm4.f0(this));
        lm4.b0 b0Var6 = this.f401103f;
        if (b0Var6 != null) {
            b0Var6.m146041x77f391b9(new lm4.g0(tingPlayerDrawerType, this));
        }
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83 = this.f401101d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22584xf7d97e83);
        m7630xb2c12e75.k(com.p314xaae8f345.mm.R.id.o9m, c22584xf7d97e83, null);
        m7630xb2c12e75.f();
        this.f401102e = hashCode;
        if (tingPlayerDrawerType == c0Var2) {
            com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e832 = this.f401101d;
            if (c22584xf7d97e832 != null && (view = c22584xf7d97e832.f292670i) != null) {
                c2678xa407981c = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) view.findViewWithTag("com.tencent.mm.plugin.profile.ui.DialogContactInfoUI#AppBarLayout");
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("appBarLayout is null? ");
            sb6.append(c2678xa407981c == null ? z17 : false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f401108n, sb6.toString());
            if (c2678xa407981c != null) {
                c2678xa407981c.a(new lm4.h0(this));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        lm4.b0 b0Var = this.f401103f;
        if (!(b0Var != null ? b0Var.isDrawerOpen : false)) {
            return super.mo2274xbdc3c5dc();
        }
        if (b0Var != null) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2304x373aa5.AbstractGestureDetectorOnGestureListenerC18733xe073c388.f256354u;
            b0Var.j(b0Var.edgeAttached, true);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        this.f401103f = null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        if (this.f401105h) {
            this.f401105h = false;
            return;
        }
        lm4.b0 b0Var = this.f401103f;
        if (b0Var != null) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2304x373aa5.AbstractGestureDetectorOnGestureListenerC18733xe073c388.f256354u;
            b0Var.j(0, false);
        }
    }
}
