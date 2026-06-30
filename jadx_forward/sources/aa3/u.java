package aa3;

/* loaded from: classes15.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aa3.z f84135d;

    public u(aa3.z zVar) {
        this.f84135d = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aa3.z zVar = this.f84135d;
        if (zVar.f84161g.getParent() != null) {
            android.view.ViewParent parent = zVar.f84161g.getParent();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) parent).removeView(zVar.f84161g);
        }
    }
}
