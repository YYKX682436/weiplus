package hx1;

/* loaded from: classes12.dex */
public class e extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hx1.g f367153a;

    public e(hx1.g gVar) {
        this.f367153a = gVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        hx1.g gVar = this.f367153a;
        if (gVar.f367168m.f376883x.booleanValue()) {
            qx1.q qVar = (qx1.q) gVar.f367167l;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f c22698xdfbd289f = qVar.f448842c;
            db5.e1.H(c22698xdfbd289f.getContext(), c22698xdfbd289f.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hub), "", true, new qx1.e(qVar), new qx1.f(qVar));
            gVar.f367168m.f376883x = java.lang.Boolean.FALSE;
        }
        ix1.n nVar = gVar.f367168m;
        long j17 = gVar.f367157b;
        long j18 = 0;
        if (j17 != 0) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            j18 = android.os.SystemClock.elapsedRealtime() - j17;
        }
        nVar.f376876t = (int) com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.u1.j(j18);
        mo50307xb9e94560(4096, 250L);
    }
}
