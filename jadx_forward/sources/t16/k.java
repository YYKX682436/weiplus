package t16;

/* loaded from: classes15.dex */
public final class k extends t16.g {

    /* renamed from: b, reason: collision with root package name */
    public final n16.b f496149b;

    /* renamed from: c, reason: collision with root package name */
    public final n16.g f496150c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n16.b enumClassId, n16.g enumEntryName) {
        super(new jz5.l(enumClassId, enumEntryName));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enumClassId, "enumClassId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enumEntryName, "enumEntryName");
        this.f496149b = enumClassId;
        this.f496150c = enumEntryName;
    }

    @Override // t16.g
    public f26.o0 a(o06.v0 module) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(module, "module");
        n16.b bVar = this.f496149b;
        o06.g a17 = o06.l0.a(module, bVar);
        f26.z0 z0Var = null;
        if (a17 != null) {
            int i17 = r16.i.f450191a;
            if (!r16.i.o(a17, o06.h.f423495f)) {
                a17 = null;
            }
            if (a17 != null) {
                z0Var = a17.k();
            }
        }
        if (z0Var != null) {
            return z0Var;
        }
        h26.l lVar = h26.l.G;
        java.lang.String m148882x9616526c = bVar.m148882x9616526c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m148882x9616526c, "toString(...)");
        java.lang.String str = this.f496150c.f415702d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "toString(...)");
        return h26.m.c(lVar, m148882x9616526c, str);
    }

    @Override // t16.g
    /* renamed from: toString */
    public java.lang.String mo165625x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f496149b.j());
        sb6.append('.');
        sb6.append(this.f496150c);
        return sb6.toString();
    }
}
