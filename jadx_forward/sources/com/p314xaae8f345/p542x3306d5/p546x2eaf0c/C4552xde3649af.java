package com.p314xaae8f345.p542x3306d5.p546x2eaf0c;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.tencent.mars.comm.MultiNetLinkWaysUtil$resolveHostByCellularImpl$1$1 */
/* loaded from: classes13.dex */
public final class C4552xde3649af extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: $dnsTimer */
    final /* synthetic */ java.lang.Object f19262xf190ffc0;

    /* renamed from: $host */
    final /* synthetic */ java.lang.String f19263x22c43cc;
    final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 $ip;

    /* renamed from: this$0 */
    final /* synthetic */ com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4551xb30b7784 f19264xcbdd23aa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4552xde3649af(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4551xb30b7784 c4551xb30b7784, java.lang.String str, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.lang.Object obj) {
        super(0);
        this.f19264xcbdd23aa = c4551xb30b7784;
        this.f19263x22c43cc = str;
        this.$ip = h0Var;
        this.f19262xf190ffc0 = obj;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ java.lang.Object mo152xb9724478() {
        m40056xb9724478();
        return jz5.f0.f384359a;
    }

    /* renamed from: invoke */
    public final void m40056xb9724478() {
        android.net.Network network;
        try {
            network = this.f19264xcbdd23aa.mMobileNetwork;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(network);
            java.net.InetAddress byName = network.getByName(this.f19263x22c43cc);
            if (byName != null && byName.getHostAddress() != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.$ip;
                java.lang.String hostAddress = byName.getHostAddress();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hostAddress);
                h0Var.f391656d = hostAddress;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MultiNetLinkWaysUtil", "mMobileNetwork!!.getByName error msg:" + e17.getMessage());
        }
        java.lang.Object obj = this.f19262xf190ffc0;
        synchronized (obj) {
            obj.notifyAll();
        }
    }
}
