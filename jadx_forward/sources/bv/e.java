package bv;

/* loaded from: classes11.dex */
public final class e implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bv.f f106175d;

    public e(bv.f fVar) {
        this.f106175d = fVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        boolean z17 = activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.ActivityC12823xa4912a28;
        bv.f fVar = this.f106175d;
        if (z17) {
            activity.toString();
            fVar.wi((com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.ActivityC12823xa4912a28) activity);
            return;
        }
        if (fVar.f106178d != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onActivityCreated activity: ");
            sb6.append(activity);
            sb6.append(", taskId: ");
            sb6.append(activity.getTaskId());
            sb6.append(", currentBizAudioTaskId: ");
            sb6.append(fVar.f106179e);
            sb6.append(", activityListAboveBizAudio.size: ");
            java.util.List list = fVar.f106180f;
            sb6.append(list.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizAudioFlutterActivityManagerService", sb6.toString());
            java.lang.Integer num = fVar.f106179e;
            int taskId = activity.getTaskId();
            if (num != null && num.intValue() == taskId) {
                list.add(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        bv.f fVar = this.f106175d;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(activity, fVar.f106178d)) {
            fVar.f106180f.remove(activity);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizAudioFlutterActivityManagerService", "onActivityDestroyed BizAudioFlutterActivity destroy: " + activity);
        fVar.wi(null);
        fVar.f106180f.clear();
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
