package yu0;

/* loaded from: classes5.dex */
public final class b implements yu0.s {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4195xcab2df48 f547311a;

    /* renamed from: b, reason: collision with root package name */
    public final long f547312b;

    /* renamed from: c, reason: collision with root package name */
    public final float f547313c;

    public b(com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4195xcab2df48 c4195xcab2df48, long j17, float f17) {
        this.f547311a = c4195xcab2df48;
        this.f547312b = j17;
        this.f547313c = f17;
    }

    /* renamed from: equals */
    public boolean m177658xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu0.b)) {
            return false;
        }
        yu0.b bVar = (yu0.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f547311a, bVar.f547311a) && this.f547312b == bVar.f547312b && java.lang.Float.compare(this.f547313c, bVar.f547313c) == 0;
    }

    /* renamed from: hashCode */
    public int m177659x8cdac1b() {
        com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4195xcab2df48 c4195xcab2df48 = this.f547311a;
        return ((((c4195xcab2df48 == null ? 0 : c4195xcab2df48.hashCode()) * 31) + java.lang.Long.hashCode(this.f547312b)) * 31) + java.lang.Float.hashCode(this.f547313c);
    }

    /* renamed from: toString */
    public java.lang.String m177660x9616526c() {
        return "ASRPartTaskResponse(response=" + this.f547311a + ", timeOffsetMs=" + this.f547312b + ", speed=" + this.f547313c + ')';
    }
}
