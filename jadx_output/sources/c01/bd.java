package c01;

/* loaded from: classes11.dex */
public class bd implements com.tencent.mm.modelbase.i1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f37072d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f37073e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f37074f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f37075g = new java.util.concurrent.ConcurrentHashMap();

    public void b(java.lang.String str, c01.zc zcVar, boolean z17) {
        java.util.List list;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || zcVar == null) {
            return;
        }
        java.util.Map map = z17 ? this.f37073e : this.f37072d;
        synchronized (map) {
            list = (java.util.List) map.get(str);
            if (list == null) {
                list = new java.util.LinkedList();
                map.put(str, list);
            }
        }
        synchronized (list) {
            if (!list.contains(zcVar)) {
                list.add(zcVar);
            }
        }
    }

    @Override // com.tencent.mm.modelbase.t0
    public com.tencent.mm.modelbase.q0 b1(com.tencent.mm.modelbase.p0 p0Var) {
        java.util.Map d17;
        java.lang.String str;
        java.util.List list;
        r45.j4 j4Var = p0Var.f70726a;
        int i17 = j4Var.f377560g;
        if (i17 == 10001) {
            f(x51.j1.g(j4Var.f377558e), p0Var, false);
            jx3.f.INSTANCE.kvStat(10395, java.lang.String.valueOf(j4Var.f377568r));
            return null;
        }
        if (i17 != 10002) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SysCmdMsgExtension", "cmdAM msgType is %d, ignore, return now", java.lang.Integer.valueOf(i17));
            return null;
        }
        java.lang.String g17 = x51.j1.g(j4Var.f377561h);
        if (com.tencent.mm.sdk.platformtools.t8.K0(g17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SysCmdMsgExtension", "null msg content");
            return null;
        }
        if (g17.startsWith("~SEMI_XML~")) {
            d17 = com.tencent.mm.sdk.platformtools.p7.a(g17);
            if (d17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SysCmdMsgExtension", "SemiXml values is null, msgContent %s", g17);
                return null;
            }
            str = "brand_service";
        } else {
            int indexOf = g17.indexOf("<sysmsg");
            if (indexOf != -1) {
                d17 = com.tencent.mm.sdk.platformtools.aa.d(g17.substring(indexOf), "sysmsg", null);
                if (d17 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SysCmdMsgExtension", "XmlParser values is null, msgContent %s", g17);
                    return null;
                }
                str = (java.lang.String) d17.get(".sysmsg.$type");
            } else {
                int indexOf2 = g17.indexOf("<appmsg");
                if (indexOf2 == -1) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SysCmdMsgExtension", "msgContent not start with <sysmsg or <appmsg");
                    return null;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.SysCmdMsgExtension", "msgContent start with <appmsg");
                d17 = com.tencent.mm.sdk.platformtools.aa.d(g17.substring(indexOf2), "appmsg", null);
                if (d17 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SysCmdMsgExtension", "XmlParser values is null, msgContent %s", g17);
                    return null;
                }
                str = (java.lang.String) d17.get(".appmsg.title");
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SysCmdMsgExtension", "recieve a syscmd_newxml %s subType %s", g17, str);
        if (str != null) {
            boolean z17 = mm.w.f328542a;
            mm.w.d("MicroMsg.NotifyPowerInspector", "noteAddXmlMsgType: type=".concat(str));
            if (com.tencent.mm.sdk.platformtools.x2.n() && com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE.isBackground()) {
                mm.y yVar = mm.w.f328553l;
                if (yVar.b() || !mm.w.f328543b) {
                    yVar.c(str);
                }
            }
            f(str, p0Var, true);
            synchronized (this.f37074f) {
                list = (java.util.List) ((java.util.HashMap) this.f37074f).get(str);
            }
            java.lang.Iterable all = ((fs.c) fs.g.f(vg3.r4.class)).all();
            if ((list == null || list.isEmpty()) && !((fs.e) all).iterator().hasNext()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.SysCmdMsgExtension", "listener list is empty, return now");
                bm5.b1.b(bm5.f1.a(), str);
            } else {
                java.util.Iterator it = ((fs.e) all).iterator();
                boolean z18 = false;
                while (it.hasNext()) {
                    fs.q qVar = (fs.q) it.next();
                    if (qVar.hasNoKeys() || qVar.hasKey(str)) {
                        vg3.r4 r4Var = (vg3.r4) qVar.get();
                        if (r4Var != null) {
                            r4Var.h0(str, d17, p0Var);
                            if (!z18) {
                                z18 = true;
                            }
                        } else {
                            com.tencent.mars.xlog.Log.e("MicroMsg.SysCmdMsgExtension", "%s returns null, skip notifying.", qVar);
                        }
                    }
                }
                if (list != null) {
                    synchronized (list) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SysCmdMsgExtension", "listener list size is %d", java.lang.Integer.valueOf(list.size()));
                        java.util.Iterator it6 = list.iterator();
                        while (it6.hasNext()) {
                            ((vg3.d4) it6.next()).h0(str, d17, p0Var);
                        }
                    }
                    z18 = true;
                }
                if (!z18) {
                    bm5.b1.b(bm5.f1.a(), str);
                }
            }
            vg3.c4 c4Var = (vg3.c4) ((java.util.concurrent.ConcurrentHashMap) this.f37075g).get(str);
            if (c4Var != null) {
                ((c01.c0) c4Var).a(str, d17, p0Var);
                return null;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.SysCmdMsgExtension", "no NewXmlConsumer to consume cmd %s!!", str);
            for (fs.q qVar2 : ((fs.c) fs.g.f(vg3.q4.class)).all()) {
                if (qVar2.hasKey(str)) {
                    return ((vg3.q4) qVar2.get()).k7(str, d17, p0Var);
                }
            }
            java.lang.String a17 = bm5.f1.a();
            if (!bm5.b1.a(str)) {
                try {
                    java.util.Set set = bm5.b1.f22537b;
                    if (!((java.util.HashSet) set).contains(str)) {
                        synchronized (set) {
                            if (!((java.util.HashSet) set).contains(str)) {
                                try {
                                    java.util.concurrent.locks.Lock lock = bm5.b1.f22542g;
                                    lock.lock();
                                    ((java.util.HashSet) set).add(str);
                                    lock.unlock();
                                } catch (java.lang.Throwable th6) {
                                    bm5.b1.f22542g.unlock();
                                    throw th6;
                                }
                            }
                        }
                    }
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MissingMessageListenerReporter", th7, "fail to call reportMissingINewXmlConsumer(%s,%s)", a17, str);
                }
            }
            java.lang.String a18 = bm5.f1.a();
            java.util.concurrent.locks.Lock lock2 = bm5.b1.f22541f;
            if (!bm5.b1.a(str)) {
                try {
                    lock2.lock();
                    if (((java.util.HashSet) bm5.b1.f22537b).contains(str) && ((java.util.HashSet) bm5.b1.f22538c).contains(str) && ((java.util.HashSet) bm5.b1.f22539d).contains(str) && bm5.b1.f22536a.b("reportMissingAllNewXmlHandlerOnDemand")) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MissingMessageListenerReporter", java.lang.String.format("%s;%s", "<AllNewXmlHandler>", str));
                    }
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }
        return null;
    }

    public void c(java.lang.String str, vg3.d4 d4Var) {
        java.util.List list;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || d4Var == null) {
            return;
        }
        synchronized (this.f37074f) {
            list = (java.util.List) ((java.util.HashMap) this.f37074f).get(str);
            if (list == null) {
                list = new java.util.LinkedList();
                ((java.util.HashMap) this.f37074f).put(str, list);
            }
        }
        synchronized (list) {
            if (!list.contains(d4Var)) {
                list.add(d4Var);
            }
        }
    }

    public final void f(java.lang.String str, com.tencent.mm.modelbase.p0 p0Var, boolean z17) {
        java.util.List list;
        java.util.Map map = z17 ? this.f37073e : this.f37072d;
        synchronized (map) {
            list = (java.util.List) map.get(str);
        }
        boolean z18 = false;
        if (z17) {
            java.lang.Iterable all = ((fs.c) fs.g.f(c01.yc.class)).all();
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.util.Iterator it = ((fs.e) all).iterator();
            while (it.hasNext()) {
                fs.q qVar = (fs.q) it.next();
                if (!fs.g.e(context, qVar)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.SysCmdMsgExtension", "Listener (%s) is not registered in current process.", qVar);
                } else if (qVar.hasNoKeys() || qVar.hasKey(str)) {
                    c01.yc ycVar = (c01.yc) qVar.get();
                    if (ycVar != null) {
                        ycVar.O0(p0Var);
                        if (!z18) {
                            z18 = true;
                        }
                    } else {
                        com.tencent.mars.xlog.Log.e("MicroMsg.SysCmdMsgExtension", "%s returns null, skip notifying.", qVar);
                    }
                }
            }
        } else {
            java.util.Iterator it6 = ((fs.e) ((fs.c) fs.g.f(c01.xc.class)).all()).iterator();
            while (it6.hasNext()) {
                fs.q qVar2 = (fs.q) it6.next();
                if (qVar2.hasKey(str)) {
                    ((jf3.p) ((c01.xc) qVar2.get())).getClass();
                    java.lang.String g17 = x51.j1.g(p0Var.f70726a.f377561h);
                    com.tencent.mars.xlog.Log.i("MicroMsg.MassSendSysCmdMsgListener", "MassSendTopConfXml:" + g17);
                    if3.k0.Bi().d(g17);
                    if3.k0.Bi().a();
                    if3.a0 Bi = if3.k0.Bi();
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    Bi.getClass();
                    c01.d9.b().p().w(102409, java.lang.Long.valueOf(currentTimeMillis));
                }
            }
        }
        if (list == null || list.isEmpty()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SysCmdMsgExtension", "listener list is empty, return now");
            if (!z17 || z18) {
                return;
            }
            bm5.b1.c(bm5.f1.a(), str);
            return;
        }
        boolean z19 = z17 ? true : z18;
        com.tencent.mars.xlog.Log.i("MicroMsg.SysCmdMsgExtension", "listener list size is %d", java.lang.Integer.valueOf(list.size()));
        java.util.Iterator it7 = list.iterator();
        while (it7.hasNext()) {
            ((c01.zc) it7.next()).O0(p0Var);
        }
        if (z19) {
            return;
        }
        bm5.b1.c(bm5.f1.a(), str);
    }

    public void h(java.lang.String str, c01.zc zcVar, boolean z17) {
        java.util.List list;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || zcVar == null) {
            return;
        }
        java.util.Map map = z17 ? this.f37073e : this.f37072d;
        synchronized (map) {
            list = (java.util.List) map.get(str);
        }
        if (list != null) {
            synchronized (list) {
                list.remove(zcVar);
            }
        }
    }

    public void i(java.lang.String str, vg3.d4 d4Var) {
        java.util.List list;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || d4Var == null) {
            return;
        }
        synchronized (this.f37074f) {
            list = (java.util.List) ((java.util.HashMap) this.f37074f).get(str);
        }
        if (list != null) {
            synchronized (list) {
                list.remove(d4Var);
            }
        }
    }

    @Override // com.tencent.mm.modelbase.t0
    public void x5(com.tencent.mm.modelbase.r0 r0Var) {
        java.lang.String str;
        java.util.List list;
        if (r0Var == null || (str = r0Var.f70760d) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SysCmdMsgExtension", "delete subType:%s, msgId:%s", str, r0Var.f70761e);
        java.lang.String str2 = r0Var.f70760d;
        java.util.Map map = this.f37073e;
        synchronized (map) {
            list = (java.util.List) ((java.util.HashMap) map).get(str2);
        }
        java.lang.Iterable all = ((fs.c) fs.g.f(c01.yc.class)).all();
        if ((list == null || list.isEmpty()) && !((fs.e) all).iterator().hasNext()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SysCmdMsgExtension", "listener list is empty, return now");
            return;
        }
        java.util.Iterator it = ((fs.e) all).iterator();
        while (it.hasNext()) {
            fs.q qVar = (fs.q) it.next();
            if (qVar.hasNoKeys() || qVar.hasKey(str2)) {
                c01.yc ycVar = (c01.yc) qVar.get();
                if (ycVar != null) {
                    ycVar.g1(r0Var);
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SysCmdMsgExtension", "%s returns null, skip notifying.", qVar);
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SysCmdMsgExtension", "listener list size is %d", java.lang.Integer.valueOf(list.size()));
        java.util.Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            ((c01.zc) it6.next()).g1(r0Var);
        }
    }
}
