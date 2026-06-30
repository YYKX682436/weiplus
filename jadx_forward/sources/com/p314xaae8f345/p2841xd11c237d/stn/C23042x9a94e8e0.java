package com.p314xaae8f345.p2841xd11c237d.stn;

/* renamed from: com.tencent.paymars.stn.StnManager */
/* loaded from: classes12.dex */
public class C23042x9a94e8e0 extends com.p314xaae8f345.p2841xd11c237d.app.AbstractC23009x1e602b7c {

    /* renamed from: CONNECTED */
    public static final int f40269x839202e9 = 4;

    /* renamed from: CONNECTTING */
    public static final int f40270xe723dab8 = 3;

    /* renamed from: ECHECK_NEVER */
    public static int f40271xbc066f0 = 2;

    /* renamed from: ECHECK_NEXT */
    public static int f40272x21694def = 1;

    /* renamed from: ECHECK_NOW */
    public static int f40273x95b9143a = 0;

    /* renamed from: GATEWAY_FAILED */
    public static final int f40274xbfedc2b8 = 1;

    /* renamed from: INVALID_TASK_ID */
    public static final int f40275x2002f3ad = -1;

    /* renamed from: NETWORK_UNAVAILABLE */
    public static final int f40276xed440b7f = 0;

    /* renamed from: NETWORK_UNKNOWN */
    public static final int f40277x6a85d6f9 = -1;

    /* renamed from: RESP_FAIL_HANDLE_DEFAULT */
    public static int f40278x3a145b5c = -1;

    /* renamed from: RESP_FAIL_HANDLE_ECDH_VERSON_MISMATCH */
    public static int f40279x8296306 = -3800;

    /* renamed from: RESP_FAIL_HANDLE_NORMAL */
    public static int f40280x5593244c = 0;

    /* renamed from: RESP_FAIL_HANDLE_SESSION_TIMEOUT */
    public static int f40281x3eb546b3 = -13;

    /* renamed from: RESP_FAIL_HANDLE_TASK_END */
    public static int f40282xc9b14d26 = -14;

    /* renamed from: SERVER_DOWN */
    public static final int f40283x54d8441e = 5;

    /* renamed from: SERVER_FAILED */
    public static final int f40284x8275c0b9 = 2;

    /* renamed from: ectCancel */
    public static final int f40285x1b4619b0 = 10;

    /* renamed from: ectDial */
    public static final int f40286x8e484c26 = 2;

    /* renamed from: ectDns */
    public static final int f40287xb20255b3 = 3;

    /* renamed from: ectEnDecode */
    public static final int f40288x9a099dad = 7;

    /* renamed from: ectFalse */
    public static final int f40289x3ad9ef2d = 1;

    /* renamed from: ectHttp */
    public static final int f40290x8e4a493e = 5;

    /* renamed from: ectLocal */
    public static final int f40291x3b34b575 = 9;

    /* renamed from: ectNetMsgXP */
    public static final int f40292xb579ac52 = 6;

    /* renamed from: ectOK */
    public static final int f40293x5be03f2 = 0;

    /* renamed from: ectServer */
    public static final int f40294x36ce1a79 = 8;

    /* renamed from: ectSocket */
    public static final int f40295x37540aa9 = 4;

    /* renamed from: nativeHandle */
    protected long f40297x7b5cfd1f = 0;

    /* renamed from: callbackHandle */
    protected long f40296x429972cd = 0;

    /* renamed from: com.tencent.paymars.stn.StnManager$CallBack */
    /* loaded from: classes12.dex */
    public interface CallBack {
        /* renamed from: buf2Resp */
        int mo84610xa261f88f(int i17, java.lang.Object obj, java.lang.String str, byte[] bArr, int[] iArr, int[] iArr2, int i18, int[] iArr3);

        /* renamed from: getLongLinkIdentifyCheckBuffer */
        int mo84611xca682310(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream, java.io.ByteArrayOutputStream byteArrayOutputStream2, int[] iArr);

