package com.tencent.mars.stn;

/* loaded from: classes12.dex */
public class StnManagerCallback implements com.tencent.mars.stn.StnManager.CallBack {
    private static int NEWSYNCCHECK3_CMDID_REQ = 800;
    private static int NEWSYNCCHECK3_CMDID_RESP = 1000000800;
    private static int NEWSYNCCHECK_CMDID_REQ = 205;
    private static int NEWSYNCCHECK_CMDID_RESP = 1000000205;
    private static final java.lang.String TAG = "StnManagerCallback";
    private static com.tencent.mars.comm.MMWakerLock wLock;
    private byte[] cacheKeyBuf;
    private byte[] cacheMd5Buf;
    private final long mWakelockTimeMs = com.tencent.mm.network.g1.M();

    private java.lang.String exception2String(java.lang.Exception exc) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        exc.printStackTrace(new java.io.PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Override // com.tencent.mars.stn.StnManager.CallBack
    public int buf2Resp(int i17, java.lang.Object obj, java.lang.String str, byte[] bArr, int[] iArr, int[] iArr2, int i18, int[] iArr3) {
        if (com.tencent.mm.network.x2.h() == null) {
            com.tencent.mars.xlog.Log.e(TAG, "mars2 buf2Resp NetTaskAdapter is empty.");
            return -1;
        }
        int i19 = iArr[0];
        int i27 = iArr3[0];
        try {
            return com.tencent.mm.network.x2.h().a(i17, obj, bArr, iArr, iArr2, i18, iArr3);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, exception2String(e17));
            return -1;
        }
    }

    @Override // com.tencent.mars.stn.StnManager.CallBack
    public int getLongLinkIdentifyCheckBuffer(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream, java.io.ByteArrayOutputStream byteArrayOutputStream2, int[] iArr) {
        if (o45.ji.a()) {
            iArr[0] = NEWSYNCCHECK3_CMDID_REQ;
            iArr[1] = NEWSYNCCHECK3_CMDID_RESP;
        } else {
            iArr[0] = NEWSYNCCHECK_CMDID_REQ;
            iArr[1] = NEWSYNCCHECK_CMDID_RESP;
        }
        return (getSyncCheckInfo(byteArrayOutputStream, byteArrayOutputStream2) == 0 || byteArrayOutputStream.size() == 0 || byteArrayOutputStream2.size() == 0) ? com.tencent.mars.stn.StnManager.ECHECK_NEXT : com.tencent.mars.stn.StnManager.ECHECK_NOW;
    }

