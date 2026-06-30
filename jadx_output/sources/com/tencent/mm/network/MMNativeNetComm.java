package com.tencent.mm.network;

/* loaded from: classes12.dex */
public class MMNativeNetComm {
    public static final int CONNECTED = 5;
    public static final int CONNECTTING = 4;
    static final int ECmdNormal = 0;
    static final int ECmdUser = 1;
    static final int EEXPECT_SENSITIVE = 1;
    static final int EFAST = 1;
    static final int ENORMAL = 0;
    static final int ETASK_PRIORITY_0 = 0;
    static final int ETASK_PRIORITY_1 = 1;
    static final int ETASK_PRIORITY_2 = 2;
    static final int ETASK_PRIORITY_3 = 3;
    static final int ETASK_PRIORITY_4 = 4;
    static final int ETASK_PRIORITY_5 = 5;
    static final int ETASK_PRIORITY_HIGHEST = 0;
    static final int ETASK_PRIORITY_LOWEST = 5;
    static final int ETASK_PRIORITY_NORMAL = 3;
    public static final int GATEWAY_FAILED = 2;
    static final int NETWORK_CONNECTED = 1;
    static final int NETWORK_UNAVAILABLE = 0;
    static final int SERVER_DOWN = 6;
    static final int SERVER_FAILED = 3;
    static final int TYPE_DNS = 2;
    static final int TYPE_HC = 1;
    static final int TYPE_SVR_DNS = 3;
    static final int TYPE_WAP_HC = 4;
    static final int ectDial = 2;
    static final int ectDns = 3;
    static final int ectEnDecode = 7;
    static final int ectFalse = 1;
    static final int ectHttp = 5;
    static final int ectHttp_TaskTimeout = -500;
    static final int ectLocal = 9;
    static final int ectLocal_AntiAvalanche = -4;
    static final int ectLocal_StartTaskFail = -3;
    static final int ectLocal_TaskRetry = -2;
    static final int ectLocal_TaskTimeout = -1;
    static final int ectNetMsgXP = 6;
    static final int ectNetMsgXP_TaskTimeout = -500;
    static final int ectOK = 0;
    static final int ectServer = 8;
    static final int ectSocket = 4;

    /* loaded from: classes6.dex */
    public static class AccountInfo {
        public int uin;
        public java.lang.String username;
    }

    /* loaded from: classes6.dex */
    public static class NetCmd {
        public static final int EBoth = 3;
        public static final int ELong = 2;
        public static final int EShort = 1;
        public boolean isFlowLimit;
        public boolean isNotResp;
        public boolean isSessionCmd;
        public int netStrategy;
        public int networkType;
        public int reqCmdID;
        public int respCmdID;
        public int rtType;
        public java.lang.String uri;
        int cmduser_firstpkgtimeout = -1;
        int cmduser_retrycount = -1;
        int cmduser_expectfinishtime = -1;
        int cmduser_expecttos = -1;
        int cmduser_priority = 3;
    }

    /* loaded from: classes12.dex */
    public static class ReportInfo {
        public long actionId = 0;
        public long rtType = 0;
        public long beginTime = 0;
        public long endTime = 0;

        /* renamed from: ip, reason: collision with root package name */
        public java.lang.String f71933ip = "";
        public int port = 0;
        public boolean isSocket = false;
        public int netType = 0;
        public int ipType = 0;
        public long sendSize = 0;
        public long recvSize = 0;
        public int errType = 0;
        public int errCode = 0;
        public long netSignal = 0;
        public int retryCount = 0;
        public long expand1 = 0;
        public java.lang.String clientIp = "";
        public long expand2 = 0;
        public int newNetType = 0;
        public int subNetType = 0;
        public java.lang.String extraInfo = "";
        public java.lang.String host = "";
        public int endStep = 0;
        public long newdnsCostTime = 0;
        public int newdnsErrType = 0;
        public int newdnsErrCode = 0;
        public java.lang.String dnsSvrIp = "";
        public long dnsCostTime = 0;
        public int dnsErrType = 0;
        public long connCostTime = 0;
        public long firstPkgTime = 0;
        public int endFlag = 0;
        public long connTotalCostTime = 0;
        public int usedIpIndex = 0;
        public int localIp = 0;
        public int refTime1 = 0;
        public int refTime2 = 0;
        public int refTime3 = 0;

        public java.lang.String toString() {
            return java.lang.String.format("actionId:%d, rtType:%d, begin:%d, end:%d, cost:%d, ip:%s, port:%d, isSocket:%b, netType:%d, ipType:%d, sendSize:%d, recvSize:%d, errType:%d, errCode:%d, netSignal:%d, retryCount:%d, expand1:%d, clientip:%s, expand2:%d, newNetType:%d, subNetType:%d, extraInfo:%s, host:%s, endStep:%d, endFlag:%d", java.lang.Long.valueOf(this.actionId), java.lang.Long.valueOf(this.rtType), java.lang.Long.valueOf(this.beginTime), java.lang.Long.valueOf(this.endTime), java.lang.Long.valueOf(this.endTime - this.beginTime), this.f71933ip, java.lang.Integer.valueOf(this.port), java.lang.Boolean.valueOf(this.isSocket), java.lang.Integer.valueOf(this.netType), java.lang.Integer.valueOf(this.ipType), java.lang.Long.valueOf(this.sendSize), java.lang.Long.valueOf(this.recvSize), java.lang.Integer.valueOf(this.errType), java.lang.Integer.valueOf(this.errCode), java.lang.Long.valueOf(this.netSignal), java.lang.Integer.valueOf(this.retryCount), java.lang.Long.valueOf(this.expand1), this.clientIp, java.lang.Long.valueOf(this.expand2), java.lang.Integer.valueOf(this.newNetType), java.lang.Integer.valueOf(this.subNetType), this.extraInfo, this.host, java.lang.Integer.valueOf(this.endStep), java.lang.Integer.valueOf(this.endFlag));
        }
    }
}
