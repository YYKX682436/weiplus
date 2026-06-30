package org.p3343x72743996.p3344x2e06d1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.chromium.base.CommandLineJni */
/* loaded from: classes16.dex */
public class C29294x7ad3c966 implements org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf.Natives {

    /* renamed from: TEST_HOOKS */
    public static final c56.a f73244xce5021a3 = new c56.a() { // from class: org.chromium.base.CommandLineJni.1
        /* renamed from: setInstanceForTesting, reason: merged with bridge method [inline-methods] */
        public void m152327x2f08577e(org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf.Natives natives) {
            if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
                org.p3343x72743996.p3344x2e06d1.C29294x7ad3c966.f73245x4baa8b47 = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };

    /* renamed from: testInstance */
    private static org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf.Natives f73245x4baa8b47;

    public static org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf.Natives get() {
        if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
            org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf.Natives natives = f73245x4baa8b47;
            if (natives != null) {
                return natives;
            }
            if (org.p3362x76ca9b02.C29682x261049f6.f75007x2a92e044) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of CommandLine.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.p3343x72743996.p3344x2e06d1.C29294x7ad3c966();
    }

    @Override // org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf.Natives
    /* renamed from: appendSwitch */
    public void mo152313x4e9036ee(java.lang.String str) {
        org.p3362x76ca9b02.C29682x261049f6.m154475xc6b7a3ee(str);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf.Natives
    /* renamed from: appendSwitchWithValue */
    public void mo152314x5ae550fd(java.lang.String str, java.lang.String str2) {
        org.p3362x76ca9b02.C29682x261049f6.m154476x63c883fd(str, str2);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf.Natives
    /* renamed from: appendSwitchesAndArguments */
    public void mo152315xff818b7b(java.lang.String[] strArr) {
        org.p3362x76ca9b02.C29682x261049f6.m154477x13a6387b(strArr);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf.Natives
    /* renamed from: getSwitchValue */
    public java.lang.String mo152316x583a9167(java.lang.String str) {
        return org.p3362x76ca9b02.C29682x261049f6.m154478x643abe67(str);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf.Natives
    /* renamed from: getSwitchesFlattened */
    public java.lang.String[] mo152317xab547c2b() {
        return org.p3362x76ca9b02.C29682x261049f6.m154479x2fbee92b();
    }

    @Override // org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf.Natives
    /* renamed from: hasSwitch */
    public boolean mo152318xefec5a6e(java.lang.String str) {
        return org.p3362x76ca9b02.C29682x261049f6.m154480x65c40d6e(str);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf.Natives
    /* renamed from: init */
    public void mo152319x316510(java.lang.String[] strArr) {
        org.p3362x76ca9b02.C29682x261049f6.m154481x7915d210(strArr);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf.Natives
    /* renamed from: removeSwitch */
    public void mo152320xcd4828d8(java.lang.String str) {
        org.p3362x76ca9b02.C29682x261049f6.m154482x456f95d8(str);
    }
}
