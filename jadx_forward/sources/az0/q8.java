package az0;

/* loaded from: classes5.dex */
public final class q8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 f97374d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.s9 f97375e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 c4020x8c1a4944, az0.s9 s9Var) {
        super(1);
        this.f97374d = c4020x8c1a4944;
        this.f97375e = s9Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        yz5.l complete = (yz5.l) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(complete, "complete");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "teardown start");
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 c4020x8c1a4944 = this.f97374d;
        c4020x8c1a4944.b0(new az0.p8(c4020x8c1a4944, complete));
        az0.s9 s9Var = this.f97375e;
        s9Var.f97424d.a();
        s9Var.f97424d.q();
        return jz5.f0.f384359a;
    }
}
