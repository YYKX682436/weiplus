package com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a;

/* renamed from: com.tencent.maas.moviecomposing.layout.SegmentTimeOffsetMapper */
/* loaded from: classes5.dex */
public class C4178x3e32e554 {

    /* renamed from: timeRange */
    private com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 f16162x16fae70 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553.f16108xa1116659;

    /* renamed from: pixelOffsetRange */
    private com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a f16161x7223ee04 = com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a.c();

    /* renamed from: mHybridData */
    private final com.p166x1da19ac6.jni.C1545xd48843e6 f16160x39e86013 = m34351xfce9a72c();

    /* renamed from: initHybrid */
    private native com.p166x1da19ac6.jni.C1545xd48843e6 m34351xfce9a72c();

    /* renamed from: nativePixelOffsetForTime */
    private native double m34352xf18a3ab4(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a);

    /* renamed from: nativeRebuildWithTimeRange */
    private native void m34353xfb0702a6(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553, double d17, double d18);

    /* renamed from: nativeTimeForPixelOffset */
    private native com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34354x2fa3a2d4(double d17);

    /* renamed from: deltaTimeForDeltaPointOffset */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34355x92038f6f(double d17) {
        if (java.lang.Double.compare(d17, 0.0d) == 0) {
            return com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5;
        }
        double d18 = this.f16161x7223ee04.f130043b;
        if (java.lang.Double.compare(d18, 0.0d) == 0) {
            return com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5;
        }
        return com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33969x7905b775((d17 / d18) * this.f16162x16fae70.m34005x51e8b0a().m33988x124aa384());
    }

    /* renamed from: getPixelOffsetRange */
    public com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a m34356x19fc557a() {
        return this.f16161x7223ee04;
    }

    /* renamed from: getTimeRange */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 m34357xdd1fba() {
        return this.f16162x16fae70;
    }

    /* renamed from: pixelOffsetForTime */
    public double m34358x1629663d(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a) {
        return m34352xf18a3ab4(c4128x879fba0a);
    }

    /* renamed from: rebuildWithTimeRange */
    public void m34359x74896fef(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553, com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a c4176xaeba704a) {
        this.f16162x16fae70 = c4129xdee64553;
        this.f16161x7223ee04 = c4176xaeba704a;
        m34353xfb0702a6(c4129xdee64553, c4176xaeba704a.f130042a, c4176xaeba704a.f130043b);
    }

    /* renamed from: timeForPixelOffset */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34360x5442ce5d(double d17) {
        return m34354x2fa3a2d4(d17);
    }
}
