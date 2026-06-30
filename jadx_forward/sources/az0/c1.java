package az0;

/* loaded from: classes5.dex */
public final class c1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.f2 f96907d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(az0.f2 f2Var) {
        super(1);
        this.f96907d = f2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        yz5.l complete = (yz5.l) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(complete, "complete");
        az0.f2 f2Var = this.f96907d;
        f2Var.f96998i = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "teardown start");
        f2Var.f96993d.b0(new az0.b1(f2Var, complete));
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4016x48c9106d c4016x48c9106d = f2Var.f96994e;
        c4016x48c9106d.a();
        c4016x48c9106d.q();
        return jz5.f0.f384359a;
    }
}
