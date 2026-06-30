package al5;

/* loaded from: classes14.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ al5.f0 f5866d;

    public b0(al5.f0 f0Var) {
        this.f5866d = f0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        al5.f0 f0Var = this.f5866d;
        if (f0Var.f5898r != null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.InputPanelHelper", "onKeyboardShowOnce not run in measure");
            f0Var.f5898r.run();
            f0Var.f5898r = null;
        }
    }
}
