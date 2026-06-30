package androidx.fragment.app;

/* loaded from: classes14.dex */
public class i1 implements androidx.fragment.app.x1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.Fragment f11343d;

    public i1(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
        this.f11343d = fragment;
    }

    @Override // androidx.fragment.app.x1
    public void a(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
        this.f11343d.onAttachFragment(fragment);
    }
}
