package mh2;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f407831a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f407832b;

    public b(java.lang.String uniqueId, java.lang.String coverUrl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uniqueId, "uniqueId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coverUrl, "coverUrl");
        this.f407831a = uniqueId;
        this.f407832b = coverUrl;
    }

    /* renamed from: equals */
    public boolean m147298xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mh2.b)) {
            return false;
        }
        mh2.b bVar = (mh2.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f407831a, bVar.f407831a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f407832b, bVar.f407832b);
    }

    /* renamed from: hashCode */
    public int m147299x8cdac1b() {
        return (this.f407831a.hashCode() * 31) + this.f407832b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m147300x9616526c() {
        return "CachedSongCover(uniqueId=" + this.f407831a + ", coverUrl=" + this.f407832b + ')';
    }
}
