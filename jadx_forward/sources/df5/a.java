package df5;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f313572a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f313573b;

    public a(android.view.View view, java.util.List feedItems) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedItems, "feedItems");
        this.f313572a = view;
        this.f313573b = feedItems;
    }

    /* renamed from: equals */
    public boolean m124304xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df5.a)) {
            return false;
        }
        df5.a aVar = (df5.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f313572a, aVar.f313572a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f313573b, aVar.f313573b);
    }

    /* renamed from: hashCode */
    public int m124305x8cdac1b() {
        return (this.f313572a.hashCode() * 31) + this.f313573b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m124306x9616526c() {
        return "AppendFeedPair(view=" + this.f313572a + ", feedItems=" + this.f313573b + ')';
    }
}
