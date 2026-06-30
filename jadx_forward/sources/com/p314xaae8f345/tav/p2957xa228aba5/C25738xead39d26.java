package com.p314xaae8f345.tav.p2957xa228aba5;

/* renamed from: com.tencent.tav.coremedia.CMTimeRange */
/* loaded from: classes16.dex */
public class C25738xead39d26 implements java.lang.Cloneable {

    /* renamed from: CMTimeRangeInvalid */
    public static com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 f47873x2dc6f5f1;

    /* renamed from: duration */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f47874x89444d94;
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 end;

    /* renamed from: start */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f47875x68ac462;

    static {
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
        f47873x2dc6f5f1 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(c25736x76b98a57, c25736x76b98a57);
    }

    public C25738xead39d26(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a572) {
        this.f47875x68ac462 = c25736x76b98a57;
        this.f47874x89444d94 = c25736x76b98a572;
        this.end = c25736x76b98a57.add(c25736x76b98a572);
    }

    /* renamed from: fromMs */
    public static com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 m97246xb488def0(long j17, long j18) {
        return new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.m97219xb488def0(j17), com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.m97219xb488def0(j18));
    }

    /* renamed from: fromSeconds */
    public static com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 m97247x7905b775(float f17, float f18) {
        return new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.m97220x7905b775(f17), com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.m97220x7905b775(f18));
    }

    /* renamed from: fromUs */
    public static com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 m97248xb488dfe8(long j17, long j18) {
        return new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.m97221xb488dfe8(j17), com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.m97221xb488dfe8(j18));
    }

    /* renamed from: getIntersection */
    public static com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 m97249x6b10bcff(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d262) {
        if (c25738xead39d26 == null || c25738xead39d262 == null) {
            return f47873x2dc6f5f1;
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 m97252x5a5dd5d = c25738xead39d26.m97252x5a5dd5d();
        com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 m97252x5a5dd5d2 = c25738xead39d262.m97252x5a5dd5d();
        if (m97252x5a5dd5d.m97261xccb87a6a() > m97252x5a5dd5d2.m97261xccb87a6a()) {
            m97252x5a5dd5d2 = m97252x5a5dd5d;
            m97252x5a5dd5d = m97252x5a5dd5d2;
        }
        return (m97252x5a5dd5d.m97259x74606f23() <= m97252x5a5dd5d2.m97261xccb87a6a() || m97252x5a5dd5d.m97259x74606f23() >= m97252x5a5dd5d2.m97259x74606f23()) ? m97252x5a5dd5d.m97259x74606f23() >= m97252x5a5dd5d2.m97259x74606f23() ? m97252x5a5dd5d2 : m97252x5a5dd5d.m97259x74606f23() < m97252x5a5dd5d2.m97261xccb87a6a() ? f47873x2dc6f5f1 : f47873x2dc6f5f1 : new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(m97252x5a5dd5d2.m97260x75286aac(), m97252x5a5dd5d.m97258xb58839a5().sub(m97252x5a5dd5d2.m97260x75286aac()));
    }

    /* renamed from: getUnions */
    public static com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26[] m97250x32fda67a(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d262) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26[] c25738xead39d26Arr = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26[2];
        if (c25738xead39d26 == null) {
            c25738xead39d26Arr[0] = c25738xead39d262;
        } else if (c25738xead39d262 == null) {
            c25738xead39d26Arr[0] = c25738xead39d26;
        } else {
            com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 m97252x5a5dd5d = c25738xead39d26.m97252x5a5dd5d();
            com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 m97252x5a5dd5d2 = c25738xead39d262.m97252x5a5dd5d();
            if (m97252x5a5dd5d.m97261xccb87a6a() > m97252x5a5dd5d2.m97261xccb87a6a()) {
                m97252x5a5dd5d2 = m97252x5a5dd5d;
                m97252x5a5dd5d = m97252x5a5dd5d2;
            }
            c25738xead39d26Arr[0] = m97252x5a5dd5d;
            if (m97252x5a5dd5d.m97259x74606f23() >= m97252x5a5dd5d2.m97261xccb87a6a() && m97252x5a5dd5d.m97259x74606f23() < m97252x5a5dd5d2.m97259x74606f23()) {
                c25738xead39d26Arr[1] = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(m97252x5a5dd5d.m97258xb58839a5(), m97252x5a5dd5d2.m97258xb58839a5().sub(m97252x5a5dd5d.m97258xb58839a5()));
            } else if (m97252x5a5dd5d.m97259x74606f23() >= m97252x5a5dd5d2.m97259x74606f23()) {
                c25738xead39d26Arr[1] = null;
            } else if (m97252x5a5dd5d.m97259x74606f23() < m97252x5a5dd5d2.m97261xccb87a6a()) {
                c25738xead39d26Arr[1] = m97252x5a5dd5d2;
            }
        }
        return c25738xead39d26Arr;
    }

    /* renamed from: containsTime */
    public boolean m97253x805f158c(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        return m97261xccb87a6a() <= c25736x76b98a57.m97232x31040141() && m97259x74606f23() > c25736x76b98a57.m97232x31040141();
    }

    /* renamed from: containsTimeRange */
    public boolean m97254xac5dcb11(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        return m97261xccb87a6a() <= c25738xead39d26.m97261xccb87a6a() && m97259x74606f23() >= c25738xead39d26.m97259x74606f23();
    }

    /* renamed from: equals */
    public boolean m97255xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26)) {
            return false;
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26 = (com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26) obj;
        return this.f47875x68ac462.m97228xb2c87fbf(c25738xead39d26.f47875x68ac462) && this.f47874x89444d94.m97228xb2c87fbf(c25738xead39d26.f47874x89444d94);
    }

    /* renamed from: getDuration */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97256x51e8b0a() {
        return this.f47874x89444d94;
    }

    /* renamed from: getDurationUs */
    public long m97257x37a7fb48() {
        return this.f47874x89444d94.m97232x31040141();
    }

    /* renamed from: getEnd */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97258xb58839a5() {
        return this.end;
    }

    /* renamed from: getEndUs */
    public long m97259x74606f23() {
        return m97261xccb87a6a() + m97257x37a7fb48();
    }

    /* renamed from: getStart */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97260x75286aac() {
        return this.f47875x68ac462;
    }

    /* renamed from: getStartUs */
    public long m97261xccb87a6a() {
        return this.f47875x68ac462.m97232x31040141();
    }

    /* renamed from: isLegal */
    public boolean m97262x7b0a0faf() {
        return m97261xccb87a6a() >= 0 && m97257x37a7fb48() > 0;
    }

    /* renamed from: setDuration */
    public void m97263xffd6ec16(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        this.f47874x89444d94 = c25736x76b98a57;
        this.end = this.f47875x68ac462.add(c25736x76b98a57);
    }

    /* renamed from: setStart */
    public void m97264x53b68520(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        this.f47875x68ac462 = c25736x76b98a57;
        this.end = c25736x76b98a57.add(this.f47874x89444d94);
    }

    /* renamed from: split */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26[] m97265x6891b1a(float f17) {
        if (f17 < 0.0f || f17 > 1.0f) {
            return null;
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(this.f47875x68ac462, m97256x51e8b0a().m97236x636d539(f17));
        return new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26[]{c25738xead39d26, new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(c25738xead39d26.m97258xb58839a5(), m97256x51e8b0a().m97236x636d539(1.0f - f17))};
    }

    /* renamed from: toSimpleString */
    public java.lang.String m97266x7af9727e() {
        return "CMTimeRange{startUs=" + this.f47875x68ac462.m97232x31040141() + ", durationUs=" + this.f47874x89444d94.m97232x31040141() + '}';
    }

    /* renamed from: toString */
    public java.lang.String m97267x9616526c() {
        return "CMTimeRange{start=" + this.f47875x68ac462 + ", duration=" + this.f47874x89444d94 + ", end=" + this.end + '}';
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 m97252x5a5dd5d() {
        return new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(this.f47875x68ac462, this.f47874x89444d94);
    }
}
