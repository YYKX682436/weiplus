package o06;

/* loaded from: classes15.dex */
public final class z extends o06.r {
    public static /* synthetic */ void b(int i17) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (i17 != 1) {
            objArr[0] = "what";
        } else {
            objArr[0] = "from";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
        objArr[2] = "isVisible";
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // o06.g0
    public boolean a(z16.g gVar, o06.q qVar, o06.m mVar, boolean z17) {
        if (qVar == null) {
            b(0);
            throw null;
        }
        if (mVar == null) {
            b(1);
            throw null;
        }
        if (!r16.i.d(mVar).b0(r16.i.d(qVar))) {
            return false;
        }
        ((l26.x) o06.f0.f423487n).getClass();
        return true;
    }
}
