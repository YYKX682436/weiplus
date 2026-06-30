package aa3;

/* loaded from: classes15.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aa3.z f2602d;

    public u(aa3.z zVar) {
        this.f2602d = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aa3.z zVar = this.f2602d;
        if (zVar.f2628g.getParent() != null) {
            android.view.ViewParent parent = zVar.f2628g.getParent();
            kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) parent).removeView(zVar.f2628g);
        }
    }
}
