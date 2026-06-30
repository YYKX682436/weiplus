package p012xc85e97e9.p117xd10bdbf0.p119xac0c4757;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001BC\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0002\u0010\rJ\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\bH\u0016J\u0016\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0004H\u0080\u0002¢\u0006\u0002\b\u0019R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, d2 = {"Landroidx/window/embedding/SplitPlaceholderRule;", "Landroidx/window/embedding/SplitRule;", "filters", "", "Landroidx/window/embedding/ActivityFilter;", "placeholderIntent", "Landroid/content/Intent;", "minWidth", "", "minSmallestWidth", "splitRatio", "", "layoutDirection", "(Ljava/util/Set;Landroid/content/Intent;IIFI)V", "getFilters", "()Ljava/util/Set;", "getPlaceholderIntent", "()Landroid/content/Intent;", "equals", "", "other", "", "hashCode", "plus", "filter", "plus$window_release", "window_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: androidx.window.embedding.SplitPlaceholderRule */
/* loaded from: classes14.dex */
public final class C1221x7a3f98b5 extends p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1222x8f8b2916 {
    private final java.util.Set<p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1199x1e7baf87> filters;
    private final android.content.Intent placeholderIntent;

    public /* synthetic */ C1221x7a3f98b5(java.util.Set set, android.content.Intent intent, int i17, int i18, float f17, int i19, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(set, intent, (i27 & 4) != 0 ? 0 : i17, (i27 & 8) != 0 ? 0 : i18, (i27 & 16) != 0 ? 0.5f : f17, (i27 & 32) != 0 ? 3 : i19);
    }

    @Override // p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1222x8f8b2916
    /* renamed from: equals */
    public boolean mo8489xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1221x7a3f98b5) || !super.mo8489xb2c87fbf(other) || !super.mo8489xb2c87fbf(other)) {
            return false;
        }
        p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1221x7a3f98b5 c1221x7a3f98b5 = (p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1221x7a3f98b5) other;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.filters, c1221x7a3f98b5.filters) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.placeholderIntent, c1221x7a3f98b5.placeholderIntent);
    }

    /* renamed from: getFilters */
    public final java.util.Set<p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1199x1e7baf87> m8496xadddfc5() {
        return this.filters;
    }

    public final android.content.Intent getPlaceholderIntent() {
        return this.placeholderIntent;
    }

    @Override // p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1222x8f8b2916
    /* renamed from: hashCode */
    public int mo8494x8cdac1b() {
        return (((super.mo8494x8cdac1b() * 31) + this.filters.hashCode()) * 31) + this.placeholderIntent.hashCode();
    }

    /* renamed from: plus$window_release */
    public final p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1221x7a3f98b5 m8498xabd3f702(p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1199x1e7baf87 filter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filter, "filter");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(filter);
        return new p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1221x7a3f98b5(kz5.n0.X0(linkedHashSet), this.placeholderIntent, getMinWidth(), getMinSmallestWidth(), getSplitRatio(), getLayoutDirection());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1221x7a3f98b5(java.util.Set<p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1199x1e7baf87> filters, android.content.Intent placeholderIntent, int i17, int i18, float f17, int i19) {
        super(i17, i18, f17, i19);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filters, "filters");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(placeholderIntent, "placeholderIntent");
        this.placeholderIntent = placeholderIntent;
        this.filters = kz5.n0.X0(filters);
    }
}
