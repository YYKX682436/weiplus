package qe;

/* loaded from: classes7.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t f443499d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.tcp.p2626x32db76dc.C21324x81e9ef38.NativeCallBackInterface f443500e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qe.m0 f443501f;

    public j0(qe.m0 m0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t tVar, com.p314xaae8f345.mm.tcp.p2626x32db76dc.C21324x81e9ef38.NativeCallBackInterface nativeCallBackInterface) {
        this.f443501f = m0Var;
        this.f443499d = tVar;
        this.f443500e = nativeCallBackInterface;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.TcpNativeInstallHelper", "createTcpBinding InitCallBack ");
        qe.m0 m0Var = this.f443501f;
        if (m0Var.f443508a != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.TcpNativeInstallHelper", "createTcpBinding tcpNative != null");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0 l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0) this.f443499d.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0.class);
        if (l0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.TcpNativeInstallHelper", "createTcpBinding v8Addon is null");
            return;
        }
        if (m0Var.f443509b) {
            m0Var.f443508a = new com.p314xaae8f345.mm.tcp.p2626x32db76dc.C21324x81e9ef38(l0Var.L(), l0Var.G(), l0Var.z());
        } else {
            m0Var.f443508a = new com.p314xaae8f345.mm.tcp.p2626x32db76dc.C21324x81e9ef38(l0Var.L(), l0Var.G(), 0L);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.TcpNativeInstallHelper", "createTcpBinding InitCallBack ret:%d", java.lang.Integer.valueOf(m0Var.f443508a.m78204x6c4032e7(this.f443500e)));
    }
}
