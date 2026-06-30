package wm2;

/* loaded from: classes14.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f528773d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bn2.p f528774e;

    public h(android.widget.FrameLayout frameLayout, bn2.p pVar) {
        this.f528773d = frameLayout;
        this.f528774e = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f528773d.removeView(this.f528774e.e());
    }
}
