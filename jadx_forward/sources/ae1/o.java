package ae1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class o {

    /* renamed from: g, reason: collision with root package name */
    public static final ae1.n f84932g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ ae1.o[] f84933h;

    /* renamed from: d, reason: collision with root package name */
    public final int f84934d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p3249xcbb51f6b.ndk.C28022x73d433fe.SM2SignMode f84935e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p3249xcbb51f6b.tsm.C28043xc4c57f6b.SM2SignFormat f84936f;

    static {
        ae1.o[] oVarArr = {new ae1.o("SignMode_RS_ASN1", 0, 0, com.p3249xcbb51f6b.ndk.C28022x73d433fe.SM2SignMode.SM2SignMode_RS_ASN1, com.p3249xcbb51f6b.tsm.C28043xc4c57f6b.SM2SignFormat.kSM2SignRSASN1Encode), new ae1.o("SignMode_RS", 1, 1, com.p3249xcbb51f6b.ndk.C28022x73d433fe.SM2SignMode.SM2SignMode_RS, com.p3249xcbb51f6b.tsm.C28043xc4c57f6b.SM2SignFormat.kSM2SignRSRaw)};
        f84933h = oVarArr;
        rz5.b.a(oVarArr);
        f84932g = new ae1.n(null);
    }

    public o(java.lang.String str, int i17, int i18, com.p3249xcbb51f6b.ndk.C28022x73d433fe.SM2SignMode sM2SignMode, com.p3249xcbb51f6b.tsm.C28043xc4c57f6b.SM2SignFormat sM2SignFormat) {
        this.f84934d = i18;
        this.f84935e = sM2SignMode;
        this.f84936f = sM2SignFormat;
    }

    /* renamed from: valueOf */
    public static ae1.o m1168xdce0328(java.lang.String str) {
        return (ae1.o) java.lang.Enum.valueOf(ae1.o.class, str);
    }

    /* renamed from: values */
    public static ae1.o[] m1169xcee59d22() {
        return (ae1.o[]) f84933h.clone();
    }
}
