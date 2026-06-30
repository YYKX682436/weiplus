package dd5;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final zy2.b5 f310614a;

    public a(zy2.b5 views) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(views, "views");
        this.f310614a = views;
    }

    /* renamed from: equals */
    public boolean m123994xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dd5.a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310614a, ((dd5.a) obj).f310614a);
    }

    /* renamed from: hashCode */
    public int m123995x8cdac1b() {
        return this.f310614a.m179928x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m123996x9616526c() {
        return "FinderFeedGalleryBinding(views=" + this.f310614a + ')';
    }
}
