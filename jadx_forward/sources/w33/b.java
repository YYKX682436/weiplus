package w33;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f524238a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.l f524239b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.l f524240c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.l f524241d;

    public b(java.util.List atAllList, jz5.l recentlyMentioned, jz5.l admins, jz5.l members) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(atAllList, "atAllList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recentlyMentioned, "recentlyMentioned");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(admins, "admins");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(members, "members");
        this.f524238a = atAllList;
        this.f524239b = recentlyMentioned;
        this.f524240c = admins;
        this.f524241d = members;
    }

    public static w33.b a(w33.b bVar, java.util.List atAllList, jz5.l recentlyMentioned, jz5.l admins, jz5.l members, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            atAllList = bVar.f524238a;
        }
        if ((i17 & 2) != 0) {
            recentlyMentioned = bVar.f524239b;
        }
        if ((i17 & 4) != 0) {
            admins = bVar.f524240c;
        }
        if ((i17 & 8) != 0) {
            members = bVar.f524241d;
        }
        bVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(atAllList, "atAllList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recentlyMentioned, "recentlyMentioned");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(admins, "admins");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(members, "members");
        return new w33.b(atAllList, recentlyMentioned, admins, members);
    }

    /* renamed from: equals */
    public boolean m173184xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w33.b)) {
            return false;
        }
        w33.b bVar = (w33.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f524238a, bVar.f524238a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f524239b, bVar.f524239b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f524240c, bVar.f524240c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f524241d, bVar.f524241d);
    }

    /* renamed from: hashCode */
    public int m173185x8cdac1b() {
        return (((((this.f524238a.hashCode() * 31) + this.f524239b.m141638x8cdac1b()) * 31) + this.f524240c.m141638x8cdac1b()) * 31) + this.f524241d.m141638x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m173186x9616526c() {
        return "MentionUserResultWrapper(atAllList=" + this.f524238a + ", recentlyMentioned=" + this.f524239b + ", admins=" + this.f524240c + ", members=" + this.f524241d + ')';
    }
}
