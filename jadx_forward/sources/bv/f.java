package bv;

@j95.b
/* loaded from: classes11.dex */
public final class f extends i95.w implements rv.i2 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.ActivityC12823xa4912a28 f106178d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Integer f106179e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f106180f = java.util.Collections.synchronizedList(new java.util.ArrayList());

    public f() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        android.app.Application application = context instanceof android.app.Application ? (android.app.Application) context : null;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(new bv.e(this));
        }
    }

    public final void wi(com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.ActivityC12823xa4912a28 activityC12823xa4912a28) {
        this.f106178d = activityC12823xa4912a28;
        this.f106179e = activityC12823xa4912a28 != null ? java.lang.Integer.valueOf(activityC12823xa4912a28.getTaskId()) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizAudioFlutterActivityManagerService", "updateCurrentBizAudioActivityInstance instance: " + activityC12823xa4912a28 + ", taskId: " + this.f106179e);
    }
}
