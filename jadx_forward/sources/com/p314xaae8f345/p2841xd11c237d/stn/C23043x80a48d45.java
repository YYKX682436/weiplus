package com.p314xaae8f345.p2841xd11c237d.stn;

/* renamed from: com.tencent.paymars.stn.StnManagerCallback */
/* loaded from: classes12.dex */
public class C23043x80a48d45 implements com.p314xaae8f345.p2841xd11c237d.stn.C23042x9a94e8e0.CallBack {

    /* renamed from: NEWSYNCCHECK_CMDID_REQ */
    private static int f40356xf40284e2 = 205;

    /* renamed from: NEWSYNCCHECK_CMDID_RESP */
    private static int f40357x8c4e17ec = 1000000205;
    private static final java.lang.String TAG = "StnManagerCallback";

    /* renamed from: wLock */
    private static com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9 f40358x6b12642;

    /* renamed from: cacheKeyBuf */
    private byte[] f40359x12ce49b6;

    /* renamed from: cacheMd5Buf */
    private byte[] f40360x160afa37;

    /* renamed from: mWakelockTimeMs */
    private final long f40361x9034a0cf = com.p314xaae8f345.mm.p971x6de15a2e.g1.M();

    /* renamed from: exception2String */
    private java.lang.String m84627x6cf4e7b4(java.lang.Exception exc) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        exc.printStackTrace(new java.io.PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.stn.C23042x9a94e8e0.CallBack
    /* renamed from: buf2Resp */
    public int mo84610xa261f88f(int i17, java.lang.Object obj, java.lang.String str, byte[] bArr, int[] iArr, int[] iArr2, int i18, int[] iArr3) {
        if (com.p314xaae8f345.mm.p971x6de15a2e.x2.h() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "mars2 buf2Resp NetTaskAdapter is empty.");
            return -1;
        }
        int i19 = iArr[0];
        int i27 = iArr3[0];
        try {
            return com.p314xaae8f345.mm.p971x6de15a2e.x2.h().a(i17, obj, bArr, iArr, iArr2, i18, iArr3);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, m84627x6cf4e7b4(e17));
            return -1;
        }
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.stn.C23042x9a94e8e0.CallBack
    /* renamed from: getLongLinkIdentifyCheckBuffer */
    public int mo84611xca682310(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream, java.io.ByteArrayOutputStream byteArrayOutputStream2, int[] iArr) {
        iArr[0] = f40356xf40284e2;
        iArr[1] = f40357x8c4e17ec;
        return (m84628x870d79c5(byteArrayOutputStream, byteArrayOutputStream2) == 0 || byteArrayOutputStream.size() == 0 || byteArrayOutputStream2.size() == 0) ? com.p314xaae8f345.p2841xd11c237d.stn.C23042x9a94e8e0.f40272x21694def : com.p314xaae8f345.p2841xd11c237d.stn.C23042x9a94e8e0.f40273x95b9143a;
    }

