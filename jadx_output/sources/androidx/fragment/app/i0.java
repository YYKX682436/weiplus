package androidx.fragment.app;

/* loaded from: classes14.dex */
public class i0 implements o4.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.FragmentActivity f11342a;

    public i0(androidx.fragment.app.FragmentActivity fragmentActivity) {
        this.f11342a = fragmentActivity;
    }

    @Override // o4.d
    public android.os.Bundle a() {
        android.os.Bundle bundle = new android.os.Bundle();
        androidx.fragment.app.FragmentActivity fragmentActivity = this.f11342a;
        fragmentActivity.markFragmentsCreated();
        fragmentActivity.mFragmentLifecycleRegistry.f(androidx.lifecycle.m.ON_STOP);
        android.os.Parcelable saveAllState = fragmentActivity.mFragments.f11476a.f11496g.saveAllState();
        if (saveAllState != null) {
            bundle.putParcelable("android:support:fragments", saveAllState);
        }
        return bundle;
    }
}
