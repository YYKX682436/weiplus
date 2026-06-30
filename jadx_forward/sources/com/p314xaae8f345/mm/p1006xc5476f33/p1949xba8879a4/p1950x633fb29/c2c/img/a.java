package com.p314xaae8f345.mm.p1006xc5476f33.p1949xba8879a4.p1950x633fb29.c2c.img;

/* loaded from: classes12.dex */
public class a extends tq3.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1949xba8879a4.p1950x633fb29.c2c.img.c f234704d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1949xba8879a4.p1950x633fb29.c2c.img.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p1949xba8879a4.p1950x633fb29.c2c.img.C16806x7cd4a540 c16806x7cd4a540) {
        this.f234704d = cVar;
    }

    @Override // tq3.a
    public java.lang.String a() {
        return "Priority.C2CImgAutoDownloaderTask";
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        r45.rc rcVar;
        r45.rc rcVar2;
        r45.rc rcVar3;
        int i18;
        android.database.Cursor h17;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        int b17;
        int i19;
        r45.rc rcVar4;
        r45.rc rcVar5;
        if (!iq3.a.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CImgAutoDownloader", "not auto download condition");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1949xba8879a4.p1950x633fb29.c2c.img.c cVar = this.f234704d;
        long j17 = cVar.f234706d;
        if (j17 != 0 || cVar.f234710h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CImgAutoDownloader", "Downloading %d pauseOnMonitor %b", java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(cVar.f234710h));
            return;
        }
        ((fq3.n) i95.n0.c(fq3.n.class)).getClass();
        ((fq3.n) i95.n0.c(fq3.n.class)).getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = null;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_mmc2c_chat_img_auto_download_flag, false)) {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_mmc2c_chat_img_auto_download_rank, 10);
            float Di = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Di(e42.d0.clicfg_mmc2c_chat_img_auto_download_score, 10.0f);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f234709g)) {
                i17 = 0;
                rcVar = null;
            } else {
                fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
                nVar.m134976x2690a4ac();
                com.p314xaae8f345.mm.p1006xc5476f33.p1949xba8879a4.p1950x633fb29.c2c.img.e eVar = nVar.f347063o;
                java.lang.String str = cVar.f234709g;
                eVar.getClass();
                h17 = eVar.f234715a.h(java.lang.String.format("SELECT * FROM %s Img, %s Chat WHERE Chat.rank <= ? AND Chat.totallsp > ? AND Chat.chat = ? AND Img.fromuser = ? AND Img.createtime > ? AND Img.status = ? ORDER BY Img.createtime DESC LIMIT 1;", "C2CMsgAutoDownloadRes", "C2CChatUsageResult"), new java.lang.String[]{java.lang.String.valueOf(Ni), java.lang.String.valueOf(Di), str, str, java.lang.String.valueOf(java.lang.System.currentTimeMillis() - 432000000), java.lang.String.valueOf(1)});
                try {
                    if (h17.moveToNext()) {
                        rcVar = eVar.a(h17);
                    } else {
                        h17.close();
                        rcVar = null;
                    }
                    i17 = 5;
                } finally {
                }
            }
            if (rcVar == null) {
                fq3.n nVar2 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar2.m134976x2690a4ac();
                rcVar = nVar2.f347063o.b(Ni, Di);
                i17 = 6;
            }
            if (rcVar == null) {
                fq3.n nVar3 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar3.m134976x2690a4ac();
                rcVar2 = nVar3.f347063o.d(128);
                i17 = 4;
            } else {
                rcVar2 = rcVar;
            }
            if (rcVar2 == null && cVar.b()) {
                int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_mmc2c_chat_img_auto_download_bg_rank, 20);
                float Di2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Di(e42.d0.clicfg_mmc2c_chat_img_auto_download_bg_score, 10.0f);
                fq3.n nVar4 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar4.m134976x2690a4ac();
                rcVar3 = nVar4.f347063o.b(Ni2, Di2);
                i18 = 7;
            } else {
                rcVar3 = rcVar2;
                i18 = i17;
            }
        } else {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f234709g)) {
                i19 = 0;
                rcVar4 = null;
            } else {
                fq3.n nVar5 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar5.m134976x2690a4ac();
                com.p314xaae8f345.mm.p1006xc5476f33.p1949xba8879a4.p1950x633fb29.c2c.img.e eVar2 = nVar5.f347063o;
                java.lang.String str2 = cVar.f234709g;
                eVar2.getClass();
                h17 = eVar2.f234715a.h(java.lang.String.format("SELECT * FROM %s WHERE status = ? AND fromuser = ? AND priority >= ? AND createtime > ? ORDER BY createtime DESC LIMIT 1;", "C2CMsgAutoDownloadRes"), new java.lang.String[]{java.lang.String.valueOf(1), java.lang.String.valueOf(str2), java.lang.String.valueOf(0.3f), java.lang.String.valueOf(java.lang.System.currentTimeMillis() - 432000000)});
                try {
                    if (h17.moveToNext()) {
                        rcVar4 = eVar2.a(h17);
                    } else {
                        h17.close();
                        rcVar4 = null;
                    }
                    i19 = 1;
                } finally {
                }
            }
            if (rcVar4 == null) {
                fq3.n nVar6 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar6.m134976x2690a4ac();
                com.p314xaae8f345.mm.p1006xc5476f33.p1949xba8879a4.p1950x633fb29.c2c.img.e eVar3 = nVar6.f347063o;
                eVar3.getClass();
                h17 = eVar3.f234715a.h(java.lang.String.format("SELECT * FROM %s WHERE status = ? AND priority >= ? AND createtime > ? ORDER BY createtime DESC LIMIT 1;", "C2CMsgAutoDownloadRes"), new java.lang.String[]{java.lang.String.valueOf(1), java.lang.String.valueOf(0.3f), java.lang.String.valueOf(java.lang.System.currentTimeMillis() - 432000000)});
                try {
                    if (h17.moveToNext()) {
                        rcVar4 = eVar3.a(h17);
                    } else {
                        h17.close();
                        rcVar4 = null;
                    }
                    i19 = 2;
                } finally {
                }
            }
            if (rcVar4 == null) {
                fq3.n nVar7 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar7.m134976x2690a4ac();
                rcVar4 = nVar7.f347063o.d(128);
                i19 = 4;
            }
            if (rcVar4 == null && cVar.b()) {
                fq3.n nVar8 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar8.m134976x2690a4ac();
                com.p314xaae8f345.mm.p1006xc5476f33.p1949xba8879a4.p1950x633fb29.c2c.img.e eVar4 = nVar8.f347063o;
                eVar4.getClass();
                h17 = eVar4.f234715a.h(java.lang.String.format("SELECT * FROM %s WHERE status = ? AND priority >= ? AND createtime > ? ORDER BY priority DESC, createtime DESC LIMIT 1;", "C2CMsgAutoDownloadRes"), new java.lang.String[]{java.lang.String.valueOf(1), java.lang.String.valueOf(0.1f), java.lang.String.valueOf(java.lang.System.currentTimeMillis() - 432000000)});
                try {
                    if (h17.moveToNext()) {
                        rcVar5 = eVar4.a(h17);
                    } else {
                        h17.close();
                        rcVar5 = null;
                    }
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    objArr[0] = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("plugged", -1) != 0);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CImgAutoDownloader", "bg normal download %b", objArr);
                    rcVar3 = rcVar5;
                    i18 = 3;
                } finally {
                }
            } else {
                rcVar3 = rcVar4;
                i18 = i19;
            }
        }
        if (rcVar3 == null) {
            cVar.f234706d = 0L;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CImgAutoDownloader", "autoDownloadRes is null");
            return;
        }
        long j18 = rcVar3.f466242d;
        cVar.f234706d = j18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CImgAutoDownloader", "curMsgId %d priority %.2f prioritytype %d way %d borderPriority %.2f bgBorderPriority %.2f", java.lang.Long.valueOf(j18), java.lang.Double.valueOf(rcVar3.f466253r), java.lang.Integer.valueOf(rcVar3.f466254s), java.lang.Integer.valueOf(i18), java.lang.Float.valueOf(0.3f), java.lang.Float.valueOf(0.1f));
        try {
            f9Var2 = pt0.f0.Li(rcVar3.f466243e, cVar.f234706d);
        } catch (java.lang.Error unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Priority.C2CImgAutoDownloader", "assert while get msg by msgId");
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var3 = f9Var2;
        if (f9Var3 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Priority.C2CImgAutoDownloader", "can't get msgInfo of " + cVar.f234706d);
            fq3.n nVar9 = (fq3.n) i95.n0.c(fq3.n.class);
            nVar9.m134976x2690a4ac();
            com.p314xaae8f345.mm.p1006xc5476f33.p1949xba8879a4.p1950x633fb29.c2c.img.e eVar5 = nVar9.f347063o;
            long j19 = cVar.f234706d;
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 c26970x63d6eaa3 = eVar5.f234717c;
            c26970x63d6eaa3.m107799x37fbf859(1, j19);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadImgStorage", "delete %d img %d", java.lang.Integer.valueOf(c26970x63d6eaa3.m107871x91d1f3e9()), java.lang.Long.valueOf(j19));
            cVar.f234706d = 0L;
            cVar.d();
            return;
        }
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        m11.b0 b27 = m11.b1.Di().b2(f9Var3.Q0(), f9Var3.I0());
        if (b27.f404184s == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CImgAutoDownloader", cVar.f234706d + " already has hd thumb");
            fq3.n nVar10 = (fq3.n) i95.n0.c(fq3.n.class);
            nVar10.m134976x2690a4ac();
            nVar10.f347063o.f(cVar.f234706d, 5);
            cVar.f234706d = 0L;
            cVar.d();
            return;
        }
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).getClass();
        com.p314xaae8f345.mm.p947xba6de98f.s1.fj().f152530u.add("image_" + f9Var3.m124847x74d37ac6());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f234709g) || !cVar.f234709g.equals(f9Var3.Q0())) {
            f9Var = f9Var3;
            b17 = ((m11.j) ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Di()).b(b27.f404166a, tg3.l1.a(f9Var), 0, java.lang.Long.valueOf(cVar.f234706d), cVar.f234707e, cVar, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CImgAutoDownloader", "start download cdnautostart %d %s result=%d", java.lang.Long.valueOf(cVar.f234706d), "image_" + f9Var.m124847x74d37ac6(), java.lang.Integer.valueOf(b17));
        } else {
            f9Var = f9Var3;
            b17 = ((m11.j) ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Di()).b(b27.f404166a, tg3.l1.a(f9Var3), 0, java.lang.Long.valueOf(cVar.f234706d), cVar.f234707e, cVar, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CImgAutoDownloader", "start download cdnautostart %d %s %s result=%d", java.lang.Long.valueOf(cVar.f234706d), "image_" + f9Var.m124847x74d37ac6(), cVar.f234709g, java.lang.Integer.valueOf(b17));
        }
        if (b17 != -4 && b17 != -3) {
            if (b17 == -2) {
                fq3.n nVar11 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar11.m134976x2690a4ac();
                nVar11.f347063o.f(cVar.f234706d, 3);
                if (i18 == 3) {
                    jx3.f.INSTANCE.mo68477x336bdfd8(957L, 55L, 1L, false);
                } else if (i18 == 7) {
                    jx3.f.INSTANCE.mo68477x336bdfd8(957L, 61L, 1L, false);
                }
                cVar.f234706d = 0L;
                cVar.d();
                return;
            }
            if (b17 == -1) {
                fq3.n nVar12 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar12.m134976x2690a4ac();
                nVar12.f347063o.f(cVar.f234706d, 4);
                if (i18 == 3) {
                    jx3.f.INSTANCE.mo68477x336bdfd8(957L, 56L, 1L, false);
                } else if (i18 == 7) {
                    jx3.f.INSTANCE.mo68477x336bdfd8(957L, 62L, 1L, false);
                }
                cVar.f234706d = 0L;
                cVar.d();
                return;
            }
            if (b17 != 0) {
                return;
            } else {
                kq3.i.f(rcVar3, f9Var);
            }
        }
        fq3.n nVar13 = (fq3.n) i95.n0.c(fq3.n.class);
        nVar13.m134976x2690a4ac();
        nVar13.f347063o.f(cVar.f234706d, 2);
        if (i18 == 3) {
            jx3.f.INSTANCE.mo68477x336bdfd8(957L, 52L, 1L, false);
            return;
        }
        if (i18 == 1) {
            jx3.f.INSTANCE.mo68477x336bdfd8(957L, 50L, 1L, false);
            return;
        }
        if (i18 == 4) {
            jx3.f.INSTANCE.mo68477x336bdfd8(957L, 57L, 1L, false);
            return;
        }
        if (i18 == 5) {
            jx3.f.INSTANCE.mo68477x336bdfd8(957L, 58L, 1L, false);
            return;
        }
        if (i18 == 6) {
            jx3.f.INSTANCE.mo68477x336bdfd8(957L, 59L, 1L, false);
        } else if (i18 == 7) {
            jx3.f.INSTANCE.mo68477x336bdfd8(957L, 60L, 1L, false);
        } else {
            jx3.f.INSTANCE.mo68477x336bdfd8(957L, 51L, 1L, false);
        }
    }
}
