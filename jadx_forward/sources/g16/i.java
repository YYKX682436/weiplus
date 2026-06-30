package g16;

/* loaded from: classes15.dex */
public final class i {
    public i(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final g16.q0 a(b26.x0 container, boolean z17, boolean z18, java.lang.Boolean bool, boolean z19, g16.k0 kotlinClassFinder, m16.g jvmMetadataVersion) {
        b26.v0 v0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kotlinClassFinder, "kotlinClassFinder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jvmMetadataVersion, "jvmMetadataVersion");
        i16.n nVar = i16.n.INTERFACE;
        o06.x1 x1Var = container.f99072c;
        if (z17) {
            if (bool == null) {
                throw new java.lang.IllegalStateException(("isConst should not be null for property (container=" + container + ')').toString());
            }
            if (container instanceof b26.v0) {
                b26.v0 v0Var2 = (b26.v0) container;
                if (v0Var2.f99065g == nVar) {
                    return g16.l0.a(kotlinClassFinder, v0Var2.f99064f.d(n16.g.k("DefaultImpls")), jvmMetadataVersion);
                }
            }
            if (bool.booleanValue() && (container instanceof b26.w0)) {
                g16.b0 b0Var = x1Var instanceof g16.b0 ? (g16.b0) x1Var : null;
                w16.d dVar = b0Var != null ? b0Var.f349127c : null;
                if (dVar != null) {
                    java.lang.String e17 = dVar.e();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getInternalName(...)");
                    return g16.l0.a(kotlinClassFinder, n16.b.l(new n16.c(r26.i0.u(e17, '/', '.', false, 4, null))), jvmMetadataVersion);
                }
            }
        }
        if (z18 && (container instanceof b26.v0)) {
            b26.v0 v0Var3 = (b26.v0) container;
            if (v0Var3.f99065g == i16.n.COMPANION_OBJECT && (v0Var = v0Var3.f99063e) != null) {
                i16.n nVar2 = i16.n.CLASS;
                i16.n nVar3 = v0Var.f99065g;
                if (nVar3 == nVar2 || nVar3 == i16.n.ENUM_CLASS || (z19 && (nVar3 == nVar || nVar3 == i16.n.ANNOTATION_CLASS))) {
                    o06.x1 x1Var2 = v0Var.f99072c;
                    g16.s0 s0Var = x1Var2 instanceof g16.s0 ? (g16.s0) x1Var2 : null;
                    if (s0Var != null) {
                        return s0Var.f349194b;
                    }
                    return null;
                }
            }
        }
        if (!(container instanceof b26.w0) || !(x1Var instanceof g16.b0)) {
            return null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(x1Var, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
        g16.b0 b0Var2 = (g16.b0) x1Var;
        g16.q0 q0Var = b0Var2.f349128d;
        return q0Var == null ? g16.l0.a(kotlinClassFinder, b0Var2.c(), jvmMetadataVersion) : q0Var;
    }
}
