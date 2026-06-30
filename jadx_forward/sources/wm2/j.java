package wm2;

/* loaded from: classes14.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f528777d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bn2.p f528778e;

    public j(android.widget.FrameLayout frameLayout, bn2.p pVar) {
        this.f528777d = frameLayout;
        this.f528778e = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f528777d.removeView(this.f528778e.e());
    }
}
