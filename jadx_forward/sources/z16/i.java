package z16;

/* loaded from: classes16.dex */
public class i extends z16.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(f26.o0 o0Var) {
        super(o0Var, null);
        if (o0Var == null) {
            b(0);
            throw null;
        }
        if (o0Var != null) {
        } else {
            b(1);
            throw null;
        }
    }

    public static /* synthetic */ void b(int i17) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (i17 != 2) {
            objArr[0] = "type";
        } else {
            objArr[0] = "newType";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/TransientReceiver";
        if (i17 != 2) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "replaceType";
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: toString */
    public java.lang.String m178319x9616526c() {
        return "{Transient} : " + mo150381xfb85f7b0();
    }
}
