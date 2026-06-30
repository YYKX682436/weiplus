package cj5;

/* loaded from: classes.dex */
public final class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.d1 f42072d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f42073e;

    public b1(cj5.d1 d1Var, boolean z17) {
        this.f42072d = d1Var;
        this.f42073e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j75.f stateCenter;
        cj5.d1 d1Var = this.f42072d;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = d1Var.P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.B3(new wi5.a1(this.f42073e ? d1Var.T6().o().getHeight() : 0));
    }
}
