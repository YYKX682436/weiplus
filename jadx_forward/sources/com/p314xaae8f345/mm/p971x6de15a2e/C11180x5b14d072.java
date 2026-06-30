package com.p314xaae8f345.mm.p971x6de15a2e;

/* renamed from: com.tencent.mm.network.MMNativeNetComm */
/* loaded from: classes12.dex */
public class C11180x5b14d072 {

    /* renamed from: CONNECTED */
    public static final int f32589x839202e9 = 5;

    /* renamed from: CONNECTTING */
    public static final int f32590xe723dab8 = 4;

    /* renamed from: ECmdNormal */
    static final int f32591x15ef73fc = 0;

    /* renamed from: ECmdUser */
    static final int f32592x979c6420 = 1;

    /* renamed from: EEXPECT_SENSITIVE */
    static final int f32593x93c53455 = 1;

    /* renamed from: EFAST */
    static final int f32594x3ed2621 = 1;

    /* renamed from: ENORMAL */
    static final int f32595xcba7a96c = 0;

    /* renamed from: ETASK_PRIORITY_0 */
    static final int f32596xcf3f5c6a = 0;

    /* renamed from: ETASK_PRIORITY_1 */
    static final int f32597xcf3f5c6b = 1;

    /* renamed from: ETASK_PRIORITY_2 */
    static final int f32598xcf3f5c6c = 2;

    /* renamed from: ETASK_PRIORITY_3 */
    static final int f32599xcf3f5c6d = 3;

    /* renamed from: ETASK_PRIORITY_4 */
    static final int f32600xcf3f5c6e = 4;

    /* renamed from: ETASK_PRIORITY_5 */
    static final int f32601xcf3f5c6f = 5;

    /* renamed from: ETASK_PRIORITY_HIGHEST */
    static final int f32602x3ed0853e = 0;

    /* renamed from: ETASK_PRIORITY_LOWEST */
    static final int f32603xc72561b8 = 5;

    /* renamed from: ETASK_PRIORITY_NORMAL */
    static final int f32604xca8ce8ed = 3;

    /* renamed from: GATEWAY_FAILED */
    public static final int f32605xbfedc2b8 = 2;

    /* renamed from: NETWORK_CONNECTED */
    static final int f32606x799a29f8 = 1;

    /* renamed from: NETWORK_UNAVAILABLE */
    static final int f32607xed440b7f = 0;

    /* renamed from: SERVER_DOWN */
    static final int f32608x54d8441e = 6;

    /* renamed from: SERVER_FAILED */
    static final int f32609x8275c0b9 = 3;

    /* renamed from: TYPE_DNS */
    static final int f32610x6699284 = 2;

    /* renamed from: TYPE_HC */
    static final int f32611xf7f2e420 = 1;

    /* renamed from: TYPE_SVR_DNS */
    static final int f32612xe1d70f14 = 3;

    /* renamed from: TYPE_WAP_HC */
    static final int f32613x574621b9 = 4;

    /* renamed from: ectDial */
    static final int f32614x8e484c26 = 2;

    /* renamed from: ectDns */
    static final int f32615xb20255b3 = 3;

    /* renamed from: ectEnDecode */
    static final int f32616x9a099dad = 7;

    /* renamed from: ectFalse */
    static final int f32617x3ad9ef2d = 1;

    /* renamed from: ectHttp */
    static final int f32618x8e4a493e = 5;

    /* renamed from: ectHttp_TaskTimeout */
    static final int f32619xf06ec27b = -500;

    /* renamed from: ectLocal */
    static final int f32620x3b34b575 = 9;

    /* renamed from: ectLocal_AntiAvalanche */
    static final int f32621x6c808f87 = -4;

    /* renamed from: ectLocal_StartTaskFail */
    static final int f32622xb3a3635b = -3;

    /* renamed from: ectLocal_TaskRetry */
    static final int f32623xb1d9e9b9 = -2;

