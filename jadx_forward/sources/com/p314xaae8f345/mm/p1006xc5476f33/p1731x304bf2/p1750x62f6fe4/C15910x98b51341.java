package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/game/media/GameRecommendVideoFragment;", "Landroidx/fragment/app/Fragment;", "plugin-game_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.game.media.GameRecommendVideoFragment */
/* loaded from: classes8.dex */
public final class C15910x98b51341 extends com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6 {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f221594n = 0;

    /* renamed from: d, reason: collision with root package name */
    public final p33.e0 f221595d;

    /* renamed from: e, reason: collision with root package name */
    public final int f221596e;

    /* renamed from: f, reason: collision with root package name */
    public final int f221597f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f221598g;

    /* renamed from: h, reason: collision with root package name */
    public o43.b f221599h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f221600i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f221601m;

    public C15910x98b51341(p33.e0 videoAlbumItem, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoAlbumItem, "videoAlbumItem");
        this.f221595d = videoAlbumItem;
        this.f221596e = i17;
        this.f221597f = i18;
        this.f221598g = "MicroMsg.GameHaoWanGalleryView.GameRecommendVideoFragment";
        this.f221601m = jz5.h.b(i53.e2.f370098d);
    }

    public final void j0(boolean z17, int i17) {
        android.content.Context mo7438x76847179 = mo7438x76847179();
        int i18 = this.f221596e + 504;
        int i19 = z17 ? 2 : 1;
        p33.k kVar = this.f221595d.f433072f;
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.d(mo7438x76847179, 87, 8762, i18, i19, i17, kVar != null ? kVar.f433132d : null, this.f221597f, 0, null, null, lj0.a.a(7, new java.util.HashMap()));
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inflater, "inflater");
        android.view.View inflate = inflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bbm, viewGroup, false);
        int i17 = com.p314xaae8f345.mm.R.id.azf;
        android.widget.Button button = (android.widget.Button) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.azf);
        if (button != null) {
            i17 = com.p314xaae8f345.mm.R.id.hog;
            android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.hog);
            if (imageView != null) {
                i17 = com.p314xaae8f345.mm.R.id.ll_;
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.C15920x9de661ce c15920x9de661ce = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.C15920x9de661ce) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.ll_);
                if (c15920x9de661ce != null) {
                    i17 = com.p314xaae8f345.mm.R.id.lla;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.C15906xa4876414 c15906xa4876414 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.C15906xa4876414) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.lla);
                    if (c15906xa4876414 != null) {
                        i17 = com.p314xaae8f345.mm.R.id.f568965om4;
                        android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f568965om4);
                        if (textView != null) {
                            i17 = com.p314xaae8f345.mm.R.id.om7;
                            android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.om7);
                            if (textView2 != null) {
                                i17 = com.p314xaae8f345.mm.R.id.p0k;
                                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.p1737x30012e.C15867x7cd2cd13 c15867x7cd2cd13 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.p1737x30012e.C15867x7cd2cd13) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.p0k);
                                if (c15867x7cd2cd13 != null) {
                                    com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x24069159 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159) inflate;
                                    this.f221599h = new o43.b(c22645x24069159, button, imageView, c15920x9de661ce, c15906xa4876414, textView, textView2, c15867x7cd2cd13);
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22645x24069159, "getRoot(...)");
                                    return c22645x24069159;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroyView */
    public void mo7399xa6664a60() {
        super.mo7399xa6664a60();
        o43.b bVar = this.f221599h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar);
        bVar.f424377d.d();
        ((android.os.Handler) ((jz5.n) this.f221601m).mo141623x754a37bb()).removeCallbacksAndMessages(null);
        this.f221599h = null;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onPause */
    public void mo7512xb01dfb57() {
        super.mo7512xb01dfb57();
        o43.b bVar = this.f221599h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar);
        bVar.f424377d.e();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public void mo7517x57429eec() {
        super.mo7517x57429eec();
        o43.b bVar = this.f221599h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar);
        bVar.f424377d.g();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.mo7518x594b1124(view, bundle);
        p33.e0 e0Var = this.f221595d;
        p33.v vVar = e0Var.f433083t;
        java.util.LinkedList linkedList = vVar != null ? vVar.f433188d : null;
        if (linkedList == null || linkedList.isEmpty()) {
            o43.b bVar = this.f221599h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar);
            bVar.f424380g.setVisibility(8);
        } else {
            i53.f4 f4Var = new i53.f4();
            p33.v vVar2 = e0Var.f433083t;
            f4Var.f341077d = vVar2 != null ? vVar2.f433188d : null;
            o43.b bVar2 = this.f221599h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar2);
            bVar2.f424380g.m64449x6cab2c8d(f4Var);
        }
        p33.f0 f0Var = e0Var.f433073g;
        if (f0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f221598g, "videoInfo = " + f0Var + "  playUrl = " + f0Var.f433093d + "  duration  = " + f0Var.f433098i);
            o11.f fVar = new o11.f();
            fVar.f423616g = i53.h4.f370126a;
            fVar.f423611b = true;
            o11.g a17 = fVar.a();
            n11.a b17 = n11.a.b();
            java.lang.String str = f0Var.f433094e;
            o43.b bVar3 = this.f221599h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar3);
            b17.k(str, bVar3.f424376c, a17, null, null);
            o43.b bVar4 = this.f221599h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar4);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.e1 e1Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.FILL;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.C15920x9de661ce c15920x9de661ce = bVar4.f424377d;
            c15920x9de661ce.mo48237xebd28962(e1Var);
            c15920x9de661ce.h(false, f0Var.f433093d, f0Var.f433098i);
            c15920x9de661ce.mo61536x764d819b(true);
            c15920x9de661ce.mo48236x764cf626(false);
            c15920x9de661ce.mo64629xc2e9d13b(false);
            c15920x9de661ce.m64631x2ccf87b7(new i53.f2(this, c15920x9de661ce));
            o43.b bVar5 = this.f221599h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar5);
            bVar5.f424379f.setText(f0Var.f433097h);
        }
        o43.b bVar6 = this.f221599h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar6);
        bVar6.f424378e.setText(android.text.format.DateFormat.format(m7550xf0c4608a().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fcl), e0Var.f433071e * 1000));
        o43.b bVar7 = this.f221599h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar7);
        bVar7.f424375b.setOnClickListener(new i53.g2(this));
        o43.b bVar8 = this.f221599h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar8);
        bVar8.f424377d.setOnClickListener(new i53.h2(this));
        j0(false, 1);
        j0(false, 2);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: setUserVisibleHint */
    public void mo7583x951b248c(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.C15920x9de661ce c15920x9de661ce;
        o43.b bVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.C15920x9de661ce c15920x9de661ce2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.C15920x9de661ce c15920x9de661ce3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.C15920x9de661ce c15920x9de661ce4;
        super.mo7583x951b248c(z17);
        if (!z17) {
            o43.b bVar2 = this.f221599h;
            if (bVar2 == null || (c15920x9de661ce = bVar2.f424377d) == null) {
                return;
            }
            c15920x9de661ce.mo48231x65825f6();
            return;
        }
        if (!this.f221600i) {
            o43.b bVar3 = this.f221599h;
            if (bVar3 != null && (c15920x9de661ce4 = bVar3.f424377d) != null) {
                c15920x9de661ce4.mo48238x68ac462();
            }
            o43.b bVar4 = this.f221599h;
            if (bVar4 != null && (c15920x9de661ce3 = bVar4.f424377d) != null) {
                c15920x9de661ce3.mo48232x348b34();
            }
        }
        if (this.f221600i && (bVar = this.f221599h) != null && (c15920x9de661ce2 = bVar.f424377d) != null) {
            c15920x9de661ce2.mo48232x348b34();
        }
        ((android.os.Handler) ((jz5.n) this.f221601m).mo141623x754a37bb()).postDelayed(new i53.i2(this), 500L);
    }
}
