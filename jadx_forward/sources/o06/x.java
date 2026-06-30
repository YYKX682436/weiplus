package o06;

/* loaded from: classes16.dex */
public final class x extends o06.r {
    public static /* synthetic */ void b(int i17) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (i17 != 1) {
            objArr[0] = "what";
        } else {
            objArr[0] = "from";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
        objArr[2] = "isVisible";
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // o06.g0
    public boolean a(z16.g gVar, o06.q qVar, o06.m mVar, boolean z17) {
        o06.m i17;
        if (qVar == null) {
            b(0);
            throw null;
        }
        if (mVar == null) {
            b(1);
            throw null;
        }
        if (o06.f0.f423474a.a(gVar, qVar, mVar, z17)) {
            if (gVar == o06.f0.f423485l) {
                return true;
            }
            if (gVar != o06.f0.f423484k && (i17 = r16.i.i(qVar, o06.g.class)) != null && (gVar instanceof z16.h)) {
                return ((z16.e) ((z16.h) gVar)).f550952a.a().equals(i17.a());
            }
        }
        return false;
    }
}
