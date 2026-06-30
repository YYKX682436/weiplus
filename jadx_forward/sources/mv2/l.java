package mv2;

/* loaded from: classes10.dex */
public final class l {

    /* renamed from: d */
    public static final mv2.l f413130d = new mv2.l();

    /* renamed from: a */
    public final fp0.o f413131a = new fp0.o(new gp0.g(new gp0.b(100, Integer.MAX_VALUE), new gp0.h(1, 5), 1, "finder_action_post_quene"));

    /* renamed from: b */
    public final java.util.Map f413132b = java.util.Collections.synchronizedMap(new java.util.HashMap());

    /* renamed from: c */
    public final java.lang.Runnable f413133c = new mv2.g(this);

    public static /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 b(mv2.l lVar, long j17, java.lang.String str, long j18, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Long l17, java.lang.String str6, java.lang.String str7, java.lang.String str8, int i17, boolean z17, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87, r45.qt2 qt2Var, int i18, java.util.List list, java.util.LinkedList linkedList, int i19, r45.e60 e60Var, long j19, java.lang.String str9, yz5.r rVar, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i27, cu2.a aVar, int i28, java.lang.Object obj) {
        return lVar.a(j17, str, j18, str2, str3, str4, str5, l17, str6, str7, str8, i17, (i28 & 4096) != 0 ? false : z17, (i28 & 8192) != 0 ? null : c19781xd1c47b87, qt2Var, (32768 & i28) != 0 ? 0 : i18, list, linkedList, (262144 & i28) != 0 ? 0 : i19, (524288 & i28) != 0 ? null : e60Var, (1048576 & i28) != 0 ? 0L : j19, (2097152 & i28) != 0 ? "" : str9, (4194304 & i28) != 0 ? null : rVar, (8388608 & i28) != 0 ? null : gVar, (i28 & com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb) != 0 ? 0 : i27, aVar);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 a(long j17, java.lang.String feedUsername, long j18, java.lang.String objectNonceId, java.lang.String str, java.lang.String replyUsername, java.lang.String replyNickname, java.lang.Long l17, java.lang.String str2, java.lang.String username, java.lang.String nickname, int i17, boolean z17, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87, r45.qt2 qt2Var, int i18, java.util.List mentionList, java.util.LinkedList linkedList, int i19, r45.e60 e60Var, long j19, java.lang.String udfKv, yz5.r rVar, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i27, cu2.a displayInfo) {
        java.util.LinkedList m75941xfb821914;
        r45.j60 j60Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedUsername, "feedUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectNonceId, "objectNonceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(replyUsername, "replyUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(replyNickname, "replyNickname");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickname, "nickname");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mentionList, "mentionList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(udfKv, "udfKv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(displayInfo, "displayInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 c17 = cu2.m.f303953a.c(j18, objectNonceId, username, feedUsername, l17, str2, replyUsername, replyNickname, str, nickname, i17, j17, z17, c19781xd1c47b87, qt2Var, i18, mentionList, linkedList, i19, displayInfo, e60Var);
        c17.f209927l1 = udfKv;
        if (i19 != 2) {
            ((c61.l7) i95.n0.c(c61.l7.class)).Ij().z0(c17);
            d(new mv2.e(c17, gVar, i27, rVar));
            return c17;
        }
        r45.e60 v07 = c17.v0();
        if (v07 != null && (m75941xfb821914 = v07.m75941xfb821914(1)) != null && (j60Var = (r45.j60) kz5.n0.Z(m75941xfb821914)) != null) {
            j60Var.set(10, java.lang.Long.valueOf(j19 / 1000));
        }
        f(c17, gVar, i27, rVar);
        return c17;
    }

    public final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderActionManager", "onPostCommentContentFailed " + str + ' ' + yj0Var.f68961xf609be94);
        yj0Var.f68965x29d3a50c = -1;
        yj0Var.f68958xdad0d5ae = 3;
        ((c61.l7) i95.n0.c(c61.l7.class)).Ij().L0(yj0Var.f68961xf609be94, yj0Var, true);
    }

    public final void d(mv2.b action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        this.f413131a.b(action, new mv2.f(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r8 = this;
            java.lang.Class<c61.l7> r0 = c61.l7.class
            i95.m r0 = i95.n0.c(r0)
            c61.l7 r0 = (c61.l7) r0
            com.tencent.mm.plugin.finder.storage.l r0 = r0.Ij()
            r0.getClass()
            pm0.c r1 = new pm0.c
            java.lang.String r2 = "getRecentAction"
            r1.<init>(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r0.f208631e
            r2.append(r3)
            java.lang.String r3 = " WHERE actionType = 1 and state == 1 ORDER BY postTime DESC limit 1"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            l75.k0 r0 = r0.f208630d
            r3 = 0
            r4 = 2
            android.database.Cursor r0 = r0.f(r2, r3, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "getRecentAction "
            r4.<init>(r5)
            r4.append(r1)
            r1 = 32
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            java.lang.String r2 = "Finder.FinderActionStorage"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r1)
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L85
            if (r1 == 0) goto L61
        L52:
            com.tencent.mm.plugin.finder.storage.yj0 r1 = new com.tencent.mm.plugin.finder.storage.yj0     // Catch: java.lang.Throwable -> L85
            r1.<init>()     // Catch: java.lang.Throwable -> L85
            r1.mo9015xbf5d97fd(r0)     // Catch: java.lang.Throwable -> L85
            boolean r4 = r0.moveToNext()     // Catch: java.lang.Throwable -> L85
            if (r4 != 0) goto L52
            goto L62
        L61:
            r1 = r3
        L62:
            vz5.b.a(r0, r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            if (r1 == 0) goto L84
            mv2.b r0 = new mv2.b
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            r2 = r0
            r3 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            r8.d(r0)
        L84:
            return
        L85:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L87
        L87:
            r2 = move-exception
            vz5.b.a(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: mv2.l.e():void");
    }

    public final void f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 unsentComment, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i17, yz5.r rVar) {
        java.lang.String str;
        java.util.LinkedList m75941xfb821914;
        r45.j60 j60Var;
        java.util.LinkedList m75941xfb8219142;
        r45.j60 j60Var2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unsentComment, "unsentComment");
        r45.e60 v07 = unsentComment.v0();
        if (v07 == null || (m75941xfb8219142 = v07.m75941xfb821914(1)) == null || (j60Var2 = (r45.j60) kz5.n0.Z(m75941xfb8219142)) == null || (str = j60Var2.m75945x2fec8307(0)) == null) {
            str = "";
        }
        java.lang.String str2 = str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9 e9Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a;
        com.p314xaae8f345.mm.vfs.w6.u(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183682r);
        unsentComment.f68965x29d3a50c = 3;
        if (!com.p314xaae8f345.mm.vfs.w6.j(str2)) {
            c(unsentComment, "fileExist");
            return;
        }
        android.graphics.BitmapFactory.Options n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(str2);
        r45.e60 v08 = unsentComment.v0();
        if (v08 != null && (m75941xfb821914 = v08.m75941xfb821914(1)) != null && (j60Var = (r45.j60) kz5.n0.Z(m75941xfb821914)) != null) {
            j60Var.set(2, java.lang.Integer.valueOf(n07.outWidth));
            j60Var.set(3, java.lang.Integer.valueOf(n07.outHeight));
            java.util.LinkedList Q0 = unsentComment.Q0();
            if (Q0 != null) {
                Q0.clear();
            }
            java.util.LinkedList Q02 = unsentComment.Q0();
            if (Q02 != null) {
                r45.j60 j60Var3 = new r45.j60();
                j60Var3.set(2, java.lang.Integer.valueOf(j60Var.m75939xb282bd08(2)));
                j60Var3.set(3, java.lang.Integer.valueOf(j60Var.m75939xb282bd08(3)));
                j60Var3.set(0, j60Var.m75945x2fec8307(0));
                j60Var3.set(7, j60Var.m75945x2fec8307(0));
                Q02.add(j60Var3);
            }
        }
        ((c61.l7) i95.n0.c(c61.l7.class)).Ij().z0(unsentComment);
        pm0.v.w(new mv2.k(this, unsentComment, str2, n07, gVar, i17, rVar));
    }
}
