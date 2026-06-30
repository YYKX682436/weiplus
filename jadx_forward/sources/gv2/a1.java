package gv2;

/* loaded from: classes5.dex */
public final class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f357516d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f357517e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.xj f357518f;

    public a1(android.view.View view, int i17, com.p314xaae8f345.mm.ui.xj xjVar) {
        this.f357516d = view;
        this.f357517e = i17;
        this.f357518f = xjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view = this.f357516d;
        view.getHitRect(rect);
        int i17 = this.f357517e;
        rect.inset(-i17, -i17);
        this.f357518f.a(new com.p314xaae8f345.mm.ui.yj(rect, view));
    }
}
