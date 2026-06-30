package gk5;

/* loaded from: classes9.dex */
public final class x0 extends m50.x {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // m50.x
    public co.a V6() {
        return new oe5.a();
    }

    @Override // m50.x
    public java.lang.String W6() {
        java.lang.String m126747x696739c;
        e15.k j17 = ((oe5.a) c7()).j();
        return (j17 == null || (m126747x696739c = j17.m126747x696739c()) == null) ? "" : m126747x696739c;
    }

    @Override // m50.x
    public int b7() {
        return 49;
    }

    @Override // m50.x
    public boolean k7(xi5.e action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((gk5.m1) pf5.z.f435481a.a(activity).a(gk5.m1.class)).W6(action);
        return true;
    }

    @Override // m50.x
    public void o7(java.lang.String toUser) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        m11.l0 Di = m11.b1.Di();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 e76 = e7();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 e77 = e7();
        byte[] N = com.p314xaae8f345.mm.vfs.w6.N(Di.D2(e76, e77 != null ? e77.z0() : null, true), 0, -1);
        ot0.q Z6 = Z6();
        if (Z6 != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 e78 = e7();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.h(Z6.f430227p);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Z6.A)) {
                h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.o(e78, Z6.f430227p);
            }
            java.lang.String str2 = "";
            if (h17 != null && (str = h17.f68099xfeae815) != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "")) {
                str2 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.f(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.k(), Z6.f430187f, Z6.f430223o);
                com.p314xaae8f345.mm.vfs.w6.c(h17.f68099xfeae815, str2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardTingChatRoomUIC", "summerbig send old path[%s], title[%s] attachPath[%s]， finish[%b]", h17.f68099xfeae815, Z6.f430187f, str2, java.lang.Boolean.valueOf(h17.t0()));
            }
            java.lang.String str3 = str2;
            ot0.q i17 = ot0.q.i(Z6);
            i17.f430239s = 3;
            java.lang.String str4 = Z6.f430179d;
            java.lang.String str5 = Z6.H;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e78);
            java.lang.String v17 = c01.ia.v(e78.G);
            oe5.a aVar = (oe5.a) c7();
            long m75942xfb822ef2 = aVar.m75942xfb822ef2(aVar.f125235d + 0);
            oe5.a aVar2 = (oe5.a) c7();
            java.lang.Object obj = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.K(i17, str4, str5, toUser, str3, N, "", "", v17, new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(m75942xfb822ef2, aVar2.m75945x2fec8307(aVar2.f125235d + 1))).second;
            if (obj != null) {
                com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.O6(toUser, (java.lang.Long) obj);
            }
        }
    }
}
