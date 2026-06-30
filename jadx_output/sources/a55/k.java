package a55;

/* loaded from: classes12.dex */
public class k implements com.tencent.mars.stn.StnManager.CallBack {
    public final java.lang.String a(java.lang.Exception exc) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        exc.printStackTrace(new java.io.PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Override // com.tencent.mars.stn.StnManager.CallBack
    public int buf2Resp(int i17, java.lang.Object obj, java.lang.String str, byte[] bArr, int[] iArr, int[] iArr2, int i18, int[] iArr3) {
        d55.u.b("StnManagerCallbackForRecovery", "mars2 buf2Resp taskId:%d, userId:%s, errCode:%d, flags:%d, channel:%d serverSequenceId:%d", java.lang.Integer.valueOf(i17), str, java.lang.Integer.valueOf(iArr[0]), java.lang.Integer.valueOf(iArr2[0]), java.lang.Integer.valueOf(i18), iArr3);
        try {
            return a55.g.f1614b.a(i17, bArr, iArr, iArr2, i18);
        } catch (java.lang.Exception e17) {
            d55.u.d("StnManagerCallbackForRecovery", a(e17), new java.lang.Object[0]);
            return -1;
        }
    }

    @Override // com.tencent.mars.stn.StnManager.CallBack
    public int getLongLinkIdentifyCheckBuffer(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream, java.io.ByteArrayOutputStream byteArrayOutputStream2, int[] iArr) {
        return com.tencent.mars.stn.StnManager.ECHECK_NOW;
    }

    @Override // com.tencent.mars.stn.StnManager.CallBack
    public boolean makesureAuthed(java.lang.String str, java.lang.String str2) {
        return false;
    }

    @Override // com.tencent.mars.stn.StnManager.CallBack
    public void networkAnalysisCallBack(int i17, int i18, boolean z17, java.lang.String str) {
    }

    @Override // com.tencent.mars.stn.StnManager.CallBack
    public boolean onLongLinkIdentifyResponse(java.lang.String str, byte[] bArr, byte[] bArr2) {
        return true;
    }

    @Override // com.tencent.mars.stn.StnManager.CallBack
    public void onLongLinkNetworkError(com.tencent.mars.stn.ErrCmdType errCmdType, int i17, java.lang.String str, int i18) {
    }

    @Override // com.tencent.mars.stn.StnManager.CallBack
    public void onLongLinkStatusChange(int i17) {
    }

    @Override // com.tencent.mars.stn.StnManager.CallBack
    public java.lang.String[] onNewDns(java.lang.String str, boolean z17) {
        return new java.lang.String[0];
    }

    @Override // com.tencent.mars.stn.StnManager.CallBack
    public void onPush(java.lang.String str, int i17, int i18, byte[] bArr, byte[] bArr2) {
    }

    @Override // com.tencent.mars.stn.StnManager.CallBack
    public void onShortLinkNetworkError(com.tencent.mars.stn.ErrCmdType errCmdType, int i17, java.lang.String str, java.lang.String str2, int i18) {
    }

    @Override // com.tencent.mars.stn.StnManager.CallBack
    public int onTaskEnd(int i17, java.lang.Object obj, int i18, int i19, com.tencent.mars.stn.StnManager.CgiProfile cgiProfile, byte[] bArr) {
        int i27;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onTaskEnd ");
        sb6.append(cgiProfile != null ? cgiProfile.startConnectTime : -1L);
        sb6.append(" ");
        sb6.append(cgiProfile != null ? cgiProfile.readPacketFinishedTime : -1L);
        sb6.append(" ");
        sb6.append(cgiProfile != null ? cgiProfile.rtt : -1L);
        sb6.append(" ");
        sb6.append(cgiProfile != null ? cgiProfile.channelType : -1);
        sb6.append(" ");
        sb6.append(cgiProfile != null ? cgiProfile.taskStartTime : -1L);
        d55.u.b("StnManagerCallbackForRecovery", sb6.toString(), new java.lang.Object[0]);
        try {
            i27 = a55.g.f1614b.b(i17);
        } catch (java.lang.Exception e17) {
            e = e17;
            i27 = 0;
        }
        try {
            y45.u.a().post(new a55.j(this, i17, i18, i19, cgiProfile));
        } catch (java.lang.Exception e18) {
            e = e18;
            d55.u.d("StnManagerCallbackForRecovery", a(e), new java.lang.Object[0]);
            return i27;
        }
        return i27;
    }

    @Override // com.tencent.mars.stn.StnManager.CallBack
    public void onTaskNotifyError(int i17, java.lang.Object obj, int i18, int i19, com.tencent.mars.stn.StnManager.CgiProfile cgiProfile, byte[] bArr) {
        d55.u.d("StnManagerCallbackForRecovery", "onTaskDecodeError taskId:%d, errType:%d, errCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
    }

    @Override // com.tencent.mars.stn.StnManager.CallBack
    public void reportConnectStatus(int i17, int i18) {
    }

    @Override // com.tencent.mars.stn.StnManager.CallBack
    public void reportTaskProfile(java.lang.String str) {
    }

    @Override // com.tencent.mars.stn.StnManager.CallBack
    public boolean req2Buf(int i17, java.lang.Object obj, java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream, int[] iArr, int i18, java.lang.String str2, int i19) {
        d55.u.b("StnManagerCallbackForRecovery", "mars2 req2Buf taskId:%d, userId:%s, errCode:%d errCode:%d, channel:%d, host:%s", java.lang.Integer.valueOf(i17), str, java.lang.Integer.valueOf(iArr[0]), java.lang.Integer.valueOf(iArr[1]), java.lang.Integer.valueOf(i18), str2);
        try {
            return a55.g.f1614b.d(i17, byteArrayOutputStream, iArr, i18, str2);
        } catch (java.lang.Exception e17) {
            d55.u.d("StnManagerCallbackForRecovery", a(e17), new java.lang.Object[0]);
            return false;
        }
    }

    @Override // com.tencent.mars.stn.StnManager.CallBack
    public java.lang.String[] requestNetCheckShortLinkHosts() {
        return new java.lang.String[0];
    }

    @Override // com.tencent.mars.stn.StnManager.CallBack
    public void requestSync() {
    }

    @Override // com.tencent.mars.stn.StnManager.CallBack
    public void trafficData(int i17, int i18) {
    }
}
