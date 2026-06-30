package c16;

/* loaded from: classes16.dex */
public final class g extends f26.b0 {
    @Override // f26.b0
    public f26.l2 a(o06.e2 parameter, f26.c0 typeAttr, f26.k2 typeParameterUpperBoundEraser, f26.o0 erasedUpperBound) {
        kotlin.jvm.internal.o.g(parameter, "parameter");
        kotlin.jvm.internal.o.g(typeAttr, "typeAttr");
        kotlin.jvm.internal.o.g(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
        kotlin.jvm.internal.o.g(erasedUpperBound, "erasedUpperBound");
        if (!(typeAttr instanceof c16.a)) {
            return new f26.n2(f26.d3.f259145h, erasedUpperBound);
        }
        c16.a aVar = (c16.a) typeAttr;
        if (!aVar.f37946c) {
            aVar = aVar.b(c16.c.f37950d);
        }
        int ordinal = aVar.f37945b.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2) {
                return new f26.n2(f26.d3.f259143f, erasedUpperBound);
            }
            throw new jz5.j();
        }
        if (!parameter.q().f259148e) {
            return new f26.n2(f26.d3.f259143f, v16.f.e(parameter).o());
        }
        java.util.List parameters = erasedUpperBound.w0().getParameters();
        kotlin.jvm.internal.o.f(parameters, "getParameters(...)");
        return parameters.isEmpty() ^ true ? new f26.n2(f26.d3.f259145h, erasedUpperBound) : f26.z2.m(parameter, aVar);
    }
}
