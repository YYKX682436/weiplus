package om2;

/* loaded from: classes5.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f427925a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f427926b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f427927c;

    /* renamed from: d, reason: collision with root package name */
    public final int f427928d;

    public z(java.lang.String uId, java.lang.String songId, java.lang.String songUid, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uId, "uId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songId, "songId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songUid, "songUid");
        this.f427925a = uId;
        this.f427926b = songId;
        this.f427927c = songUid;
        this.f427928d = i17;
    }

    /* renamed from: equals */
    public boolean m151694xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof om2.z)) {
            return false;
        }
        om2.z zVar = (om2.z) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f427925a, zVar.f427925a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f427926b, zVar.f427926b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f427927c, zVar.f427927c) && this.f427928d == zVar.f427928d;
    }

    /* renamed from: hashCode */
    public int m151695x8cdac1b() {
        return (((((this.f427925a.hashCode() * 31) + this.f427926b.hashCode()) * 31) + this.f427927c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f427928d);
    }

    /* renamed from: toString */
    public java.lang.String m151696x9616526c() {
        return "SEISongData(uId=" + this.f427925a + ", songId=" + this.f427926b + ", songUid=" + this.f427927c + ", os=" + this.f427928d + ')';
    }
}
