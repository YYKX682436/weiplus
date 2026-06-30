package ih3;

/* loaded from: classes4.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f373117d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f373118e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.p0 f373119f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ih3.e f373120g;

    public h(ih3.e eVar, java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        this.f373120g = eVar;
        this.f373117d = str;
        this.f373118e = map;
        this.f373119f = p0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        final java.lang.String str = this.f373117d;
        final java.util.Map map = this.f373118e;
        final com.p314xaae8f345.mm.p944x882e457a.p0 p0Var = this.f373119f;
        ih3.e eVar = this.f373120g;
        eVar.getClass();
        int i17 = 0;
        while (true) {
            try {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append("");
                sb6.append(i17 == 0 ? "" : java.lang.Integer.valueOf(i17));
                java.lang.String str2 = (java.lang.String) map.get((".sysmsg.sysmsgtemplate.content_template" + sb6.toString()) + ".$type");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    return;
                }
                java.util.HashSet hashSet = (java.util.HashSet) ((java.util.HashMap) eVar.f373101f).get(str2);
                if (hashSet != null) {
                    java.util.Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.b7 b7Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.b7) ((tg3.j1) it.next());
                        b7Var.getClass();
                        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6803x6d9acd6d c6803x6d9acd6d = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6803x6d9acd6d();
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.f7 f7Var = b7Var.f280252a;
                        c6803x6d9acd6d.p(f7Var.f280113d.f542255q);
                        c6803x6d9acd6d.q(f7Var.f280113d.x());
                        c6803x6d9acd6d.f141330f = 1L;
                        c6803x6d9acd6d.f141331g = 1L;
                        c6803x6d9acd6d.f141335k = 1L;
                        c6803x6d9acd6d.k();
                    }
                }
                fs.g.c(tg3.i1.class, str2, new fs.o() { // from class: ih3.e$$a
                    @Override // fs.o
                    public final boolean a(fs.n nVar) {
                        ((tg3.i1) nVar).Ra(str, map, p0Var);
                        return false;
                    }
                });
                i17++;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SysMsgTemplateImp", e17, "", new java.lang.Object[0]);
                return;
            }
        }
    }
}
