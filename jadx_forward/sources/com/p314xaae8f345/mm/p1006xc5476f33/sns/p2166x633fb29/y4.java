package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes.dex */
public class y4 implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.p314xaae8f345.mm.vfs.r6[] r6VarArr;
        com.p314xaae8f345.mm.vfs.r6[] G;
        java.lang.String str5 = "run";
        java.lang.String str6 = "com.tencent.mm.plugin.sns.model.SnsCore$21";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.model.SnsCore$21");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.model.SnsCore");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dumpSnsFileImp", "com.tencent.mm.plugin.sns.model.SnsCore");
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.f245938x1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dumpSnsFileImp", "com.tencent.mm.plugin.sns.model.SnsCore");
            str = "run";
            str2 = "com.tencent.mm.plugin.sns.model.SnsCore$21";
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.f245938x1 = true;
            com.p314xaae8f345.mm.vfs.r6[] G2 = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di()).G();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCore", "snscheckfile start");
            long j17 = 0;
            int i17 = 0;
            while (i17 < G2.length) {
                com.p314xaae8f345.mm.vfs.r6[] G3 = G2[i17].G();
                if (G3 != null) {
                    int i18 = 0;
                    while (i18 < G3.length) {
                        java.lang.String[] D = G3[i18].D();
                        if (D == null || (G = G3[i18].G()) == null) {
                            str3 = str5;
                            str4 = str6;
                            r6VarArr = G2;
                        } else {
                            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                            r6VarArr = G2;
                            int i19 = 0;
                            while (i19 < G.length) {
                                com.p314xaae8f345.mm.vfs.r6 r6Var = G[i19];
                                long C = j17 + r6Var.C();
                                java.lang.String str7 = (java.lang.String) android.text.format.DateFormat.format("yyyy-M-d kk:mm", r6Var.B());
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                sb6.append(r6Var.o());
                                sb6.append(" ");
                                java.lang.String str8 = str5;
                                sb6.append(r6Var.C());
                                sb6.append(" ");
                                sb6.append(r6Var.B());
                                sb6.append(" ");
                                sb6.append(str7);
                                java.lang.String sb7 = sb6.toString();
                                stringBuffer.append(sb7 + com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCore", sb7);
                                i19++;
                                j17 = C;
                                G = G;
                                str5 = str8;
                                str6 = str6;
                            }
                            str3 = str5;
                            str4 = str6;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCore", "filepath %s %d", G3[i18].o(), java.lang.Integer.valueOf(D.length));
                        }
                        i18++;
                        G2 = r6VarArr;
                        str5 = str3;
                        str6 = str4;
                    }
                }
                i17++;
                G2 = G2;
                str5 = str5;
                str6 = str6;
            }
            str = str5;
            str2 = str6;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCore", "snscheckfile end " + j17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.f245938x1 = false;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dumpSnsFileImp", "com.tencent.mm.plugin.sns.model.SnsCore");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.model.SnsCore");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
    }
}
