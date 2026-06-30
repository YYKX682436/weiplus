package com.p314xaae8f345.tav.p2957xa228aba5;

/* renamed from: com.tencent.tav.coremedia.CMSampleState */
/* loaded from: classes16.dex */
public class C25735x289c723d {

    /* renamed from: exportCode */
    private int f47855xc703bc1;

    /* renamed from: isNewFrame */
    private boolean f47856x216ebaf7;
    private java.lang.String msg;

    /* renamed from: performance */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966 f47857xa7c31030;

    /* renamed from: stateCode */
    private long f47858x83a4361e;

    /* renamed from: throwable */
    private java.lang.Throwable f47859xb5275940;

    /* renamed from: time */
    private final com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f47860x3652cd;

    public C25735x289c723d() {
        this(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47861xbee5ffa0);
    }

    /* renamed from: fromError */
    public static com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d m97200x360047e(long j17) {
        return m97201x360047e(j17, "state:" + j17);
    }

    /* renamed from: fromExportError */
    public static com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d m97203xf8c200aa(long j17, int i17, java.lang.String str, java.lang.Throwable th6) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d c25735x289c723d = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d(j17, str, th6);
        c25735x289c723d.f47855xc703bc1 = i17;
        return c25735x289c723d;
    }

    /* renamed from: getExportCode */
    public int m97204xfab0f3b7() {
        return this.f47855xc703bc1;
    }

    /* renamed from: getMsg */
    public java.lang.String m97205xb588584b() {
        return this.msg;
    }

    /* renamed from: getStateCode */
    public long m97206x8311a768() {
        return this.f47858x83a4361e;
    }

    /* renamed from: getThrowable */
    public java.lang.Throwable m97207xb494ca8a() {
        return this.f47859xb5275940;
    }

    /* renamed from: getTime */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97208xfb85bb43() {
        return this.f47860x3652cd;
    }

    /* renamed from: inherit */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d m97209x740c90fb(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d c25735x289c723d) {
        this.f47857xa7c31030 = c25735x289c723d.f47857xa7c31030;
        c25735x289c723d.f47857xa7c31030 = null;
        return this;
    }

    /* renamed from: isInvalid */
    public boolean m97210x5241396d() {
        return this.f47860x3652cd == com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47861xbee5ffa0;
    }

    /* renamed from: isNewFrame */
    public boolean m97211x216ebaf7() {
        return this.f47856x216ebaf7;
    }

    /* renamed from: joinNode */
    public void m97212xac705a4c(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d c25735x289c723d) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966 c25733xc7e62966 = c25735x289c723d.f47857xa7c31030;
        if (c25733xc7e62966 != null) {
            this.f47857xa7c31030.f47836xb1e29dce.add(c25733xc7e62966);
            c25735x289c723d.f47857xa7c31030 = null;
        }
    }

    /* renamed from: setNewFrame */
    public void m97213xc749b22f(boolean z17) {
        this.f47856x216ebaf7 = z17;
    }

    /* renamed from: stateMatchingTo */
    public boolean m97214x36f88ac9(long... jArr) {
        for (long j17 : jArr) {
            if (this.f47858x83a4361e == j17) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: toString */
    public java.lang.String m97215x9616526c() {
        return "CMSampleState{time=" + this.f47860x3652cd + ", isNewFrame=" + this.f47856x216ebaf7 + ", stateCode=" + this.f47858x83a4361e + ", throwable=" + this.f47859xb5275940 + ", msg='" + this.msg + "'}";
    }

    /* renamed from: updatePerformance */
    public void m97216x63d457a7() {
        while (this.f47857xa7c31030.m97182xd0be390b() != null) {
            this.f47857xa7c31030 = this.f47857xa7c31030.m97182xd0be390b();
        }
    }

    public C25735x289c723d(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        this.f47857xa7c31030 = new com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966();
        this.f47856x216ebaf7 = true;
        this.f47858x83a4361e = 0L;
        this.f47855xc703bc1 = 0;
        this.f47860x3652cd = c25736x76b98a57;
        long j17 = c25736x76b98a57.f47870x6ac9171;
        if (j17 < 0) {
            this.f47858x83a4361e = j17;
        }
    }

    /* renamed from: fromError */
    public static com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d m97201x360047e(long j17, java.lang.String str) {
        return m97202x360047e(j17, str, new java.lang.RuntimeException(str));
    }

    /* renamed from: fromError */
    public static com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d m97202x360047e(long j17, java.lang.String str, java.lang.Throwable th6) {
        return new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d(j17, str, th6);
    }

    public C25735x289c723d(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966 c25733xc7e62966) {
        this(c25736x76b98a57);
        this.f47857xa7c31030 = c25733xc7e62966;
    }

    public C25735x289c723d(long j17, java.lang.String str, java.lang.Throwable th6) {
        this.f47857xa7c31030 = new com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966();
        this.f47856x216ebaf7 = true;
        this.f47858x83a4361e = 0L;
        this.f47855xc703bc1 = 0;
        this.f47860x3652cd = new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(j17);
        this.f47858x83a4361e = j17;
        this.msg = str;
        this.f47859xb5275940 = th6;
    }
}
