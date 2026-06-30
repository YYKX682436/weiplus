package e26;

/* loaded from: classes16.dex */
public class r extends e26.q implements e26.v {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(e26.u uVar, java.util.concurrent.ConcurrentMap concurrentMap, yz5.l lVar) {
        super(uVar, concurrentMap, lVar);
        if (uVar == null) {
            a(0);
            throw null;
        }
        if (concurrentMap == null) {
            a(1);
            throw null;
        }
        if (lVar != null) {
        } else {
            a(2);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i17) {
        java.lang.String str = i17 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        java.lang.Object[] objArr = new java.lang.Object[i17 != 3 ? 3 : 2];
        if (i17 == 1) {
            objArr[0] = "map";
        } else if (i17 == 2) {
            objArr[0] = "compute";
        } else if (i17 != 3) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
        }
        if (i17 != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
        } else {
            objArr[1] = "invoke";
        }
        if (i17 != 3) {
            objArr[2] = "<init>";
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i17 == 3) {
            throw new java.lang.IllegalStateException(format);
        }
    }

    @Override // e26.q, yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Object mo146xb9724478 = super.mo146xb9724478(obj);
        if (mo146xb9724478 != null) {
            return mo146xb9724478;
        }
        a(3);
        throw null;
    }
}
