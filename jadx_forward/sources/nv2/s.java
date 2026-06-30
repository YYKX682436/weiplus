package nv2;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f422110a;

    /* renamed from: b, reason: collision with root package name */
    public final nv2.x f422111b;

    /* renamed from: c, reason: collision with root package name */
    public final nv2.x f422112c;

    /* renamed from: d, reason: collision with root package name */
    public final nv2.x f422113d;

    public s(java.lang.String username, nv2.x followRecorder, nv2.x noSeeAuthorRecorder, nv2.x noSeeFriendRecorder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(followRecorder, "followRecorder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noSeeAuthorRecorder, "noSeeAuthorRecorder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noSeeFriendRecorder, "noSeeFriendRecorder");
        this.f422110a = username;
        this.f422111b = followRecorder;
        this.f422112c = noSeeAuthorRecorder;
        this.f422113d = noSeeFriendRecorder;
    }

    /* renamed from: equals */
    public boolean m150147xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nv2.s)) {
            return false;
        }
        nv2.s sVar = (nv2.s) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f422110a, sVar.f422110a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f422111b, sVar.f422111b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f422112c, sVar.f422112c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f422113d, sVar.f422113d);
    }

    /* renamed from: hashCode */
    public int m150148x8cdac1b() {
        return (((((this.f422110a.hashCode() * 31) + this.f422111b.hashCode()) * 31) + this.f422112c.hashCode()) * 31) + this.f422113d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m150149x9616526c() {
        return "RecorderStore(username=" + this.f422110a + ", followRecorder=" + this.f422111b + ", noSeeAuthorRecorder=" + this.f422112c + ", noSeeFriendRecorder=" + this.f422113d + ')';
    }
}
