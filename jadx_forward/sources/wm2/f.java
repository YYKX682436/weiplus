package wm2;

/* loaded from: classes14.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f528769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bn2.p f528770e;

    public f(android.widget.FrameLayout frameLayout, bn2.p pVar) {
        this.f528769d = frameLayout;
        this.f528770e = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f528769d.removeView(this.f528770e.e());
    }
}
