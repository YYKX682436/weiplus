package c16;

/* loaded from: classes16.dex */
public final class g extends f26.b0 {
    @Override // f26.b0
    public f26.l2 a(o06.e2 parameter, f26.c0 typeAttr, f26.k2 typeParameterUpperBoundEraser, f26.o0 erasedUpperBound) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parameter, "parameter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeAttr, "typeAttr");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(erasedUpperBound, "erasedUpperBound");
        if (!(typeAttr instanceof c16.a)) {
            return new f26.n2(f26.d3.f340678h, erasedUpperBound);
        }
        c16.a aVar = (c16.a) typeAttr;
        if (!aVar.f119479c) {
            aVar = aVar.b(c16.c.f119483d);
        }
        int ordinal = aVar.f119478b.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2) {
                return new f26.n2(f26.d3.f340676f, erasedUpperBound);
            }
            throw new jz5.j();
        }
        if (!parameter.q().f340681e) {
            return new f26.n2(f26.d3.f340676f, v16.f.e(parameter).o());
        }
        java.util.List mo9613x99879e0 = erasedUpperBound.w0().mo9613x99879e0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo9613x99879e0, "getParameters(...)");
        return mo9613x99879e0.isEmpty() ^ true ? new f26.n2(f26.d3.f340678h, erasedUpperBound) : f26.z2.m(parameter, aVar);
    }
}
