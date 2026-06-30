package androidx.fragment.app;

/* loaded from: classes14.dex */
public class z implements r.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.Fragment f11525a;

    public z(androidx.fragment.app.Fragment fragment) {
        this.f11525a = fragment;
    }

    @Override // r.a
    public java.lang.Object apply(java.lang.Object obj) {
        androidx.fragment.app.Fragment fragment = this.f11525a;
        java.lang.Object obj2 = fragment.mHost;
        return obj2 instanceof androidx.activity.result.i ? ((androidx.activity.result.i) obj2).getActivityResultRegistry() : fragment.requireActivity().getActivityResultRegistry();
    }
}
