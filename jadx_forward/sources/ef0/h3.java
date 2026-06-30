package ef0;

@j95.b
/* loaded from: classes11.dex */
public final class h3 extends i95.w implements qk.t8 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f333757d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18699x6096e65d f333758e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Integer f333759f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f333760g = java.util.Collections.synchronizedList(new java.util.ArrayList());

    public h3() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        android.app.Application application = context instanceof android.app.Application ? (android.app.Application) context : null;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(new ef0.g3(this));
        }
    }

    public boolean Ai() {
        return this.f333758e != null;
    }

    public final void Bi(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18699x6096e65d activityC18699x6096e65d) {
        this.f333758e = activityC18699x6096e65d;
        this.f333759f = activityC18699x6096e65d != null ? java.lang.Integer.valueOf(activityC18699x6096e65d.getTaskId()) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingFlutterActivityManagerService", "updateCurrentTingActivityInstance instance: " + activityC18699x6096e65d + ", taskId: " + this.f333759f);
    }

    public boolean wi(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18699x6096e65d activityC18699x6096e65d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingFlutterActivityManagerService", "finishUtilTingFlutterActivity hasTingInstance: " + Ai() + ", withFinishTingActivity: " + z17);
        int i17 = 0;
        if (!Ai()) {
            return false;
        }
        java.util.List activityListAboveTing = this.f333760g;
        int size = activityListAboveTing.size();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(activityListAboveTing, "activityListAboveTing");
        for (java.lang.Object obj : activityListAboveTing) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            android.app.Activity activity = (android.app.Activity) obj;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingFlutterActivityManagerService", "finishUtilTingFlutterActivity index: " + i17 + ", " + activity);
            if (activity != null) {
                activity.finish();
                if (i17 == size - 1) {
                    activity.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559422ed);
                } else if (i17 == 0) {
                    activity.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559413e4, com.p314xaae8f345.mm.R.C30854x2dc211.f559262q);
                } else {
                    activity.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559262q, com.p314xaae8f345.mm.R.C30854x2dc211.f559262q);
                }
            }
            i17 = i18;
        }
        activityListAboveTing.clear();
        if (z17 && (activityC18699x6096e65d = this.f333758e) != null) {
            activityC18699x6096e65d.finish();
        }
        return true;
    }
}