        /* renamed from: makesureAuthed */
        boolean mo84612x9780e92a(java.lang.String str, java.lang.String str2);

        /* renamed from: networkAnalysisCallBack */
        void mo84613x252d11af(int i17, int i18, boolean z17, java.lang.String str);

        /* renamed from: onLongLinkIdentifyResponse */
        boolean mo84614xae260522(java.lang.String str, byte[] bArr, byte[] bArr2);

        /* renamed from: onLongLinkNetworkError */
        void mo84615x3138c0af(com.p314xaae8f345.p2841xd11c237d.stn.EnumC23041xb875d68f enumC23041xb875d68f, int i17, java.lang.String str, int i18);

        /* renamed from: onLongLinkStatusChange */
        void mo84616x94a79e77(int i17);

        /* renamed from: onNewDns */
        java.lang.String[] mo84617x50705628(java.lang.String str, boolean z17);

        /* renamed from: onPush */
        void mo84618xc39e2999(java.lang.String str, int i17, int i18, byte[] bArr, byte[] bArr2);

        /* renamed from: onShortLinkNetworkError */
        void mo84619x2add591(com.p314xaae8f345.p2841xd11c237d.stn.EnumC23041xb875d68f enumC23041xb875d68f, int i17, java.lang.String str, java.lang.String str2, int i18);

        /* renamed from: onTaskEnd */
        int mo84620xf4053237(int i17, java.lang.Object obj, int i18, int i19, com.p314xaae8f345.p2841xd11c237d.stn.C23042x9a94e8e0.CgiProfile cgiProfile);

        /* renamed from: reportConnectStatus */
        void mo84621x83f14ca8(int i17, int i18);

        /* renamed from: reportTaskProfile */
        void mo84622x9db36690(java.lang.String str);

        /* renamed from: req2Buf */
        boolean mo84623x412ffa7f(int i17, java.lang.Object obj, java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream, int[] iArr, int i18, java.lang.String str2, int i19);

        /* renamed from: requestNetCheckShortLinkHosts */
        java.lang.String[] mo84624x4870e68f();

        /* renamed from: requestSync */
        void mo84625x448ca1ca();

        /* renamed from: trafficData */
        void mo84626x9e773f47(int i17, int i18);
    }

    /* renamed from: com.tencent.paymars.stn.StnManager$CgiProfile */
    /* loaded from: classes12.dex */
    public static class CgiProfile {

        /* renamed from: netType */
        public java.lang.String f40304x6dd19677;

        /* renamed from: taskStartTime */
        public long f40316xf3a4da4a = 0;

        /* renamed from: startTaskTick */
        public long f40315xef215744 = 0;

        /* renamed from: startTaskTS */
        public long f40314x916e51c6 = 0;

        /* renamed from: endTaskTick */
        public long f40302x8bec92bd = 0;

        /* renamed from: startConnectTime */
        public long f40308x1dff6d15 = 0;

        /* renamed from: connectSuccessfulTime */
        public long f40299x3c5af811 = 0;

        /* renamed from: startHandshakeTime */
        public long f40311xaadb8a22 = 0;

        /* renamed from: handshakeSuccessfulTime */
        public long f40303xdec0205e = 0;

        /* renamed from: startSendPacketTime */
        public long f40313x7cbbae1f = 0;

        /* renamed from: sendPacketFinishedTime */
        public long f40307xa27ccaf = 0;

        /* renamed from: startReadPacketTime */
        public long f40312x36d87ead = 0;

        /* renamed from: readPacketFinishedTime */
        public long f40306xc06a2f3d = 0;

        /* renamed from: startEncodePacketTime */
        public long f40310xd6a8aad = 0;

        /* renamed from: encodePacketFinishedTime */
        public long f40301x2f0af3bd = 0;

        /* renamed from: startDecodePacketTime */
        public long f40309x321f085 = 0;

        /* renamed from: decodePacketFinishedTime */
        public long f40300x974b0195 = 0;
        public long rtt = 0;

