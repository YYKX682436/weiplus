package aa3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class z0 {

    /* renamed from: d, reason: collision with root package name */
    public static final aa3.z0 f84163d;

    /* renamed from: e, reason: collision with root package name */
    public static final aa3.z0 f84164e;

    /* renamed from: f, reason: collision with root package name */
    public static final aa3.z0 f84165f;

    /* renamed from: g, reason: collision with root package name */
    public static final aa3.z0 f84166g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ aa3.z0[] f84167h;

    static {
        aa3.z0 z0Var = new aa3.z0("SM2_WITH_MD5", 0);
        f84163d = z0Var;
        aa3.z0 z0Var2 = new aa3.z0("SM2_WITH_PBKDF2", 1);
        f84164e = z0Var2;
        aa3.z0 z0Var3 = new aa3.z0("HKSOFT_MD5", 2);
        f84165f = z0Var3;
        aa3.z0 z0Var4 = new aa3.z0("HKSOFT_PBKDF2", 3);
        f84166g = z0Var4;
        aa3.z0[] z0VarArr = {z0Var, z0Var2, z0Var3, z0Var4};
        f84167h = z0VarArr;
        rz5.b.a(z0VarArr);
    }

    public z0(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static aa3.z0 m943xdce0328(java.lang.String str) {
        return (aa3.z0) java.lang.Enum.valueOf(aa3.z0.class, str);
    }

    /* renamed from: values */
    public static aa3.z0[] m944xcee59d22() {
        return (aa3.z0[]) f84167h.clone();
    }
}
