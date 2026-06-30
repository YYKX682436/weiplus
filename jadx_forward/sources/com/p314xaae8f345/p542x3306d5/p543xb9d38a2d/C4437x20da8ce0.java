package com.p314xaae8f345.p542x3306d5.p543xb9d38a2d;

/* renamed from: com.tencent.mars.account.AccountManager */
/* loaded from: classes12.dex */
public class C4437x20da8ce0 extends com.p314xaae8f345.p542x3306d5.app.AbstractC4441x1e602b7c {
    public static final java.lang.String TAG = "MicroMsg.AccountManager";

    /* renamed from: nativeHandle */
    private long f17587x7b5cfd1f = 0;

    /* renamed from: callbackHandle */
    private long f17585x429972cd = 0;

    /* renamed from: handle */
    private long f17586xb7026e28 = 0;

    /* renamed from: callback */
    private com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0.Callback f17584xf5bc2045 = null;

    /* renamed from: com.tencent.mars.account.AccountManager$AuthInfo */
    /* loaded from: classes8.dex */
    public static class AuthInfo {

        /* renamed from: identify */
        public java.lang.String f17590xf7e86f0c = "";

        /* renamed from: encryptAlgo */
        public int f17589x14f8a658 = 0;

        /* renamed from: clientSessionKey */
        public java.lang.String f17588x81786214 = "";

        /* renamed from: serverSessionKey */
        public java.lang.String f17592x7e0da78c = "";

        /* renamed from: serverId */
        public java.lang.String f17591x523373be = "";

        /* renamed from: toString */
        public java.lang.String m37579x9616526c() {
            return "AuthInfo{identify='" + this.f17590xf7e86f0c + "', encryptAlgo=" + this.f17589x14f8a658 + ", clientSessionKey='" + this.f17588x81786214 + "', serverSessionKey='" + this.f17592x7e0da78c + "', serverId='" + this.f17591x523373be + "'}";
        }
    }

    /* renamed from: com.tencent.mars.account.AccountManager$Callback */
    /* loaded from: classes12.dex */
    public interface Callback {
        /* renamed from: calcNoticeid */
        int mo37580x2c250768(byte[] bArr, int i17, int i18);

        /* renamed from: genCheckSum */
        int mo37581x5dda8793(int i17, byte[] bArr, int i18);

        /* renamed from: getGroupKey */
        int mo37582x9a0868d6();

        /* renamed from: reportKV */
        void mo37583xe68be19f(int i17, java.lang.String str, boolean z17, boolean z18, int i18, boolean z19);

        /* renamed from: sm4gcmDecryptBuffer */
        byte[] mo37584xdc9a69b6(byte[] bArr, byte[] bArr2);

        /* renamed from: sm4gcmEncryptBuffer */
        byte[] mo37585x105c408e(byte[] bArr, byte[] bArr2);
    }

    public C4437x20da8ce0(com.p314xaae8f345.p542x3306d5.app.C4443x9befcd8f c4443x9befcd8f) {
        m37525xe3d39223(c4443x9befcd8f);
    }

    /* renamed from: OnJniClearAxSession */
    private native void m37524x30449958();

    /* renamed from: OnJniCreateAccountManagerFromContext */
    private native void m37525xe3d39223(java.lang.Object obj);

    /* renamed from: OnJniCreateAccountManagerFromHandle */
    private native void m37526x596eb334(long j17);

    /* renamed from: OnJniGetGroupKey */
    private native int m37527x240317d0();

    /* renamed from: OnJniGetMainHostServerId */
    private native byte[] m37528x18caae4f();

    /* renamed from: OnJniGetOriginalSessionKey */
    private native java.lang.String m37529x4d9cc90a();

    /* renamed from: OnJniGetUin */
    private native int m37530x9a06d1ea();

    /* renamed from: OnJniGetUsername */
    private native java.lang.String m37531xf5fe7546();

    /* renamed from: OnJniGetWxUsername */
    private native java.lang.String m37532xe6871b47();

    /* renamed from: OnJniInit */
    private native void m37533x700c3b56();

    /* renamed from: OnJniIsLogin */
    private native boolean m37534x265bd859();

    /* renamed from: OnJniOnDestroyAccountManager */
    private native void m37535xdae4aab5();

    /* renamed from: OnJniSetCallback */
    private native void m37536xf6496dc1(java.lang.Object obj);

    /* renamed from: OnJniSetMainHostServerId */
    private native void m37537xbcc7435b(byte[] bArr);

    /* renamed from: OnJniSetOriginalSessionKey */
    private native void m37538xe4c84b16(byte[] bArr);

    /* renamed from: OnJniSetUin */
    private native void m37539xae80f95e(int i17);

    /* renamed from: OnJniSetUsername */
    private native void m37540xf0b6d652(java.lang.String str);

    /* renamed from: OnJniSetWxUsername */
    private native void m37541x14ab6953(java.lang.String str);

    /* renamed from: OnJniUnInit */
    private native void m37542xb256500f();

    /* renamed from: OnJniUpdateAxAuthSecRespList */
    private native void m37543xf291fa31(byte[] bArr);

