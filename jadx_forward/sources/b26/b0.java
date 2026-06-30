package b26;

/* loaded from: classes15.dex */
public final class b0 implements b26.c0 {
    public static /* synthetic */ void c(int i17) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (i17 != 1) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "unresolvedSuperClasses";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
        if (i17 != 2) {
            objArr[2] = "reportIncompleteHierarchy";
        } else {
            objArr[2] = "reportCannotInferVisibility";
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // b26.c0
    public void a(o06.d dVar) {
        if (dVar != null) {
            return;
        }
        c(2);
        throw null;
    }

    @Override // b26.c0
    public void b(o06.g gVar, java.util.List list) {
        if (gVar == null) {
            c(0);
            throw null;
        }
        if (list != null) {
            return;
        }
        c(1);
        throw null;
    }
}
