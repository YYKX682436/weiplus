package hm;

/* loaded from: classes5.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg3.l0 f363689d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(xg3.l0 l0Var) {
        super(0);
        this.f363689d = l0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.ArrayList arrayList;
        xg3.l0 l0Var = this.f363689d;
        if (l0Var != null && (arrayList = l0Var.f535945c) != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next();
                if (f9Var.A0() == 1) {
                    w11.c1 c1Var = w11.c1.f523522a;
                    int P0 = f9Var.P0();
                    if (P0 == 2 || P0 == 5) {
                        java.util.HashMap hashMap = w11.c1.f523523b;
                        synchronized (hashMap) {
                            com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5 = new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(f9Var.m124847x74d37ac6(), f9Var.Q0());
                            w11.b1 b1Var = (w11.b1) hashMap.get(c16564xb55e1d5);
                            if (b1Var != null && b1Var.f523516a && b1Var.f523518c == -1) {
                                hashMap.remove(c16564xb55e1d5);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RevokeMsgManager", "onMsgSendFinished() called remove msgIdTalker:" + c16564xb55e1d5 + " , status:" + P0 + " preStatus:" + b1Var);
                            }
                        }
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
