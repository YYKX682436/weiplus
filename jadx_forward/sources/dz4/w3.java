package dz4;

/* loaded from: classes12.dex */
public final class w3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz4.h4 f326981d;

    public w3(dz4.h4 h4Var) {
        this.f326981d = h4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.app.Activity activity;
        java.lang.ref.WeakReference weakReference = ((ez4.u) this.f326981d.f326816a).f339477c;
        if (weakReference == null || (activity = (android.app.Activity) weakReference.get()) == null) {
            return;
        }
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(activity);
        e4Var.f293309c = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j3v);
        e4Var.c();
    }
}
