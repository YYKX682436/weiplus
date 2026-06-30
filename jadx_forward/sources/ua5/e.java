package ua5;

/* loaded from: classes11.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ua5.f f507517d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f507518e;

    public e(ua5.f fVar, android.view.View view) {
        this.f507517d = fVar;
        this.f507518e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f507517d.a(this.f507518e);
    }
}
