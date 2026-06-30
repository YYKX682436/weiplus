package e26;

/* loaded from: classes16.dex */
public class o extends e26.m implements e26.x {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(e26.u uVar, yz5.a aVar) {
        super(uVar, aVar);
        if (uVar == null) {
            a(0);
            throw null;
        }
        if (aVar != null) {
        } else {
            a(1);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i17) {
        java.lang.String str = i17 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        java.lang.Object[] objArr = new java.lang.Object[i17 != 2 ? 3 : 2];
        if (i17 == 1) {
            objArr[0] = "computable";
        } else if (i17 != 2) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
        }
        if (i17 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
        } else {
            objArr[1] = "invoke";
        }
        if (i17 != 2) {
            objArr[2] = "<init>";
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i17 == 2) {
            throw new java.lang.IllegalStateException(format);
        }
    }

    @Override // e26.m, yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object mo152xb9724478 = super.mo152xb9724478();
        if (mo152xb9724478 != null) {
            return mo152xb9724478;
        }
        a(2);
        throw null;
    }
}
