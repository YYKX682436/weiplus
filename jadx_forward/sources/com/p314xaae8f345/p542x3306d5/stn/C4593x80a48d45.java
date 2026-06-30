package com.p314xaae8f345.p542x3306d5.stn;

/* renamed from: com.tencent.mars.stn.StnManagerCallback */
/* loaded from: classes12.dex */
public class C4593x80a48d45 implements com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.CallBack {

    /* renamed from: NEWSYNCCHECK3_CMDID_REQ */
    private static int f19659x87d8ac1b = 800;

    /* renamed from: NEWSYNCCHECK3_CMDID_RESP */
    private static int f19660x733cd7d3 = 1000000800;

    /* renamed from: NEWSYNCCHECK_CMDID_REQ */
    private static int f19661xf40284e2 = 205;

    /* renamed from: NEWSYNCCHECK_CMDID_RESP */
    private static int f19662x8c4e17ec = 1000000205;
    private static final java.lang.String TAG = "StnManagerCallback";

    /* renamed from: wLock */
    private static com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9 f19663x6b12642;

    /* renamed from: cacheKeyBuf */
    private byte[] f19664x12ce49b6;

    /* renamed from: cacheMd5Buf */
    private byte[] f19665x160afa37;

    /* renamed from: mWakelockTimeMs */
    private final long f19666x9034a0cf = com.p314xaae8f345.mm.p971x6de15a2e.g1.M();

