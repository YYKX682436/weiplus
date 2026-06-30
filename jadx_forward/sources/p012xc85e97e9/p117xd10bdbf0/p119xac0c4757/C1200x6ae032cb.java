package p012xc85e97e9.p117xd10bdbf0.p119xac0c4757;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0016\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0004H\u0080\u0002¢\u0006\u0002\b\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Landroidx/window/embedding/ActivityRule;", "Landroidx/window/embedding/EmbeddingRule;", "filters", "", "Landroidx/window/embedding/ActivityFilter;", "alwaysExpand", "", "(Ljava/util/Set;Z)V", "getAlwaysExpand", "()Z", "getFilters", "()Ljava/util/Set;", "equals", "other", "", "hashCode", "", "plus", "filter", "plus$window_release", "window_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: androidx.window.embedding.ActivityRule */
/* loaded from: classes14.dex */
public final class C1200x6ae032cb extends p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.AbstractC1211xe320fed3 {
    private final boolean alwaysExpand;
    private final java.util.Set<p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1199x1e7baf87> filters;

    public /* synthetic */ C1200x6ae032cb(java.util.Set set, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(set, (i17 & 2) != 0 ? false : z17);
    }

    /* renamed from: equals */
    public boolean m8395xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1200x6ae032cb)) {
            return false;
        }
        p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1200x6ae032cb c1200x6ae032cb = (p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1200x6ae032cb) other;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.filters, c1200x6ae032cb.filters) && this.alwaysExpand == c1200x6ae032cb.alwaysExpand;
    }

    public final boolean getAlwaysExpand() {
        return this.alwaysExpand;
    }

    /* renamed from: getFilters */
    public final java.util.Set<p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1199x1e7baf87> m8397xadddfc5() {
        return this.filters;
    }

    /* renamed from: hashCode */
    public int m8398x8cdac1b() {
        return (this.filters.hashCode() * 31) + java.lang.Boolean.hashCode(this.alwaysExpand);
    }

    /* renamed from: plus$window_release */
    public final p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1200x6ae032cb m8399xabd3f702(p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1199x1e7baf87 filter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filter, "filter");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(filter);
        return new p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1200x6ae032cb(kz5.n0.X0(linkedHashSet), this.alwaysExpand);
    }

    public C1200x6ae032cb(java.util.Set<p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1199x1e7baf87> filters, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filters, "filters");
        this.alwaysExpand = z17;
        this.filters = kz5.n0.X0(filters);
    }
}
