package fe3;

/* loaded from: classes7.dex */
public enum i {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f343085d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f343086e = new java.util.concurrent.ConcurrentHashMap();

    i() {
        fe3.g gVar = new fe3.g(this);
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().a(gVar);
    }

    public void a(oq1.q qVar, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.C16421xe4d4fcd c16421xe4d4fcd, java.lang.String str, jc3.m0 m0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.C16421xe4d4fcd c16421xe4d4fcd2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.C16421xe4d4fcd();
        if (c16421xe4d4fcd == null) {
            c16421xe4d4fcd2.f229391d = str;
            c16421xe4d4fcd2.f229398n = "default";
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16453x290f8fed scene = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16453x290f8fed.f37588x58f52ca8;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
            ((je3.i) i95.n0.c(je3.i.class)).Rg(str, c16421xe4d4fcd2.f229398n, c16421xe4d4fcd2.f229399o, c16421xe4d4fcd2.f229393f, 0, scene, 0, 0);
        } else {
            java.lang.String str2 = c16421xe4d4fcd.f229391d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16453x290f8fed scene2 = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16453x290f8fed.f37588x58f52ca8;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene2, "scene");
            ((je3.i) i95.n0.c(je3.i.class)).Rg(str2, c16421xe4d4fcd.f229398n, c16421xe4d4fcd.f229399o, c16421xe4d4fcd.f229393f, 0, scene2, 0, 0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t0 t0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t0(null);
        t0Var.f178689g = str;
        t0Var.f178683a = qVar.f428882d;
        t0Var.f178686d = qVar.f428883e;
        t0Var.f178688f = 2;
        t0Var.f178692j = false;
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        long b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().b(t0Var);
        ((java.util.concurrent.ConcurrentHashMap) this.f343086e).put(java.lang.Long.valueOf(b17), new fe3.h(this, "downloadMagicPkg", qVar, c16421xe4d4fcd != null ? c16421xe4d4fcd : c16421xe4d4fcd2, m0Var));
        this.f343085d.add(java.lang.Long.valueOf(b17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgDownloadPkg", "downloadMagicPkg:taskId:%s", java.lang.Long.valueOf(b17));
    }
}
