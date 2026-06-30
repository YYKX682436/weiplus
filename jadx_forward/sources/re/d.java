package re;

/* loaded from: classes7.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ re.n f475800d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(re.n nVar) {
        super(0);
        this.f475800d = nVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        re.n nVar = this.f475800d;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.b4) ((jz5.n) nVar.f475818h).mo141623x754a37bb();
        java.lang.String str = nVar.f475812b;
        b4Var.d();
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WXA.AppBrandPageViewMemoryRecycleStrategy", "[wxa_reload]onSuspend appId[" + str + "] try pause all pages's rendering");
            java.util.Iterator v17 = nVar.f475811a.v1();
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
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(w2Var);
                        re.n.a(nVar, w2Var);
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Luggage.WXA.AppBrandPageViewMemoryRecycleStrategy", th6, "[wxa_reload]onSuspend appId[" + str + ']', new java.lang.Object[0]);
        }
        return jz5.f0.f384359a;
    }
}
