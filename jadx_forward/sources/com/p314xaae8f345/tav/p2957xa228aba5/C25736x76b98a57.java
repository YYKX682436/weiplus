package com.p314xaae8f345.tav.p2957xa228aba5;

/* renamed from: com.tencent.tav.coremedia.CMTime */
/* loaded from: classes16.dex */
public class C25736x76b98a57 implements java.lang.Cloneable {

    /* renamed from: DEFAULT_TIME_SCALE */
    public static final int f47864x9f06b616 = 600;

    /* renamed from: SECONDS_MS */
    private static final long f47865x363c0786 = 1000;

    /* renamed from: SECONDS_US */
    private static final long f47866x363c087e = 1000000;

    /* renamed from: time */
    private final float f47867x3652cd;

    /* renamed from: timeScale */
    public final int f47868x17e7e7d;

    /* renamed from: timeUs */
    private final long f47869xcbecde4b;

    /* renamed from: value */
    public final long f47870x6ac9171;

    /* renamed from: CMTimeZero */
    public static final com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f47863xfd8f99f = new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(0, 600);

    /* renamed from: CMTimeOne */
    public static final com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f47862x218af88f = new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(600, 600);

    /* renamed from: CMTimeInvalid */
    public static final com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f47861xbee5ffa0 = new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(Long.MIN_VALUE, 600, -1.0f, -1);

    public C25736x76b98a57() {
        this(0L, 600);
    }

    public static int GCD(int i17, int i18) {
        return i17 == 0 ? i18 : GCD(i18 % i17, i17);
    }

    public static int LCM(int i17, int i18) {
        return (i17 / GCD(i17, i18)) * i18;
    }

