package com.tencent.mm.plugin.appbrand.jsapi.video.videoview;

/* loaded from: classes15.dex */
public abstract class BaseVideoView extends com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView {
    public boolean D;
    public java.lang.String E;
    public int F;
    public int G;
    public final android.graphics.Rect H;
    public boolean I;

    public BaseVideoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.G = 0;
        this.H = new android.graphics.Rect();
        this.I = false;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView, oe1.o1
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
        ff1.e0 e0Var = this.f83684o;
        if (!(e0Var instanceof com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView abstractVideoTextureView = (com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView) e0Var;
        if (f17 <= 0.0f) {
            abstractVideoTextureView.getClass();
            return false;
        }
        abstractVideoTextureView.P = f17;
        ye1.e eVar = abstractVideoTextureView.f83659g;
        if (eVar == null) {
            return false;
        }
        eVar.f(f17);
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView, oe1.o1
    public void e() {
        super.e();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView
    public ff1.e0 f(android.content.Context context) {
        return t(context);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView, oe1.o1
    public void g() {
        android.view.Surface surface;
        boolean z17 = this.f83677e;
        super.g();
        ff1.e0 e0Var = this.f83684o;
        if (e0Var == null || !(e0Var instanceof com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView)) {
            return;
        }
        if (this.f83685p) {
            play();
            return;
        }
        boolean localVisibleRect = getLocalVisibleRect(this.H);
        k("MicroMsg.Video.BaseVideoView", "onUIResume, oldIsUIAvailable: %b, isShown: %b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(localVisibleRect));
        if (z17 || !localVisibleRect) {
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView abstractVideoTextureView = (com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView) this.f83684o;
        if (abstractVideoTextureView.f83659g == null || !abstractVideoTextureView.f83660h || (surface = abstractVideoTextureView.f83658f) == null || !surface.isValid()) {
            return;
        }
        abstractVideoTextureView.e("flush surface start time[%d] ", java.lang.Integer.valueOf(abstractVideoTextureView.getCurrentPosition()));
        abstractVideoTextureView.f83655J = true;
        abstractVideoTextureView.f83659g.c(0.0f, 0.0f);
        abstractVideoTextureView.f83659g.start();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView, oe1.o1
    public int getCacheTimeSec() {
        try {
            if (this.f83684o instanceof com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView) {
                return (int) (super.getVideoDurationSec() * ((((com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView) r1).getDownloadPercent() * 1.0f) / 100.0f));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Video.BaseVideoView", e17, this.f83693x + " get cache time sec error", new java.lang.Object[0]);
        }
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView, oe1.o1
    public int getVideoDurationSec() {
        int i17 = this.F;
        return i17 <= 0 ? super.getVideoDurationSec() : i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView
    public int getVideoSource() {
        return this.G;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView, oe1.o1
    public android.view.View getView() {
        return this;
    }

    @Override // oe1.o1
    public void h(boolean z17, java.lang.String str, int i17) {
        this.D = z17;
        this.E = str;
        this.F = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView
    public void i() {
        super.i();
    }

    @Override // oe1.o1
    public boolean j() {
        ff1.e0 e0Var = this.f83684o;
        boolean z17 = (e0Var == null || com.tencent.mm.sdk.platformtools.t8.K0(e0Var.getVideoPath()) || !this.f83692w) ? false : true;
        ff1.e0 e0Var2 = this.f83684o;
        int duration = e0Var2 != null ? e0Var2.getDuration() : 0;
        if (this.D) {
            return true;
        }
        return z17 && duration <= 0;
    }

    @Override // oe1.o1
    public void m() {
        ff1.e0 e0Var = this.f83684o;
        if (e0Var != null) {
            k("MicroMsg.Video.BaseVideoView", "preloadVideo url:%s, path:%s", this.E, e0Var.getVideoPath());
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f83684o.getVideoPath())) {
                this.f83684o.setVideoPath(this.E);
                this.f83689t = false;
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView, ff1.z
    public void onCompletion() {
        if (j()) {
            k("MicroMsg.Video.BaseVideoView", "it is live video, do not completion", new java.lang.Object[0]);
            stop();
            start();
        } else {
            super.onCompletion();
            if (this.I) {
                a(0.0d, true);
            }
        }
    }

    public void setLoop(boolean z17) {
        this.I = z17;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView, oe1.o1
    public void setScaleType(oe1.m1 m1Var) {
        ff1.e0 e0Var = this.f83684o;
        if (e0Var instanceof com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView) {
            ((com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView) e0Var).setScaleType(m1Var);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView, oe1.o1
    public void setVideoContext(oe1.s1 s1Var) {
        super.setVideoContext(s1Var);
        ff1.e0 e0Var = this.f83684o;
        if (e0Var instanceof com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView) {
            ((com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView) e0Var).setVideoContext(s1Var);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView, oe1.o1
    public void setVideoSource(int i17) {
        this.G = i17;
    }

    @Override // oe1.o1
    public void start() {
        ff1.e0 e0Var = this.f83684o;
        if (e0Var != null) {
            java.lang.String videoPath = e0Var.getVideoPath();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            k("MicroMsg.Video.BaseVideoView", "start path [%s] [%s]", videoPath, new com.tencent.mm.sdk.platformtools.z3());
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f83684o.getVideoPath())) {
                this.f83689t = true;
                play();
            } else {
                this.f83684o.setVideoPath(this.E);
                this.f83689t = true;
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

    public BaseVideoView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.G = 0;
        this.H = new android.graphics.Rect();
        this.I = false;
    }

    public BaseVideoView(android.content.Context context) {
        super(context, null);
        this.G = 0;
        this.H = new android.graphics.Rect();
        this.I = false;
    }
}
