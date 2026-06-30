package dl4;

/* loaded from: classes3.dex */
public final class k1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316961d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.w1 f316962e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(java.lang.String str, com.p314xaae8f345.mm.sdk.p2603x2137b148.w1 w1Var) {
        super(1);
        this.f316961d = str;
        this.f316962e = w1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ff0.z zVar = (ff0.z) obj;
        java.lang.String str = this.f316961d;
        pm0.v.X(new dl4.j1(zVar, str));
        java.util.HashMap hashMap = dl4.m1.f316969a;
        ((ku5.t0) ku5.t0.f394148d).h(new dl4.g1(str, zVar, this.f316962e), "MicroMsg.TingPickImageColorManager");
        return jz5.f0.f384359a;
    }
}
