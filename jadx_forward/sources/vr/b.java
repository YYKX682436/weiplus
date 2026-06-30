package vr;

/* loaded from: classes5.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vr.g f520927d;

    public b(vr.g gVar) {
        this.f520927d = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vr.g gVar = this.f520927d;
        gVar.f520938c.setVisibility(4);
        if (gVar.f520938c.getParent() != null) {
            gVar.f520938c.h();
            android.view.ViewParent parent = gVar.f520938c.getParent();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) parent).removeView(gVar.f520938c);
        }
    }
}
