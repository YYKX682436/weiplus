package qn2;

/* loaded from: classes3.dex */
public final class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn2.v0 f446653d;

    public n0(qn2.v0 v0Var) {
        this.f446653d = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        qn2.v0 v0Var = this.f446653d;
        android.view.View view = v0Var.f446727s;
        if (view != null) {
            view.getHitRect(rect);
        }
        int i17 = -com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        rect.inset(i17, i17);
        android.view.View view2 = v0Var.f446727s;
        java.lang.Object parent = view2 != null ? view2.getParent() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.View");
        ((android.view.View) parent).setTouchDelegate(new android.view.TouchDelegate(rect, v0Var.f446727s));
    }
}
