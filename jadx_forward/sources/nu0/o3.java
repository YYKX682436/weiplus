package nu0;

/* loaded from: classes5.dex */
public final class o3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f421588d;

    public o3(nu0.b4 b4Var) {
        this.f421588d = b4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nu0.b4 b4Var = this.f421588d;
        int i17 = b4Var.K.f383213g;
        int mo1894x7e414b06 = (i17 + 1) % (r1.mo1894x7e414b06() - 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ImageComp.MainComposingUIC", "[autoSwitchToNext] currentPos:" + i17 + " nextPos:" + mo1894x7e414b06 + " disableAutoSwitch:" + b4Var.f421413p0);
        if (b4Var.f421413p0) {
            return;
        }
        b4Var.A7("auto", mo1894x7e414b06, new nu0.g1(b4Var, mo1894x7e414b06));
    }
}
