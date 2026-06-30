package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderBaseFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/i0;", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2967xc3bba14a, "Lcom/tencent/mm/plugin/finder/feed/c0;", "P", "Lcom/tencent/mm/plugin/finder/ui/MMFinderFeedDetailUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderBaseFeedUI */
/* loaded from: classes2.dex */
public abstract class AbstractActivityC13937x4755f3c9<V extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0, P extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0> extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15086x1d5b7f69 {

    /* renamed from: t, reason: collision with root package name */
    public vb2.m f190752t;

    public abstract com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0 c7();

    public abstract com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 d7();

    public void e7() {
    }

    public abstract void f7();

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        return kz5.z.D0(new java.lang.Class[]{com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f2.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fy.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u6.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ye.class});
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: isHideStatusBar */
    public boolean getP() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f;
        super.onActivityResult(i17, i18, intent);
        if (-1 == i18 && i17 == 101) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56068x4905e9fa = d7().m56068x4905e9fa();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = m56068x4905e9fa.getLayoutManager();
            if (layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = m56068x4905e9fa.p0(((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager).w());
                in5.s0 s0Var = p07 instanceof in5.s0 ? (in5.s0) p07 : null;
                if (s0Var == null || (c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) s0Var.p(com.p314xaae8f345.mm.R.id.e_k)) == null) {
                    return;
                }
                long longExtra = intent != null ? intent.getLongExtra("KEY_CACHE_OBJECT_ID", -1L) : -1L;
                long longExtra2 = intent != null ? intent.getLongExtra("KEY_VIDEO_START_PLAY_TIME_MS", -1L) : -1L;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderBaseFeedUI", "[onActivityResult] feedId=" + pm0.v.u(longExtra) + " seekTime=" + longExtra2);
                if (longExtra2 != -1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f.Z(c15196x85976f5f, longExtra2, 0, 0.0f, false, null, 30, null);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg) r0).P6(false) != false) goto L6;
     */
    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBackPressed() {
        /*
            r2 = this;
            com.tencent.mm.plugin.finder.feed.c0 r0 = r2.c7()
            boolean r0 = r0.F()
            if (r0 != 0) goto L24
            pf5.z r0 = pf5.z.f435481a
            pf5.v r0 = r0.a(r2)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.gg> r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg.class
            androidx.lifecycle.c1 r0 = r0.a(r1)
            java.lang.String r1 = "get(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r1)
            com.tencent.mm.plugin.finder.viewmodel.component.gg r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg) r0
            r1 = 0
            boolean r0 = r0.P6(r1)
            if (r0 == 0) goto L25
        L24:
            r1 = 1
        L25:
            if (r1 != 0) goto L53
            java.lang.Class<cq.k> r0 = cq.k.class
            i95.m r0 = i95.n0.c(r0)
            java.lang.String r1 = "getService(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r1)
            cq.k r0 = (cq.k) r0
            com.tencent.mm.plugin.finder.storage.t70 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a
            jz5.g r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Z5
            jz5.n r0 = (jz5.n) r0
            java.lang.Object r0 = r0.mo141623x754a37bb()
            lb2.j r0 = (lb2.j) r0
            java.lang.Object r0 = r0.r()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L50
            super.onBackPressed()
            goto L53
        L50:
            r2.finish()
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC13937x4755f3c9.onBackPressed():void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15086x1d5b7f69, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.View decorView = getWindow().getDecorView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1024 | 256);
        getWindow().setStatusBarColor(0);
        mo78514x143f1b92().W0(this, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        com.p314xaae8f345.mm.ui.r0.a(this, false);
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        if (mo2533x106ab264 != null) {
            mo2533x106ab264.w(new android.graphics.drawable.ColorDrawable(0));
            mo2533x106ab264.o();
        }
        android.view.LayoutInflater b17 = com.p314xaae8f345.mm.ui.id.b(mo55332x76847179());
        android.view.View m78510xe15784dd = m78510xe15784dd();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m78510xe15784dd, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) m78510xe15784dd;
        android.view.View inflate = b17.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aj9, viewGroup, false);
        viewGroup.addView(inflate);
        this.f190752t = vb2.m.a(inflate);
        int h17 = com.p314xaae8f345.mm.ui.bl.h(this);
        vb2.m mVar = this.f190752t;
        if (mVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderFullActionBarLayoutBinding");
            throw null;
        }
        android.widget.FrameLayout frameLayout = mVar.f516204g;
        frameLayout.setPadding(0, h17, 0, 0);
        boolean z17 = true;
        com.p314xaae8f345.mm.ui.a4.g(frameLayout, true);
        vb2.m mVar2 = this.f190752t;
        if (mVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderFullActionBarLayoutBinding");
            throw null;
        }
        mVar2.f516199b.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.a1(this));
        if (com.p314xaae8f345.mm.ui.bk.y()) {
            vb2.m mVar3 = this.f190752t;
            if (mVar3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderFullActionBarLayoutBinding");
                throw null;
            }
            mVar3.f516211n.setVisibility(0);
            vb2.m mVar4 = this.f190752t;
            if (mVar4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderFullActionBarLayoutBinding");
                throw null;
            }
            mVar4.f516209l.setVisibility(0);
        } else {
            vb2.m mVar5 = this.f190752t;
            if (mVar5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderFullActionBarLayoutBinding");
                throw null;
            }
            mVar5.f516211n.setVisibility(8);
            vb2.m mVar6 = this.f190752t;
            if (mVar6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderFullActionBarLayoutBinding");
                throw null;
            }
            mVar6.f516209l.setVisibility(8);
        }
        vb2.m mVar7 = this.f190752t;
        if (mVar7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderFullActionBarLayoutBinding");
            throw null;
        }
        mVar7.f516211n.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.d1(this));
        java.lang.CharSequence m78518x4c0ad082 = m78518x4c0ad082();
        if (m78518x4c0ad082 != null && m78518x4c0ad082.length() != 0) {
            z17 = false;
        }
        if (z17) {
            vb2.m mVar8 = this.f190752t;
            if (mVar8 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderFullActionBarLayoutBinding");
                throw null;
            }
            mVar8.f516202e.setVisibility(8);
        } else {
            vb2.m mVar9 = this.f190752t;
            if (mVar9 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderFullActionBarLayoutBinding");
                throw null;
            }
            mVar9.f516202e.setVisibility(0);
            vb2.m mVar10 = this.f190752t;
            if (mVar10 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderFullActionBarLayoutBinding");
                throw null;
            }
            mVar10.f516202e.setText(m78518x4c0ad082());
        }
        com.p314xaae8f345.mm.ui.bk.i0(getWindow(), false);
        com.p314xaae8f345.mm.ui.bk.h0(getWindow(), false);
        mo78578x8b18f126(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560245f3));
        vb2.m mVar11 = this.f190752t;
        if (mVar11 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderFullActionBarLayoutBinding");
            throw null;
        }
        mVar11.f516204g.setVisibility(0);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.m6e);
        if (findViewById != null) {
            findViewById.setLayoutParams(new p012xc85e97e9.p073xee01125a.p074xd1075a44.c(-1, -1));
            findViewById.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560693rk);
        }
        f7();
        c7().D(d7());
        e7();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c7().mo979x3f5eee52();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        c7().I();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        c7().M();
    }
}
