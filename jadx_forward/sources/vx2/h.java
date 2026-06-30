package vx2;

/* loaded from: classes2.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f522778d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vx2.k f522779e;

    public h(boolean z17, vx2.k kVar) {
        this.f522778d = z17;
        this.f522779e = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = this.f522778d;
        vx2.k kVar = this.f522779e;
        if (!z17) {
            vx2.k.f(kVar);
            return;
        }
        android.view.ViewGroup viewGroup = kVar.f522788g;
        vx2.g gVar = new vx2.g(kVar);
        kVar.getClass();
        if (viewGroup == null) {
            gVar.mo152xb9724478();
        } else {
            viewGroup.animate().cancel();
            viewGroup.animate().alpha(0.0f).setDuration(300L).withEndAction(new vx2.b(viewGroup, gVar)).start();
        }
    }
}
