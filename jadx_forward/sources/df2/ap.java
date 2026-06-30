package df2;

/* loaded from: classes3.dex */
public final class ap extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ df2.bp f311266b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap(df2.bp bpVar, java.lang.Class cls) {
        super(cls);
        this.f311266b = bpVar;
    }

    @Override // dk2.cb
    public void a(int i17, java.lang.String errMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f311266b.f311353m, "[polling] failed. retCode = " + i17 + ", errMsg = " + errMsg);
    }

    @Override // dk2.cb
    public void b(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        r45.tp1 result = (r45.tp1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        df2.bp bpVar = this.f311266b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(bpVar.f311353m, "info: " + pm0.b0.g(result));
        ((je2.t) bpVar.m56788xbba4bfc0(je2.t.class)).f380801n.mo7808x76db6cb1(result);
    }
}