    /* renamed from: ectLocal_TaskTimeout */
    static final int f32624x133d9432 = -1;

    /* renamed from: ectNetMsgXP */
    static final int f32625xb579ac52 = 6;

    /* renamed from: ectNetMsgXP_TaskTimeout */
    static final int f32626x16de278f = -500;

    /* renamed from: ectOK */
    static final int f32627x5be03f2 = 0;

    /* renamed from: ectServer */
    static final int f32628x36ce1a79 = 8;

    /* renamed from: ectSocket */
    static final int f32629x37540aa9 = 4;

    /* renamed from: com.tencent.mm.network.MMNativeNetComm$AccountInfo */
    /* loaded from: classes6.dex */
    public static class AccountInfo {
        public int uin;

        /* renamed from: username */
        public java.lang.String f32630xf02988d6;
    }

    /* renamed from: com.tencent.mm.network.MMNativeNetComm$NetCmd */
    /* loaded from: classes6.dex */
    public static class NetCmd {

        /* renamed from: EBoth */
        public static final int f32631x3ec0566 = 3;

        /* renamed from: ELong */
        public static final int f32632x3f09061 = 2;

        /* renamed from: EShort */
        public static final int f32633x7a80f737 = 1;

        /* renamed from: isFlowLimit */
        public boolean f32639xebc52923;

        /* renamed from: isNotResp */
        public boolean f32640x5c5220b9;

        /* renamed from: isSessionCmd */
        public boolean f32641xe478738e;

        /* renamed from: netStrategy */
        public int f32642xf8aac430;

        /* renamed from: networkType */
        public int f32643x8c549688;

        /* renamed from: reqCmdID */
        public int f32644xe5d22dd7;

        /* renamed from: respCmdID */
        public int f32645x88beb9e5;

        /* renamed from: rtType */
        public int f32646xc913209c;
        public java.lang.String uri;

        /* renamed from: cmduser_firstpkgtimeout */
        int f32636x3ce3608b = -1;

        /* renamed from: cmduser_retrycount */
        int f32638x85b1e7e1 = -1;

        /* renamed from: cmduser_expectfinishtime */
        int f32634xc1eefbf3 = -1;

        /* renamed from: cmduser_expecttos */
        int f32635xbb3382a5 = -1;

        /* renamed from: cmduser_priority */
        int f32637x7603a09e = 3;
    }

    /* renamed from: com.tencent.mm.network.MMNativeNetComm$ReportInfo */
    /* loaded from: classes12.dex */
    public static class ReportInfo {

        /* renamed from: actionId */
        public long f32647x9d48d1f1 = 0;

        /* renamed from: rtType */
        public long f32680xc913209c = 0;

        /* renamed from: beginTime */
        public long f32648xc00dc316 = 0;

        /* renamed from: endTime */
        public long f32657xa0336a48 = 0;

        /* renamed from: ip, reason: collision with root package name */
        public java.lang.String f153466ip = "";

        /* renamed from: port */
        public int f32674x349881 = 0;

        /* renamed from: isSocket */
        public boolean f32666xf2b5113d = false;

        /* renamed from: netType */
        public int f32669x6dd19677 = 0;

        /* renamed from: ipType */
        public int f32665xb97f2501 = 0;

        /* renamed from: sendSize */
        public long f32681x4a5a1fa9 = 0;

        /* renamed from: recvSize */
        public long f32675xd0b14b07 = 0;

        /* renamed from: errType */
        public int f32659xa7cc523f = 0;

        /* renamed from: errCode */
        public int f32658xa7c470f2 = 0;

        /* renamed from: netSignal */
        public long f32668x3d2b9aa5 = 0;

        /* renamed from: retryCount */
        public int f32679xbaa1a747 = 0;

        /* renamed from: expand1 */
        public long f32660xb1f2f4d7 = 0;

        /* renamed from: clientIp */
        public java.lang.String f32649x36253652 = "";

