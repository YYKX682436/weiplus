package com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd;

/* renamed from: com.tencent.maas.model.time.MJTimeRange */
/* loaded from: classes5.dex */
public class C4129xdee64553 implements java.lang.Cloneable {

    /* renamed from: InvalidTimeRange */
    public static final com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 f16108xa1116659;

    /* renamed from: PositiveInfiniteTimeRange */
    public static final com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 f16109x79d591a3;

    /* renamed from: ZeroTimeRange */
    public static final com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 f16110x95b7fc88;

    /* renamed from: duration */
    private final com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f16111x89444d94;

    /* renamed from: startTime */
    private final com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f16112x81158a4f;

    static {
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5;
        f16110x95b7fc88 = new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553(c4128x879fba0a, c4128x879fba0a);
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a2 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44;
        f16108xa1116659 = new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553(c4128x879fba0a2, c4128x879fba0a2);
        f16109x79d591a3 = new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553(c4128x879fba0a, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16097xacdfd1ce);
    }

    public C4129xdee64553(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a2) {
        this.f16112x81158a4f = c4128x879fba0a;
        this.f16111x89444d94 = c4128x879fba0a2;
    }

    /* renamed from: fromSecondsStartTimeDuration */
    public static com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 m33997xe9d83e0e(double d17, double d18) {
        return new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33969x7905b775(d17), com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33969x7905b775(d18));
    }

    /* renamed from: fromSecondsStartTimeEndTime */
    public static com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 m33998x6982828e(double d17, double d18) {
        return new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33969x7905b775(d17), com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33969x7905b775(d18 - d17));
    }

    /* renamed from: fromStartEnd */
    public static com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 m33999xbdf18ae3(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a2) {
        return new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553(c4128x879fba0a, c4128x879fba0a2.sub(c4128x879fba0a));
    }

    /* renamed from: calcIntersection */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 m34000xe1b2217e(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553) {
        if (!m34010x7b953cf2() || !c4129xdee64553.m34010x7b953cf2()) {
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44;
            return new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553(c4128x879fba0a, c4128x879fba0a);
        }
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a2 = this.f16112x81158a4f;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34007xde00a612 = m34007xde00a612();
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a3 = c4129xdee64553.f16112x81158a4f;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34007xde00a6122 = c4129xdee64553.m34007xde00a612();
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a4 = c4128x879fba0a2.m33986x9f3f7b48(c4128x879fba0a3) ? c4128x879fba0a3 : c4128x879fba0a2;
        if (m34007xde00a612.m33986x9f3f7b48(m34007xde00a6122)) {
            m34007xde00a6122 = m34007xde00a612;
        }
        return m34007xde00a6122.m33986x9f3f7b48(c4128x879fba0a4) ? (c4128x879fba0a3.m33971xf922bec1(m34007xde00a612) || c4128x879fba0a3.m33975x22a7969a(m34007xde00a612)) ? new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553(m34007xde00a612, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5) : new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553(c4128x879fba0a2, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5) : new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553(c4128x879fba0a4, m34007xde00a6122.sub(c4128x879fba0a4));
    }

    /* renamed from: calcMergedTimeRangeWith */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 m34001xcf292af5(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553) {
        if (!m34010x7b953cf2()) {
            return c4129xdee64553;
        }
        if (!c4129xdee64553.m34010x7b953cf2()) {
            return this;
        }
        if (c4129xdee64553.m34009x8082fb99().m33986x9f3f7b48(this.f16112x81158a4f)) {
            c4129xdee64553.m34009x8082fb99();
        }
        return m33999xbdf18ae3(this.f16112x81158a4f, c4129xdee64553.m34007xde00a612().m33971xf922bec1(m34007xde00a612()) ? c4129xdee64553.m34007xde00a612() : m34007xde00a612());
    }

    /* renamed from: containsTime */
    public boolean m34002x805f158c(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a) {
        if (m34010x7b953cf2() && c4128x879fba0a.m33983x7b953cf2()) {
            return (c4128x879fba0a.m33971xf922bec1(this.f16112x81158a4f) || c4128x879fba0a.m33975x22a7969a(this.f16112x81158a4f)) && c4128x879fba0a.m33986x9f3f7b48(m34007xde00a612());
        }
        return false;
    }

    /* renamed from: containsTimeRange */
    public boolean m34003xac5dcb11(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553) {
        return (c4129xdee64553.m34009x8082fb99().m33971xf922bec1(m34009x8082fb99()) || c4129xdee64553.m34009x8082fb99().m33975x22a7969a(m34009x8082fb99())) && c4129xdee64553.m34009x8082fb99().m33986x9f3f7b48(m34007xde00a612()) && c4129xdee64553.m34007xde00a612().m33971xf922bec1(m34009x8082fb99()) && (c4129xdee64553.m34007xde00a612().m33986x9f3f7b48(m34007xde00a612()) || c4129xdee64553.m34007xde00a612().m33975x22a7969a(m34007xde00a612()));
    }

    /* renamed from: equals */
    public boolean m34004xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553 = (com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553) obj;
        return this.f16112x81158a4f.equals(c4129xdee64553.f16112x81158a4f) && this.f16111x89444d94.equals(c4129xdee64553.f16111x89444d94);
    }

    /* renamed from: getDuration */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34005x51e8b0a() {
        return this.f16111x89444d94;
    }

    /* renamed from: getDurationFlicks */
    public long m34006xc75efd72() {
        return this.f16111x89444d94.m33976x194898be();
    }

    /* renamed from: getEndTime */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34007xde00a612() {
        return this.f16112x81158a4f.add(this.f16111x89444d94);
    }

    /* renamed from: getStartFlicks */
    public long m34008x53f71b94() {
        return this.f16112x81158a4f.m33976x194898be();
    }

    /* renamed from: getStartTime */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34009x8082fb99() {
        return this.f16112x81158a4f;
    }

    /* renamed from: isValid */
    public boolean m34010x7b953cf2() {
        return this.f16112x81158a4f.m33980x66356283() && this.f16111x89444d94.m33983x7b953cf2() && !this.f16111x89444d94.m33978x79eb37f();
    }

    /* renamed from: toString */
    public java.lang.String m34011x9616526c() {
        return "MJTimeRange{startTime=" + this.f16112x81158a4f + ", duration=" + this.f16111x89444d94 + '}';
    }
}