    public static com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 add(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a572) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a573 = f47861xbee5ffa0;
        if (c25736x76b98a57 == c25736x76b98a573) {
            return c25736x76b98a572.m97224x5a5dd5d();
        }
        if (c25736x76b98a572 == c25736x76b98a573) {
            return c25736x76b98a57.m97224x5a5dd5d();
        }
        int LCM = LCM(c25736x76b98a57.f47868x17e7e7d, c25736x76b98a572.f47868x17e7e7d);
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97218xb0633a0a = m97218xb0633a0a(c25736x76b98a57, LCM);
        return new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(m97218xb0633a0a.m97233x754a37bb() + m97218xb0633a0a(c25736x76b98a572, LCM).m97233x754a37bb(), m97218xb0633a0a.f47868x17e7e7d);
    }

    /* renamed from: convertTimeScale */
    public static com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97218xb0633a0a(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, int i17) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a572 = f47861xbee5ffa0;
        return c25736x76b98a57 == c25736x76b98a572 ? c25736x76b98a572 : c25736x76b98a57 == f47863xfd8f99f ? new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(0L, i17) : new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57((c25736x76b98a57.m97233x754a37bb() * i17) / c25736x76b98a57.m97230xebefc7(), i17);
    }

    /* renamed from: fromMs */
    public static com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97219xb488def0(long j17) {
        return new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57((((float) j17) * 1.0f) / 1000.0f);
    }

    /* renamed from: fromSeconds */
    public static com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97220x7905b775(float f17) {
        return new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(f17);
    }

    /* renamed from: fromUs */
    public static com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97221xb488dfe8(long j17) {
        return new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57((((float) j17) * 1.0f) / 1000000.0f);
    }

    public static com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 max(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a572) {
        return c25736x76b98a57.m97222xf922bec1(c25736x76b98a572) ? c25736x76b98a57 : c25736x76b98a572;
    }

    public static com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 min(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a572) {
        return c25736x76b98a57.m97238x9f3f7b48(c25736x76b98a572) ? c25736x76b98a57 : c25736x76b98a572;
    }

    public static com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 sub(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a572) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a573 = f47861xbee5ffa0;
        if (c25736x76b98a57 == c25736x76b98a573) {
            return new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(-c25736x76b98a572.m97233x754a37bb());
        }
        if (c25736x76b98a572 == c25736x76b98a573) {
            return c25736x76b98a57.m97224x5a5dd5d();
        }
        int LCM = LCM(c25736x76b98a57.f47868x17e7e7d, c25736x76b98a572.f47868x17e7e7d);
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97218xb0633a0a = m97218xb0633a0a(c25736x76b98a57, LCM);
        return new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(m97218xb0633a0a.m97233x754a37bb() - m97218xb0633a0a(c25736x76b98a572, LCM).m97233x754a37bb(), m97218xb0633a0a.f47868x17e7e7d);
    }

    /* renamed from: bigThan */
    public boolean m97222xf922bec1(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        return m97232x31040141() > c25736x76b98a57.m97232x31040141();
    }

    /* renamed from: compare */
    public int m97225x38a73ce5(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        long m97232x31040141 = m97232x31040141() - c25736x76b98a57.m97232x31040141();
        if (m97232x31040141 > 0) {
            return 1;
        }
        return m97232x31040141 == 0 ? 0 : -1;
    }

    /* renamed from: divide */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97226xb0a37c79(float f17) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57 = f47861xbee5ffa0;
        return this == c25736x76b98a57 ? c25736x76b98a57 : new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(((float) m97233x754a37bb()) / f17, this.f47868x17e7e7d);
    }

    /* renamed from: equals */
    public boolean m97228xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57)) {
            return false;
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57 = (com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57) obj;
        return this.f47870x6ac9171 == c25736x76b98a57.f47870x6ac9171 && this.f47868x17e7e7d == c25736x76b98a57.f47868x17e7e7d;
    }

    /* renamed from: equalsTo */
    public boolean m97229x22a7969a(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        return m97232x31040141() == c25736x76b98a57.m97232x31040141();
    }

    /* renamed from: getTimeScale */
    public int m97230xebefc7() {
        return this.f47868x17e7e7d;
    }

    /* renamed from: getTimeSeconds */
    public float m97231x793685bc() {
        return this.f47867x3652cd;
    }

    /* renamed from: getTimeUs */
    public long m97232x31040141() {
        return this.f47869xcbecde4b;
    }

    /* renamed from: getValue */
    public long m97233x754a37bb() {
        return this.f47870x6ac9171;
    }

    /* renamed from: limitMax */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97234x456b03a9(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        return m97222xf922bec1(c25736x76b98a57) ? c25736x76b98a57 : this;
    }

    /* renamed from: limitMin */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97235x456b0497(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        return m97238x9f3f7b48(c25736x76b98a57) ? c25736x76b98a57 : this;
    }

    /* renamed from: multi */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97236x636d539(float f17) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57 = f47861xbee5ffa0;
        return this == c25736x76b98a57 ? c25736x76b98a57 : new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(((float) m97233x754a37bb()) * f17, this.f47868x17e7e7d);
    }

    /* renamed from: smallThan */
    public boolean m97238x9f3f7b48(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        return m97232x31040141() < c25736x76b98a57.m97232x31040141();
    }

    /* renamed from: toString */
    public java.lang.String m97239x9616526c() {
        return "[value = " + this.f47870x6ac9171 + " timeScale = " + this.f47868x17e7e7d + " timeUs = " + this.f47869xcbecde4b + "]";
    }

    public C25736x76b98a57(long j17) {
        this(j17, 600);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97224x5a5dd5d() {
        return new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(this.f47870x6ac9171, this.f47868x17e7e7d, this.f47867x3652cd, this.f47869xcbecde4b);
    }

    public C25736x76b98a57(float f17) {
        this(f17 * 600.0f, 600);
    }

    /* renamed from: divide */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97227xb0a37c79(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        int LCM = LCM(this.f47868x17e7e7d, c25736x76b98a57.f47868x17e7e7d);
        return new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(m97218xb0633a0a(this, LCM).f47870x6ac9171 / m97218xb0633a0a(c25736x76b98a57, LCM).f47870x6ac9171, LCM);
    }

    /* renamed from: multi */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97237x636d539(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        int LCM = LCM(this.f47868x17e7e7d, c25736x76b98a57.f47868x17e7e7d);
        return new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(m97218xb0633a0a(this, LCM).f47870x6ac9171 * m97218xb0633a0a(c25736x76b98a57, LCM).f47870x6ac9171, LCM);
    }

    public C25736x76b98a57(long j17, int i17) {
        this.f47870x6ac9171 = j17;
        this.f47868x17e7e7d = i17;
        this.f47867x3652cd = (((float) j17) * 1.0f) / i17;
        this.f47869xcbecde4b = (j17 * 1000000) / i17;
    }

    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 add(long j17) {
        if (this == f47861xbee5ffa0) {
            return m97224x5a5dd5d();
        }
        return new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(m97233x754a37bb() + ((j17 * this.f47868x17e7e7d) / java.util.concurrent.TimeUnit.SECONDS.toMicros(1L)), this.f47868x17e7e7d);
    }

    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 sub(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        return sub(this, c25736x76b98a57);
    }

    private C25736x76b98a57(long j17, int i17, float f17, long j18) {
        this.f47870x6ac9171 = j17;
        this.f47869xcbecde4b = j18;
        this.f47867x3652cd = f17;
        this.f47868x17e7e7d = i17;
    }

    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 add(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        return add(this, c25736x76b98a57);
    }
}
