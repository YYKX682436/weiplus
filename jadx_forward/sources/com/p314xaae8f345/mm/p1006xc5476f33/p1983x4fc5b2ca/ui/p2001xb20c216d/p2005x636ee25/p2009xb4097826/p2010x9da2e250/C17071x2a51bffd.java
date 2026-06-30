package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2009xb4097826.p2010x9da2e250;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/finder/fragment/FinderMusicPickerRecommendFeedFragment;", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/fragment/MusicPickerDataFragment;", "Liv3/b;", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerRecommendFeedFragment */
/* loaded from: classes5.dex */
public final class C17071x2a51bffd extends com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.AbstractC17080x95c906ad implements iv3.b {

    /* renamed from: n, reason: collision with root package name */
    public final boolean f237868n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i0 f237869o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f237870p;

    /* renamed from: q, reason: collision with root package name */
    public cv3.d f237871q;

    /* renamed from: r, reason: collision with root package name */
    public wt3.e f237872r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f237873s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f237874t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f237875u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f237876v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f237877w;

    /* renamed from: x, reason: collision with root package name */
    public nv3.t f237878x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17071x2a51bffd(ev3.d dVar, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i0 scene) {
        super(dVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        this.f237868n = z17;
        this.f237869o = scene;
        this.f237870p = "MicroMsg.MusicPickerRecommendFeedFragment[" + m7479x8cdac1b() + ']';
    }

    public final void A0() {
        if (!this.f237873s) {
            this.f237875u = true;
            return;
        }
        dv3.c cVar = this.f237914e;
        if (cVar != null && cVar.K == 0) {
            C0(true);
        }
    }

    public final void B0(boolean z17) {
        if (z17) {
            nv3.t tVar = this.f237878x;
            this.f237876v = tVar != null ? tVar.f422249n : false;
            if (tVar != null) {
                tVar.f("onSearchVisibleChanged");
                return;
            }
            return;
        }
        if (this.f237876v) {
            nv3.t tVar2 = this.f237878x;
            if (tVar2 != null) {
                tVar2.b(false);
            }
            this.f237876v = false;
        }
    }

    public final void C0(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f237870p, "requestListenBgmList loadFirstPage:" + z17);
        if (!z17) {
            wt3.e eVar = this.f237872r;
            if (eVar != null) {
                eVar.f530936l.obtainMessage(2).sendToTarget();
                return;
            }
            return;
        }
        x0();
        wt3.e eVar2 = this.f237872r;
        if (eVar2 != null) {
            eVar2.f530936l.obtainMessage(1).sendToTarget();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [wt3.e0] */
    public final void F0(yu3.a createInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(createInfo, "createInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f237870p, "setupFetchDataTask");
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(createInfo.f547386c);
        im5.c cVar = this.f237918i;
        qv3.b e0Var = !K0 ? new wt3.e0(cVar, createInfo, 12) : new qv3.b(cVar, createInfo, 12);
        this.f237872r = e0Var;
        e0Var.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2009xb4097826.p2010x9da2e250.i(this));
        wt3.e eVar = this.f237872r;
        if (eVar != null) {
            eVar.g().c();
        }
        wt3.e eVar2 = this.f237872r;
        if (eVar2 != null) {
            eVar2.f530932h = 30;
        }
        if (eVar2 != null) {
            eVar2.b();
        }
    }

    @Override // iv3.b
    public void Y(android.view.View itemView, rv3.h item, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        nv3.t tVar = this.f237878x;
        if (tVar != null) {
            tVar.c(item, i17);
        }
        r0(itemView, item);
    }

    @Override // ev3.b
    public void h(android.view.View itemView, rv3.h feed, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.AbstractC17080x95c906ad
    public int n0() {
        return 12;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.AbstractC17080x95c906ad, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroyView */
    public void mo7399xa6664a60() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f237870p, "onDestroyView: ");
        super.mo7399xa6664a60();
        p0();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onPause */
    public void mo7512xb01dfb57() {
        super.mo7512xb01dfb57();
        nv3.t tVar = this.f237878x;
        if (tVar != null) {
            tVar.f("onPause");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.AbstractC17080x95c906ad, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public void mo7517x57429eec() {
        super.mo7517x57429eec();
        nv3.t tVar = this.f237878x;
        if (tVar != null) {
            tVar.b(true);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.AbstractC17080x95c906ad, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.mo7518x594b1124(view, bundle);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f237915f;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2009xb4097826.p2010x9da2e250.j(this));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2009xb4097826.p2010x9da2e250.h hVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2009xb4097826.p2010x9da2e250.h(this);
        dv3.d dVar = new dv3.d(new in5.s() { // from class: com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerRecommendFeedFragment$buildRVItemConverts$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                return type == 2 ? new rv3.k() : new ov3.b(yz5.p.this, this, false, false, 12, null);
            }
        }, arrayList);
        this.f237914e = dVar;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = this.f237915f;
        if (c22849x81a93d252 != null) {
            c22849x81a93d252.mo7960x6cab2c8d(dVar);
        }
        this.f237873s = true;
        this.f237878x = new nv3.t(mo7438x76847179(), 12, this.f237915f, this.f237914e, this.f237913d, this.f237871q, this.f237869o, this.f237877w);
        if (this.f237875u) {
            dv3.c cVar = this.f237914e;
            if (cVar != null && cVar.K == 0) {
                C0(true);
            }
            this.f237875u = false;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.AbstractC17080x95c906ad
    public void p0() {
        super.p0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f237870p, "onDeactivate");
        dv3.c cVar = this.f237914e;
        if (cVar != null) {
            cVar.K = 0;
        }
        this.f237874t = true;
        wt3.e eVar = this.f237872r;
        if (eVar != null) {
            eVar.c();
        }
        wt3.e eVar2 = this.f237872r;
        if (eVar2 != null) {
            eVar2.f530937m = null;
        }
        nv3.t tVar = this.f237878x;
        if (tVar != null) {
            tVar.d();
        }
        this.f237878x = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.AbstractC17080x95c906ad
    public void t0() {
        A0();
    }
}
