package bv;

/* loaded from: classes11.dex */
public final class e implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bv.f f24642d;

    public e(bv.f fVar) {
        this.f24642d = fVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(activity, "activity");
        boolean z17 = activity instanceof com.tencent.mm.plugin.audio.BizAudioFlutterActivity;
        bv.f fVar = this.f24642d;
        if (z17) {
            activity.toString();
            fVar.wi((com.tencent.mm.plugin.audio.BizAudioFlutterActivity) activity);
            return;
        }
        if (fVar.f24645d != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onActivityCreated activity: ");
            sb6.append(activity);
            sb6.append(", taskId: ");
            sb6.append(activity.getTaskId());
            sb6.append(", currentBizAudioTaskId: ");
            sb6.append(fVar.f24646e);
            sb6.append(", activityListAboveBizAudio.size: ");
            java.util.List list = fVar.f24647f;
            sb6.append(list.size());
            com.tencent.mars.xlog.Log.i("MicroMsg.BizAudioFlutterActivityManagerService", sb6.toString());
            java.lang.Integer num = fVar.f24646e;
            int taskId = activity.getTaskId();
            if (num != null && num.intValue() == taskId) {
                list.add(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        bv.f fVar = this.f24642d;
        if (!kotlin.jvm.internal.o.b(activity, fVar.f24645d)) {
            fVar.f24647f.remove(activity);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizAudioFlutterActivityManagerService", "onActivityDestroyed BizAudioFlutterActivity destroy: " + activity);
        fVar.wi(null);
        fVar.f24647f.clear();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle outState) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
    }
}
