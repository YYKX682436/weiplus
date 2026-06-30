package r06;

/* loaded from: classes16.dex */
public final class r1 extends r06.s1 {

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f450051r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(o06.b containingDeclaration, o06.l2 l2Var, int i17, p06.k annotations, n16.g name, f26.o0 outType, boolean z17, boolean z18, boolean z19, f26.o0 o0Var, o06.x1 source, yz5.a destructuringVariables) {
        super(containingDeclaration, l2Var, i17, annotations, name, outType, z17, z18, z19, o0Var, source);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containingDeclaration, "containingDeclaration");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(annotations, "annotations");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outType, "outType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(destructuringVariables, "destructuringVariables");
        this.f450051r = jz5.h.b(destructuringVariables);
    }

    @Override // r06.s1, o06.l2
    public o06.l2 u(o06.b newOwner, n16.g newName, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newOwner, "newOwner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newName, "newName");
        p06.k mo9601xa083c1ee = mo9601xa083c1ee();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo9601xa083c1ee, "<get-annotations>(...)");
        f26.o0 mo132802xfb85f7b0 = mo132802xfb85f7b0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo132802xfb85f7b0, "getType(...)");
        return new r06.r1(newOwner, null, i17, mo9601xa083c1ee, newName, mo132802xfb85f7b0, s0(), this.f450057n, this.f450058o, this.f450059p, o06.x1.f423537a, new r06.q1(this));
    }
}