        /* renamed from: channelType */
        public int f40298x105746dd = 0;

        /* renamed from: protocolType */
        public int f40305x99985f2 = 0;
    }

    public C23042x9a94e8e0(long j17) {
        m84569x5a3c4034(j17);
    }

    /* renamed from: OnJniClearTask */
    public native void m84565xc12d96ec();

    /* renamed from: OnJniCreateStnManager */
    public native void m84566xc8b01c22();

    /* renamed from: OnJniCreateStnManagerFromContext */
    public native void m84567xfcb7a523(java.lang.Object obj);

    /* renamed from: OnJniCreateStnManagerFromContextHandle */
    public native void m84568x7789592b(long j17);

    /* renamed from: OnJniCreateStnManagerFromHandle */
    public native void m84569x5a3c4034(long j17);

    /* renamed from: OnJniDestroyStnManager */
    public native void m84570x899a63d4();

    /* renamed from: OnJniGenSequenceId */
    public native int m84571x5d20f4a6();

    /* renamed from: OnJniGenTaskID */
    public native int m84572x1ed64a();

    /* renamed from: OnJniHasTask */
    public native boolean m84573xd4d79b39(int i17);

    /* renamed from: OnJniKeepSignalling */
    public native void m84574xafebe6c9();

    /* renamed from: OnJniMakesureLongLinkConnected */
    public native void m84575x908f5bca();

    /* renamed from: OnJniRedoTask */
    public native void m84576x905e17e9();

    /* renamed from: OnJniReset */
    public native void m84577x91f60fc9();

    /* renamed from: OnJniResetAndInitEncoderVersion */
    public native void m84578x6892c33a(int i17, java.lang.String str);

    /* renamed from: OnJniSetBackupIPs */
    public native void m84579x61e5192e(java.lang.String str, java.lang.String[] strArr);

    /* renamed from: OnJniSetCallback */
    public native void m84580xf6496dc1(java.lang.Object obj);

    /* renamed from: OnJniSetDebugIP */
    public native void m84581x9df969be(java.lang.String str, java.lang.String str2);

    /* renamed from: OnJniSetLonglinkSvrAddr */
    public native void m84582x486c3cae(java.lang.String str, int[] iArr, java.lang.String str2);

    /* renamed from: OnJniSetShortlinkSvrAddr */
    public native void m84583x1b490126(int i17, java.lang.String str);

    /* renamed from: OnJniSetSignallingStrategy */
    public native void m84584xb094b6ad(long j17, long j18);

    /* renamed from: OnJniStartTask */
    public native void m84585x8e039281(com.p314xaae8f345.p2841xd11c237d.stn.C23042x9a94e8e0.Task task);

    /* renamed from: OnJniStopSignalling */
    public native void m84586x5780b06();

    /* renamed from: OnJniStopTask */
    public native void m84587x249023ed(int i17);

    /* renamed from: OnJniTouchTasks */
    public native void m84588x3101e555();

    /* renamed from: clearTask */
    public void m84589xb43f7172() {
        m84565xc12d96ec();
    }

    /* renamed from: genSequenceId */
    public int m84590x67161c2c() {
        return m84571x5d20f4a6();
    }

