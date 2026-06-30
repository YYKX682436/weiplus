package zc4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzc4/g;", "Lcom/tencent/mm/sdk/storage/mvvm/MvvmStorage;", "Lxc4/p;", "Ln75/b;", "dbProvider", "<init>", "(Ln75/b;)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class g extends com.p314xaae8f345.mm.sdk.p2605x8fb0427b.p2606x335620.AbstractC21005xe7f8081b<xc4.p> {

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f552970h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(n75.b dbProvider) {
        super(dbProvider);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dbProvider, "dbProvider");
        this.f552970h = jz5.h.b(zc4.f.f552969d);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2605x8fb0427b.p2606x335620.AbstractC21005xe7f8081b, l75.c1
    /* renamed from: O6 */
    public java.lang.String getF449889h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLogTag", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLogTag", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        return "MicroMsg.Improve.DataFlow";
    }

    public final boolean X6(long j17, long j18, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("deleteByLocalId", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        p75.m0 i18 = dm.s6.A.i(java.lang.Long.valueOf(j17));
        p75.n0 n0Var = dm.s6.f321381z;
        n0Var.getClass();
        if (n0Var instanceof p75.z) {
            throw new java.lang.IllegalArgumentException("Not support multi table delete");
        }
        java.lang.String table = n0Var.b();
        java.lang.String b17 = i18.b();
        java.lang.String[] e17 = i18.e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(table, "table");
        l75.k0 Q4 = this.f274680g.Q4();
        boolean z17 = (Q4 != null ? Q4.mo70514xb06685ab(table, b17, e17) : -1) >= 0;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.Improve.DataFlow", "deleteByLocalId localid:" + j17 + " result:" + z17, new java.lang.Object[0]);
        if (z17) {
            xc4.p pVar = new xc4.p();
            pVar.f72763xa3c65b86 = j17;
            pVar.m125487x53b40971(j18);
            pVar.mo125484x6e018feb(i17);
            o75.b bVar = o75.b.f425114b;
            o75.b bVar2 = o75.b.f425117e;
            java.lang.String valueOf = java.lang.String.valueOf(j17);
            getF449889h();
            o75.c cVar = new o75.c(bVar2, valueOf, "MicroMsg.Improve.DataFlow");
            cVar.f425123d = pVar;
            dm.s6.f321380x0.mo127123xc2079749(cVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteByLocalId", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        return z17;
    }

    public final xc4.p Y6(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBaseImproveSnsInfo", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("snsId", java.lang.Long.valueOf(j17));
        xc4.p pVar = (xc4.p) T6(contentValues, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(xc4.p.class));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBaseImproveSnsInfo", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        return pVar;
    }

    public final xc4.p Z6(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBaseImproveSnsInfoByLocalID", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("rowid", java.lang.Long.valueOf(j17));
        xc4.p pVar = (xc4.p) T6(contentValues, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(xc4.p.class));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBaseImproveSnsInfoByLocalID", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        return pVar;
    }

    public final xc4.p a7(java.lang.String localId) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBaseImproveSnsInfoByLocalIDStr", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localId, "localId");
        if (!com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.g(localId)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBaseImproveSnsInfoByLocalIDStr", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
            return null;
        }
        xc4.p Z6 = Z6(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.m(localId));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBaseImproveSnsInfoByLocalIDStr", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        return Z6;
    }

    public final xc4.p b7(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBaseImproveSnsInfoByPosition", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        p75.p0 p0Var = new p75.p0(dm.s6.C.z(), 2, 0);
        p75.i0 i18 = dm.s6.f321381z.i();
        i18.f434189c = "MicroMsg.Improve.DataFlow";
        i18.f434190d = p0Var;
        i18.e(new p75.g("createTime", false));
        i18.c(1, i17);
        java.util.List k17 = i18.a().k(this.f274680g.Q4(), xc4.p.class);
        if (((java.util.ArrayList) k17).isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBaseImproveSnsInfoByPosition", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
            return null;
        }
        xc4.p pVar = (xc4.p) kz5.n0.X(k17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBaseImproveSnsInfoByPosition", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        return pVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:161|(1:163)|164|165|166|167|(2:168|169)|(3:214|215|(13:218|(16:219|220|221|222|223|224|225|226|227|228|229|230|(1:253)(6:234|235|236|237|238|239)|240|241|(1:244)(1:243))|245|172|173|174|175|(3:177|178|179)|182|183|184|(4:186|(2:189|187)|190|191)|193))|171|172|173|174|175|(0)|182|183|184|(0)|193) */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x044f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0450, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdExpireDeleteHelper", "checkContractAd deleteAdWithNoCheck exp=" + r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x03ee, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0424, code lost:
    
        if (r7 == null) goto L119;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0432 A[Catch: all -> 0x044f, TryCatch #11 {all -> 0x044f, blocks: (B:184:0x042c, B:186:0x0432, B:187:0x0436, B:189:0x043c, B:191:0x044b), top: B:183:0x042c }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0390 A[LOOP:4: B:219:0x02b5->B:243:0x0390, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x038d A[EDGE_INSN: B:244:0x038d->B:245:0x038d BREAK  A[LOOP:4: B:219:0x02b5->B:243:0x0390], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x063d A[LOOP:1: B:87:0x0481->B:93:0x063d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0637 A[EDGE_INSN: B:94:0x0637->B:95:0x0637 BREAK  A[LOOP:1: B:87:0x0481->B:93:0x063d], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List c7(ym3.c r46) {
        /*
            Method dump skipped, instructions count: 2177
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zc4.g.c7(ym3.c):java.util.List");
    }

    public final boolean d7(int i17, o75.b eventID) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("postADInfoUpdateEventByLocalID", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventID, "eventID");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 L0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().L0(i17);
        if (L0 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("postADInfoUpdateEventByLocalID", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
            return false;
        }
        xc4.p pVar = new xc4.p();
        pVar.mo9762xbf5d97fd(L0.mo9763xeb27878e(), true);
        g7(pVar, eventID);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("postADInfoUpdateEventByLocalID", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        return true;
    }

    public final boolean e7(long j17, o75.b eventID) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("postADInfoUpdateEventBySnsID", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventID, "eventID");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 y07 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().y0(j17);
        if (y07 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("postADInfoUpdateEventBySnsID", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
            return false;
        }
        xc4.p pVar = new xc4.p();
        pVar.mo9762xbf5d97fd(y07.mo9763xeb27878e(), true);
        g7(pVar, eventID);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("postADInfoUpdateEventBySnsID", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        return true;
    }

    public final void f7(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 info, o75.b eventID) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("postEvent", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventID, "eventID");
        xc4.p pVar = new xc4.p();
        pVar.mo9762xbf5d97fd(info.mo9763xeb27878e(), true);
        java.lang.String valueOf = java.lang.String.valueOf(info.mo9766x4c6b483e());
        getF449889h();
        o75.c cVar = new o75.c(eventID, valueOf, "MicroMsg.Improve.DataFlow");
        cVar.f425123d = pVar;
        dm.s6.f321380x0.mo127123xc2079749(cVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("postEvent", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
    }

    public final void g7(xc4.p pVar, o75.b bVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("postEvent", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        java.lang.String valueOf = java.lang.String.valueOf(pVar.mo9766x4c6b483e());
        getF449889h();
        o75.c cVar = new o75.c(bVar, valueOf, "MicroMsg.Improve.DataFlow");
        cVar.f425123d = pVar;
        dm.s6.f321380x0.mo127123xc2079749(cVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("postEvent", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
    }

    public final boolean h7(long j17, o75.b eventID) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("postUpdateEventByLocalID", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventID, "eventID");
        xc4.p Z6 = Z6(j17);
        if (Z6 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("postUpdateEventByLocalID", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
            return false;
        }
        g7(Z6, eventID);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("postUpdateEventByLocalID", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        return true;
    }

    public final boolean i7(long j17, o75.b eventID) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("postUpdateEventBySnsID", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventID, "eventID");
        xc4.p Y6 = Y6(j17);
        if (Y6 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("postUpdateEventBySnsID", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
            return false;
        }
        g7(Y6, eventID);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("postUpdateEventBySnsID", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        return true;
    }

    public final boolean k7(long j17, r45.e86 e86Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("postUpdateEventBySnsIDWithComment", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        if (e86Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("postUpdateEventBySnsIDWithComment", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
            return false;
        }
        xc4.p Y6 = Y6(j17);
        if (Y6 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("postUpdateEventBySnsIDWithComment", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
            return false;
        }
        Y6.D0(java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
        o75.b bVar = o75.b.f425114b;
        g7(Y6, o75.b.f425116d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("postUpdateEventBySnsIDWithComment", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        return true;
    }
}
