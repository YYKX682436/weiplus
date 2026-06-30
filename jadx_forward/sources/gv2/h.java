package gv2;

/* loaded from: classes5.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f357552d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f357553e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.xj f357554f;

    public h(android.view.View view, int i17, com.p314xaae8f345.mm.ui.xj xjVar) {
        this.f357552d = view;
        this.f357553e = i17;
        this.f357554f = xjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view = this.f357552d;
        view.getHitRect(rect);
        int i17 = this.f357553e;
        rect.inset(-i17, -i17);
        this.f357554f.a(new com.p314xaae8f345.mm.ui.yj(rect, view));
    }
}
