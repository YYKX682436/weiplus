package sv0;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 f494756a;

    /* renamed from: b, reason: collision with root package name */
    public final long f494757b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f494758c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f494759d;

    public h(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID, long j17, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        this.f494756a = segmentID;
        this.f494757b = j17;
        this.f494758c = z17;
        this.f494759d = z18;
    }

    public static sv0.h a(sv0.h hVar, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID, long j17, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            segmentID = hVar.f494756a;
        }
        if ((i17 & 2) != 0) {
            j17 = hVar.f494757b;
        }
        long j18 = j17;
        if ((i17 & 4) != 0) {
            z17 = hVar.f494758c;
        }
        boolean z19 = z17;
        if ((i17 & 8) != 0) {
            z18 = hVar.f494759d;
        }
        hVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        return new sv0.h(segmentID, j18, z19, z18);
    }

    /* renamed from: equals */
    public boolean m165371xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sv0.h)) {
            return false;
        }
        sv0.h hVar = (sv0.h) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f494756a, hVar.f494756a) && this.f494757b == hVar.f494757b && this.f494758c == hVar.f494758c && this.f494759d == hVar.f494759d;
    }

    /* renamed from: hashCode */
    public int m165372x8cdac1b() {
        return (((((this.f494756a.m32423x8cdac1b() * 31) + java.lang.Long.hashCode(this.f494757b)) * 31) + java.lang.Boolean.hashCode(this.f494758c)) * 31) + java.lang.Boolean.hashCode(this.f494759d);
    }

    /* renamed from: toString */
    public java.lang.String m165373x9616526c() {
        return "SimpleSegmentInfo(segmentID=" + this.f494756a + ", durationInMs=" + this.f494757b + ", isImage=" + this.f494758c + ", selected=" + this.f494759d + ')';
    }
}
