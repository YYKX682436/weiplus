package w13;

/* loaded from: classes12.dex */
public class h extends o13.a {

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 f523747r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 f523748s;

    @Override // o13.a
    public boolean C() {
        return !i(-105, 3);
    }

    @Override // o13.a
    public void E() {
        if (C()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).q(-105L, 3L);
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).q(-200L, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).i(java.lang.String.format("CREATE INDEX IF NOT EXISTS %s_timestamp ON %s(timestamp);", r(), r()));
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).i(java.lang.String.format("CREATE INDEX IF NOT EXISTS %s_talker ON %s(talker);", r(), r()));
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).i(java.lang.String.format("CREATE INDEX IF NOT EXISTS %s_aux_subtype_ts ON %s(aux_index, subtype, timestamp);", r(), r()));
        this.f523747r = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).e(java.lang.String.format("UPDATE %s SET status = ? WHERE aux_index = ? AND status <> ?", r()));
        this.f523748s = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).e(java.lang.String.format("INSERT OR REPLACE INTO %s (docid, type, subtype, entity_id, aux_index, timestamp, talker) VALUES (last_insert_rowid(), ?, ?, ?, ?, ?, ?);", r()));
    }

    @Override // o13.a
    public boolean G() {
        this.f523747r.close();
        this.f523748s.close();
        super.G();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void N(int r12, int r13, long r14, java.lang.String r16, long r17, java.lang.String r19, java.lang.String r20) {
        /*
            r11 = this;
            r1 = r11
            r9 = r16
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r19)
            if (r0 == 0) goto La
            return
        La:
            java.lang.Class<o13.z> r0 = o13.z.class
            i95.m r0 = i95.n0.c(r0)
            o13.z r0 = (o13.z) r0
            r2 = r0
            com.tencent.mm.plugin.fts.d0 r2 = (com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) r2
            r3 = r12
            r4 = r13
            r5 = r14
            r7 = r16
            r8 = r19
            r2.tj(r3, r4, r5, r7, r8)
            com.tencent.wcdb.database.SQLiteStatement r0 = r1.f423732g     // Catch: com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L6b
            r2 = 1
            r3 = r19
            r0.m107801x35198eae(r2, r3)     // Catch: com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L6b
            com.tencent.wcdb.database.SQLiteStatement r0 = r1.f423732g     // Catch: com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L6b
            r0.m107867xb158f775()     // Catch: com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L6b
            com.tencent.wcdb.database.SQLiteStatement r0 = r1.f523748s     // Catch: com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L6b
            r3 = r12
            long r4 = (long) r3
            r0.m107799x37fbf859(r2, r4)     // Catch: com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L69
            com.tencent.wcdb.database.SQLiteStatement r0 = r1.f523748s     // Catch: com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L69
            r2 = 2
            r4 = r13
            long r5 = (long) r4
            r0.m107799x37fbf859(r2, r5)     // Catch: com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L67
            com.tencent.wcdb.database.SQLiteStatement r0 = r1.f523748s     // Catch: com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L67
            r2 = 3
            r5 = r14
            r0.m107799x37fbf859(r2, r14)     // Catch: com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L65
            com.tencent.wcdb.database.SQLiteStatement r0 = r1.f523748s     // Catch: com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L65
            r2 = 4
            r0.m107801x35198eae(r2, r9)     // Catch: com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L65
            com.tencent.wcdb.database.SQLiteStatement r0 = r1.f523748s     // Catch: com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L65
            r2 = 5
            r7 = r17
            r0.m107799x37fbf859(r2, r7)     // Catch: com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L63
            com.tencent.wcdb.database.SQLiteStatement r0 = r1.f523748s     // Catch: com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L63
            java.lang.String r2 = ""
            if (r20 != 0) goto L57
            goto L59
        L57:
            r2 = r20
        L59:
            r10 = 6
            r0.m107801x35198eae(r10, r2)     // Catch: com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L63
            com.tencent.wcdb.database.SQLiteStatement r0 = r1.f523748s     // Catch: com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L63
            r0.m107867xb158f775()     // Catch: com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L63
            return
        L63:
            r0 = move-exception
            goto L71
        L65:
            r0 = move-exception
            goto L6f
        L67:
            r0 = move-exception
            goto L6e
        L69:
            r0 = move-exception
            goto L6d
        L6b:
            r0 = move-exception
            r3 = r12
        L6d:
            r4 = r13
        L6e:
            r5 = r14
        L6f:
            r7 = r17
        L71:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            java.lang.Long r4 = java.lang.Long.valueOf(r14)
            java.lang.Long r5 = java.lang.Long.valueOf(r17)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4, r9, r5}
            java.lang.String r3 = "Failed inserting index: 0x%x, %d, %d, %s, %d"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            java.lang.String r3 = "MicroMsg.FTS.FTS5MessageStorage"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r2)
            com.tencent.wcdb.database.SQLiteStatement r2 = r1.f423739q
            java.lang.String r2 = r2.m107875xeae4a4()
            if (r2 == 0) goto La7
            int r4 = r2.length()
            if (r4 <= 0) goto La7
            java.lang.String r4 = ">> "
            java.lang.String r2 = r4.concat(r2)
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r2)
        La7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w13.h.N(int, int, long, java.lang.String, long, java.lang.String, java.lang.String):void");
    }

    public android.database.Cursor O(p13.r rVar, java.lang.String str, java.util.Set set) {
        java.lang.String f17 = rVar.f();
        java.lang.String str2 = "";
        java.lang.String format = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? java.lang.String.format(" AND aux_index = '%s'", str) : "";
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            java.lang.String str3 = (java.lang.String) it.next();
            stringBuffer.append("'");
            stringBuffer.append(str3);
            stringBuffer.append("',");
        }
        if (stringBuffer.length() > 0) {
            str2 = " AND talker IN (" + stringBuffer.substring(0, stringBuffer.length() - 1) + ")";
        }
        return ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).o(java.lang.String.format("SELECT %s.docid, type, subtype, entity_id, aux_index, timestamp, talker FROM %s JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s'" + str2 + format + " AND status >= 0" + q() + ";", r(), r(), o(), r(), o(), o(), f17), null);
    }

    @Override // o13.u
    /* renamed from: getName */
    public java.lang.String mo9549xfb82e301() {
        return "FTS5MessageStorage";
    }

    @Override // o13.u
    /* renamed from: getPriority */
    public int mo9550x3662b71a() {
        return 4;
    }

    @Override // o13.u
    /* renamed from: getType */
    public int mo9551xfb85f7b0() {
        return 4;
    }

    @Override // o13.a
    public java.lang.String n() {
        return java.lang.String.format("CREATE TABLE IF NOT EXISTS %s (docid INTEGER PRIMARY KEY, type INT, subtype INT DEFAULT 0, entity_id INTEGER, aux_index TEXT, timestamp INTEGER, status INT DEFAULT 0, talker TEXT);", r());
    }

    @Override // o13.a
    public java.lang.String p() {
        return "MicroMsg.FTS.FTS5MessageStorage";
    }

    public final java.lang.String q() {
        return !(j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.fts.C20220x86c30e7b()) == 1) ? " AND subtype != 70" : "";
    }

    @Override // o13.u
    public android.database.Cursor q1(int[] iArr, java.lang.String str) {
        if (iArr == null || iArr.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FTS.FTS5MessageStorage", "queryConversationTypeMessage: subTypes is null or empty, return EmptyCursor");
            return new d95.d();
        }
        boolean z17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        java.lang.String str2 = z17 ? "AND aux_index = ?" : "";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i17 : iArr) {
            sb6.append(i17);
            sb6.append(",");
        }
        return ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).o(java.lang.String.format("SELECT type, subtype, entity_id, aux_index, timestamp, talker FROM %s WHERE subtype IN (%s) %s AND status >= 0 ORDER BY timestamp desc;", r(), sb6.substring(0, sb6.length() - 1), str2), z17 ? new java.lang.String[]{str} : null);
    }

    @Override // o13.a
    public java.lang.String t() {
        return "Message";
    }
}
