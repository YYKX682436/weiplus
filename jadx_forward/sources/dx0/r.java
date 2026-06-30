package dx0;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 f326006a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 f326007b;

    public r(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 timeRange) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timeRange, "timeRange");
        this.f326006a = segmentID;
        this.f326007b = timeRange;
    }

    /* renamed from: equals */
    public boolean m126411xb2c87fbf(java.lang.Object obj) {
        if (obj == null || !(obj instanceof dx0.r)) {
            return false;
        }
        dx0.r rVar = (dx0.r) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f326006a.m32425x6ac9171(), rVar.f326006a.m32425x6ac9171()) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dx0.o.c(this.f326007b), dx0.o.c(rVar.f326007b));
    }

    /* renamed from: hashCode */
    public int m126412x8cdac1b() {
        return java.util.Objects.hash(this.f326006a.m32425x6ac9171(), dx0.o.c(this.f326007b));
    }
}
