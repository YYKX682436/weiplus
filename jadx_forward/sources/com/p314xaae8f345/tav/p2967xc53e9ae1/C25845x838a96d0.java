package com.p314xaae8f345.tav.p2967xc53e9ae1;

/* renamed from: com.tencent.tav.player.PlayerLayer */
/* loaded from: classes16.dex */
public class C25845x838a96d0 {

    /* renamed from: needReleaseSurface */
    private boolean f48676xed092cdc;

    /* renamed from: player */
    private com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 f48677xc53e9ae1;

    /* renamed from: readyForDisplay */
    private boolean f48678x3d25bc;

    /* renamed from: readyListener */
    private com.p314xaae8f345.tav.p2967xc53e9ae1.C25845x838a96d0.PlayerLayerReadyListener f48679x7f36af77;

    /* renamed from: surface */
    android.view.Surface f48680x9189ecad;

    /* renamed from: surfaceHeight */
    int f48681x59c7434;

    /* renamed from: surfaceWidth */
    int f48682xdffb3519;

    /* renamed from: videoGravity */
    private int f48683x7f30553;

    /* renamed from: videoRect */
    private android.graphics.Rect f48684x4f722cff;

    /* renamed from: com.tencent.tav.player.PlayerLayer$PlayerLayerReadyListener */
    /* loaded from: classes16.dex */
    public interface PlayerLayerReadyListener {
        /* renamed from: finish */
        void m98179xb4098c93(com.p314xaae8f345.tav.p2967xc53e9ae1.C25845x838a96d0 c25845x838a96d0);
    }

    public C25845x838a96d0(android.view.Surface surface, int i17, int i18) {
        this.f48676xed092cdc = false;
        this.f48679x7f36af77 = null;
        this.f48680x9189ecad = surface;
        this.f48682xdffb3519 = i17;
        this.f48681x59c7434 = i18;
    }

    /* renamed from: getPlayer */
    public com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 m98168x2a55bdd7() {
        return this.f48677xc53e9ae1;
    }

    /* renamed from: getSurface */
    public android.view.Surface m98169xcf572877() {
        return this.f48680x9189ecad;
    }

    /* renamed from: getSurfaceHeight */
    public int m98170xc2fc307e() {
        return this.f48681x59c7434;
    }

    /* renamed from: getSurfaceWidth */
    public int m98171x40edc78f() {
        return this.f48682xdffb3519;
    }

    /* renamed from: getVideoGravity */
    public int m98172x68e597c9() {
        return this.f48683x7f30553;
    }

    /* renamed from: getVideoRect */
    public android.graphics.Rect m98173x4edf9e49() {
        return this.f48684x4f722cff;
    }

    /* renamed from: isReadyForDisplay */
    public boolean m98174x2f029732() {
        return this.f48678x3d25bc;
    }

    /* renamed from: release */
    public void m98175x41012807() {
        if (this.f48676xed092cdc) {
            this.f48680x9189ecad.release();
        }
    }

    /* renamed from: setPlayer */
    public void m98176x1d8af1e3(com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 c25839x8ea38701) {
        this.f48677xc53e9ae1 = c25839x8ea38701;
        if (c25839x8ea38701 != null) {
            c25839x8ea38701.m98063xc77cdf14(this);
        }
    }

    /* renamed from: setReadyForDisplay */
    public void m98177x1b7590fa(com.p314xaae8f345.tav.p2967xc53e9ae1.C25845x838a96d0.PlayerLayerReadyListener playerLayerReadyListener) {
        this.f48679x7f36af77 = playerLayerReadyListener;
    }

    /* renamed from: setVideoGravity */
    public void m98178x9f2e92d5(int i17) {
        this.f48683x7f30553 = i17;
    }

    public C25845x838a96d0(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        this.f48676xed092cdc = false;
        this.f48679x7f36af77 = null;
        this.f48680x9189ecad = new android.view.Surface(surfaceTexture);
        this.f48676xed092cdc = true;
        this.f48682xdffb3519 = i17;
        this.f48681x59c7434 = i18;
    }
}
