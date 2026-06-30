package al5;

/* loaded from: classes14.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ al5.f0 f5872d;

    public c0(al5.f0 f0Var) {
        this.f5872d = f0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        al5.f0 f0Var = this.f5872d;
        if (f0Var.f5899s != null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.InputPanelHelper", "onKeyboardHideOnce not run in measure");
            f0Var.f5899s.run();
            f0Var.f5899s = null;
        }
    }
}
