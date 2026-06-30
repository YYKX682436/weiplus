package qn2;

/* loaded from: classes3.dex */
public final class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn2.u1 f446654d;

    public n1(qn2.u1 u1Var) {
        this.f446654d = u1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        qn2.u1 u1Var = this.f446654d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = u1Var.f446700f;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.getHitRect(rect);
        }
        int i17 = -com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        rect.inset(i17, i17);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = u1Var.f446700f;
        java.lang.Object parent = c22699x3dcdb3522 != null ? c22699x3dcdb3522.getParent() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.View");
        ((android.view.View) parent).setTouchDelegate(new android.view.TouchDelegate(rect, u1Var.f446700f));
    }
}
