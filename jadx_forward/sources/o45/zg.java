package o45;

/* loaded from: classes12.dex */
public abstract class zg {
    private static final java.lang.String TAG = "MicroMsg.MMBase.Req";

    /* renamed from: cgiVerifyKeys */
    private com.p314xaae8f345.mm.p971x6de15a2e.i f73012xa02d8072;

    /* renamed from: mReqPackControl */
    private o45.wg f73017x8f62c753;

    /* renamed from: passKey */
    private byte[] f73018xd0c9fc8e;

    /* renamed from: bShortSupport */
    private boolean f73010x42aea135 = true;

    /* renamed from: useECDH */
    private boolean f73025xf7260ba9 = false;

    /* renamed from: useAxSession */
    private boolean f73024xf85cd498 = false;

    /* renamed from: axRandomKey */
    private byte[] f73009x33334825 = null;

    /* renamed from: bufferSize */
    private long f73011x719ec861 = 0;

    /* renamed from: iUin */
    private int f73016x310731 = 0;

    /* renamed from: iClientVersion */
    private int f73014x198d8a4 = 0;

    /* renamed from: sessionKey */
    private byte[] f73023x630d93e9 = new byte[0];

    /* renamed from: sDeviceType */
    private java.lang.String f73022x881e2f83 = "";

    /* renamed from: sDeviceID */
    private java.lang.String f73021xe0b52b84 = "";

    /* renamed from: iSceneStatus */
    private int f73015x7b32b775 = 0;

    /* renamed from: rsaInfo */
    private o45.pi f73020x583d730e = new o45.pi("", "", 0);

    /* renamed from: routeInfo */
    private int f73019x9f93e97 = 0;

    /* renamed from: ecdhEngine */
    private long f73013x44eb0e84 = 0;

    /* renamed from: getAxRandomKey */
    public byte[] m150603xd098eef() {
        return this.f73009x33334825;
    }

    /* renamed from: getBufferSize */
    public long m150604x5fdf8057() {
        return this.f73011x719ec861;
    }

    /* renamed from: getCgiVerifyPrivateKey */
    public java.lang.String m150605x286446a4() {
        com.p314xaae8f345.mm.p971x6de15a2e.i iVar = this.f73012xa02d8072;
        return iVar != null ? iVar.f153555a : "";
    }

    /* renamed from: getCgiVerifyPublicKey */
    public java.lang.String m150606x52e4dd6e() {
        com.p314xaae8f345.mm.p971x6de15a2e.i iVar = this.f73012xa02d8072;
        return iVar != null ? iVar.f153556b : "";
    }

    /* renamed from: getClientVersion */
    public int m150607xeb61b2d7() {
        return this.f73014x198d8a4;
    }

    /* renamed from: getCmdId */
    public int mo13850x7443ca3f() {
        return 0;
    }

    /* renamed from: getDeviceID */
    public java.lang.String m150608xbdf72767() {
        return this.f73021xe0b52b84;
    }

    /* renamed from: getDeviceType */
    public java.lang.String m150609x1cd0bea6() {
        return this.f73022x881e2f83;
    }

    /* renamed from: getECDHEngine */
    public long m150610x11b0e25a() {
        return this.f73013x44eb0e84;
    }

    /* renamed from: getPassKey */
    public byte[] m150611xe973858() {
        return this.f73018xd0c9fc8e;
    }

    /* renamed from: getReqPackControl */
    public o45.wg m150612x77478a7c() {
        return this.f73017x8f62c753;
    }

    /* renamed from: getRouteInfo */
    public int m150613x966afe1() {
        return this.f73019x9f93e97;
    }

    /* renamed from: getRsaInfo */
    public o45.pi m150614x960aaed8() {
        return this.f73020x583d730e;
    }

    /* renamed from: getSceneStatus */
    public int m150615xc9c28268() {
        return this.f73015x7b32b775;
    }

