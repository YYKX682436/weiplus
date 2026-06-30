package j7;

/* loaded from: classes13.dex */
public class n extends android.app.Fragment {

    /* renamed from: d, reason: collision with root package name */
    public final j7.a f379545d;

    /* renamed from: e, reason: collision with root package name */
    public final j7.r f379546e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Set f379547f;

    /* renamed from: g, reason: collision with root package name */
    public com.p147xb1cd08cc.p148x5de23a5.r f379548g;

    /* renamed from: h, reason: collision with root package name */
    public j7.n f379549h;

    /* renamed from: i, reason: collision with root package name */
    public android.app.Fragment f379550i;

    public n() {
        j7.a aVar = new j7.a();
        this.f379546e = new j7.m(this);
        this.f379547f = new java.util.HashSet();
        this.f379545d = aVar;
    }

    public final void a(android.app.Activity activity) {
        j7.n nVar = this.f379549h;
        if (nVar != null) {
            ((java.util.HashSet) nVar.f379547f).remove(this);
            this.f379549h = null;
        }
        j7.q qVar = com.p147xb1cd08cc.p148x5de23a5.c.b(activity).f125460i;
        qVar.getClass();
        j7.n c17 = qVar.c(activity.getFragmentManager(), null, j7.q.e(activity));
        this.f379549h = c17;
        if (equals(c17)) {
            return;
        }
        ((java.util.HashSet) this.f379549h.f379547f).add(this);
    }

    @Override // android.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        try {
            a(activity);
        } catch (java.lang.IllegalStateException unused) {
            android.util.Log.isLoggable("RMFragment", 5);
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f379545d.c();
        j7.n nVar = this.f379549h;
        if (nVar != null) {
            ((java.util.HashSet) nVar.f379547f).remove(this);
            this.f379549h = null;
        }
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        j7.n nVar = this.f379549h;
        if (nVar != null) {
            ((java.util.HashSet) nVar.f379547f).remove(this);
            this.f379549h = null;
        }
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f379545d.d();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f379545d.e();
    }

    @Override // android.app.Fragment
    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(super.toString());
        sb6.append("{parent=");
        android.app.Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f379550i;
        }
        sb6.append(parentFragment);
        sb6.append("}");
        return sb6.toString();
    }
}