    public int getSyncCheckInfo(java.io.ByteArrayOutputStream byteArrayOutputStream, java.io.ByteArrayOutputStream byteArrayOutputStream2) {
        if (com.tencent.mm.network.x2.c() == null) {
            return 0;
        }
        try {
            byte[] S = com.tencent.mm.network.x2.c().S();
            if (S != null) {
                byteArrayOutputStream.write(S);
                this.cacheKeyBuf = S;
            }
            byte[] bArr = com.tencent.mm.network.x2.c().f72003x;
            if (bArr != null) {
                byteArrayOutputStream2.write(bArr);
                this.cacheMd5Buf = bArr;
            }
            return com.tencent.mm.network.x2.c().f71993n.f71902o;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, exception2String(e17));
            byte[] bArr2 = this.cacheKeyBuf;
            if (bArr2 != null && this.cacheMd5Buf != null) {
                try {
                    byteArrayOutputStream.write(bArr2);
                    byteArrayOutputStream2.write(this.cacheMd5Buf);
                } catch (java.io.IOException unused) {
                }
            }
            return 0;
        }
    }

    @Override // com.tencent.mars.stn.StnManager.CallBack
    public boolean makesureAuthed(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.network.x2.c() == null) {
            return false;
        }
        try {
            return com.tencent.mm.network.x2.c().V(str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, exception2String(e17));
            return false;
        }
    }

    @Override // com.tencent.mars.stn.StnManager.CallBack
    public void networkAnalysisCallBack(int i17, int i18, boolean z17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i(TAG, "networkAnalysisCallBack: status:%d, stage:%d, isDetectEnd:%b, kvInfo:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z17), str);
        try {
            com.tencent.mm.network.x2.c().f72004y.networkAnalysisCallBack(i17, i18, z17, str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mars.stn.StnManager.CallBack
    public boolean onLongLinkIdentifyResponse(java.lang.String str, byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Integer.valueOf(bArr == null ? 0 : bArr.length);
            objArr[1] = java.lang.Integer.valueOf(bArr2 != null ? bArr2.length : 0);
            com.tencent.mars.xlog.Log.w(TAG, "synccheck3 buffer:%d hashCodeBuffer:%d.", objArr);
        } else {
            boolean a17 = o45.ji.a();
            int i17 = a17 ? NEWSYNCCHECK3_CMDID_RESP : NEWSYNCCHECK_CMDID_RESP;
            if (a17) {
                onPush(str, i17, 0, bArr, new byte[0]);
                saveSyncCheckInfo(bArr);
            } else {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                try {
                    byteArrayOutputStream.write(bArr);
                    byteArrayOutputStream.write(bArr2);
                } catch (java.io.IOException unused) {
                }
                onPush(str, i17, 0, byteArrayOutputStream.toByteArray(), new byte[0]);
                saveSyncCheckInfo(byteArrayOutputStream.toByteArray());
            }
        }
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
    public void onPush(java.lang.String str, final int i17, int i18, final byte[] bArr, byte[] bArr2) {
        if (com.tencent.mm.network.x2.f() == null) {
            return;
        }
        try {
            if (wLock == null) {
                wLock = new com.tencent.mars.comm.MMWakerLock(com.tencent.mm.network.x2.d(), TAG);
            }
            wLock.lock(this.mWakelockTimeMs, "StnLogic.onNotify");
            com.tencent.mm.network.x2.e().post(new java.lang.Runnable() { // from class: com.tencent.mars.stn.StnManagerCallback.1
                @Override // java.lang.Runnable
                public void run() {
                    com.tencent.mm.network.x2.f().a(i17, bArr);
                }
            });
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, exception2String(e17));
        }
    }

    @Override // com.tencent.mars.stn.StnManager.CallBack
    public void onShortLinkNetworkError(com.tencent.mars.stn.ErrCmdType errCmdType, int i17, java.lang.String str, java.lang.String str2, int i18) {
    }

    @Override // com.tencent.mars.stn.StnManager.CallBack
    public int onTaskEnd(final int i17, final java.lang.Object obj, final int i18, final int i19, final com.tencent.mars.stn.StnManager.CgiProfile cgiProfile, final byte[] bArr) {
        int i27 = 0;
        if (com.tencent.mm.network.x2.h() == null) {
            return 0;
        }
        long j17 = cgiProfile.startConnectTime;
        try {
            i27 = com.tencent.mm.network.x2.h().g(i17);
            com.tencent.mm.network.x2.e().post(new java.lang.Runnable() { // from class: com.tencent.mars.stn.StnManagerCallback.2
                /* JADX WARN: Can't wrap try/catch for region: R(12:41|42|(2:43|44)|(2:46|(16:48|(10:50|(1:52)(1:139)|(4:130|131|132|133)(1:56)|57|58|59|60|62|63|64)(8:140|141|142|144|145|147|148|149)|(3:102|103|(12:106|67|68|69|70|71|(1:81)|82|83|(1:91)(1:87)|88|89))|66|67|68|69|70|71|(2:73|81)|82|83|(1:85)|91|88|89))|162|163|164|165|166|167|(1:169)(1:172)|170) */
                /* JADX WARN: Can't wrap try/catch for region: R(27:12|(1:14)|(1:16)|17|(1:213)(1:20)|21|22|23|24|(12:25|26|27|28|29|30|31|33|34|35|36|37)|(1:185)(13:41|42|43|44|(2:46|(16:48|(10:50|(1:52)(1:139)|(4:130|131|132|133)(1:56)|57|58|59|60|62|63|64)(8:140|141|142|144|145|147|148|149)|(3:102|103|(12:106|67|68|69|70|71|(1:81)|82|83|(1:91)(1:87)|88|89))|66|67|68|69|70|71|(2:73|81)|82|83|(1:85)|91|88|89))|162|163|164|165|166|167|(1:169)(1:172)|170)|171|(0)(0)|(0)|66|67|68|69|70|71|(0)|82|83|(0)|91|88|89) */
                /* JADX WARN: Code restructure failed: missing block: B:100:0x0205, code lost:
                
                    r27 = r14;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:173:0x0221, code lost:
                
                    r0 = e;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:175:0x0223, code lost:
                
                    r0 = e;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:92:0x036b, code lost:
                
                    r0 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:93:0x036c, code lost:
                
                    com.tencent.mars.xlog.Log.e("MicroMsg.MMNativeNetTaskAdapter", "onGYNetEnd cb %s", r0.getMessage());
                    r0 = com.tencent.mm.sdk.platformtools.z3.c(r0);
                    r3 = java.lang.Integer.valueOf(r3);
                    com.tencent.mars.xlog.Log.e("MicroMsg.MMNativeNetTaskAdapter", "exception:%s taskid:%d", r0, r3);
                    r3 = r3;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:95:0x01fb, code lost:
                
                    r0 = e;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:96:0x01fc, code lost:
                
                    r20 = r5;
                    r7 = r6;
                    r25 = r13;
                    r13 = r14;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:99:0x0204, code lost:
                
                    r0 = e;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:102:0x01c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:140:0x01b4 A[Catch: RemoteException -> 0x0221, IOException -> 0x0223, all -> 0x0397, TRY_ENTER, TRY_LEAVE, TryCatch #27 {all -> 0x0397, blocks: (B:23:0x007e, B:26:0x008d, B:28:0x0098, B:31:0x009c, B:34:0x00a2, B:37:0x00a6, B:39:0x00ad, B:41:0x00b3, B:44:0x00b8, B:46:0x00bc, B:50:0x0115, B:54:0x0124, B:56:0x0129, B:58:0x017c, B:60:0x0186, B:63:0x0188, B:103:0x01c8, B:68:0x01e0, B:70:0x02e0, B:97:0x02a5, B:101:0x02c3, B:130:0x0145, B:132:0x0155, B:139:0x011f, B:140:0x01b4, B:142:0x01be, B:145:0x01c0, B:148:0x01c2, B:167:0x00d4, B:170:0x00ef, B:172:0x00ec, B:216:0x0395), top: B:3:0x0024 }] */
                /* JADX WARN: Removed duplicated region for block: B:50:0x0115 A[Catch: RemoteException -> 0x0221, IOException -> 0x0223, all -> 0x0397, TryCatch #27 {all -> 0x0397, blocks: (B:23:0x007e, B:26:0x008d, B:28:0x0098, B:31:0x009c, B:34:0x00a2, B:37:0x00a6, B:39:0x00ad, B:41:0x00b3, B:44:0x00b8, B:46:0x00bc, B:50:0x0115, B:54:0x0124, B:56:0x0129, B:58:0x017c, B:60:0x0186, B:63:0x0188, B:103:0x01c8, B:68:0x01e0, B:70:0x02e0, B:97:0x02a5, B:101:0x02c3, B:130:0x0145, B:132:0x0155, B:139:0x011f, B:140:0x01b4, B:142:0x01be, B:145:0x01c0, B:148:0x01c2, B:167:0x00d4, B:170:0x00ef, B:172:0x00ec, B:216:0x0395), top: B:3:0x0024 }] */
                /* JADX WARN: Removed duplicated region for block: B:73:0x030f  */
                /* JADX WARN: Removed duplicated region for block: B:85:0x033d A[Catch: Exception -> 0x036b, TryCatch #2 {Exception -> 0x036b, blocks: (B:83:0x0329, B:85:0x033d, B:87:0x0343, B:91:0x0357), top: B:82:0x0329 }] */
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.Integer] */
                /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
                /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x036c -> B:88:0x0391). Please report as a decompilation issue!!! */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void run() {
                    /*
                        Method dump skipped, instructions count: 921
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.mars.stn.StnManagerCallback.AnonymousClass2.run():void");
                }
            });
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, exception2String(e17));
        }
        return i27;
    }

    @Override // com.tencent.mars.stn.StnManager.CallBack
    public void onTaskNotifyError(final int i17, final java.lang.Object obj, final int i18, final int i19, final com.tencent.mars.stn.StnManager.CgiProfile cgiProfile, final byte[] bArr) {
        if (com.tencent.mm.network.x2.h() == null) {
            return;
        }
        try {
            com.tencent.mm.network.x2.e().post(new java.lang.Runnable() { // from class: com.tencent.mars.stn.StnManagerCallback.3
                @Override // java.lang.Runnable
                public void run() {
                    com.tencent.mm.network.q2 h17 = com.tencent.mm.network.x2.h();
                    int i27 = i17;
                    byte[] bArr2 = bArr;
                    h17.getClass();
                    r45.is5 is5Var = new r45.is5();
                    try {
                        is5Var.parseFrom(bArr2);
                        if (is5Var.f377314g != 0) {
                            com.tencent.mm.autogen.events.GetDisasterInfoEvent getDisasterInfoEvent = new com.tencent.mm.autogen.events.GetDisasterInfoEvent();
                            am.rf rfVar = getDisasterInfoEvent.f54390g;
                            int i28 = is5Var.f377314g;
                            rfVar.f7808a = i28;
                            long j17 = is5Var.f377311d;
                            if ((j17 == 252 || j17 == 701) && is5Var.f377315h == 0) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.MMNativeNetTaskAdapter", "summerdiz publish GetDisasterInfoEvent MMFunc_ManualAuth ok [%d] jType[%d]", java.lang.Integer.valueOf(i28), java.lang.Long.valueOf(is5Var.f377311d));
                                rfVar.f7809b = true;
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.MMNativeNetTaskAdapter", "summerdiz publish GetDisasterInfoEvent noticeid[%d] publish[%b]", java.lang.Integer.valueOf(is5Var.f377314g), java.lang.Boolean.valueOf(getDisasterInfoEvent.e()));
                        }
                        if (is5Var.f377315h == -13) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.MMNativeNetTaskAdapter", "onTaskDecodeError MM_ERR_SESSIONTIMEOUT, trigger callback");
                            try {
                                com.tencent.mm.network.x2.c().U();
                                com.tencent.mm.network.x2.c().h0();
                            } catch (java.lang.Exception e17) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.MMNativeNetTaskAdapter", "onTaskNotifyError cb %s", e17.getMessage());
                                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                                com.tencent.mars.xlog.Log.e("MicroMsg.MMNativeNetTaskAdapter", "exception:%s taskid:%d", com.tencent.mm.sdk.platformtools.z3.c(e17), java.lang.Integer.valueOf(i27));
                            }
                        }
                    } catch (java.lang.Exception e18) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.MMNativeNetTaskAdapter", "onTaskNotifyError parse respBuf error %s", e18.getMessage());
                    }
                }
            });
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, exception2String(e17));
        }
    }

    @Override // com.tencent.mars.stn.StnManager.CallBack
    public void reportConnectStatus(int i17, int i18) {
        try {
            ((aq1.q0) ((a25.q) i95.n0.c(a25.q.class))).getClass();
            ((com.tencent.mm.feature.performance.r4) ((uq3.h) i95.n0.c(uq3.h.class))).getClass();
            if (com.tencent.mm.sdk.platformtools.x2.p()) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.feature.performance.o3(i18, currentTimeMillis), "MicroMsg.proc.FeatureService#disPatchMarsStatus");
            }
            com.tencent.mm.network.x2.i().d(i17);
            e11.b.f246358b.f246393d = i17;
            if (i18 == 2) {
                ((ku5.t0) ku5.t0.f312615d).k(new java.lang.Runnable() { // from class: com.tencent.mars.stn.StnManagerCallback.4
                    @Override // java.lang.Runnable
                    public void run() {
                        java.util.concurrent.atomic.AtomicInteger atomicInteger = com.tencent.mm.network.u2.f72149a;
                        ((com.tencent.mm.network.u2) com.tencent.mm.network.u2.f72150b.getValue()).a("longlink connect fail");
                    }
                }, 500L);
            }
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e(TAG, "reportConnectInfo :%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    @Override // com.tencent.mars.stn.StnManager.CallBack
    public void reportTaskProfile(java.lang.String str) {
    }

    @Override // com.tencent.mars.stn.StnManager.CallBack
    public boolean req2Buf(int i17, java.lang.Object obj, java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream, int[] iArr, int i18, java.lang.String str2, int i19) {
        if (com.tencent.mm.network.x2.h() == null) {
            com.tencent.mars.xlog.Log.e(TAG, "mars2 req2Buf NetTaskAdapter is empty.");
            return false;
        }
        int i27 = iArr[0];
        int i28 = iArr[1];
        try {
            return com.tencent.mm.network.x2.h().n(i17, obj, byteArrayOutputStream, iArr, i18, str2, i19);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, exception2String(e17));
            return false;
        }
    }

    @Override // com.tencent.mars.stn.StnManager.CallBack
    public java.lang.String[] requestNetCheckShortLinkHosts() {
        return new java.lang.String[0];
    }

    @Override // com.tencent.mars.stn.StnManager.CallBack
    public void requestSync() {
        if (com.tencent.mm.network.x2.f() == null) {
            return;
        }
        try {
            com.tencent.mm.network.x2.e().post(new java.lang.Runnable() { // from class: com.tencent.mars.stn.StnManagerCallback.5
                @Override // java.lang.Runnable
                public void run() {
                    com.tencent.mm.network.x2.f().a(24, kk.u.d(7));
                }
            });
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, exception2String(e17));
        }
    }

    public void saveSyncCheckInfo(byte[] bArr) {
        com.tencent.mm.network.x2.c().w0(bArr);
    }

    @Override // com.tencent.mars.stn.StnManager.CallBack
    public void trafficData(int i17, int i18) {
    }
}
