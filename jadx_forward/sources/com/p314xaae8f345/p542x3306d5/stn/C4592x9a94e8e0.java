package com.p314xaae8f345.p542x3306d5.stn;

/* renamed from: com.tencent.mars.stn.StnManager */
/* loaded from: classes12.dex */
public class C4592x9a94e8e0 extends com.p314xaae8f345.p542x3306d5.app.AbstractC4441x1e602b7c {

    /* renamed from: CONNECTED */
    public static final int f19565x839202e9 = 4;

    /* renamed from: CONNECTTING */
    public static final int f19566xe723dab8 = 3;

    /* renamed from: ECHECK_NEVER */
    public static int f19567xbc066f0 = 2;

    /* renamed from: ECHECK_NEXT */
    public static int f19568x21694def = 1;

    /* renamed from: ECHECK_NOW */
    public static int f19569x95b9143a = 0;

    /* renamed from: GATEWAY_FAILED */
    public static final int f19570xbfedc2b8 = 1;

    /* renamed from: INVALID_TASK_ID */
    public static final int f19571x2002f3ad = -1;

    /* renamed from: NETWORK_UNAVAILABLE */
    public static final int f19572xed440b7f = 0;

    /* renamed from: NETWORK_UNKNOWN */
    public static final int f19573x6a85d6f9 = -1;

    /* renamed from: RESP_FAIL_HANDLE_DEFAULT */
    public static int f19574x3a145b5c = -1;

    /* renamed from: RESP_FAIL_HANDLE_ECDH_VERSON_MISMATCH */
    public static int f19575x8296306 = -3800;

    /* renamed from: RESP_FAIL_HANDLE_NORMAL */
    public static int f19576x5593244c = 0;

    /* renamed from: RESP_FAIL_HANDLE_SESSION_TIMEOUT */
    public static int f19577x3eb546b3 = -13;

    /* renamed from: RESP_FAIL_HANDLE_TASK_END */
    public static int f19578xc9b14d26 = -14;

    /* renamed from: SERVER_DOWN */
    public static final int f19579x54d8441e = 5;

    /* renamed from: SERVER_FAILED */
    public static final int f19580x8275c0b9 = 2;

    /* renamed from: ectCancel */
    public static final int f19581x1b4619b0 = 10;

    /* renamed from: ectDial */
    public static final int f19582x8e484c26 = 2;

    /* renamed from: ectDns */
    public static final int f19583xb20255b3 = 3;

    /* renamed from: ectEnDecode */
    public static final int f19584x9a099dad = 7;

    /* renamed from: ectFalse */
    public static final int f19585x3ad9ef2d = 1;

    /* renamed from: ectHttp */
    public static final int f19586x8e4a493e = 5;

    /* renamed from: ectLocal */
    public static final int f19587x3b34b575 = 9;

    /* renamed from: ectNetMsgXP */
    public static final int f19588xb579ac52 = 6;

    /* renamed from: ectOK */
    public static final int f19589x5be03f2 = 0;

    /* renamed from: ectServer */
    public static final int f19590x36ce1a79 = 8;

    /* renamed from: ectSocket */
    public static final int f19591x37540aa9 = 4;

    /* renamed from: nativeHandle */
    protected long f19593x7b5cfd1f = 0;

    /* renamed from: callbackHandle */
    protected long f19592x429972cd = 0;

    /* renamed from: com.tencent.mars.stn.StnManager$CallBack */
    /* loaded from: classes12.dex */
    public interface CallBack {
        /* renamed from: buf2Resp */
        int mo698xa261f88f(int i17, java.lang.Object obj, java.lang.String str, byte[] bArr, int[] iArr, int[] iArr2, int i18, int[] iArr3);

        /* renamed from: getLongLinkIdentifyCheckBuffer */
        int mo699xca682310(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream, java.io.ByteArrayOutputStream byteArrayOutputStream2, int[] iArr);

        /* renamed from: makesureAuthed */
        boolean mo700x9780e92a(java.lang.String str, java.lang.String str2);

        /* renamed from: networkAnalysisCallBack */
        void mo701x252d11af(int i17, int i18, boolean z17, java.lang.String str);

