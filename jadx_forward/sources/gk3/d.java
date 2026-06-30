package gk3;

/* loaded from: classes8.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk3.m f354027d;

    public d(gk3.m mVar) {
        this.f354027d = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gk3.m mVar = this.f354027d;
        ek3.e eVar = mVar.f354061d;
        if (eVar != null) {
            if ((eVar != null ? eVar.getParent() : null) != null) {
                ek3.e eVar2 = mVar.f354061d;
                android.view.ViewParent parent = eVar2 != null ? eVar2.getParent() : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((android.view.ViewGroup) parent).removeView(mVar.f354061d);
            }
        }
    }
}
