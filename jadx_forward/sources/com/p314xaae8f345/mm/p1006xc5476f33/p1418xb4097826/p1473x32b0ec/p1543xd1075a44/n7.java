package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class n7 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 {
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l H;
    public android.widget.RelativeLayout I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.RelativeLayout f200696J;
    public android.view.View K;
    public android.view.View L;
    public android.view.View M;
    public yz5.a N;
    public yz5.l P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l plugin) {
        super(context, false, null, -1.0f, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plugin, "plugin");
        this.H = plugin;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int A() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.eaw;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int D() {
        return 8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int J() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public java.lang.String L() {
        return "";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void N(android.view.View rootView) {
        android.widget.RelativeLayout relativeLayout;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMusicEntranceSelectPanel", "initContentView");
        a0(this.f199716e.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.clh));
        this.I = (android.widget.RelativeLayout) rootView.findViewById(com.p314xaae8f345.mm.R.id.fda);
        this.f200696J = (android.widget.RelativeLayout) rootView.findViewById(com.p314xaae8f345.mm.R.id.fdd);
        this.K = rootView.findViewById(com.p314xaae8f345.mm.R.id.ags);
        this.L = rootView.findViewById(com.p314xaae8f345.mm.R.id.ndm);
        this.M = rootView.findViewById(com.p314xaae8f345.mm.R.id.rmh);
        android.widget.RelativeLayout relativeLayout2 = this.I;
        if (relativeLayout2 != null) {
            relativeLayout2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.j7(this));
        }
        android.widget.RelativeLayout relativeLayout3 = this.f200696J;
        if (relativeLayout3 != null) {
            relativeLayout3.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.k7(this));
        }
        if (!e0() && !((mm2.e1) this.H.S0().a(mm2.e1.class)).d7() && (relativeLayout = this.f200696J) != null) {
            relativeLayout.setVisibility(8);
        }
        ym5.a1.h(rootView, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.l7(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public boolean Q() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void S() {
        super.S();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMusicEntranceSelectPanel", "onDismiss");
        ll2.e eVar = ll2.e.f400666a;
        eVar.e("anchorlive.bottom.music.song", false);
        eVar.e("startlive.bottom.music.song", false);
        eVar.e("startlive.bottom.music.bgmusic", false);
        eVar.e("anchorlive.bottom.music.bgmusic", false);
        yz5.a aVar = this.N;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0063, code lost:
    
        if (r3.c7(r45.d62.FINDER_LIVE_QUEST_COMM_TARGET_TYPE_SET_MUSIC_COUNT) == true) goto L12;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void V(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 r21, boolean r22, int r23) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.n7.V(com.tencent.mm.plugin.finder.live.widget.e0, boolean, int):void");
    }

    public final boolean e0() {
        return ((mm2.c1) this.H.S0().a(mm2.c1.class)).a8();
    }

    public final void f0(boolean z17) {
        if (zl2.r4.f555483a.w1()) {
            java.util.Map k17 = kz5.c1.k(new jz5.l("type", e0() ? z17 ? "4" : "3" : z17 ? "2" : "1"), new jz5.l("style", "1"));
            if (e0()) {
                i95.m c17 = i95.n0.c(ml2.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                zy2.zb.y6((zy2.zb) c17, ml2.z4.f409903p1, new org.json.JSONObject(k17).toString(), null, 4, null);
            } else {
                i95.m c18 = i95.n0.c(ml2.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                zy2.zb zbVar = (zy2.zb) c18;
                ml2.c1 c1Var = ml2.c1.f408858e;
                zy2.zb.j5(zbVar, 34L, new org.json.JSONObject(k17).toString(), null, 4, null);
            }
        }
    }
}
