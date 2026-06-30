package com.tencent.mars.comm;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class MultiNetLinkWaysUtil$resolveHostByCellularImpl$1$1 extends kotlin.jvm.internal.q implements yz5.a {
    final /* synthetic */ java.lang.Object $dnsTimer;
    final /* synthetic */ java.lang.String $host;
    final /* synthetic */ kotlin.jvm.internal.h0 $ip;
    final /* synthetic */ com.tencent.mars.comm.MultiNetLinkWaysUtil this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiNetLinkWaysUtil$resolveHostByCellularImpl$1$1(com.tencent.mars.comm.MultiNetLinkWaysUtil multiNetLinkWaysUtil, java.lang.String str, kotlin.jvm.internal.h0 h0Var, java.lang.Object obj) {
        super(0);
        this.this$0 = multiNetLinkWaysUtil;
        this.$host = str;
        this.$ip = h0Var;
        this.$dnsTimer = obj;
    }

    @Override // yz5.a
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        m46invoke();
        return jz5.f0.f302826a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m46invoke() {
        android.net.Network network;
        try {
            network = this.this$0.mMobileNetwork;
            kotlin.jvm.internal.o.d(network);
            java.net.InetAddress byName = network.getByName(this.$host);
            if (byName != null && byName.getHostAddress() != null) {
                kotlin.jvm.internal.h0 h0Var = this.$ip;
                java.lang.String hostAddress = byName.getHostAddress();
                kotlin.jvm.internal.o.d(hostAddress);
                h0Var.f310123d = hostAddress;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MultiNetLinkWaysUtil", "mMobileNetwork!!.getByName error msg:" + e17.getMessage());
        }
        java.lang.Object obj = this.$dnsTimer;
        synchronized (obj) {
            obj.notifyAll();
        }
    }
}
