package com.p159x477cd522.p160x333422;

/* renamed from: com.eclipsesource.mmv8.MultiContextV8 */
/* loaded from: classes7.dex */
public final class C1460x397c7778 {

    /* renamed from: contextSessionMgr */
    private final com.p159x477cd522.p160x333422.C1472xfd192c2f f4734xfb2e9eb1;

    /* renamed from: v8, reason: collision with root package name */
    private final com.p159x477cd522.p160x333422.V8 f125526v8;

    private C1460x397c7778() {
        this(null);
    }

    /* renamed from: createMultiContextV8 */
    public static com.p159x477cd522.p160x333422.C1460x397c7778 m15860x2a86af74() {
        return new com.p159x477cd522.p160x333422.C1460x397c7778();
    }

    /* renamed from: createContext */
    public com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad m15865xbe9e5913(int i17) {
        try {
            com.p159x477cd522.p160x333422.C1486x1128de25.m16455x45433dfc("CreateContext");
            long m16149x5568a331 = this.f125526v8.m16149x5568a331(i17);
            com.p159x477cd522.p160x333422.C1486x1128de25.m16456x82fef18a();
            return new com.p159x477cd522.p160x333422.C1473x72398726(this, m16149x5568a331).m16415x38b735af();
        } catch (java.lang.Throwable th6) {
            com.p159x477cd522.p160x333422.C1486x1128de25.m16456x82fef18a();
            throw th6;
        }
    }

    /* renamed from: createContextFromSnapshot */
    public com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad m15866x8cd5b041(int i17, int i18) {
        try {
            com.p159x477cd522.p160x333422.C1486x1128de25.m16455x45433dfc("CreateContextFromSnapshot");
            long m16150x17dbbd5f = this.f125526v8.m16150x17dbbd5f(i17, i18);
            com.p159x477cd522.p160x333422.C1486x1128de25.m16456x82fef18a();
            if (0 == m16150x17dbbd5f) {
                return null;
            }
            return new com.p159x477cd522.p160x333422.C1473x72398726(this, m16150x17dbbd5f).m16415x38b735af();
        } catch (java.lang.Throwable th6) {
            com.p159x477cd522.p160x333422.C1486x1128de25.m16456x82fef18a();
            throw th6;
        }
    }

    /* renamed from: createMemoryManager */
    public com.p159x477cd522.p160x333422.p164x6a710b1.C1521xcca0a74c m15867xfdb17fd0() {
        return new com.p159x477cd522.p160x333422.p164x6a710b1.C1521xcca0a74c(this.f125526v8);
    }

    /* renamed from: createNodeMainContextFromSnapshot */
    public com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad m15868xba312166(int i17) {
        try {
            com.p159x477cd522.p160x333422.C1486x1128de25.m16455x45433dfc("CreateNodeMainContextFromSnapshot");
            long m16151xb8df3084 = this.f125526v8.m16151xb8df3084(i17);
            com.p159x477cd522.p160x333422.C1486x1128de25.m16456x82fef18a();
            if (0 == m16151xb8df3084) {
                return null;
            }
            return new com.p159x477cd522.p160x333422.C1473x72398726(this, m16151xb8df3084).m16415x38b735af();
        } catch (java.lang.Throwable th6) {
            com.p159x477cd522.p160x333422.C1486x1128de25.m16456x82fef18a();
            throw th6;
        }
    }

    /* renamed from: debugDestroy */
    public void m15869x92a86e27() {
        this.f125526v8.m16152x92a86e27();
    }

    /* renamed from: debuggerMessageLoop */
    public void m15870x9a7a646a() {
        this.f125526v8.m16153x9a7a646a();
    }

    /* renamed from: enterContext */
    public void m15871x11d7e3b7(com.p159x477cd522.p160x333422.C1473x72398726 c1473x72398726) {
        this.f4734xfb2e9eb1.m16411x11d7e3b7(c1473x72398726);
    }

