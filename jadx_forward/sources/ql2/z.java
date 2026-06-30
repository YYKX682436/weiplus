package ql2;

/* loaded from: classes10.dex */
public final class z implements um5.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ql2.d0 f446103d;

    public z(ql2.d0 d0Var) {
        this.f446103d = d0Var;
    }

    @Override // um5.e
    public void a(android.graphics.SurfaceTexture surfaceTexture) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LivePullDownView", "liveEffectView onSurfaceDestroy");
        ql2.d0 d0Var = this.f446103d;
        d0Var.f446040i = null;
        com.p314xaae8f345.p2926x359365.C25485x5a0a6891 c25485x5a0a6891 = d0Var.f446039h;
        if (c25485x5a0a6891 != null) {
            c25485x5a0a6891.m94527x42c875eb(null);
        }
    }

    @Override // um5.e
    public void b(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LivePullDownView", "liveEffectView onSurfaceAvailable width:" + i17 + " height:" + i18);
        ql2.d0 d0Var = this.f446103d;
        d0Var.f446040i = surfaceTexture;
        com.p314xaae8f345.p2926x359365.C25485x5a0a6891 c25485x5a0a6891 = d0Var.f446039h;
        if (c25485x5a0a6891 != null) {
            c25485x5a0a6891.m94527x42c875eb(new android.view.Surface(d0Var.f446040i));
        }
    }

    @Override // um5.e
    public void c(android.graphics.SurfaceTexture surfaceTexture) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LivePullDownView", "liveEffectView onSurfaceUpdate");
    }
}
