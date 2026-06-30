package com.tencent.mars.stn;

/* loaded from: classes12.dex */
public class StnManager extends com.tencent.mars.app.BaseManager {
    public static final int CONNECTED = 4;
    public static final int CONNECTTING = 3;
    public static int ECHECK_NEVER = 2;
    public static int ECHECK_NEXT = 1;
    public static int ECHECK_NOW = 0;
    public static final int GATEWAY_FAILED = 1;
    public static final int INVALID_TASK_ID = -1;
    public static final int NETWORK_UNAVAILABLE = 0;
    public static final int NETWORK_UNKNOWN = -1;
    public static int RESP_FAIL_HANDLE_DEFAULT = -1;
    public static int RESP_FAIL_HANDLE_ECDH_VERSON_MISMATCH = -3800;
    public static int RESP_FAIL_HANDLE_NORMAL = 0;
    public static int RESP_FAIL_HANDLE_SESSION_TIMEOUT = -13;
    public static int RESP_FAIL_HANDLE_TASK_END = -14;
    public static final int SERVER_DOWN = 5;
    public static final int SERVER_FAILED = 2;
    public static final int ectCancel = 10;
    public static final int ectDial = 2;
    public static final int ectDns = 3;
    public static final int ectEnDecode = 7;
    public static final int ectFalse = 1;
    public static final int ectHttp = 5;
    public static final int ectLocal = 9;
    public static final int ectNetMsgXP = 6;
    public static final int ectOK = 0;
    public static final int ectServer = 8;
    public static final int ectSocket = 4;
    protected long nativeHandle = 0;
    protected long callbackHandle = 0;

    /* loaded from: classes12.dex */
    public interface CallBack {
        int buf2Resp(int i17, java.lang.Object obj, java.lang.String str, byte[] bArr, int[] iArr, int[] iArr2, int i18, int[] iArr3);

        int getLongLinkIdentifyCheckBuffer(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream, java.io.ByteArrayOutputStream byteArrayOutputStream2, int[] iArr);

        boolean makesureAuthed(java.lang.String str, java.lang.String str2);

        void networkAnalysisCallBack(int i17, int i18, boolean z17, java.lang.String str);

        boolean onLongLinkIdentifyResponse(java.lang.String str, byte[] bArr, byte[] bArr2);

        void onLongLinkNetworkError(com.tencent.mars.stn.ErrCmdType errCmdType, int i17, java.lang.String str, int i18);

        void onLongLinkStatusChange(int i17);

        java.lang.String[] onNewDns(java.lang.String str, boolean z17);

        void onPush(java.lang.String str, int i17, int i18, byte[] bArr, byte[] bArr2);

        void onShortLinkNetworkError(com.tencent.mars.stn.ErrCmdType errCmdType, int i17, java.lang.String str, java.lang.String str2, int i18);

        int onTaskEnd(int i17, java.lang.Object obj, int i18, int i19, com.tencent.mars.stn.StnManager.CgiProfile cgiProfile, byte[] bArr);

        void onTaskNotifyError(int i17, java.lang.Object obj, int i18, int i19, com.tencent.mars.stn.StnManager.CgiProfile cgiProfile, byte[] bArr);

        void reportConnectStatus(int i17, int i18);

        void reportTaskProfile(java.lang.String str);

        boolean req2Buf(int i17, java.lang.Object obj, java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream, int[] iArr, int i18, java.lang.String str2, int i19);

        java.lang.String[] requestNetCheckShortLinkHosts();

        void requestSync();

        void trafficData(int i17, int i18);
    }

    /* loaded from: classes12.dex */
    public static class CgiProfile {
        public java.lang.String netType;
        public long taskStartTime = 0;
        public long startTaskTick = 0;
        public long startTaskTS = 0;
        public long endTaskTick = 0;
        public long startConnectTime = 0;
        public long connectSuccessfulTime = 0;
        public long startHandshakeTime = 0;
        public long handshakeSuccessfulTime = 0;
        public long startSendPacketTime = 0;
        public long sendPacketFinishedTime = 0;
        public long startReadPacketTime = 0;
        public long readPacketFinishedTime = 0;
        public long startEncodePacketTime = 0;
        public long encodePacketFinishedTime = 0;
        public long startDecodePacketTime = 0;
        public long decodePacketFinishedTime = 0;
        public long rtt = 0;
        public int channelType = 0;
        public int protocolType = 0;
    }

