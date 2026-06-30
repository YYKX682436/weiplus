package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public class j0 implements g.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f f92898a;

    public j0(p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f) {
        this.f92898a = activityC1102x9ee2d9f;
    }

    @Override // g.b
    public void a(android.content.Context context) {
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f = this.f92898a;
        p012xc85e97e9.p087x9da2e250.app.v0 v0Var = activityC1102x9ee2d9f.f3470x9170b236.f93009a;
        v0Var.f93029g.m7628xfb41dbc1(v0Var, v0Var, null);
        android.os.Bundle a17 = activityC1102x9ee2d9f.mo2511xdf516e9d().a("android:support:fragments");
        if (a17 != null) {
            android.os.Parcelable parcelable = a17.getParcelable("android:support:fragments");
            p012xc85e97e9.p087x9da2e250.app.v0 v0Var2 = activityC1102x9ee2d9f.f3470x9170b236.f93009a;
            if (!(v0Var2 instanceof p012xc85e97e9.p093xedfae76a.m1)) {
                throw new java.lang.IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
            }
            v0Var2.f93029g.m7717xf720c626(parcelable);
        }
    }
}
