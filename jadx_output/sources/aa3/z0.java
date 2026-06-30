package aa3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class z0 {

    /* renamed from: d, reason: collision with root package name */
    public static final aa3.z0 f2630d;

    /* renamed from: e, reason: collision with root package name */
    public static final aa3.z0 f2631e;

    /* renamed from: f, reason: collision with root package name */
    public static final aa3.z0 f2632f;

    /* renamed from: g, reason: collision with root package name */
    public static final aa3.z0 f2633g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ aa3.z0[] f2634h;

    static {
        aa3.z0 z0Var = new aa3.z0("SM2_WITH_MD5", 0);
        f2630d = z0Var;
        aa3.z0 z0Var2 = new aa3.z0("SM2_WITH_PBKDF2", 1);
        f2631e = z0Var2;
        aa3.z0 z0Var3 = new aa3.z0("HKSOFT_MD5", 2);
        f2632f = z0Var3;
        aa3.z0 z0Var4 = new aa3.z0("HKSOFT_PBKDF2", 3);
        f2633g = z0Var4;
        aa3.z0[] z0VarArr = {z0Var, z0Var2, z0Var3, z0Var4};
        f2634h = z0VarArr;
        rz5.b.a(z0VarArr);
    }

    public z0(java.lang.String str, int i17) {
    }

    public static aa3.z0 valueOf(java.lang.String str) {
        return (aa3.z0) java.lang.Enum.valueOf(aa3.z0.class, str);
    }

    public static aa3.z0[] values() {
        return (aa3.z0[]) f2634h.clone();
    }
}
