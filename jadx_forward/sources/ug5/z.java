package ug5;

/* loaded from: classes3.dex */
public final class z extends ug5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2705xb436f21c.AbstractActivityC22405xf322b380 f509200d;

    public z(com.p314xaae8f345.mm.ui.p2705xb436f21c.AbstractActivityC22405xf322b380 abstractActivityC22405xf322b380) {
        this.f509200d = abstractActivityC22405xf322b380;
    }

    @Override // ug5.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (((java.lang.Boolean) ((ug5.y) this.f509200d.f290144f).mo146xb9724478(activity)).booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewFluentTransparentActivity", "unregisterActivityLifecycleCallbacks activity: " + activity + ' ');
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            android.app.Application application = context instanceof android.app.Application ? (android.app.Application) context : null;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(this);
            }
        }
    }
}
