package iy2;

/* loaded from: classes15.dex */
public final class i extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15487x24678974 f377429a;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15487x24678974 c15487x24678974) {
        this.f377429a = c15487x24678974;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        int i17 = msg.what;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15487x24678974 c15487x24678974 = this.f377429a;
        if (i17 != 0) {
            if (i17 != 1) {
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(c15487x24678974.f218277d, "Recognized revealTime force finished %s", java.lang.Integer.valueOf(c15487x24678974.getCurrentState()));
            }
        }
        java.lang.String str = c15487x24678974.f218277d;
        c15487x24678974.getCurrentState();
        if (c15487x24678974.getCurrentState() != c15487x24678974.getSTATE_WAITING()) {
            return;
        }
        mo50303x856b99f0(0);
        mo50303x856b99f0(1);
        z21.e eVar = c15487x24678974.f218279f;
        if (eVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
            eVar.mo48278xae7a2e7a(true);
        }
        c15487x24678974.f(true);
    }
}
