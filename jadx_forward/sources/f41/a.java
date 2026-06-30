package f41;

/* loaded from: classes5.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final android.app.Activity a() {
        java.lang.ref.WeakReference k17 = com.p314xaae8f345.mm.app.w.k();
        android.app.Activity activity = k17 != null ? (android.app.Activity) k17.get() : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getTopActivity: activity=");
        sb6.append(activity);
        sb6.append(", class=");
        sb6.append(activity != null ? activity.getClass().getSimpleName() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.A2AActivity", sb6.toString());
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return null;
        }
        return activity;
    }
}
