package com.p159x477cd522.p160x333422;

/* renamed from: com.eclipsesource.mmv8.MultiContextNodeJS */
/* loaded from: classes7.dex */
public final class C1459xa4933cc1 {

    /* renamed from: GLOBAL */
    private static final java.lang.String f4728x7d7bf7a3 = "global";

    /* renamed from: createStats */
    public com.p159x477cd522.p160x333422.C1459xa4933cc1.CreateStats f4729xe1eb7103 = null;

    /* renamed from: mainContext */
    private final com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad f4730x3f695b6;
    private final com.p159x477cd522.p160x333422.C1460x397c7778 mv8;

    /* renamed from: com.eclipsesource.mmv8.MultiContextNodeJS$CreateStats */
    /* loaded from: classes7.dex */
    public static class CreateStats {

        /* renamed from: isolateCreateDurationMills */
        public final long f4731x7907205c;

        /* renamed from: mainContextCreateDurationMills */
        public final long f4732xade10171;

        /* renamed from: nodeEnvCreateDurationMills */
        public final long f4733xf5a1497c;

        public CreateStats(long j17, long j18, long j19) {
            this.f4731x7907205c = j17;
            this.f4732xade10171 = j18;
            this.f4733xf5a1497c = j19;
        }
    }

    private C1459xa4933cc1(com.p159x477cd522.p160x333422.C1460x397c7778 c1460x397c7778, com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad interfaceC1471x242ee8ad) {
        this.mv8 = c1460x397c7778;
        this.f4730x3f695b6 = interfaceC1471x242ee8ad;
    }

    /* renamed from: createMultiContextNodeJS */
    public static com.p159x477cd522.p160x333422.C1459xa4933cc1 m15842x158916bd(int i17) {
        return m15845x158916bd(i17, null, null, false);
    }

    /* renamed from: closeUVLoop */
    public void m15848xc0190dd() {
        this.mv8.m15874x5db1c78().m16141xc0190dd();
    }

    /* renamed from: debugDestroy */
    public void m15849x92a86e27() {
        this.mv8.m15869x92a86e27();
    }

    /* renamed from: debuggerMessageLoop */
    public void m15850x9a7a646a() {
        this.mv8.m15870x9a7a646a();
    }

    /* renamed from: getMainContext */
    public com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad m15851xddccdc80() {
        return this.f4730x3f695b6;
    }

    /* renamed from: getRuntime */
    public com.p159x477cd522.p160x333422.C1460x397c7778 m15852x9a3f0ba2() {
        return this.mv8;
    }

    /* renamed from: handleMessage */
    public boolean m15853x5b586cbf(boolean z17) {
        this.mv8.m15874x5db1c78().m16140x2edbf932();
        return this.mv8.m15874x5db1c78().m16247xa53947c3(z17);
    }

    /* renamed from: isRunning */
    public boolean m15854x39e05d35() {
        this.mv8.m15874x5db1c78().m16140x2edbf932();
        return this.mv8.m15874x5db1c78().m16235x39e05d35();
    }

    /* renamed from: nativeDispatch */
    public void m15855x28ebf1b1() {
        this.mv8.m15874x5db1c78().m16241x28ebf1b1();
    }

    /* renamed from: nativeMessageLoop */
    public void m15856xa57d12b4() {
        this.mv8.m15874x5db1c78().m16140x2edbf932();
        this.mv8.m15874x5db1c78().m16243xa57d12b4();
    }

    /* renamed from: release */
    public void m15857x41012807() {
        this.mv8.m15874x5db1c78().m16140x2edbf932();
        if (!this.f4730x3f695b6.m16393xafdb8087()) {
            this.f4730x3f695b6.m16407x41012807();
        }
        this.mv8.m15878x41012807();
    }

    /* renamed from: waitForDebugger */
    public void m15858x77a01755(java.lang.String str, boolean z17) {
        this.mv8.m15881x77a01755(str, z17);
    }

    /* renamed from: wakeUpUVLoop */
    public void m15859xd0578d04() {
        this.mv8.m15874x5db1c78().m16281xd0578d04();
    }

    /* renamed from: createMultiContextNodeJS */
    public static com.p159x477cd522.p160x333422.C1459xa4933cc1 m15847x158916bd(int i17, boolean z17) {
        return m15846x158916bd(i17, null, null, false, z17);
    }

    /* renamed from: createMultiContextNodeJS */
    public static com.p159x477cd522.p160x333422.C1459xa4933cc1 m15845x158916bd(int i17, java.lang.String str, byte[] bArr, boolean z17) {
        return m15843x158916bd(i17, com.p159x477cd522.p160x333422.p163x10fad5c4.AbstractC1516x4fd55f3d.Success.f5027x1f5f799a, str, bArr, null, false, z17, 2);
    }

