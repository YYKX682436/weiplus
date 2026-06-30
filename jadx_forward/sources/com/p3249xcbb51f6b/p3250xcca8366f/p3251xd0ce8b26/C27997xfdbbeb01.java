package com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26;

/* renamed from: com.tenpay.android.wechat.PayuSecureEncrypt */
/* loaded from: classes12.dex */
public class C27997xfdbbeb01 implements com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.InterfaceC27988x58d9925 {

    /* renamed from: CHARSET */
    protected static final java.lang.String f62844x56d8ed2c = "UTF-8";

    /* renamed from: ENCRYPT_VERSION_DEFAULT */
    public static final java.lang.String f62845xa1e463a0 = "10";

    /* renamed from: ENCRYPT_VERSION_HASH */
    public static final java.lang.String f62846x68d3fef = "30";

    /* renamed from: RSA_E_KEY */
    private static final java.lang.String f62847x40773066 = "10001";

    /* renamed from: RSA_N_KEY */
    private static final java.lang.String f62848x40f603ef = "b2f690b296060c441416f269e2eea0e8279e139b43c7e9e7d16a2bed62cba4e9456a5071154e8929a016c70ec64a05c47e4854b933ca85ada97f75335ff3de9aa998c1f5b63b14e0bbea3392fd159c53e5a2b14b0698e1061e9410380565206f5427681f845f1932a42320646ab69a41a1becdb083048d8d045ce5f4aee88e35";

    /* renamed from: mEncrptType */
    protected int f62849x72d77883 = 0;

    /* renamed from: com.tenpay.android.wechat.PayuSecureEncrypt$EncrptType */
    /* loaded from: classes11.dex */
    public interface EncrptType {

        /* renamed from: CARD_NUMBER */
        public static final int f62850x3f97c758 = 50;
        public static final int CVV = 30;

        /* renamed from: DEFAULT */
        public static final int f62851x86df6221 = 0;

        /* renamed from: HASHED_PASSWORD */
        public static final int f62852x9f32c86d = -10;

        /* renamed from: HASHED_SECRET_ANSWER */
        public static final int f62853x4a03d9b = -20;

        /* renamed from: PASSWORD */
        public static final int f62854x772faa9b = 20;

        /* renamed from: SECRET_ANSWER */
        public static final int f62855xbfdf882d = 40;

        /* renamed from: VERIFY_CODE */
        public static final int f62856xdeec5f3 = 60;
    }

    @Override // com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.InterfaceC27988x58d9925
    /* renamed from: desedeEncode */
    public java.lang.String mo121431xea62cd8a(java.lang.String str, java.lang.String str2) {
        return null;
    }

    @Override // com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.InterfaceC27988x58d9925
    /* renamed from: desedeVerifyCode */
    public java.lang.String mo121432x19b57b7a(java.lang.String str, java.lang.String str2) {
        return null;
    }

    @Override // com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.InterfaceC27988x58d9925
    /* renamed from: encryptPasswd */
    public java.lang.String mo121433xd26bb163(boolean z17, java.lang.String str, java.lang.String str2) {
        return null;
    }

    @Override // com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.InterfaceC27988x58d9925
    /* renamed from: encryptPasswdWithRSA2048 */
    public java.lang.String mo121434x8b1ff279(boolean z17, java.lang.String str, java.lang.String str2) {
        return "";
    }

    /* renamed from: getRsaEKey */
    public java.lang.String m121505x960859e4() {
        return new java.lang.String(f62847x40773066);
    }

    /* renamed from: getRsaNKey */
    public java.lang.String m121506x960c713b() {
        return new java.lang.String(f62848x40f603ef);
    }

    /* renamed from: setEncryptType */
    public void m121507x853d357d(int i17) {
        this.f62849x72d77883 = i17;
    }
}
