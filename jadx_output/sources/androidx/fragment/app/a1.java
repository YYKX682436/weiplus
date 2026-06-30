package androidx.fragment.app;

/* loaded from: classes14.dex */
public class a1 implements androidx.activity.result.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.FragmentManager f11254a;

    public a1(androidx.fragment.app.FragmentManager fragmentManager) {
        this.f11254a = fragmentManager;
    }

    @Override // androidx.activity.result.b
    public void a(java.lang.Object obj) {
        androidx.fragment.app.f2 f2Var;
        androidx.activity.result.ActivityResult activityResult = (androidx.activity.result.ActivityResult) obj;
        androidx.fragment.app.FragmentManager fragmentManager = this.f11254a;
        androidx.fragment.app.FragmentManager.LaunchedFragmentInfo pollFirst = fragmentManager.mLaunchedFragments.pollFirst();
        if (pollFirst == null) {
            return;
        }
        f2Var = fragmentManager.mFragmentStore;
        androidx.fragment.app.Fragment c17 = f2Var.c(pollFirst.f11213d);
        if (c17 == null) {
            return;
        }
        c17.onActivityResult(pollFirst.f11214e, activityResult.f9042d, activityResult.f9043e);
    }
}
