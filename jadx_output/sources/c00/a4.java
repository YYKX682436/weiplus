package c00;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class a4 {

    /* renamed from: e, reason: collision with root package name */
    public static final c00.a4 f36950e;

    /* renamed from: f, reason: collision with root package name */
    public static final c00.a4 f36951f;

    /* renamed from: g, reason: collision with root package name */
    public static final c00.a4 f36952g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ c00.a4[] f36953h;

    /* renamed from: d, reason: collision with root package name */
    public final int f36954d;

    static {
        c00.a4 a4Var = new c00.a4("ServerRevoke", 0, 1);
        f36950e = a4Var;
        c00.a4 a4Var2 = new c00.a4("Replace", 1, 2);
        f36951f = a4Var2;
        c00.a4 a4Var3 = new c00.a4("Expired", 2, 3);
        f36952g = a4Var3;
        c00.a4[] a4VarArr = {a4Var, a4Var2, a4Var3};
        f36953h = a4VarArr;
        rz5.b.a(a4VarArr);
    }

    public a4(java.lang.String str, int i17, int i18) {
        this.f36954d = i18;
    }

    public static c00.a4 valueOf(java.lang.String str) {
        return (c00.a4) java.lang.Enum.valueOf(c00.a4.class, str);
    }

    public static c00.a4[] values() {
        return (c00.a4[]) f36953h.clone();
    }
}
