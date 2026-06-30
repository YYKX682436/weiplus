package com.p314xaae8f345.p2841xd11c237d.mm;

/* renamed from: com.tencent.paymars.mm.MMStnManager */
/* loaded from: classes12.dex */
public class C23018xb3cd6a80 extends com.p314xaae8f345.p2841xd11c237d.app.AbstractC23009x1e602b7c {

    /* renamed from: MM_STAT_CGI_INFO */
    public static final int f40123xe5399d74 = 1;

    /* renamed from: MM_STAT_CGI_NETWORK_COST */
    public static final int f40124x31762e24 = 7;

    /* renamed from: MM_STAT_DNS */
    public static final int f40125xc589e85d = 8;

    /* renamed from: MM_STAT_LONGLINK_BUILD */
    public static final int f40126x1feb4d71 = 3;

    /* renamed from: MM_STAT_LONGLINK_CONNECT */
    public static final int f40127xfd3e472d = 4;

    /* renamed from: MM_STAT_LONGLINK_DISCONNECT */
    public static final int f40128x8036c359 = 5;

    /* renamed from: MM_STAT_LONGLINK_FUNC_CONNECT */
    public static final int f40129xcca685cc = 6;

    /* renamed from: MM_STAT_NETWORK_UNREACHABLE */
    public static final int f40130xfb0db557 = 2;

    /* renamed from: MM_Stat_Local_GetHostByName */
    public static final int f40131x3ca568a0 = 11;

    /* renamed from: MM_Stat_Network_Changed */
    public static final int f40132xc8e62d7 = 10;

    /* renamed from: MM_Stat_Noop_Send */
    public static final int f40133xb7ad9eb9 = 9;
    protected static final java.lang.String TAG = "Mars.MMStnManager";

    /* renamed from: ICallBack */
    public com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.CallBack f40134x410b9fce;

    /* renamed from: nativeHandle */
    protected long f40136x7b5cfd1f = 0;

    /* renamed from: callbackHandle */
    protected long f40135x429972cd = 0;

    /* renamed from: com.tencent.paymars.mm.MMStnManager$CallBack */
    /* loaded from: classes12.dex */
    public interface CallBack {
        /* renamed from: OnActionNotify */
        int mo84384x8a9f58be(java.lang.String str, long j17, byte[] bArr, byte[] bArr2, byte[] bArr3, long j18);

        /* renamed from: ackActionNotify */
        int mo84385x708d4848(java.lang.String str, long j17, int i17);

        /* renamed from: addMMNetCommonCallback */
        void mo84386x7433764c(android.os.IInterface iInterface);

        /* renamed from: buf2Resp */
        int mo84387xa261f88f(int i17, java.lang.Object obj, java.lang.String str, byte[] bArr, int[] iArr, int[] iArr2, int i18, int[] iArr3);

        /* renamed from: doCertificateVerify */
        int mo84388x2f1063a5(java.lang.String str, byte[][] bArr);

        /* renamed from: doLiveSpeedTest */
        int mo84389x17921322(java.lang.String str, int i17, int i18, int i19, int i27, byte[] bArr, byte[] bArr2, android.os.IInterface iInterface);

        /* renamed from: doNetIdRequest */
        void mo84390xed157802();

        /* renamed from: getCurLanguage */
        java.lang.String mo84391xbdfe8082();

        /* renamed from: getHostByName */
        int mo84392x8faab340(java.lang.String str, java.util.List<java.lang.String> list);

        /* renamed from: getIntegerExpt */
        java.lang.String mo84393x96e271f();

        /* renamed from: getJavaActionId */
        int mo84394x641430a9(long j17);

        /* renamed from: getLogIdSubType */
        int mo84395x47ecc391(long j17, java.lang.String str);

        /* renamed from: getSnsIpsForScene */
        int mo84396x65185ded(java.util.List<java.lang.String> list, boolean z17);

        /* renamed from: getSnsIpsForSceneWithHostName */
        int mo84397x77eff5c6(java.util.List<java.lang.String> list, java.lang.String str, boolean z17);

