package b83;

/* loaded from: classes11.dex */
public class j extends hy5.a {
    @Override // hy5.a, hy5.b
    public boolean a() {
        return super.a();
    }

    @Override // hy5.a, hy5.b
    public void b(java.util.Map map) {
        y73.z.d(2);
        java.lang.String str = lp0.a.f320256j;
        java.lang.String a17 = lp0.a.a();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.lang.String str2 : map.keySet()) {
            r45.e35 e35Var = new r45.e35();
            e35Var.f372968d = str2;
            e35Var.f372969e = (java.lang.String) map.get(str2);
            linkedList.add(e35Var);
        }
        z73.h.a(linkedList);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.e35 e35Var2 = (r45.e35) it.next();
            sb6.append(e35Var2.f372968d);
            sb6.append(":");
            sb6.append(e35Var2.f372969e);
            sb6.append("\n");
        }
        com.tencent.mars.xlog.Log.i("Tinker.TinkerPatchRequestCallback", "checkAvailableUpdate BaseID:%s PatchID:%s config:%s", str, a17, sb6.toString());
        gm0.j1.d().g(new z73.g(str, a17, linkedList, true));
    }

    @Override // hy5.a, hy5.b
    public void c() {
        fy5.a.d().c("uin", java.lang.String.valueOf(gm0.m.i() & io.flutter.embedding.android.KeyboardMap.kValueMask)).c("network", java.lang.String.valueOf(com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a) ? 3 : 2)).c("flavor-version", java.lang.String.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_wechat_flavor_version, 0)));
        java.util.List<oq1.a> Ai = ((nq1.d) ((oq1.l) i95.n0.c(oq1.l.class))).Ai();
        if (Ai != null) {
            for (oq1.a aVar : Ai) {
                fy5.a.d().c(java.lang.Integer.toHexString(aVar.field_key), java.lang.String.valueOf(aVar.field_dau));
            }
        }
    }
}
