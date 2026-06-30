package ae1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class m {

    /* renamed from: f, reason: collision with root package name */
    public static final ae1.l f3395f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ae1.m[] f3396g;

    /* renamed from: d, reason: collision with root package name */
    public final int f3397d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tenpay.tsm.TSMTypes.TSMStorageSM2KeyFormat f3398e;

    static {
        ae1.m[] mVarArr = {new ae1.m("SM2KeyFormatHEX", 0, 0, com.tenpay.tsm.TSMTypes.TSMStorageSM2KeyFormat.kTSMStorageSM2KeyFormatHEX), new ae1.m("SM2KeyFormatPEM", 1, 1, com.tenpay.tsm.TSMTypes.TSMStorageSM2KeyFormat.kTSMStorageSM2KeyFormatPEM)};
        f3396g = mVarArr;
        rz5.b.a(mVarArr);
        f3395f = new ae1.l(null);
    }

    public m(java.lang.String str, int i17, int i18, com.tenpay.tsm.TSMTypes.TSMStorageSM2KeyFormat tSMStorageSM2KeyFormat) {
        this.f3397d = i18;
        this.f3398e = tSMStorageSM2KeyFormat;
    }

    public static ae1.m valueOf(java.lang.String str) {
        return (ae1.m) java.lang.Enum.valueOf(ae1.m.class, str);
    }

    public static ae1.m[] values() {
        return (ae1.m[]) f3396g.clone();
    }
}
