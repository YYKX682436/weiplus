package e26;

/* loaded from: classes16.dex */
public class f extends e26.p {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f328551h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f328552i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e26.u uVar, e26.u uVar2, yz5.a aVar, yz5.l lVar, yz5.l lVar2) {
        super(uVar2, aVar);
        this.f328551h = lVar;
        this.f328552i = lVar2;
    }

    public static /* synthetic */ void a(int i17) {
        java.lang.String str = i17 != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[i17 != 2 ? 2 : 3];
        if (i17 != 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        } else {
            objArr[0] = "value";
        }
        if (i17 != 2) {
            objArr[1] = "recursionDetected";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        }
        if (i17 == 2) {
            objArr[2] = "doPostCompute";
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i17 == 2) {
            throw new java.lang.IllegalArgumentException(format);
        }
    }

    @Override // e26.m
    public e26.t e(boolean z17) {
        yz5.l lVar = this.f328551h;
        if (lVar != null) {
            return new e26.t(lVar.mo146xb9724478(java.lang.Boolean.valueOf(z17)), false);
        }
        e26.t e17 = super.e(z17);
        if (e17 != null) {
            return e17;
        }
        a(0);
        throw null;
    }
}