    /* renamed from: exception2String */
    private java.lang.String m40482x6cf4e7b4(java.lang.Exception exc) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        exc.printStackTrace(new java.io.PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Override // com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.CallBack
    /* renamed from: buf2Resp */
    public int mo698xa261f88f(int i17, java.lang.Object obj, java.lang.String str, byte[] bArr, int[] iArr, int[] iArr2, int i18, int[] iArr3) {
        if (com.p314xaae8f345.mm.p971x6de15a2e.x2.h() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "mars2 buf2Resp NetTaskAdapter is empty.");
            return -1;
        }
        int i19 = iArr[0];
        int i27 = iArr3[0];
        try {
            return com.p314xaae8f345.mm.p971x6de15a2e.x2.h().a(i17, obj, bArr, iArr, iArr2, i18, iArr3);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, m40482x6cf4e7b4(e17));
            return -1;
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.CallBack
    /* renamed from: getLongLinkIdentifyCheckBuffer */
    public int mo699xca682310(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream, java.io.ByteArrayOutputStream byteArrayOutputStream2, int[] iArr) {
        if (o45.ji.a()) {
            iArr[0] = f19659x87d8ac1b;
            iArr[1] = f19660x733cd7d3;
        } else {
            iArr[0] = f19661xf40284e2;
            iArr[1] = f19662x8c4e17ec;
        }
        return (m40483x870d79c5(byteArrayOutputStream, byteArrayOutputStream2) == 0 || byteArrayOutputStream.size() == 0 || byteArrayOutputStream2.size() == 0) ? com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.f19568x21694def : com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.f19569x95b9143a;
    }

    /* renamed from: getSyncCheckInfo */
    public int m40483x870d79c5(java.io.ByteArrayOutputStream byteArrayOutputStream, java.io.ByteArrayOutputStream byteArrayOutputStream2) {
        if (com.p314xaae8f345.mm.p971x6de15a2e.x2.c() == null) {
            return 0;
        }
        try {
            byte[] S = com.p314xaae8f345.mm.p971x6de15a2e.x2.c().S();
            if (S != null) {
                byteArrayOutputStream.write(S);
                this.f19664x12ce49b6 = S;
            }
            byte[] bArr = com.p314xaae8f345.mm.p971x6de15a2e.x2.c().f153536x;
            if (bArr != null) {
                byteArrayOutputStream2.write(bArr);
                this.f19665x160afa37 = bArr;
            }
            return com.p314xaae8f345.mm.p971x6de15a2e.x2.c().f153526n.f153435o;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, m40482x6cf4e7b4(e17));
            byte[] bArr2 = this.f19664x12ce49b6;
            if (bArr2 != null && this.f19665x160afa37 != null) {
                try {
                    byteArrayOutputStream.write(bArr2);
                    byteArrayOutputStream2.write(this.f19665x160afa37);
                } catch (java.io.IOException unused) {
                }
            }
            return 0;
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.CallBack
    /* renamed from: makesureAuthed */
    public boolean mo700x9780e92a(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.p971x6de15a2e.x2.c() == null) {
            return false;
        }
        try {
            return com.p314xaae8f345.mm.p971x6de15a2e.x2.c().V(str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, m40482x6cf4e7b4(e17));
            return false;
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.CallBack
    /* renamed from: networkAnalysisCallBack */
    public void mo701x252d11af(int i17, int i18, boolean z17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "networkAnalysisCallBack: status:%d, stage:%d, isDetectEnd:%b, kvInfo:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z17), str);
        try {
            com.p314xaae8f345.mm.p971x6de15a2e.x2.c().f153537y.mo48346x252d11af(i17, i18, z17, str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.CallBack
    /* renamed from: onLongLinkIdentifyResponse */
    public boolean mo702xae260522(java.lang.String str, byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Integer.valueOf(bArr == null ? 0 : bArr.length);
            objArr[1] = java.lang.Integer.valueOf(bArr2 != null ? bArr2.length : 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "synccheck3 buffer:%d hashCodeBuffer:%d.", objArr);
        } else {
            boolean a17 = o45.ji.a();
            int i17 = a17 ? f19660x733cd7d3 : f19662x8c4e17ec;
            if (a17) {
                mo706xc39e2999(str, i17, 0, bArr, new byte[0]);
                m40484x35843efe(bArr);
            } else {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                try {
                    byteArrayOutputStream.write(bArr);
                    byteArrayOutputStream.write(bArr2);
                } catch (java.io.IOException unused) {
                }
                mo706xc39e2999(str, i17, 0, byteArrayOutputStream.toByteArray(), new byte[0]);
                m40484x35843efe(byteArrayOutputStream.toByteArray());
            }
        }
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
    public void mo706xc39e2999(java.lang.String str, final int i17, int i18, final byte[] bArr, byte[] bArr2) {
        if (com.p314xaae8f345.mm.p971x6de15a2e.x2.f() == null) {
            return;
        }
        try {
            if (f19663x6b12642 == null) {
                f19663x6b12642 = new com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9(com.p314xaae8f345.mm.p971x6de15a2e.x2.d(), TAG);
            }
            f19663x6b12642.m40015x32c52b(this.f19666x9034a0cf, "StnLogic.onNotify");
            com.p314xaae8f345.mm.p971x6de15a2e.x2.e().mo50293x3498a0(new java.lang.Runnable() { // from class: com.tencent.mars.stn.StnManagerCallback.1
                @Override // java.lang.Runnable
                public void run() {
                    com.p314xaae8f345.mm.p971x6de15a2e.x2.f().a(i17, bArr);
                }
            });
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, m40482x6cf4e7b4(e17));
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.CallBack
    /* renamed from: onShortLinkNetworkError */
    public void mo707x2add591(com.p314xaae8f345.p542x3306d5.stn.EnumC4591xb875d68f enumC4591xb875d68f, int i17, java.lang.String str, java.lang.String str2, int i18) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.CallBack
    /* renamed from: onTaskEnd */
    public int mo708xf4053237(final int i17, final java.lang.Object obj, final int i18, final int i19, final com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.CgiProfile cgiProfile, final byte[] bArr) {
        int i27 = 0;
        if (com.p314xaae8f345.mm.p971x6de15a2e.x2.h() == null) {
            return 0;
        }
        long j17 = cgiProfile.f19604x1dff6d15;
        try {
            i27 = com.p314xaae8f345.mm.p971x6de15a2e.x2.h().g(i17);
            com.p314xaae8f345.mm.p971x6de15a2e.x2.e().mo50293x3498a0(new java.lang.Runnable() { // from class: com.tencent.mars.stn.StnManagerCallback.2
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
                
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMNativeNetTaskAdapter", "onGYNetEnd cb %s", r0.getMessage());
                    r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(r0);
                    r3 = java.lang.Integer.valueOf(r3);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMNativeNetTaskAdapter", "exception:%s taskid:%d", r0, r3);
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
                    throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p542x3306d5.stn.C4593x80a48d45.AnonymousClass2.run():void");
                }
            });
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, m40482x6cf4e7b4(e17));
        }
        return i27;
    }

    @Override // com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.CallBack
    /* renamed from: onTaskNotifyError */
    public void mo709x4d94fd9b(final int i17, final java.lang.Object obj, final int i18, final int i19, final com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.CgiProfile cgiProfile, final byte[] bArr) {
        if (com.p314xaae8f345.mm.p971x6de15a2e.x2.h() == null) {
            return;
        }
        try {
            com.p314xaae8f345.mm.p971x6de15a2e.x2.e().mo50293x3498a0(new java.lang.Runnable() { // from class: com.tencent.mars.stn.StnManagerCallback.3
                @Override // java.lang.Runnable
                public void run() {
                    com.p314xaae8f345.mm.p971x6de15a2e.q2 h17 = com.p314xaae8f345.mm.p971x6de15a2e.x2.h();
                    int i27 = i17;
                    byte[] bArr2 = bArr;
                    h17.getClass();
                    r45.is5 is5Var = new r45.is5();
                    try {
                        is5Var.mo11468x92b714fd(bArr2);
                        if (is5Var.f458847g != 0) {
                            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5598x407a5015 c5598x407a5015 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5598x407a5015();
                            am.rf rfVar = c5598x407a5015.f135923g;
                            int i28 = is5Var.f458847g;
                            rfVar.f89341a = i28;
                            long j17 = is5Var.f458844d;
                            if ((j17 == 252 || j17 == 701) && is5Var.f458848h == 0) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNativeNetTaskAdapter", "summerdiz publish GetDisasterInfoEvent MMFunc_ManualAuth ok [%d] jType[%d]", java.lang.Integer.valueOf(i28), java.lang.Long.valueOf(is5Var.f458844d));
                                rfVar.f89342b = true;
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNativeNetTaskAdapter", "summerdiz publish GetDisasterInfoEvent noticeid[%d] publish[%b]", java.lang.Integer.valueOf(is5Var.f458847g), java.lang.Boolean.valueOf(c5598x407a5015.e()));
                        }
                        if (is5Var.f458848h == -13) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNativeNetTaskAdapter", "onTaskDecodeError MM_ERR_SESSIONTIMEOUT, trigger callback");
                            try {
                                com.p314xaae8f345.mm.p971x6de15a2e.x2.c().U();
                                com.p314xaae8f345.mm.p971x6de15a2e.x2.c().h0();
                            } catch (java.lang.Exception e17) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMNativeNetTaskAdapter", "onTaskNotifyError cb %s", e17.getMessage());
                                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMNativeNetTaskAdapter", "exception:%s taskid:%d", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17), java.lang.Integer.valueOf(i27));
                            }
                        }
                    } catch (java.lang.Exception e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMNativeNetTaskAdapter", "onTaskNotifyError parse respBuf error %s", e18.getMessage());
                    }
                }
            });
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, m40482x6cf4e7b4(e17));
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.CallBack
    /* renamed from: reportConnectStatus */
    public void mo710x83f14ca8(int i17, int i18) {
        try {
            ((aq1.q0) ((a25.q) i95.n0.c(a25.q.class))).getClass();
            ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.r4) ((uq3.h) i95.n0.c(uq3.h.class))).getClass();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.p()) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.o3(i18, currentTimeMillis), "MicroMsg.proc.FeatureService#disPatchMarsStatus");
            }
            com.p314xaae8f345.mm.p971x6de15a2e.x2.i().d(i17);
            e11.b.f327891b.f327926d = i17;
            if (i18 == 2) {
                ((ku5.t0) ku5.t0.f394148d).k(new java.lang.Runnable() { // from class: com.tencent.mars.stn.StnManagerCallback.4
                    @Override // java.lang.Runnable
                    public void run() {
                        java.util.concurrent.atomic.AtomicInteger atomicInteger = com.p314xaae8f345.mm.p971x6de15a2e.u2.f153682a;
                        ((com.p314xaae8f345.mm.p971x6de15a2e.u2) com.p314xaae8f345.mm.p971x6de15a2e.u2.f153683b.mo141623x754a37bb()).a("longlink connect fail");
                    }
                }, 500L);
            }
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "reportConnectInfo :%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.CallBack
    /* renamed from: reportTaskProfile */
    public void mo711x9db36690(java.lang.String str) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.CallBack
    /* renamed from: req2Buf */
    public boolean mo712x412ffa7f(int i17, java.lang.Object obj, java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream, int[] iArr, int i18, java.lang.String str2, int i19) {
        if (com.p314xaae8f345.mm.p971x6de15a2e.x2.h() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "mars2 req2Buf NetTaskAdapter is empty.");
            return false;
        }
        int i27 = iArr[0];
        int i28 = iArr[1];
        try {
            return com.p314xaae8f345.mm.p971x6de15a2e.x2.h().n(i17, obj, byteArrayOutputStream, iArr, i18, str2, i19);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, m40482x6cf4e7b4(e17));
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
        if (com.p314xaae8f345.mm.p971x6de15a2e.x2.f() == null) {
            return;
        }
        try {
            com.p314xaae8f345.mm.p971x6de15a2e.x2.e().mo50293x3498a0(new java.lang.Runnable() { // from class: com.tencent.mars.stn.StnManagerCallback.5
                @Override // java.lang.Runnable
                public void run() {
                    com.p314xaae8f345.mm.p971x6de15a2e.x2.f().a(24, kk.u.d(7));
                }
            });
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, m40482x6cf4e7b4(e17));
        }
    }

    /* renamed from: saveSyncCheckInfo */
    public void m40484x35843efe(byte[] bArr) {
        com.p314xaae8f345.mm.p971x6de15a2e.x2.c().w0(bArr);
    }

    @Override // com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.CallBack
    /* renamed from: trafficData */
    public void mo715x9e773f47(int i17, int i18) {
    }
}
