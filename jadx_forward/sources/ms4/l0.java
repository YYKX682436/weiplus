package ms4;

/* loaded from: classes8.dex */
public final class l0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ms4.o0 f412596a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f412597b;

    public l0(ms4.o0 o0Var, yz5.l lVar) {
        this.f412596a = o0Var;
        this.f412597b = lVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinRechargeViewModel", "getWecoinPageInfoRequest errorType: " + fVar.f152148a + ", errorCode: " + fVar.f152149b + ", errorMsg: " + fVar.f152150c);
        ms4.o0 o0Var = this.f412596a;
        o0Var.f412629r.mo7808x76db6cb1(java.lang.Boolean.FALSE);
        boolean h17 = os4.h.h(fVar);
        yz5.l lVar = this.f412597b;
        if (h17) {
            java.lang.Long l17 = (java.lang.Long) o0Var.f412619e.mo3195x754a37bb();
            if (l17 != null && l17.longValue() == 0) {
                r2 = false;
            }
            lVar.mo146xb9724478(java.lang.Boolean.valueOf(r2));
        } else {
            lVar.mo146xb9724478(java.lang.Boolean.valueOf(((r45.hs3) fVar.f152151d).f457949d != 0));
        }
        return jz5.f0.f384359a;
    }
}
