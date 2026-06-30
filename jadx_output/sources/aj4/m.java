package aj4;

/* loaded from: classes10.dex */
public final class m extends zi4.h0 {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f5337h;

    /* renamed from: i, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f5338i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.lang.String cmdId, java.lang.ref.WeakReference weakReference, zi4.g0 host) {
        super(cmdId, weakReference, host, aj4.j.f5329d);
        kotlin.jvm.internal.o.g(cmdId, "cmdId");
        kotlin.jvm.internal.o.g(host, "host");
        this.f5337h = "MicroMsg.FLTStatusGetMediaFromGalleryHandler";
        this.f5338i = kotlinx.coroutines.z0.b();
    }

    @Override // zi4.h0
    public void b(com.tencent.mm.protobuf.f fVar, zi4.r1 asyncResult) {
        bw5.ib ibVar = (bw5.ib) fVar;
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
        java.lang.String str = this.f5337h;
        if (activity2 == null) {
            com.tencent.mars.xlog.Log.e(str, "handleAsyncRequest: activity is null or finishing");
            asyncResult.a(new bw5.jb(), -1L, "no activity");
            return;
        }
        if (ibVar != null) {
            kbVar = ibVar.f28519h[1] ? ibVar.f28515d : bw5.kb.Media_Image_Only;
        }
        bw5.kb kbVar2 = kbVar == null ? bw5.kb.Media_All : kbVar;
        long j17 = ibVar != null ? ibVar.f28517f : 0L;
        boolean booleanValue = ((java.lang.Boolean) ((jz5.n) di4.i.f232788g).getValue()).booleanValue();
        com.tencent.mars.xlog.Log.i(str, "handleAsyncRequest: mediaType=" + kbVar2 + ", maxVideoDurationMs=" + j17 + ", enableLivePhoto=" + booleanValue);
        pm0.v.X(new aj4.l(activity2, kbVar2, j17, booleanValue, this, asyncResult));
    }
}
