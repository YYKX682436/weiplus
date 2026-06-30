package wa5;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f525842a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f525843b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f525844c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f525845d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f525846e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f525847f;

    public b(boolean z17, boolean z18, java.util.List exitTransitionCoordinator, java.lang.ref.WeakReference weakReference, java.util.List animHelperViews, boolean z19, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i17 & 1) != 0 ? false : z17;
        z18 = (i17 & 2) != 0 ? false : z18;
        exitTransitionCoordinator = (i17 & 4) != 0 ? new java.util.ArrayList() : exitTransitionCoordinator;
        weakReference = (i17 & 8) != 0 ? null : weakReference;
        animHelperViews = (i17 & 16) != 0 ? new java.util.ArrayList() : animHelperViews;
        z19 = (i17 & 32) != 0 ? false : z19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exitTransitionCoordinator, "exitTransitionCoordinator");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animHelperViews, "animHelperViews");
        this.f525842a = z17;
        this.f525843b = z18;
        this.f525844c = exitTransitionCoordinator;
        this.f525845d = weakReference;
        this.f525846e = animHelperViews;
        this.f525847f = z19;
    }

    /* renamed from: equals */
    public boolean m173423xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa5.b)) {
            return false;
        }
        wa5.b bVar = (wa5.b) obj;
        return this.f525842a == bVar.f525842a && this.f525843b == bVar.f525843b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f525844c, bVar.f525844c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f525845d, bVar.f525845d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f525846e, bVar.f525846e) && this.f525847f == bVar.f525847f;
    }

    /* renamed from: hashCode */
    public int m173424x8cdac1b() {
        int hashCode = ((((java.lang.Boolean.hashCode(this.f525842a) * 31) + java.lang.Boolean.hashCode(this.f525843b)) * 31) + this.f525844c.hashCode()) * 31;
        java.lang.ref.WeakReference weakReference = this.f525845d;
        return ((((hashCode + (weakReference == null ? 0 : weakReference.hashCode())) * 31) + this.f525846e.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f525847f);
    }

    /* renamed from: toString */
    public java.lang.String m173425x9616526c() {
        return "ActivityTransitionState(hasSetObserver=" + this.f525842a + ", isCreateByTransition=" + this.f525843b + ", exitTransitionCoordinator=" + this.f525844c + ", exitSharedElementCallback=" + this.f525845d + ", animHelperViews=" + this.f525846e + ", hasEndTransition=" + this.f525847f + ')';
    }
}
