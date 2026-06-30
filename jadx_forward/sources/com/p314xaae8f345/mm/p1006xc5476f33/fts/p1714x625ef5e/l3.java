package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class l3 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f219152n;

    /* renamed from: o, reason: collision with root package name */
    public p13.y f219153o;

    /* renamed from: p, reason: collision with root package name */
    public int f219154p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.HashMap f219155q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.m3 f219156r;

    public l3(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.m3 m3Var, com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.i3 i3Var) {
        this.f219156r = m3Var;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "UpdateTopHitsWithQueryTask";
    }

    @Override // p13.c
    public boolean i() {
        int i17;
        int i18;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        long j17;
        long j18;
        w13.k kVar = this.f219156r.f219167g;
        java.lang.String str4 = this.f219152n;
        p13.y yVar = this.f219153o;
        int i19 = this.f219154p;
        java.util.HashMap hashMap = this.f219155q;
        kVar.getClass();
        java.lang.String trim = str4.trim();
        hashMap.remove(yVar.f432720e);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int i27 = yVar.f432717b;
        if ((i27 == 131072 || i27 == 131075) && kVar.N(yVar.f432720e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5TopHitsStorage", "last contact msg time older than 60 days");
            return true;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) kVar.f423731f).a();
        android.database.Cursor o17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) kVar.f423731f).o(java.lang.String.format("SELECT docid, score FROM %s WHERE query=? AND aux_index=? AND subtype = ? AND scene=?;", kVar.r()), new java.lang.String[]{trim, yVar.f432720e, java.lang.String.valueOf(yVar.f432718c), java.lang.String.valueOf(i19)});
        android.database.CursorWrapper cursorWrapper = (android.database.CursorWrapper) o17;
        if (cursorWrapper.moveToNext()) {
            i18 = cursorWrapper.getInt(0);
            i17 = cursorWrapper.getInt(1);
        } else {
            i17 = -1;
            i18 = -1;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.e) o17).close();
        java.lang.String str5 = "";
        java.lang.String str6 = "";
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            if (!((java.lang.String) entry.getValue()).equals("\u200bchatroom_tophits")) {
                str6 = str6 + "'" + ((java.lang.String) entry.getKey()) + "',";
            }
        }
        if (str6.length() > 0) {
            str2 = "MicroMsg.FTS.FTS5TopHitsStorage";
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("AND aux_index IN (");
            str = trim;
            sb6.append(str6.substring(0, str6.length() - 1));
            sb6.append(")");
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) kVar.f423731f).i(java.lang.String.format("UPDATE %s SET score=CASE WHEN score > 6 THEN 6 WHEN score > 2 THEN (score - 1) ELSE score END WHERE scene = %d %s;", kVar.r(), java.lang.Integer.valueOf(i19), sb6.toString()));
        } else {
            str = trim;
            str2 = "MicroMsg.FTS.FTS5TopHitsStorage";
        }
        java.lang.String str7 = "";
        for (java.util.Map.Entry entry2 : hashMap.entrySet()) {
            if (((java.lang.String) entry2.getValue()).equals("\u200bchatroom_tophits")) {
                str7 = str7 + "'" + ((java.lang.String) entry2.getKey()) + "',";
            }
        }
        if (str7.length() > 0) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) kVar.f423731f).j(java.lang.String.format("UPDATE %s SET score=CASE WHEN score = 1 THEN 0 WHEN score < 5 THEN (score - 1) ELSE 4 END WHERE query = ? AND scene = %d %s;", kVar.r(), java.lang.Integer.valueOf(i19), "AND aux_index IN(" + str7.substring(0, str7.length() - 1) + ")"), new java.lang.String[]{"\u200bchatroom_tophits"});
        }
        if (i18 < 0 || i17 < 0) {
            kVar.f523754r.m107801x35198eae(1, yVar.f432723h);
            kVar.f523754r.m107867xb158f775();
            kVar.f523755s.m107799x37fbf859(1, yVar.f432717b);
            kVar.f523755s.m107799x37fbf859(2, yVar.f432718c);
            kVar.f523755s.m107799x37fbf859(3, yVar.f432719d);
            kVar.f523755s.m107801x35198eae(4, yVar.f432720e);
            kVar.f523755s.m107799x37fbf859(5, currentTimeMillis);
            str3 = str;
            kVar.f523755s.m107801x35198eae(6, str3);
            kVar.f523755s.m107799x37fbf859(7, 3L);
            kVar.f523755s.m107799x37fbf859(8, i19);
            kVar.f523755s.m107801x35198eae(9, yVar.f432723h);
            kVar.f523755s.m107867xb158f775();
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) kVar.f423731f).j(java.lang.String.format("UPDATE %s SET score=?, timestamp=? WHERE docid=?", kVar.r()), new java.lang.String[]{java.lang.String.valueOf(i17 > 6 ? i17 + 1 : i17 + 3), java.lang.String.valueOf(currentTimeMillis), java.lang.String.valueOf(i18)});
            str3 = str;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) kVar.f423731f).d();
        java.lang.String[] split = o13.c.f423746f.split(str3);
        if (split.length <= 1 || yVar.f432717b != 131075 || yVar.f432718c != 38) {
            return true;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        android.database.Cursor o18 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) kVar.f423731f).o(java.lang.String.format("SELECT docid, query, score, scene, aux_index, entity_id, type, subtype, timestamp, meta_content FROM %s WHERE aux_index=? AND query=?;", kVar.r()), new java.lang.String[]{yVar.f432720e, "\u200bchatroom_tophits"});
        android.database.CursorWrapper cursorWrapper2 = (android.database.CursorWrapper) o18;
        if (cursorWrapper2.moveToNext()) {
            long j19 = cursorWrapper2.getLong(0);
            cursorWrapper2.getString(1);
            j18 = cursorWrapper2.getLong(2);
            cursorWrapper2.getLong(3);
            cursorWrapper2.getString(4);
            cursorWrapper2.getLong(5);
            cursorWrapper2.getInt(6);
            cursorWrapper2.getInt(7);
            cursorWrapper2.getLong(8);
            java.lang.String string = cursorWrapper2.getString(9);
            for (java.lang.String str8 : o13.c.f423743c.split(string)) {
                hashSet.add(str8);
            }
            str5 = string;
            j17 = j19;
        } else {
            j17 = 0;
            j18 = 0;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.e) o18).close();
        java.lang.String str9 = str5;
        for (int i28 = 0; i28 < ((java.util.ArrayList) yVar.f432729n).size() && i28 < split.length; i28++) {
            p13.l lVar = (p13.l) ((java.util.ArrayList) yVar.f432729n).get(i28);
            if (hashSet.add(lVar.f432645c)) {
                str9 = str9 + lVar.f432645c + "\u200b";
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "update tophits content=%s", str9);
        if (j17 > 0) {
            kVar.l(j17);
        }
        long j27 = i19;
        java.lang.String str10 = yVar.f432720e;
        long j28 = yVar.f432719d;
        int i29 = yVar.f432717b;
        int i37 = yVar.f432718c;
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) kVar.f423731f).a();
        kVar.f523754r.m107801x35198eae(1, str9);
        kVar.f523754r.m107867xb158f775();
        kVar.f523755s.m107799x37fbf859(1, i29);
        kVar.f523755s.m107799x37fbf859(2, i37);
        kVar.f523755s.m107799x37fbf859(3, j28);
        kVar.f523755s.m107801x35198eae(4, str10);
        kVar.f523755s.m107799x37fbf859(5, currentTimeMillis);
        kVar.f523755s.m107801x35198eae(6, "\u200bchatroom_tophits");
        kVar.f523755s.m107799x37fbf859(7, j18 + 1);
        kVar.f523755s.m107799x37fbf859(8, j27);
        kVar.f523755s.m107801x35198eae(9, str9);
        kVar.f523755s.m107867xb158f775();
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) kVar.f423731f).d();
        return true;
    }

    /* renamed from: toString */
    public java.lang.String m63544x9616526c() {
        return java.lang.String.format("%s : query=%s scene=%d", super.toString(), this.f219152n, java.lang.Integer.valueOf(this.f219154p));
    }
}