        /* renamed from: getUserIDCLocale */
        java.lang.String mo84398xfa8df3e1();

        /* renamed from: getXAgreementId */
        int mo84399xb4bebfa3();

        /* renamed from: ifUseNewNetId */
        java.lang.String mo84400xe56f1322();

        /* renamed from: isOverseasUser */
        int mo84401x6682a70d();

        /* renamed from: networkAnalysisCallBack */
        void mo84402x252d11af(int i17, int i18, boolean z17, java.lang.String str);

        /* renamed from: notifyNewSpeedTestReport */
        void mo84403xc058cd76(byte[] bArr, int i17, int i18, int i19, int i27, java.lang.String str, int i28, java.lang.String str2, int i29, int i37);

        /* renamed from: notifyPayCgiNewDnsTagIncorrect */
        void mo84404x5825913a(int i17, java.lang.String str);

        /* renamed from: notifyPayCgiNewDnsTagMiss */
        void mo84405x47b0a247(int i17, java.lang.String str);

        /* renamed from: notifyStnWeaknet */
        void mo84406x31a1e061(boolean z17);

        /* renamed from: onDisasterNodeNotify */
        void mo84407x12aa61eb(java.lang.String str);

        /* renamed from: onLiveSpeedTestCallback */
        void mo84408xce1830b3(com.p314xaae8f345.p2841xd11c237d.mm.C23017xf5d28c4a c23017xf5d28c4a, boolean z17);

        /* renamed from: onOOBNotify */
        void mo84409x851b014c(java.lang.String str);

        /* renamed from: receiveWeakNetNotify */
        void mo84410x7797f08b(boolean z17, int i17);

        /* renamed from: removeMMNetCommonCallback */
        void mo84411x7b24ad89(android.os.IInterface iInterface);

        /* renamed from: reportFlow */
        void mo84412x73181082(int i17, int i18, int i19, int i27);

        /* renamed from: reportGroupIDKey */
        void mo84413xc9114479(int[] iArr, int[] iArr2, int[] iArr3, int i17, boolean z17, boolean z18);

        /* renamed from: reportIDKey */
        void mo84414xf0018e90(long j17, long j18, long j19, boolean z17);

        /* renamed from: reportKV */
        void mo84415xe68be19f(long j17, java.lang.String str, boolean z17, boolean z18, long j18, boolean z19);

        /* renamed from: reportStat */
        void mo84416x731e15a8(com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.ReportInfo reportInfo);

        /* renamed from: simpleTestCommand */
        void mo84417x19d1d47(java.lang.String str);
    }

    /* renamed from: com.tencent.paymars.mm.MMStnManager$ReportInfo */
    /* loaded from: classes12.dex */
    public static class ReportInfo {

        /* renamed from: actionId */
        public long f40137x9d48d1f1 = 0;

        /* renamed from: rtType */
        public long f40170xc913209c = 0;

        /* renamed from: beginTime */
        public long f40138xc00dc316 = 0;

        /* renamed from: endTime */
        public long f40147xa0336a48 = 0;

        /* renamed from: ip, reason: collision with root package name */
        public java.lang.String f296746ip = "";

        /* renamed from: port */
        public int f40164x349881 = 0;

        /* renamed from: isSocket */
        public boolean f40156xf2b5113d = false;

        /* renamed from: netType */
        public int f40159x6dd19677 = 0;

        /* renamed from: ipType */
        public int f40155xb97f2501 = 0;

        /* renamed from: sendSize */
        public long f40171x4a5a1fa9 = 0;

        /* renamed from: recvSize */
        public long f40165xd0b14b07 = 0;

        /* renamed from: errType */
        public int f40149xa7cc523f = 0;

        /* renamed from: errCode */
        public int f40148xa7c470f2 = 0;

        /* renamed from: netSignal */
        public long f40158x3d2b9aa5 = 0;

        /* renamed from: retryCount */
        public int f40169xbaa1a747 = 0;

        /* renamed from: expand1 */
        public long f40150xb1f2f4d7 = 0;

