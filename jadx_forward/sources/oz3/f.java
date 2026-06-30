package oz3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final oz3.f f431798e;

    /* renamed from: f, reason: collision with root package name */
    public static final oz3.f f431799f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ oz3.f[] f431800g;

    /* renamed from: d, reason: collision with root package name */
    public final int f431801d;

    static {
        oz3.f fVar = new oz3.f("TypeAll", 0, 16777215);
        f431798e = fVar;
        oz3.f fVar2 = new oz3.f("TypeNormal", 1, 1);
        oz3.f fVar3 = new oz3.f("TypePay", 2, 2);
        f431799f = fVar3;
        oz3.f[] fVarArr = {fVar, fVar2, fVar3};
        f431800g = fVarArr;
        rz5.b.a(fVarArr);
    }

    public f(java.lang.String str, int i17, int i18) {
        this.f431801d = i18;
    }

    /* renamed from: valueOf */
    public static oz3.f m157493xdce0328(java.lang.String str) {
        return (oz3.f) java.lang.Enum.valueOf(oz3.f.class, str);
    }

    /* renamed from: values */
    public static oz3.f[] m157494xcee59d22() {
        return (oz3.f[]) f431800g.clone();
    }
}