    /* renamed from: getSyncCheckInfo */
    public int m84628x870d79c5(java.io.ByteArrayOutputStream byteArrayOutputStream, java.io.ByteArrayOutputStream byteArrayOutputStream2) {
        if (com.p314xaae8f345.mm.p971x6de15a2e.x2.c() == null) {
            return 0;
        }
        try {
            byte[] S = com.p314xaae8f345.mm.p971x6de15a2e.x2.c().S();
            if (S != null) {
                byteArrayOutputStream.write(S);
                this.f40359x12ce49b6 = S;
            }
            byte[] bArr = com.p314xaae8f345.mm.p971x6de15a2e.x2.c().f153536x;
            if (bArr != null) {
                byteArrayOutputStream2.write(bArr);
                this.f40360x160afa37 = bArr;
            }
            return com.p314xaae8f345.mm.p971x6de15a2e.x2.c().f153526n.f153435o;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, m84627x6cf4e7b4(e17));
            byte[] bArr2 = this.f40359x12ce49b6;
            if (bArr2 != null && this.f40360x160afa37 != null) {
                try {
                    byteArrayOutputStream.write(bArr2);
                    byteArrayOutputStream2.write(this.f40360x160afa37);
                } catch (java.io.IOException unused) {
                }
            }
            return 0;
        }
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.stn.C23042x9a94e8e0.CallBack
    /* renamed from: makesureAuthed */
    public boolean mo84612x9780e92a(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.p971x6de15a2e.x2.c() == null) {
            return false;
        }
        try {
            return com.p314xaae8f345.mm.p971x6de15a2e.x2.c().V(str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, m84627x6cf4e7b4(e17));
            return false;
        }
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.stn.C23042x9a94e8e0.CallBack
    /* renamed from: networkAnalysisCallBack */
    public void mo84613x252d11af(int i17, int i18, boolean z17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "networkAnalysisCallBack: status:%d, stage:%d, isDetectEnd:%b, kvInfo:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z17), str);
        try {
            com.p314xaae8f345.mm.p971x6de15a2e.x2.c().f153537y.mo48346x252d11af(i17, i18, z17, str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.stn.C23042x9a94e8e0.CallBack
    /* renamed from: onLongLinkIdentifyResponse */
    public boolean mo84614xae260522(java.lang.String str, byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            return true;
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(bArr);
            byteArrayOutputStream.write(bArr2);
        } catch (java.io.IOException unused) {
        }
        mo84618xc39e2999(str, f40357x8c4e17ec, 0, byteArrayOutputStream.toByteArray(), new byte[0]);
        m84629x35843efe(byteArrayOutputStream.toByteArray());
        return true;
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.stn.C23042x9a94e8e0.CallBack
    /* renamed from: onLongLinkNetworkError */
    public void mo84615x3138c0af(com.p314xaae8f345.p2841xd11c237d.stn.EnumC23041xb875d68f enumC23041xb875d68f, int i17, java.lang.String str, int i18) {
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.stn.C23042x9a94e8e0.CallBack
    /* renamed from: onLongLinkStatusChange */
    public void mo84616x94a79e77(int i17) {
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.stn.C23042x9a94e8e0.CallBack
    /* renamed from: onNewDns */
    public java.lang.String[] mo84617x50705628(java.lang.String str, boolean z17) {
        return new java.lang.String[0];
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.stn.C23042x9a94e8e0.CallBack
    /* renamed from: onPush */
    public void mo84618xc39e2999(java.lang.String str, final int i17, int i18, final byte[] bArr, byte[] bArr2) {
        if (com.p314xaae8f345.mm.p971x6de15a2e.x2.f() == null) {
            return;
        }
        try {
            if (f40358x6b12642 == null) {
                f40358x6b12642 = new com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9(com.p314xaae8f345.mm.p971x6de15a2e.x2.d(), TAG);
            }
            f40358x6b12642.m40015x32c52b(this.f40361x9034a0cf, "StnLogic.onNotify");
            com.p314xaae8f345.mm.p971x6de15a2e.x2.e().mo50293x3498a0(new java.lang.Runnable() { // from class: com.tencent.paymars.stn.StnManagerCallback.1
                @Override // java.lang.Runnable
                public void run() {
                    com.p314xaae8f345.mm.p971x6de15a2e.x2.f().a(i17, bArr);
                }
            });
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, m84627x6cf4e7b4(e17));
        }
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.stn.C23042x9a94e8e0.CallBack
    /* renamed from: onShortLinkNetworkError */
    public void mo84619x2add591(com.p314xaae8f345.p2841xd11c237d.stn.EnumC23041xb875d68f enumC23041xb875d68f, int i17, java.lang.String str, java.lang.String str2, int i18) {
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.stn.C23042x9a94e8e0.CallBack
    /* renamed from: onTaskEnd */
    public int mo84620xf4053237(final int i17, final java.lang.Object obj, final int i18, final int i19, final com.p314xaae8f345.p2841xd11c237d.stn.C23042x9a94e8e0.CgiProfile cgiProfile) {
        int i27 = 0;
        if (com.p314xaae8f345.mm.p971x6de15a2e.x2.h() == null) {
            return 0;
        }
        long j17 = cgiProfile.f40308x1dff6d15;
        try {
            i27 = com.p314xaae8f345.mm.p971x6de15a2e.x2.h().g(i17);
            com.p314xaae8f345.mm.p971x6de15a2e.x2.e().mo50293x3498a0(new java.lang.Runnable() { // from class: com.tencent.paymars.stn.StnManagerCallback.2
                /* JADX WARN: Can't wrap try/catch for region: R(27:11|(1:13)|(1:15)|16|(1:116)(1:19)|20|21|22|23|25|26|(8:28|29|30|31|32|33|34|35)|(3:80|81|(14:84|38|39|40|41|42|(1:52)|53|54|55|(2:57|(4:59|60|61|62))|65|61|62))|37|38|39|40|41|42|(2:44|52)|53|54|55|(0)|65|61|62) */
                /* JADX WARN: Code restructure failed: missing block: B:72:0x00d6, code lost:
                
                    r0 = e;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:76:0x00da, code lost:
                
                    r0 = e;
                 */
                /* JADX WARN: Removed duplicated region for block: B:44:0x01ad  */
                /* JADX WARN: Removed duplicated region for block: B:57:0x01db A[Catch: Exception -> 0x0201, TRY_LEAVE, TryCatch #13 {Exception -> 0x0201, blocks: (B:54:0x01c7, B:57:0x01db), top: B:53:0x01c7 }] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void run() {
                    /*
                        Method dump skipped, instructions count: 556
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p2841xd11c237d.stn.C23043x80a48d45.AnonymousClass2.run():void");
                }
            });
            return i27;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, m84627x6cf4e7b4(e17));
            return i27;
        }
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.stn.C23042x9a94e8e0.CallBack
    /* renamed from: reportConnectStatus */
    public void mo84621x83f14ca8(int i17, int i18) {
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.stn.C23042x9a94e8e0.CallBack
    /* renamed from: reportTaskProfile */
    public void mo84622x9db36690(java.lang.String str) {
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.stn.C23042x9a94e8e0.CallBack
    /* renamed from: req2Buf */
    public boolean mo84623x412ffa7f(int i17, java.lang.Object obj, java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream, int[] iArr, int i18, java.lang.String str2, int i19) {
        if (com.p314xaae8f345.mm.p971x6de15a2e.x2.h() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "mars2 req2Buf NetTaskAdapter is empty.");
            return false;
        }
        int i27 = iArr[0];
        int i28 = iArr[1];
        try {
            return com.p314xaae8f345.mm.p971x6de15a2e.x2.h().n(i17, obj, byteArrayOutputStream, iArr, i18, str2, i19);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, m84627x6cf4e7b4(e17));
            return false;
        }
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.stn.C23042x9a94e8e0.CallBack
    /* renamed from: requestNetCheckShortLinkHosts */
    public java.lang.String[] mo84624x4870e68f() {
        return new java.lang.String[0];
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.stn.C23042x9a94e8e0.CallBack
    /* renamed from: requestSync */
    public void mo84625x448ca1ca() {
        if (com.p314xaae8f345.mm.p971x6de15a2e.x2.f() == null) {
            return;
        }
        try {
            com.p314xaae8f345.mm.p971x6de15a2e.x2.e().mo50293x3498a0(new java.lang.Runnable() { // from class: com.tencent.paymars.stn.StnManagerCallback.3
                @Override // java.lang.Runnable
                public void run() {
                    com.p314xaae8f345.mm.p971x6de15a2e.x2.f().a(24, kk.u.d(7));
                }
            });
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, m84627x6cf4e7b4(e17));
        }
    }

    /* renamed from: saveSyncCheckInfo */
    public void m84629x35843efe(byte[] bArr) {
        com.p314xaae8f345.mm.p971x6de15a2e.x2.c().w0(bArr);
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.stn.C23042x9a94e8e0.CallBack
    /* renamed from: trafficData */
    public void mo84626x9e773f47(int i17, int i18) {
    }
}
