package tu1;

/* loaded from: classes13.dex */
public final class g extends android.media.projection.MediaProjection.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tu1.o f503631a;

    public g(tu1.o oVar) {
        this.f503631a = oVar;
    }

    @Override // android.media.projection.MediaProjection.Callback
    public void onStop() {
        super.onStop();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenCastManager", "createMediaProjection callback onStop");
        this.f503631a.d();
    }
}
