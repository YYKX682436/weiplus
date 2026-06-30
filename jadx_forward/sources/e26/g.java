package e26;

/* loaded from: classes16.dex */
public class g extends e26.i implements e26.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e26.u uVar, java.util.concurrent.ConcurrentMap concurrentMap, e26.d dVar) {
        super(uVar, concurrentMap, null);
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
        java.lang.String str = i17 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        java.lang.Object[] objArr = new java.lang.Object[i17 != 3 ? 3 : 2];
        if (i17 == 1) {
            objArr[0] = "map";
        } else if (i17 == 2) {
            objArr[0] = "computation";
        } else if (i17 != 3) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
        }
        if (i17 != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
        } else {
            objArr[1] = "computeIfAbsent";
        }
        if (i17 == 2) {
            objArr[2] = "computeIfAbsent";
        } else if (i17 != 3) {
            objArr[2] = "<init>";
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i17 == 3) {
            throw new java.lang.IllegalStateException(format);
        }
    }

    public java.lang.Object g(java.lang.Object obj, yz5.a aVar) {
        if (aVar == null) {
            a(2);
            throw null;
        }
        if (aVar == null) {
            e26.i.a(2);
            throw null;
        }
        java.lang.Object mo146xb9724478 = mo146xb9724478(new e26.l(obj, aVar));
        if (mo146xb9724478 != null) {
            return mo146xb9724478;
        }
        a(3);
        throw null;
    }
}
