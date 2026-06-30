package bk4;

/* loaded from: classes5.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg3.l0 f103013d;

    public h0(xg3.l0 l0Var) {
        this.f103013d = l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            bk4.k0 k0Var = bk4.k0.f103035a;
            bk4.k0.a(k0Var);
            bk4.k0.b(k0Var, this.f103013d);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TextStatus.TextStatusDNDUtils", e17, "TextStatusDNDUtils handleMsgNotify Error", new java.lang.Object[0]);
        }
    }
}
