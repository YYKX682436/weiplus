package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public final class v7 extends ej4.r {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.w7 owner, java.lang.String userName) {
        super(owner, userName, null, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
    }

    @Override // ej4.r
    public void b() {
        xe0.l0 l0Var;
        java.lang.Object obj = a().get();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.w7 w7Var = obj instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.w7 ? (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.w7) obj : null;
        if (w7Var == null) {
            return;
        }
        java.lang.String str = w7Var.f281691f;
        if ((str == null || str.length() == 0) || w7Var.f280113d == null || (l0Var = (xe0.l0) i95.n0.c(xe0.l0.class)) == null) {
            return;
        }
        if (!di4.i.d()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingTextStatusHeaderComponent", "onTalkerStatusChanged skip: iconStyleUpgrade=false username=" + str);
            return;
        }
        boolean aj6 = ((we0.j1) l0Var).aj(str);
        if (aj6 == w7Var.f281692g) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingTextStatusHeaderComponent", "onTalkerStatusChanged migrate username=" + str + " oldHasStatus=" + w7Var.f281692g + " newHasStatus=" + aj6);
        w7Var.f281692g = aj6;
        try {
            yb5.d dVar = w7Var.f280113d;
            sb5.z0 z0Var = dVar != null ? (sb5.z0) dVar.f542241c.a(sb5.z0.class) : null;
            if (z0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingTextStatusHeaderComponent", "invokeUpdateStaticTitle skip: IHeaderComponent null");
            } else {
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) z0Var).C();
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChattingTextStatusHeaderComponent", th6, "invokeUpdateStaticTitle err", new java.lang.Object[0]);
        }
    }
}
