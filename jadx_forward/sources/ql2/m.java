package ql2;

/* loaded from: classes10.dex */
public final class m implements um5.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ql2.r f446066d;

    public m(ql2.r rVar) {
        this.f446066d = rVar;
    }

    @Override // um5.e
    public void a(android.graphics.SurfaceTexture surfaceTexture) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LivePullDownView", "liveEffectView onSurfaceDestroy");
        ql2.r rVar = this.f446066d;
        rVar.f446080m = null;
        com.p314xaae8f345.p2926x359365.C25485x5a0a6891 c25485x5a0a6891 = rVar.f446079i;
        if (c25485x5a0a6891 != null) {
            c25485x5a0a6891.m94527x42c875eb(null);
        }
    }

    @Override // um5.e
    public void b(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LivePullDownView", "liveEffectView onSurfaceAvailable width:" + i17 + " height:" + i18);
        ql2.r rVar = this.f446066d;
        rVar.f446080m = surfaceTexture;
        com.p314xaae8f345.p2926x359365.C25485x5a0a6891 c25485x5a0a6891 = rVar.f446079i;
        if (c25485x5a0a6891 != null) {
            c25485x5a0a6891.m94527x42c875eb(new android.view.Surface(rVar.f446080m));
        }
    }

    @Override // um5.e
    public void c(android.graphics.SurfaceTexture surfaceTexture) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LivePullDownView", "liveEffectView onSurfaceUpdate");
    }
}
