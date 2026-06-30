package j91;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f379882a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f379883b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f379884c;

    public e(java.lang.String encrypted_data, java.lang.String iv6, java.lang.String cloud_id) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(encrypted_data, "encrypted_data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iv6, "iv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cloud_id, "cloud_id");
        this.f379882a = encrypted_data;
        this.f379883b = iv6;
        this.f379884c = cloud_id;
    }

    /* renamed from: equals */
    public boolean m140490xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j91.e)) {
            return false;
        }
        j91.e eVar = (j91.e) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f379882a, eVar.f379882a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f379883b, eVar.f379883b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f379884c, eVar.f379884c);
    }

    /* renamed from: hashCode */
    public int m140491x8cdac1b() {
        return (((this.f379882a.hashCode() * 31) + this.f379883b.hashCode()) * 31) + this.f379884c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m140492x9616526c() {
        return "RoomInfoResponse(encrypted_data=" + this.f379882a + ", iv=" + this.f379883b + ", cloud_id=" + this.f379884c + ')';
    }
}
