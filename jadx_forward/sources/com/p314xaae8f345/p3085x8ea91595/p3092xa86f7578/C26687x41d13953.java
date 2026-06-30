package com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578;

/* renamed from: com.tencent.tmassistantsdk.logreport.TipsInfoReportManager */
/* loaded from: classes13.dex */
public class C26687x41d13953 extends com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.AbstractC26681xea999468 {
    protected static final java.lang.String TAG = "TipsInfoReportManager";

    /* renamed from: mInstance */
    protected static com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26687x41d13953 f56241x46143c22;

    private C26687x41d13953() {
    }

    /* renamed from: getInstance */
    public static synchronized com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26687x41d13953 m104992x9cf0d20b() {
        com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26687x41d13953 c26687x41d13953;
        synchronized (com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26687x41d13953.class) {
            if (f56241x46143c22 == null) {
                f56241x46143c22 = new com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26687x41d13953();
            }
            c26687x41d13953 = f56241x46143c22;
        }
        return c26687x41d13953;
    }

    /* renamed from: createTipsInfoLog */
    public com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26758x6c6ebd3e m104993x3623e6c2(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26712xd27f11a0 c26712xd27f11a0) {
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "createTipsInfoLog");
        if (c26712xd27f11a0 == null) {
            return null;
        }
        com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26758x6c6ebd3e c26758x6c6ebd3e = new com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26758x6c6ebd3e();
        c26758x6c6ebd3e.f56728xce2b2e46 = c26712xd27f11a0.f56396xce2b2e46;
        c26758x6c6ebd3e.f56729x4ce69ea0 = c26712xd27f11a0.f56397x4ce69ea0;
        c26758x6c6ebd3e.f56723xecc5609f = c26712xd27f11a0.f56392xecc5609f;
        c26758x6c6ebd3e.f56724xdfa5e393 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(c26712xd27f11a0.f56393xdfa5e393, 0);
        c26758x6c6ebd3e.f56722x75f375ac = c26712xd27f11a0.f56391x75f375ac;
        return c26758x6c6ebd3e;
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.AbstractC26681xea999468
    /* renamed from: getLogTable */
    public com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.AbstractC26767x1daf70fb mo104972xf33d5060() {
        return com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26773x1ad92530.m105456x9cf0d20b();
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.AbstractC26681xea999468
    /* renamed from: getReportType */
    public byte mo104973x615f5684() {
        return (byte) 1;
    }
}
