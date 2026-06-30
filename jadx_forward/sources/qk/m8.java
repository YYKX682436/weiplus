package qk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class m8 {

    /* renamed from: d, reason: collision with root package name */
    public static final qk.m8 f445783d;

    /* renamed from: e, reason: collision with root package name */
    public static final qk.m8 f445784e;

    /* renamed from: f, reason: collision with root package name */
    public static final qk.m8 f445785f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ qk.m8[] f445786g;

    static {
        qk.m8 m8Var = new qk.m8("NORMAL", 0);
        f445783d = m8Var;
        qk.m8 m8Var2 = new qk.m8("LOADING", 1);
        f445784e = m8Var2;
        qk.m8 m8Var3 = new qk.m8("PLAYING", 2);
        f445785f = m8Var3;
        qk.m8[] m8VarArr = {m8Var, m8Var2, m8Var3};
        f445786g = m8VarArr;
        rz5.b.a(m8VarArr);
    }

    public m8(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static qk.m8 m160377xdce0328(java.lang.String str) {
        return (qk.m8) java.lang.Enum.valueOf(qk.m8.class, str);
    }

    /* renamed from: values */
    public static qk.m8[] m160378xcee59d22() {
        return (qk.m8[]) f445786g.clone();
    }
}
