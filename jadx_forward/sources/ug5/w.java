package ug5;

/* loaded from: classes3.dex */
public final class w extends ug5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f509197d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f509198e;

    public w(yz5.l lVar, android.content.Context context) {
        this.f509197d = lVar;
        this.f509198e = context;
    }

    @Override // ug5.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (((java.lang.Boolean) this.f509197d.mo146xb9724478(activity)).booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewFluentPerformer", "unregisterActivityLifecycleCallbacks destroy activity: " + activity);
            ((android.app.Application) this.f509198e).unregisterActivityLifecycleCallbacks(this);
        }
    }
}
