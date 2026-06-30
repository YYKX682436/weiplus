package wc1;

/* loaded from: classes7.dex */
public class q extends yc1.b implements wc1.s {

    /* renamed from: CTRL_INDEX */
    public static final int f77347x366c91de = 467;

    /* renamed from: NAME */
    public static final java.lang.String f77348x24728b = "createLoadSubPackageTask";

    public final void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str, java.lang.String str2) {
        wc1.p.x(lVar, str, "fail", str2);
    }

    public void D(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str, ph1.g gVar, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCreateLoadSubPackageTask", "hy: loadResult: %s, with appId[%s] moduleName[%s]", gVar.toString(), str2, str3);
        int ordinal = gVar.ordinal();
        if (ordinal == 0) {
            wc1.p.y(lVar, str, ya.b.f77504xbb80cbe3, str3, -1, -1L, -1L, str2);
            return;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiCreateLoadSubPackageTask", "hy: should not happen cancel!!");
                wc1.p.y(lVar, str, "fail", str3, -1, -1L, -1L, str2);
                return;
            } else if (ordinal != 3) {
                return;
            }
        }
        wc1.p.y(lVar, str, "fail", str3, -1, -1L, -1L, str2);
    }

    @Override // gb1.m
    public java.lang.String a() {
        return "loadTaskId";
    }

    @Override // gb1.m
    public void d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0) lVar;
        java.lang.String appId = lVar.mo48798x74292566();
        java.lang.String moduleName = jSONObject.optString("moduleName");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(moduleName)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiCreateLoadSubPackageTask", "hy: null or nil moduleName");
            C(d0Var, str, moduleName);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = d0Var.t3();
        if (t37 == null || t37.L0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiCreateLoadSubPackageTask", "hy: runtime is not in valid state!");
            C(d0Var, str, moduleName);
            return;
        }
        ph1.h hVar = t37.R;
        if (hVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiCreateLoadSubPackageTask", "hy: modularizingHelper null!");
            C(d0Var, str, moduleName);
            return;
        }
        if (!hVar.e() && !moduleName.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33446xd388c2f8)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiCreateLoadSubPackageTask", "hy: not support modularizing but still called JsApiCreateLoadSubPackageTask");
            C(d0Var, str, moduleName);
            return;
        }
        boolean c17 = hVar.c(moduleName);
        k91.a3 a3Var = (k91.a3) i95.n0.c(k91.a3.class);
        if (a3Var != null) {
            k91.u0 u0Var = (k91.u0) a3Var;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(moduleName, "moduleName");
            k91.r0 Bi = u0Var.Bi(appId);
            java.util.Map map = Bi.f387290a;
            java.lang.Object obj = map.get(moduleName);
            if (obj == null) {
                obj = new k91.m0(false, 0.0f, null, 7, null);
                map.put(moduleName, obj);
            }
            ((k91.m0) obj).f387205a = c17;
            u0Var.Ri(appId, Bi);
            u0Var.Ui(appId, moduleName, c17 ? 100.0f : 0.0f);
        }
        try {
            hVar.a(moduleName, new wc1.m(this, d0Var, str, appId, moduleName), new wc1.n(this, moduleName, new java.util.HashSet(), appId, d0Var, str), false);
        } catch (java.lang.IllegalAccessError e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiCreateLoadSubPackageTask", e17, "loadModule(%s)", moduleName);
            C(d0Var, str, moduleName);
        } catch (java.lang.NullPointerException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiCreateLoadSubPackageTask", e18, "loadModule(%s) npe, isRunning:%b", moduleName, java.lang.Boolean.valueOf(lVar.mo50262x39e05d35()));
            C(d0Var, str, moduleName);
        }
    }

    @Override // gb1.m
    /* renamed from: getTaskId */
    public java.lang.String mo1076x30961476() {
        return wc1.s.g() + "";
    }
}
