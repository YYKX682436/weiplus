package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes10.dex */
public final class l extends l75.n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f208628f = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.wj0.N, "FinderAction")};

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f208629g;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f208630d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f208631e;

    static {
        java.lang.String[] INDEX_CREATE = dm.w3.f322292v;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(INDEX_CREATE, "INDEX_CREATE");
        java.util.ArrayList arrayList = (java.util.ArrayList) kz5.z.C0(INDEX_CREATE);
        arrayList.add("CREATE INDEX IF NOT EXISTS " + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.wj0.P + " ON FinderAction ( actionType,state,postTime )");
        arrayList.add("CREATE INDEX IF NOT EXISTS " + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.wj0.Q + " ON FinderAction (actionType,feedId, postTime)");
        f208629g = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(l75.k0 db6) {
        super(db6, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.wj0.N, "FinderAction", f208629g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        l75.e0 e0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.wj0.N;
        this.f208630d = db6;
        this.f208631e = "SELECT * FROM FinderAction";
    }

    public final void D0(long j17, long j18, long j19, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5457xd6bc6fd1 c5457xd6bc6fd1 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5457xd6bc6fd1();
        am.ta taVar = c5457xd6bc6fd1.f135796g;
        taVar.f89526a = j17;
        taVar.f89527b = j18;
        taVar.getClass();
        taVar.f89528c = i17;
        taVar.f89529d = yj0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderActionStorage", "postEvent, feedId:" + j17 + ", commentId:" + j18 + ", localId:" + j19 + ", opType:" + i17);
        c5457xd6bc6fd1.e();
    }

    public final boolean J0(long j17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        sb6.append(j17);
        boolean z17 = this.f208630d.mo70514xb06685ab("FinderAction", "localCommentId=?", new java.lang.String[]{sb6.toString()}) > 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderActionStorage", "removeUnsentComment " + j17 + " ret:" + z17);
        return z17;
    }

    public final boolean L0(long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 comment, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comment, "comment");
        android.content.ContentValues mo9763xeb27878e = comment.mo9763xeb27878e();
        mo9763xeb27878e.remove("rowid");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        sb6.append(j17);
        boolean z18 = this.f208630d.p("FinderAction", mo9763xeb27878e, "localCommentId=?", new java.lang.String[]{sb6.toString()}) > 0;
        l75.e0 e0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.wj0.N;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.wj0.S;
        if (z17) {
            D0(comment.f68959xf9a02e3e, comment.t0(), comment.f68961xf609be94, i17, comment);
        }
        return z18;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005a, code lost:
    
        vz5.b.a(r1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005d, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0047, code lost:
    
        if (r1.moveToFirst() != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0049, code lost:
    
        r7 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0();
        r7.mo9015xbf5d97fd(r1);
        r6.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0058, code lost:
    
        if (r1.moveToNext() != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List y0(long r6) {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r5.f208631e
            r0.append(r1)
            java.lang.String r1 = " WHERE actionType = 1 and feedId = "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = " ORDER BY postTime DESC"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 2
            l75.k0 r2 = r5.f208630d
            r3 = 0
            android.database.Cursor r1 = r2.f(r0, r3, r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "getAllUnsentCommentsByFeedId "
            r2.<init>(r4)
            r2.append(r6)
            r6 = 32
            r2.append(r6)
            r2.append(r0)
            java.lang.String r6 = r2.toString()
            java.lang.String r7 = "Finder.FinderActionStorage"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r7, r6)
            java.util.LinkedList r6 = new java.util.LinkedList
            r6.<init>()
            boolean r7 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L5e
            if (r7 == 0) goto L5a
        L49:
            com.tencent.mm.plugin.finder.storage.yj0 r7 = new com.tencent.mm.plugin.finder.storage.yj0     // Catch: java.lang.Throwable -> L5e
            r7.<init>()     // Catch: java.lang.Throwable -> L5e
            r7.mo9015xbf5d97fd(r1)     // Catch: java.lang.Throwable -> L5e
            r6.add(r7)     // Catch: java.lang.Throwable -> L5e
            boolean r7 = r1.moveToNext()     // Catch: java.lang.Throwable -> L5e
            if (r7 != 0) goto L49
        L5a:
            vz5.b.a(r1, r3)
            return r6
        L5e:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L60
        L60:
            r7 = move-exception
            vz5.b.a(r1, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.l.y0(long):java.util.List");
    }

    public final long z0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_FINDACTION_MAXID_LONG_SYNC;
        long t17 = c17.t(u3Var, 1L);
        gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(1 + t17));
        action.f68961xf609be94 = t17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderActionStorage", "new feed action rowId " + this.f208630d.l("FinderAction", "localCommentId", action.mo9763xeb27878e()) + ' ' + pm0.b0.g(action) + " localID: " + t17);
        long j17 = action.f68959xf9a02e3e;
        long t07 = action.t0();
        long j18 = action.f68961xf609be94;
        l75.e0 e0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.wj0.N;
        D0(j17, t07, j18, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.wj0.S, action);
        return t17;
    }
}
