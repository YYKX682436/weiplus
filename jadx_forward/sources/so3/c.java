package so3;

/* loaded from: classes8.dex */
public final class c implements vg3.a5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f492279d = new java.util.ArrayList();

    @Override // vg3.a
    public void b(com.p314xaae8f345.mm.p944x882e457a.p0 addMsgInfo, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.util.Map map) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(addMsgInfo, "addMsgInfo");
        if (map == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoverSubscribeNotifyMsgInterceptor", "afterMsgInsert, contentValues is null");
            return;
        }
        java.lang.String str = (java.lang.String) map.get(".msg.appmsg.extinfo.subscribe_cover_notify.subscribe_cover_msg_type");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(str, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoverSubscribeNotifyMsgInterceptor", "subscribe cover msgType: " + D1);
        java.lang.String str2 = (java.lang.String) map.get(".msg.fromusername");
        if (str2 == null) {
            str2 = "";
        }
        if (!(str2.length() == 0)) {
            synchronized ("MicroMsg.CoverSubscribeNotifyMsgInterceptor") {
                if (this.f492279d.contains(str2)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoverSubscribeNotifyMsgInterceptor", "request exists, username: ".concat(str2));
                } else if (((tg3.v0) i95.n0.c(tg3.v0.class)) == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoverSubscribeNotifyMsgInterceptor", "contactCommDisplayService is null");
                } else {
                    java.lang.String e17 = c01.a2.e(str2);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e17);
                        if (str2.contentEquals(e17)) {
                            synchronized ("MicroMsg.CoverSubscribeNotifyMsgInterceptor") {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoverSubscribeNotifyMsgInterceptor", "prepare sync contact, username: ".concat(str2));
                                this.f492279d.add(str2);
                            }
                            ((ku5.t0) ku5.t0.f394148d).q(new so3.b(this, str2));
                        }
                    }
                }
            }
        }
        if (D1 != 0) {
            java.lang.String str3 = (java.lang.String) map.get(".msg.appmsg.extinfo.subscribe_cover_notify.need_notify");
            if (str3 == null) {
                str3 = "";
            }
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(str3, 0) == 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoverSubscribeNotifyMsgInterceptor", "need notify: " + z18);
            if (z18) {
                oo3.j jVar = (oo3.j) i95.n0.c(oo3.j.class);
                c01.m8 m8Var = jVar != null ? ((mo3.g) jVar).f411940d : null;
                if (m8Var instanceof c01.v8) {
                    ((c01.v8) m8Var).a(f9Var);
                }
            }
        }
    }

    @Override // vg3.a
    public boolean c(com.p314xaae8f345.mm.p944x882e457a.p0 addMsgInfo, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.util.Map map) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(addMsgInfo, "addMsgInfo");
        return true;
    }
}
