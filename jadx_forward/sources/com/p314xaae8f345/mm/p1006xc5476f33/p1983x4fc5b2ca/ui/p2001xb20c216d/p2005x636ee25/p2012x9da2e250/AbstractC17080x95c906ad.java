package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/fragment/MusicPickerDataFragment;", "Landroidx/fragment/app/Fragment;", "Lev3/b;", "Lev3/c;", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment */
/* loaded from: classes5.dex */
public abstract class AbstractC17080x95c906ad extends com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6 implements ev3.b, ev3.c {

    /* renamed from: d, reason: collision with root package name */
    public final ev3.d f237913d;

    /* renamed from: e, reason: collision with root package name */
    public dv3.c f237914e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f237915f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f237916g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f237917h;

    /* renamed from: i, reason: collision with root package name */
    public final im5.c f237918i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f237919m;

    public AbstractC17080x95c906ad() {
        this(null);
    }

    public void F() {
        x0();
    }

    @Override // ev3.c
    public void J(int i17, java.lang.String musicKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicKey, "musicKey");
        dv3.c cVar = this.f237914e;
        if (cVar != null) {
            cVar.V0(musicKey, rv3.w.f481950a);
        }
        dv3.c cVar2 = this.f237914e;
        if (cVar2 == null) {
            return;
        }
        cVar2.S0("");
    }

    @Override // ev3.c
    public void L(int i17, java.lang.String musicKey, cw3.g mode) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicKey, "musicKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mode, "mode");
        dv3.c cVar = this.f237914e;
        if (cVar != null) {
            cVar.V0(musicKey, new rv3.u(mode));
        }
    }

    public void N() {
        y0();
    }

    @Override // ev3.c
    public void S(int i17, java.lang.String musicKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicKey, "musicKey");
        dv3.c cVar = this.f237914e;
        if (cVar != null) {
            cVar.V0(musicKey, rv3.x.f481951a);
        }
    }

    /* renamed from: j0 */
    public boolean getS1() {
        return false;
    }

    public boolean l0() {
        return false;
    }

    public boolean m0() {
        return this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2009xb4097826.p2010x9da2e250.C17071x2a51bffd;
    }

    public abstract int n0();

    public boolean o0() {
        return this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2009xb4097826.p2010x9da2e250.C17071x2a51bffd;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inflater, "inflater");
        mo7591x9616526c();
        return inflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dcx, viewGroup, false);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroyView */
    public void mo7399xa6664a60() {
        super.mo7399xa6664a60();
        mo7591x9616526c();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public void mo7517x57429eec() {
        super.mo7517x57429eec();
        mo7591x9616526c();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.mo7518x594b1124(view, bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f237919m, "onViewCreated: " + this);
        this.f237917h = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.q1j);
        this.f237916g = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.q1k);
        this.f237915f = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) view.findViewById(com.p314xaae8f345.mm.R.id.f567577pz4);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d c22847x422a813d = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d(mo7438x76847179(), 1, false);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f237915f;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.mo7967x900dcbe1(c22847x422a813d);
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = this.f237915f;
        if (c22849x81a93d252 != null) {
            c22849x81a93d252.P(new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.a());
        }
        android.content.Context mo7438x76847179 = mo7438x76847179();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d253 = this.f237915f;
        if (m0()) {
            pv3.f fVar = pv3.f.f440122a;
            boolean o07 = o0();
            i95.m c17 = i95.n0.c(m40.k0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            if (((c61.p7) ((m40.k0) c17)).hj(m40.j0.f404945h) && mo7438x76847179 != null && c22849x81a93d253 != null && o07) {
                if (pv3.f.f440127f == null) {
                    i95.m c18 = i95.n0.c(c50.b1.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                    pv3.f.f440127f = new cs2.i(mo7438x76847179, 0);
                }
                in5.o.b(c22849x81a93d253, new pv3.a(), pv3.b.f440116d);
            }
        }
    }

    public void p0() {
        this.f237918i.mo10668x2efc64();
    }

    public void q(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a info, boolean z17, rv3.v musicPlayStatus) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicPlayStatus, "musicPlayStatus");
        dv3.c cVar = this.f237914e;
        if (cVar != null) {
            cVar.U0(info, z17);
        }
    }

    public final void q0(android.view.View view, rv3.h hVar) {
        xv3.a.a(xv3.a.f538962a, this.f237913d, n0(), hVar, view, false, true, null, 64, null);
    }

    public final void r0(android.view.View view, rv3.h hVar) {
        xv3.a.a(xv3.a.f538962a, this.f237913d, n0(), hVar, view, true, false, null, 64, null);
    }

    public void s0() {
    }

    public void t0() {
    }

    public void u0(java.lang.String musicId, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicId, "musicId");
    }

    public boolean w0() {
        return this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2009xb4097826.p2010x9da2e250.C17073x9fdcd5a3;
    }

    public final void x0() {
        android.widget.LinearLayout linearLayout = this.f237917h;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f237915f;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.setVisibility(8);
        }
        android.widget.TextView textView = this.f237916g;
        if (textView == null) {
            return;
        }
        textView.setVisibility(8);
    }

    @Override // ev3.c
    public void y(int i17, java.lang.String musicKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicKey, "musicKey");
        dv3.c cVar = this.f237914e;
        if (cVar != null) {
            cVar.V0(musicKey, rv3.y.f481952a);
        }
        dv3.c cVar2 = this.f237914e;
        if (cVar2 == null) {
            return;
        }
        cVar2.S0(musicKey);
    }

    public final void y0() {
        android.widget.LinearLayout linearLayout = this.f237917h;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f237915f;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.setVisibility(8);
        }
        android.widget.TextView textView = this.f237916g;
        if (textView == null) {
            return;
        }
        textView.setVisibility(0);
    }

    public void z0() {
        android.widget.LinearLayout linearLayout = this.f237917h;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f237915f;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.setVisibility(0);
        }
        android.widget.TextView textView = this.f237916g;
        if (textView == null) {
            return;
        }
        textView.setVisibility(8);
    }

    public AbstractC17080x95c906ad(ev3.d dVar) {
        this.f237913d = dVar;
        this.f237918i = new im5.c();
        this.f237919m = "MicroMsg.MusicPickerDataFragment";
    }
}
