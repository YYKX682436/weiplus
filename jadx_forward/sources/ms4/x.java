package ms4;

/* loaded from: classes8.dex */
public class x implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ js4.o f412664a;

    public x(ms4.z zVar, js4.o oVar) {
        this.f412664a = oVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinManagerImplement", "CgiGetWecoinBalanceRequest errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b), fVar.f152150c);
        boolean h17 = os4.h.h(fVar);
        js4.o oVar = this.f412664a;
        if (h17) {
            if (oVar == null) {
                return null;
            }
            oVar.a(fVar.f152148a, fVar.f152149b, fVar.f152150c);
            return null;
        }
        r45.fs3 fs3Var = (r45.fs3) fVar.f152151d;
        fs3Var.f456119e = false;
        if (oVar == null) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinManagerImplement", "CgiGetWecoinBalanceRequest response.balance: %s newUserDiscount: %s", java.lang.Long.valueOf(fs3Var.f456118d), java.lang.Boolean.valueOf(fs3Var.f456119e));
        os4.h.l(fs3Var.f456118d);
        oVar.mo14245xe05b4124(fs3Var);
        return null;
    }
}
