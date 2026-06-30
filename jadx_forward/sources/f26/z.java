package f26;

/* loaded from: classes16.dex */
public abstract class z {
    public static /* synthetic */ void a(int i17) {
        java.lang.String str = i17 != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        java.lang.Object[] objArr = new java.lang.Object[i17 != 4 ? 3 : 2];
        switch (i17) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i17 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i17 != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i17 == 4) {
            throw new java.lang.IllegalStateException(format);
        }
    }

    public static f26.v2 b(java.util.List list, f26.q2 q2Var, o06.m mVar, java.util.List list2) {
        if (list == null) {
            a(0);
            throw null;
        }
        if (q2Var == null) {
            a(1);
            throw null;
        }
        if (mVar == null) {
            a(2);
            throw null;
        }
        if (list2 == null) {
            a(3);
            throw null;
        }
        f26.v2 c17 = c(list, q2Var, mVar, list2, null);
        if (c17 != null) {
            return c17;
        }
        throw new java.lang.AssertionError("Substitution failed");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static f26.v2 c(java.util.List r19, f26.q2 r20, o06.m r21, java.util.List r22, boolean[] r23) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f26.z.c(java.util.List, f26.q2, o06.m, java.util.List, boolean[]):f26.v2");
    }
}
