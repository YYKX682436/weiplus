package sc2;

/* loaded from: classes2.dex */
public final class b7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487325d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xc2.t0 f487326e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7(in5.s0 s0Var, xc2.t0 t0Var) {
        super(1);
        this.f487325d = s0Var;
        this.f487326e = t0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ad2.h observer = (ad2.h) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        observer.p(this.f487325d, this.f487326e);
        return jz5.f0.f384359a;
    }
}
