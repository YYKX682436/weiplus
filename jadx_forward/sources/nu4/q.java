package nu4;

/* loaded from: classes7.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f421805d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nu4.b0 f421806e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f421807f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(java.lang.String str, nu4.b0 b0Var, java.lang.String str2) {
        super(1);
        this.f421805d = str;
        this.f421806e = b0Var;
        this.f421807f = str2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String prefetchId = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefetchId, "prefetchId");
        java.lang.String str2 = this.f421805d;
        if (str2 == null || r26.n0.N(str2)) {
            str = "";
        } else {
            str = "," + str2;
        }
        lu4.c.u(this.f421806e, this.f421807f, "{target:'" + prefetchId + '\'' + str + '}', null, 4, null);
        return jz5.f0.f384359a;
    }
}
