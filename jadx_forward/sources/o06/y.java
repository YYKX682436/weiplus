package o06;

/* loaded from: classes15.dex */
public final class y extends o06.r {
    public static /* synthetic */ void b(int i17) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (i17 == 1) {
            objArr[0] = "from";
        } else if (i17 == 2) {
            objArr[0] = "whatDeclaration";
        } else if (i17 != 3) {
            objArr[0] = "what";
        } else {
            objArr[0] = "fromClass";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
        if (i17 == 2 || i17 == 3) {
            objArr[2] = "doesReceiverFitForProtectedVisibility";
        } else {
            objArr[2] = "isVisible";
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // o06.g0
    public boolean a(z16.g gVar, o06.q qVar, o06.m mVar, boolean z17) {
        o06.g gVar2;
        boolean z18 = false;
        if (qVar == null) {
            b(0);
            throw null;
        }
        if (mVar == null) {
            b(1);
            throw null;
        }
        o06.g gVar3 = (o06.g) r16.i.i(qVar, o06.g.class);
        o06.g gVar4 = (o06.g) r16.i.j(mVar, o06.g.class, false);
        if (gVar4 == null) {
            return false;
        }
        if (gVar3 != null && r16.i.m(gVar3) && (gVar2 = (o06.g) r16.i.i(gVar3, o06.g.class)) != null && r16.i.s(gVar4, gVar2)) {
            return true;
        }
        o06.q w17 = r16.i.w(qVar);
        o06.g gVar5 = (o06.g) r16.i.i(w17, o06.g.class);
        if (gVar5 == null) {
            return false;
        }
        if (r16.i.s(gVar4, gVar5)) {
            if (w17 == null) {
                b(2);
                throw null;
            }
            if (gVar != o06.f0.f423486m) {
                if ((w17 instanceof o06.d) && !(w17 instanceof o06.l) && gVar != o06.f0.f423485l) {
                    if (gVar != o06.f0.f423484k && gVar != null) {
                        f26.o0 mo150381xfb85f7b0 = gVar.mo150381xfb85f7b0();
                        if (!r16.i.t(mo150381xfb85f7b0, gVar4)) {
                            mo150381xfb85f7b0.z0();
                        }
                    }
                }
                z18 = true;
            }
            if (z18) {
                return true;
            }
        }
        return a(gVar, qVar, gVar4.e(), z17);
    }
}
