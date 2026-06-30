package zy2;

/* loaded from: classes8.dex */
public final class a5 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f558880a;

    /* renamed from: b, reason: collision with root package name */
    public final long f558881b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f558882c;

    public a5(java.lang.Object feed, long j17, java.util.List searchableFields) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(searchableFields, "searchableFields");
        this.f558880a = feed;
        this.f558881b = j17;
        this.f558882c = searchableFields;
    }

    /* renamed from: equals */
    public boolean m179924xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy2.a5)) {
            return false;
        }
        zy2.a5 a5Var = (zy2.a5) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f558880a, a5Var.f558880a) && this.f558881b == a5Var.f558881b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f558882c, a5Var.f558882c);
    }

    /* renamed from: hashCode */
    public int m179925x8cdac1b() {
        return (((this.f558880a.hashCode() * 31) + java.lang.Long.hashCode(this.f558881b)) * 31) + this.f558882c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m179926x9616526c() {
        return "FinderMsgHistoryGalleryFeedSnapshot(feed=" + this.f558880a + ", itemId=" + this.f558881b + ", searchableFields=" + this.f558882c + ')';
    }
}
