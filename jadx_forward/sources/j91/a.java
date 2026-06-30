package j91;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f379876a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f379877b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f379878c;

    /* renamed from: d, reason: collision with root package name */
    public final int f379879d;

    public a(java.lang.String userName, java.lang.String openGid, java.lang.String openSingleRoomId, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        userName = (i18 & 1) != 0 ? "" : userName;
        openGid = (i18 & 2) != 0 ? "" : openGid;
        openSingleRoomId = (i18 & 4) != 0 ? "" : openSingleRoomId;
        i17 = (i18 & 8) != 0 ? -1 : i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openGid, "openGid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openSingleRoomId, "openSingleRoomId");
        this.f379876a = userName;
        this.f379877b = openGid;
        this.f379878c = openSingleRoomId;
        this.f379879d = i17;
    }

    /* renamed from: equals */
    public boolean m140484xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j91.a)) {
            return false;
        }
        j91.a aVar = (j91.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f379876a, aVar.f379876a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f379877b, aVar.f379877b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f379878c, aVar.f379878c) && this.f379879d == aVar.f379879d;
    }

    /* renamed from: hashCode */
    public int m140485x8cdac1b() {
        return (((((this.f379876a.hashCode() * 31) + this.f379877b.hashCode()) * 31) + this.f379878c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f379879d);
    }

    /* renamed from: toString */
    public java.lang.String m140486x9616526c() {
        return "ChatToolAllPageRoom(userName=" + this.f379876a + ", openGid=" + this.f379877b + ", openSingleRoomId=" + this.f379878c + ", chatType=" + this.f379879d + ')';
    }
}
