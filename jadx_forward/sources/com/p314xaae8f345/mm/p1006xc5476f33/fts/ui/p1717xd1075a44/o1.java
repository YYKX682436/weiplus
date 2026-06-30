package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44;

/* loaded from: classes12.dex */
public abstract class o1 implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public static void a(java.lang.String str, g23.k kVar, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i18) {
        try {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(str, java.lang.String.valueOf(kVar.B), str5)) {
                return;
            }
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("pardussearch=expose&searchid=");
            stringBuffer.append(kVar.G);
            stringBuffer.append("&query=");
            stringBuffer.append(fp.s0.b(str, "utf8"));
            stringBuffer.append("&type=");
            stringBuffer.append(i17);
            stringBuffer.append("&docid=");
            stringBuffer.append(str2);
            stringBuffer.append("&title=");
            stringBuffer.append(fp.s0.b(str3, "utf8"));
            stringBuffer.append("&clienttimestamp=");
            stringBuffer.append(java.lang.System.currentTimeMillis());
            stringBuffer.append("&sug=");
            stringBuffer.append(fp.s0.b(str4, "utf8"));
            stringBuffer.append("&relatedsug=");
            stringBuffer.append(fp.s0.b(str5, "utf8"));
            stringBuffer.append("&sugtype=");
            stringBuffer.append(i18);
            stringBuffer.append("&requestid=");
            stringBuffer.append(kVar.B);
            stringBuffer.append("&sessionid=");
            stringBuffer.append(o13.p.f423783c);
            stringBuffer.append("&extinfo=");
            stringBuffer.append(kVar.L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.PardusSearchLogic", "realtimeSearchExposeReport %s", stringBuffer.toString());
            r45.lq5 lq5Var = new r45.lq5();
            lq5Var.f461289t = stringBuffer.toString();
            gm0.j1.d().g(new su4.a2(lq5Var));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.PardusSearchLogic", e17, "realtimeSearchExposeReport", new java.lang.Object[0]);
        }
    }
}
