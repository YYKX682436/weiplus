package co5;

/* loaded from: classes14.dex */
public final class u extends com.tencent.mm.app.s2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ co5.v f43886d;

    public u(co5.v vVar) {
        this.f43886d = vVar;
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("vqm", "onAppBackground ...");
        this.f43886d.f43889b = true;
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("vqm", "onAppForeground ...");
        co5.v vVar = this.f43886d;
        if (vVar.f43889b) {
            vVar.f43889b = false;
        }
    }
}
