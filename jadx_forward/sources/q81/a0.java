package q81;

/* loaded from: classes7.dex */
public final class a0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.a, wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public yz5.a f442224d;

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "MicroMsg.AppBrand.GetCodeRetryQueueNewImpl.CheckCmdAndSubmitTask";
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        if (!gm0.j1.b().f354787q) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.GetCodeRetryQueueNewImpl.CheckCmdAndSubmitTask", "retry but account not ready");
            q81.e0.f442237g.h();
            return;
        }
        be1.y E = be1.z.E(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        switch (E) {
            case None:
            case Unknown:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.GetCodeRetryQueueNewImpl.CheckCmdAndSubmitTask", "networkType(" + E + ") invalid, skip");
                return;
            case Mobile_2g:
                i17 = 2;
                break;
            case Mobile_3g:
                i17 = 4;
                break;
            case Mobile_4g:
            case Mobile_5g:
                i17 = 8;
                break;
            case Wifi:
                i17 = 1;
                break;
            default:
                i17 = -1;
                break;
        }
        java.util.LinkedList<t81.c> linkedList = new java.util.LinkedList();
        t81.d dVar = (t81.d) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(t81.d.class);
        dVar.getClass();
        boolean z17 = false;
        linkedList.addAll(dVar.D0("networkType=?", java.lang.String.valueOf(0)));
        t81.d dVar2 = (t81.d) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(t81.d.class);
        dVar2.getClass();
        java.util.List<t81.c> D0 = dVar2.D0("networkType<>?", java.lang.String.valueOf(0));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(D0, "getCmdsUnderSpecificNetType(...)");
        for (t81.c cVar : D0) {
            if ((cVar.f67705xf813eec3 & i17) > 0) {
                linkedList.add(cVar);
            }
        }
        for (t81.c cVar2 : linkedList) {
            if (cVar2.f67715x2262335f == 0) {
                q81.e0 e0Var = q81.e0.f442237g;
                e0Var.getClass();
                e0Var.a(new q81.d0(cVar2));
            } else {
                z17 = true;
            }
        }
        yz5.a aVar = this.f442224d;
        if (aVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("notifyQueueCallback");
            throw null;
        }
        aVar.mo152xb9724478();
        if (z17) {
            q81.x._INSTANCE.j();
        }
    }
}
