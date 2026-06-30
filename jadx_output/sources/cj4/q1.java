package cj4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class q1 {

    /* renamed from: d, reason: collision with root package name */
    public static final cj4.q1 f42020d;

    /* renamed from: e, reason: collision with root package name */
    public static final cj4.q1 f42021e;

    /* renamed from: f, reason: collision with root package name */
    public static final cj4.q1 f42022f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ cj4.q1[] f42023g;

    static {
        cj4.q1 q1Var = new cj4.q1("NONE", 0);
        f42020d = q1Var;
        cj4.q1 q1Var2 = new cj4.q1("OPENED", 1);
        f42021e = q1Var2;
        cj4.q1 q1Var3 = new cj4.q1("CLOSED", 2);
        f42022f = q1Var3;
        cj4.q1[] q1VarArr = {q1Var, q1Var2, q1Var3};
        f42023g = q1VarArr;
        rz5.b.a(q1VarArr);
    }

    public q1(java.lang.String str, int i17) {
    }

    public static cj4.q1 valueOf(java.lang.String str) {
        return (cj4.q1) java.lang.Enum.valueOf(cj4.q1.class, str);
    }

    public static cj4.q1[] values() {
        return (cj4.q1[]) f42023g.clone();
    }
}