    public StnManager(long j17) {
        OnJniCreateStnManagerFromHandle(j17);
    }

    public native void OnJniClearTask();

    public native void OnJniCreateStnManager();

    public native void OnJniCreateStnManagerFromContext(java.lang.Object obj);

    public native void OnJniCreateStnManagerFromContextHandle(long j17);

    public native void OnJniCreateStnManagerFromHandle(long j17);

    public native void OnJniDestroyStnManager();

    public native int OnJniGenSequenceId();

    public native int OnJniGenTaskID();

    public native boolean OnJniHasTask(int i17);

    public native void OnJniKeepSignalling();

    public native void OnJniMakesureLongLinkConnected();

    public native void OnJniRedoTask();

    public native void OnJniReset();

    public native void OnJniResetAndInitEncoderVersion(int i17, java.lang.String str);

    public native void OnJniSetBackupIPs(java.lang.String str, java.lang.String[] strArr);

    public native void OnJniSetCallback(java.lang.Object obj);

    public native void OnJniSetDebugIP(java.lang.String str, java.lang.String str2);

    public native void OnJniSetLonglinkSvrAddr(java.lang.String str, int[] iArr, java.lang.String str2);

    public native void OnJniSetShortlinkSvrAddr(int i17, java.lang.String str);

    public native void OnJniSetSignallingStrategy(long j17, long j18);

    public native void OnJniStartTask(com.tencent.mars.stn.StnManager.Task task);

    public native void OnJniStopSignalling();

    public native void OnJniStopTask(int i17);

    public native void OnJniTouchTasks();

    public void clearTask() {
        OnJniClearTask();
    }

    public int genSequenceId() {
        return OnJniGenSequenceId();
    }

    public int genTaskID() {
        return OnJniGenTaskID();
    }

    @Override // com.tencent.mars.app.BaseManager
    public long getNativeHandle() {
        return this.nativeHandle;
    }

    public boolean hasTask(int i17) {
        return OnJniHasTask(i17);
    }

    public void keepSignalling() {
        OnJniKeepSignalling();
    }

    public void makesureLongLinkConnected() {
        OnJniMakesureLongLinkConnected();
    }

    public void onCreate() {
        OnJniCreateStnManager();
    }

    public void onDestroy() {
        OnJniDestroyStnManager();
        this.nativeHandle = 0L;
        this.callbackHandle = 0L;
    }

    public void redoTask() {
        OnJniRedoTask();
    }

    public void reset() {
        OnJniReset();
    }

    public void resetAndInitEncoderVersion(int i17, java.lang.String str) {
        OnJniResetAndInitEncoderVersion(i17, str);
    }

    public void setBackupIPs(java.lang.String str, java.lang.String[] strArr) {
        OnJniSetBackupIPs(str, strArr);
    }

    public void setCallback(com.tencent.mars.stn.StnManager.CallBack callBack) {
        OnJniSetCallback(callBack);
    }

    public void setDebugIP(java.lang.String str, java.lang.String str2) {
        OnJniSetDebugIP(str, str2);
    }

    public void setLonglinkSvrAddr(java.lang.String str, int[] iArr, java.lang.String str2) {
        OnJniSetLonglinkSvrAddr(str, iArr, str2);
    }

    public void setShortlinkSvrAddr(int i17, java.lang.String str) {
        OnJniSetShortlinkSvrAddr(i17, str);
    }

    public void setSignallingStrategy(long j17, long j18) {
        OnJniSetSignallingStrategy(j17, j18);
    }

    public void startTask(com.tencent.mars.stn.StnManager.Task task) {
        OnJniStartTask(task);
    }

    public void stopSignalling() {
        OnJniStopSignalling();
    }