    /* renamed from: getSessionKey */
    public byte[] m150616x514e4bdf() {
        return this.f73023x630d93e9;
    }

    /* renamed from: getShortSupport */
    public boolean mo150590x4bad6229() {
        return this.f73010x42aea135;
    }

    /* renamed from: getUin */
    public int m150617xb5887524() {
        return this.f73016x310731;
    }

    /* renamed from: isAxAuth */
    public boolean mo150600xd46d5c49() {
        return false;
    }

    /* renamed from: isRawData */
    public boolean mo150591x182b0f68() {
        return false;
    }

    /* renamed from: packToNetMsg */
    public boolean m150618xc9f6d438(com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1 c19764x527bffc1) {
        return false;
    }

    /* renamed from: setAxRandomKey */
    public void m150619xa36f0263(byte[] bArr) {
        this.f73009x33334825 = bArr;
    }

    /* renamed from: setBufferSize */
    public void m150620x8e03ce63(long j17) {
        this.f73011x719ec861 = j17;
    }

    /* renamed from: setCGiVerifyKey */
    public void m150621x20d83983(com.p314xaae8f345.mm.p971x6de15a2e.i iVar) {
        this.f73012xa02d8072 = iVar;
    }

    /* renamed from: setClientVersion */
    public void mo150592x7e38194b(int i17) {
        this.f73014x198d8a4 = i17;
    }

    /* renamed from: setDeviceID */
    public void m150622xb8af8873(java.lang.String str) {
        this.f73021xe0b52b84 = str;
    }

    /* renamed from: setDeviceType */
    public void m150623x4af50cb2(java.lang.String str) {
        this.f73022x881e2f83 = str;
    }

    /* renamed from: setEcdhEngine */
    public void m150624x61501486(long j17) {
        this.f73013x44eb0e84 = j17;
    }

    /* renamed from: setPassKey */
    public void m150625x820885cc(byte[] bArr) {
        this.f73018xd0c9fc8e = bArr;
    }

    /* renamed from: setReqPackControl */
    public void m150626x3f3df288(o45.wg wgVar) {
        this.f73017x8f62c753 = wgVar;
    }

    /* renamed from: setRouteInfo */
    public void m150627x65ba7055(int i17) {
        this.f73019x9f93e97 = i17;
    }

    /* renamed from: setRsaInfo */
    public void m150628x97bfc4c(o45.pi piVar) {
        this.f73020x583d730e = piVar;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(mo13850x7443ca3f());
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(o45.ag.f424425a);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "summerauths setRsaInfo cgi[%s], USE_ECDH[%b], stack[%s]", valueOf, valueOf2, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        if (o45.ag.f424425a) {
            m150633xa86494e7(true);
        }
    }

    /* renamed from: setSceneStatus */
    public void m150629x6027f5dc(int i17) {
        this.f73015x7b32b775 = i17;
    }

    /* renamed from: setSessionKey */
    public void m150630x7f7299eb(byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        this.f73023x630d93e9 = bArr;
    }

    /* renamed from: setShortSupport */
    public void m150631x81f65d35(boolean z17) {
        this.f73010x42aea135 = z17;
    }

    /* renamed from: setUin */
    public void mo150593xca029c98(int i17) {
        this.f73016x310731 = i17;
    }

    /* renamed from: setUseAxsession */
    public void m150632x2c5fca3a(boolean z17) {
        this.f73024xf85cd498 = z17;
    }

    /* renamed from: setUseECDH */
    public void m150633xa86494e7(boolean z17) {
        this.f73025xf7260ba9 = z17;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(mo13850x7443ca3f());
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "summerauths setUseECDH[%s]  cgi[%s], stack[%s]", valueOf, valueOf2, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
    }

    /* renamed from: useAxSession */
    public boolean m150634xf85cd498() {
        return this.f73024xf85cd498;
    }

    /* renamed from: useECDH */
    public boolean m150635xf7260ba9() {
        return this.f73025xf7260ba9;
    }
}
