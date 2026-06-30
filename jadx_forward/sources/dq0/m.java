package dq0;

/* loaded from: classes7.dex */
public final class m implements io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.OnFrameAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cf3.d f323854a;

    public m(cf3.d dVar) {
        this.f323854a = dVar;
    }

    @Override // io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.OnFrameAvailableListener
    /* renamed from: onFrameAvailable */
    public final void mo125886x5fe1f39b(boolean z17) {
        cf3.d dVar = this.f323854a;
        dVar.getClass();
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            throw new java.lang.IllegalStateException("onFrameAvailable should be called on main thread");
        }
        android.graphics.Rect rect = dVar.f122461m;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(rect, dVar.f122460l) && !dVar.f122454f) {
            dVar.f122449a.f(dVar.f122458j, dVar, rect.left, rect.top, rect.width(), rect.height());
            dVar.f122460l = rect;
        }
        if (dVar.f122453e || dVar.f122454f) {
            return;
        }
        dVar.f122453e = true;
        dVar.f122449a.c(dVar.f122458j, true);
    }
}
