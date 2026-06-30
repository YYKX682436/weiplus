package e26;

/* loaded from: classes16.dex */
public abstract class i extends e26.q {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(e26.u uVar, java.util.concurrent.ConcurrentMap concurrentMap, e26.d dVar) {
        super(uVar, concurrentMap, new e26.h());
        if (uVar == null) {
            a(0);
            throw null;
        }
        if (concurrentMap != null) {
        } else {
            a(1);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i17) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (i17 == 1) {
            objArr[0] = "map";
        } else if (i17 != 2) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "computation";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
        if (i17 != 2) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "computeIfAbsent";
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }
}
