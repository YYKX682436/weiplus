package aj4;

/* loaded from: classes10.dex */
public final class m extends zi4.h0 {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f86870h;

    /* renamed from: i, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f86871i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.lang.String cmdId, java.lang.ref.WeakReference weakReference, zi4.g0 host) {
        super(cmdId, weakReference, host, aj4.j.f86862d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdId, "cmdId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        this.f86870h = "MicroMsg.FLTStatusGetMediaFromGalleryHandler";
        this.f86871i = p3325xe03a0797.p3326xc267989b.z0.b();
    }

    @Override // zi4.h0
    public void b(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, zi4.r1 asyncResult) {
        bw5.ib ibVar = (bw5.ib) fVar;
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
        java.lang.String str = this.f86870h;
        if (activity2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "handleAsyncRequest: activity is null or finishing");
            asyncResult.a(new bw5.jb(), -1L, "no activity");
            return;
        }
        if (ibVar != null) {
            kbVar = ibVar.f110052h[1] ? ibVar.f110048d : bw5.kb.Media_Image_Only;
        }
        bw5.kb kbVar2 = kbVar == null ? bw5.kb.Media_All : kbVar;
        long j17 = ibVar != null ? ibVar.f110050f : 0L;
        boolean booleanValue = ((java.lang.Boolean) ((jz5.n) di4.i.f314321g).mo141623x754a37bb()).booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "handleAsyncRequest: mediaType=" + kbVar2 + ", maxVideoDurationMs=" + j17 + ", enableLivePhoto=" + booleanValue);
        pm0.v.X(new aj4.l(activity2, kbVar2, j17, booleanValue, this, asyncResult));
    }
}
