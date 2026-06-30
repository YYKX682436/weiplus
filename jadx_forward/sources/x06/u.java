package x06;

/* loaded from: classes15.dex */
public final class u implements r16.l {
    @Override // r16.l
    public r16.k a(o06.b superDescriptor, o06.b subDescriptor, o06.g gVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(superDescriptor, "superDescriptor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subDescriptor, "subDescriptor");
        boolean z17 = subDescriptor instanceof o06.o1;
        r16.k kVar = r16.k.UNKNOWN;
        if (!z17 || !(superDescriptor instanceof o06.o1)) {
            return kVar;
        }
        o06.o1 o1Var = (o06.o1) subDescriptor;
        o06.o1 o1Var2 = (o06.o1) superDescriptor;
        return !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(o1Var.mo132800xfb82e301(), o1Var2.mo132800xfb82e301()) ? kVar : (b16.e.a(o1Var) && b16.e.a(o1Var2)) ? r16.k.OVERRIDABLE : (b16.e.a(o1Var) || b16.e.a(o1Var2)) ? r16.k.INCOMPATIBLE : kVar;
    }

    @Override // r16.l
    public r16.j b() {
        return r16.j.BOTH;
    }
}