        /* renamed from: onLongLinkIdentifyResponse */
        boolean mo702xae260522(java.lang.String str, byte[] bArr, byte[] bArr2);

        /* renamed from: onLongLinkNetworkError */
        void mo703x3138c0af(com.p314xaae8f345.p542x3306d5.stn.EnumC4591xb875d68f enumC4591xb875d68f, int i17, java.lang.String str, int i18);

        /* renamed from: onLongLinkStatusChange */
        void mo704x94a79e77(int i17);

        /* renamed from: onNewDns */
        java.lang.String[] mo705x50705628(java.lang.String str, boolean z17);

        /* renamed from: onPush */
        void mo706xc39e2999(java.lang.String str, int i17, int i18, byte[] bArr, byte[] bArr2);

        /* renamed from: onShortLinkNetworkError */
        void mo707x2add591(com.p314xaae8f345.p542x3306d5.stn.EnumC4591xb875d68f enumC4591xb875d68f, int i17, java.lang.String str, java.lang.String str2, int i18);

        /* renamed from: onTaskEnd */
        int mo708xf4053237(int i17, java.lang.Object obj, int i18, int i19, com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.CgiProfile cgiProfile, byte[] bArr);

        /* renamed from: onTaskNotifyError */
        void mo709x4d94fd9b(int i17, java.lang.Object obj, int i18, int i19, com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.CgiProfile cgiProfile, byte[] bArr);

        /* renamed from: reportConnectStatus */
        void mo710x83f14ca8(int i17, int i18);

        /* renamed from: reportTaskProfile */
        void mo711x9db36690(java.lang.String str);

        /* renamed from: req2Buf */
        boolean mo712x412ffa7f(int i17, java.lang.Object obj, java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream, int[] iArr, int i18, java.lang.String str2, int i19);

        /* renamed from: requestNetCheckShortLinkHosts */
        java.lang.String[] mo713x4870e68f();

        /* renamed from: requestSync */
        void mo714x448ca1ca();

        /* renamed from: trafficData */
        void mo715x9e773f47(int i17, int i18);
    }

    /* renamed from: com.tencent.mars.stn.StnManager$CgiProfile */
    /* loaded from: classes12.dex */
    public static class CgiProfile {

        /* renamed from: netType */
        public java.lang.String f19600x6dd19677;

        /* renamed from: taskStartTime */
        public long f19612xf3a4da4a = 0;

        /* renamed from: startTaskTick */
        public long f19611xef215744 = 0;

        /* renamed from: startTaskTS */
        public long f19610x916e51c6 = 0;

        /* renamed from: endTaskTick */
        public long f19598x8bec92bd = 0;

        /* renamed from: startConnectTime */
        public long f19604x1dff6d15 = 0;

        /* renamed from: connectSuccessfulTime */
        public long f19595x3c5af811 = 0;

        /* renamed from: startHandshakeTime */
        public long f19607xaadb8a22 = 0;

        /* renamed from: handshakeSuccessfulTime */
        public long f19599xdec0205e = 0;

        /* renamed from: startSendPacketTime */
        public long f19609x7cbbae1f = 0;

        /* renamed from: sendPacketFinishedTime */
        public long f19603xa27ccaf = 0;

        /* renamed from: startReadPacketTime */
        public long f19608x36d87ead = 0;

        /* renamed from: readPacketFinishedTime */
        public long f19602xc06a2f3d = 0;

        /* renamed from: startEncodePacketTime */
        public long f19606xd6a8aad = 0;

        /* renamed from: encodePacketFinishedTime */
        public long f19597x2f0af3bd = 0;

        /* renamed from: startDecodePacketTime */
        public long f19605x321f085 = 0;

        /* renamed from: decodePacketFinishedTime */
        public long f19596x974b0195 = 0;
        public long rtt = 0;

        /* renamed from: channelType */
        public int f19594x105746dd = 0;

        /* renamed from: protocolType */
        public int f19601x99985f2 = 0;
    }

    public C4592x9a94e8e0(long j17) {
        m40437x5a3c4034(j17);
    }

    /* renamed from: OnJniClearTask */
    public native void m40433xc12d96ec();

