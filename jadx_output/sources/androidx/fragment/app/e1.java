package androidx.fragment.app;

/* loaded from: classes14.dex */
public class e1 extends androidx.fragment.app.u0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.FragmentManager f11309b;

    public e1(androidx.fragment.app.FragmentManager fragmentManager) {
        this.f11309b = fragmentManager;
    }

    @Override // androidx.fragment.app.u0
    public androidx.fragment.app.Fragment a(java.lang.ClassLoader classLoader, java.lang.String str) {
        androidx.fragment.app.FragmentManager fragmentManager = this.f11309b;
        androidx.fragment.app.v0 host = fragmentManager.getHost();
        android.content.Context context = fragmentManager.getHost().f11494e;
        host.getClass();
        return androidx.fragment.app.Fragment.instantiate(context, str, null);
    }
}
