package androidx.lifecycle;

/* loaded from: classes5.dex */
public abstract class k1 {
    public static androidx.lifecycle.j1 a(androidx.fragment.app.FragmentActivity fragmentActivity, androidx.lifecycle.f1 f1Var) {
        android.app.Application application = fragmentActivity.getApplication();
        if (application == null) {
            throw new java.lang.IllegalStateException("Your activity/fragment is not yet attached to Application. You can't request ViewModel before onCreate call.");
        }
        if (f1Var == null) {
            if (androidx.lifecycle.e1.f11621c == null) {
                androidx.lifecycle.e1.f11621c = new androidx.lifecycle.e1(application);
            }
            f1Var = androidx.lifecycle.e1.f11621c;
        }
        return new androidx.lifecycle.j1(fragmentActivity.getViewModel(), f1Var);
    }
}
