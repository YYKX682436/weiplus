package g40;

/* loaded from: classes12.dex */
public final class a implements com.p314xaae8f345.mm.p947xba6de98f.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g40.g f350193a;

    public a(g40.g gVar) {
        this.f350193a = gVar;
    }

    @Override // com.p314xaae8f345.mm.p947xba6de98f.q0
    public void a(com.p314xaae8f345.mm.p947xba6de98f.n1 event) {
        i40.b bVar;
        i40.b bVar2;
        i40.b bVar3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (event.f152636a == com.p314xaae8f345.mm.p947xba6de98f.m1.f152618q) {
            g40.g gVar = this.f350193a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileMsgDownloadHelper", "onTask cancel mediaId:%s", gVar.f350213f);
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = gVar.f350212e;
            if (f9Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileMsgDownloadHelper", "onTask cancel MsgInfo is null");
                java.lang.ref.WeakReference weakReference = gVar.f350220m;
                if (weakReference == null || (bVar3 = (i40.b) weakReference.get()) == null) {
                    return;
                }
                bVar3.a(3, -2, "can not find msgInfo");
                return;
            }
            gVar.f350211d = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).J0(f9Var.m124847x74d37ac6(), f9Var.Q0());
            if (gVar.f350211d == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileMsgDownloadHelper", "pause get by msgid  %s null then get by mediaId %s", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), gVar.f350210c);
                gVar.f350211d = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).D0(gVar.f350210c);
            }
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = gVar.f350211d;
            if (dVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileMsgDownloadHelper", "onTask cancel AppAttachInfo is null");
                java.lang.ref.WeakReference weakReference2 = gVar.f350220m;
                if (weakReference2 == null || (bVar2 = (i40.b) weakReference2.get()) == null) {
                    return;
                }
                bVar2.a(3, -2, "can not find appAttachInfo");
                return;
            }
            dVar.f68112x10a0fed7 = 102L;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileMsgDownloadHelper", "pause done %s", java.lang.Boolean.valueOf(((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).mo9952xce0038c9(dVar, new java.lang.String[0])));
            java.lang.ref.WeakReference weakReference3 = gVar.f350220m;
            if (weakReference3 != null && (bVar = (i40.b) weakReference3.get()) != null) {
                bVar.b();
            }
            gVar.f350219l = null;
        }
    }
}
