package a62;

/* loaded from: classes15.dex */
public abstract class c {
    public static org.json.JSONObject a(r45.w35 w35Var) {
        if (w35Var.f470378g <= 0) {
            return null;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54540x542b1a21, com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.c.h(w35Var.f470381m));
            long j17 = w35Var.f470379h - w35Var.f470378g;
            jSONObject.put("in", j17 > 0 ? j17 : 0L);
            jSONObject.put("count", 1);
            return jSONObject;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static org.json.JSONObject b(r45.c45 c45Var) {
        if (c45Var.f452808i <= 0) {
            return null;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54540x542b1a21, com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.c.b(c45Var.f452803d));
            long j17 = c45Var.f452809m - c45Var.f452808i;
            jSONObject.put("in", j17 > 0 ? j17 : 0L);
            jSONObject.put("count", 1);
            return jSONObject;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static boolean c(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellSessionMergeReport", "reportSessionMerge: %s", str);
        java.util.List c17 = jx3.a.c(str.replace(',', '#'), 5120);
        if (c17 == null) {
            return false;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6863xef0abc3d c6863xef0abc3d = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6863xef0abc3d();
        c6863xef0abc3d.f141805d = android.os.Process.myPid();
        c6863xef0abc3d.f141806e = c6863xef0abc3d.b("PName", ((km0.c) gm0.j1.p().a()).f390520a, true);
        c6863xef0abc3d.f141807f = jx3.a.e();
        java.util.ArrayList arrayList = (java.util.ArrayList) c17;
        c6863xef0abc3d.f141809h = arrayList.size();
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            c6863xef0abc3d.f141808g = i17;
            c6863xef0abc3d.f141810i = c6863xef0abc3d.b("DataContent", (java.lang.String) arrayList.get(i17), false);
            c6863xef0abc3d.k();
        }
        return true;
    }
}
