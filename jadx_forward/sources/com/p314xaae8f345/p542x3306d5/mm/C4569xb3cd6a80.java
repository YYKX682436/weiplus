package com.p314xaae8f345.p542x3306d5.mm;

/* renamed from: com.tencent.mars.mm.MMStnManager */
/* loaded from: classes12.dex */
public class C4569xb3cd6a80 extends com.p314xaae8f345.p542x3306d5.app.AbstractC4441x1e602b7c {

    /* renamed from: MM_STAT_CGI_INFO */
    public static final int f19418xe5399d74 = 1;

    /* renamed from: MM_STAT_CGI_NETWORK_COST */
    public static final int f19419x31762e24 = 7;

    /* renamed from: MM_STAT_DNS */
    public static final int f19420xc589e85d = 8;

    /* renamed from: MM_STAT_LONGLINK_BUILD */
    public static final int f19421x1feb4d71 = 3;

    /* renamed from: MM_STAT_LONGLINK_CONNECT */
    public static final int f19422xfd3e472d = 4;

    /* renamed from: MM_STAT_LONGLINK_DISCONNECT */
    public static final int f19423x8036c359 = 5;

    /* renamed from: MM_STAT_LONGLINK_FUNC_CONNECT */
    public static final int f19424xcca685cc = 6;

    /* renamed from: MM_STAT_NETWORK_UNREACHABLE */
    public static final int f19425xfb0db557 = 2;

    /* renamed from: MM_Stat_Local_GetHostByName */
    public static final int f19426x3ca568a0 = 11;

    /* renamed from: MM_Stat_Network_Changed */
    public static final int f19427xc8e62d7 = 10;

    /* renamed from: MM_Stat_Noop_Send */
    public static final int f19428xb7ad9eb9 = 9;
    protected static final java.lang.String TAG = "Mars.MMStnManager";

    /* renamed from: mCallBack */
    public com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.CallBack f19430x1aab3bf2;

    /* renamed from: nativeHandle */
    protected long f19431x7b5cfd1f = 0;

    /* renamed from: callbackHandle */
    protected long f19429x429972cd = 0;

    /* renamed from: com.tencent.mars.mm.MMStnManager$CallBack */
    /* loaded from: classes12.dex */
    public interface CallBack {
        /* renamed from: OnActionNotify */
        int mo659x8a9f58be(java.lang.String str, long j17, byte[] bArr, byte[] bArr2, byte[] bArr3, long j18);

        /* renamed from: ackActionNotify */
        int mo660x708d4848(java.lang.String str, long j17, int i17);

        /* renamed from: addMMNetCommonCallback */
        void mo661x7433764c(android.os.IInterface iInterface);

        /* renamed from: buf2Resp */
        int mo662xa261f88f(int i17, java.lang.Object obj, java.lang.String str, byte[] bArr, int[] iArr, int[] iArr2, int i18, int[] iArr3);

        /* renamed from: doCertificateVerify */
        int mo663x2f1063a5(java.lang.String str, byte[][] bArr);

        /* renamed from: doLiveSpeedTest */
        int mo664x17921322(java.lang.String str, int i17, int i18, int i19, int i27, byte[] bArr, byte[] bArr2, android.os.IInterface iInterface);

        /* renamed from: doNetIdRequest */
        void mo665xed157802();

        /* renamed from: getCurLanguage */
        java.lang.String mo666xbdfe8082();

        /* renamed from: getHostByName */
        int mo667x8faab340(java.lang.String str, java.util.List<java.lang.String> list);

        /* renamed from: getIntegerExpt */
        java.lang.String mo668x96e271f();

        /* renamed from: getJavaActionId */
        int mo669x641430a9(long j17);

        /* renamed from: getLogIdSubType */
        int mo670x47ecc391(long j17, java.lang.String str);

        /* renamed from: getSnsIpsForScene */
        int mo671x65185ded(java.util.List<java.lang.String> list, boolean z17);

