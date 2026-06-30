package aj4;

/* loaded from: classes10.dex */
public final class r implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f86895d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f86896e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f86897f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f86898g;

    public r(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, java.util.concurrent.atomic.AtomicBoolean atomicBoolean2, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, yz5.l lVar) {
        this.f86895d = atomicBoolean;
        this.f86896e = atomicBoolean2;
        this.f86897f = h0Var;
        this.f86898g = lVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        if (!this.f86895d.get() && this.f86896e.compareAndSet(false, true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatusFlutterMediaProvider", "handleLivePhotoFromGallery: loading cancelled by user, drop remux result");
            p3325xe03a0797.p3326xc267989b.r2 r2Var = (p3325xe03a0797.p3326xc267989b.r2) this.f86897f.f391656d;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            this.f86898g.mo146xb9724478(new aj4.n(kz5.p0.f395529d, 0L, "live photo remux cancelled"));
        }
    }
}
