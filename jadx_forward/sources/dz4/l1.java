package dz4;

/* loaded from: classes5.dex */
public final class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz4.o1 f326873d;

    public l1(dz4.o1 o1Var) {
        this.f326873d = o1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.app.Activity activity;
        dz4.o1 o1Var = this.f326873d;
        java.lang.ref.WeakReference weakReference = ((ez4.u) o1Var.f326893a).f339477c;
        if (weakReference == null || (activity = (android.app.Activity) weakReference.get()) == null) {
            return;
        }
        o1Var.f326895c = db5.e1.Q(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new dz4.n1(o1Var));
    }
}
