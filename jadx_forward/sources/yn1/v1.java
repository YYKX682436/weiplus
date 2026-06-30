package yn1;

/* loaded from: classes9.dex */
public final class v1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn1.r2 f545412d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f545413e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(yn1.r2 r2Var, long j17) {
        super(1);
        this.f545412d = r2Var;
        this.f545413e = j17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.g gVar = this.f545412d.f545343a;
        if (gVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("callback");
            throw null;
        }
        gVar.d1(this.f545413e, new java.util.ArrayList());
        return jz5.f0.f384359a;
    }
}