        /* renamed from: getSnsIpsForSceneWithHostName */
        int mo672x77eff5c6(java.util.List<java.lang.String> list, java.lang.String str, boolean z17);

        /* renamed from: getUserIDCLocale */
        java.lang.String mo673xfa8df3e1();

        /* renamed from: getXAgreementId */
        int mo674xb4bebfa3();

        /* renamed from: ifUseNewNetId */
        java.lang.String mo675xe56f1322();

        /* renamed from: isOverseasUser */
        int mo676x6682a70d();

        /* renamed from: networkAnalysisCallBack */
        void mo677x252d11af(int i17, int i18, boolean z17, java.lang.String str);

        /* renamed from: notifyNewSpeedTestReport */
        void mo678xc058cd76(byte[] bArr, int i17, int i18, int i19, int i27, java.lang.String str, int i28, java.lang.String str2, int i29, int i37);

        /* renamed from: notifyPayCgiNewDnsTagIncorrect */
        void mo679x5825913a(int i17, java.lang.String str);

        /* renamed from: notifyPayCgiNewDnsTagMiss */
        void mo680x47b0a247(int i17, java.lang.String str);

        /* renamed from: notifyStnWeaknet */
        void mo681x31a1e061(boolean z17);

        /* renamed from: onDisasterNodeNotify */
        void mo682x12aa61eb(java.lang.String str);

        /* renamed from: onLiveSpeedTestCallback */
        void mo683xce1830b3(com.p314xaae8f345.p542x3306d5.mm.C4567xf5d28c4a c4567xf5d28c4a, boolean z17);

        /* renamed from: onOOBNotify */
        void mo684x851b014c(java.lang.String str);

        /* renamed from: receiveWeakNetNotify */
        void mo685x7797f08b(boolean z17, int i17);

        /* renamed from: removeMMNetCommonCallback */
        void mo686x7b24ad89(android.os.IInterface iInterface);

        /* renamed from: reportFlow */
        void mo687x73181082(int i17, int i18, int i19, int i27);

        /* renamed from: reportGroupIDKey */
        void mo688xc9114479(int[] iArr, int[] iArr2, int[] iArr3, int i17, boolean z17, boolean z18);

        /* renamed from: reportIDKey */
        void mo689xf0018e90(long j17, long j18, long j19, boolean z17);

        /* renamed from: reportKV */
        void mo690xe68be19f(long j17, java.lang.String str, boolean z17, boolean z18, long j18, boolean z19);

        /* renamed from: reportStat */
        void mo691x731e15a8(com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.ReportInfo reportInfo);

        /* renamed from: req2Buf */
        boolean mo692x412ffa7f(int i17, java.lang.Object obj, java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream, int[] iArr, int i18, java.lang.String str2, int i19);

        /* renamed from: simpleTestCommand */
        void mo693x19d1d47(java.lang.String str);
    }

    /* renamed from: com.tencent.mars.mm.MMStnManager$ReportInfo */
    /* loaded from: classes12.dex */
    public static class ReportInfo {

        /* renamed from: actionId */
        public long f19432x9d48d1f1 = 0;

        /* renamed from: rtType */
        public long f19465xc913209c = 0;

        /* renamed from: beginTime */
        public long f19433xc00dc316 = 0;

        /* renamed from: endTime */
        public long f19442xa0336a48 = 0;

        /* renamed from: ip, reason: collision with root package name */
        public java.lang.String f134066ip = "";

        /* renamed from: port */
        public int f19459x349881 = 0;

        /* renamed from: isSocket */
        public boolean f19451xf2b5113d = false;

        /* renamed from: netType */
        public int f19454x6dd19677 = 0;

        /* renamed from: ipType */
        public int f19450xb97f2501 = 0;

        /* renamed from: sendSize */
        public long f19466x4a5a1fa9 = 0;

        /* renamed from: recvSize */
        public long f19460xd0b14b07 = 0;