    /* renamed from: genTaskID */
    public int m84591xf330b0d0() {
        return m84572x1ed64a();
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.app.AbstractC23009x1e602b7c
    /* renamed from: getNativeHandle */
    public long mo84241xdc4f8f95() {
        return this.f40297x7b5cfd1f;
    }

    /* renamed from: hasTask */
    public boolean m84592x298a5f3f(int i17) {
        return m84573xd4d79b39(i17);
    }

    /* renamed from: keepSignalling */
    public void m84593xe49bb003() {
        m84574xafebe6c9();
    }

    /* renamed from: makesureLongLinkConnected */
    public void m84594x21976a50() {
        m84575x908f5bca();
    }

    /* renamed from: onCreate */
    public void m84595x3e5a77bb() {
        m84566xc8b01c22();
    }

    /* renamed from: onDestroy */
    public void m84596xac79a11b() {
        m84570x899a63d4();
        this.f40297x7b5cfd1f = 0L;
        this.f40296x429972cd = 0L;
    }

    /* renamed from: redoTask */
    public void m84597xd203d4a3() {
        m84576x905e17e9();
    }

    /* renamed from: reset */
    public void m84598x6761d4f() {
        m84577x91f60fc9();
    }

    /* renamed from: resetAndInitEncoderVersion */
    public void m84599xf88c8574(int i17, java.lang.String str) {
        m84578x6892c33a(i17, str);
    }

    /* renamed from: setBackupIPs */
    public void m84600xac89e8e8(java.lang.String str, java.lang.String[] strArr) {
        m84579x61e5192e(str, strArr);
    }

    /* renamed from: setCallback */
    public void m84601x6c4ebec7(com.p314xaae8f345.p2841xd11c237d.stn.C23042x9a94e8e0.CallBack callBack) {
        m84580xf6496dc1(callBack);
    }

    /* renamed from: setDebugIP */
    public void m84602xd22dff8(java.lang.String str, java.lang.String str2) {
        m84581x9df969be(str, str2);
    }

    /* renamed from: setLonglinkSvrAddr */
    public void m84603xa140d8e8(java.lang.String str, int[] iArr, java.lang.String str2) {
        m84582x486c3cae(str, iArr, str2);
    }

    /* renamed from: setShortlinkSvrAddr */
    public void m84604xdd07ec2c(int i17, java.lang.String str) {
        m84583x1b490126(i17, str);
    }

    /* renamed from: setSignallingStrategy */
    public void m84605xfe44f833(long j17, long j18) {
        m84584xb094b6ad(j17, j18);
    }

    /* renamed from: startTask */
    public void m84606x81156d07(com.p314xaae8f345.p2841xd11c237d.stn.C23042x9a94e8e0.Task task) {
        m84585x8e039281(task);
    }

    /* renamed from: stopSignalling */
    public void m84607x3a27d440() {
        m84586x5780b06();
    }

    /* renamed from: stopTask */
    public void m84608x6635e0a7(int i17) {
        m84587x249023ed(i17);
    }

    /* renamed from: touchTasks */
    public void m84609xa02b5b8f() {
        m84588x3101e555();
    }

    /* renamed from: com.tencent.paymars.stn.StnManager$Task */
    /* loaded from: classes12.dex */
    public static class Task {

        /* renamed from: EBoth */
        public static final int f40317x3ec0566 = 3;

        /* renamed from: EFAST */
        public static final int f40318x3ed2621 = 1;

        /* renamed from: ELong */
        public static final int f40319x3f09061 = 2;

        /* renamed from: ENORMAL */
        public static final int f40320xcba7a96c = 0;

        /* renamed from: EShort */
        public static final int f40321x7a80f737 = 1;

        /* renamed from: ETASK_PRIORITY_0 */
        public static final int f40322xcf3f5c6a = 0;

        /* renamed from: ETASK_PRIORITY_1 */
        public static final int f40323xcf3f5c6b = 1;

        /* renamed from: ETASK_PRIORITY_2 */
        public static final int f40324xcf3f5c6c = 2;

        /* renamed from: ETASK_PRIORITY_3 */
        public static final int f40325xcf3f5c6d = 3;

        /* renamed from: ETASK_PRIORITY_4 */
        public static final int f40326xcf3f5c6e = 4;

        /* renamed from: ETASK_PRIORITY_5 */
        public static final int f40327xcf3f5c6f = 5;

        /* renamed from: ETASK_PRIORITY_HIGHEST */
        public static final int f40328x3ed0853e = 0;

        /* renamed from: ETASK_PRIORITY_LOWEST */
        public static final int f40329xc72561b8 = 5;

        /* renamed from: ETASK_PRIORITY_NORMAL */
        public static final int f40330xca8ce8ed = 3;

        /* renamed from: ETransportProtocolQUIC */
        public static final int f40331x8c540f5a = 2;

        /* renamed from: ETransportProtocolTCP */
        public static final int f40332xb1f23b25 = 1;

        /* renamed from: bindCellular */
        public boolean f40333xb350d4c7;
        public java.lang.String cgi;

        /* renamed from: cgiID */
        public long f40334x5a37c60;

        /* renamed from: channelSelect */
        public int f40335x54d08fdf;

        /* renamed from: channelStrategy */
        public int f40336x8675d196;

        /* renamed from: clientSequenceId */
        public int f40337x149c62e7;

        /* renamed from: cmdID */
        public int f40338x5a623d5;

        /* renamed from: extraInfo */
        public java.util.Map<java.lang.String, java.lang.String> f40339xf0e1e4de;

        /* renamed from: headers */
        public java.util.Map<java.lang.String, java.lang.String> f40340x2f676f86;

        /* renamed from: limitFlow */
        public boolean f40341x67f26b89;

        /* renamed from: limitFrequency */
        public boolean f40342x9a4c5be1;

        /* renamed from: longPolling */
        public boolean f40343x88d541a7;

        /* renamed from: longPollingTimeout */
        public int f40344xd2bbc9ba;

        /* renamed from: needAuthed */
        public boolean f40345x91e64c7d;

        /* renamed from: needRealtimeNetInfo */
        public boolean f40346xf7e2a88a;

        /* renamed from: networkStatusSensitive */
        public boolean f40347x77af6ab6;

        /* renamed from: priority */
        public int f40348xba8879a4;

        /* renamed from: retryCount */
        public int f40349xbaa1a747;

        /* renamed from: sendOnly */
        public boolean f40350x4a585f54;

        /* renamed from: serverProcessCost */
        public int f40351x510cd399;

        /* renamed from: shortLinkHostList */
        public java.util.ArrayList<java.lang.String> f40352xba767f1c;

        /* renamed from: taskID */
        public int f40353xcb7ef160;

        /* renamed from: totalTimeout */
        public int f40354xd2c4957d;

        /* renamed from: userContext */
        public java.lang.Object f40355x26b91764;

        public Task(com.p314xaae8f345.p2841xd11c237d.app.C23011x9befcd8f c23011x9befcd8f) {
            this.f40349xbaa1a747 = -1;
            this.f40353xcb7ef160 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4558x4e42091.m40133xf330b0f0();
            this.f40340x2f676f86 = new java.util.HashMap();
        }

        public Task(com.p314xaae8f345.p2841xd11c237d.app.C23011x9befcd8f c23011x9befcd8f, int i17, int i18, java.lang.String str, java.util.ArrayList<java.lang.String> arrayList) {
            this.f40349xbaa1a747 = -1;
            this.f40353xcb7ef160 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4558x4e42091.m40133xf330b0f0();
            this.f40335x54d08fdf = i17;
            this.f40338x5a623d5 = i18;
            this.cgi = str;
            this.f40352xba767f1c = arrayList;
            this.f40350x4a585f54 = false;
            this.f40345x91e64c7d = true;
            this.f40341x67f26b89 = true;
            this.f40342x9a4c5be1 = true;
            this.f40336x8675d196 = 0;
            this.f40347x77af6ab6 = false;
            this.f40348xba8879a4 = 3;
            this.f40349xbaa1a747 = -1;
            this.f40351x510cd399 = 0;
            this.f40354xd2c4957d = 0;
            this.f40355x26b91764 = null;
            this.f40340x2f676f86 = new java.util.HashMap();
            this.f40343x88d541a7 = false;
            this.f40344xd2bbc9ba = 0;
            this.f40346xf7e2a88a = false;
            this.f40333xb350d4c7 = false;
        }
    }

    public C23042x9a94e8e0(com.p314xaae8f345.p2841xd11c237d.app.C23011x9befcd8f c23011x9befcd8f) {
        m84567xfcb7a523(c23011x9befcd8f);
    }
}
