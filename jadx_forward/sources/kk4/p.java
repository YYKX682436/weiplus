package kk4;

/* loaded from: classes15.dex */
public final class p implements ek4.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kk4.v f390096a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ek4.s f390097b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dk4.a f390098c;

    public p(kk4.v vVar, ek4.s sVar, dk4.a aVar) {
        this.f390096a = vVar;
        this.f390097b = sVar;
        this.f390098c = aVar;
    }

    @Override // ek4.x
    public void a(int i17, dn.o oVar, dn.h hVar) {
        java.lang.String str = this.f390096a.f390109a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startCdnDownload() #onStop:");
        sb6.append(i17);
        sb6.append(", ");
        sb6.append(oVar != null ? oVar.f69601xaca5bdda : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
    }

    @Override // ek4.x
    public void b(int i17, dn.o oVar) {
        nk4.s sVar;
        yz5.p pVar;
        kk4.v vVar = this.f390096a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vVar.f390109a, "startCdnDownload()#onStart " + vVar.w() + ' ' + i17);
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_text_status_avoid_video_leak, true);
        boolean z17 = vVar.f390115g;
        dk4.a aVar = this.f390098c;
        if (!z17 && fj6) {
            java.lang.String mediaId = aVar.f316015s;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mediaId, "mediaId");
            ek4.s sVar2 = this.f390097b;
            sVar2.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TP.CdnTaskController", "stopStreamDownloadTaskForAvoidLeak ".concat(mediaId));
            pm0.v.O("MicroMsg.Cdn.ThreadName", new ek4.r(sVar2, mediaId));
            return;
        }
        if (i17 == 0) {
            vVar.S(true);
            ck4.b bVar = oVar instanceof ck4.b ? (ck4.b) oVar : null;
            if (bVar == null || (sVar = vVar.f390121m) == null) {
                return;
            }
            nk4.s.d(sVar, new nk4.b(bVar.f124067d2, android.os.SystemClock.uptimeMillis(), null, 4, null), null, 2, null);
            return;
        }
        if (i17 != 1) {
            return;
        }
        kk4.h hVar = vVar.f390113e;
        vVar.N = com.p314xaae8f345.mm.vfs.w6.k(hVar != null ? hVar.f390079e : null);
        ck4.b bVar2 = oVar instanceof ck4.b ? (ck4.b) oVar : null;
        if (bVar2 != null) {
            kk4.h hVar2 = vVar.f390113e;
            long k17 = com.p314xaae8f345.mm.vfs.w6.k(hVar2 != null ? hVar2.f390079e : null);
            bVar2.f124079p2 = k17;
            bVar2.f124080q2 = k17;
        }
        kk4.h hVar3 = vVar.f390113e;
        if (hVar3 != null) {
            hVar3.f390081g = true;
        }
        if (hVar3 != null) {
            hVar3.f390080f = true;
        }
        if (hVar3 != null && (pVar = hVar3.f390084m) != null) {
            pVar.mo149xb9724478(aVar.f316015s, 0);
        }
        vVar.y(4);
    }
}
