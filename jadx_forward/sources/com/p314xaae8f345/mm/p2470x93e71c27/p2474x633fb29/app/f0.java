package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes12.dex */
public final class f0 implements lt.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f270420a = new java.util.concurrent.ConcurrentHashMap();

    public f0(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e0 e0Var) {
    }

    public ot0.t a(long j17) {
        java.util.Iterator it = this.f270420a.keySet().iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.f0 f0Var = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.f0) ((lt.j0) it.next());
            if (f0Var.d(j17)) {
                return f0Var.a(j17);
            }
        }
        for (fs.q qVar : ((fs.c) fs.g.f(lt.k0.class)).all()) {
            if (((c63.j) ((lt.k0) qVar.get())).b(j17)) {
                ((c63.j) ((lt.k0) qVar.get())).getClass();
                c63.i iVar = new c63.i();
                iVar.f67328x297eb4f7 = j17;
                if (!((t53.m0) i95.n0.c(t53.m0.class)).Ni().get(iVar, new java.lang.String[0])) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLife.AppMessageInterceptor", "[get] msg:" + j17 + " not found!");
                    return null;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLife.AppMessageInterceptor", "[get] appId:" + iVar.f67326x28d45f97 + " title:" + iVar.f67330x29dd02d3 + " desc:" + iVar.f67327x4f4dc37 + " type:" + iVar.f67331x2262335f + " msgId:" + iVar.f67328x297eb4f7);
                ot0.t tVar = new ot0.t();
                tVar.f67763x28d45f97 = iVar.f67326x28d45f97;
                tVar.f67764x4f4dc37 = iVar.f67327x4f4dc37;
                tVar.f67765x297eb4f7 = iVar.f67328x297eb4f7;
                tVar.f67768x10639700 = iVar.f67329x10639700;
                tVar.f67769x29dd02d3 = iVar.f67330x29dd02d3;
                tVar.f67770x2262335f = iVar.f67331x2262335f;
                tVar.f67771x4b6e9352 = iVar.f67332x4b6e9352;
                return tVar;
            }
        }
        return null;
    }

    public boolean b(ot0.t tVar, boolean z17) {
        java.util.Iterator it = this.f270420a.keySet().iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.f0 f0Var = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.f0) ((lt.j0) it.next());
            if (f0Var.d(tVar.f67765x297eb4f7)) {
                return f0Var.b(tVar, z17);
            }
        }
        for (fs.q qVar : ((fs.c) fs.g.f(lt.k0.class)).all()) {
            if (((c63.j) ((lt.k0) qVar.get())).b(tVar.f67765x297eb4f7)) {
                c63.j jVar = (c63.j) ((lt.k0) qVar.get());
                jVar.getClass();
                boolean mo51731x24249762 = ((t53.m0) i95.n0.c(t53.m0.class)).Ni().mo51731x24249762(jVar.c(tVar), z17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLife.AppMessageInterceptor", "[insert ret:" + mo51731x24249762 + "] appid:" + tVar.f67763x28d45f97 + " title:" + tVar.f67769x29dd02d3 + " desc:" + tVar.f67764x4f4dc37 + " type:" + tVar.f67770x2262335f + " msgId:" + tVar.f67765x297eb4f7);
                return mo51731x24249762;
            }
        }
        return false;
    }

    public boolean c(ot0.t tVar, boolean z17) {
        java.util.Iterator it = this.f270420a.keySet().iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.f0 f0Var = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.f0) ((lt.j0) it.next());
            if (f0Var.d(tVar.f67765x297eb4f7)) {
                return f0Var.c(tVar, z17);
            }
        }
        for (fs.q qVar : ((fs.c) fs.g.f(lt.k0.class)).all()) {
            if (((c63.j) ((lt.k0) qVar.get())).b(tVar.f67765x297eb4f7)) {
                c63.j jVar = (c63.j) ((lt.k0) qVar.get());
                jVar.getClass();
                boolean mo55864x413cb2b4 = ((t53.m0) i95.n0.c(t53.m0.class)).Ni().mo55864x413cb2b4(jVar.c(tVar), z17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLife.AppMessageInterceptor", "[replace ret:" + mo55864x413cb2b4 + "] appid:" + tVar.f67763x28d45f97 + " title:" + tVar.f67769x29dd02d3 + " desc:" + tVar.f67764x4f4dc37 + " type:" + tVar.f67770x2262335f + " msgId:" + tVar.f67765x297eb4f7);
                return mo55864x413cb2b4;
            }
        }
        return false;
    }

    public boolean d(long j17) {
        java.util.Iterator it = this.f270420a.keySet().iterator();
        while (it.hasNext()) {
            if (((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.f0) ((lt.j0) it.next())).d(j17)) {
                return true;
            }
        }
        java.util.Iterator it6 = ((fs.c) fs.g.f(lt.k0.class)).all().iterator();
        while (it6.hasNext()) {
            if (((c63.j) ((lt.k0) ((fs.q) it6.next()).get())).b(j17)) {
                return true;
            }
        }
        return false;
    }

    public boolean e(ot0.t tVar, boolean z17, java.lang.String... keys) {
        java.util.Iterator it = this.f270420a.keySet().iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.f0 f0Var = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.f0) ((lt.j0) it.next());
            if (f0Var.d(tVar.f67765x297eb4f7)) {
                return f0Var.e(tVar, z17, keys);
            }
        }
        for (fs.q qVar : ((fs.c) fs.g.f(lt.k0.class)).all()) {
            if (((c63.j) ((lt.k0) qVar.get())).b(tVar.f67765x297eb4f7)) {
                c63.j jVar = (c63.j) ((lt.k0) qVar.get());
                jVar.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keys, "keys");
                boolean mo51732xbf274172 = ((t53.m0) i95.n0.c(t53.m0.class)).Ni().mo51732xbf274172(jVar.c(tVar), z17, (java.lang.String[]) java.util.Arrays.copyOf(keys, keys.length));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLife.AppMessageInterceptor", "[update ret:" + mo51732xbf274172 + "] appid:" + tVar.f67763x28d45f97 + " title:" + tVar.f67769x29dd02d3 + " desc:" + tVar.f67764x4f4dc37 + " type:" + tVar.f67770x2262335f + " msgId:" + tVar.f67765x297eb4f7);
                return mo51732xbf274172;
            }
        }
        return false;
    }
}
