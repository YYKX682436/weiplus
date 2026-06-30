package bi4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class f1 {

    /* renamed from: d, reason: collision with root package name */
    public static final bi4.f1 f21041d;

    /* renamed from: e, reason: collision with root package name */
    public static final bi4.f1 f21042e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ bi4.f1[] f21043f;

    static {
        bi4.f1 f1Var = new bi4.f1("FROM_TOP", 0);
        f21041d = f1Var;
        bi4.f1 f1Var2 = new bi4.f1("FROM_CENTER", 1);
        f21042e = f1Var2;
        bi4.f1[] f1VarArr = {f1Var, f1Var2};
        f21043f = f1VarArr;
        rz5.b.a(f1VarArr);
    }

    public f1(java.lang.String str, int i17) {
    }

    public static bi4.f1 valueOf(java.lang.String str) {
        return (bi4.f1) java.lang.Enum.valueOf(bi4.f1.class, str);
    }

    public static bi4.f1[] values() {
        return (bi4.f1[]) f21043f.clone();
    }
}
