package ae1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes16.dex */
public final class k {

    /* renamed from: g, reason: collision with root package name */
    public static final ae1.j f3390g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ ae1.k[] f3391h;

    /* renamed from: d, reason: collision with root package name */
    public final int f3392d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tenpay.ndk.WxSmCryptoUtil.SM2CipherMode f3393e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tenpay.tsm.TSMTypes.SM2CipherFormat f3394f;

    static {
        ae1.k[] kVarArr = {new ae1.k("CipherMode_C1C3C2_ASN1", 0, 0, com.tenpay.ndk.WxSmCryptoUtil.SM2CipherMode.SM2CipherMode_C1C3C2_ASN1, com.tenpay.tsm.TSMTypes.SM2CipherFormat.kSM2CipherC1C3C2ASN1Encode), new ae1.k("CipherMode_C1C3C2", 1, 1, com.tenpay.ndk.WxSmCryptoUtil.SM2CipherMode.SM2CipherMode_C1C3C2, com.tenpay.tsm.TSMTypes.SM2CipherFormat.kSM2CipherC1C3C2Raw), new ae1.k("CipherMode_C1C2C3_ASN1", 2, 2, com.tenpay.ndk.WxSmCryptoUtil.SM2CipherMode.SM2CipherMode_C1C2C3_ASN1, com.tenpay.tsm.TSMTypes.SM2CipherFormat.kSM2CipherC1C2C3ASN1Encode), new ae1.k("CipherMode_C1C2C3", 3, 3, com.tenpay.ndk.WxSmCryptoUtil.SM2CipherMode.SM2CipherMode_C1C2C3, com.tenpay.tsm.TSMTypes.SM2CipherFormat.kSM2CipherC1C2C3Raw), new ae1.k("CipherMode_04C1C3C2", 4, 4, com.tenpay.ndk.WxSmCryptoUtil.SM2CipherMode.SM2CipherMode_04C1C3C2, com.tenpay.tsm.TSMTypes.SM2CipherFormat.kSM2Cipher04C1C3C2Raw), new ae1.k("CipherMode_04C1C2C3", 5, 5, com.tenpay.ndk.WxSmCryptoUtil.SM2CipherMode.SM2CipherMode_04C1C2C3, com.tenpay.tsm.TSMTypes.SM2CipherFormat.kSM2Cipher04C1C2C3Raw)};
        f3391h = kVarArr;
        rz5.b.a(kVarArr);
        f3390g = new ae1.j(null);
    }

    public k(java.lang.String str, int i17, int i18, com.tenpay.ndk.WxSmCryptoUtil.SM2CipherMode sM2CipherMode, com.tenpay.tsm.TSMTypes.SM2CipherFormat sM2CipherFormat) {
        this.f3392d = i18;
        this.f3393e = sM2CipherMode;
        this.f3394f = sM2CipherFormat;
    }

    public static ae1.k valueOf(java.lang.String str) {
        return (ae1.k) java.lang.Enum.valueOf(ae1.k.class, str);
    }

    public static ae1.k[] values() {
        return (ae1.k[]) f3391h.clone();
    }
}
