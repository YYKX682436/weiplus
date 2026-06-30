package dz0;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f326418a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f326419b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f326420c;

    public j(java.lang.String segmentId, java.lang.String localPath, int[] timeMsRangeOfSegment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentId, "segmentId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localPath, "localPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timeMsRangeOfSegment, "timeMsRangeOfSegment");
        this.f326418a = segmentId;
        this.f326419b = localPath;
        this.f326420c = timeMsRangeOfSegment;
    }

    /* renamed from: equals */
    public boolean m126474xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz0.j)) {
            return false;
        }
        dz0.j jVar = (dz0.j) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f326418a, jVar.f326418a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f326419b, jVar.f326419b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f326420c, jVar.f326420c);
    }

    /* renamed from: hashCode */
    public int m126475x8cdac1b() {
        return (((this.f326418a.hashCode() * 31) + this.f326419b.hashCode()) * 31) + java.util.Arrays.hashCode(this.f326420c);
    }

    /* renamed from: toString */
    public java.lang.String m126476x9616526c() {
        return "SegmentItemDataJumpSecondCutApp(segmentId=" + this.f326418a + ", localPath=" + this.f326419b + ", timeMsRangeOfSegment=" + java.util.Arrays.toString(this.f326420c) + ')';
    }
}
