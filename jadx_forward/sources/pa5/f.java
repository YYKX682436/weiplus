package pa5;

/* loaded from: classes3.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f434637d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f434638e;

    public f(android.view.ViewPropertyAnimator viewPropertyAnimator, yz5.a aVar) {
        this.f434637d = viewPropertyAnimator;
        this.f434638e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f434637d.setUpdateListener(null);
        yz5.a aVar = this.f434638e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
