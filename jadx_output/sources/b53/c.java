package b53;

/* loaded from: classes8.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f18081a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f18082b = new java.util.HashMap();

    public c(java.lang.String str) {
        this.f18081a = tx4.a.f422684a;
        try {
            com.tencent.mm.plugin.game.luggage.ipc.CommonLogicTask commonLogicTask = new com.tencent.mm.plugin.game.luggage.ipc.CommonLogicTask();
            commonLogicTask.f139571g = 9;
            commonLogicTask.f139570f.putString("game_hv_menu_appid", str);
            commonLogicTask.s();
            java.lang.String string = commonLogicTask.f139570f.getString("game_hv_menu_pbcache");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                byte[] bytes = string.getBytes(com.tencent.kinda.framework.app.KindaConfigCacheStg.SAVE_CHARSET);
                r45.dv3 dv3Var = new r45.dv3();
                java.util.LinkedList linkedList = dv3Var.f372770d;
                dv3Var.parseFrom(bytes);
                if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
                    this.f18081a = linkedList;
                    com.tencent.mars.xlog.Log.i("MicroMsg.H5GameMenuHelp", "use net menu data");
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.H5GameMenuHelp", "get cache hv game menu fail! exception:%s", e17.getMessage());
        }
        java.util.Collections.sort(this.f18081a, new b53.b(this));
        int i17 = ((r45.rk4) this.f18081a.get(r5.size() - 1)).f384969i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i18 = 0; i18 < i17; i18++) {
            arrayList.add(null);
        }
        for (r45.rk4 rk4Var : this.f18081a) {
            int i19 = rk4Var.f384969i;
            if (i19 > 0 && i19 <= arrayList.size()) {
                arrayList.set(rk4Var.f384969i - 1, rk4Var);
            }
        }
        this.f18081a = arrayList;
        a(new b53.q(1));
        a(new b53.m(2));
        a(new b53.t(3));
        a(new b53.p(4));
        a(new b53.r(7));
        a(new b53.j(8));
        a(new b53.l(10));
    }

    public final void a(b53.a aVar) {
        this.f18082b.put(java.lang.Integer.valueOf(aVar.f18080a), aVar);
    }
}
