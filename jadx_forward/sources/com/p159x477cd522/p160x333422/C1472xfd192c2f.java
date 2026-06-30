package com.p159x477cd522.p160x333422;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.eclipsesource.mmv8.V8ContextSessionMgr */
/* loaded from: classes7.dex */
public final class C1472xfd192c2f {

    /* renamed from: currentContext */
    private com.p159x477cd522.p160x333422.C1473x72398726 f4795xd9f3a5f6;

    /* renamed from: v8, reason: collision with root package name */
    private final com.p159x477cd522.p160x333422.V8 f125527v8;

    public C1472xfd192c2f(com.p159x477cd522.p160x333422.V8 v86) {
        this.f125527v8 = v86;
    }

    /* renamed from: enterContext */
    public void m16411x11d7e3b7(com.p159x477cd522.p160x333422.C1473x72398726 c1473x72398726) {
        if (c1473x72398726 == null || c1473x72398726.m16416xb2c87fbf(this.f4795xd9f3a5f6)) {
            return;
        }
        this.f125527v8.m16275xa25c0bf9(c1473x72398726.m16417xb58863b8());
        this.f4795xd9f3a5f6 = c1473x72398726;
    }

    /* renamed from: releaseContext */
    public void m16412x6df9dfa8(com.p159x477cd522.p160x333422.C1473x72398726 c1473x72398726) {
        if (c1473x72398726 == null) {
            return;
        }
        this.f125527v8.m16260x9bfcd886(c1473x72398726.m16417xb58863b8());
    }
}
