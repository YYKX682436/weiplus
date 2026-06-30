package z80;

/* loaded from: classes2.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 f552188a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 f552189b;

    /* renamed from: c, reason: collision with root package name */
    public final long f552190c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f552191d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f552192e;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 poiLocationInfo, com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 userLocationInfo, long j17, java.lang.String msgTalkerName, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(poiLocationInfo, "poiLocationInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userLocationInfo, "userLocationInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgTalkerName, "msgTalkerName");
        this.f552188a = poiLocationInfo;
        this.f552189b = userLocationInfo;
        this.f552190c = j17;
        this.f552191d = msgTalkerName;
        this.f552192e = z17;
    }

    /* renamed from: equals */
    public boolean m178541xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z80.p0)) {
            return false;
        }
        z80.p0 p0Var = (z80.p0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f552188a, p0Var.f552188a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f552189b, p0Var.f552189b) && this.f552190c == p0Var.f552190c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f552191d, p0Var.f552191d) && this.f552192e == p0Var.f552192e;
    }

    /* renamed from: hashCode */
    public int m178542x8cdac1b() {
        return (((((((this.f552188a.hashCode() * 31) + this.f552189b.hashCode()) * 31) + java.lang.Long.hashCode(this.f552190c)) * 31) + this.f552191d.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f552192e);
    }

    /* renamed from: toString */
    public java.lang.String m178543x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("poi:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 c16279x64cea23 = this.f552188a;
        sb6.append(c16279x64cea23.f226127p);
        sb6.append(',');
        sb6.append(c16279x64cea23.f226124m);
        sb6.append(",[");
        sb6.append(c16279x64cea23.f226119e);
        sb6.append(',');
        sb6.append(c16279x64cea23.f226120f);
        sb6.append("]; user:[");
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 c16279x64cea232 = this.f552189b;
        sb6.append(c16279x64cea232.f226119e);
        sb6.append(',');
        sb6.append(c16279x64cea232.f226120f);
        sb6.append("]; isNearbyPoi:");
        sb6.append(this.f552192e);
        return sb6.toString();
    }
}
