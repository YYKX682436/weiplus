package a55;

/* loaded from: classes12.dex */
public class c implements com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.CallBack {
    @Override // com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.CallBack
    /* renamed from: OnActionNotify */
    public int mo659x8a9f58be(java.lang.String str, long j17, byte[] bArr, byte[] bArr2, byte[] bArr3, long j18) {
        return 2;
    }

    @Override // com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.CallBack
    /* renamed from: ackActionNotify */
    public int mo660x708d4848(java.lang.String str, long j17, int i17) {
        return 0;
    }

    @Override // com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.CallBack
    /* renamed from: addMMNetCommonCallback */
    public void mo661x7433764c(android.os.IInterface iInterface) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.CallBack
    /* renamed from: buf2Resp */
    public int mo662xa261f88f(int i17, java.lang.Object obj, java.lang.String str, byte[] bArr, int[] iArr, int[] iArr2, int i18, int[] iArr3) {
        d55.u.b("MMStnManagerCallbackForRecovery", "mars2 buf2Resp taskId:%d, userId:%s, errCode:%d channel:%d serverSequenceId:%d", java.lang.Integer.valueOf(i17), str, java.lang.Integer.valueOf(iArr[0]), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(iArr3[0]));
        try {
            return a55.g.f83147b.a(i17, bArr, iArr, iArr2, i18);
        } catch (java.lang.Exception e17) {
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            e17.printStackTrace(new java.io.PrintWriter(stringWriter));
            d55.u.d("MMStnManagerCallbackForRecovery", stringWriter.toString(), new java.lang.Object[0]);
            return -1;
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.CallBack
    /* renamed from: doCertificateVerify */
    public int mo663x2f1063a5(java.lang.String str, byte[][] bArr) {
        return -1;
    }

    @Override // com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.CallBack
    /* renamed from: doLiveSpeedTest */
    public int mo664x17921322(java.lang.String str, int i17, int i18, int i19, int i27, byte[] bArr, byte[] bArr2, android.os.IInterface iInterface) {
        return 0;
    }

    @Override // com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.CallBack
    /* renamed from: doNetIdRequest */
    public void mo665xed157802() {
    }

    @Override // com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.CallBack
    /* renamed from: getCurLanguage */
    public java.lang.String mo666xbdfe8082() {
        return "";
    }

    @Override // com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.CallBack
    /* renamed from: getHostByName */
    public int mo667x8faab340(java.lang.String str, java.util.List list) {
        return 0;
    }

    @Override // com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.CallBack
    /* renamed from: getIntegerExpt */
    public java.lang.String mo668x96e271f() {
        return null;
    }

    @Override // com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.CallBack
    /* renamed from: getJavaActionId */
    public int mo669x641430a9(long j17) {
        return 0;
    }

    @Override // com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.CallBack
    /* renamed from: getLogIdSubType */
    public int mo670x47ecc391(long j17, java.lang.String str) {
        return 0;
    }

    @Override // com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.CallBack
    /* renamed from: getSnsIpsForScene */
    public int mo671x65185ded(java.util.List list, boolean z17) {
        return 0;
    }

    @Override // com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.CallBack
    /* renamed from: getSnsIpsForSceneWithHostName */
    public int mo672x77eff5c6(java.util.List list, java.lang.String str, boolean z17) {
        return 0;
    }

    @Override // com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.CallBack
    /* renamed from: getUserIDCLocale */
    public java.lang.String mo673xfa8df3e1() {
        return null;
    }

    @Override // com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.CallBack
    /* renamed from: getXAgreementId */
    public int mo674xb4bebfa3() {
        return 0;
    }

    @Override // com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.CallBack
    /* renamed from: ifUseNewNetId */
    public java.lang.String mo675xe56f1322() {
        return "1";
    }

    @Override // com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.CallBack
    /* renamed from: isOverseasUser */
    public int mo676x6682a70d() {
        return 0;
    }

    @Override // com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.CallBack
    /* renamed from: networkAnalysisCallBack */
    public void mo677x252d11af(int i17, int i18, boolean z17, java.lang.String str) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.CallBack
    /* renamed from: notifyNewSpeedTestReport */
    public void mo678xc058cd76(byte[] bArr, int i17, int i18, int i19, int i27, java.lang.String str, int i28, java.lang.String str2, int i29, int i37) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.CallBack
    /* renamed from: notifyPayCgiNewDnsTagIncorrect */
    public void mo679x5825913a(int i17, java.lang.String str) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.CallBack
    /* renamed from: notifyPayCgiNewDnsTagMiss */
    public void mo680x47b0a247(int i17, java.lang.String str) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.CallBack
    /* renamed from: notifyStnWeaknet */
    public void mo681x31a1e061(boolean z17) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.CallBack
    /* renamed from: onDisasterNodeNotify */
    public void mo682x12aa61eb(java.lang.String str) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.CallBack
    /* renamed from: onLiveSpeedTestCallback */
    public void mo683xce1830b3(com.p314xaae8f345.p542x3306d5.mm.C4567xf5d28c4a c4567xf5d28c4a, boolean z17) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.CallBack
    /* renamed from: onOOBNotify */
    public void mo684x851b014c(java.lang.String str) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.CallBack
    /* renamed from: receiveWeakNetNotify */
    public void mo685x7797f08b(boolean z17, int i17) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.CallBack
    /* renamed from: removeMMNetCommonCallback */
    public void mo686x7b24ad89(android.os.IInterface iInterface) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.CallBack
    /* renamed from: reportFlow */
    public void mo687x73181082(int i17, int i18, int i19, int i27) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.CallBack
    /* renamed from: reportGroupIDKey */
    public void mo688xc9114479(int[] iArr, int[] iArr2, int[] iArr3, int i17, boolean z17, boolean z18) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.CallBack
    /* renamed from: reportIDKey */
    public void mo689xf0018e90(long j17, long j18, long j19, boolean z17) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.CallBack
    /* renamed from: reportKV */
    public void mo690xe68be19f(long j17, java.lang.String str, boolean z17, boolean z18, long j18, boolean z19) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.CallBack
    /* renamed from: reportStat */
    public void mo691x731e15a8(com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.ReportInfo reportInfo) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.CallBack
    /* renamed from: req2Buf */
    public boolean mo692x412ffa7f(int i17, java.lang.Object obj, java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream, int[] iArr, int i18, java.lang.String str2, int i19) {
        d55.u.b("MMStnManagerCallbackForRecovery", "mars2 req2Buf taskId:%d, userId:%s, errCode:%d errCode:%d, channel:%d, host:%s", java.lang.Integer.valueOf(i17), str, java.lang.Integer.valueOf(iArr[0]), java.lang.Integer.valueOf(iArr[1]), java.lang.Integer.valueOf(i18), str2);
        try {
            return a55.g.f83147b.d(i17, byteArrayOutputStream, iArr, i18, str2);
        } catch (java.lang.Exception e17) {
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            e17.printStackTrace(new java.io.PrintWriter(stringWriter));
            d55.u.d("MMStnManagerCallbackForRecovery", stringWriter.toString(), new java.lang.Object[0]);
            return false;
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.CallBack
    /* renamed from: simpleTestCommand */
    public void mo693x19d1d47(java.lang.String str) {
    }
}
