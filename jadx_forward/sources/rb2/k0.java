package rb2;

/* loaded from: classes2.dex */
public final class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f475200d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f475201e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.xj f475202f;

    public k0(android.view.View view, int i17, com.p314xaae8f345.mm.ui.xj xjVar) {
        this.f475200d = view;
        this.f475201e = i17;
        this.f475202f = xjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view = this.f475200d;
        view.getHitRect(rect);
        rect.left -= this.f475201e;
        this.f475202f.a(new com.p314xaae8f345.mm.ui.yj(rect, view));
    }
}
