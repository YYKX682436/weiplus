package n91;

/* loaded from: classes7.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n91.c0 f417432d;

    public w(n91.c0 c0Var) {
        this.f417432d = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n91.c0 c0Var = this.f417432d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.C12640x8cdfe408 c12640x8cdfe408 = c0Var.f417402m;
        if (c12640x8cdfe408 != null) {
            c12640x8cdfe408.e();
        }
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = c0Var.f417395f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c1073x7e08a787);
        c1073x7e08a787.animate().setInterpolator(new android.view.animation.DecelerateInterpolator()).setDuration(1000L).alpha(0.0f).setListener(new n91.v(c0Var)).start();
    }
}
