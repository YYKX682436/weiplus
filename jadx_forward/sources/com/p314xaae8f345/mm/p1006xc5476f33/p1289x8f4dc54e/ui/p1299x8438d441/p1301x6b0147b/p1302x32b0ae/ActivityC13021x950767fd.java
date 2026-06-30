package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1301x6b0147b.p1302x32b0ae;

@db5.a(m123858x6ac9171 = 32)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/lite/VideoLiteUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-brandservice_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.video.lite.VideoLiteUI */
/* loaded from: classes15.dex */
public final class ActivityC13021x950767fd extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f176057d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a f176058e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1301x6b0147b.p1302x32b0ae.C13020xcda67afb f176059f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f176060g;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d3k;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1301x6b0147b.p1302x32b0ae.C13020xcda67afb c13020xcda67afb = this.f176059f;
        if (c13020xcda67afb != null) {
            int i17 = newConfig.orientation;
            if (i17 == 1) {
                android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) c13020xcda67afb.F.getLayoutParams();
                layoutParams.addRule(2, com.p314xaae8f345.mm.R.id.f569078oy5);
                layoutParams.removeRule(8);
                layoutParams.removeRule(1);
                layoutParams.setMargins(i65.a.f(c13020xcda67afb.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz), 0, i65.a.f(c13020xcda67afb.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz), 0);
                c13020xcda67afb.F.setLayoutParams(layoutParams);
                ((android.widget.RelativeLayout.LayoutParams) c13020xcda67afb.D.getLayoutParams()).setMargins(i65.a.f(c13020xcda67afb.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz), i65.a.f(c13020xcda67afb.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz), 0, 0);
                ((android.widget.RelativeLayout.LayoutParams) c13020xcda67afb.E.getLayoutParams()).setMargins(0, 0, 0, i65.a.f(c13020xcda67afb.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
                return;
            }
            if (i17 == 2) {
                android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) c13020xcda67afb.F.getLayoutParams();
                layoutParams2.removeRule(2);
                layoutParams2.addRule(8, com.p314xaae8f345.mm.R.id.f569078oy5);
                layoutParams2.addRule(1, com.p314xaae8f345.mm.R.id.f569078oy5);
                layoutParams2.setMargins(i65.a.f(c13020xcda67afb.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj), 0, i65.a.f(c13020xcda67afb.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz), 0);
                c13020xcda67afb.F.setLayoutParams(layoutParams2);
                android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) c13020xcda67afb.D.getLayoutParams();
                int f17 = i65.a.f(c13020xcda67afb.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
                layoutParams3.setMargins(f17, i65.a.f(c13020xcda67afb.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), 0, i65.a.b(c13020xcda67afb.getContext(), -5));
                ((android.widget.RelativeLayout.LayoutParams) c13020xcda67afb.E.getLayoutParams()).setMargins(f17, 0, 0, i65.a.f(c13020xcda67afb.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        mo2550x7c2abd06(1);
        super.onCreate(bundle);
        m78583x85ccfe01(8);
        ((q90.i) ((r90.l) i95.n0.c(r90.l.class))).getClass();
        ai3.d.f86640a = true;
        getWindow().setNavigationBarColor(-16777216);
        getWindow().getDecorView().setSystemUiVisibility(cc1.y.f4296x366c91de);
        this.f176057d = getIntent().getStringExtra("rawUrl");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.bdx);
        this.f176060g = imageView;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12263xadf304be c12263xadf304be = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12263xadf304be(this, null);
        c12263xadf304be.m51393xeb0c20f8(gf1.f.f352782d);
        this.f176058e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a(this, c12263xadf304be);
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1301x6b0147b.p1302x32b0ae.C13020xcda67afb c13020xcda67afb = new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1301x6b0147b.p1302x32b0ae.C13020xcda67afb(this);
        this.f176059f = c13020xcda67afb;
        c13020xcda67afb.m54406x34df7252(new ns1.d(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1301x6b0147b.p1302x32b0ae.C13020xcda67afb c13020xcda67afb2 = this.f176059f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c13020xcda67afb2);
        c13020xcda67afb2.m54407xaeef7d6b(new ns1.e(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a = this.f176058e;
        if (c12262x4a2a25a != null) {
            c12262x4a2a25a.k(this.f176059f);
        }
        c12263xadf304be.mo51397xb9405cf9(this.f176059f);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.cgj);
        if (frameLayout != null) {
            frameLayout.addView(this.f176058e, 0, new android.widget.FrameLayout.LayoutParams(-1, -1));
        }
        android.widget.ImageView imageView2 = this.f176060g;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new ns1.f(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a2 = this.f176058e;
        if (c12262x4a2a25a2 != null) {
            c12262x4a2a25a2.m51338xcc520c05(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a3 = this.f176058e;
        if (c12262x4a2a25a3 != null) {
            c12262x4a2a25a3.m51354x764cf626(false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a4 = this.f176058e;
        if (c12262x4a2a25a4 != null) {
            c12262x4a2a25a4.m51356x764d819b(false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a5 = this.f176058e;
        if (c12262x4a2a25a5 != null) {
            c12262x4a2a25a5.m51342xbe31a230(null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a6 = this.f176058e;
        if (c12262x4a2a25a6 != null) {
            c12262x4a2a25a6.m51357x2f76610("contain");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a7 = this.f176058e;
        if (c12262x4a2a25a7 != null) {
            c12262x4a2a25a7.m51363x8498f2ac(false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a8 = this.f176058e;
        if (c12262x4a2a25a8 != null) {
            c12262x4a2a25a8.m51365xdb9e6204(false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a9 = this.f176058e;
        if (c12262x4a2a25a9 != null) {
            c12262x4a2a25a9.m51366x69f2cf09(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a10 = this.f176058e;
        if (c12262x4a2a25a10 != null) {
            c12262x4a2a25a10.m51368x28c841cc(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a11 = this.f176058e;
        if (c12262x4a2a25a11 != null) {
            c12262x4a2a25a11.m51364x1cf93842(false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a12 = this.f176058e;
        if (c12262x4a2a25a12 != null) {
            c12262x4a2a25a12.m51353xc2e9d13b(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a13 = this.f176058e;
        if (c12262x4a2a25a13 != null) {
            c12262x4a2a25a13.m51352x1a460d6c(false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a14 = this.f176058e;
        if (c12262x4a2a25a14 != null) {
            c12262x4a2a25a14.m51361x2a96dc34(false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a15 = this.f176058e;
        if (c12262x4a2a25a15 != null) {
            c12262x4a2a25a15.m51362xb4d85e2b(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a16 = this.f176058e;
        if (c12262x4a2a25a16 != null) {
            c12262x4a2a25a16.m51358x263c1df8(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a17 = this.f176058e;
        if (c12262x4a2a25a17 != null) {
            c12262x4a2a25a17.g(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a18 = this.f176058e;
        if (c12262x4a2a25a18 != null) {
            c12262x4a2a25a18.w(this.f176057d, false, 0);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a = this.f176058e;
        if (c12262x4a2a25a != null) {
            c12262x4a2a25a.o("onUIDestroy", new java.lang.Object[0]);
            c12262x4a2a25a.f();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a = this.f176058e;
        if (c12262x4a2a25a != null) {
            c12262x4a2a25a.f165062f.e();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a = this.f176058e;
        if (c12262x4a2a25a != null) {
            c12262x4a2a25a.r();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: onSwipeBackFinish */
    public boolean mo48654xe4dc1f55() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        getWindow().getDecorView().setSystemUiVisibility(cc1.y.f4296x366c91de);
    }
}