        /* renamed from: clientIp */
        public java.lang.String f40139x36253652 = "";

        /* renamed from: expand2 */
        public long f40151xb1f2f4d8 = 0;

        /* renamed from: newNetType */
        public int f40160x914470b7 = 0;

        /* renamed from: subNetType */
        public int f40172x1581e817 = 0;

        /* renamed from: extraInfo */
        public java.lang.String f40152xf0e1e4de = "";

        /* renamed from: host */
        public java.lang.String f40154x30f5a8 = "";

        /* renamed from: endStep */
        public int f40146xa0331e47 = 0;

        /* renamed from: newdnsCostTime */
        public long f40161x60be8ae3 = 0;

        /* renamed from: newdnsErrType */
        public int f40163x92f61676 = 0;

        /* renamed from: newdnsErrCode */
        public int f40162x92ee3529 = 0;

        /* renamed from: dnsSvrIp */
        public java.lang.String f40144x17e9444d = "";

        /* renamed from: dnsCostTime */
        public long f40142xa62c7883 = 0;

        /* renamed from: dnsErrType */
        public int f40143xd743f4d6 = 0;

        /* renamed from: connCostTime */
        public long f40140x205cef86 = 0;

        /* renamed from: firstPkgTime */
        public long f40153xdc6c11e9 = 0;

        /* renamed from: endFlag */
        public int f40145xa02d16e7 = 0;

        /* renamed from: connTotalCostTime */
        public long f40141xc1670bd2 = 0;

        /* renamed from: usedIpIndex */
        public int f40173xb576b96e = 0;

        /* renamed from: localIp */
        public int f40157x142bb9f2 = 0;

        /* renamed from: refTime1 */
        public int f40166xd3fac231 = 0;

        /* renamed from: refTime2 */
        public int f40167xd3fac232 = 0;

        /* renamed from: refTime3 */
        public int f40168xd3fac233 = 0;

        /* renamed from: toString */
        public java.lang.String m84418x9616526c() {
            return java.lang.String.format("actionId:%d, rtType:%d, begin:%d, end:%d, cost:%d, ip:%s, port:%d, isSocket:%b, netType:%d, ipType:%d, sendSize:%d, recvSize:%d, errType:%d, errCode:%d, netSignal:%d, retryCount:%d, expand1:%d, clientip:%s, expand2:%d, newNetType:%d, subNetType:%d, extraInfo:%s, host:%s, endStep:%d, endFlag:%d", java.lang.Long.valueOf(this.f40137x9d48d1f1), java.lang.Long.valueOf(this.f40170xc913209c), java.lang.Long.valueOf(this.f40138xc00dc316), java.lang.Long.valueOf(this.f40147xa0336a48), java.lang.Long.valueOf(this.f40147xa0336a48 - this.f40138xc00dc316), this.f296746ip, java.lang.Integer.valueOf(this.f40164x349881), java.lang.Boolean.valueOf(this.f40156xf2b5113d), java.lang.Integer.valueOf(this.f40159x6dd19677), java.lang.Integer.valueOf(this.f40155xb97f2501), java.lang.Long.valueOf(this.f40171x4a5a1fa9), java.lang.Long.valueOf(this.f40165xd0b14b07), java.lang.Integer.valueOf(this.f40149xa7cc523f), java.lang.Integer.valueOf(this.f40148xa7c470f2), java.lang.Long.valueOf(this.f40158x3d2b9aa5), java.lang.Integer.valueOf(this.f40169xbaa1a747), java.lang.Long.valueOf(this.f40150xb1f2f4d7), this.f40139x36253652, java.lang.Long.valueOf(this.f40151xb1f2f4d8), java.lang.Integer.valueOf(this.f40160x914470b7), java.lang.Integer.valueOf(this.f40172x1581e817), this.f40152xf0e1e4de, this.f40154x30f5a8, java.lang.Integer.valueOf(this.f40146xa0331e47), java.lang.Integer.valueOf(this.f40145xa02d16e7));
        }
    }

