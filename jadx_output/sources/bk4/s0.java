package bk4;

/* loaded from: classes11.dex */
public final class s0 implements bi4.j0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f21556d;

    public s0(android.view.View view) {
        this.f21556d = view;
    }

    @Override // bi4.j0
    public void a() {
        this.f21556d.invalidate();
    }

    @Override // bi4.j0
    public android.view.View getView() {
        return this.f21556d;
    }
}
