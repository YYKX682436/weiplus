package ae1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class m {

    /* renamed from: f, reason: collision with root package name */
    public static final ae1.l f84928f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ae1.m[] f84929g;

    /* renamed from: d, reason: collision with root package name */
    public final int f84930d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p3249xcbb51f6b.tsm.C28043xc4c57f6b.TSMStorageSM2KeyFormat f84931e;

    static {
        ae1.m[] mVarArr = {new ae1.m("SM2KeyFormatHEX", 0, 0, com.p3249xcbb51f6b.tsm.C28043xc4c57f6b.TSMStorageSM2KeyFormat.kTSMStorageSM2KeyFormatHEX), new ae1.m("SM2KeyFormatPEM", 1, 1, com.p3249xcbb51f6b.tsm.C28043xc4c57f6b.TSMStorageSM2KeyFormat.kTSMStorageSM2KeyFormatPEM)};
        f84929g = mVarArr;
        rz5.b.a(mVarArr);
        f84928f = new ae1.l(null);
    }

    public m(java.lang.String str, int i17, int i18, com.p3249xcbb51f6b.tsm.C28043xc4c57f6b.TSMStorageSM2KeyFormat tSMStorageSM2KeyFormat) {
        this.f84930d = i18;
        this.f84931e = tSMStorageSM2KeyFormat;
    }

    /* renamed from: valueOf */
    public static ae1.m m1165xdce0328(java.lang.String str) {
        return (ae1.m) java.lang.Enum.valueOf(ae1.m.class, str);
    }

    /* renamed from: values */
    public static ae1.m[] m1166xcee59d22() {
        return (ae1.m[]) f84929g.clone();
    }
}
