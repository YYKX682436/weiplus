package com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a;

/* renamed from: com.tencent.maas.moviecomposing.layout.SegmentSequenceTimeOffsetMapper */
/* loaded from: classes5.dex */
public class C4177x7c871c35 {
    private static final java.lang.String TAG = "SegSeqT2OMapper";

    /* renamed from: timeRangesByPixelOffsetRange */
    private final java.util.Map<com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553> f16159x1a0bb1de = new java.util.HashMap();

    /* renamed from: pixelOffsetRangesByTimeRange */
    private final java.util.Map<com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553, com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a> f16156xa716ad6a = new java.util.HashMap();

    /* renamed from: pixelOffsetRangeBoundary */
    private com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a f16155x152cf64e = com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a.c();

    /* renamed from: timeRangeBoundary */
    private com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 f16158x9978aba = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553.f16108xa1116659;

    /* renamed from: segmentViewMappers */
    private com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4178x3e32e554[] f16157xceb9aeba = null;

    /* renamed from: isSequenceMapperDirty */
    private boolean f16153x3bdffa06 = true;

    /* renamed from: isSequenceEmpty */
    private boolean f16152x54d82502 = true;

    /* renamed from: dataSource */
    private tg.a f16151x4bd85c65 = null;

    /* renamed from: mHybridData */
    private final com.p166x1da19ac6.jni.C1545xd48843e6 f16154x39e86013 = m34330xfce9a72c();

    /* renamed from: initHybrid */
    private native com.p166x1da19ac6.jni.C1545xd48843e6 m34330xfce9a72c();

    /* renamed from: nativeMapPixelOffsetToTime */
    private native com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34331xd50914bc(double d17);

    /* renamed from: nativeMapTimeToPixelOffset */
    private native double m34332x1b89982c(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a);

    /* renamed from: nativeMapperAddMappingForRange */
    private native void m34333x7e0a1559(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553, double d17, double d18, com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4178x3e32e554 c4178x3e32e554);

    /* renamed from: nativeMapperClear */
    private native void m34334xc473fbf5();

