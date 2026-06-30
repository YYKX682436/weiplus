package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes11.dex */
public class fc extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f280573e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.gc f280574f;

    public fc(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.gc gcVar, java.lang.String str, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.cc ccVar) {
        this.f280574f = gcVar;
        this.f280573e = str;
    }

    public final void e(xg3.m0 m0Var, long j17, long j18) {
        final long a17 = c01.id.a() - 259200000;
        java.lang.String d17 = k35.m1.d(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f, a17 / 1000);
        final java.lang.String str = this.f280573e;
        final com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.g9) m0Var;
        g9Var.getClass();
        final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        final java.lang.String X8 = g9Var.X8(str);
        if (g9Var.Da(X8)) {
            final int i17 = 1;
            final int i18 = 1;
            f9Var = ot0.c3.l().g("getUpIncReceivedMsg", new yz5.a() { // from class: com.tencent.mm.storage.g9$$q4
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return ot0.z2.f430355a.l1(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, str, a17, i18);
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$r4
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var2.getClass();
                    android.database.Cursor B = g9Var2.f275522r.B("SELECT * FROM " + X8 + " WHERE" + g9Var2.Z8(str) + "AND createTime < " + a17 + " AND isSend = 0 ORDER BY createTime DESC  LIMIT " + i17, null);
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = f9Var;
                    if (B == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgInfoStorage", "get inc msg create time error, cursor is null");
                    } else if (B.moveToLast()) {
                        f9Var2.mo9015xbf5d97fd(B);
                        B.close();
                    } else {
                        B.close();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgInfoStorage", "get result fail");
                    }
                    return f9Var2;
                }
            });
        } else if (g9Var.Pb(X8)) {
            f9Var = ot0.z2.f430355a.l1(g9Var.f275522r, X8, str, a17, 1);
        } else {
            android.database.Cursor B = g9Var.f275522r.B("SELECT * FROM " + X8 + " WHERE" + g9Var.Z8(str) + "AND createTime < " + a17 + " AND isSend = 0 ORDER BY createTime DESC  LIMIT 1", null);
            if (B == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgInfoStorage", "get inc msg create time error, cursor is null");
            } else if (B.moveToLast()) {
                f9Var.mo9015xbf5d97fd(B);
                B.close();
            } else {
                B.close();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgInfoStorage", "get result fail");
            }
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = f9Var;
        long j19 = 0;
        java.lang.String str2 = this.f280573e;
        if (f9Var2 == null || f9Var2.m124847x74d37ac6() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GetChatroomComponent", "[handleFoundGetChatroom] getUpIncReceivedMsg is null!");
            long m07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(str2);
            com.p314xaae8f345.mm.p2621x8fb0427b.x4 x4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni();
            if (str2 == null) {
                x4Var.getClass();
            } else {
                j19 = x4Var.s0("SELECT max(lastSeq) FROM DeletedConversationInfo WHERE userName=? OR userName=''", new java.lang.String[]{str2});
            }
            f9Var2.e1(m07);
            f9Var2.n1(j19);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetChatroomComponent", "[handleFoundGetChatroom] talker:%s seq:[%s:%s] time:[%s:%s] fromTimeFormat:%s recMsgTimeFormat:%s", this.f280573e, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(f9Var2.F0()), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(f9Var2.mo78012x3fdd41df()), d17, k35.m1.d(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f, f9Var2.mo78012x3fdd41df() / 1000));
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5594x5ae33cc7 c5594x5ae33cc7 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5594x5ae33cc7();
        am.mf mfVar = c5594x5ae33cc7.f135918g;
        mfVar.f88875a = str2;
        mfVar.f88878d = f9Var2.F0();
        mfVar.f88879e = f9Var2.mo78012x3fdd41df();
        mfVar.f88876b = j17;
        mfVar.f88877c = j18;
        c5594x5ae33cc7.e();
    }

    @Override // wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "CheckGetChatroomTask";
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b9 A[Catch: all -> 0x013d, TryCatch #0 {all -> 0x013d, blocks: (B:3:0x000e, B:7:0x0035, B:9:0x0048, B:13:0x0067, B:15:0x00ad, B:20:0x00b9, B:22:0x00cd, B:24:0x00d5, B:25:0x00e2, B:28:0x00dc, B:29:0x00ed, B:31:0x010e, B:34:0x011a), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ed A[Catch: all -> 0x013d, TRY_LEAVE, TryCatch #0 {all -> 0x013d, blocks: (B:3:0x000e, B:7:0x0035, B:9:0x0048, B:13:0x0067, B:15:0x00ad, B:20:0x00b9, B:22:0x00cd, B:24:0x00d5, B:25:0x00e2, B:28:0x00dc, B:29:0x00ed, B:31:0x010e, B:34:0x011a), top: B:2:0x000e }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fc.run():void");
    }
}
