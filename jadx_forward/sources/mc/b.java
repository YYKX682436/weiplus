package mc;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public android.app.FragmentManager f407028a;

    /* renamed from: b, reason: collision with root package name */
    public android.app.FragmentTransaction f407029b;

    public final lc.i a() {
        android.app.FragmentManager fragmentManager = this.f407028a;
        if (fragmentManager == null) {
            return null;
        }
        android.app.Fragment findFragmentById = fragmentManager.findFragmentById(com.p314xaae8f345.mm.R.id.vjy);
        if (findFragmentById instanceof lc.i) {
            return (lc.i) findFragmentById;
        }
        return null;
    }

    public final void b(lc.i iVar) {
        android.app.FragmentManager fragmentManager = this.f407028a;
        if (fragmentManager != null) {
            this.f407029b = fragmentManager.beginTransaction();
            this.f407028a.findFragmentById(com.p314xaae8f345.mm.R.id.vjy);
            this.f407029b.replace(com.p314xaae8f345.mm.R.id.vjy, iVar).addToBackStack(null).commit();
        }
    }
}