        /* renamed from: errType */
        public int f19444xa7cc523f = 0;

        /* renamed from: errCode */
        public int f19443xa7c470f2 = 0;

        /* renamed from: netSignal */
        public long f19453x3d2b9aa5 = 0;

        /* renamed from: retryCount */
        public int f19464xbaa1a747 = 0;

        /* renamed from: expand1 */
        public long f19445xb1f2f4d7 = 0;

        /* renamed from: clientIp */
        public java.lang.String f19434x36253652 = "";

        /* renamed from: expand2 */
        public long f19446xb1f2f4d8 = 0;

        /* renamed from: newNetType */
        public int f19455x914470b7 = 0;

        /* renamed from: subNetType */
        public int f19467x1581e817 = 0;

        /* renamed from: extraInfo */
        public java.lang.String f19447xf0e1e4de = "";

        /* renamed from: host */
        public java.lang.String f19449x30f5a8 = "";

        /* renamed from: endStep */
        public int f19441xa0331e47 = 0;

        /* renamed from: newdnsCostTime */
        public long f19456x60be8ae3 = 0;

        /* renamed from: newdnsErrType */
        public int f19458x92f61676 = 0;

        /* renamed from: newdnsErrCode */
        public int f19457x92ee3529 = 0;

        /* renamed from: dnsSvrIp */
        public java.lang.String f19439x17e9444d = "";

        /* renamed from: dnsCostTime */
        public long f19437xa62c7883 = 0;

        /* renamed from: dnsErrType */
        public int f19438xd743f4d6 = 0;

        /* renamed from: connCostTime */
        public long f19435x205cef86 = 0;

        /* renamed from: firstPkgTime */
        public long f19448xdc6c11e9 = 0;

        /* renamed from: endFlag */
        public int f19440xa02d16e7 = 0;

        /* renamed from: connTotalCostTime */
        public long f19436xc1670bd2 = 0;

        /* renamed from: usedIpIndex */
        public int f19468xb576b96e = 0;

        /* renamed from: localIp */
        public int f19452x142bb9f2 = 0;

        /* renamed from: refTime1 */
        public int f19461xd3fac231 = 0;

        /* renamed from: refTime2 */
        public int f19462xd3fac232 = 0;

        /* renamed from: refTime3 */
        public int f19463xd3fac233 = 0;

        /* renamed from: toString */
        public java.lang.String m40278x9616526c() {
            return java.lang.String.format("actionId:%d, rtType:%d, begin:%d, end:%d, cost:%d, ip:%s, port:%d, isSocket:%b, netType:%d, ipType:%d, sendSize:%d, recvSize:%d, errType:%d, errCode:%d, netSignal:%d, retryCount:%d, expand1:%d, clientip:%s, expand2:%d, newNetType:%d, subNetType:%d, extraInfo:%s, host:%s, endStep:%d, endFlag:%d", java.lang.Long.valueOf(this.f19432x9d48d1f1), java.lang.Long.valueOf(this.f19465xc913209c), java.lang.Long.valueOf(this.f19433xc00dc316), java.lang.Long.valueOf(this.f19442xa0336a48), java.lang.Long.valueOf(this.f19442xa0336a48 - this.f19433xc00dc316), this.f134066ip, java.lang.Integer.valueOf(this.f19459x349881), java.lang.Boolean.valueOf(this.f19451xf2b5113d), java.lang.Integer.valueOf(this.f19454x6dd19677), java.lang.Integer.valueOf(this.f19450xb97f2501), java.lang.Long.valueOf(this.f19466x4a5a1fa9), java.lang.Long.valueOf(this.f19460xd0b14b07), java.lang.Integer.valueOf(this.f19444xa7cc523f), java.lang.Integer.valueOf(this.f19443xa7c470f2), java.lang.Long.valueOf(this.f19453x3d2b9aa5), java.lang.Integer.valueOf(this.f19464xbaa1a747), java.lang.Long.valueOf(this.f19445xb1f2f4d7), this.f19434x36253652, java.lang.Long.valueOf(this.f19446xb1f2f4d8), java.lang.Integer.valueOf(this.f19455x914470b7), java.lang.Integer.valueOf(this.f19467x1581e817), this.f19447xf0e1e4de, this.f19449x30f5a8, java.lang.Integer.valueOf(this.f19441xa0331e47), java.lang.Integer.valueOf(this.f19440xa02d16e7));
        }
    }

