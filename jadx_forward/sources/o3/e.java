package o3;

/* loaded from: classes14.dex */
public final class e implements android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final o3.d f424155d;

    public e(o3.d dVar) {
        this.f424155d = dVar;
    }

    /* renamed from: equals */
    public boolean m150525xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o3.e) {
            return this.f424155d.equals(((o3.e) obj).f424155d);
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m150526x8cdac1b() {
        return this.f424155d.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public void onTouchExplorationStateChanged(boolean z17) {
        this.f424155d.mo42751x8dbeb5e6(z17);
    }
}
