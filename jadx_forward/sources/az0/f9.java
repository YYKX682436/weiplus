package az0;

/* loaded from: classes5.dex */
public final class f9 implements com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ az0.s9 f97007a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f97008b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f97009c;

    public f9(az0.s9 s9Var, yz5.l lVar, yz5.l lVar2) {
        this.f97007a = s9Var;
        this.f97008b = lVar;
        this.f97009c = lVar2;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0
    /* renamed from: onComplete */
    public final void mo9325x815f5438(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "first frame did present");
        this.f97007a.getClass();
        ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).rj("SCFirstImpression", "MJShootComposing", "", 0);
        i95.m c17 = i95.n0.c(pp0.m0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        pp0.m0.ee((pp0.m0) c17, "mjpublisher_first_impression", null, "Completed", null, 8, null);
        ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).tj(false);
        yz5.l lVar = this.f97008b;
        if (lVar != null) {
            lVar.mo146xb9724478(c4093x6b88526b);
        }
        this.f97009c.mo146xb9724478(c4093x6b88526b);
    }
}
