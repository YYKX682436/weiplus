package r61;

/* loaded from: classes9.dex */
public class c2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r61.d2 f474365d;

    public c2(r61.d2 d2Var) {
        this.f474365d = d2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        r61.d2 d2Var = this.f474365d;
        d2Var.f474373f.d();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = d2Var.f474373f.f154642f;
        if (u3Var != null) {
            u3Var.dismiss();
        }
    }
}
