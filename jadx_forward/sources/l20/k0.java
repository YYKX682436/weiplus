package l20;

/* loaded from: classes14.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f396694a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Long f396695b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f396696c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f396697d;

    /* renamed from: e, reason: collision with root package name */
    public final l20.l0 f396698e;

    /* renamed from: f, reason: collision with root package name */
    public final l20.l0 f396699f;

    public k0(long j17, java.lang.Long l17, java.util.List bufferingPeriods, java.util.List pausePeriods, l20.l0 l0Var, l20.l0 l0Var2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bufferingPeriods, "bufferingPeriods");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pausePeriods, "pausePeriods");
        this.f396694a = j17;
        this.f396695b = l17;
        this.f396696c = bufferingPeriods;
        this.f396697d = pausePeriods;
        this.f396698e = l0Var;
        this.f396699f = l0Var2;
    }

    public static l20.k0 a(l20.k0 k0Var, long j17, java.lang.Long l17, java.util.List list, java.util.List list2, l20.l0 l0Var, l20.l0 l0Var2, int i17, java.lang.Object obj) {
        long j18 = (i17 & 1) != 0 ? k0Var.f396694a : j17;
        java.lang.Long l18 = (i17 & 2) != 0 ? k0Var.f396695b : l17;
        java.util.List bufferingPeriods = (i17 & 4) != 0 ? k0Var.f396696c : list;
        java.util.List pausePeriods = (i17 & 8) != 0 ? k0Var.f396697d : list2;
        l20.l0 l0Var3 = (i17 & 16) != 0 ? k0Var.f396698e : l0Var;
        l20.l0 l0Var4 = (i17 & 32) != 0 ? k0Var.f396699f : l0Var2;
        k0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bufferingPeriods, "bufferingPeriods");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pausePeriods, "pausePeriods");
        return new l20.k0(j18, l18, bufferingPeriods, pausePeriods, l0Var3, l0Var4);
    }

    public final long b() {
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        long j17 = this.f396694a;
        long c17 = (uptimeMillis - j17) - c();
        long j18 = 0;
        for (l20.l0 l0Var : this.f396697d) {
            long j19 = l0Var.f396703b;
            j18 += j19 > 0 ? j19 - l0Var.f396702a : 0L;
        }
        l20.l0 l0Var2 = this.f396699f;
        long uptimeMillis2 = c17 - (j18 + (l0Var2 != null ? android.os.SystemClock.uptimeMillis() - l0Var2.f396702a : 0L));
        java.lang.Long l17 = this.f396695b;
        return uptimeMillis2 - (l17 != null ? l17.longValue() : android.os.SystemClock.uptimeMillis() - j17);
    }

    public final long c() {
        long j17 = 0;
        for (l20.l0 l0Var : this.f396696c) {
            long j18 = l0Var.f396703b;
            j17 += j18 > 0 ? j18 - l0Var.f396702a : 0L;
        }
        l20.l0 l0Var2 = this.f396698e;
        return j17 + (l0Var2 != null ? android.os.SystemClock.uptimeMillis() - l0Var2.f396702a : 0L);
    }

    /* renamed from: equals */
    public boolean m144923xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l20.k0)) {
            return false;
        }
        l20.k0 k0Var = (l20.k0) obj;
        return this.f396694a == k0Var.f396694a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f396695b, k0Var.f396695b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f396696c, k0Var.f396696c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f396697d, k0Var.f396697d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f396698e, k0Var.f396698e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f396699f, k0Var.f396699f);
    }

    /* renamed from: hashCode */
    public int m144924x8cdac1b() {
        int hashCode = java.lang.Long.hashCode(this.f396694a) * 31;
        java.lang.Long l17 = this.f396695b;
        int hashCode2 = (((((hashCode + (l17 == null ? 0 : l17.hashCode())) * 31) + this.f396696c.hashCode()) * 31) + this.f396697d.hashCode()) * 31;
        l20.l0 l0Var = this.f396698e;
        int m144927x8cdac1b = (hashCode2 + (l0Var == null ? 0 : l0Var.m144927x8cdac1b())) * 31;
        l20.l0 l0Var2 = this.f396699f;
        return m144927x8cdac1b + (l0Var2 != null ? l0Var2.m144927x8cdac1b() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m144925x9616526c() {
        return "PlaySession(startTime=" + this.f396694a + ", firstFrameLoadTime=" + this.f396695b + ", bufferingPeriods=" + this.f396696c + ", pausePeriods=" + this.f396697d + ", currentBuffering=" + this.f396698e + ", currentPause=" + this.f396699f + ')';
    }
}
