package e51;

/* loaded from: classes10.dex */
public final class c implements android.view.Choreographer.FrameCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e51.d f331103d;

    public c(e51.d dVar) {
        this.f331103d = dVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j17) {
        e51.b bVar;
        e51.d dVar = this.f331103d;
        dVar.getClass();
        long j18 = j17 / 1000000;
        java.lang.ref.WeakReference weakReference = dVar.f331104a;
        if (weakReference != null && (bVar = (e51.b) weakReference.get()) != null) {
            android.os.Message obtain = android.os.Message.obtain();
            obtain.what = 1;
            obtain.obj = java.lang.Long.valueOf(j18);
            ((e51.e) bVar).sendMessage(obtain);
        }
        if (dVar.f331107d) {
            dVar.f331105b.postFrameCallback(dVar.f331106c);
        }
    }
}
