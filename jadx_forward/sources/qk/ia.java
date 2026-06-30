package qk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class ia {

    /* renamed from: e, reason: collision with root package name */
    public static final qk.ha f445702e;

    /* renamed from: f, reason: collision with root package name */
    public static final qk.ia f445703f;

    /* renamed from: g, reason: collision with root package name */
    public static final qk.ia f445704g;

    /* renamed from: h, reason: collision with root package name */
    public static final qk.ia f445705h;

    /* renamed from: i, reason: collision with root package name */
    public static final qk.ia f445706i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ qk.ia[] f445707m;

    /* renamed from: d, reason: collision with root package name */
    public final int f445708d;

    static {
        qk.ia iaVar = new qk.ia("Idle", 0, 0);
        f445703f = iaVar;
        qk.ia iaVar2 = new qk.ia("Playing", 1, 1);
        f445704g = iaVar2;
        qk.ia iaVar3 = new qk.ia("Loading", 2, 2);
        f445705h = iaVar3;
        qk.ia iaVar4 = new qk.ia("Paused", 3, 3);
        f445706i = iaVar4;
        qk.ia[] iaVarArr = {iaVar, iaVar2, iaVar3, iaVar4};
        f445707m = iaVarArr;
        rz5.b.a(iaVarArr);
        f445702e = new qk.ha(null);
    }

    public ia(java.lang.String str, int i17, int i18) {
        this.f445708d = i18;
    }

    /* renamed from: valueOf */
    public static qk.ia m160342xdce0328(java.lang.String str) {
        return (qk.ia) java.lang.Enum.valueOf(qk.ia.class, str);
    }

    /* renamed from: values */
    public static qk.ia[] m160343xcee59d22() {
        return (qk.ia[]) f445707m.clone();
    }

    public final boolean h() {
        return this == f445704g || this == f445705h;
    }
}
