package bs2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static final bs2.n f23896d;

    /* renamed from: e, reason: collision with root package name */
    public static final bs2.n f23897e;

    /* renamed from: f, reason: collision with root package name */
    public static final bs2.n f23898f;

    /* renamed from: g, reason: collision with root package name */
    public static final bs2.n f23899g;

    /* renamed from: h, reason: collision with root package name */
    public static final bs2.n f23900h;

    /* renamed from: i, reason: collision with root package name */
    public static final bs2.n f23901i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ bs2.n[] f23902m;

    static {
        bs2.n nVar = new bs2.n("NormalEnter", 0);
        f23896d = nVar;
        bs2.n nVar2 = new bs2.n("Preload", 1);
        f23897e = nVar2;
        bs2.n nVar3 = new bs2.n("UseCache", 2);
        f23898f = nVar3;
        bs2.n nVar4 = new bs2.n("RecycleCache", 3);
        f23899g = nVar4;
        bs2.n nVar5 = new bs2.n("CancelTask", 4);
        f23900h = nVar5;
        bs2.n nVar6 = new bs2.n("LivePreload", 5);
        bs2.n nVar7 = new bs2.n("LiveUseCache", 6);
        f23901i = nVar7;
        bs2.n[] nVarArr = {nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7};
        f23902m = nVarArr;
        rz5.b.a(nVarArr);
    }

    public n(java.lang.String str, int i17) {
    }

    public static bs2.n valueOf(java.lang.String str) {
        return (bs2.n) java.lang.Enum.valueOf(bs2.n.class, str);
    }

    public static bs2.n[] values() {
        return (bs2.n[]) f23902m.clone();
    }
}
