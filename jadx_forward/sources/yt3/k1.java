package yt3;

/* loaded from: classes10.dex */
public final class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt3.o1 f547044d;

    public k1(yt3.o1 o1Var) {
        this.f547044d = o1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("video onPrepared l:");
        yt3.o1 o1Var = this.f547044d;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 c19745xad58a1a4 = o1Var.f547092d;
        sb6.append(c19745xad58a1a4 != null ? java.lang.Integer.valueOf(c19745xad58a1a4.getLeft()) : null);
        sb6.append(" t:");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 c19745xad58a1a42 = o1Var.f547092d;
        sb6.append(c19745xad58a1a42 != null ? java.lang.Integer.valueOf(c19745xad58a1a42.getTop()) : null);
        sb6.append(" r:");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 c19745xad58a1a43 = o1Var.f547092d;
        sb6.append(c19745xad58a1a43 != null ? java.lang.Integer.valueOf(c19745xad58a1a43.getRight()) : null);
        sb6.append(" b:");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 c19745xad58a1a44 = o1Var.f547092d;
        sb6.append(c19745xad58a1a44 != null ? java.lang.Integer.valueOf(c19745xad58a1a44.getBottom()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditVideoPlayPlugin", sb6.toString());
        lt3.n nVar = lt3.n.f402793a;
        android.graphics.Rect rect = lt3.n.f402796d;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 c19745xad58a1a45 = o1Var.f547092d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19745xad58a1a45);
        int left = c19745xad58a1a45.getLeft();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 c19745xad58a1a46 = o1Var.f547092d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19745xad58a1a46);
        int top = c19745xad58a1a46.getTop();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 c19745xad58a1a47 = o1Var.f547092d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19745xad58a1a47);
        int right = c19745xad58a1a47.getRight();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 c19745xad58a1a48 = o1Var.f547092d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19745xad58a1a48);
        rect.set(new android.graphics.Rect(left, top, right, c19745xad58a1a48.getBottom()));
    }
}
