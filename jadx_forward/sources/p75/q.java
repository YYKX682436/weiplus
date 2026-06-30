package p75;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: d, reason: collision with root package name */
    public static final p75.q f434221d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ p75.q[] f434222e;

    static {
        p75.q qVar = new p75.q("InnerJoin", 0);
        f434221d = qVar;
        p75.q[] qVarArr = {qVar, new p75.q("LeftJoin", 1), new p75.q("RightJoin", 2)};
        f434222e = qVarArr;
        rz5.b.a(qVarArr);
    }

    public q(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static p75.q m157958xdce0328(java.lang.String str) {
        return (p75.q) java.lang.Enum.valueOf(p75.q.class, str);
    }

    /* renamed from: values */
    public static p75.q[] m157959xcee59d22() {
        return (p75.q[]) f434222e.clone();
    }
}
