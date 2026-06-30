package b04;

/* loaded from: classes4.dex */
public final class q implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b04.z f16928d;

    public q(b04.z zVar) {
        this.f16928d = zVar;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        b04.z zVar = this.f16928d;
        com.tencent.mars.xlog.Log.i("MicroMsg.MyQRCodeUIC", "fmsgChange onNotifyChange isBarVisible=%b prev=%d", java.lang.Boolean.valueOf(zVar.f16960t), java.lang.Integer.valueOf(zVar.f16964x));
        zVar.Z6();
    }
}
