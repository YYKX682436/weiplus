package qo1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class d1 {

    /* renamed from: d, reason: collision with root package name */
    public static final qo1.d1 f446996d;

    /* renamed from: e, reason: collision with root package name */
    public static final qo1.d1 f446997e;

    /* renamed from: f, reason: collision with root package name */
    public static final qo1.d1 f446998f;

    /* renamed from: g, reason: collision with root package name */
    public static final qo1.d1 f446999g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ qo1.d1[] f447000h;

    static {
        qo1.d1 d1Var = new qo1.d1("SUCCESS", 0);
        f446996d = d1Var;
        qo1.d1 d1Var2 = new qo1.d1("PACKAGE_BUSY", 1);
        f446997e = d1Var2;
        qo1.d1 d1Var3 = new qo1.d1("DEVICE_BUSY_RECOVER", 2);
        f446998f = d1Var3;
        qo1.d1 d1Var4 = new qo1.d1("DEVICE_BUSY_BACKUP", 3);
        f446999g = d1Var4;
        qo1.d1[] d1VarArr = {d1Var, d1Var2, d1Var3, d1Var4};
        f447000h = d1VarArr;
        rz5.b.a(d1VarArr);
    }

    public d1(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static qo1.d1 m160573xdce0328(java.lang.String str) {
        return (qo1.d1) java.lang.Enum.valueOf(qo1.d1.class, str);
    }

    /* renamed from: values */
    public static qo1.d1[] m160574xcee59d22() {
        return (qo1.d1[]) f447000h.clone();
    }
}
