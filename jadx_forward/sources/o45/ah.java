package o45;

/* loaded from: classes12.dex */
public abstract class ah {

    /* renamed from: MMNativeNetTaskAdapterProfile */
    private java.util.Map<java.lang.String, java.lang.String> f73001x42692325;

    /* renamed from: profile */
    private r45.xw f73005xed8e89a9;

    /* renamed from: profileClock */
    private long f73006x476503e5;

    /* renamed from: serverSequenceId */
    private int f73008x1131a85f;

    /* renamed from: bufferSize */
    private long f73002x719ec861 = 0;

    /* renamed from: iRetCode */
    private int f73004x3ff6a185 = -99;

    /* renamed from: iHeadExtFlags */
    private int f73003xcc19f1ef = 255;

    /* renamed from: sErrMsg */
    private java.lang.String f73007x3fa67a2f = "";

    /* renamed from: getAuthResponse */
    public byte[] mo150570x346dc07f() {
        return null;
    }

    /* renamed from: getBufferSize */
    public long m150571x5fdf8057() {
        return this.f73002x719ec861;
    }

    /* renamed from: getCmdId */
    public int mo13864x7443ca3f() {
        return 0;
    }

    /* renamed from: getErrMsg */
    public java.lang.String m150572x17ec12d2() {
        return this.f73007x3fa67a2f;
    }

    /* renamed from: getHeadExtFlags */
    public int m150573x4f83855c() {
        return this.f73003xcc19f1ef;
    }

    /* renamed from: getMMNativeNetTaskAdapterProfile */
    public java.util.Map<java.lang.String, java.lang.String> m150574x9be79b8f() {
        return this.f73001x42692325;
    }

    /* renamed from: getNewRegResponse */
    public byte[] mo150575x527ee42b() {
        return null;
    }

    /* renamed from: getProfile */
    public r45.xw m150576x2b5bc573() {
        return this.f73005xed8e89a9;
    }

    /* renamed from: getProfileClock */
    public long m150577xa857965b() {
        return this.f73006x476503e5;
    }

    /* renamed from: getRetCode */
    public int mo150578x7f2fddf8() {
        return this.f73004x3ff6a185;
    }

    /* renamed from: getServerIndexBuffer */
    public byte[] mo150579xcb512bb9() {
        return null;
    }

    /* renamed from: getServerSequenceId */
    public int m150580xb90a0fd5() {
        return this.f73008x1131a85f;
    }

    /* renamed from: isRawData */
    public boolean mo150581x182b0f68() {
        return false;
    }

    /* renamed from: setBufferSize */
    public void m150582x8e03ce63(long j17) {
        this.f73002x719ec861 = j17;
    }

    /* renamed from: setErrMsg */
    public void m150583xb2146de(java.lang.String str) {
        this.f73007x3fa67a2f = str;
    }

    /* renamed from: setHeadExtFlags */
    public void m150584x85cc8068(int i17) {
        this.f73003xcc19f1ef = i17;
    }

    /* renamed from: setMMNativeNetTaskAdapterProfile */
    public void m150585xfe2a9a03(java.util.Map<java.lang.String, java.lang.String> map) {
        this.f73001x42692325 = map;
    }

    /* renamed from: setProfile */
    public void m150586x9ecd12e7(byte[] bArr) {
        this.f73006x476503e5 = android.os.SystemClock.elapsedRealtime();
        r45.xw xwVar = new r45.xw();
        this.f73005xed8e89a9 = xwVar;
        try {
            xwVar.mo11468x92b714fd(bArr);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("setProfile", e17.getLocalizedMessage());
        }
    }

    /* renamed from: setRetCode */
    public void m150587xf2a12b6c(int i17) {
        this.f73004x3ff6a185 = i17;
    }

    /* renamed from: setServerSequenceId */
    public void m150588x5d06a4e1(int i17) {
        this.f73008x1131a85f = i17;
    }
}
