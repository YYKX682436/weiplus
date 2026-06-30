package org.p3343x72743996.p3344x2e06d1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.chromium.base.FieldTrialListJni */
/* loaded from: classes16.dex */
public class C29304xf0d6582b implements org.p3343x72743996.p3344x2e06d1.C29303x23697d1a.Natives {

    /* renamed from: TEST_HOOKS */
    public static final c56.a f73285xce5021a3 = new c56.a() { // from class: org.chromium.base.FieldTrialListJni.1
        /* renamed from: setInstanceForTesting, reason: merged with bridge method [inline-methods] */
        public void m152411x2f08577e(org.p3343x72743996.p3344x2e06d1.C29303x23697d1a.Natives natives) {
            if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
                org.p3343x72743996.p3344x2e06d1.C29304xf0d6582b.f73286x4baa8b47 = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };

    /* renamed from: testInstance */
    private static org.p3343x72743996.p3344x2e06d1.C29303x23697d1a.Natives f73286x4baa8b47;

    public static org.p3343x72743996.p3344x2e06d1.C29303x23697d1a.Natives get() {
        if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
            org.p3343x72743996.p3344x2e06d1.C29303x23697d1a.Natives natives = f73286x4baa8b47;
            if (natives != null) {
                return natives;
            }
            if (org.p3362x76ca9b02.C29682x261049f6.f75007x2a92e044) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of FieldTrialList.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.p3343x72743996.p3344x2e06d1.C29304xf0d6582b();
    }

    @Override // org.p3343x72743996.p3344x2e06d1.C29303x23697d1a.Natives
    /* renamed from: createFieldTrial */
    public boolean mo152405x8e957c58(java.lang.String str, java.lang.String str2) {
        return org.p3362x76ca9b02.C29682x261049f6.m154501xe631a65d(str, str2);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.C29303x23697d1a.Natives
    /* renamed from: findFullName */
    public java.lang.String mo152406x580cc293(java.lang.String str) {
        return org.p3362x76ca9b02.C29682x261049f6.m154502xa370b718(str);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.C29303x23697d1a.Natives
    /* renamed from: getVariationParameter */
    public java.lang.String mo152407xcfd938cc(java.lang.String str, java.lang.String str2) {
        return org.p3362x76ca9b02.C29682x261049f6.m154503x8dcf89e7(str, str2);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.C29303x23697d1a.Natives
    /* renamed from: logActiveTrials */
    public void mo152408x2ec69427() {
        org.p3362x76ca9b02.C29682x261049f6.m154504x73aa9582();
    }

    @Override // org.p3343x72743996.p3344x2e06d1.C29303x23697d1a.Natives
    /* renamed from: trialExists */
    public boolean mo152409x3a64c712(java.lang.String str) {
        return org.p3362x76ca9b02.C29682x261049f6.m154505x661daded(str);
    }
}
