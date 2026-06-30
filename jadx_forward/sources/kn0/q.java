package kn0;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f391126a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f391127b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f391128c;

    public q(java.lang.String sdkUserId, java.lang.String roomId, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sdkUserId, "sdkUserId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roomId, "roomId");
        this.f391126a = sdkUserId;
        this.f391127b = roomId;
        this.f391128c = z17;
    }

    /* renamed from: equals */
    public boolean m143767xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn0.q)) {
            return false;
        }
        kn0.q qVar = (kn0.q) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f391126a, qVar.f391126a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f391127b, qVar.f391127b) && this.f391128c == qVar.f391128c;
    }

    /* renamed from: hashCode */
    public int m143768x8cdac1b() {
        return (((this.f391126a.hashCode() * 31) + this.f391127b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f391128c);
    }

    /* renamed from: toString */
    public java.lang.String m143769x9616526c() {
        return "LiveTRTCRoomInfo(sdkUserId=" + this.f391126a + ", roomId=" + this.f391127b + ", isAnchor=" + this.f391128c + ')';
    }
}
