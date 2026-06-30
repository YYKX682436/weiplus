package androidx.fragment.app;

/* loaded from: classes14.dex */
public class j0 implements g.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.FragmentActivity f11365a;

    public j0(androidx.fragment.app.FragmentActivity fragmentActivity) {
        this.f11365a = fragmentActivity;
    }

    @Override // g.b
    public void a(android.content.Context context) {
        androidx.fragment.app.FragmentActivity fragmentActivity = this.f11365a;
        androidx.fragment.app.v0 v0Var = fragmentActivity.mFragments.f11476a;
        v0Var.f11496g.attachController(v0Var, v0Var, null);
        android.os.Bundle a17 = fragmentActivity.getSavedStateRegistry().a("android:support:fragments");
        if (a17 != null) {
            android.os.Parcelable parcelable = a17.getParcelable("android:support:fragments");
            androidx.fragment.app.v0 v0Var2 = fragmentActivity.mFragments.f11476a;
            if (!(v0Var2 instanceof androidx.lifecycle.m1)) {
                throw new java.lang.IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
            }
            v0Var2.f11496g.restoreSaveState(parcelable);
        }
    }
}
