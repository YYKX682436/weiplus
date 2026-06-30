package sa5;

/* loaded from: classes14.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sa5.j f486872d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f486873e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f486874f;

    public g(sa5.j jVar, yz5.a aVar, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f486872d = jVar;
        this.f486873e = aVar;
        this.f486874f = viewPropertyAnimator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f486872d.a();
        yz5.a aVar = this.f486873e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        this.f486874f.setUpdateListener(null);
    }
}
