package b53;

/* loaded from: classes8.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f99614a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f99615b = new java.util.HashMap();

    public c(java.lang.String str) {
        this.f99614a = tx4.a.f504217a;
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ipc.C15884xdf196038 c15884xdf196038 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ipc.C15884xdf196038();
            c15884xdf196038.f221104g = 9;
            c15884xdf196038.f221103f.putString("game_hv_menu_appid", str);
            c15884xdf196038.s();
            java.lang.String string = c15884xdf196038.f221103f.getString("game_hv_menu_pbcache");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                byte[] bytes = string.getBytes(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3125x9fd75533.f11976x3730806a);
                r45.dv3 dv3Var = new r45.dv3();
                java.util.LinkedList linkedList = dv3Var.f454303d;
                dv3Var.mo11468x92b714fd(bytes);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
                    this.f99614a = linkedList;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.H5GameMenuHelp", "use net menu data");
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.H5GameMenuHelp", "get cache hv game menu fail! exception:%s", e17.getMessage());
        }
        java.util.Collections.sort(this.f99614a, new b53.b(this));
        int i17 = ((r45.rk4) this.f99614a.get(r5.size() - 1)).f466502i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i18 = 0; i18 < i17; i18++) {
            arrayList.add(null);
        }
        for (r45.rk4 rk4Var : this.f99614a) {
            int i19 = rk4Var.f466502i;
            if (i19 > 0 && i19 <= arrayList.size()) {
                arrayList.set(rk4Var.f466502i - 1, rk4Var);
            }
        }
        this.f99614a = arrayList;
        a(new b53.q(1));
        a(new b53.m(2));
        a(new b53.t(3));
        a(new b53.p(4));
        a(new b53.r(7));
        a(new b53.j(8));
        a(new b53.l(10));
    }

    public final void a(b53.a aVar) {
        this.f99615b.put(java.lang.Integer.valueOf(aVar.f99613a), aVar);
    }
}
