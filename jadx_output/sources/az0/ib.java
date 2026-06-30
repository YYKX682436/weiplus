package az0;

/* loaded from: classes5.dex */
public final class ib implements com.tencent.maas.camstudio.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ az0.xb f15590a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f15591b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f15592c;

    public ib(az0.xb xbVar, yz5.l lVar, yz5.l lVar2) {
        this.f15590a = xbVar;
        this.f15591b = lVar;
        this.f15592c = lVar2;
    }

    @Override // com.tencent.maas.camstudio.d0
    public final void onComplete(com.tencent.maas.instamovie.base.MJError mJError) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "first frame did present");
        this.f15590a.getClass();
        ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).rj("SCFirstImpression", "MJShootComposing", "", 0);
        i95.m c17 = i95.n0.c(pp0.m0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        pp0.m0.ee((pp0.m0) c17, "mjpublisher_first_impression", null, "Completed", null, 8, null);
        ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).tj(false);
        yz5.l lVar = this.f15591b;
        if (lVar != null) {
            lVar.invoke(mJError);
        }
        this.f15592c.invoke(mJError);
    }
}
