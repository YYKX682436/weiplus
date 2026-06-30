package os3;

/* loaded from: classes8.dex */
public class z0 extends hs3.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16932x23233efa f429794a;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16932x23233efa activityC16932x23233efa) {
        this.f429794a = activityC16932x23233efa;
    }

    @Override // hs3.j
    public void b(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16932x23233efa activityC16932x23233efa = this.f429794a;
        if (i17 != -5) {
            activityC16932x23233efa.f236399p.setVisibility(8);
            activityC16932x23233efa.f236398o.setVisibility(0);
            activityC16932x23233efa.f236397n.setVisibility(8);
            return;
        }
        os3.p3 p3Var = activityC16932x23233efa.f236394h;
        p3Var.f429705d = new os3.y0(this);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5728x615a84ab c5728x615a84ab = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5728x615a84ab();
        am.ok okVar = c5728x615a84ab.f136050g;
        okVar.f89086a = p3Var.f429706e;
        okVar.f89087b = new os3.m3(p3Var, c5728x615a84ab);
        c5728x615a84ab.b(android.os.Looper.myLooper());
    }

    @Override // hs3.j
    public void d(java.lang.String str, java.util.Map map) {
        java.lang.String str2;
        os3.z0 z0Var = this;
        java.util.Map map2 = map;
        java.lang.String str3 = (java.lang.String) map2.get(".Response.result.compressfilepath");
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16932x23233efa activityC16932x23233efa = z0Var.f429794a;
        activityC16932x23233efa.f236396m = str3;
        int i17 = 0;
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map2.get(".Response.result.filelist.count"), 0);
        int i18 = 0;
        while (i18 < P) {
            try {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(".Response.result.filelist.list.item");
                sb6.append(i18 > 0 ? java.lang.Integer.valueOf(i18) : "");
                java.lang.String sb7 = sb6.toString();
                java.lang.String str4 = (java.lang.String) map2.get(sb7 + ".path");
                if (str4 != null) {
                    java.lang.String decode = java.net.URLDecoder.decode(str4, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
                    java.lang.String str5 = (java.lang.String) map2.get(sb7 + ".parentpath");
                    int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map2.get(sb7 + ".size"), i17);
                    int P3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map2.get(sb7 + ".type"), i17);
                    boolean equals = ((java.lang.String) map2.get(sb7 + ".preview")).equals("1");
                    java.lang.String str6 = (java.lang.String) map2.get(sb7 + ".name");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16932x23233efa activityC16932x23233efa2 = z0Var.f429794a;
                    java.util.List list = activityC16932x23233efa2.f236395i;
                    if (P2 == 0) {
                        str2 = "";
                    } else {
                        str2 = "(" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(P2) + ")";
                    }
                    ((java.util.ArrayList) list).add(new os3.a1(activityC16932x23233efa2, decode, str6, str5, P3, str2, equals));
                }
                i18++;
                z0Var = this;
                map2 = map;
                i17 = 0;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CompressPreviewUI", e17, "", new java.lang.Object[0]);
            }
        }
        activityC16932x23233efa.U6("");
    }
}
