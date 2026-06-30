package e26;

/* loaded from: classes16.dex */
public abstract class n extends e26.m {

    /* renamed from: g, reason: collision with root package name */
    public volatile e26.a0 f328559g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(e26.u uVar, yz5.a aVar) {
        super(uVar, aVar);
        if (uVar == null) {
            a(0);
            throw null;
        }
        if (aVar == null) {
            a(1);
            throw null;
        }
        this.f328559g = null;
    }

    public static /* synthetic */ void a(int i17) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (i17 != 1) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "computable";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
        objArr[2] = "<init>";
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // e26.m
    public final void d(java.lang.Object obj) {
        this.f328559g = new e26.a0(obj);
        try {
            e26.f fVar = (e26.f) this;
            if (obj != null) {
                fVar.f328552i.mo146xb9724478(obj);
            } else {
                e26.f.a(2);
                throw null;
            }
        } finally {
            this.f328559g = null;
        }
    }

    @Override // e26.m, yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        e26.a0 a0Var = this.f328559g;
        if (a0Var != null) {
            if (a0Var.f328547b == java.lang.Thread.currentThread()) {
                if (a0Var.f328547b == java.lang.Thread.currentThread()) {
                    return a0Var.f328546a;
                }
                throw new java.lang.IllegalStateException("No value in this thread (hasValue should be checked before)");
            }
        }
        return super.mo152xb9724478();
    }
}