        /* renamed from: expand2 */
        public long f32661xb1f2f4d8 = 0;

        /* renamed from: newNetType */
        public int f32670x914470b7 = 0;

        /* renamed from: subNetType */
        public int f32682x1581e817 = 0;

        /* renamed from: extraInfo */
        public java.lang.String f32662xf0e1e4de = "";

        /* renamed from: host */
        public java.lang.String f32664x30f5a8 = "";

        /* renamed from: endStep */
        public int f32656xa0331e47 = 0;

        /* renamed from: newdnsCostTime */
        public long f32671x60be8ae3 = 0;

        /* renamed from: newdnsErrType */
        public int f32673x92f61676 = 0;

        /* renamed from: newdnsErrCode */
        public int f32672x92ee3529 = 0;

        /* renamed from: dnsSvrIp */
        public java.lang.String f32654x17e9444d = "";

        /* renamed from: dnsCostTime */
        public long f32652xa62c7883 = 0;

        /* renamed from: dnsErrType */
        public int f32653xd743f4d6 = 0;

        /* renamed from: connCostTime */
        public long f32650x205cef86 = 0;

        /* renamed from: firstPkgTime */
        public long f32663xdc6c11e9 = 0;

        /* renamed from: endFlag */
        public int f32655xa02d16e7 = 0;

        /* renamed from: connTotalCostTime */
        public long f32651xc1670bd2 = 0;

        /* renamed from: usedIpIndex */
        public int f32683xb576b96e = 0;

        /* renamed from: localIp */
        public int f32667x142bb9f2 = 0;

        /* renamed from: refTime1 */
        public int f32676xd3fac231 = 0;

        /* renamed from: refTime2 */
        public int f32677xd3fac232 = 0;

        /* renamed from: refTime3 */
        public int f32678xd3fac233 = 0;

        /* renamed from: toString */
        public java.lang.String m48336x9616526c() {
            return java.lang.String.format("actionId:%d, rtType:%d, begin:%d, end:%d, cost:%d, ip:%s, port:%d, isSocket:%b, netType:%d, ipType:%d, sendSize:%d, recvSize:%d, errType:%d, errCode:%d, netSignal:%d, retryCount:%d, expand1:%d, clientip:%s, expand2:%d, newNetType:%d, subNetType:%d, extraInfo:%s, host:%s, endStep:%d, endFlag:%d", java.lang.Long.valueOf(this.f32647x9d48d1f1), java.lang.Long.valueOf(this.f32680xc913209c), java.lang.Long.valueOf(this.f32648xc00dc316), java.lang.Long.valueOf(this.f32657xa0336a48), java.lang.Long.valueOf(this.f32657xa0336a48 - this.f32648xc00dc316), this.f153466ip, java.lang.Integer.valueOf(this.f32674x349881), java.lang.Boolean.valueOf(this.f32666xf2b5113d), java.lang.Integer.valueOf(this.f32669x6dd19677), java.lang.Integer.valueOf(this.f32665xb97f2501), java.lang.Long.valueOf(this.f32681x4a5a1fa9), java.lang.Long.valueOf(this.f32675xd0b14b07), java.lang.Integer.valueOf(this.f32659xa7cc523f), java.lang.Integer.valueOf(this.f32658xa7c470f2), java.lang.Long.valueOf(this.f32668x3d2b9aa5), java.lang.Integer.valueOf(this.f32679xbaa1a747), java.lang.Long.valueOf(this.f32660xb1f2f4d7), this.f32649x36253652, java.lang.Long.valueOf(this.f32661xb1f2f4d8), java.lang.Integer.valueOf(this.f32670x914470b7), java.lang.Integer.valueOf(this.f32682x1581e817), this.f32662xf0e1e4de, this.f32664x30f5a8, java.lang.Integer.valueOf(this.f32656xa0331e47), java.lang.Integer.valueOf(this.f32655xa02d16e7));
        }
    }
}
