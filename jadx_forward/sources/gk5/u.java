package gk5;

/* loaded from: classes9.dex */
public final class u extends m50.x {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // m50.x
    public co.a V6() {
        return new jd5.b();
    }

    @Override // m50.x
    public boolean k7(xi5.e action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        return false;
    }

    @Override // m50.x
    public void o7(java.lang.String toUser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        java.util.LinkedList<oi3.g> j17 = ((jd5.b) c7()).j();
        if (j17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (oi3.g gVar : j17) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = pt0.f0.f439742b1.k(gVar.m75945x2fec8307(gVar.f427150d + 3), gVar.m75942xfb822ef2(gVar.f427150d + 0));
                if (k17 != null) {
                    arrayList.add(k17);
                }
            }
            java.util.ArrayList<com.p314xaae8f345.mm.p2621x8fb0427b.f9> arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) obj;
                if (!(g95.e0.h(f9Var) || f9Var.P2())) {
                    arrayList2.add(obj);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "processForward, original size: " + arrayList.size() + ", forwardable size: " + arrayList2.size());
            if (arrayList2.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "processForward, no forwardable msg, return");
                return;
            }
            int size = arrayList2.size();
            k50.n nVar = k50.s.f385789t;
            if (size < 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "processForward, forwardable < 3, fallback to single forward without groupId");
                for (com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 : arrayList2) {
                    if (f9Var2.J2()) {
                        nVar.a(f9Var2, toUser, null, null);
                    } else if (f9Var2.m78014x7b98c171()) {
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.G(m80379x76847179(), toUser, f9Var2, "");
                    }
                }
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "processForward, forwardable >= 3, continue media group forward");
            byte[] bytes = (java.util.UUID.randomUUID().toString() + c01.id.c()).getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            java.lang.String g17 = kk.k.g(bytes);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getMessageDigest(...)");
            java.lang.String f17 = dh3.c.f314022a.f(toUser, dh3.d.f314029e);
            java.lang.String str = f17 != null ? f17 : "";
            for (com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var3 : arrayList2) {
                dh3.c.f314022a.j(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(f9Var3.m124847x74d37ac6(), f9Var3.Q0()), toUser, str);
                if (f9Var3.J2()) {
                    nVar.a(f9Var3, toUser, null, g17);
                } else if (f9Var3.m78014x7b98c171()) {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.G(m80379x76847179(), toUser, f9Var3, g17);
                }
            }
        }
    }
}
