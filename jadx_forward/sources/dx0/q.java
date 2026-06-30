package dx0;

/* loaded from: classes5.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p479x4179489f.m0 f326002a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 f326003b;

    /* renamed from: c, reason: collision with root package name */
    public dx0.p f326004c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f326005d;

    public q(com.p314xaae8f345.p457x3304c6.p479x4179489f.m0 m0Var, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 timeRange, dx0.p pVar, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timeRange, "timeRange");
        this.f326002a = m0Var;
        this.f326003b = timeRange;
        this.f326004c = pVar;
        this.f326005d = c4128x879fba0a;
    }

    /* renamed from: equals */
    public boolean m126408xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dx0.q)) {
            return false;
        }
        dx0.q qVar = (dx0.q) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f326002a, qVar.f326002a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f326003b, qVar.f326003b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f326004c, qVar.f326004c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f326005d, qVar.f326005d);
    }

    /* renamed from: hashCode */
    public int m126409x8cdac1b() {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.m0 m0Var = this.f326002a;
        int m34363x8cdac1b = (((m0Var == null ? 0 : m0Var.m34363x8cdac1b()) * 31) + this.f326003b.hashCode()) * 31;
        dx0.p pVar = this.f326004c;
        int m126406x8cdac1b = (m34363x8cdac1b + (pVar == null ? 0 : pVar.m126406x8cdac1b())) * 31;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = this.f326005d;
        return m126406x8cdac1b + (c4128x879fba0a != null ? c4128x879fba0a.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m126410x9616526c() {
        return "ThumbnailData(taskID=" + this.f326002a + ", timeRange=" + this.f326003b + ", thumbnailInfo=" + this.f326004c + ", timeStamp=" + this.f326005d + ')';
    }
}
