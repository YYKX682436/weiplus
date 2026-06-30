package at0;

/* loaded from: classes10.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f95111d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ at0.n f95112e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f95113f;

    public g(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, at0.n nVar, yz5.l lVar) {
        this.f95111d = h0Var;
        this.f95112e = nVar;
        this.f95113f = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!((ct0.b) this.f95111d.f391656d).a()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(985L, 151L, 1L, false);
            ht0.b bVar = this.f95112e.f95128c;
            if (bVar != null) {
                bVar.mo127742xae7a2e7a();
            }
        }
        if (!((ct0.b) this.f95111d.f391656d).b()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(985L, 152L, 1L, false);
            ht0.b bVar2 = this.f95112e.f95129d;
            if (bVar2 != null) {
                bVar2.mo127742xae7a2e7a();
            }
        }
        this.f95112e.f95141p = true;
        yz5.l lVar = this.f95113f;
        if (lVar != null) {
            lVar.mo146xb9724478(this.f95111d.f391656d);
        }
    }
}