    public C23018xb3cd6a80(long j17) {
        m84296x95381154(j17);
    }

    /* renamed from: OnJniClearPayMMtlsForbidenHostAndPsk */
    private native void m84287x5814c790();

    /* renamed from: OnJniDispatchPayMmtlsCtrlInfo */
    private native void m84288x3e9eb24c(java.lang.Object obj, boolean z17, boolean z18);

    /* renamed from: OnJniGetPayMMtlsRegion */
    private native int m84289x27ce64f7();

    /* renamed from: OnJniSetPayMMtlsRegion */
    private native void m84290xefc4cd03(int i17);

    /* renamed from: OnJniAddHostInfo */
    public native void m84291x3df91531(java.lang.String[] strArr, java.lang.String[] strArr2, int[] iArr);

    /* renamed from: OnJniClearLocalHostCache */
    public native void m84292x3acb8836();

    /* renamed from: OnJniClearMMtlsForbidenHostAndPsk */
    public native void m84293xf36cd26a();

    /* renamed from: OnJniCombineGetHostIps */
    public native void m84294x5b424747(java.lang.String str, int i17, int i18, com.p314xaae8f345.p2841xd11c237d.mm.C23016xebd53123 c23016xebd53123);

    /* renamed from: OnJniCreateMMStnManagerFromContext */
    public native void m84295x2135f803(java.lang.Object obj);

    /* renamed from: OnJniCreateMMStnManagerFromHandle */
    public native void m84296x95381154(long j17);

    /* renamed from: OnJniDestroyMMStnManager */
    public native void m84297xf75ff874();

    /* renamed from: OnJniDoLiveSpeedTest */
    public native void m84298xb648b51c(java.lang.String str, int i17, int i18, int i19, int i27, com.p314xaae8f345.p2841xd11c237d.mm.C23024x2505020e c23024x2505020e, int i28);

    /* renamed from: OnJniForceUseV6 */
    public native void m84299x9851b402(boolean z17);

    /* renamed from: OnJniGetHostIps */
    public native void m84300x10202ef4(java.lang.String str, com.p314xaae8f345.p2841xd11c237d.mm.C23016xebd53123 c23016xebd53123);

    /* renamed from: OnJniGetIPsString */
    public native java.lang.String[] m84301x52df190d(boolean z17);

    /* renamed from: OnJniGetIspId */
    public native java.lang.String m84302x32f581d1();

    /* renamed from: OnJniGetLocalHostList */
    public native void m84303x8ddb0881(java.lang.String[] strArr, java.lang.String str);

    /* renamed from: OnJniGetMMtlsRegion */
    public native int m84304xdbb88bdf();

    /* renamed from: OnJniGetMarsTimestamp */
    public native long m84305xf3277b51();

    /* renamed from: OnJniGetNetworkId */
    public native com.p314xaae8f345.p2841xd11c237d.mm.C23023xe5297c17 m84306x2fbc3179(java.lang.String str);

    /* renamed from: OnJniGetNetworkServerIp */
    public native java.lang.String m84307x91ce59a8();

    /* renamed from: OnJniGetRecentConnectRecords */
    public native com.p314xaae8f345.p2841xd11c237d.mm.C23014xe93729bb[] m84308xea65da3(int i17, int i18);

    /* renamed from: OnJniGetSnsIps */
    public native void m84309x3c861804(boolean z17, com.p314xaae8f345.p2841xd11c237d.mm.C23016xebd53123 c23016xebd53123);

    /* renamed from: OnJniGetSnsIpsWithHostName */
    public native void m84310x345c455d(java.lang.String str, boolean z17, com.p314xaae8f345.p2841xd11c237d.mm.C23016xebd53123 c23016xebd53123);

    /* renamed from: OnJniMMAckActionNotify */
    public native int m84311x31e94e22(java.lang.String str, long j17, int i17);

    /* renamed from: OnJniRecoverLinkAddrs */
    public native void m84312x9fc8f0a();

