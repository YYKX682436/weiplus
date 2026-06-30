package org.p3343x72743996.net.p3358x316220;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.chromium.net.impl.CronetBidirectionalStreamJni */
/* loaded from: classes16.dex */
public class C29597x6b63fe3f implements org.p3343x72743996.net.p3358x316220.C29595x3307af86.Natives {

    /* renamed from: TEST_HOOKS */
    public static final c56.a f74516xce5021a3 = new c56.a() { // from class: org.chromium.net.impl.CronetBidirectionalStreamJni.1
        /* renamed from: setInstanceForTesting, reason: merged with bridge method [inline-methods] */
        public void m154038x2f08577e(org.p3343x72743996.net.p3358x316220.C29595x3307af86.Natives natives) {
            if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
                org.p3343x72743996.net.p3358x316220.C29597x6b63fe3f.f74517x4baa8b47 = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };

    /* renamed from: testInstance */
    private static org.p3343x72743996.net.p3358x316220.C29595x3307af86.Natives f74517x4baa8b47;

    public static org.p3343x72743996.net.p3358x316220.C29595x3307af86.Natives get() {
        if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
            org.p3343x72743996.net.p3358x316220.C29595x3307af86.Natives natives = f74517x4baa8b47;
            if (natives != null) {
                return natives;
            }
            if (org.p3362x76ca9b02.C29682x261049f6.f75007x2a92e044) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of CronetBidirectionalStream.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.p3343x72743996.net.p3358x316220.C29597x6b63fe3f();
    }

    @Override // org.p3343x72743996.net.p3358x316220.C29595x3307af86.Natives
    /* renamed from: createBidirectionalStream */
    public long mo154031x28d1ac07(org.p3343x72743996.net.p3358x316220.C29595x3307af86 c29595x3307af86, long j17, boolean z17, boolean z18, int i17, boolean z19, int i18, long j18) {
        return org.p3362x76ca9b02.C29682x261049f6.m154572x6f1f1d3f(c29595x3307af86, j17, z17, z18, i17, z19, i18, j18);
    }

    @Override // org.p3343x72743996.net.p3358x316220.C29595x3307af86.Natives
    /* renamed from: destroy */
    public void mo154032x5cd39ffa(long j17, org.p3343x72743996.net.p3358x316220.C29595x3307af86 c29595x3307af86, boolean z17) {
        org.p3362x76ca9b02.C29682x261049f6.m154573xd6116f32(j17, c29595x3307af86, z17);
    }

    @Override // org.p3343x72743996.net.p3358x316220.C29595x3307af86.Natives
    /* renamed from: readData */
    public boolean mo154033xcc430260(long j17, org.p3343x72743996.net.p3358x316220.C29595x3307af86 c29595x3307af86, java.nio.ByteBuffer byteBuffer, int i17, int i18) {
        return org.p3362x76ca9b02.C29682x261049f6.m154574x7abf1a28(j17, c29595x3307af86, byteBuffer, i17, i18);
    }

    @Override // org.p3343x72743996.net.p3358x316220.C29595x3307af86.Natives
    /* renamed from: sendRequestHeaders */
    public void mo154034xabfbb39f(long j17, org.p3343x72743996.net.p3358x316220.C29595x3307af86 c29595x3307af86) {
        org.p3362x76ca9b02.C29682x261049f6.m154575x4e32b167(j17, c29595x3307af86);
    }

    @Override // org.p3343x72743996.net.p3358x316220.C29595x3307af86.Natives
    /* renamed from: start */
    public int mo154035x68ac462(long j17, org.p3343x72743996.net.p3358x316220.C29595x3307af86 c29595x3307af86, java.lang.String str, int i17, java.lang.String str2, java.lang.String[] strArr, boolean z17) {
        return org.p3362x76ca9b02.C29682x261049f6.m154576xb4e3019a(j17, c29595x3307af86, str, i17, str2, strArr, z17);
    }

    @Override // org.p3343x72743996.net.p3358x316220.C29595x3307af86.Natives
    /* renamed from: writevData */
    public boolean mo154036xdb43f4c1(long j17, org.p3343x72743996.net.p3358x316220.C29595x3307af86 c29595x3307af86, java.nio.ByteBuffer[] byteBufferArr, int[] iArr, int[] iArr2, boolean z17) {
        return org.p3362x76ca9b02.C29682x261049f6.m154577xdb193a89(j17, c29595x3307af86, byteBufferArr, iArr, iArr2, z17);
    }
}