    public void stopTask(int i17) {
        OnJniStopTask(i17);
    }

    public void touchTasks() {
        OnJniTouchTasks();
    }

    public StnManager(com.tencent.mars.app.Context context) {
        OnJniCreateStnManagerFromContext(context);
    }

    /* loaded from: classes12.dex */
    public static class Task {
        public static final int EBoth = 3;
        public static final int EFAST = 1;
        public static final int ELong = 2;
        public static final int ENORMAL = 0;
        public static final int EShort = 1;
        public static final int ETASK_PRIORITY_0 = 0;
        public static final int ETASK_PRIORITY_1 = 1;
        public static final int ETASK_PRIORITY_2 = 2;
        public static final int ETASK_PRIORITY_3 = 3;
        public static final int ETASK_PRIORITY_4 = 4;
        public static final int ETASK_PRIORITY_5 = 5;
        public static final int ETASK_PRIORITY_HIGHEST = 0;
        public static final int ETASK_PRIORITY_LOWEST = 5;
        public static final int ETASK_PRIORITY_NORMAL = 3;
        public static final int ETransportProtocolQUIC = 2;
        public static final int ETransportProtocolTCP = 1;
        public int bindCellular;
        public java.lang.String cgi;
        public long cgiID;
        public int channelSelect;
        public int channelStrategy;
        public int clientSequenceId;
        public int cmdID;
        public java.util.Map<java.lang.String, java.lang.String> extraInfo;
        public java.util.Map<java.lang.String, java.lang.String> headers;
        public boolean limitFlow;
        public boolean limitFrequency;
        public boolean longPolling;
        public int longPollingTimeout;
        public boolean needAuthed;
        public boolean needRealtimeNetInfo;
        public boolean networkStatusSensitive;
        public int priority;
        public byte[] reqBuf;
        public byte[] respBuf;
        public int retryCount;
        public boolean sendOnly;
        public int serverProcessCost;
        public java.util.ArrayList<java.lang.String> shortLinkHostList;
        public int taskID;
        public int totalTimeout;
        public boolean useReqBuf;
        public java.lang.Object userContext;

        /* loaded from: classes12.dex */
        public enum EBindCellularStrategy {
            kDefault,
            kForce,
            kTry
        }

        public Task(com.tencent.mars.app.Context context) {
            this.retryCount = -1;
            this.bindCellular = com.tencent.mars.stn.StnManager.Task.EBindCellularStrategy.kDefault.ordinal();
            this.useReqBuf = false;
            this.reqBuf = new byte[0];
            this.respBuf = new byte[0];
            this.taskID = com.tencent.mars.comm.Utils.genTaskId();
            this.headers = new java.util.HashMap();
        }

        public Task(com.tencent.mars.app.Context context, int i17, int i18, java.lang.String str, java.util.ArrayList<java.lang.String> arrayList) {
            this.retryCount = -1;
            com.tencent.mars.stn.StnManager.Task.EBindCellularStrategy eBindCellularStrategy = com.tencent.mars.stn.StnManager.Task.EBindCellularStrategy.kDefault;
            this.bindCellular = eBindCellularStrategy.ordinal();
            this.useReqBuf = false;
            this.reqBuf = new byte[0];
            this.respBuf = new byte[0];
            this.taskID = com.tencent.mars.comm.Utils.genTaskId();
            this.channelSelect = i17;
            this.cmdID = i18;
            this.cgi = str;
            this.shortLinkHostList = arrayList;
            this.sendOnly = false;
            this.needAuthed = true;
            this.limitFlow = true;
            this.limitFrequency = true;
            this.channelStrategy = 0;
            this.networkStatusSensitive = false;
            this.priority = 3;
            this.retryCount = -1;
            this.serverProcessCost = 0;
            this.totalTimeout = 0;
            this.userContext = null;
            this.headers = new java.util.HashMap();
            this.longPolling = false;
            this.longPollingTimeout = 0;
            this.needRealtimeNetInfo = false;
            this.bindCellular = eBindCellularStrategy.ordinal();
        }
    }
}
