package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class g7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7 f245746d;

    public g7(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7 i7Var) {
        this.f245746d = i7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$8");
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7.c(this.f245746d).isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoService", "download queue is null, do nothing");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7.d(this.f245746d);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$8");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z7 z7Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z7) com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7.c(this.f245746d).poll();
        if (z7Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsVideoService", "try start download video task is null. queue size %d", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7.c(this.f245746d).size()));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7.d(this.f245746d);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$8");
            return;
        }
        boolean z17 = this.f245746d.f245841a != null && z7Var.f246346b.equals(this.f245746d.f245841a.f246346b);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7 i7Var = this.f245746d;
        i7Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pausePreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        synchronized (i7Var.f245845e) {
            try {
                java.util.Iterator it = i7Var.f245845e.iterator();
                while (it.hasNext()) {
                    t21.v0 v0Var = (t21.v0) it.next();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoService", "SNS_PRELOAD_PAUSE pause preload sns:[%s]", v0Var.f496513d);
                    v0Var.e();
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pausePreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pausePreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        ((c50.b1) i95.n0.c(c50.b1.class)).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7 i7Var2 = this.f245746d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1300", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        i7Var2.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("downloadVideo", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        java.lang.String i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.i(z7Var.f246350f, z7Var.f246348d);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i17)) {
            boolean u17 = com.p314xaae8f345.mm.vfs.w6.u(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.n(z7Var.f246348d.f459388d));
            java.lang.String p17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.p(z7Var.f246348d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoService", "downloadVideo snsLocalId:%s media id:%s file:%s", z7Var.f246350f, z7Var.f246348d.f459388d, p17);
            java.lang.String str3 = z7Var.f246350f;
            r45.jj4 jj4Var = z7Var.f246348d;
            t21.v2 h17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.h(str3, jj4Var.f459388d, jj4Var.U, jj4Var.Y);
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_video_db_error_repair, true);
            if (h17 != null && fj6 && !android.text.TextUtils.isEmpty(h17.O) && !h17.O.equals(z7Var.f246348d.f459388d)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsVideoService", "NOTICE2 bad media id,delete video info. current:%s db:%s", h17.O, z7Var.f246348d.f459388d);
                t21.d3.e(h17.d());
                h17 = null;
            }
            if (h17 == null) {
                t21.d3.e(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.g(z7Var.f246350f, z7Var.f246348d));
                java.lang.String str4 = z7Var.f246350f;
                r45.jj4 jj4Var2 = z7Var.f246348d;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.v(str4, jj4Var2.f459388d, z7Var.f246351g, jj4Var2, p17);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.y(h17, z7Var.f246348d.f459388d, z7Var.f246351g);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoService", "prepare stream download sns video %s mkDir %b", p17, java.lang.Boolean.valueOf(u17));
            java.lang.String str5 = z7Var.f246348d.f459388d;
            com.p314xaae8f345.mm.p2621x8fb0427b.s7 c17 = com.p314xaae8f345.mm.p2621x8fb0427b.s7.c();
            c17.f276846b = z7Var.f246349e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSight", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSight", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
            java.lang.String str6 = z7Var.f246348d.f459391g;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setUrl", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setUrl", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setThumb", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setThumb", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
            t21.i2.wi();
            com.p314xaae8f345.mm.p947xba6de98f.l3 Di = t21.o2.Di();
            java.lang.String g17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.g(z7Var.f246350f, z7Var.f246348d);
            int i18 = z7Var.f246347c;
            r45.jj4 jj4Var3 = z7Var.f246348d;
            str = "access$1300";
            boolean z18 = z17;
            dn.o k17 = Di.k(c17, str6, p17, g17, i18, jj4Var3.N, jj4Var3.f459388d, jj4Var3.D, jj4Var3.E, jj4Var3.U, jj4Var3);
            if (k17 == null) {
                str2 = "com.tencent.mm.plugin.sns.model.SnsVideoService";
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadVideo", str2);
            } else {
                str2 = "com.tencent.mm.plugin.sns.model.SnsVideoService";
                java.lang.String str7 = z7Var.f246345a;
                k17.I1 = str7;
                k17.J1 = str7;
                try {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(ca4.m0.k(z7Var.f246350f, z7Var.f246348d.f459388d + "_"));
                    if (k18 == null || !k18.m70377x3172ed()) {
                        k17.f69592xf1ebe47b = 20202;
                    } else {
                        k17.f69592xf1ebe47b = 20210;
                    }
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 f17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.f(k18);
                    k17.Q1 = ca4.z0.t0(f17.Id);
                    k17.V1 = f17.f38993xee7ff79.f460108d;
                } catch (java.lang.Exception unused) {
                }
                r45.jj4 jj4Var4 = z7Var.f246348d;
                k17.f323347b2 = jj4Var4.f459388d;
                k17.f323333s = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7.r(jj4Var4);
                r45.jj4 jj4Var5 = z7Var.f246348d;
                k17.X1 = jj4Var5.U;
                k17.P = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7.q(jj4Var5);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoService", "download video flag:%s", k17.X1);
                i7Var2.f245841a = z7Var;
                i7Var2.f245841a.f246346b = k17.f69601xaca5bdda;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoService", "start stream download sns video cdnMediaId %s delay %b", i7Var2.f245841a.f246346b, java.lang.Boolean.valueOf(z18));
                t21.o2.Di().e(k17, z18);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadVideo", str2);
            }
        } else {
            java.lang.String str8 = z7Var.f246350f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoService", "this sns:[%s] video[%s] already download finish, do nothing. [%s, %s]", str8, z7Var.f246346b, str8, i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadVideo", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            str = "access$1300";
            str2 = "com.tencent.mm.plugin.sns.model.SnsVideoService";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$8");
    }
}
