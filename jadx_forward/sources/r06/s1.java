package r06;

/* loaded from: classes16.dex */
public class s1 extends r06.t1 implements o06.l2 {

    /* renamed from: i, reason: collision with root package name */
    public final int f450055i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f450056m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f450057n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f450058o;

    /* renamed from: p, reason: collision with root package name */
    public final f26.o0 f450059p;

    /* renamed from: q, reason: collision with root package name */
    public final o06.l2 f450060q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(o06.b containingDeclaration, o06.l2 l2Var, int i17, p06.k annotations, n16.g name, f26.o0 outType, boolean z17, boolean z18, boolean z19, f26.o0 o0Var, o06.x1 source) {
        super(containingDeclaration, annotations, name, outType, source);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containingDeclaration, "containingDeclaration");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(annotations, "annotations");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outType, "outType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        this.f450055i = i17;
        this.f450056m = z17;
        this.f450057n = z18;
        this.f450058o = z19;
        this.f450059p = o0Var;
        this.f450060q = l2Var == null ? this : l2Var;
    }

    @Override // o06.a2
    public o06.n d(f26.v2 substitutor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(substitutor, "substitutor");
        if (substitutor.h()) {
            return this;
        }
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // o06.q, o06.r0
    /* renamed from: getVisibility */
    public o06.g0 mo9617x61f71b08() {
        o06.g0 LOCAL = o06.f0.f423479f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(LOCAL, "LOCAL");
        return LOCAL;
    }

    @Override // o06.b
    public java.util.Collection i() {
        java.util.Collection i17 = e().i();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(i17, "getOverriddenDescriptors(...)");
        java.util.Collection collection = i17;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(collection, 10));
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((o06.l2) ((o06.b) it.next()).W().get(this.f450055i));
        }
        return arrayList;
    }

    @Override // o06.m2
    public /* bridge */ /* synthetic */ t16.g n0() {
        return null;
    }

    public boolean s0() {
        if (!this.f450056m) {
            return false;
        }
        o06.c j17 = ((o06.d) e()).j();
        j17.getClass();
        return j17 != o06.c.FAKE_OVERRIDE;
    }

    public o06.l2 u(o06.b newOwner, n16.g newName, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newOwner, "newOwner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newName, "newName");
        p06.k mo9601xa083c1ee = mo9601xa083c1ee();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo9601xa083c1ee, "<get-annotations>(...)");
        f26.o0 mo132802xfb85f7b0 = mo132802xfb85f7b0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo132802xfb85f7b0, "getType(...)");
        return new r06.s1(newOwner, null, i17, mo9601xa083c1ee, newName, mo132802xfb85f7b0, s0(), this.f450057n, this.f450058o, this.f450059p, o06.x1.f423537a);
    }

    @Override // r06.w, o06.m
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public o06.b e() {
        o06.m e17 = super.e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(e17, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (o06.b) e17;
    }

    @Override // o06.m2
    public boolean v() {
        return false;
    }

    @Override // r06.w
    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    public o06.l2 a() {
        o06.l2 l2Var = this.f450060q;
        return l2Var == this ? this : ((r06.s1) l2Var).a();
    }

    @Override // o06.m
    public java.lang.Object w(o06.o visitor, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(visitor, "visitor");
        return visitor.a(this, obj);
    }
}
