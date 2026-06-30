package az0;

/* loaded from: classes5.dex */
public final class n5 implements com.tencent.maas.instamovie.MJMovieSession.OnComplete {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f15740a;

    public n5(yz5.l lVar) {
        this.f15740a = lVar;
    }

    @Override // com.tencent.maas.instamovie.MJMovieSession.OnComplete
    public void onComplete(com.tencent.maas.instamovie.base.MJError mJError) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasMovieSessionManager", "beginSegmentClipping onComplete: " + mJError);
        yz5.l lVar = this.f15740a;
        if (lVar != null) {
            lVar.invoke(mJError);
        }
    }
}
