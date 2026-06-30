package ef0;

/* loaded from: classes11.dex */
public final class g3 implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ef0.h3 f333749d;

    public g3(ef0.h3 h3Var) {
        this.f333749d = h3Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(activity.getClass(), com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18699x6096e65d.class);
        ef0.h3 h3Var = this.f333749d;
        if (b17) {
            activity.toString();
            h3Var.Bi((com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18699x6096e65d) activity);
            return;
        }
        if (h3Var.Ai()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingFlutterActivityManagerService", "onActivityCreated activity: " + activity + ", taskId: " + activity.getTaskId() + ", currentTingTaskId: " + h3Var.f333759f + ", activityListAboveTing.size: " + h3Var.f333760g.size());
            java.lang.Integer num = h3Var.f333759f;
            int taskId = activity.getTaskId();
            if (num != null && num.intValue() == taskId) {
                h3Var.f333760g.add(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ef0.h3 h3Var = this.f333749d;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(activity, h3Var.f333758e)) {
            h3Var.f333760g.remove(activity);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingFlutterActivityManagerService", "onActivityDestroyed TingFlutterActivity destroy: " + activity);
        h3Var.Bi(null);
        h3Var.f333760g.clear();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle outState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }
}