    /* renamed from: OnJniReportCGIServerError */
    public native void m84313xa1d4db5a(int i17, int i18);

    /* renamed from: OnJniReportFailIp */
    public native void m84314xc2134b7f(java.lang.String str);

    /* renamed from: OnJniReportV6Status */
    public native void m84315xc666ac(boolean z17);

    /* renamed from: OnJniSaveAuthLongList */
    public native void m84316x449ac665(java.lang.Object obj, int[] iArr);

    /* renamed from: OnJniSaveAuthShortList */
    public native void m84317xcf46b76f(java.lang.Object obj, int[] iArr);

    /* renamed from: OnJniSetCallback */
    public native void m84318xf6496dc1(java.lang.Object obj);

    /* renamed from: OnJniSetCgiDebugIP */
    public native void m84319x8cd79cf1(java.lang.String str, java.lang.String str2, int i17);

    /* renamed from: OnJniSetDebugHost */
    public native void m84320x546009f(java.lang.String str);

    /* renamed from: OnJniSetDebugIP */
    public native void m84321x9df969be(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4);

    /* renamed from: OnJniSetHostInfo */
    public native void m84322xee9e07f2(java.lang.String[] strArr, java.lang.String[] strArr2, int[] iArr);

    /* renamed from: OnJniSetMMTlsHostInfo */
    public native void m84323xdd3b9ef5(java.lang.String[] strArr, int[] iArr);

    /* renamed from: OnJniSetMMtlsRegion */
    public native void m84324x721dff53(int i17);

    /* renamed from: OnJniSetMmtlsCtrlInfo */
    public native void m84325x6efa5638(boolean z17);

    /* renamed from: OnJniSetNetIdAndIsp */
    public native void m84326x84194deb(java.lang.String str, java.lang.String str2, java.lang.String str3);

    /* renamed from: OnJniSetNetworkId */
    public native void m84327x8c0ff1ed(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17);

    /* renamed from: OnJniSetNewDnsDebugHost */
    public native void m84328x88225436(java.lang.String str, java.lang.String str2);

    /* renamed from: OnJniSetPayNewDnsDebugHosts */
    public native void m84329x940e734d(java.lang.Object obj, boolean z17);

    /* renamed from: OnJniStartNetworkAnalysis */
    public native void m84330xa15dd0ae();

    /* renamed from: OnJniSwitchProcessActiveState */
    public native void m84331xc433ccd6(boolean z17);

    /* renamed from: OnJniTestReportFlush */
    public native void m84332x6751ec38();

    /* renamed from: addHostInfo */
    public void m84333xb3fe6637(java.lang.String[] strArr, java.lang.String[] strArr2, int[] iArr) {
        m84291x3df91531(strArr, strArr2, iArr);
    }

