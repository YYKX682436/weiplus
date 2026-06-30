package sx5;

/* loaded from: classes13.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sx5.a1 f495284d;

    public p0(sx5.a1 a1Var) {
        this.f495284d = a1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        sx5.a1 a1Var = this.f495284d;
        if (a1Var.f495205f.m120171x1f05d274() && (a1Var.r(a1Var.f495210m) != null || a1Var.s(a1Var.f495210m) != null)) {
            by5.c4.f("XWebNativeInterface", "attach, xwalk kernel and video view has surface view or texture view");
            android.widget.FrameLayout frameLayout = a1Var.f495208i;
            if (frameLayout != null) {
                frameLayout.setBackgroundColor(-16777216);
            }
        }
        a1Var.t(true);
        sx5.x0 x0Var = a1Var.K1;
        sx5.x0 x0Var2 = sx5.x0.AttachingDetached;
        sx5.x0 x0Var3 = sx5.x0.Attached;
        if (x0Var != x0Var2) {
            a1Var.K1 = x0Var3;
        } else {
            a1Var.K1 = x0Var3;
            a1Var.n();
        }
    }
}
