package androidx.fragment.app;

/* loaded from: classes14.dex */
public class y extends androidx.fragment.app.s0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.Fragment f11513d;

    public y(androidx.fragment.app.Fragment fragment) {
        this.f11513d = fragment;
    }

    @Override // androidx.fragment.app.s0
    public android.view.View b(int i17) {
        androidx.fragment.app.Fragment fragment = this.f11513d;
        android.view.View view = fragment.mView;
        if (view != null) {
            return view.findViewById(i17);
        }
        throw new java.lang.IllegalStateException("Fragment " + fragment + " does not have a view");
    }

    @Override // androidx.fragment.app.s0
    public boolean c() {
        return this.f11513d.mView != null;
    }
}
