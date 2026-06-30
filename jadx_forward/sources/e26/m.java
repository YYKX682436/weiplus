package e26;

/* loaded from: classes16.dex */
public class m implements e26.y {

    /* renamed from: d, reason: collision with root package name */
    public final e26.u f328556d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.a f328557e;

    /* renamed from: f, reason: collision with root package name */
    public volatile java.lang.Object f328558f;

    public m(e26.u uVar, yz5.a aVar) {
        if (uVar == null) {
            a(0);
            throw null;
        }
        if (aVar == null) {
            a(1);
            throw null;
        }
        this.f328558f = e26.s.NOT_COMPUTED;
        this.f328556d = uVar;
        this.f328557e = aVar;
    }

    public static /* synthetic */ void a(int i17) {
        java.lang.String str = (i17 == 2 || i17 == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i17 == 2 || i17 == 3) ? 2 : 3];
        if (i17 == 1) {
            objArr[0] = "computable";
        } else if (i17 == 2 || i17 == 3) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[0] = "storageManager";
        }
        if (i17 == 2) {
            objArr[1] = "recursionDetected";
        } else if (i17 != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[1] = "renderDebugInformation";
        }
        if (i17 != 2 && i17 != 3) {
            objArr[2] = "<init>";
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i17 != 2 && i17 != 3) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }

    public void d(java.lang.Object obj) {
    }

    public e26.t e(boolean z17) {
        e26.t f17 = this.f328556d.f("in a lazy value", null);
        if (f17 != null) {
            return f17;
        }
        a(2);
        throw null;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object obj = this.f328558f;
        if (!(obj instanceof e26.s)) {
            o26.x.a(obj);
            return obj;
        }
        this.f328556d.f328571a.mo126820x32c52b();
        try {
            java.lang.Object obj2 = this.f328558f;
            if (obj2 instanceof e26.s) {
                e26.s sVar = e26.s.COMPUTING;
                e26.s sVar2 = e26.s.RECURSION_WAS_DETECTED;
                if (obj2 == sVar) {
                    this.f328558f = sVar2;
                    e26.t e17 = e(true);
                    if (!e17.f328568b) {
                        obj2 = e17.f328567a;
                    }
                }
                if (obj2 == sVar2) {
                    e26.t e18 = e(false);
                    if (!e18.f328568b) {
                        obj2 = e18.f328567a;
                    }
                }
                this.f328558f = sVar;
                try {
                    obj2 = this.f328557e.mo152xb9724478();
                    d(obj2);
                    this.f328558f = obj2;
                } catch (java.lang.Throwable th6) {
                    if (o26.i.a(th6)) {
                        this.f328558f = e26.s.NOT_COMPUTED;
                        throw th6;
                    }
                    if (this.f328558f == sVar) {
                        this.f328558f = new o26.w(th6, null);
                    }
                    ((e26.j) this.f328556d.f328572b).a(th6);
                    throw null;
                }
            } else {
                o26.x.a(obj2);
            }
            return obj2;
        } finally {
            this.f328556d.f328571a.mo126821xcde7df44();
        }
    }
}
