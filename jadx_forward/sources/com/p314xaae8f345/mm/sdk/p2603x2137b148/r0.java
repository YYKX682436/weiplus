package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes13.dex */
public final class r0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.t0 f274478d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.p314xaae8f345.mm.sdk.p2603x2137b148.t0 t0Var) {
        super(0);
        this.f274478d = t0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.net.wifi.WifiInfo wifiInfo = this.f274478d.f274513a;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(wifiInfo != null ? wifiInfo.getRssi() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConnectivityCompat", "getRssi " + valueOf.intValue());
        return valueOf;
    }
}