    /* renamed from: OnJniCreateStnManager */
    public native void m40434xc8b01c22();

    /* renamed from: OnJniCreateStnManagerFromContext */
    public native void m40435xfcb7a523(java.lang.Object obj);

    /* renamed from: OnJniCreateStnManagerFromContextHandle */
    public native void m40436x7789592b(long j17);

    /* renamed from: OnJniCreateStnManagerFromHandle */
    public native void m40437x5a3c4034(long j17);

    /* renamed from: OnJniDestroyStnManager */
    public native void m40438x899a63d4();

    /* renamed from: OnJniGenSequenceId */
    public native int m40439x5d20f4a6();

    /* renamed from: OnJniGenTaskID */
    public native int m40440x1ed64a();

    /* renamed from: OnJniHasTask */
    public native boolean m40441xd4d79b39(int i17);

    /* renamed from: OnJniKeepSignalling */
    public native void m40442xafebe6c9();

    /* renamed from: OnJniMakesureLongLinkConnected */
    public native void m40443x908f5bca();

    /* renamed from: OnJniRedoTask */
    public native void m40444x905e17e9();

    /* renamed from: OnJniReset */
    public native void m40445x91f60fc9();

    /* renamed from: OnJniResetAndInitEncoderVersion */
    public native void m40446x6892c33a(int i17, java.lang.String str);

    /* renamed from: OnJniSetBackupIPs */
    public native void m40447x61e5192e(java.lang.String str, java.lang.String[] strArr);

    /* renamed from: OnJniSetCallback */
    public native void m40448xf6496dc1(java.lang.Object obj);

    /* renamed from: OnJniSetDebugIP */
    public native void m40449x9df969be(java.lang.String str, java.lang.String str2);

    /* renamed from: OnJniSetLonglinkSvrAddr */
    public native void m40450x486c3cae(java.lang.String str, int[] iArr, java.lang.String str2);

    /* renamed from: OnJniSetShortlinkSvrAddr */
    public native void m40451x1b490126(int i17, java.lang.String str);

    /* renamed from: OnJniSetSignallingStrategy */
    public native void m40452xb094b6ad(long j17, long j18);

    /* renamed from: OnJniStartTask */
    public native void m40453x8e039281(com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.Task task);

    /* renamed from: OnJniStopSignalling */
    public native void m40454x5780b06();

    /* renamed from: OnJniStopTask */
    public native void m40455x249023ed(int i17);

    /* renamed from: OnJniTouchTasks */
    public native void m40456x3101e555();

    /* renamed from: clearTask */
    public void m40457xb43f7172() {
        m40433xc12d96ec();
    }

    /* renamed from: genSequenceId */
    public int m40458x67161c2c() {
        return m40439x5d20f4a6();
    }

    /* renamed from: genTaskID */
    public int m40459xf330b0d0() {
        return m40440x1ed64a();
    }

    @Override // com.p314xaae8f345.p542x3306d5.app.AbstractC4441x1e602b7c
    /* renamed from: getNativeHandle */
    public long mo37556xdc4f8f95() {
        return this.f19593x7b5cfd1f;
    }

    /* renamed from: hasTask */
    public boolean m40460x298a5f3f(int i17) {
        return m40441xd4d79b39(i17);
    }

    /* renamed from: keepSignalling */
    public void m40461xe49bb003() {
        m40442xafebe6c9();
    }

    /* renamed from: makesureLongLinkConnected */
    public void m40462x21976a50() {
        m40443x908f5bca();
    }

    /* renamed from: onCreate */
    public void m40463x3e5a77bb() {
        m40434xc8b01c22();
    }

    /* renamed from: onDestroy */
    public void m40464xac79a11b() {
        m40438x899a63d4();
        this.f19593x7b5cfd1f = 0L;
        this.f19592x429972cd = 0L;
    }

    /* renamed from: redoTask */
    public void m40465xd203d4a3() {
        m40444x905e17e9();
    }

    /* renamed from: reset */
    public void m40466x6761d4f() {
        m40445x91f60fc9();
    }

    /* renamed from: resetAndInitEncoderVersion */
    public void m40467xf88c8574(int i17, java.lang.String str) {
        m40446x6892c33a(i17, str);
    }

