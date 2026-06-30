package vc1;

/* loaded from: classes13.dex */
public class a1 implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnAuthResultCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f516442a;

    public a1(vc1.p1 p1Var) {
        this.f516442a = p1Var;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnAuthResultCallback
    /* renamed from: onAuthFail */
    public void mo36922xfa7237e5(int i17, java.lang.String str) {
        vc1.p1 p1Var = this.f516442a;
        vc1.k2 k2Var = p1Var.f516640x0;
        if (k2Var != null) {
            k2Var.mo127680xfa7237e5(i17, str);
            return;
        }
        synchronized (p1Var) {
            vc1.p1 p1Var2 = this.f516442a;
            p1Var2.A0 = true;
            p1Var2.f516642y0 = i17;
            p1Var2.f516644z0 = str;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Map.DefaultTencentMapView", "onAuthFail authResultCallback null");
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnAuthResultCallback
    /* renamed from: onAuthSuccess */
    public void mo36923x833155dc() {
        vc1.p1 p1Var = this.f516442a;
        p1Var.C0 = true;
        vc1.k2 k2Var = p1Var.f516640x0;
        if (k2Var != null) {
            k2Var.mo127681x833155dc();
            return;
        }
        synchronized (p1Var) {
            this.f516442a.B0 = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Map.DefaultTencentMapView", "onAuthSuccess authResultCallback null");
    }
}
