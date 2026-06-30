package dk2;

/* loaded from: classes3.dex */
public final class le extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk2.e f315268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.t f315269e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public le(gk2.e eVar, boolean z17, yz5.t tVar) {
        super(1);
        this.f315268d = eVar;
        this.f315269e = tVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        dk2.k6 k6Var = dk2.ef.f314923j;
        dk2.xf xfVar = dk2.ef.A;
        k6Var.getClass();
        gk2.e liveData = this.f315268d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        yz5.t callback = this.f315269e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (xfVar != null) {
            ((dk2.r4) xfVar).v(new dk2.g6(liveData, xfVar, k6Var, callback));
        }
        return jz5.f0.f384359a;
    }
}