    public C4569xb3cd6a80(long j17) {
        m40192x95381154(j17);
    }

    /* renamed from: OnJniAddHostInfo */
    public native void m40187x3df91531(java.lang.String[] strArr, java.lang.String[] strArr2, int[] iArr);

    /* renamed from: OnJniClearLocalHostCache */
    public native void m40188x3acb8836();

    /* renamed from: OnJniClearMMtlsForbidenHostAndPsk */
    public native void m40189xf36cd26a();

    /* renamed from: OnJniCombineGetHostIps */
    public native void m40190x5b424747(java.lang.String str, int i17, int i18, com.p314xaae8f345.p542x3306d5.mm.C4566xebd53123 c4566xebd53123);

    /* renamed from: OnJniCreateMMStnManagerFromContext */
    public native void m40191x2135f803(java.lang.Object obj);

    /* renamed from: OnJniCreateMMStnManagerFromHandle */
    public native void m40192x95381154(long j17);

    /* renamed from: OnJniDestroyMMStnManager */
    public native void m40193xf75ff874();

    /* renamed from: OnJniDoLiveSpeedTest */
    public native void m40194xb648b51c(java.lang.String str, int i17, int i18, int i19, int i27, com.p314xaae8f345.p542x3306d5.mm.C4575x2505020e c4575x2505020e, int i28);

    /* renamed from: OnJniForceAsyncRefreshNewdns */
    public native void m40195x9ce476d();

    /* renamed from: OnJniForceUseV6 */
    public native void m40196x9851b402(boolean z17);

    /* renamed from: OnJniGetHostIps */
    public native void m40197x10202ef4(java.lang.String str, com.p314xaae8f345.p542x3306d5.mm.C4566xebd53123 c4566xebd53123);

    /* renamed from: OnJniGetIPsString */
    public native java.lang.String[] m40198x52df190d(boolean z17);

    /* renamed from: OnJniGetIspId */
    public native java.lang.String m40199x32f581d1();

    /* renamed from: OnJniGetLocalHostList */
    public native void m40200x8ddb0881(java.lang.String[] strArr, java.lang.String str);

    /* renamed from: OnJniGetMMtlsRegion */
    public native int m40201xdbb88bdf();

    /* renamed from: OnJniGetMarsTimestamp */
    public native long m40202xf3277b51();

    /* renamed from: OnJniGetNetworkId */
    public native com.p314xaae8f345.p542x3306d5.mm.C4574xe5297c17 m40203x2fbc3179(java.lang.String str);

    /* renamed from: OnJniGetNetworkServerIp */
    public native java.lang.String m40204x91ce59a8();

    /* renamed from: OnJniGetRecentConnectRecords */
    public native com.p314xaae8f345.p542x3306d5.mm.C4564xe93729bb[] m40205xea65da3(int i17, int i18);

    /* renamed from: OnJniGetSnsIps */
    public native void m40206x3c861804(boolean z17, com.p314xaae8f345.p542x3306d5.mm.C4566xebd53123 c4566xebd53123);

    /* renamed from: OnJniGetSnsIpsWithHostName */
    public native void m40207x345c455d(java.lang.String str, boolean z17, com.p314xaae8f345.p542x3306d5.mm.C4566xebd53123 c4566xebd53123);

    /* renamed from: OnJniMMAckActionNotify */
    public native int m40208x31e94e22(java.lang.String str, long j17, int i17);