    /* renamed from: pixelOffsetForBackingTimeOutOfBoundary */
    private double m34335xbf5b1657(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a) {
        if (this.f16158x9978aba.m34002x805f158c(c4128x879fba0a)) {
            throw new java.lang.IllegalArgumentException("timeRangeBoundary " + this.f16158x9978aba + " do not contains time " + c4128x879fba0a);
        }
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34009x8082fb99 = this.f16158x9978aba.m34009x8082fb99();
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34007xde00a612 = this.f16158x9978aba.m34007xde00a612();
        ((bx0.f) this.f16151x4bd85c65).getClass();
        bx0.f fVar = (bx0.f) this.f16151x4bd85c65;
        fVar.getClass();
        bx0.h hVar = (bx0.h) fVar.f117783b;
        double s17 = hVar.f117808b.s(hVar.f117809c);
        if (c4128x879fba0a.m33972x38a73ce5(m34009x8082fb99) < 0) {
            return this.f16155x152cf64e.f130042a - java.lang.Math.round(m34009x8082fb99.sub(c4128x879fba0a).m33988x124aa384() * s17);
        }
        double round = java.lang.Math.round(c4128x879fba0a.sub(m34007xde00a612).m33988x124aa384() * s17);
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a c4176xaeba704a = this.f16155x152cf64e;
        return c4176xaeba704a.f130042a + c4176xaeba704a.f130043b + round;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0285  */
    /* renamed from: rebuild */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m34336x407ba01b() {
        /*
            Method dump skipped, instructions count: 842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4177x7c871c35.m34336x407ba01b():void");
    }

    /* renamed from: setSequenceMapperDirty */
    private void m34337x5f30cfce(boolean z17) {
        if (this.f16153x3bdffa06 == z17) {
            return;
        }
        this.f16153x3bdffa06 = z17;
        if (z17) {
            m34334xc473fbf5();
            this.f16159x1a0bb1de.clear();
            this.f16156xa716ad6a.clear();
            this.f16158x9978aba = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553.f16108xa1116659;
            this.f16155x152cf64e = com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a.c();
            this.f16152x54d82502 = true;
        }
    }

    /* renamed from: getDataSource */
    public tg.a m34338x3a19145b() {
        return this.f16151x4bd85c65;
    }

    /* renamed from: getIsSequenceEmpty */
    public boolean m34339x3939f6cc() {
        return this.f16152x54d82502;
    }

    /* renamed from: getIsSequenceMapperDirty */
    public boolean m34340x478bcc50() {
        return this.f16153x3bdffa06;
    }

    /* renamed from: getPixelOffsetRangeBoundary */
    public com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a m34341x453987c4() {
        return this.f16155x152cf64e;
    }

    /* renamed from: getSegmentViewMappers */
    public com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4178x3e32e554[] m34342xe21610b0() {
        return this.f16157xceb9aeba;
    }

    /* renamed from: getTimeRangeBoundary */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 m34343x5ccc1204() {
        return this.f16158x9978aba;
    }

    /* renamed from: markSequenceMapperDirty */
    public void m34344xfffbdf83() {
        m34337x5f30cfce(true);
    }

    /* renamed from: pixelOffsetForTime */
    public double m34345x1629663d(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a) {
        m34347x3bdd706d();
        if (this.f16152x54d82502) {
            return 0.0d;
        }
        double round = this.f16158x9978aba.m34002x805f158c(c4128x879fba0a) ? java.lang.Math.round(m34332x1b89982c(c4128x879fba0a)) : m34335xbf5b1657(c4128x879fba0a);
        if (java.lang.Double.isNaN(round)) {
            return 0.0d;
        }
        return round;
    }

    /* renamed from: pixelOffsetRangeForTimeRange */
    public com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a m34346xcb0defcb(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553) {
        m34347x3bdd706d();
        if (this.f16156xa716ad6a.containsKey(c4129xdee64553)) {
            return this.f16156xa716ad6a.get(c4129xdee64553);
        }
        double m34345x1629663d = m34345x1629663d(c4129xdee64553.m34009x8082fb99());
        return new com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a(m34345x1629663d, m34345x1629663d(c4129xdee64553.m34007xde00a612()) - m34345x1629663d);
    }

    /* renamed from: rebuildIfNeeded */
    public void m34347x3bdd706d() {
        if (this.f16153x3bdffa06) {
            m34336x407ba01b();
            this.f16152x54d82502 = this.f16157xceb9aeba.length == 0;
            m34337x5f30cfce(false);
        }
    }

    /* renamed from: setDataSource */
    public void m34348x683d6267(tg.a aVar) {
        this.f16151x4bd85c65 = aVar;
    }

    /* renamed from: timeForPixelOffset */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34349x5442ce5d(double d17) {
        m34347x3bdd706d();
        if (this.f16152x54d82502) {
            return com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5;
        }
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a c4176xaeba704a = this.f16155x152cf64e;
        double d18 = c4176xaeba704a.f130042a;
        double d19 = c4176xaeba704a.f130043b;
        if (d17 >= d18 && d17 < d19 + d18) {
            return m34331xd50914bc(d17);
        }
        double d27 = d19 + d18;
        ((bx0.f) this.f16151x4bd85c65).getClass();
        bx0.f fVar = (bx0.f) this.f16151x4bd85c65;
        fVar.getClass();
        bx0.h hVar = (bx0.h) fVar.f117783b;
        double s17 = hVar.f117808b.s(hVar.f117809c);
        if (java.lang.Double.compare(d17, d18) < 0) {
            return this.f16158x9978aba.m34009x8082fb99().sub(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33969x7905b775((d18 - d17) / s17));
        }
        return this.f16158x9978aba.m34007xde00a612().add(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33969x7905b775((d17 - d27) / s17));
    }

    /* renamed from: timeRangeForPixelOffsetRange */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 m34350x4c18305d(com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a c4176xaeba704a) {
        m34347x3bdd706d();
        return this.f16159x1a0bb1de.containsKey(c4176xaeba704a) ? this.f16159x1a0bb1de.get(c4176xaeba704a) : com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553.m33999xbdf18ae3(m34349x5442ce5d(c4176xaeba704a.f130042a), m34349x5442ce5d(c4176xaeba704a.f130042a + c4176xaeba704a.f130043b));
    }
}
