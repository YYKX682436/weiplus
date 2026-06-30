package androidx.window.embedding;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0016\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0004H\u0080\u0002¢\u0006\u0002\b\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Landroidx/window/embedding/ActivityRule;", "Landroidx/window/embedding/EmbeddingRule;", "filters", "", "Landroidx/window/embedding/ActivityFilter;", "alwaysExpand", "", "(Ljava/util/Set;Z)V", "getAlwaysExpand", "()Z", "getFilters", "()Ljava/util/Set;", "equals", "other", "", "hashCode", "", "plus", "filter", "plus$window_release", "window_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes14.dex */
public final class ActivityRule extends androidx.window.embedding.EmbeddingRule {
    private final boolean alwaysExpand;
    private final java.util.Set<androidx.window.embedding.ActivityFilter> filters;

    public /* synthetic */ ActivityRule(java.util.Set set, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        this(set, (i17 & 2) != 0 ? false : z17);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.window.embedding.ActivityRule)) {
            return false;
        }
        androidx.window.embedding.ActivityRule activityRule = (androidx.window.embedding.ActivityRule) other;
        return kotlin.jvm.internal.o.b(this.filters, activityRule.filters) && this.alwaysExpand == activityRule.alwaysExpand;
    }

    public final boolean getAlwaysExpand() {
        return this.alwaysExpand;
    }

    public final java.util.Set<androidx.window.embedding.ActivityFilter> getFilters() {
        return this.filters;
    }

    public int hashCode() {
        return (this.filters.hashCode() * 31) + java.lang.Boolean.hashCode(this.alwaysExpand);
    }

    public final androidx.window.embedding.ActivityRule plus$window_release(androidx.window.embedding.ActivityFilter filter) {
        kotlin.jvm.internal.o.g(filter, "filter");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(filter);
        return new androidx.window.embedding.ActivityRule(kz5.n0.X0(linkedHashSet), this.alwaysExpand);
    }

    public ActivityRule(java.util.Set<androidx.window.embedding.ActivityFilter> filters, boolean z17) {
        kotlin.jvm.internal.o.g(filters, "filters");
        this.alwaysExpand = z17;
        this.filters = kz5.n0.X0(filters);
    }
}
