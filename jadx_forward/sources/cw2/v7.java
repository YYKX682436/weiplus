package cw2;

/* loaded from: classes15.dex */
public final class v7 implements ek4.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd f305602a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kw2.f f305603b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cw2.s6 f305604c;

    public v7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd, kw2.f fVar, cw2.s6 s6Var) {
        this.f305602a = c15188xd8bd4bd;
        this.f305603b = fVar;
        this.f305604c = s6Var;
    }

    @Override // ek4.z
    public void a(int i17, dn.o oVar, dn.h hVar) {
        cw2.eb downloadCallback;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = this.f305602a;
        cw2.wa mediaSource = c15188xd8bd4bd.getMediaSource();
        if (mediaSource != null && (downloadCallback = c15188xd8bd4bd.getDownloadCallback()) != null) {
            downloadCallback.z(mediaSource.f305631e, oVar, hVar);
        }
        kw2.f fVar = this.f305603b;
        cw2.s6 s6Var = this.f305604c;
        if (i17 == 0) {
            if (fVar != null) {
                kw2.g gVar = new kw2.g(false, null, s6Var.f305535g, hVar);
                fVar.f394540a = gVar;
                yz5.l lVar = fVar.f394541b;
                if (lVar != null) {
                    lVar.mo146xb9724478(gVar);
                }
            }
            kw2.y Uj = ((c61.l7) i95.n0.c(c61.l7.class)).Uj();
            java.lang.String mediaId = s6Var.f305532d;
            Uj.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
            if (hVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderNetworkFlowReport", "downloaderComeStopState mediaId:" + mediaId + " return for result is null  size:" + Uj.f394650c.size() + " list:");
            } else {
                pm0.v.O("FinderNetworkFlowReport_Thread", new kw2.i(Uj, mediaId, hVar));
            }
        }
        s6Var.c(false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c15188xd8bd4bd.m61380xe56ce956(), "FTPP.stopCdnDownload#onStop(), real cancel download task " + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd.j(c15188xd8bd4bd) + ' ' + i17 + " observer:" + fVar);
    }
}
