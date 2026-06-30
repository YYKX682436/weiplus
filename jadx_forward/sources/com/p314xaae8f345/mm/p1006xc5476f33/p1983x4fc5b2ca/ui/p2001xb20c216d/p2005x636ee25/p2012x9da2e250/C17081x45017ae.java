package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/fragment/MusicPickerLikeBgmFragment;", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/fragment/MusicPickerDataFragment;", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerLikeBgmFragment */
/* loaded from: classes5.dex */
public class C17081x45017ae extends com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.AbstractC17080x95c906ad {

    /* renamed from: n, reason: collision with root package name */
    public final boolean f237920n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f237921o;

    /* renamed from: p, reason: collision with root package name */
    public wt3.x f237922p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f237923q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f237924r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f237925s;

    /* renamed from: t, reason: collision with root package name */
    public jz5.l f237926t;

    public C17081x45017ae(ev3.d dVar, boolean z17) {
        super(dVar);
        this.f237920n = z17;
        this.f237921o = "MicroMsg.MusicPickerLikeBgmFragment[" + m7479x8cdac1b() + ']';
    }

    public dv3.c A0() {
        return new dv3.d(new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.C17082x7b04aa7c(new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.d(this), this), new java.util.ArrayList());
    }

    public boolean B0() {
        return false;
    }

    public int C0() {
        return 10;
    }

    /* renamed from: F0, reason: from getter */
    public java.lang.String getF237864u() {
        return this.f237921o;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G0(boolean r5, int r6, int r7, java.lang.String r8, boolean r9, com.p314xaae8f345.mm.p2495xc50a8b8b.g r10, java.util.LinkedList r11) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.C17081x45017ae.G0(boolean, int, int, java.lang.String, boolean, com.tencent.mm.protobuf.g, java.util.LinkedList):void");
    }

    public boolean H0(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        return false;
    }

    public void J0(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(getF237864u(), "requestListenBgmList loadFirstPage:" + z17);
        if (z17) {
            x0();
        }
        wt3.x xVar = this.f237922p;
        if (xVar != null) {
            xVar.j();
        }
        wt3.x xVar2 = new wt3.x(3, 20, this.f237923q, 0L, 0L, null, null, null, 248, null);
        pq5.g l17 = xVar2.l();
        l17.f(this.f237918i);
        l17.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.f(this, z17));
        this.f237922p = xVar2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.AbstractC17080x95c906ad
    public int n0() {
        return 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.AbstractC17080x95c906ad, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroyView */
    public void mo7399xa6664a60() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(getF237864u(), "onDestroyView: ");
        super.mo7399xa6664a60();
        p0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.AbstractC17080x95c906ad, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        dv3.c cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.mo7518x594b1124(view, bundle);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f237915f;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.e(this));
        }
        ev3.d dVar = this.f237913d;
        if (dVar != null) {
            dVar.c(n0(), this);
        }
        dv3.c A0 = A0();
        this.f237914e = A0;
        if (A0 != null) {
            A0.f374638o = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.b(this);
        }
        if (B0() && (cVar = this.f237914e) != null) {
            cVar.f374637n = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.c(this);
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = this.f237915f;
        if (c22849x81a93d252 != null) {
            c22849x81a93d252.mo7960x6cab2c8d(this.f237914e);
        }
        this.f237924r = true;
        if (this.f237925s) {
            dv3.c cVar2 = this.f237914e;
            if (cVar2 != null && cVar2.K == 0) {
                J0(true);
            }
            this.f237925s = false;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.AbstractC17080x95c906ad
    public void p0() {
        super.p0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(getF237864u(), "onDeactivate: ");
        dv3.c cVar = this.f237914e;
        if (cVar != null) {
            cVar.K = 0;
        }
        wt3.x xVar = this.f237922p;
        if (xVar != null) {
            xVar.j();
        }
        this.f237922p = null;
        this.f237923q = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.AbstractC17080x95c906ad
    public void s0() {
        getF237864u();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.AbstractC17080x95c906ad
    public void t0() {
        getF237864u();
        if (!this.f237924r) {
            this.f237925s = true;
            return;
        }
        dv3.c cVar = this.f237914e;
        if (cVar != null && cVar.K == 0) {
            J0(true);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.AbstractC17080x95c906ad
    public void u0(java.lang.String musicId, boolean z17) {
        java.util.ArrayList<in5.c> arrayList;
        dv3.c cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicId, "musicId");
        dv3.c cVar2 = this.f237914e;
        boolean z18 = false;
        if (cVar2 != null && cVar2.K == 0) {
            z18 = true;
        }
        if (z18) {
            this.f237926t = new jz5.l(musicId, java.lang.Boolean.valueOf(z17));
            return;
        }
        if (cVar2 == null || (arrayList = cVar2.I) == null) {
            return;
        }
        for (in5.c cVar3 : arrayList) {
            if (cVar3 instanceof rv3.h) {
                rv3.h hVar = (rv3.h) cVar3;
                r45.pg4 pg4Var = hVar.f481928d.A;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(pg4Var != null ? pg4Var.f464551d : null, musicId)) {
                    ev3.d dVar = this.f237913d;
                    if (dVar != null) {
                        ev3.d.e(dVar, n0(), hVar.f481928d, true, false, false, 24, null);
                    }
                    if (!z17 || (cVar = this.f237914e) == null) {
                        return;
                    }
                    java.lang.String musicKey = hVar.f481928d.a();
                    rv3.g gVar = rv3.g.f481926e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicKey, "musicKey");
                    int K0 = cVar.K0(musicKey);
                    cVar.N0();
                    gVar.toString();
                    if (K0 >= 0) {
                        java.lang.Object obj = cVar.I.get(K0);
                        rv3.h hVar2 = obj instanceof rv3.h ? (rv3.h) obj : null;
                        if (hVar2 != null) {
                            hVar2.f481930f = gVar;
                        }
                        cVar.m8147xed6e4d18(K0);
                        return;
                    }
                    return;
                }
            }
        }
    }
}
