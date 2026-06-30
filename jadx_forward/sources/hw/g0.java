package hw;

/* loaded from: classes7.dex */
public final class g0 extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hw.o0 f366912b;

    public g0(hw.o0 o0Var) {
        this.f366912b = o0Var;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g
    public void a() {
        java.lang.String ij6;
        hw.o0 o0Var = this.f366912b;
        ij6 = o0Var.ij();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ij6, "hy: onEnterBackground");
        java.lang.Runnable task = o0Var.f366948n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = o0Var.f366947m;
        n3Var.mo50302x6b17ad39(null);
        n3Var.mo50297x7c4d7ca2(task, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g
    public void b() {
        java.lang.String ij6;
        hw.o0 o0Var = this.f366912b;
        ij6 = o0Var.ij();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ij6, "hy: onExitBackground");
        o0Var.f366947m.mo50302x6b17ad39(null);
    }
}
