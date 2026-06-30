package a55;

/* loaded from: classes12.dex */
public class k implements com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.CallBack {
    public final java.lang.String a(java.lang.Exception exc) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        exc.printStackTrace(new java.io.PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Override // com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.CallBack
    /* renamed from: buf2Resp */
    public int mo698xa261f88f(int i17, java.lang.Object obj, java.lang.String str, byte[] bArr, int[] iArr, int[] iArr2, int i18, int[] iArr3) {
        d55.u.b("StnManagerCallbackForRecovery", "mars2 buf2Resp taskId:%d, userId:%s, errCode:%d, flags:%d, channel:%d serverSequenceId:%d", java.lang.Integer.valueOf(i17), str, java.lang.Integer.valueOf(iArr[0]), java.lang.Integer.valueOf(iArr2[0]), java.lang.Integer.valueOf(i18), iArr3);
        try {
            return a55.g.f83147b.a(i17, bArr, iArr, iArr2, i18);
        } catch (java.lang.Exception e17) {
            d55.u.d("StnManagerCallbackForRecovery", a(e17), new java.lang.Object[0]);
            return -1;
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.CallBack
    /* renamed from: getLongLinkIdentifyCheckBuffer */
    public int mo699xca682310(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream, java.io.ByteArrayOutputStream byteArrayOutputStream2, int[] iArr) {
        return com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.f19569x95b9143a;
    }

    @Override // com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.CallBack
    /* renamed from: makesureAuthed */
    public boolean mo700x9780e92a(java.lang.String str, java.lang.String str2) {
        return false;
    }

    @Override // com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.CallBack
    /* renamed from: networkAnalysisCallBack */
    public void mo701x252d11af(int i17, int i18, boolean z17, java.lang.String str) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.CallBack
    /* renamed from: onLongLinkIdentifyResponse */
    public boolean mo702xae260522(java.lang.String str, byte[] bArr, byte[] bArr2) {
        return true;
    }

    @Override // com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.CallBack
    /* renamed from: onLongLinkNetworkError */
    public void mo703x3138c0af(com.p314xaae8f345.p542x3306d5.stn.EnumC4591xb875d68f enumC4591xb875d68f, int i17, java.lang.String str, int i18) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.CallBack
    /* renamed from: onLongLinkStatusChange */
    public void mo704x94a79e77(int i17) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.CallBack
    /* renamed from: onNewDns */
    public java.lang.String[] mo705x50705628(java.lang.String str, boolean z17) {
        return new java.lang.String[0];
    }

    @Override // com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.CallBack
    /* renamed from: onPush */
    public void mo706xc39e2999(java.lang.String str, int i17, int i18, byte[] bArr, byte[] bArr2) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.CallBack
    /* renamed from: onShortLinkNetworkError */
    public void mo707x2add591(com.p314xaae8f345.p542x3306d5.stn.EnumC4591xb875d68f enumC4591xb875d68f, int i17, java.lang.String str, java.lang.String str2, int i18) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.CallBack
    /* renamed from: onTaskEnd */
    public int mo708xf4053237(int i17, java.lang.Object obj, int i18, int i19, com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.CgiProfile cgiProfile, byte[] bArr) {
        int i27;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onTaskEnd ");
        sb6.append(cgiProfile != null ? cgiProfile.f19604x1dff6d15 : -1L);
        sb6.append(" ");
        sb6.append(cgiProfile != null ? cgiProfile.f19602xc06a2f3d : -1L);
        sb6.append(" ");
        sb6.append(cgiProfile != null ? cgiProfile.rtt : -1L);
        sb6.append(" ");
        sb6.append(cgiProfile != null ? cgiProfile.f19594x105746dd : -1);
        sb6.append(" ");
        sb6.append(cgiProfile != null ? cgiProfile.f19612xf3a4da4a : -1L);
        d55.u.b("StnManagerCallbackForRecovery", sb6.toString(), new java.lang.Object[0]);
        try {
            i27 = a55.g.f83147b.b(i17);
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

    @Override // com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.CallBack
    /* renamed from: onTaskNotifyError */
    public void mo709x4d94fd9b(int i17, java.lang.Object obj, int i18, int i19, com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.CgiProfile cgiProfile, byte[] bArr) {
        d55.u.d("StnManagerCallbackForRecovery", "onTaskDecodeError taskId:%d, errType:%d, errCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
    }

    @Override // com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.CallBack
    /* renamed from: reportConnectStatus */
    public void mo710x83f14ca8(int i17, int i18) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.CallBack
    /* renamed from: reportTaskProfile */
    public void mo711x9db36690(java.lang.String str) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.CallBack
    /* renamed from: req2Buf */
    public boolean mo712x412ffa7f(int i17, java.lang.Object obj, java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream, int[] iArr, int i18, java.lang.String str2, int i19) {
        d55.u.b("StnManagerCallbackForRecovery", "mars2 req2Buf taskId:%d, userId:%s, errCode:%d errCode:%d, channel:%d, host:%s", java.lang.Integer.valueOf(i17), str, java.lang.Integer.valueOf(iArr[0]), java.lang.Integer.valueOf(iArr[1]), java.lang.Integer.valueOf(i18), str2);
        try {
            return a55.g.f83147b.d(i17, byteArrayOutputStream, iArr, i18, str2);
        } catch (java.lang.Exception e17) {
            d55.u.d("StnManagerCallbackForRecovery", a(e17), new java.lang.Object[0]);
            return false;
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.CallBack
    /* renamed from: requestNetCheckShortLinkHosts */
    public java.lang.String[] mo713x4870e68f() {
        return new java.lang.String[0];
    }

    @Override // com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.CallBack
    /* renamed from: requestSync */
    public void mo714x448ca1ca() {
    }

    @Override // com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.CallBack
    /* renamed from: trafficData */
    public void mo715x9e773f47(int i17, int i18) {
    }
}
