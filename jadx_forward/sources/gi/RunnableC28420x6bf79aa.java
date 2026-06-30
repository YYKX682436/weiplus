package gi;

/* renamed from: gi.y0$$a */
/* loaded from: classes12.dex */
public final /* synthetic */ class RunnableC28420x6bf79aa implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gi.y0 f353758d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f353759e;

    public /* synthetic */ RunnableC28420x6bf79aa(gi.y0 y0Var, int i17) {
        this.f353758d = y0Var;
        this.f353759e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gi.y0 y0Var = this.f353758d;
        int i17 = this.f353759e;
        synchronized (y0Var.f353757b.f353740x) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.battery.MMCompositeMonitors", y0Var.hashCode() + " DeepBg: " + i17);
            ((java.util.ArrayList) y0Var.f353757b.f353738v).add(0, new wh.f2(java.lang.String.valueOf(i17)));
        }
    }
}
