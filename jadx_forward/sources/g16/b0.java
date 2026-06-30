package g16;

/* loaded from: classes15.dex */
public final class b0 implements d26.z {

    /* renamed from: b, reason: collision with root package name */
    public final w16.d f349126b;

    /* renamed from: c, reason: collision with root package name */
    public final w16.d f349127c;

    /* renamed from: d, reason: collision with root package name */
    public final g16.q0 f349128d;

    public b0(g16.q0 kotlinClass, i16.o0 packageProto, k16.g nameResolver, b26.f0 f0Var, boolean z17, d26.y abiStability) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kotlinClass, "kotlinClass");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(packageProto, "packageProto");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameResolver, "nameResolver");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(abiStability, "abiStability");
        t06.g gVar = (t06.g) kotlinClass;
        w16.d b17 = w16.d.b(gVar.a());
        h16.c cVar = gVar.f496070b;
        cVar.getClass();
        w16.d dVar = null;
        java.lang.String str = cVar.f359762a == h16.b.f359759o ? cVar.f359767f : null;
        if (str != null) {
            if (str.length() > 0) {
                dVar = w16.d.d(str);
            }
        }
        this.f349126b = b17;
        this.f349127c = dVar;
        this.f349128d = kotlinClass;
        p16.u packageModuleName = l16.r.f396637m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(packageModuleName, "packageModuleName");
        java.lang.Integer num = (java.lang.Integer) k16.i.a(packageProto, packageModuleName);
        if (num != null) {
            nameResolver.mo141776x2fec8307(num.intValue());
        }
    }

    @Override // d26.z
    public java.lang.String a() {
        return "Class '" + c().b().b() + '\'';
    }

    @Override // o06.x1
    public o06.z1 b() {
        return o06.z1.f423546a;
    }

    public final n16.b c() {
        n16.c cVar;
        w16.d dVar = this.f349126b;
        java.lang.String str = dVar.f523785a;
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf == -1) {
            cVar = n16.c.f415692c;
            if (cVar == null) {
                w16.d.a(7);
                throw null;
            }
        } else {
            cVar = new n16.c(str.substring(0, lastIndexOf).replace('/', '.'));
        }
        java.lang.String e17 = dVar.e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getInternalName(...)");
        return new n16.b(cVar, n16.g.k(r26.n0.o0(e17, '/', e17)));
    }

    /* renamed from: toString */
    public java.lang.String m130645x9616526c() {
        return g16.b0.class.getSimpleName() + ": " + this.f349126b;
    }
}
