package df2;

/* loaded from: classes3.dex */
public final class vz extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ df2.a00 f313178b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz(df2.a00 a00Var, java.lang.Class cls) {
        super(cls);
        this.f313178b = a00Var;
    }

    @Override // dk2.cb
    public void a(int i17, java.lang.String errMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f313178b.f311181m, "[polling] failed. retCode = " + i17 + ", errMsg = " + errMsg);
    }

    @Override // dk2.cb
    public void b(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        r45.xb2 result = (r45.xb2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        df2.a00 a00Var = this.f313178b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a00Var.f311181m, "onPollingSuccess info: " + pm0.b0.g(result));
        a00Var.f311183o.mo7808x76db6cb1(result);
    }
}
