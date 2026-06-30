package ae1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class q {

    /* renamed from: e, reason: collision with root package name */
    public static final ae1.p f84937e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ae1.q[] f84938f;

    /* renamed from: d, reason: collision with root package name */
    public final com.p3249xcbb51f6b.ndk.C28022x73d433fe.SM4Mode f84939d;

    static {
        ae1.q[] qVarArr = {new ae1.q("SM4_ECB", 0, 0, com.p3249xcbb51f6b.ndk.C28022x73d433fe.SM4Mode.SM4_ECB)};
        f84938f = qVarArr;
        rz5.b.a(qVarArr);
        f84937e = new ae1.p(null);
    }

    public q(java.lang.String str, int i17, int i18, com.p3249xcbb51f6b.ndk.C28022x73d433fe.SM4Mode sM4Mode) {
        this.f84939d = sM4Mode;
    }

    /* renamed from: valueOf */
    public static ae1.q m1171xdce0328(java.lang.String str) {
        return (ae1.q) java.lang.Enum.valueOf(ae1.q.class, str);
    }

    /* renamed from: values */
    public static ae1.q[] m1172xcee59d22() {
        return (ae1.q[]) f84938f.clone();
    }
}
