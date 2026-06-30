package ae1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class o {

    /* renamed from: g, reason: collision with root package name */
    public static final ae1.n f3399g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ ae1.o[] f3400h;

    /* renamed from: d, reason: collision with root package name */
    public final int f3401d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tenpay.ndk.WxSmCryptoUtil.SM2SignMode f3402e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tenpay.tsm.TSMTypes.SM2SignFormat f3403f;

    static {
        ae1.o[] oVarArr = {new ae1.o("SignMode_RS_ASN1", 0, 0, com.tenpay.ndk.WxSmCryptoUtil.SM2SignMode.SM2SignMode_RS_ASN1, com.tenpay.tsm.TSMTypes.SM2SignFormat.kSM2SignRSASN1Encode), new ae1.o("SignMode_RS", 1, 1, com.tenpay.ndk.WxSmCryptoUtil.SM2SignMode.SM2SignMode_RS, com.tenpay.tsm.TSMTypes.SM2SignFormat.kSM2SignRSRaw)};
        f3400h = oVarArr;
        rz5.b.a(oVarArr);
        f3399g = new ae1.n(null);
    }

    public o(java.lang.String str, int i17, int i18, com.tenpay.ndk.WxSmCryptoUtil.SM2SignMode sM2SignMode, com.tenpay.tsm.TSMTypes.SM2SignFormat sM2SignFormat) {
        this.f3401d = i18;
        this.f3402e = sM2SignMode;
        this.f3403f = sM2SignFormat;
    }

    public static ae1.o valueOf(java.lang.String str) {
        return (ae1.o) java.lang.Enum.valueOf(ae1.o.class, str);
    }

    public static ae1.o[] values() {
        return (ae1.o[]) f3400h.clone();
    }
}
