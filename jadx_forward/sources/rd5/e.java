package rd5;

/* loaded from: classes9.dex */
public abstract class e {
    public static final boolean a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 oldMsg, com.p314xaae8f345.mm.p2621x8fb0427b.f9 newMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldMsg, "oldMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newMsg, "newMsg");
        jz5.g gVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.m.f279968a;
        if (((mb5.a) ((jz5.n) com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.m.f279968a).mo141623x754a37bb()).f407026a.contains(java.lang.Integer.valueOf(oldMsg.mo78013xfb85f7b0())) || !oldMsg.m124846x5c5a33d4(newMsg)) {
            return false;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.a9 a9Var = oldMsg.f275460g2;
        com.p314xaae8f345.mm.p2621x8fb0427b.a9 a9Var2 = newMsg.f275460g2;
        return (a9Var != null || a9Var2 != null) ? (a9Var == null || a9Var2 == null) ? false : a9Var.U(a9Var2) : true;
    }
}
