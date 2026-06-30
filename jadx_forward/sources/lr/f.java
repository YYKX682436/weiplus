package lr;

/* loaded from: classes15.dex */
public final class f implements pr.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lr.g f402046a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f402047b;

    public f(lr.g gVar, android.view.View view) {
        this.f402046a = gVar;
        this.f402047b = view;
    }

    @Override // pr.e0
    public void a(int i17) {
        lr.g gVar = this.f402046a;
        if (lr.g.j(gVar).c() && this.f402047b.isAttachedToWindow()) {
            lr.g.j(gVar).e();
        }
    }
}
