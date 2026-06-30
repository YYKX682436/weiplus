package d6;

/* loaded from: classes14.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d6.l f308178d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewTreeObserver f308179e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d6.k f308180f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(d6.l lVar, android.view.ViewTreeObserver viewTreeObserver, d6.k kVar) {
        super(1);
        this.f308178d = lVar;
        this.f308179e = viewTreeObserver;
        this.f308180f = kVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.ViewTreeObserver viewTreeObserver = this.f308179e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(viewTreeObserver, "viewTreeObserver");
        boolean isAlive = viewTreeObserver.isAlive();
        d6.k kVar = this.f308180f;
        if (isAlive) {
            viewTreeObserver.removeOnPreDrawListener(kVar);
        } else {
            ((d6.f) this.f308178d).f308172c.getViewTreeObserver().removeOnPreDrawListener(kVar);
        }
        return jz5.f0.f384359a;
    }
}
