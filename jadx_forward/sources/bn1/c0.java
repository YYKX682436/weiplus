package bn1;

/* loaded from: classes14.dex */
public final class c0 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 f104322d;

    /* renamed from: e, reason: collision with root package name */
    public int f104323e;

    /* renamed from: f, reason: collision with root package name */
    public bn1.v f104324f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.FrameLayout f104325g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f104326h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f104327i;

    /* renamed from: m, reason: collision with root package name */
    public int f104328m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f104329n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f104330o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f104326h = true;
        this.f104327i = "";
        this.f104329n = "MicroMsg.BizAudioPlayerDrawerUIC";
        this.f104330o = new java.util.concurrent.CopyOnWriteArrayList();
    }

    public final void O6(android.content.Intent intent, int i17, bn1.w tingPlayerDrawerType) {
        java.lang.String stringExtra;
        java.lang.String stringExtra2;
        boolean z17;
        bn1.v vVar;
        android.view.View view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tingPlayerDrawerType, "tingPlayerDrawerType");
        bn1.w wVar = bn1.w.f104367d;
        java.lang.String str = "";
        if (tingPlayerDrawerType != wVar ? (stringExtra = intent.getStringExtra("Contact_User")) == null : (stringExtra = intent.getStringExtra("finder_username")) == null) {
            stringExtra = "";
        }
        this.f104327i = stringExtra;
        if (tingPlayerDrawerType != wVar ? (stringExtra2 = intent.getStringExtra("Contact_Scene_Note")) != null : (stringExtra2 = intent.getStringExtra("key_extra_info")) != null) {
            str = stringExtra2;
        }
        int hashCode = (this.f104327i + tingPlayerDrawerType + str).hashCode();
        int i18 = this.f104323e;
        r8 = null;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c = null;
        int i19 = com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c;
        if (i18 == hashCode) {
            if (tingPlayerDrawerType != bn1.w.f104368e) {
                i19 = com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f;
            }
            bn1.v vVar2 = this.f104324f;
            java.lang.Object m10875x8dffbaba = vVar2 != null ? vVar2.m10875x8dffbaba() : null;
            cn1.e eVar = m10875x8dffbaba instanceof cn1.e ? (cn1.e) m10875x8dffbaba : null;
            if (eVar != null) {
                eVar.f(i19);
            }
            bn1.v vVar3 = this.f104324f;
            if (vVar3 != null) {
                vVar3.j(-vVar3.edgeAttached, false);
                return;
            }
            return;
        }
        bn1.w wVar2 = bn1.w.f104368e;
        int i27 = tingPlayerDrawerType == wVar2 ? com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c : com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f;
        bn1.v vVar4 = this.f104324f;
        if (vVar4 == null) {
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(m80379x76847179());
            frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            frameLayout.setId(com.p314xaae8f345.mm.R.id.sib);
            frameLayout.setBackgroundColor(frameLayout.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
            this.f104325g = frameLayout;
            float n17 = i17 > 0 ? i17 : (float) (com.p314xaae8f345.mm.ui.bk.n(1.0f) * 0.7d);
            bn1.f fVar = new bn1.f();
            fVar.f104334a = n17;
            z17 = true;
            fVar.f104335b = new cn1.e(m80379x76847179(), i27, 0, 0, false, 28, null);
            android.widget.FrameLayout frameLayout2 = this.f104325g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(frameLayout2);
            fVar.f104336c = new cn1.a(frameLayout2);
            ((java.util.HashSet) fVar.f104337d).add(new bn1.x(this));
            android.view.View mo144222x4ff8c0f0 = mo144222x4ff8c0f0(android.R.id.content);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f0, "findViewById(...)");
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) mo144222x4ff8c0f0;
            android.content.Context context = viewGroup.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            if (fVar.f104334a == 0.0f) {
                throw new java.lang.IllegalStateException("expandHeight should not be zero");
            }
            bn1.v vVar5 = new bn1.v(context, fVar);
            viewGroup.removeView(vVar5);
            viewGroup.addView(vVar5);
            this.f104324f = vVar5;
            vVar5.m10897xfadc8465(new bn1.y(this));
        } else {
            z17 = true;
            cn1.g m10875x8dffbaba2 = vVar4.m10875x8dffbaba();
            cn1.e eVar2 = m10875x8dffbaba2 instanceof cn1.e ? (cn1.e) m10875x8dffbaba2 : null;
            if (eVar2 != null) {
                eVar2.f(i27);
            }
            if (i17 > 0 && (vVar = this.f104324f) != null) {
                vVar.mo10892x46e30de3(i17);
            }
        }
        intent.putExtra("key_is_auto_report", false);
        intent.putExtra("key_enter_dialog", z17);
        p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = m158354x19263085().mo7595x9cdc264().m7630xb2c12e75();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m7630xb2c12e75, "beginTransaction(...)");
        android.widget.FrameLayout frameLayout3 = this.f104325g;
        if (frameLayout3 != null) {
            frameLayout3.removeAllViews();
        }
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 b17 = lk5.q0.b(tingPlayerDrawerType == wVar ? "com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI" : "com.tencent.mm.plugin.profile.ui.DialogContactInfoUI", intent, false, 4, null);
        this.f104322d = b17;
        b17.q0(new bn1.z(this));
        bn1.v vVar6 = this.f104324f;
        if (vVar6 != null) {
            vVar6.m10890x77f391b9(new bn1.a0(tingPlayerDrawerType, this));
        }
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83 = this.f104322d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22584xf7d97e83);
        m7630xb2c12e75.k(com.p314xaae8f345.mm.R.id.sib, c22584xf7d97e83, null);
        m7630xb2c12e75.f();
        this.f104323e = hashCode;
        if (tingPlayerDrawerType == wVar2) {
            com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e832 = this.f104322d;
            if (c22584xf7d97e832 != null && (view = c22584xf7d97e832.f292670i) != null) {
                c2678xa407981c = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) view.findViewWithTag("com.tencent.mm.plugin.profile.ui.DialogContactInfoUI#AppBarLayout");
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("appBarLayout is null? ");
            sb6.append(c2678xa407981c == null ? z17 : false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f104329n, sb6.toString());
            if (c2678xa407981c != null) {
                c2678xa407981c.a(new bn1.b0(this));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        bn1.v vVar = this.f104324f;
        if (!(vVar != null ? vVar.isDrawerOpen : false)) {
            return super.mo2274xbdc3c5dc();
        }
        if (vVar != null) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1248x373aa5.AbstractGestureDetectorOnGestureListenerC12829xf500c313.f174025u;
            vVar.j(vVar.edgeAttached, true);
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
        this.f104324f = null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        if (this.f104326h) {
            this.f104326h = false;
            return;
        }
        bn1.v vVar = this.f104324f;
        if (vVar != null) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1248x373aa5.AbstractGestureDetectorOnGestureListenerC12829xf500c313.f174025u;
            vVar.j(0, false);
        }
    }
}
