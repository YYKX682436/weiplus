package androidx.fragment.app;

/* loaded from: classes14.dex */
public class r1 implements androidx.fragment.app.q1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f11463a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11464b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11465c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.FragmentManager f11466d;

    public r1(androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, int i17, int i18) {
        this.f11466d = fragmentManager;
        this.f11463a = str;
        this.f11464b = i17;
        this.f11465c = i18;
    }

    @Override // androidx.fragment.app.q1
    public boolean a(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        androidx.fragment.app.Fragment fragment = this.f11466d.mPrimaryNav;
        if (fragment == null || this.f11464b >= 0 || this.f11463a != null || !fragment.getChildFragmentManager().popBackStackImmediate()) {
            return this.f11466d.popBackStackState(arrayList, arrayList2, this.f11463a, this.f11464b, this.f11465c);
        }
        return false;
    }
}
