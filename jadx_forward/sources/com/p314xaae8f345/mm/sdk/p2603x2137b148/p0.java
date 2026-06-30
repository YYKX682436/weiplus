package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes13.dex */
public final class p0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.t0 f274442d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(com.p314xaae8f345.mm.sdk.p2603x2137b148.t0 t0Var) {
        super(0);
        this.f274442d = t0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.net.wifi.WifiInfo wifiInfo = this.f274442d.f274513a;
        return java.lang.Integer.valueOf(wifiInfo != null ? wifiInfo.getIpAddress() : 0);
    }
}
