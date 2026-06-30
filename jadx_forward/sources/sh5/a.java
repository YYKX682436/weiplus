package sh5;

/* loaded from: classes3.dex */
public final class a implements f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f489564d;

    public a(java.lang.ref.WeakReference videoViewRef) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoViewRef, "videoViewRef");
        this.f489564d = videoViewRef;
    }

    @Override // f25.f
    public void c(boolean z17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4) this.f489564d.get();
        if (f4Var != null) {
            f4Var.mo69318x764d819b(true);
        }
    }

    @Override // f25.f
    /* renamed from: onResume */
    public void mo44161x57429eec() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4) this.f489564d.get();
        if (f4Var != null) {
            f4Var.mo69318x764d819b(false);
        }
    }

    @Override // f25.f
    /* renamed from: onStop */
    public void mo44162xc39f8281() {
    }
}