    /* renamed from: setBackupIPs */
    public void m40468xac89e8e8(java.lang.String str, java.lang.String[] strArr) {
        m40447x61e5192e(str, strArr);
    }

    /* renamed from: setCallback */
    public void m40469x6c4ebec7(com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.CallBack callBack) {
        m40448xf6496dc1(callBack);
    }

    /* renamed from: setDebugIP */
    public void m40470xd22dff8(java.lang.String str, java.lang.String str2) {
        m40449x9df969be(str, str2);
    }

    /* renamed from: setLonglinkSvrAddr */
    public void m40471xa140d8e8(java.lang.String str, int[] iArr, java.lang.String str2) {
        m40450x486c3cae(str, iArr, str2);
    }

    /* renamed from: setShortlinkSvrAddr */
    public void m40472xdd07ec2c(int i17, java.lang.String str) {
        m40451x1b490126(i17, str);
    }

    /* renamed from: setSignallingStrategy */
    public void m40473xfe44f833(long j17, long j18) {
        m40452xb094b6ad(j17, j18);
    }

    /* renamed from: startTask */
    public void m40474x81156d07(com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.Task task) {
        m40453x8e039281(task);
    }

    /* renamed from: stopSignalling */
    public void m40475x3a27d440() {
        m40454x5780b06();
    }

    /* renamed from: stopTask */
    public void m40476x6635e0a7(int i17) {
        m40455x249023ed(i17);
    }

    /* renamed from: touchTasks */
    public void m40477xa02b5b8f() {
        m40456x3101e555();
    }

    public C4592x9a94e8e0(com.p314xaae8f345.p542x3306d5.app.C4443x9befcd8f c4443x9befcd8f) {
        m40435xfcb7a523(c4443x9befcd8f);
    }

    /* renamed from: com.tencent.mars.stn.StnManager$Task */
    /* loaded from: classes12.dex */
    public static class Task {

        /* renamed from: EBoth */
        public static final int f19613x3ec0566 = 3;

        /* renamed from: EFAST */
        public static final int f19614x3ed2621 = 1;

        /* renamed from: ELong */
        public static final int f19615x3f09061 = 2;

        /* renamed from: ENORMAL */
        public static final int f19616xcba7a96c = 0;

        /* renamed from: EShort */
        public static final int f19617x7a80f737 = 1;

        /* renamed from: ETASK_PRIORITY_0 */
        public static final int f19618xcf3f5c6a = 0;

        /* renamed from: ETASK_PRIORITY_1 */
        public static final int f19619xcf3f5c6b = 1;

        /* renamed from: ETASK_PRIORITY_2 */
        public static final int f19620xcf3f5c6c = 2;

        /* renamed from: ETASK_PRIORITY_3 */
        public static final int f19621xcf3f5c6d = 3;

        /* renamed from: ETASK_PRIORITY_4 */
        public static final int f19622xcf3f5c6e = 4;

        /* renamed from: ETASK_PRIORITY_5 */
        public static final int f19623xcf3f5c6f = 5;

        /* renamed from: ETASK_PRIORITY_HIGHEST */
        public static final int f19624x3ed0853e = 0;

        /* renamed from: ETASK_PRIORITY_LOWEST */
        public static final int f19625xc72561b8 = 5;

        /* renamed from: ETASK_PRIORITY_NORMAL */
        public static final int f19626xca8ce8ed = 3;

        /* renamed from: ETransportProtocolQUIC */
        public static final int f19627x8c540f5a = 2;

        /* renamed from: ETransportProtocolTCP */
        public static final int f19628xb1f23b25 = 1;

        /* renamed from: bindCellular */
        public int f19629xb350d4c7;
        public java.lang.String cgi;

        /* renamed from: cgiID */
        public long f19630x5a37c60;

        /* renamed from: channelSelect */
        public int f19631x54d08fdf;

        /* renamed from: channelStrategy */
        public int f19632x8675d196;

        /* renamed from: clientSequenceId */
        public int f19633x149c62e7;

        /* renamed from: cmdID */
        public int f19634x5a623d5;

