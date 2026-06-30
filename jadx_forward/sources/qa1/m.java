package qa1;

/* loaded from: classes14.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f442538d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f442539e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f442540f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 f442541g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ qa1.p f442542h;

    public m(qa1.p pVar, int i17, boolean z17, yz5.l lVar, com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 abstractC4208x204d5c83) {
        this.f442542h = pVar;
        this.f442538d = i17;
        this.f442539e = z17;
        this.f442540f = lVar;
        this.f442541g = abstractC4208x204d5c83;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.SurfaceHolder surfaceHolder;
        int i17 = this.f442538d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameGLSurfaceView", "hy: request switch to render mode %d", java.lang.Integer.valueOf(i17));
        boolean z17 = this.f442539e;
        qa1.p pVar = this.f442542h;
        yz5.l lVar = this.f442540f;
        if (!z17 && pVar.f442544g.g(i17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameGLSurfaceView", "hy: support status not changed!");
            lVar.mo146xb9724478(java.lang.Boolean.TRUE);
            return;
        }
        com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 abstractC4208x204d5c83 = this.f442541g;
        if (abstractC4208x204d5c83.d() || (surfaceHolder = pVar.f442545h) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameGLSurfaceView", "hy: runtime  destroyed!");
            lVar.mo146xb9724478(java.lang.Boolean.FALSE);
        } else if (abstractC4208x204d5c83 instanceof com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad) {
            pVar.f442544g.p(surfaceHolder, new qa1.l(this), true);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameGLSurfaceView", "hy: runtime is not magic brush!");
            lVar.mo146xb9724478(java.lang.Boolean.FALSE);
        }
    }
}
