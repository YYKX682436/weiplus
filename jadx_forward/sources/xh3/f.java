package xh3;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f536109a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f536110b;

    public f(java.lang.String mediaId, java.lang.String tag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        this.f536109a = mediaId;
        this.f536110b = tag;
    }

    /* renamed from: equals */
    public boolean m175560xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xh3.f)) {
            return false;
        }
        xh3.f fVar = (xh3.f) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f536109a, fVar.f536109a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f536110b, fVar.f536110b);
    }

    /* renamed from: hashCode */
    public int m175561x8cdac1b() {
        return (this.f536109a.hashCode() * 31) + this.f536110b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m175562x9616526c() {
        return "RecordTask(mediaId=" + this.f536109a + ", tag=" + this.f536110b + ')';
    }
}