    /* renamed from: createMultiContextNodeJS */
    public static com.p159x477cd522.p160x333422.C1459xa4933cc1 m15846x158916bd(int i17, java.lang.String str, byte[] bArr, boolean z17, boolean z18) {
        return m15844x158916bd(i17, com.p159x477cd522.p160x333422.p163x10fad5c4.AbstractC1516x4fd55f3d.Success.f5027x1f5f799a, str, bArr, null, false, z17, 2, z18);
    }

    /* renamed from: createMultiContextNodeJS */
    public static com.p159x477cd522.p160x333422.C1459xa4933cc1 m15843x158916bd(int i17, int i18, java.lang.String str, byte[] bArr, java.lang.String str2, boolean z17, boolean z18, int i19) {
        return m15844x158916bd(i17, i18, str, bArr, str2, z17, z18, i19, false);
    }

    /* renamed from: createMultiContextNodeJS */
    public static com.p159x477cd522.p160x333422.C1459xa4933cc1 m15844x158916bd(int i17, int i18, java.lang.String str, byte[] bArr, java.lang.String str2, boolean z17, boolean z18, int i19, boolean z19) {
        com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad m15865xbe9e5913;
        if (z19 && com.p159x477cd522.p160x333422.p163x10fad5c4.AbstractC1516x4fd55f3d.Success.f5027x1f5f799a != i18) {
            throw new java.lang.IllegalStateException("skipNode=true but snapshot path requested, mainContextSnapshotIndex=" + i18);
        }
        com.p159x477cd522.p160x333422.C1460x397c7778 m15863x2a86af74 = com.p159x477cd522.p160x333422.C1460x397c7778.m15863x2a86af74(f4728x7d7bf7a3, str, bArr, str2, z17, i19);
        long j17 = m15863x2a86af74.m15874x5db1c78().f4778x7907205c;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (com.p159x477cd522.p160x333422.p163x10fad5c4.AbstractC1516x4fd55f3d.Success.f5027x1f5f799a != i18) {
            if (z17 && com.p159x477cd522.p160x333422.p163x10fad5c4.AbstractC1516x4fd55f3d.Success.f5028x572d1359 != i18) {
                m15863x2a86af74.m15878x41012807();
                throw new com.p159x477cd522.p160x333422.C1479xdecf3e19("Node is snapshot but main context snapshot index is not 0");
            }
            if (z17) {
                m15865xbe9e5913 = m15863x2a86af74.m15868xba312166(i17);
            } else {
                m15865xbe9e5913 = m15863x2a86af74.m15866x8cd5b041(i17, i18);
            }
            if (m15865xbe9e5913 == null) {
                m15863x2a86af74.m15878x41012807();
                throw new com.p159x477cd522.p160x333422.C1479xdecf3e19("Create mainContext from snapshot fail");
            }
        } else {
            m15865xbe9e5913 = m15863x2a86af74.m15865xbe9e5913(i17);
        }
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
        com.p159x477cd522.p160x333422.C1459xa4933cc1 c1459xa4933cc1 = new com.p159x477cd522.p160x333422.C1459xa4933cc1(m15863x2a86af74, m15865xbe9e5913);
        if (z18) {
            m15863x2a86af74.m15874x5db1c78().m16155xb6472b4e();
        }
        long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
        try {
            com.p159x477cd522.p160x333422.C1486x1128de25.m16455x45433dfc("CreateNode");
            if (!m15863x2a86af74.m15875x77fd01b0().m16433x2986eee5()) {
                m15863x2a86af74.m15875x77fd01b0().m16430xba9b60d6();
            }
            m15863x2a86af74.m15874x5db1c78().m16145xb97824da(z19);
            m15863x2a86af74.m15875x77fd01b0().m16434x41012807();
            com.p159x477cd522.p160x333422.C1486x1128de25.m16456x82fef18a();
            c1459xa4933cc1.f4729xe1eb7103 = new com.p159x477cd522.p160x333422.C1459xa4933cc1.CreateStats(j17, elapsedRealtime2, android.os.SystemClock.elapsedRealtime() - elapsedRealtime3);
            return c1459xa4933cc1;
        } catch (java.lang.Throwable th6) {
            m15863x2a86af74.m15875x77fd01b0().m16434x41012807();
            com.p159x477cd522.p160x333422.C1486x1128de25.m16456x82fef18a();
            throw th6;
        }
    }
}
