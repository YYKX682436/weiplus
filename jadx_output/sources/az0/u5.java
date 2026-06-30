package az0;

/* loaded from: classes5.dex */
public final class u5 implements com.tencent.maas.instamovie.MJMovieSession.OnComplete {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f15938a;

    public u5(yz5.l lVar) {
        this.f15938a = lVar;
    }

    @Override // com.tencent.maas.instamovie.MJMovieSession.OnComplete
    public void onComplete(com.tencent.maas.instamovie.base.MJError mJError) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasMovieSessionManager", "endSegmentClipping onComplete: " + mJError);
        yz5.l lVar = this.f15938a;
        if (lVar != null) {
            lVar.invoke(mJError);
        }
    }
}
