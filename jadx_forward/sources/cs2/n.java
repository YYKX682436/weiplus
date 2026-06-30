package cs2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static final cs2.n f303612d;

    /* renamed from: e, reason: collision with root package name */
    public static final cs2.n f303613e;

    /* renamed from: f, reason: collision with root package name */
    public static final cs2.n f303614f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ cs2.n[] f303615g;

    static {
        cs2.n nVar = new cs2.n("IDLE", 0);
        f303612d = nVar;
        cs2.n nVar2 = new cs2.n("ONE", 1);
        f303613e = nVar2;
        cs2.n nVar3 = new cs2.n("TWO", 2);
        f303614f = nVar3;
        cs2.n[] nVarArr = {nVar, nVar2, nVar3};
        f303615g = nVarArr;
        rz5.b.a(nVarArr);
    }

    public n(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static cs2.n m122610xdce0328(java.lang.String str) {
        return (cs2.n) java.lang.Enum.valueOf(cs2.n.class, str);
    }

    /* renamed from: values */
    public static cs2.n[] m122611xcee59d22() {
        return (cs2.n[]) f303615g.clone();
    }
}
