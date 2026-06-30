package aj4;

/* loaded from: classes10.dex */
public final class i extends zi4.h0 {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f86861h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(java.lang.String cmdId, java.lang.ref.WeakReference weakReference, zi4.g0 host) {
        super(cmdId, weakReference, host, aj4.d.f86845d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdId, "cmdId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        this.f86861h = "MicroMsg.FLTStatusGetMediaFromCaptureHandler";
    }

    @Override // zi4.h0
    public void b(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, zi4.r1 asyncResult) {
        bw5.gb gbVar = (bw5.gb) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(asyncResult, "asyncResult");
        android.app.Activity activity = this.f554715f.f554748a;
        bw5.kb kbVar = null;
        if (!(activity instanceof android.app.Activity)) {
            activity = null;
        }
        if (activity == null) {
            java.lang.ref.WeakReference weakReference = this.f554714e;
            android.content.Context context = weakReference != null ? (android.content.Context) weakReference.get() : null;
            activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        }
        aj4.w wVar = aj4.w.f86911a;
        android.app.Activity activity2 = (activity == null || activity.isFinishing()) ? null : activity;
        java.lang.String str = this.f86861h;
        if (activity2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "handleAsyncRequest: activity is null or finishing");
            asyncResult.a(new bw5.hb(), -1L, "no activity");
            return;
        }
        p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c activityC0053x3d3f670c = activity2 instanceof p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c ? (p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c) activity2 : null;
        if (activityC0053x3d3f670c == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "handleAsyncRequest: activity is not ComponentActivity");
            asyncResult.a(new bw5.hb(), -1L, "host activity is not ComponentActivity");
            return;
        }
        if (gbVar != null) {
            kbVar = gbVar.f109311f[1] ? gbVar.f109309d : bw5.kb.Media_Image_Only;
        }
        bw5.kb kbVar2 = kbVar == null ? bw5.kb.Media_All : kbVar;
        long j17 = gbVar != null ? gbVar.f109310e : 0L;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "handleAsyncRequest: mediaType=" + kbVar2 + ", maxVideoDurationMs=" + j17);
        pm0.v.X(new aj4.h(activity2, this, asyncResult, activityC0053x3d3f670c, kbVar2, j17));
    }
}
