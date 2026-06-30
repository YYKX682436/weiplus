package r06;

/* loaded from: classes16.dex */
public abstract class z0 extends r06.w implements o06.d1 {

    /* renamed from: h, reason: collision with root package name */
    public final n16.c f450099h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f450100i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(o06.v0 module, n16.c fqName) {
        super(module, p06.i.f432298a, fqName.g(), o06.x1.f423537a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(module, "module");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        int i17 = p06.k.Z0;
        this.f450099h = fqName;
        this.f450100i = "package " + fqName + " of " + module;
    }

    @Override // r06.w, o06.p
    /* renamed from: getSource */
    public o06.x1 mo9602x2fa78b11() {
        return o06.x1.f423537a;
    }

    @Override // r06.w, o06.m
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public o06.v0 e() {
        o06.m e17 = super.e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(e17, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (o06.v0) e17;
    }

    @Override // r06.v
    /* renamed from: toString */
    public java.lang.String mo9603x9616526c() {
        return this.f450100i;
    }

    @Override // o06.m
    public java.lang.Object w(o06.o visitor, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(visitor, "visitor");
        return visitor.b(this, obj);
    }
}
