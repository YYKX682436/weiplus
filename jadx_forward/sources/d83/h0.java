package d83;

/* loaded from: classes5.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f308503a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f308504b;

    /* renamed from: c, reason: collision with root package name */
    public long f308505c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f308506d;

    /* renamed from: e, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f308507e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.a f308508f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a f308509g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Integer f308510h;

    /* renamed from: i, reason: collision with root package name */
    public final e70.c0 f308511i;

    public h0(int i17, java.util.concurrent.atomic.AtomicLong lastReceiveTime, long j17, java.util.concurrent.CopyOnWriteArrayList onReceiveListenerList, p3325xe03a0797.p3326xc267989b.r2 r2Var, yz5.a onRelease, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        lastReceiveTime = (i18 & 2) != 0 ? new java.util.concurrent.atomic.AtomicLong(0L) : lastReceiveTime;
        j17 = (i18 & 4) != 0 ? 5000L : j17;
        onReceiveListenerList = (i18 & 8) != 0 ? new java.util.concurrent.CopyOnWriteArrayList() : onReceiveListenerList;
        r2Var = (i18 & 16) != 0 ? null : r2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lastReceiveTime, "lastReceiveTime");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onReceiveListenerList, "onReceiveListenerList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onRelease, "onRelease");
        this.f308503a = i17;
        this.f308504b = lastReceiveTime;
        this.f308505c = j17;
        this.f308506d = onReceiveListenerList;
        this.f308507e = r2Var;
        this.f308508f = onRelease;
        this.f308509g = new com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a("MicroMsg.StreamInternal", null, 0, 6, null);
        this.f308511i = new d83.f0(this);
    }

    public final void a(boolean z17) {
        java.util.concurrent.atomic.AtomicLong atomicLong = this.f308504b;
        if (!z17 || atomicLong.get() == 0) {
            atomicLong.set(java.lang.System.currentTimeMillis());
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f308507e;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            this.f308507e = v65.i.b(this.f308509g, null, new d83.g0(this, null), 1, null);
        }
    }

    /* renamed from: equals */
    public boolean m123671xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d83.h0)) {
            return false;
        }
        d83.h0 h0Var = (d83.h0) obj;
        return this.f308503a == h0Var.f308503a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f308504b, h0Var.f308504b) && this.f308505c == h0Var.f308505c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f308506d, h0Var.f308506d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f308507e, h0Var.f308507e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f308508f, h0Var.f308508f);
    }

    /* renamed from: hashCode */
    public int m123672x8cdac1b() {
        int hashCode = ((((((java.lang.Integer.hashCode(this.f308503a) * 31) + this.f308504b.hashCode()) * 31) + java.lang.Long.hashCode(this.f308505c)) * 31) + this.f308506d.hashCode()) * 31;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f308507e;
        return ((hashCode + (r2Var == null ? 0 : r2Var.hashCode())) * 31) + this.f308508f.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m123673x9616526c() {
        return "StreamInternal(bizType=" + this.f308503a + ", lastReceiveTime=" + this.f308504b + ", timeout=" + this.f308505c + ", onReceiveListenerList=" + this.f308506d + ", releaseJob=" + this.f308507e + ", onRelease=" + this.f308508f + ')';
    }
}
