package mv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class h0 {

    /* renamed from: e, reason: collision with root package name */
    public static final mv.g0 f413042e;

    /* renamed from: f, reason: collision with root package name */
    public static final mv.h0 f413043f;

    /* renamed from: g, reason: collision with root package name */
    public static final mv.h0 f413044g;

    /* renamed from: h, reason: collision with root package name */
    public static final mv.h0 f413045h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ mv.h0[] f413046i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ rz5.a f413047m;

    /* renamed from: d, reason: collision with root package name */
    public final int f413048d;

    static {
        mv.h0 h0Var = new mv.h0("AUTO_BACKUP", 0, 1);
        f413043f = h0Var;
        mv.h0 h0Var2 = new mv.h0("BACKUP", 1, 2);
        f413044g = h0Var2;
        mv.h0 h0Var3 = new mv.h0("RESTORE", 2, 3);
        f413045h = h0Var3;
        mv.h0[] h0VarArr = {h0Var, h0Var2, h0Var3};
        f413046i = h0VarArr;
        f413047m = rz5.b.a(h0VarArr);
        f413042e = new mv.g0(null);
    }

    public h0(java.lang.String str, int i17, int i18) {
        this.f413048d = i18;
    }

    /* renamed from: valueOf */
    public static mv.h0 m148426xdce0328(java.lang.String str) {
        return (mv.h0) java.lang.Enum.valueOf(mv.h0.class, str);
    }

    /* renamed from: values */
    public static mv.h0[] m148427xcee59d22() {
        return (mv.h0[]) f413046i.clone();
    }
}
