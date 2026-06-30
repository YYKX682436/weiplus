package g16;

/* loaded from: classes15.dex */
public abstract class m {
    public static final g16.u0 a(i16.u0 proto, k16.g nameResolver, k16.k typeTable, boolean z17, boolean z18, boolean z19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(proto, "proto");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameResolver, "nameResolver");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeTable, "typeTable");
        p16.u propertySignature = l16.r.f396628d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(propertySignature, "propertySignature");
        l16.j jVar = (l16.j) k16.i.a(proto, propertySignature);
        if (jVar == null) {
            return null;
        }
        if (z17) {
            m16.d b17 = m16.j.f404432a.b(proto, nameResolver, typeTable, z19);
            if (b17 == null) {
                return null;
            }
            return g16.u0.f349199b.a(b17);
        }
        if (z18) {
            if ((jVar.f396580e & 2) == 2) {
                l16.g gVar = jVar.f396582g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar, "getSyntheticMethod(...)");
                java.lang.String name = nameResolver.mo141776x2fec8307(gVar.f396567f);
                java.lang.String desc = nameResolver.mo141776x2fec8307(gVar.f396568g);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
                return new g16.u0(name.concat(desc), null);
            }
        }
        return null;
    }

    public static /* synthetic */ g16.u0 b(i16.u0 u0Var, k16.g gVar, k16.k kVar, boolean z17, boolean z18, boolean z19, int i17, java.lang.Object obj) {
        boolean z27 = (i17 & 8) != 0 ? false : z17;
        boolean z28 = (i17 & 16) != 0 ? false : z18;
        if ((i17 & 32) != 0) {
            z19 = true;
        }
        return a(u0Var, gVar, kVar, z27, z28, z19);
    }
}
