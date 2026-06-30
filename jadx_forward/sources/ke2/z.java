package ke2;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final long f388535a;

    /* renamed from: b, reason: collision with root package name */
    public final long f388536b;

    /* renamed from: c, reason: collision with root package name */
    public final int f388537c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f388538d;

    public z(long j17, long j18, int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f388535a = j17;
        this.f388536b = j18;
        this.f388537c = i17;
        this.f388538d = gVar;
    }

    /* renamed from: equals */
    public boolean m142534xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ke2.z)) {
            return false;
        }
        ke2.z zVar = (ke2.z) obj;
        return this.f388535a == zVar.f388535a && this.f388536b == zVar.f388536b && this.f388537c == zVar.f388537c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f388538d, zVar.f388538d);
    }

    /* renamed from: hashCode */
    public int m142535x8cdac1b() {
        int hashCode = ((((java.lang.Long.hashCode(this.f388535a) * 31) + java.lang.Long.hashCode(this.f388536b)) * 31) + java.lang.Integer.hashCode(this.f388537c)) * 31;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f388538d;
        return hashCode + (gVar == null ? 0 : gVar.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m142536x9616526c() {
        return "FinderLiveModPromoteInfoReq(objectId=" + this.f388535a + ", liveId=" + this.f388536b + ", optType=" + this.f388537c + ", op_cmd_req_buf=" + this.f388538d + ')';
    }
}
