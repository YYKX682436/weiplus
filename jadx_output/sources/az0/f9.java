package az0;

/* loaded from: classes5.dex */
public final class f9 implements com.tencent.maas.camstudio.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ az0.s9 f15474a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f15475b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f15476c;

    public f9(az0.s9 s9Var, yz5.l lVar, yz5.l lVar2) {
        this.f15474a = s9Var;
        this.f15475b = lVar;
        this.f15476c = lVar2;
    }

    @Override // com.tencent.maas.camstudio.d0
    public final void onComplete(com.tencent.maas.instamovie.base.MJError mJError) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "first frame did present");
        this.f15474a.getClass();
        ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).rj("SCFirstImpression", "MJShootComposing", "", 0);
        i95.m c17 = i95.n0.c(pp0.m0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        pp0.m0.ee((pp0.m0) c17, "mjpublisher_first_impression", null, "Completed", null, 8, null);
        ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).tj(false);
        yz5.l lVar = this.f15475b;
        if (lVar != null) {
            lVar.invoke(mJError);
        }
        this.f15476c.invoke(mJError);
    }
}
