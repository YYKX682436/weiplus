package re;

/* loaded from: classes7.dex */
public final class i implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ re.n f475805d;

    public i(re.n nVar) {
        this.f475805d = nVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        re.n nVar = this.f475805d;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WXA.AppBrandPageViewMemoryRecycleStrategy", "[wxa_reload]onBackground appId[" + nVar.f475812b + "] try pause all pages's rendering, delay[" + ((java.lang.Number) ((jz5.n) nVar.f475817g).mo141623x754a37bb()).longValue() + "] switch[" + nVar.f475815e + ']');
            if (nVar.f475815e) {
                java.util.Iterator v17 = nVar.f475811a.v1();
                int i17 = 0;
                while (true) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.z2 z2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.z2) v17;
                    if (!z2Var.hasNext()) {
                        break;
                    }
                    java.util.Iterator h07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3) z2Var.next()).h0(false);
                    while (true) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.g4 g4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.g4) h07;
                        if (g4Var.hasNext()) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2) g4Var.next();
                            i17++;
                            if (i17 > nVar.f475816f) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(w2Var);
                                re.n.a(nVar, w2Var);
                            }
                        }
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Luggage.WXA.AppBrandPageViewMemoryRecycleStrategy", th6, "[wxa_reload]onBackground appId[" + nVar.f475812b + ']', new java.lang.Object[0]);
        }
        return false;
    }
}