    /* renamed from: getIsolatePtr */
    public long m15872xc2f94e39() {
        return this.f125526v8.m16206xc2f94e39();
    }

    /* renamed from: getUVLoopPtr */
    public long m15873x206d1933() {
        return this.f125526v8.m16217x206d1933();
    }

    /* renamed from: getV8 */
    public com.p159x477cd522.p160x333422.V8 m15874x5db1c78() {
        return this.f125526v8;
    }

    /* renamed from: getV8Locker */
    public com.p159x477cd522.p160x333422.C1476xfffd285a m15875x77fd01b0() {
        return this.f125526v8.m16208x23ad560e();
    }

    /* renamed from: markSnapshotNotNeed */
    public void m15876x8b9b2118() {
        this.f125526v8.m16239x8b9b2118();
    }

    /* renamed from: memoryPressureNotification */
    public void m15877x48741a71(int i17) {
        this.f125526v8.m16240x48741a71(i17);
    }

    /* renamed from: release */
    public void m15878x41012807() {
        this.f125526v8.mo15825x41012807();
    }

    /* renamed from: releaseContext */
    public void m15879x6df9dfa8(com.p159x477cd522.p160x333422.C1473x72398726 c1473x72398726) {
        this.f4734xfb2e9eb1.m16412x6df9dfa8(c1473x72398726);
    }

    /* renamed from: setMinimalCodeLength */
    public void m15880xc7e91772(int i17) {
        this.f125526v8.m16269xc7e91772(i17);
    }

    /* renamed from: waitForDebugger */
    public void m15881x77a01755(java.lang.String str, boolean z17) {
        this.f125526v8.m16279x77a01755(str, z17);
    }

    /* renamed from: waitForDebuggerWithContexts */
    public void m15882x7d01837f(java.lang.String str, long[] jArr, java.lang.String[] strArr) {
        this.f125526v8.m16280x7d01837f(str, jArr, strArr);
    }

    private C1460x397c7778(java.lang.String str) {
        this(str, null, null, 2);
    }

    /* renamed from: createMultiContextV8 */
    public static com.p159x477cd522.p160x333422.C1460x397c7778 m15861x2a86af74(java.lang.String str) {
        return new com.p159x477cd522.p160x333422.C1460x397c7778(str);
    }

    private C1460x397c7778(java.lang.String str, java.lang.String str2, byte[] bArr, int i17) {
        this(str, str2, bArr, null, false, i17);
    }

    /* renamed from: createMultiContextV8 */
    public static com.p159x477cd522.p160x333422.C1460x397c7778 m15864x2a86af74(java.lang.String str, byte[] bArr, int i17) {
        return new com.p159x477cd522.p160x333422.C1460x397c7778(null, str, bArr, i17);
    }

    private C1460x397c7778(java.lang.String str, java.lang.String str2, byte[] bArr, java.lang.String str3, boolean z17, int i17) {
        this.f125526v8 = com.p159x477cd522.p160x333422.V8.m16061x79233d5a(str, null, false, str2, bArr, str3, z17, i17);
        this.f4734xfb2e9eb1 = new com.p159x477cd522.p160x333422.C1472xfd192c2f(m15874x5db1c78());
    }

    /* renamed from: createMultiContextV8 */
    public static com.p159x477cd522.p160x333422.C1460x397c7778 m15862x2a86af74(java.lang.String str, java.lang.String str2, byte[] bArr, int i17) {
        return new com.p159x477cd522.p160x333422.C1460x397c7778(str, str2, bArr, i17);
    }

    /* renamed from: createMultiContextV8 */
    public static com.p159x477cd522.p160x333422.C1460x397c7778 m15863x2a86af74(java.lang.String str, java.lang.String str2, byte[] bArr, java.lang.String str3, boolean z17, int i17) {
        return new com.p159x477cd522.p160x333422.C1460x397c7778(str, str2, bArr, str3, z17, i17);
    }
}
