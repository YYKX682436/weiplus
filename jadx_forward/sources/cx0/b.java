package cx0;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 f306029a;

    /* renamed from: b, reason: collision with root package name */
    public final ug.m f306030b;

    /* renamed from: c, reason: collision with root package name */
    public final int f306031c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f306032d;

    public b(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID, ug.m segmentType, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentType, "segmentType");
        this.f306029a = segmentID;
        this.f306030b = segmentType;
        this.f306031c = i17;
        this.f306032d = z17;
    }

    /* renamed from: equals */
    public boolean m123060xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cx0.b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.mj_publisher.finder.movie_composing.timeline.mutation.TimelineMutationEntry");
        cx0.b bVar = (cx0.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f306029a, bVar.f306029a) && this.f306030b == bVar.f306030b && this.f306031c == bVar.f306031c && this.f306032d == bVar.f306032d;
    }

    /* renamed from: hashCode */
    public int m123061x8cdac1b() {
        return this.f306029a.m32423x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m123062x9616526c() {
        return "TimelineMutationEntry(segmentID=" + this.f306029a + ", segmentType=" + this.f306030b + ", indexPath=" + this.f306031c + ", isVisualClipChanged=" + this.f306032d + ')';
    }
}