    /* renamed from: OnJniUpdateAxHostAlgo */
    private native void m37544xed696461(int i17, byte[] bArr);

    /* renamed from: OnJniUpdateAxSessionKey */
    private native void m37545xfca5eeaf(int i17, byte[] bArr, byte[] bArr2, byte[] bArr3);

    /* renamed from: OnJniUpdateClientVersion */
    private native void m37546x6920513e(int i17);

    /* renamed from: OnJniUpdateDeviceInfo */
    private native void m37547x1a24e713(int i17, java.lang.String str);

    /* renamed from: OnJniUpdateMainHostAlgo */
    private native void m37548xf7fcbc23(byte[] bArr);

    /* renamed from: OnJniUpdateMainSessionKey */
    private native void m37549xafc25df1(byte[] bArr, byte[] bArr2);

    /* renamed from: OnJniUpdateServerIndex */
    private native void m37550x59376e40(byte[] bArr);

    /* renamed from: clearAxSession */
    public void m37551x64f46292() {
        m37524x30449958();
    }

    /* renamed from: finalize */
    public void m37552xd764dc1e() {
        try {
            m37535xdae4aab5();
        } finally {
            super.finalize();
        }
    }

    /* renamed from: getCallback */
    public com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0.Callback m37553x71965dbb() {
        return this.f17584xf5bc2045;
    }

    /* renamed from: getGroupKey */
    public int m37554x9a0868d6() {
        return m37527x240317d0();
    }

    /* renamed from: getMainHostServerId */
    public byte[] m37555xda899955() {
        return m37528x18caae4f();
    }

    @Override // com.p314xaae8f345.p542x3306d5.app.AbstractC4441x1e602b7c
    /* renamed from: getNativeHandle */
    public long mo37556xdc4f8f95() {
        return this.f17587x7b5cfd1f;
    }

    /* renamed from: getOriginalSessionKey */
    public java.lang.String m37557x9b4d0a90() {
        return m37529x4d9cc90a();
    }

    /* renamed from: getUin */
    public int m37558xb5887524() {
        return m37530x9a06d1ea();
    }

    /* renamed from: getUsername */
    public java.lang.String m37559x6c03c64c() {
        return m37531xf5fe7546();
    }

    /* renamed from: getWxUsername */
    public java.lang.String m37560xf07c42cd() {
        return m37532xe6871b47();
    }

    /* renamed from: init */
    public void m37561x316510() {
        m37533x700c3b56();
    }

    /* renamed from: isLogin */
    public boolean m37562x7b0e9c5f() {
        return m37534x265bd859();
    }

    /* renamed from: onDestroy */
    public void m37563xac79a11b() {
        m37542xb256500f();
        this.f17587x7b5cfd1f = 0L;
        this.f17585x429972cd = 0L;
    }

    /* renamed from: setCallback */
    public void m37564x6c4ebec7(com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0.Callback callback) {
        this.f17584xf5bc2045 = callback;
        m37536xf6496dc1(callback);
    }

    /* renamed from: setMainHostServerId */
    public void m37565x7e862e61(byte[] bArr) {
        m37537xbcc7435b(bArr);
    }

    /* renamed from: setOriginalSessionKey */
    public void m37566x32788c9c(byte[] bArr) {
        m37538xe4c84b16(bArr);
    }

    /* renamed from: setUin */
    public void m37567xca029c98(int i17) {
        m37539xae80f95e(i17);
    }

    /* renamed from: setUsername */
    public void m37568x66bc2758(java.lang.String str) {
        m37540xf0b6d652(str);
    }

    /* renamed from: setWxUsername */
    public void m37569x1ea090d9(java.lang.String str) {
        m37541x14ab6953(str);
    }

    /* renamed from: unInit */
    public void m37570xcdd7f349() {
        m37542xb256500f();
    }

    /* renamed from: updateAxAuthSecRespList */
    public void m37571x9537f237(byte[] bArr) {
        m37543xf291fa31(bArr);
    }

    /* renamed from: updateAxHostAlgo */
    public void m37572xb54bc71b(int i17, byte[] bArr) {
        m37544xed696461(i17, bArr);
    }

    /* renamed from: updateAxSessionKey */
    public void m37573x557a8ae9(int i17, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        m37545xfca5eeaf(i17, bArr, bArr2, bArr3);
    }

    /* renamed from: updateClientVersion */
    public void m37574x2adf3c44(int i17) {
        m37546x6920513e(i17);
    }

    /* renamed from: updateDeviceInfo */
    public void m37575xe20749cd(int i17, java.lang.String str) {
        m37547x1a24e713(i17, str);
    }

    /* renamed from: updateMainHostAlgo */
    public void m37576x50d1585d(byte[] bArr) {
        m37548xf7fcbc23(bArr);
    }

    /* renamed from: updateMainSessionKey */
    public void m37577x25e0d3ab(byte[] bArr, byte[] bArr2) {
        m37549xafc25df1(bArr, bArr2);
    }

    /* renamed from: updateServerIndex */
    public void m37578x8da162c6(byte[] bArr) {
        m37550x59376e40(bArr);
    }

    public C4437x20da8ce0(long j17) {
        m37526x596eb334(j17);
    }
}