    /* renamed from: OnJniRecoverLinkAddrs */
    public native void m40209x9fc8f0a();

    /* renamed from: OnJniReportCGIServerError */
    public native void m40210xa1d4db5a(int i17, int i18);

    /* renamed from: OnJniReportFailIp */
    public native void m40211xc2134b7f(java.lang.String str);

    /* renamed from: OnJniReportV6Status */
    public native void m40212xc666ac(boolean z17);

    /* renamed from: OnJniSaveAuthLongList */
    public native void m40213x449ac665(java.lang.Object obj, int[] iArr);

    /* renamed from: OnJniSaveAuthShortList */
    public native void m40214xcf46b76f(java.lang.Object obj, int[] iArr);

    /* renamed from: OnJniSetCallback */
    public native void m40215xf6496dc1(java.lang.Object obj);

    /* renamed from: OnJniSetCgiDebugIP */
    public native void m40216x8cd79cf1(java.lang.String str, java.lang.String str2, int i17);

    /* renamed from: OnJniSetDebugHost */
    public native void m40217x546009f(java.lang.String str);

    /* renamed from: OnJniSetDebugIP */
    public native void m40218x9df969be(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4);

    /* renamed from: OnJniSetHostInfo */
    public native void m40219xee9e07f2(java.lang.String[] strArr, java.lang.String[] strArr2, int[] iArr);

    /* renamed from: OnJniSetMMTlsHostInfo */
    public native void m40220xdd3b9ef5(java.lang.String[] strArr, int[] iArr);

    /* renamed from: OnJniSetMMtlsRegion */
    public native void m40221x721dff53(int i17);

    /* renamed from: OnJniSetMmtlsCtrlInfo */
    public native void m40222x6efa5638(boolean z17);

    /* renamed from: OnJniSetNetIdAndIsp */
    public native void m40223x84194deb(java.lang.String str, java.lang.String str2, java.lang.String str3);

    /* renamed from: OnJniSetNetworkId */
    public native void m40224x8c0ff1ed(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17);

    /* renamed from: OnJniSetNewDnsDebugHost */
    public native void m40225x88225436(java.lang.String str, java.lang.String str2);

    /* renamed from: OnJniSetPayNewDnsDebugHosts */
    public native void m40226x940e734d(java.lang.Object obj, boolean z17);

    /* renamed from: OnJniStartNetworkAnalysis */
    public native void m40227xa15dd0ae();

    /* renamed from: OnJniSwitchProcessActiveState */
    public native void m40228xc433ccd6(boolean z17);

    /* renamed from: OnJniTestReportFlush */
    public native void m40229x6751ec38();

    /* renamed from: addHostInfo */
    public void m40230xb3fe6637(java.lang.String[] strArr, java.lang.String[] strArr2, int[] iArr) {
        m40187x3df91531(strArr, strArr2, iArr);
    }

