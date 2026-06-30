package wj2;

/* loaded from: classes9.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wj2.w f528245d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f528246e;

    public q(wj2.w wVar, android.view.View view) {
        this.f528245d = wVar;
        this.f528246e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wj2.w.Q(this.f528245d, this.f528246e, 0, 2, null);
    }
}
