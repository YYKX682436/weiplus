package a55;

/* loaded from: classes12.dex */
public class c implements com.tencent.mars.mm.MMStnManager.CallBack {
    @Override // com.tencent.mars.mm.MMStnManager.CallBack
    public int OnActionNotify(java.lang.String str, long j17, byte[] bArr, byte[] bArr2, byte[] bArr3, long j18) {
        return 2;
    }

    @Override // com.tencent.mars.mm.MMStnManager.CallBack
    public int ackActionNotify(java.lang.String str, long j17, int i17) {
        return 0;
    }

    @Override // com.tencent.mars.mm.MMStnManager.CallBack
    public void addMMNetCommonCallback(android.os.IInterface iInterface) {
    }

    @Override // com.tencent.mars.mm.MMStnManager.CallBack
    public int buf2Resp(int i17, java.lang.Object obj, java.lang.String str, byte[] bArr, int[] iArr, int[] iArr2, int i18, int[] iArr3) {
        d55.u.b("MMStnManagerCallbackForRecovery", "mars2 buf2Resp taskId:%d, userId:%s, errCode:%d channel:%d serverSequenceId:%d", java.lang.Integer.valueOf(i17), str, java.lang.Integer.valueOf(iArr[0]), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(iArr3[0]));
        try {
            return a55.g.f1614b.a(i17, bArr, iArr, iArr2, i18);
        } catch (java.lang.Exception e17) {
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            e17.printStackTrace(new java.io.PrintWriter(stringWriter));
            d55.u.d("MMStnManagerCallbackForRecovery", stringWriter.toString(), new java.lang.Object[0]);
            return -1;
        }
    }

    @Override // com.tencent.mars.mm.MMStnManager.CallBack
    public int doCertificateVerify(java.lang.String str, byte[][] bArr) {
        return -1;
    }

    @Override // com.tencent.mars.mm.MMStnManager.CallBack
    public int doLiveSpeedTest(java.lang.String str, int i17, int i18, int i19, int i27, byte[] bArr, byte[] bArr2, android.os.IInterface iInterface) {
        return 0;
    }

    @Override // com.tencent.mars.mm.MMStnManager.CallBack
    public void doNetIdRequest() {
    }

    @Override // com.tencent.mars.mm.MMStnManager.CallBack
    public java.lang.String getCurLanguage() {
        return "";
    }

    @Override // com.tencent.mars.mm.MMStnManager.CallBack
    public int getHostByName(java.lang.String str, java.util.List list) {
        return 0;
    }

    @Override // com.tencent.mars.mm.MMStnManager.CallBack
    public java.lang.String getIntegerExpt() {
        return null;
    }

    @Override // com.tencent.mars.mm.MMStnManager.CallBack
    public int getJavaActionId(long j17) {
        return 0;
    }

    @Override // com.tencent.mars.mm.MMStnManager.CallBack
    public int getLogIdSubType(long j17, java.lang.String str) {
        return 0;
    }

    @Override // com.tencent.mars.mm.MMStnManager.CallBack
    public int getSnsIpsForScene(java.util.List list, boolean z17) {
        return 0;
    }

    @Override // com.tencent.mars.mm.MMStnManager.CallBack
    public int getSnsIpsForSceneWithHostName(java.util.List list, java.lang.String str, boolean z17) {
        return 0;
    }

    @Override // com.tencent.mars.mm.MMStnManager.CallBack
    public java.lang.String getUserIDCLocale() {
        return null;
    }

    @Override // com.tencent.mars.mm.MMStnManager.CallBack
    public int getXAgreementId() {
        return 0;
    }

    @Override // com.tencent.mars.mm.MMStnManager.CallBack
    public java.lang.String ifUseNewNetId() {
        return "1";
    }

    @Override // com.tencent.mars.mm.MMStnManager.CallBack
    public int isOverseasUser() {
        return 0;
    }

    @Override // com.tencent.mars.mm.MMStnManager.CallBack
    public void networkAnalysisCallBack(int i17, int i18, boolean z17, java.lang.String str) {
    }

    @Override // com.tencent.mars.mm.MMStnManager.CallBack
    public void notifyNewSpeedTestReport(byte[] bArr, int i17, int i18, int i19, int i27, java.lang.String str, int i28, java.lang.String str2, int i29, int i37) {
    }

    @Override // com.tencent.mars.mm.MMStnManager.CallBack
    public void notifyPayCgiNewDnsTagIncorrect(int i17, java.lang.String str) {
    }

    @Override // com.tencent.mars.mm.MMStnManager.CallBack
    public void notifyPayCgiNewDnsTagMiss(int i17, java.lang.String str) {
    }

    @Override // com.tencent.mars.mm.MMStnManager.CallBack
    public void notifyStnWeaknet(boolean z17) {
    }

    @Override // com.tencent.mars.mm.MMStnManager.CallBack
    public void onDisasterNodeNotify(java.lang.String str) {
    }

    @Override // com.tencent.mars.mm.MMStnManager.CallBack
    public void onLiveSpeedTestCallback(com.tencent.mars.mm.LiveSpeedTestResult liveSpeedTestResult, boolean z17) {
    }

    @Override // com.tencent.mars.mm.MMStnManager.CallBack
    public void onOOBNotify(java.lang.String str) {
    }

    @Override // com.tencent.mars.mm.MMStnManager.CallBack
    public void receiveWeakNetNotify(boolean z17, int i17) {
    }

    @Override // com.tencent.mars.mm.MMStnManager.CallBack
    public void removeMMNetCommonCallback(android.os.IInterface iInterface) {
    }

    @Override // com.tencent.mars.mm.MMStnManager.CallBack
    public void reportFlow(int i17, int i18, int i19, int i27) {
    }

    @Override // com.tencent.mars.mm.MMStnManager.CallBack
    public void reportGroupIDKey(int[] iArr, int[] iArr2, int[] iArr3, int i17, boolean z17, boolean z18) {
    }

    @Override // com.tencent.mars.mm.MMStnManager.CallBack
    public void reportIDKey(long j17, long j18, long j19, boolean z17) {
    }

    @Override // com.tencent.mars.mm.MMStnManager.CallBack
    public void reportKV(long j17, java.lang.String str, boolean z17, boolean z18, long j18, boolean z19) {
    }

    @Override // com.tencent.mars.mm.MMStnManager.CallBack
    public void reportStat(com.tencent.mars.mm.MMStnManager.ReportInfo reportInfo) {
    }

    @Override // com.tencent.mars.mm.MMStnManager.CallBack
    public boolean req2Buf(int i17, java.lang.Object obj, java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream, int[] iArr, int i18, java.lang.String str2, int i19) {
        d55.u.b("MMStnManagerCallbackForRecovery", "mars2 req2Buf taskId:%d, userId:%s, errCode:%d errCode:%d, channel:%d, host:%s", java.lang.Integer.valueOf(i17), str, java.lang.Integer.valueOf(iArr[0]), java.lang.Integer.valueOf(iArr[1]), java.lang.Integer.valueOf(i18), str2);
        try {
            return a55.g.f1614b.d(i17, byteArrayOutputStream, iArr, i18, str2);
        } catch (java.lang.Exception e17) {
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            e17.printStackTrace(new java.io.PrintWriter(stringWriter));
            d55.u.d("MMStnManagerCallbackForRecovery", stringWriter.toString(), new java.lang.Object[0]);
            return false;
        }
    }

    @Override // com.tencent.mars.mm.MMStnManager.CallBack
    public void simpleTestCommand(java.lang.String str) {
    }
}
