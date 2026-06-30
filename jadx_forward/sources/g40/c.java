package g40;

/* loaded from: classes12.dex */
public final class c implements com.p314xaae8f345.mm.p947xba6de98f.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g40.g f350202a;

    public c(g40.g gVar) {
        this.f350202a = gVar;
    }

    @Override // com.p314xaae8f345.mm.p947xba6de98f.v2
    public void b(com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var) {
        if ((n1Var != null ? n1Var.f152640e : null) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileMsgDownloadHelper", "onProgress: event is null");
            return;
        }
        g40.g gVar = this.f350202a;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = gVar.f350212e;
        if (f9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileMsgDownloadHelper", "onProgress: MsgInfo is null");
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d a17 = bt3.c.a(gVar.f350210c, f9Var.m124847x74d37ac6(), f9Var.Q0());
        if (a17 == null) {
            gVar.c(null);
            return;
        }
        gVar.f350211d = a17;
        dn.g gVar2 = n1Var.f152640e;
        if (gVar2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileMsgDownloadHelper", "onProgress: progressInfo is null");
            return;
        }
        a17.f68109x90a9378 = gVar2.f69496x83ec3dd;
        a17.f68113xeb1a61d6 = gVar2.f69500x8ab84c59;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileMsgDownloadHelper", "FileMsgDownloadHelper progress " + gVar2.f69496x83ec3dd + '/' + gVar2.f69500x8ab84c59 + " offset:" + a17.f68109x90a9378);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = gVar.f350211d;
        if (dVar != null) {
            if (dVar.f68109x90a9378 != dVar.f68113xeb1a61d6 && dVar.f68112x10a0fed7 == 102) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FileMsgDownloadHelper", "cancel download, status:" + dVar.f68112x10a0fed7);
                ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Ai(gVar.f350213f);
            } else if (dVar.f68112x10a0fed7 == 199) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FileMsgDownloadHelper", "cancel download, status:" + dVar.f68112x10a0fed7);
                dVar.f68109x90a9378 = dVar.f68113xeb1a61d6;
                ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Ai(gVar.f350213f);
            }
            ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).mo9952xce0038c9(dVar, new java.lang.String[0]);
            gVar.h(dVar.f68109x90a9378, dVar.f68113xeb1a61d6);
        }
    }

    @Override // com.p314xaae8f345.mm.p947xba6de98f.v2
    public void c(com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var) {
    }
}
