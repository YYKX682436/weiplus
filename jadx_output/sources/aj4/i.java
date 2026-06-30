package aj4;

/* loaded from: classes10.dex */
public final class i extends zi4.h0 {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f5328h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(java.lang.String cmdId, java.lang.ref.WeakReference weakReference, zi4.g0 host) {
        super(cmdId, weakReference, host, aj4.d.f5312d);
        kotlin.jvm.internal.o.g(cmdId, "cmdId");
        kotlin.jvm.internal.o.g(host, "host");
        this.f5328h = "MicroMsg.FLTStatusGetMediaFromCaptureHandler";
    }

    @Override // zi4.h0
    public void b(com.tencent.mm.protobuf.f fVar, zi4.r1 asyncResult) {
        bw5.gb gbVar = (bw5.gb) fVar;
        kotlin.jvm.internal.o.g(asyncResult, "asyncResult");
        android.app.Activity activity = this.f473182f.f473215a;
        bw5.kb kbVar = null;
        if (!(activity instanceof android.app.Activity)) {
            activity = null;
        }
        if (activity == null) {
            java.lang.ref.WeakReference weakReference = this.f473181e;
            android.content.Context context = weakReference != null ? (android.content.Context) weakReference.get() : null;
            activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        }
        aj4.w wVar = aj4.w.f5378a;
        android.app.Activity activity2 = (activity == null || activity.isFinishing()) ? null : activity;
        java.lang.String str = this.f5328h;
        if (activity2 == null) {
            com.tencent.mars.xlog.Log.e(str, "handleAsyncRequest: activity is null or finishing");
            asyncResult.a(new bw5.hb(), -1L, "no activity");
            return;
        }
        androidx.activity.ComponentActivity componentActivity = activity2 instanceof androidx.activity.ComponentActivity ? (androidx.activity.ComponentActivity) activity2 : null;
        if (componentActivity == null) {
            com.tencent.mars.xlog.Log.e(str, "handleAsyncRequest: activity is not ComponentActivity");
            asyncResult.a(new bw5.hb(), -1L, "host activity is not ComponentActivity");
            return;
        }
        if (gbVar != null) {
            kbVar = gbVar.f27778f[1] ? gbVar.f27776d : bw5.kb.Media_Image_Only;
        }
        bw5.kb kbVar2 = kbVar == null ? bw5.kb.Media_All : kbVar;
        long j17 = gbVar != null ? gbVar.f27777e : 0L;
        com.tencent.mars.xlog.Log.i(str, "handleAsyncRequest: mediaType=" + kbVar2 + ", maxVideoDurationMs=" + j17);
        pm0.v.X(new aj4.h(activity2, this, asyncResult, componentActivity, kbVar2, j17));
    }
}
