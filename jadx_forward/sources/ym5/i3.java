package ym5;

/* loaded from: classes15.dex */
public class i3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.j3 f544917d;

    public i3(ym5.j3 j3Var) {
        this.f544917d = j3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        ym5.j3 j3Var = this.f544917d;
        j3Var.f544939t.W.run();
        com.p314xaae8f345.mm.p2776x373aa5.C22796x44e7a3d7 c22796x44e7a3d7 = j3Var.f544939t;
        c22796x44e7a3d7.W = null;
        c22796x44e7a3d7.invalidate();
    }
}