    /* renamed from: addMMNetCommonCallback */
    public void m84334x7433764c(android.os.IInterface iInterface) {
        com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.CallBack callBack = this.f40134x410b9fce;
        if (callBack == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "ICallBack is null");
        } else {
            callBack.mo84386x7433764c(iInterface);
        }
    }

    /* renamed from: clearLocalHostCache */
    public void m84335xfc8a733c() {
        m84292x3acb8836();
    }

    /* renamed from: clearMMtlsForbidenHostAndPsk */
    public void m84336x6bfeee24() {
        m84293xf36cd26a();
    }

    /* renamed from: clearPayMMtlsForbidenHostAndPsk */
    public void m84337x4add5996() {
        m84287x5814c790();
    }

    /* renamed from: combineGetHostIps */
    public int m84338x8fac3bcd(java.lang.String str, int i17, int i18, java.util.List<java.lang.String> list) {
        java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p2841xd11c237d.mm.C23016xebd53123 c23016xebd53123 = new com.p314xaae8f345.p2841xd11c237d.mm.C23016xebd53123();
        m84294x5b424747(str, i17, i18, c23016xebd53123);
        for (int i19 = 0; i19 < c23016xebd53123.f40094xbe0e3ae6; i19++) {
            list.add(c23016xebd53123.f40093xac04aca4[i19]);
        }
        return c23016xebd53123.f40095x368f3a;
    }

    /* renamed from: dispatchPayMmtlsCtrlInfo */
    public void m84339xf0b7bb06(java.util.Map<java.lang.String, java.lang.Integer> map, boolean z17, boolean z18) {
        m84288x3e9eb24c(map, z17, z18);
    }

    /* renamed from: doLiveSpeedTest */
    public int m84340x17921322(java.lang.String str, int i17, int i18, int i19, int i27, byte[] bArr, byte[] bArr2, android.os.IInterface iInterface) {
        com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.CallBack callBack = this.f40134x410b9fce;
        if (callBack == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "ICallBack is null");
            return 0;
        }
        return callBack.mo84389x17921322(str, i17, i18, i19, i27, bArr, bArr2, iInterface);
    }

    /* renamed from: forceUseV6 */
    public void m84342x77b2a3c(boolean z17) {
        m84299x9851b402(z17);
    }

    /* renamed from: getHostByName */
    public int m84343x8faab340(java.lang.String str, java.util.List<java.lang.String> list) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p2841xd11c237d.mm.C23016xebd53123 c23016xebd53123 = new com.p314xaae8f345.p2841xd11c237d.mm.C23016xebd53123();
        m84344x7f49a52e(str, c23016xebd53123);
        for (int i17 = 0; i17 < c23016xebd53123.f40094xbe0e3ae6; i17++) {
            list.add(c23016xebd53123.f40093xac04aca4[i17]);
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.ReportInfo reportInfo = new com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.ReportInfo();
        reportInfo.f40137x9d48d1f1 = 11L;
        reportInfo.f40138xc00dc316 = currentTimeMillis;
        reportInfo.f40147xa0336a48 = currentTimeMillis2;
        reportInfo.f40139x36253652 = str;
        reportInfo.f296746ip = c23016xebd53123.f40094xbe0e3ae6 > 0 ? c23016xebd53123.f40093xac04aca4[0] : "0.0.0.0";
        return c23016xebd53123.f40095x368f3a;
    }

    /* renamed from: getHostIps */
    public void m84344x7f49a52e(java.lang.String str, com.p314xaae8f345.p2841xd11c237d.mm.C23016xebd53123 c23016xebd53123) {
        m84300x10202ef4(str, c23016xebd53123);
    }

    /* renamed from: getIPsString */
    public java.lang.String[] m84345x9d83e8c7(boolean z17) {
        return m84301x52df190d(z17);
    }

    /* renamed from: getIspId */
    public java.lang.String m84346x749b3e8b() {
        return m84302x32f581d1();
    }

    /* renamed from: getLocalHostList */
    public void m84347x55bd6b3b(java.lang.String[] strArr, java.lang.String str) {
        m84303x8ddb0881(strArr, str);
    }

    /* renamed from: getMMtlsRegion */
    public int m84348x10685519() {
        return m84304xdbb88bdf();
    }

    /* renamed from: getMarsTimestamp */
    public long m84349xbb09de0b() {
        return m84305xf3277b51();
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.app.AbstractC23009x1e602b7c
    /* renamed from: getNativeHandle */
    public long mo84241xdc4f8f95() {
        return this.f40136x7b5cfd1f;
    }

    /* renamed from: getNetworkId */
    public com.p314xaae8f345.p2841xd11c237d.mm.C23023xe5297c17 m84350x7a610133(java.lang.String str) {
        return m84306x2fbc3179(str);
    }

    /* renamed from: getNetworkServerIp */
    public java.lang.String m84351xeaa2f5e2() {
        return m84307x91ce59a8();
    }

    /* renamed from: getPayMMtlsRegion */
    public int m84352x5c38597d() {
        return m84289x27ce64f7();
    }

    /* renamed from: getRecentConnectRecords */
    public com.p314xaae8f345.p2841xd11c237d.mm.C23014xe93729bb[] m84353xb14c55a9(int i17, int i18) {
        return m84308xea65da3(i17, i18);
    }

    /* renamed from: getSnsIps */
    public void m84354x2f97f28a(boolean z17, com.p314xaae8f345.p2841xd11c237d.mm.C23016xebd53123 c23016xebd53123) {
        m84309x3c861804(z17, c23016xebd53123);
    }

    /* renamed from: getSnsIpsForScene */
    public int m84355x65185ded(java.util.List<java.lang.String> list, boolean z17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p2841xd11c237d.mm.C23016xebd53123 c23016xebd53123 = new com.p314xaae8f345.p2841xd11c237d.mm.C23016xebd53123();
        m84354x2f97f28a(z17, c23016xebd53123);
        for (int i17 = 0; i17 < c23016xebd53123.f40094xbe0e3ae6; i17++) {
            list.add(c23016xebd53123.f40093xac04aca4[i17]);
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.ReportInfo reportInfo = new com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.ReportInfo();
        reportInfo.f40137x9d48d1f1 = 11L;
        reportInfo.f40138xc00dc316 = currentTimeMillis;
        reportInfo.f40147xa0336a48 = currentTimeMillis2;
        reportInfo.f40139x36253652 = "mmsns.qpic.cn";
        reportInfo.f296746ip = c23016xebd53123.f40094xbe0e3ae6 > 0 ? c23016xebd53123.f40093xac04aca4[0] : "0.0.0.0";
        return c23016xebd53123.f40095x368f3a;
    }

    /* renamed from: getSnsIpsForSceneWithHostName */
    public int m84356x77eff5c6(java.util.List<java.lang.String> list, java.lang.String str, boolean z17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p2841xd11c237d.mm.C23016xebd53123 c23016xebd53123 = new com.p314xaae8f345.p2841xd11c237d.mm.C23016xebd53123();
        m84357x820c86e3(str, z17, c23016xebd53123);
        for (int i17 = 0; i17 < c23016xebd53123.f40094xbe0e3ae6; i17++) {
            list.add(c23016xebd53123.f40093xac04aca4[i17]);
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.ReportInfo reportInfo = new com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.ReportInfo();
        reportInfo.f40137x9d48d1f1 = 11L;
        reportInfo.f40138xc00dc316 = currentTimeMillis;
        reportInfo.f40147xa0336a48 = currentTimeMillis2;
        reportInfo.f40139x36253652 = str;
        reportInfo.f296746ip = c23016xebd53123.f40094xbe0e3ae6 > 0 ? c23016xebd53123.f40093xac04aca4[0] : "0.0.0.0";
        return c23016xebd53123.f40095x368f3a;
    }

    /* renamed from: getSnsIpsWithHostName */
    public void m84357x820c86e3(java.lang.String str, boolean z17, com.p314xaae8f345.p2841xd11c237d.mm.C23016xebd53123 c23016xebd53123) {
        m84310x345c455d(str, z17, c23016xebd53123);
    }

    /* renamed from: mmAckActionNotify */
    public int m84358x988efe88(java.lang.String str, long j17, int i17) {
        return m84311x31e94e22(str, j17, i17);
    }

    /* renamed from: onDestroy */
    public void m84359xac79a11b() {
        m84297xf75ff874();
        this.f40136x7b5cfd1f = 0L;
        this.f40135x429972cd = 0L;
    }

    /* renamed from: recoverLinkAddrs */
    public void m84360xd1def1c4() {
        m84312x9fc8f0a();
    }

    /* renamed from: removeMMNetCommonCallback */
    public void m84361x7b24ad89(android.os.IInterface iInterface) {
        com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.CallBack callBack = this.f40134x410b9fce;
        if (callBack == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "ICallBack is null");
        } else {
            callBack.mo84411x7b24ad89(iInterface);
        }
    }

    /* renamed from: reportCGIServerError */
    public void m84362x17f35114(int i17, int i18) {
        m84313xa1d4db5a(i17, i18);
    }

    /* renamed from: reportFailIp */
    public void m84363xcb81b39(java.lang.String str) {
        m84314xc2134b7f(str);
    }

    /* renamed from: reportV6Status */
    public void m84364x35762fe6(boolean z17) {
        m84315xc666ac(z17);
    }

    /* renamed from: saveAuthLongList */
    public void m84365xc7d291f(java.lang.Object obj, int[] iArr) {
        m84316x449ac665(obj, iArr);
    }

    /* renamed from: saveAuthShortList */
    public void m84366x3b0abf5(java.lang.Object obj, int[] iArr) {
        m84317xcf46b76f(obj, iArr);
    }

    /* renamed from: setCallback */
    public void m84367x6c4ebec7(com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.CallBack callBack) {
        this.f40134x410b9fce = callBack;
        m84318xf6496dc1(callBack);
    }

    /* renamed from: setCgiDebugIP */
    public void m84368x96ccc477(java.lang.String str, java.lang.String str2, int i17) {
        m84319x8cd79cf1(str, str2, i17);
    }

    /* renamed from: setDebugHost */
    public void m84369x4fead059(java.lang.String str) {
        m84320x546009f(str);
    }

    /* renamed from: setDebugIP */
    public void m84370xd22dff8(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        m84321x9df969be(str, str2, str3, str4);
    }

    /* renamed from: setHostInfo */
    public void m84371x64a358f8(java.lang.String[] strArr, java.lang.String[] strArr2, int[] iArr) {
        m84322xee9e07f2(strArr, strArr2, iArr);
    }

    /* renamed from: setMMTlsHostInfo */
    public void m84372xa51e01af(java.lang.String[] strArr, int[] iArr) {
        m84323xdd3b9ef5(strArr, iArr);
    }

    /* renamed from: setMMtlsRegion */
    public void m84373xa6cdc88d(int i17) {
        m84324x721dff53(i17);
    }

    /* renamed from: setMmtlsCtrlInfo */
    public void m84374x36dcb8f2(boolean z17) {
        m84325x6efa5638(z17);
    }

    /* renamed from: setNetIdAndIsp */
    public void m84375xb8c91725(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        m84326x84194deb(str, str2, str3);
    }

    /* renamed from: setNetworkId */
    public void m84376xd6b4c1a7(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        m84327x8c0ff1ed(str, str2, str3, i17);
    }

    /* renamed from: setNewDnsDebugHost */
    public void m84377xe0f6f070(java.lang.String str, java.lang.String str2) {
        m84328x88225436(str, str2);
    }

    /* renamed from: setPayMMtlsRegion */
    public void m84378x242ec189(int i17) {
        m84290xefc4cd03(i17);
    }

    /* renamed from: setPayNewDnsDebugHosts */
    public void m84379xfc666287(java.util.Map<java.lang.String, java.lang.String> map, boolean z17) {
        m84329x940e734d(map, z17);
    }

    /* renamed from: simpleTestCommand */
    public void m84380x19d1d47(java.lang.String str) {
        com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.CallBack callBack = this.f40134x410b9fce;
        if (callBack == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "ICallBack is null");
        } else {
            callBack.mo84417x19d1d47(str);
        }
    }

    /* renamed from: startNetworkAnalysis */
    public void m84381x177c4668() {
        m84330xa15dd0ae();
    }

    /* renamed from: switchProcessActiveState */
    public void m84382x764cd590(boolean z17) {
        m84331xc433ccd6(z17);
    }

    /* renamed from: testReportFlush */
    public void m84383xc89b4a3e() {
        m84332x6751ec38();
    }

    /* renamed from: doLiveSpeedTest */
    public void m84341x17921322(java.lang.String str, int i17, int i18, int i19, int i27, com.p314xaae8f345.p2841xd11c237d.mm.C23024x2505020e c23024x2505020e, int i28) {
        m84298xb648b51c(str, i17, i18, i19, i27, c23024x2505020e, i28);
    }

    public C23018xb3cd6a80(com.p314xaae8f345.p2841xd11c237d.app.C23011x9befcd8f c23011x9befcd8f) {
        m84295x2135f803(c23011x9befcd8f);
    }
}
