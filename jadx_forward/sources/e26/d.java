package e26;

/* loaded from: classes16.dex */
public final class d extends e26.u {
    public d(java.lang.String str, e26.k kVar, e26.z zVar) {
        super(str, kVar, zVar);
    }

    @Override // e26.u
    public e26.t f(java.lang.String str, java.lang.Object obj) {
        if (str != null) {
            return new e26.t(null, true);
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", ya.b.f77502x92235c1b, "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1", "recursionDetectedDefault"));
    }
}
