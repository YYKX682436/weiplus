package al5;

/* loaded from: classes14.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ al5.f0 f87399d;

    public b0(al5.f0 f0Var) {
        this.f87399d = f0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        al5.f0 f0Var = this.f87399d;
        if (f0Var.f87431r != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.InputPanelHelper", "onKeyboardShowOnce not run in measure");
            f0Var.f87431r.run();
            f0Var.f87431r = null;
        }
    }
}
