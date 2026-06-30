package fl1;

/* loaded from: classes14.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fl1.b2 f345229d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fl1.b0 f345230e;

    public a0(fl1.b0 b0Var, fl1.b2 b2Var) {
        this.f345230e = b0Var;
        this.f345229d = b2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        fl1.b0 b0Var = this.f345230e;
        b0Var.f345233f.removeView(b0Var.f345231d);
        fl1.c0 c0Var = b0Var.f345233f;
        c0Var.f345258t = true;
        java.util.Iterator it = ((x.d) c0Var.f345256r).iterator();
        while (it.hasNext()) {
            ((fl1.c2) it.next()).a(b0Var.f345232e);
        }
        fl1.c0 c0Var2 = b0Var.f345233f;
        c0Var2.f345258t = false;
        if (!((x.d) c0Var2.f345257s).isEmpty()) {
            fl1.c0 c0Var3 = b0Var.f345233f;
            ((x.d) c0Var3.f345256r).removeAll(c0Var3.f345257s);
            ((x.d) b0Var.f345233f.f345257s).clear();
        }
        fl1.b2 b2Var = this.f345229d;
        if (b2Var != null) {
            b2Var.m();
        }
    }
}
