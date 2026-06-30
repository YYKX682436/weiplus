package a62;

/* loaded from: classes15.dex */
public abstract class c {
    public static org.json.JSONObject a(r45.w35 w35Var) {
        if (w35Var.f388845g <= 0) {
            return null;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_STREAM_ID, com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.h(w35Var.f388848m));
            long j17 = w35Var.f388846h - w35Var.f388845g;
            jSONObject.put("in", j17 > 0 ? j17 : 0L);
            jSONObject.put("count", 1);
            return jSONObject;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static org.json.JSONObject b(r45.c45 c45Var) {
        if (c45Var.f371275i <= 0) {
            return null;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_STREAM_ID, com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.b(c45Var.f371270d));
            long j17 = c45Var.f371276m - c45Var.f371275i;
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
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionMergeReport", "reportSessionMerge: %s", str);
        java.util.List c17 = jx3.a.c(str.replace(',', '#'), 5120);
        if (c17 == null) {
            return false;
        }
        com.tencent.mm.autogen.mmdata.rpt.SessionFlowMergeStatStruct sessionFlowMergeStatStruct = new com.tencent.mm.autogen.mmdata.rpt.SessionFlowMergeStatStruct();
        sessionFlowMergeStatStruct.f60272d = android.os.Process.myPid();
        sessionFlowMergeStatStruct.f60273e = sessionFlowMergeStatStruct.b("PName", ((km0.c) gm0.j1.p().a()).f308987a, true);
        sessionFlowMergeStatStruct.f60274f = jx3.a.e();
        java.util.ArrayList arrayList = (java.util.ArrayList) c17;
        sessionFlowMergeStatStruct.f60276h = arrayList.size();
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            sessionFlowMergeStatStruct.f60275g = i17;
            sessionFlowMergeStatStruct.f60277i = sessionFlowMergeStatStruct.b("DataContent", (java.lang.String) arrayList.get(i17), false);
            sessionFlowMergeStatStruct.k();
        }
        return true;
    }
}
