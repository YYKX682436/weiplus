package gx0;

/* loaded from: classes3.dex */
public final class t7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f358514d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f358515e;

    public t7(gx0.w8 w8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this.f358514d = w8Var;
        this.f358515e = interfaceC29045xdcb5ca57;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.p3277xa1c40a32.p3283xc97dd6cb.SurfaceHolderCallbackC28529xf54f34a surfaceHolderCallbackC28529xf54f34a;
        gx0.w8 w8Var = this.f358514d;
        java.lang.ref.WeakReference weakReference = w8Var.A;
        if (weakReference != null && (surfaceHolderCallbackC28529xf54f34a = (io.p3277xa1c40a32.p3283xc97dd6cb.SurfaceHolderCallbackC28529xf54f34a) weakReference.get()) != null) {
            android.view.ViewParent parent = surfaceHolderCallbackC28529xf54f34a.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(surfaceHolderCallbackC28529xf54f34a);
            }
        }
        w8Var.A = null;
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        this.f358515e.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a));
    }
}
