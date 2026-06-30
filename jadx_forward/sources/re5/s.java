package re5;

/* loaded from: classes12.dex */
public final class s extends lf3.o implements re5.b, kg3.d, com.p314xaae8f345.mm.ui.fa {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.RelativeLayout f476124d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2769xc43d2152.C22724xdb26ef0b f476125e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f476126f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f476127g;

    /* renamed from: h, reason: collision with root package name */
    public gg3.c f476128h;

    /* renamed from: i, reason: collision with root package name */
    public final long f476129i;

    /* renamed from: m, reason: collision with root package name */
    public final int f476130m;

    /* renamed from: mStatusBarHeightCallback */
    private vj5.k f76503xb52fe880;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f476129i = 340L;
        this.f476130m = com.p314xaae8f345.mm.ui.zk.a(m80379x76847179(), 25);
    }

    @Override // kg3.d
    public void H2() {
        android.widget.RelativeLayout relativeLayout = this.f476124d;
        if (relativeLayout != null) {
            relativeLayout.setPadding(0, com.p314xaae8f345.mm.ui.bl.h(relativeLayout.getContext()), 0, 0);
        }
    }

    @Override // lf3.o
    public int T6() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e5f;
    }

    public final void V6() {
        m158354x19263085().getWindow().clearFlags(2048);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085();
        if (abstractActivityC21394xb3d2c0cf != null) {
            if (fp.e0.c() || fp.e0.i() || fp.e0.e()) {
                abstractActivityC21394xb3d2c0cf.getWindow().setFlags(134218752, 134218752);
            } else {
                abstractActivityC21394xb3d2c0cf.getWindow().setFlags(134217728, 134217728);
            }
            android.view.View decorView = abstractActivityC21394xb3d2c0cf.getWindow().getDecorView();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
            decorView.setSystemUiVisibility(1028);
            p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = abstractActivityC21394xb3d2c0cf.mo2533x106ab264();
            if (mo2533x106ab264 != null) {
                mo2533x106ab264.o();
            }
            if (android.os.Build.VERSION.SDK_INT < 30) {
                decorView.setSystemUiVisibility(0);
                decorView.setSystemUiVisibility(4102);
                return;
            }
            android.view.WindowInsetsController windowInsetsController = decorView.getWindowInsetsController();
            if (windowInsetsController != null) {
                windowInsetsController.hide(android.view.WindowInsets.Type.statusBars());
                windowInsetsController.hide(android.view.WindowInsets.Type.navigationBars());
                windowInsetsController.setSystemBarsBehavior(2);
            }
        }
    }

    public final void W6() {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf;
        if (this.f476127g || (abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085()) == null) {
            return;
        }
        abstractActivityC21394xb3d2c0cf.getWindow().clearFlags(201327616);
        if (android.os.Build.VERSION.SDK_INT < 30) {
            android.view.View decorView = abstractActivityC21394xb3d2c0cf.getWindow().getDecorView();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
            decorView.setSystemUiVisibility(0);
        } else {
            android.view.WindowInsetsController insetsController = abstractActivityC21394xb3d2c0cf.getWindow().getInsetsController();
            if (insetsController != null) {
                insetsController.show(android.view.WindowInsets.Type.statusBars() | android.view.WindowInsets.Type.navigationBars());
            }
        }
    }

    public final void X6(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        android.widget.RelativeLayout relativeLayout = this.f476124d;
        if (relativeLayout != null) {
            W6();
            oa5.b.b(relativeLayout).k(new re5.q(relativeLayout)).o(new re5.r(relativeLayout)).g(this.f476129i).l();
        }
    }

    @Override // kg3.d
    public void h4() {
        android.widget.RelativeLayout relativeLayout = this.f476124d;
        if (relativeLayout != null) {
            int f17 = i65.a.f(relativeLayout.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn);
            relativeLayout.setPadding(f17, this.f476130m, f17, 0);
        }
        V6();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onConfigurationChanged */
    public void mo2276x50e1c15d(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        super.mo2276x50e1c15d(newConfig);
        this.f476127g = newConfig.orientation == 2;
        new kg3.n(m80379x76847179(), this, false).c(newConfig);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        this.f476127g = m158354x19263085().getResources().getConfiguration().orientation == 2;
        W6();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085();
        if (abstractActivityC21394xb3d2c0cf != null) {
            com.p314xaae8f345.mm.ui.a4.f278650a.i(abstractActivityC21394xb3d2c0cf);
            android.view.View w17 = abstractActivityC21394xb3d2c0cf.mo78514x143f1b92().w();
            if (w17 != null) {
                w17.setPadding(0, 0, 0, 0);
            }
            abstractActivityC21394xb3d2c0cf.mo78514x143f1b92().O0(true);
            abstractActivityC21394xb3d2c0cf.mo78578x8b18f126(abstractActivityC21394xb3d2c0cf.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0074x22961cbd c0074x22961cbd = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0074x22961cbd) abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.crd);
            if (c0074x22961cbd != null) {
                c0074x22961cbd.m2617x57fa0451(true);
                c0074x22961cbd.requestLayout();
            }
            p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = abstractActivityC21394xb3d2c0cf.mo2533x106ab264();
            if (mo2533x106ab264 != null) {
                mo2533x106ab264.o();
            }
            abstractActivityC21394xb3d2c0cf.mo78530x8b45058f();
            abstractActivityC21394xb3d2c0cf.mo78529xe76c1b79();
            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.of9);
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2769xc43d2152.C22724xdb26ef0b c22724xdb26ef0b = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2769xc43d2152.C22724xdb26ef0b) relativeLayout.findViewById(com.p314xaae8f345.mm.R.id.f563975ep);
                c22724xdb26ef0b.setTextColor(c22724xdb26ef0b.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.by));
                com.p314xaae8f345.mm.ui.bk.r0(c22724xdb26ef0b.getPaint(), 0.8f);
                c22724xdb26ef0b.invalidate();
                this.f476125e = c22724xdb26ef0b;
                android.widget.TextView textView = (android.widget.TextView) relativeLayout.findViewById(com.p314xaae8f345.mm.R.id.hbh);
                textView.setTextColor(textView.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.by));
                com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
                this.f476126f = textView;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) relativeLayout.findViewById(com.p314xaae8f345.mm.R.id.hbe);
                c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562258b5);
                c22699x3dcdb352.m82040x7541828(c22699x3dcdb352.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.by));
                c22699x3dcdb352.setOnClickListener(new re5.l(abstractActivityC21394xb3d2c0cf));
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) relativeLayout.findViewById(com.p314xaae8f345.mm.R.id.hbg);
                c22699x3dcdb3522.m82040x7541828(c22699x3dcdb3522.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.by));
                if (abstractActivityC21394xb3d2c0cf.getIntent().getBooleanExtra("KEY_VIDEO_HIDE_MENU", false)) {
                    c22699x3dcdb3522.setVisibility(8);
                } else {
                    c22699x3dcdb3522.setVisibility(0);
                    c22699x3dcdb3522.setOnClickListener(new re5.m(this));
                }
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
                vj5.n b17 = vj5.n.b(m158354x19263085);
                re5.i iVar = new re5.i(this, relativeLayout);
                this.f76503xb52fe880 = iVar;
                b17.d(iVar);
                m158354x19263085.getWindow().getDecorView().requestApplyInsets();
                vj5.o.e(m158354x19263085.getWindow());
                this.f476124d = relativeLayout;
            } else {
                relativeLayout = null;
            }
            this.f476124d = relativeLayout;
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085();
        if (abstractActivityC21394xb3d2c0cf2 != null) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630852, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            X6((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x192630852);
            abstractActivityC21394xb3d2c0cf2.m78488x9f743232(this);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateBefore */
    public void mo2277xb2f1ab1a(android.os.Bundle bundle) {
        super.mo2277xb2f1ab1a(bundle);
        o25.n1.e(m158354x19263085());
        n3.h2.a(m158354x19263085().getWindow(), false);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085();
        if (abstractActivityC21394xb3d2c0cf != null) {
            abstractActivityC21394xb3d2c0cf.m78550x87bf02d5(this);
            vj5.n.b(abstractActivityC21394xb3d2c0cf).f(this.f76503xb52fe880);
        }
    }
}
