package com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2;

/* loaded from: classes11.dex */
public final class g implements l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.ActivityC22395xe70a9721.UnreadConversationFmUI f289671d;

    public g(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.ActivityC22395xe70a9721.UnreadConversationFmUI unreadConversationFmUI) {
        this.f289671d = unreadConversationFmUI;
    }

    @Override // l75.z0
    public final void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.s sVar;
        yf5.x d17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe;
        if ((obj instanceof java.lang.String) && (a1Var instanceof com.p314xaae8f345.mm.p2621x8fb0427b.l8)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UnreadConversationFmUI", "ConversationStorageEvent event=" + i17 + ", username=" + obj);
            sVar = this.f289671d.dataSource;
            if (sVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dataSource");
                throw null;
            }
            java.lang.String username = (java.lang.String) obj;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
            if (i17 != 2 && i17 != 3 && i17 != 4) {
                if (i17 == 5 && (c16718x7059cefe = sVar.f289691e) != null) {
                    c16718x7059cefe.s(username);
                    return;
                }
                return;
            }
            p75.m a17 = g95.x.f351360a.a(dm.i2.L.j(username).c(dm.i2.W.m()));
            p75.i0 i18 = dm.i2.K.i();
            i18.f434190d = a17;
            com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.l4) i18.a().o(((jm0.l) ((jz5.n) sVar.f289692f).mo141623x754a37bb()).Q4(), com.p314xaae8f345.mm.p2621x8fb0427b.l4.class);
            if (l4Var != null) {
                int d18 = l4Var.d1();
                java.util.Set set = sVar.f289693g;
                if ((d18 > 0 || set.contains(l4Var.h1())) && (d17 = sVar.f289690d.d(l4Var, null)) != null) {
                    if (d17.f543547z == 2 || set.contains(l4Var.h1())) {
                        java.lang.String h17 = l4Var.h1();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "getUsername(...)");
                        set.add(h17);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe2 = sVar.f289691e;
                        if (c16718x7059cefe2 != null) {
                            c16718x7059cefe2.y(d17, true);
                        }
                    }
                }
            }
        }
    }
}
