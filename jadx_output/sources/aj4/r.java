package aj4;

/* loaded from: classes10.dex */
public final class r implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f5362d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f5363e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f5364f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f5365g;

    public r(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, java.util.concurrent.atomic.AtomicBoolean atomicBoolean2, kotlin.jvm.internal.h0 h0Var, yz5.l lVar) {
        this.f5362d = atomicBoolean;
        this.f5363e = atomicBoolean2;
        this.f5364f = h0Var;
        this.f5365g = lVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        if (!this.f5362d.get() && this.f5363e.compareAndSet(false, true)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatusFlutterMediaProvider", "handleLivePhotoFromGallery: loading cancelled by user, drop remux result");
            kotlinx.coroutines.r2 r2Var = (kotlinx.coroutines.r2) this.f5364f.f310123d;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            this.f5365g.invoke(new aj4.n(kz5.p0.f313996d, 0L, "live photo remux cancelled"));
        }
    }
}
