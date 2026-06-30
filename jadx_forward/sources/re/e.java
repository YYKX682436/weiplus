package re;

/* loaded from: classes7.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ re.n f475801d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(re.n nVar) {
        super(0);
        this.f475801d = nVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        re.n nVar = this.f475801d;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.b4) ((jz5.n) nVar.f475818h).mo141623x754a37bb();
        java.lang.String str = nVar.f475812b;
        b4Var.d();
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WXA.AppBrandPageViewMemoryRecycleStrategy", "[wxa_reload]onForeground appId[" + str + "] try restore top[" + nVar.f475813c + "] pages's rendering");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 x07 = nVar.f475811a.x0();
            if (x07 != null) {
                java.util.Iterator h07 = x07.h0(false);
                int i17 = 0;
                while (true) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.g4 g4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.g4) h07;
                    if (!g4Var.hasNext()) {
                        break;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2) g4Var.next();
                    i17++;
                    if (i17 <= nVar.f475813c) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(w2Var);
                        nVar.c(w2Var);
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Luggage.WXA.AppBrandPageViewMemoryRecycleStrategy", th6, "[wxa_reload]onForeground appId[" + str + ']', new java.lang.Object[0]);
        }
        return jz5.f0.f384359a;
    }
}
