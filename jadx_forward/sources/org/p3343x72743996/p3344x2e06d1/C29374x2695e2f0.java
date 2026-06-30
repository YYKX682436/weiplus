package org.p3343x72743996.p3344x2e06d1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.chromium.base.TraceEventJni */
/* loaded from: classes16.dex */
public class C29374x2695e2f0 implements org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.Natives {

    /* renamed from: TEST_HOOKS */
    public static final c56.a f73477xce5021a3 = new c56.a() { // from class: org.chromium.base.TraceEventJni.1
        /* renamed from: setInstanceForTesting, reason: merged with bridge method [inline-methods] */
        public void m152744x2f08577e(org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.Natives natives) {
            if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
                org.p3343x72743996.p3344x2e06d1.C29374x2695e2f0.f73478x4baa8b47 = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };

    /* renamed from: testInstance */
    private static org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.Natives f73478x4baa8b47;

    public static org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.Natives get() {
        if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
            org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.Natives natives = f73478x4baa8b47;
            if (natives != null) {
                return natives;
            }
            if (org.p3362x76ca9b02.C29682x261049f6.f75007x2a92e044) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of TraceEvent.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.p3343x72743996.p3344x2e06d1.C29374x2695e2f0();
    }

    @Override // org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.Natives
    /* renamed from: addViewDump */
    public void mo152721xd2db9fa(int i17, int i18, boolean z17, boolean z18, java.lang.String str, java.lang.String str2, long j17) {
        org.p3362x76ca9b02.C29682x261049f6.m154517xdddba3b0(i17, i18, z17, z18, str, str2, j17);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.Natives
    /* renamed from: begin */
    public void mo152722x59478a9(java.lang.String str, java.lang.String str2) {
        org.p3362x76ca9b02.C29682x261049f6.m154518xc28962df(str, str2);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.Natives
    /* renamed from: beginToplevel */
    public void mo152723xf1c08b18(java.lang.String str) {
        org.p3362x76ca9b02.C29682x261049f6.m154519x4e9adf4e(str);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.Natives
    /* renamed from: beginWithIntArg */
    public void mo152724x82c575d6(java.lang.String str, int i17) {
        org.p3362x76ca9b02.C29682x261049f6.m154520x125b948c(str, i17);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.Natives
    public void end(java.lang.String str, java.lang.String str2, long j17) {
        org.p3362x76ca9b02.C29682x261049f6.m154521x82778891(str, str2, j17);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.Natives
    /* renamed from: endToplevel */
    public void mo152725x6b7b494a(java.lang.String str) {
        org.p3362x76ca9b02.C29682x261049f6.m154522x3c293300(str);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.Natives
    /* renamed from: finishAsync */
    public void mo152726x4eb069a9(java.lang.String str, long j17) {
        org.p3362x76ca9b02.C29682x261049f6.m154523x1f5e535f(str, j17);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.Natives
    /* renamed from: initViewHierarchyDump */
    public void mo152727x8ff5e3f4(long j17, java.lang.Object obj) {
        org.p3362x76ca9b02.C29682x261049f6.m154524x2daba22a(j17, obj);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.Natives
    /* renamed from: instant */
    public void mo152728x74ae25e1(java.lang.String str, java.lang.String str2) {
        org.p3362x76ca9b02.C29682x261049f6.m154525xc8115a97(str, str2);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.Natives
    /* renamed from: instantAndroidIPC */
    public void mo152729x7fee77ee(java.lang.String str, long j17) {
        org.p3362x76ca9b02.C29682x261049f6.m154526x8277c124(str, j17);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.Natives
    /* renamed from: instantAndroidToolbar */
    public void mo152730xf05e364d(int i17, int i18, int i19) {
        org.p3362x76ca9b02.C29682x261049f6.m154527x8e13f483(i17, i18, i19);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.Natives
    /* renamed from: registerEnabledObserver */
    public void mo152731xb74b8014() {
        org.p3362x76ca9b02.C29682x261049f6.m154528xbe8a88ca();
    }

    @Override // org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.Natives
    /* renamed from: startActivityDump */
    public long mo152732x91871725(java.lang.String str, long j17) {
        return org.p3362x76ca9b02.C29682x261049f6.m154529x9410605b(str, j17);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.Natives
    /* renamed from: startAsync */
    public void mo152733xa094bb3a(java.lang.String str, long j17) {
        org.p3362x76ca9b02.C29682x261049f6.m154530x8647c2c4(str, j17);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.Natives
    /* renamed from: viewHierarchyDumpEnabled */
    public boolean mo152734xa4b64b7d() {
        return org.p3362x76ca9b02.C29682x261049f6.m154531x85585987();
    }

    @Override // org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.Natives
    /* renamed from: webViewStartupStage1 */
    public void mo152735x86086a37(long j17, long j18) {
        org.p3362x76ca9b02.C29682x261049f6.m154532xac270d41(j17, j18);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.Natives
    /* renamed from: webViewStartupStage2 */
    public void mo152736x86086a38(long j17, long j18, boolean z17) {
        org.p3362x76ca9b02.C29682x261049f6.m154533xac270d42(j17, j18, z17);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.Natives
    /* renamed from: webViewStartupTotalFactoryInit */
    public void mo152737xb5f4579a(long j17, long j18) {
        org.p3362x76ca9b02.C29682x261049f6.m154534xbd523624(j17, j18);
    }
}
