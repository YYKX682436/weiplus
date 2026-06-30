package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4;

/* loaded from: classes4.dex */
public final class x0 {
    public x0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(java.lang.String str, java.lang.String str2, java.util.LinkedList linkedList) {
        r45.f9 f9Var = new r45.f9();
        f9Var.f455641d = str;
        f9Var.f455642e = str2;
        linkedList.add(f9Var);
    }

    public final void b(r45.d9 d9Var) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = d9Var;
        lVar.f152198b = new r45.e9();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/appmsg/appmsg_report";
        lVar.f152200d = 1870;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(lVar.a(), com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.w0.f267364a);
    }

    public final void c(int i17, java.util.LinkedList linkedList) {
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() >= 1 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
            return;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            java.lang.String str = ((r45.f9) it.next()).f455641d;
        }
    }

    public final void d(int i17, int i18, java.lang.String vid, java.lang.String url, int i19, int i27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vid, "vid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        r45.d9 d9Var = new r45.d9();
        r45.c9 c9Var = new r45.c9();
        c9Var.f452913d = 2;
        java.util.LinkedList item = c9Var.f452914e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(item, "item");
        a("Vid", vid, item);
        java.lang.String m40061x1de3608b = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40061x1de3608b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(item, "item");
        a("Network", m40061x1de3608b, item);
        java.lang.String valueOf = java.lang.String.valueOf(i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(item, "item");
        a("SharePageType", valueOf, item);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(item, "item");
        a("ContentUrl", url, item);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(item, "item");
        a("#AppMsgUrl#", url, item);
        java.lang.String valueOf2 = java.lang.String.valueOf(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(item, "item");
        a("ActionType", valueOf2, item);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(item, "item");
        a("SessionId", "" + i19, item);
        java.lang.String valueOf3 = java.lang.String.valueOf(i27);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(item, "item");
        a("EnterId", valueOf3, item);
        d9Var.f453775d.add(c9Var);
        b(d9Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(item, "item");
        c(10380, item);
    }

    public final void e(int i17, java.lang.String vid, java.lang.String url, int i18, int i19, int i27, int i28) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vid, "vid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        r45.d9 d9Var = new r45.d9();
        r45.c9 c9Var = new r45.c9();
        c9Var.f452913d = 3;
        java.util.LinkedList item = c9Var.f452914e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(item, "item");
        a("#AppMsgUrl#", url, item);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(item, "item");
        a("VideoId", vid, item);
        java.lang.String valueOf = java.lang.String.valueOf(i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(item, "item");
        a("Scene", valueOf, item);
        java.lang.String valueOf2 = java.lang.String.valueOf(i19);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(item, "item");
        a("SubScene", valueOf2, item);
        java.lang.String valueOf3 = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(item, "item");
        a("ClientId", valueOf3, item);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(item, "item");
        a("SessionId", "" + i27, item);
        java.lang.String valueOf4 = java.lang.String.valueOf(i28);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(item, "item");
        a("EnterId", valueOf4, item);
        java.lang.String valueOf5 = java.lang.String.valueOf(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(item, "item");
        a("EventType", valueOf5, item);
        d9Var.f453775d.add(c9Var);
        b(d9Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(item, "item");
        c(17537, item);
    }
}
