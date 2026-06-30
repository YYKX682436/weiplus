package on2;

/* loaded from: classes2.dex */
public final class e2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f428426d;

    public e2(android.view.View view) {
        this.f428426d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view = this.f428426d;
        view.getHitRect(rect);
        int i17 = -com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        rect.inset(i17, i17);
        java.lang.Object parent = view.getParent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.View");
        ((android.view.View) parent).setTouchDelegate(new android.view.TouchDelegate(rect, view));
    }
}
