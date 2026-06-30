package qd5;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f443435a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f443436b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.l f443437c;

    public b(java.lang.String groupId, java.lang.String uniqueId, jz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupId, "groupId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uniqueId, "uniqueId");
        this.f443435a = groupId;
        this.f443436b = uniqueId;
        this.f443437c = lVar;
    }

    /* renamed from: equals */
    public boolean m159892xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd5.b)) {
            return false;
        }
        qd5.b bVar = (qd5.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f443435a, bVar.f443435a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f443436b, bVar.f443436b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f443437c, bVar.f443437c);
    }

    /* renamed from: hashCode */
    public int m159893x8cdac1b() {
        int hashCode = ((this.f443435a.hashCode() * 31) + this.f443436b.hashCode()) * 31;
        jz5.l lVar = this.f443437c;
        return hashCode + (lVar == null ? 0 : lVar.m141638x8cdac1b());
    }

    /* renamed from: toString */
    public java.lang.String m159894x9616526c() {
        return "UIData(groupId=" + this.f443435a + ", uniqueId=" + this.f443436b + ", targetView=" + this.f443437c + ')';
    }
}
