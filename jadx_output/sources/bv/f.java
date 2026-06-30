package bv;

@j95.b
/* loaded from: classes11.dex */
public final class f extends i95.w implements rv.i2 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.audio.BizAudioFlutterActivity f24645d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Integer f24646e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f24647f = java.util.Collections.synchronizedList(new java.util.ArrayList());

    public f() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        android.app.Application application = context instanceof android.app.Application ? (android.app.Application) context : null;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(new bv.e(this));
        }
    }

    public final void wi(com.tencent.mm.plugin.audio.BizAudioFlutterActivity bizAudioFlutterActivity) {
        this.f24645d = bizAudioFlutterActivity;
        this.f24646e = bizAudioFlutterActivity != null ? java.lang.Integer.valueOf(bizAudioFlutterActivity.getTaskId()) : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.BizAudioFlutterActivityManagerService", "updateCurrentBizAudioActivityInstance instance: " + bizAudioFlutterActivity + ", taskId: " + this.f24646e);
    }
}
