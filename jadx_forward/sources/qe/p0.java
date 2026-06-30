package qe;

/* loaded from: classes7.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t f443516d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.udp.p2634x32db7abc.C21331x7e0f8b18.NativeCallBackInterface f443517e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qe.s0 f443518f;

    public p0(qe.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t tVar, com.p314xaae8f345.mm.udp.p2634x32db7abc.C21331x7e0f8b18.NativeCallBackInterface nativeCallBackInterface) {
        this.f443518f = s0Var;
        this.f443516d = tVar;
        this.f443517e = nativeCallBackInterface;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.UdpNativeInstallHelper", "createUdpBinding InitCallBack ");
        qe.s0 s0Var = this.f443518f;
        if (s0Var.f443523a != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.UdpNativeInstallHelper", "createUdpBinding udpNative != null");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0 l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0) this.f443516d.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0.class);
        if (l0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.UdpNativeInstallHelper", "createUdpBinding v8Addon is null");
            return;
        }
        if (s0Var.f443524b) {
            s0Var.f443523a = new com.p314xaae8f345.mm.udp.p2634x32db7abc.C21331x7e0f8b18(l0Var.L(), l0Var.G(), l0Var.z());
        } else {
            s0Var.f443523a = new com.p314xaae8f345.mm.udp.p2634x32db7abc.C21331x7e0f8b18(l0Var.L(), l0Var.G(), 0L);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.UdpNativeInstallHelper", "createUdpBinding InitCallBack ret:%d", java.lang.Integer.valueOf(s0Var.f443523a.m78284x6c4032e7(this.f443517e)));
    }
}
