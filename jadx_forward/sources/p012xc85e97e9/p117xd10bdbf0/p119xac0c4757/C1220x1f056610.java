package p012xc85e97e9.p117xd10bdbf0.p119xac0c4757;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001BY\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\nH\u0016J\u0016\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0004H\u0080\u0002¢\u0006\u0002\b\u001cR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011¨\u0006\u001d"}, d2 = {"Landroidx/window/embedding/SplitPairRule;", "Landroidx/window/embedding/SplitRule;", "filters", "", "Landroidx/window/embedding/SplitPairFilter;", "finishPrimaryWithSecondary", "", "finishSecondaryWithPrimary", "clearTop", "minWidth", "", "minSmallestWidth", "splitRatio", "", "layoutDir", "(Ljava/util/Set;ZZZIIFI)V", "getClearTop", "()Z", "getFilters", "()Ljava/util/Set;", "getFinishPrimaryWithSecondary", "getFinishSecondaryWithPrimary", "equals", "other", "", "hashCode", "plus", "filter", "plus$window_release", "window_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: androidx.window.embedding.SplitPairRule */
/* loaded from: classes14.dex */
public final class C1220x1f056610 extends p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1222x8f8b2916 {
    private final boolean clearTop;
    private final java.util.Set<p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1219x5e21258c> filters;
    private final boolean finishPrimaryWithSecondary;
    private final boolean finishSecondaryWithPrimary;

    public /* synthetic */ C1220x1f056610(java.util.Set set, boolean z17, boolean z18, boolean z19, int i17, int i18, float f17, int i19, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(set, (i27 & 2) != 0 ? false : z17, (i27 & 4) != 0 ? true : z18, (i27 & 8) != 0 ? false : z19, (i27 & 16) != 0 ? 0 : i17, (i27 & 32) == 0 ? i18 : 0, (i27 & 64) != 0 ? 0.5f : f17, (i27 & 128) != 0 ? 3 : i19);
    }

    @Override // p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1222x8f8b2916
    /* renamed from: equals */
    public boolean mo8489xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1220x1f056610) || !super.mo8489xb2c87fbf(other)) {
            return false;
        }
        p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1220x1f056610 c1220x1f056610 = (p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1220x1f056610) other;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.filters, c1220x1f056610.filters) && this.finishPrimaryWithSecondary == c1220x1f056610.finishPrimaryWithSecondary && this.finishSecondaryWithPrimary == c1220x1f056610.finishSecondaryWithPrimary && this.clearTop == c1220x1f056610.clearTop;
    }

    public final boolean getClearTop() {
        return this.clearTop;
    }

    /* renamed from: getFilters */
    public final java.util.Set<p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1219x5e21258c> m8491xadddfc5() {
        return this.filters;
    }

    public final boolean getFinishPrimaryWithSecondary() {
        return this.finishPrimaryWithSecondary;
    }

    public final boolean getFinishSecondaryWithPrimary() {
        return this.finishSecondaryWithPrimary;
    }

    @Override // p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1222x8f8b2916
    /* renamed from: hashCode */
    public int mo8494x8cdac1b() {
        return (((((((super.mo8494x8cdac1b() * 31) + this.filters.hashCode()) * 31) + java.lang.Boolean.hashCode(this.finishPrimaryWithSecondary)) * 31) + java.lang.Boolean.hashCode(this.finishSecondaryWithPrimary)) * 31) + java.lang.Boolean.hashCode(this.clearTop);
    }

    /* renamed from: plus$window_release */
    public final p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1220x1f056610 m8495xabd3f702(p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1219x5e21258c filter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filter, "filter");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(filter);
        return new p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1220x1f056610(kz5.n0.X0(linkedHashSet), this.finishPrimaryWithSecondary, this.finishSecondaryWithPrimary, this.clearTop, getMinWidth(), getMinSmallestWidth(), getSplitRatio(), getLayoutDirection());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1220x1f056610(java.util.Set<p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1219x5e21258c> filters, boolean z17, boolean z18, boolean z19, int i17, int i18, float f17, int i19) {
        super(i17, i18, f17, i19);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filters, "filters");
        this.finishPrimaryWithSecondary = z17;
        this.finishSecondaryWithPrimary = z18;
        this.clearTop = z19;
        this.filters = kz5.n0.X0(filters);
    }
}
