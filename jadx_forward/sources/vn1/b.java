package vn1;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f519729a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f519730b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f519731c;

    public b(java.lang.String deviceId, byte[] data, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceId, "deviceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f519729a = deviceId;
        this.f519730b = data;
        this.f519731c = z17;
    }

    /* renamed from: equals */
    public boolean m172325xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vn1.b)) {
            return false;
        }
        vn1.b bVar = (vn1.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f519729a, bVar.f519729a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f519730b, bVar.f519730b) && this.f519731c == bVar.f519731c;
    }

    /* renamed from: hashCode */
    public int m172326x8cdac1b() {
        return (((this.f519729a.hashCode() * 31) + java.util.Arrays.hashCode(this.f519730b)) * 31) + java.lang.Boolean.hashCode(this.f519731c);
    }

    /* renamed from: toString */
    public java.lang.String m172327x9616526c() {
        return "SendPacket(deviceId=" + this.f519729a + ", data=" + java.util.Arrays.toString(this.f519730b) + ", isLast=" + this.f519731c + ')';
    }
}
