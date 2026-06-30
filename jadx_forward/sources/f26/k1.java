package f26;

/* loaded from: classes16.dex */
public final class k1 {
    public k1(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final f26.l1 a(f26.l1 l1Var, o06.d2 typeAliasDescriptor, java.util.List arguments) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeAliasDescriptor, "typeAliasDescriptor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arguments, "arguments");
        java.util.List mo9613x99879e0 = ((r06.l) typeAliasDescriptor).f450015n.mo9613x99879e0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo9613x99879e0, "getParameters(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(mo9613x99879e0, 10));
        java.util.Iterator it = mo9613x99879e0.iterator();
        while (it.hasNext()) {
            arrayList.add(((o06.e2) it.next()).a());
        }
        return new f26.l1(l1Var, typeAliasDescriptor, arguments, kz5.c1.q(kz5.n0.a1(arrayList, arguments)), null);
    }
}
