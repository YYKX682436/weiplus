package cw2;

/* loaded from: classes15.dex */
public final class r7 implements ek4.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd f305512a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kw2.f f305513b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ so2.i3 f305514c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.s6 f305515d;

    public r7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd, kw2.f fVar, so2.i3 i3Var, cw2.s6 s6Var) {
        this.f305512a = c15188xd8bd4bd;
        this.f305513b = fVar;
        this.f305514c = i3Var;
        this.f305515d = s6Var;
    }

    @Override // ek4.x
    public void b(int i17, dn.o oVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae882;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = this.f305512a;
        java.lang.String m61380xe56ce956 = c15188xd8bd4bd.m61380xe56ce956();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FTPP.startCdnDownload#onStart ");
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd.j(c15188xd8bd4bd));
        sb6.append(' ');
        sb6.append(i17);
        sb6.append(" observer:");
        kw2.f fVar = this.f305513b;
        sb6.append(fVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m61380xe56ce956, sb6.toString());
        java.lang.String str = null;
        if (i17 == 0 && fVar != null) {
            kw2.g gVar = new kw2.g(true, this.f305514c, null, null);
            fVar.f394540a = gVar;
            yz5.l lVar = fVar.f394541b;
            if (lVar != null) {
                lVar.mo146xb9724478(gVar);
            }
        }
        cw2.i9 lifecycle = c15188xd8bd4bd.getLifecycle();
        if (lifecycle != null) {
            cw2.wa mediaSource = c15188xd8bd4bd.getMediaSource();
            long feedId = (mediaSource == null || (c14989xf862ae882 = mediaSource.f305632f) == null) ? 0L : c14989xf862ae882.getFeedId();
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            cw2.wa mediaSource2 = c15188xd8bd4bd.getMediaSource();
            if (mediaSource2 != null && (c14989xf862ae88 = mediaSource2.f305632f) != null) {
                str = c14989xf862ae88.getDupFlag();
            }
            lifecycle.B(new nk4.c(feedId, 3, uptimeMillis, str, null, 16, null));
        }
        pw2.b bVar = c15188xd8bd4bd.f212208y0;
        if (bVar.f440227j == 0) {
            bVar.f440227j = android.os.SystemClock.uptimeMillis();
        }
        cw2.e0 bufferProgressConsumer = c15188xd8bd4bd.getBufferProgressConsumer();
        if (bufferProgressConsumer != null) {
            bufferProgressConsumer.f305201j = true;
        }
        cu2.x xVar = cu2.x.f303982a;
        cw2.s6 s6Var = this.f305515d;
        so2.i3 c17 = cu2.x.c(xVar, s6Var.f305532d, false, false, false, 14, null);
        c15188xd8bd4bd.f212205x0.G = c17.f68968x799e9d9e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c15188xd8bd4bd.m61380xe56ce956(), "FTPP.startCdnDownload#onStart hitPreloadSize:" + c17.f68968x799e9d9e);
        s6Var.c(false);
        c15188xd8bd4bd.o0(true);
    }
}
