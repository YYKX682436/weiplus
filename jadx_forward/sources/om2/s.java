package om2;

/* loaded from: classes10.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final r45.yx1 f427911a;

    /* renamed from: b, reason: collision with root package name */
    public final om2.p f427912b;

    /* renamed from: c, reason: collision with root package name */
    public final om2.q f427913c;

    public s(r45.yx1 songInfo, om2.p baseInfo, om2.q musicResourceInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songInfo, "songInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseInfo, "baseInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicResourceInfo, "musicResourceInfo");
        this.f427911a = songInfo;
        this.f427912b = baseInfo;
        this.f427913c = musicResourceInfo;
    }

    public final java.lang.String a() {
        java.lang.String str = this.f427911a.f472992e;
        return str == null ? "" : str;
    }

    /* renamed from: equals */
    public boolean m151679xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof om2.s)) {
            return false;
        }
        om2.s sVar = (om2.s) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f427911a, sVar.f427911a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f427912b, sVar.f427912b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f427913c, sVar.f427913c);
    }

    /* renamed from: hashCode */
    public int m151680x8cdac1b() {
        return (((this.f427911a.hashCode() * 31) + this.f427912b.m151671x8cdac1b()) * 31) + this.f427913c.m151674x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m151681x9616526c() {
        return "LiveSongPlayResourceInfo(songInfo=" + this.f427911a + ", baseInfo=" + this.f427912b + ", musicResourceInfo=" + this.f427913c + ')';
    }
}
