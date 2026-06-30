package a62;

/* loaded from: classes15.dex */
public abstract class b {
    public static boolean a(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionDetailReport", "reportSessionDetail: %s", str);
        java.util.List c17 = jx3.a.c(str.replace(',', '#'), 5120);
        if (c17 == null) {
            return false;
        }
        com.tencent.mm.autogen.mmdata.rpt.SessionFlowSingleStatStruct sessionFlowSingleStatStruct = new com.tencent.mm.autogen.mmdata.rpt.SessionFlowSingleStatStruct();
        sessionFlowSingleStatStruct.f60278d = android.os.Process.myPid();
        sessionFlowSingleStatStruct.f60279e = sessionFlowSingleStatStruct.b("PName", ((km0.c) gm0.j1.p().a()).f308987a, true);
        sessionFlowSingleStatStruct.f60280f = jx3.a.e();
        java.util.ArrayList arrayList = (java.util.ArrayList) c17;
        sessionFlowSingleStatStruct.f60282h = arrayList.size();
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            sessionFlowSingleStatStruct.f60281g = i17;
            sessionFlowSingleStatStruct.f60283i = sessionFlowSingleStatStruct.b("DataContent", (java.lang.String) arrayList.get(i17), false);
            sessionFlowSingleStatStruct.k();
        }
        return true;
    }
}
