package yf;

/* loaded from: classes7.dex */
public final class d0 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yf.e0 f542866a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pd1.i f542867b;

    public d0(yf.e0 e0Var, pd1.i iVar) {
        this.f542866a = e0Var;
        this.f542867b = iVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        pd1.i iVar = this.f542867b;
        yf.e0 e0Var = this.f542866a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.LivePusherOriginVideoContainer", "getVideoPositionAsync, value: " + str);
        try {
            yf.i0 i0Var = e0Var.f542870a;
            cl0.g gVar = new cl0.g(str);
            i0Var.Q = ik1.w.c(gVar.mo15080xc3ca103c("x", i0Var.Q));
            i0Var.R = ik1.w.c(gVar.mo15080xc3ca103c("y", i0Var.R));
            i0Var.x();
            yf.i0 i0Var2 = e0Var.f542870a;
            iVar.a(i0Var2.Q, i0Var2.R);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.LivePusherOriginVideoContainer", "getVideoPositionAsync, updatePosition fail since " + e17);
            yf.i0 i0Var3 = e0Var.f542870a;
            iVar.a(i0Var3.Q, i0Var3.R);
        }
    }
}
