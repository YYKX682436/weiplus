package el2;

/* loaded from: classes3.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335302d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ el2.i0 f335303e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f335304f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ el2.e0 f335305g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(java.lang.String str, el2.i0 i0Var, boolean z17, el2.e0 e0Var) {
        super(4);
        this.f335302d = str;
        this.f335303e = i0Var;
        this.f335304f = z17;
        this.f335305g = e0Var;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        java.lang.String link = (java.lang.String) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(link, "link");
        java.lang.String str = this.f335302d;
        el2.i0 i0Var = this.f335303e;
        pm0.v.X(new el2.c0(((java.lang.Number) obj).intValue(), str, link, i0Var, (r45.i23) obj4, this.f335304f, (java.lang.String) obj2, this.f335305g));
        return jz5.f0.f384359a;
    }
}
