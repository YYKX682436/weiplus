package df5;

/* loaded from: classes5.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f313718a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f313719b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f313720c;

    public p1(java.util.List appendedViews, java.util.List queueItems, java.util.List appendFeedPairs) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appendedViews, "appendedViews");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(queueItems, "queueItems");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appendFeedPairs, "appendFeedPairs");
        this.f313718a = appendedViews;
        this.f313719b = queueItems;
        this.f313720c = appendFeedPairs;
    }

    /* renamed from: equals */
    public boolean m124355xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df5.p1)) {
            return false;
        }
        df5.p1 p1Var = (df5.p1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f313718a, p1Var.f313718a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f313719b, p1Var.f313719b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f313720c, p1Var.f313720c);
    }

    /* renamed from: hashCode */
    public int m124356x8cdac1b() {
        return (((this.f313718a.hashCode() * 31) + this.f313719b.hashCode()) * 31) + this.f313720c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m124357x9616526c() {
        return "StreamDiffResult(appendedViews=" + this.f313718a + ", queueItems=" + this.f313719b + ", appendFeedPairs=" + this.f313720c + ')';
    }
}
