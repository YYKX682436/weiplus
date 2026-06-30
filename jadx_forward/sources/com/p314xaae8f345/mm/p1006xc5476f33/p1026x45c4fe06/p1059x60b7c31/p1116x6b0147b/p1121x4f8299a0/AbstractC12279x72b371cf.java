package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.videoview.BaseVideoView */
/* loaded from: classes15.dex */
public abstract class AbstractC12279x72b371cf extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12278xb84f839e {
    public boolean D;
    public java.lang.String E;
    public int F;
    public int G;
    public final android.graphics.Rect H;
    public boolean I;

    public AbstractC12279x72b371cf(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.G = 0;
        this.H = new android.graphics.Rect();
        this.I = false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12278xb84f839e, oe1.o1
    public boolean a(double d17, boolean z17) {
        if (!j()) {
            return super.a(d17, z17);
        }
        l("MicroMsg.Video.BaseVideoView", "it is live, don't seek ", new java.lang.Object[0]);
        return false;
    }

    @Override // oe1.o1
    public boolean c(float f17) {
        k("MicroMsg.Video.BaseVideoView", "set play rate [%f]", java.lang.Float.valueOf(f17));
        ff1.e0 e0Var = this.f165217o;
        if (!(e0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47 abstractC12277x3bbbdb47 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47) e0Var;
        if (f17 <= 0.0f) {
            abstractC12277x3bbbdb47.getClass();
            return false;
        }
        abstractC12277x3bbbdb47.P = f17;
        ye1.e eVar = abstractC12277x3bbbdb47.f165192g;
        if (eVar == null) {
            return false;
        }
        eVar.f(f17);
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12278xb84f839e, oe1.o1
    public void e() {
        super.e();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12278xb84f839e
    public ff1.e0 f(android.content.Context context) {
        return t(context);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12278xb84f839e, oe1.o1
    public void g() {
        android.view.Surface surface;
        boolean z17 = this.f165210e;
        super.g();
        ff1.e0 e0Var = this.f165217o;
        if (e0Var == null || !(e0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47)) {
            return;
        }
        if (this.f165218p) {
            mo51384x348b34();
            return;
        }
        boolean localVisibleRect = getLocalVisibleRect(this.H);
        k("MicroMsg.Video.BaseVideoView", "onUIResume, oldIsUIAvailable: %b, isShown: %b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(localVisibleRect));
        if (z17 || !localVisibleRect) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47 abstractC12277x3bbbdb47 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47) this.f165217o;
        if (abstractC12277x3bbbdb47.f165192g == null || !abstractC12277x3bbbdb47.f165193h || (surface = abstractC12277x3bbbdb47.f165191f) == null || !surface.isValid()) {
            return;
        }
        abstractC12277x3bbbdb47.e("flush surface start time[%d] ", java.lang.Integer.valueOf(abstractC12277x3bbbdb47.mo51447x9746038c()));
        abstractC12277x3bbbdb47.f165188J = true;
        abstractC12277x3bbbdb47.f165192g.c(0.0f, 0.0f);
        abstractC12277x3bbbdb47.f165192g.mo1865x68ac462();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12278xb84f839e, oe1.o1
    /* renamed from: getCacheTimeSec */
    public int mo51375x8a3f46d8() {
        try {
            if (this.f165217o instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47) {
                return (int) (super.mo51380x6d590e18() * ((((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47) r1).m51448xd376dc67() * 1.0f) / 100.0f));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Video.BaseVideoView", e17, this.f165226x + " get cache time sec error", new java.lang.Object[0]);
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12278xb84f839e, oe1.o1
    /* renamed from: getVideoDurationSec */
    public int mo51380x6d590e18() {
        int i17 = this.F;
        return i17 <= 0 ? super.mo51380x6d590e18() : i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12278xb84f839e
    /* renamed from: getVideoSource */
    public int mo51469x17bb2740() {
        return this.G;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12278xb84f839e, oe1.o1
    /* renamed from: getView */
    public android.view.View mo51381xfb86a31b() {
        return this;
    }

    @Override // oe1.o1
    public void h(boolean z17, java.lang.String str, int i17) {
        this.D = z17;
        this.E = str;
        this.F = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12278xb84f839e
    public void i() {
        super.i();
    }

    @Override // oe1.o1
    public boolean j() {
        ff1.e0 e0Var = this.f165217o;
        boolean z17 = (e0Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e0Var.mo51452x4edea88a()) || !this.f165225w) ? false : true;
        ff1.e0 e0Var2 = this.f165217o;
        int mo51449x51e8b0a = e0Var2 != null ? e0Var2.mo51449x51e8b0a() : 0;
        if (this.D) {
            return true;
        }
        return z17 && mo51449x51e8b0a <= 0;
    }

    @Override // oe1.o1
    public void m() {
        ff1.e0 e0Var = this.f165217o;
        if (e0Var != null) {
            k("MicroMsg.Video.BaseVideoView", "preloadVideo url:%s, path:%s", this.E, e0Var.mo51452x4edea88a());
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f165217o.mo51452x4edea88a())) {
                this.f165217o.mo51466xab3268fe(this.E);
                this.f165222t = false;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12278xb84f839e, ff1.z
    /* renamed from: onCompletion */
    public void mo51470xa6db431b() {
        if (j()) {
            k("MicroMsg.Video.BaseVideoView", "it is live video, do not completion", new java.lang.Object[0]);
            mo51400x360802();
            mo51399x68ac462();
        } else {
            super.mo51470xa6db431b();
            if (this.I) {
                a(0.0d, true);
            }
        }
    }

    /* renamed from: setLoop */
    public void m51472x764cf626(boolean z17) {
        this.I = z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12278xb84f839e, oe1.o1
    /* renamed from: setScaleType */
    public void mo51395xebd28962(oe1.m1 m1Var) {
        ff1.e0 e0Var = this.f165217o;
        if (e0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47) e0Var).m51462xebd28962(m1Var);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12278xb84f839e, oe1.o1
    /* renamed from: setVideoContext */
    public void mo51396xc72d5636(oe1.s1 s1Var) {
        super.mo51396xc72d5636(s1Var);
        ff1.e0 e0Var = this.f165217o;
        if (e0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47) e0Var).m51465xc72d5636(s1Var);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12278xb84f839e, oe1.o1
    /* renamed from: setVideoSource */
    public void mo51398xae209ab4(int i17) {
        this.G = i17;
    }

    @Override // oe1.o1
    /* renamed from: start */
    public void mo51399x68ac462() {
        ff1.e0 e0Var = this.f165217o;
        if (e0Var != null) {
            java.lang.String mo51452x4edea88a = e0Var.mo51452x4edea88a();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            k("MicroMsg.Video.BaseVideoView", "start path [%s] [%s]", mo51452x4edea88a, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f165217o.mo51452x4edea88a())) {
                this.f165222t = true;
                mo51384x348b34();
            } else {
                this.f165217o.mo51466xab3268fe(this.E);
                this.f165222t = true;
                o();
            }
        }
    }

    public abstract ff1.e0 t(android.content.Context context);

    public void u(int i17, int i18) {
        k("MicroMsg.Video.BaseVideoView", "onInfo [%d %d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == 701) {
            o();
        } else if (i17 == 702) {
            super.i();
        }
    }

    public AbstractC12279x72b371cf(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.G = 0;
        this.H = new android.graphics.Rect();
        this.I = false;
    }

    public AbstractC12279x72b371cf(android.content.Context context) {
        super(context, null);
        this.G = 0;
        this.H = new android.graphics.Rect();
        this.I = false;
    }
}
