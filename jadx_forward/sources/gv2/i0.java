package gv2;

/* loaded from: classes5.dex */
public final class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f357559d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f357560e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.xj f357561f;

    public i0(android.view.View view, int i17, com.p314xaae8f345.mm.ui.xj xjVar) {
        this.f357559d = view;
        this.f357560e = i17;
        this.f357561f = xjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view = this.f357559d;
        view.getHitRect(rect);
        int i17 = this.f357560e;
        rect.inset(-i17, -i17);
        this.f357561f.a(new com.p314xaae8f345.mm.ui.yj(rect, view));
    }
}
