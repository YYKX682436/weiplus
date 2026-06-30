package t16;

/* loaded from: classes15.dex */
public class b extends t16.g {

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f496141b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.util.List value, yz5.l computeType) {
        super(value);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(computeType, "computeType");
        this.f496141b = computeType;
    }

    @Override // t16.g
    public f26.o0 a(o06.v0 module) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(module, "module");
        f26.o0 o0Var = (f26.o0) this.f496141b.mo146xb9724478(module);
        if (!l06.o.z(o0Var) && !l06.o.G(o0Var) && !l06.o.C(o0Var, l06.w.W.i()) && !l06.o.C(o0Var, l06.w.X.i()) && !l06.o.C(o0Var, l06.w.Y.i())) {
            l06.o.C(o0Var, l06.w.Z.i());
        }
        return o0Var;
    }
}