        /* renamed from: extraInfo */
        public java.util.Map<java.lang.String, java.lang.String> f19635xf0e1e4de;

        /* renamed from: headers */
        public java.util.Map<java.lang.String, java.lang.String> f19636x2f676f86;

        /* renamed from: limitFlow */
        public boolean f19637x67f26b89;

        /* renamed from: limitFrequency */
        public boolean f19638x9a4c5be1;

        /* renamed from: longPolling */
        public boolean f19639x88d541a7;

        /* renamed from: longPollingTimeout */
        public int f19640xd2bbc9ba;

        /* renamed from: needAuthed */
        public boolean f19641x91e64c7d;

        /* renamed from: needRealtimeNetInfo */
        public boolean f19642xf7e2a88a;

        /* renamed from: networkStatusSensitive */
        public boolean f19643x77af6ab6;

        /* renamed from: priority */
        public int f19644xba8879a4;

        /* renamed from: reqBuf */
        public byte[] f19645xc84c20f5;

        /* renamed from: respBuf */
        public byte[] f19646x41685883;

        /* renamed from: retryCount */
        public int f19647xbaa1a747;

        /* renamed from: sendOnly */
        public boolean f19648x4a585f54;

        /* renamed from: serverProcessCost */
        public int f19649x510cd399;

        /* renamed from: shortLinkHostList */
        public java.util.ArrayList<java.lang.String> f19650xba767f1c;

        /* renamed from: taskID */
        public int f19651xcb7ef160;

        /* renamed from: totalTimeout */
        public int f19652xd2c4957d;

        /* renamed from: useReqBuf */
        public boolean f19653xddf4515c;

        /* renamed from: userContext */
        public java.lang.Object f19654x26b91764;

        /* renamed from: com.tencent.mars.stn.StnManager$Task$EBindCellularStrategy */
        /* loaded from: classes12.dex */
        public enum EBindCellularStrategy {
            kDefault,
            kForce,
            kTry
        }

        public Task(com.p314xaae8f345.p542x3306d5.app.C4443x9befcd8f c4443x9befcd8f) {
            this.f19647xbaa1a747 = -1;
            this.f19629xb350d4c7 = com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.Task.EBindCellularStrategy.kDefault.ordinal();
            this.f19653xddf4515c = false;
            this.f19645xc84c20f5 = new byte[0];
            this.f19646x41685883 = new byte[0];
            this.f19651xcb7ef160 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4558x4e42091.m40133xf330b0f0();
            this.f19636x2f676f86 = new java.util.HashMap();
        }

        public Task(com.p314xaae8f345.p542x3306d5.app.C4443x9befcd8f c4443x9befcd8f, int i17, int i18, java.lang.String str, java.util.ArrayList<java.lang.String> arrayList) {
            this.f19647xbaa1a747 = -1;
            com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.Task.EBindCellularStrategy eBindCellularStrategy = com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.Task.EBindCellularStrategy.kDefault;
            this.f19629xb350d4c7 = eBindCellularStrategy.ordinal();
            this.f19653xddf4515c = false;
            this.f19645xc84c20f5 = new byte[0];
            this.f19646x41685883 = new byte[0];
            this.f19651xcb7ef160 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4558x4e42091.m40133xf330b0f0();
            this.f19631x54d08fdf = i17;
            this.f19634x5a623d5 = i18;
            this.cgi = str;
            this.f19650xba767f1c = arrayList;
            this.f19648x4a585f54 = false;
            this.f19641x91e64c7d = true;
            this.f19637x67f26b89 = true;
            this.f19638x9a4c5be1 = true;
            this.f19632x8675d196 = 0;
            this.f19643x77af6ab6 = false;
            this.f19644xba8879a4 = 3;
            this.f19647xbaa1a747 = -1;
            this.f19649x510cd399 = 0;
            this.f19652xd2c4957d = 0;
            this.f19654x26b91764 = null;
            this.f19636x2f676f86 = new java.util.HashMap();
            this.f19639x88d541a7 = false;
            this.f19640xd2bbc9ba = 0;
            this.f19642xf7e2a88a = false;
            this.f19629xb350d4c7 = eBindCellularStrategy.ordinal();
        }
    }
}