    /* renamed from: addMMNetCommonCallback */
    public void m40231x7433764c(android.os.IInterface iInterface) {
        com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.CallBack callBack = this.f19430x1aab3bf2;
        if (callBack == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "mCallBack is null");
        } else {
            callBack.mo661x7433764c(iInterface);
        }
    }

    /* renamed from: clearLocalHostCache */
    public void m40232xfc8a733c() {
        m40188x3acb8836();
    }

    /* renamed from: clearMMtlsForbidenHostAndPsk */
    public void m40233x6bfeee24() {
        m40189xf36cd26a();
    }

    /* renamed from: combineGetHostIps */
    public int m40234x8fac3bcd(java.lang.String str, int i17, int i18, java.util.List<java.lang.String> list) {
        java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.mm.C4566xebd53123 c4566xebd53123 = new com.p314xaae8f345.p542x3306d5.mm.C4566xebd53123();
        m40190x5b424747(str, i17, i18, c4566xebd53123);
        for (int i19 = 0; i19 < c4566xebd53123.f19386xbe0e3ae6; i19++) {
            list.add(c4566xebd53123.f19385xac04aca4[i19]);
        }
        return c4566xebd53123.f19387x368f3a;
    }

    /* renamed from: doLiveSpeedTest */
    public int m40235x17921322(java.lang.String str, int i17, int i18, int i19, int i27, byte[] bArr, byte[] bArr2, android.os.IInterface iInterface) {
        com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.CallBack callBack = this.f19430x1aab3bf2;
        if (callBack == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "mCallBack is null");
            return 0;
        }
        return callBack.mo664x17921322(str, i17, i18, i19, i27, bArr, bArr2, iInterface);
    }

    /* renamed from: forceAsyncRefreshNewdns */
    public void m40237xac743f73() {
        m40195x9ce476d();
    }

    /* renamed from: forceUseV6 */
    public void m40238x77b2a3c(boolean z17) {
        m40196x9851b402(z17);
    }

    /* renamed from: getHostByName */
    public int m40239x8faab340(java.lang.String str, java.util.List<java.lang.String> list) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.mm.C4566xebd53123 c4566xebd53123 = new com.p314xaae8f345.p542x3306d5.mm.C4566xebd53123();
        m40240x7f49a52e(str, c4566xebd53123);
        for (int i17 = 0; i17 < c4566xebd53123.f19386xbe0e3ae6; i17++) {
            list.add(c4566xebd53123.f19385xac04aca4[i17]);
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.ReportInfo reportInfo = new com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.ReportInfo();
        reportInfo.f19432x9d48d1f1 = 11L;
        reportInfo.f19433xc00dc316 = currentTimeMillis;
        reportInfo.f19442xa0336a48 = currentTimeMillis2;
        reportInfo.f19434x36253652 = str;
        reportInfo.f134066ip = c4566xebd53123.f19386xbe0e3ae6 > 0 ? c4566xebd53123.f19385xac04aca4[0] : "0.0.0.0";
        return c4566xebd53123.f19387x368f3a;
    }

    /* renamed from: getHostIps */
    public void m40240x7f49a52e(java.lang.String str, com.p314xaae8f345.p542x3306d5.mm.C4566xebd53123 c4566xebd53123) {
        m40197x10202ef4(str, c4566xebd53123);
    }

    /* renamed from: getIPsString */
    public java.lang.String[] m40241x9d83e8c7(boolean z17) {
        return m40198x52df190d(z17);
    }

    /* renamed from: getIspId */
    public java.lang.String m40242x749b3e8b() {
        return m40199x32f581d1();
    }

    /* renamed from: getLocalHostList */
    public void m40243x55bd6b3b(java.lang.String[] strArr, java.lang.String str) {
        m40200x8ddb0881(strArr, str);
    }

    /* renamed from: getMMtlsRegion */
    public int m40244x10685519() {
        return m40201xdbb88bdf();
    }

    /* renamed from: getMarsTimestamp */
    public long m40245xbb09de0b() {
        return m40202xf3277b51();
    }

    @Override // com.p314xaae8f345.p542x3306d5.app.AbstractC4441x1e602b7c
    /* renamed from: getNativeHandle */
    public long mo37556xdc4f8f95() {
        return this.f19431x7b5cfd1f;
    }

    /* renamed from: getNetworkId */
    public com.p314xaae8f345.p542x3306d5.mm.C4574xe5297c17 m40246x7a610133(java.lang.String str) {
        return m40203x2fbc3179(str);
    }

    /* renamed from: getNetworkServerIp */
    public java.lang.String m40247xeaa2f5e2() {
        return m40204x91ce59a8();
    }

    /* renamed from: getRecentConnectRecords */
    public com.p314xaae8f345.p542x3306d5.mm.C4564xe93729bb[] m40248xb14c55a9(int i17, int i18) {
        return m40205xea65da3(i17, i18);
    }

    /* renamed from: getSnsIps */
    public void m40249x2f97f28a(boolean z17, com.p314xaae8f345.p542x3306d5.mm.C4566xebd53123 c4566xebd53123) {
        m40206x3c861804(z17, c4566xebd53123);
    }

    /* renamed from: getSnsIpsForScene */
    public int m40250x65185ded(java.util.List<java.lang.String> list, boolean z17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.mm.C4566xebd53123 c4566xebd53123 = new com.p314xaae8f345.p542x3306d5.mm.C4566xebd53123();
        m40249x2f97f28a(z17, c4566xebd53123);
        for (int i17 = 0; i17 < c4566xebd53123.f19386xbe0e3ae6; i17++) {
            list.add(c4566xebd53123.f19385xac04aca4[i17]);
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.ReportInfo reportInfo = new com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.ReportInfo();
        reportInfo.f19432x9d48d1f1 = 11L;
        reportInfo.f19433xc00dc316 = currentTimeMillis;
        reportInfo.f19442xa0336a48 = currentTimeMillis2;
        reportInfo.f19434x36253652 = "mmsns.qpic.cn";
        reportInfo.f134066ip = c4566xebd53123.f19386xbe0e3ae6 > 0 ? c4566xebd53123.f19385xac04aca4[0] : "0.0.0.0";
        return c4566xebd53123.f19387x368f3a;
    }

    /* renamed from: getSnsIpsForSceneWithHostName */
    public int m40251x77eff5c6(java.util.List<java.lang.String> list, java.lang.String str, boolean z17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.mm.C4566xebd53123 c4566xebd53123 = new com.p314xaae8f345.p542x3306d5.mm.C4566xebd53123();
        m40252x820c86e3(str, z17, c4566xebd53123);
        for (int i17 = 0; i17 < c4566xebd53123.f19386xbe0e3ae6; i17++) {
            list.add(c4566xebd53123.f19385xac04aca4[i17]);
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.ReportInfo reportInfo = new com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.ReportInfo();
        reportInfo.f19432x9d48d1f1 = 11L;
        reportInfo.f19433xc00dc316 = currentTimeMillis;
        reportInfo.f19442xa0336a48 = currentTimeMillis2;
        reportInfo.f19434x36253652 = str;
        reportInfo.f134066ip = c4566xebd53123.f19386xbe0e3ae6 > 0 ? c4566xebd53123.f19385xac04aca4[0] : "0.0.0.0";
        return c4566xebd53123.f19387x368f3a;
    }

    /* renamed from: getSnsIpsWithHostName */
    public void m40252x820c86e3(java.lang.String str, boolean z17, com.p314xaae8f345.p542x3306d5.mm.C4566xebd53123 c4566xebd53123) {
        m40207x345c455d(str, z17, c4566xebd53123);
    }

    /* renamed from: mmAckActionNotify */
    public int m40253x988efe88(java.lang.String str, long j17, int i17) {
        return m40208x31e94e22(str, j17, i17);
    }

    /* renamed from: onDestroy */
    public void m40254xac79a11b() {
        m40193xf75ff874();
        this.f19431x7b5cfd1f = 0L;
        this.f19429x429972cd = 0L;
    }

    /* renamed from: recoverLinkAddrs */
    public void m40255xd1def1c4() {
        m40209x9fc8f0a();
    }

    /* renamed from: removeMMNetCommonCallback */
    public void m40256x7b24ad89(android.os.IInterface iInterface) {
        com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.CallBack callBack = this.f19430x1aab3bf2;
        if (callBack == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "mCallBack is null");
        } else {
            callBack.mo686x7b24ad89(iInterface);
        }
    }

    /* renamed from: reportCGIServerError */
    public void m40257x17f35114(int i17, int i18) {
        m40210xa1d4db5a(i17, i18);
    }

    /* renamed from: reportFailIp */
    public void m40258xcb81b39(java.lang.String str) {
        m40211xc2134b7f(str);
    }

    /* renamed from: reportV6Status */
    public void m40259x35762fe6(boolean z17) {
        m40212xc666ac(z17);
    }

    /* renamed from: saveAuthLongList */
    public void m40260xc7d291f(java.lang.Object obj, int[] iArr) {
        m40213x449ac665(obj, iArr);
    }

    /* renamed from: saveAuthShortList */
    public void m40261x3b0abf5(java.lang.Object obj, int[] iArr) {
        m40214xcf46b76f(obj, iArr);
    }

    /* renamed from: setCallback */
    public void m40262x6c4ebec7(com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.CallBack callBack) {
        this.f19430x1aab3bf2 = callBack;
        m40215xf6496dc1(callBack);
    }

    /* renamed from: setCgiDebugIP */
    public void m40263x96ccc477(java.lang.String str, java.lang.String str2, int i17) {
        m40216x8cd79cf1(str, str2, i17);
    }

    /* renamed from: setDebugHost */
    public void m40264x4fead059(java.lang.String str) {
        m40217x546009f(str);
    }

    /* renamed from: setDebugIP */
    public void m40265xd22dff8(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        m40218x9df969be(str, str2, str3, str4);
    }

    /* renamed from: setHostInfo */
    public void m40266x64a358f8(java.lang.String[] strArr, java.lang.String[] strArr2, int[] iArr) {
        m40219xee9e07f2(strArr, strArr2, iArr);
    }

    /* renamed from: setMMTlsHostInfo */
    public void m40267xa51e01af(java.lang.String[] strArr, int[] iArr) {
        m40220xdd3b9ef5(strArr, iArr);
    }

    /* renamed from: setMMtlsRegion */
    public void m40268xa6cdc88d(int i17) {
        m40221x721dff53(i17);
    }

    /* renamed from: setMmtlsCtrlInfo */
    public void m40269x36dcb8f2(boolean z17) {
        m40222x6efa5638(z17);
    }

    /* renamed from: setNetIdAndIsp */
    public void m40270xb8c91725(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        m40223x84194deb(str, str2, str3);
    }

    /* renamed from: setNetworkId */
    public void m40271xd6b4c1a7(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        m40224x8c0ff1ed(str, str2, str3, i17);
    }

    /* renamed from: setNewDnsDebugHost */
    public void m40272xe0f6f070(java.lang.String str, java.lang.String str2) {
        m40225x88225436(str, str2);
    }

    /* renamed from: setPayNewDnsDebugHosts */
    public void m40273xfc666287(java.util.Map<java.lang.String, java.lang.String> map, boolean z17) {
        m40226x940e734d(map, z17);
    }

    /* renamed from: simpleTestCommand */
    public void m40274x19d1d47(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.CallBack callBack = this.f19430x1aab3bf2;
        if (callBack == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "mCallBack is null");
        } else {
            callBack.mo693x19d1d47(str);
        }
    }

    /* renamed from: startNetworkAnalysis */
    public void m40275x177c4668() {
        m40227xa15dd0ae();
    }

    /* renamed from: switchProcessActiveState */
    public void m40276x764cd590(boolean z17) {
        m40228xc433ccd6(z17);
    }

    /* renamed from: testReportFlush */
    public void m40277xc89b4a3e() {
        m40229x6751ec38();
    }

    /* renamed from: doLiveSpeedTest */
    public void m40236x17921322(java.lang.String str, int i17, int i18, int i19, int i27, com.p314xaae8f345.p542x3306d5.mm.C4575x2505020e c4575x2505020e, int i28) {
        m40194xb648b51c(str, i17, i18, i19, i27, c4575x2505020e, i28);
    }

    public C4569xb3cd6a80(com.p314xaae8f345.p542x3306d5.app.C4443x9befcd8f c4443x9befcd8f) {
        m40191x2135f803(c4443x9befcd8f);
    }
}
