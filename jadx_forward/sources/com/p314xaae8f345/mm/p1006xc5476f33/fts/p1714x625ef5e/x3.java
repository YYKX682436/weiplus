package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class x3 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final p13.u f219270n;

    public x3(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.c4 c4Var, p13.u uVar) {
        this.f219270n = uVar;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "FTS5DBInfoTask";
    }

    @Override // p13.c
    public boolean i() {
        com.p314xaae8f345.mm.vfs.z7 z7Var;
        long j17;
        long j18;
        long j19;
        com.p314xaae8f345.mm.vfs.x1 m17;
        o13.o oVar = o13.p.f423782b;
        gm0.j1.i();
        java.lang.String h17 = gm0.j1.u().h();
        com.p314xaae8f345.mm.vfs.z7 a17 = h17 == null ? null : com.p314xaae8f345.mm.vfs.z7.a(h17);
        if (a17 == null) {
            z7Var = new com.p314xaae8f345.mm.vfs.z7(null, null, com.p314xaae8f345.mm.vfs.e8.l("FTS5IndexMicroMsg_encrypt.db", false, false), null, null);
        } else {
            z7Var = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, com.p314xaae8f345.mm.vfs.e8.l(a17.f294812f + "/FTS5IndexMicroMsg_encrypt.db", false, false), a17.f294813g, a17.f294814h);
        }
        com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(z7Var, null);
        oVar.f423776a = ((m18.a() && (m17 = m18.f294799a.m(m18.f294800b)) != null) ? m17.f294766c : 0L) / 1048576;
        android.database.Cursor o17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f218914f.o(java.lang.String.format("SELECT count(docid) FROM %s WHERE type = %d AND subtype = %d", "FTS5MetaContact", 131072, 1), null);
        try {
            android.database.CursorWrapper cursorWrapper = (android.database.CursorWrapper) o17;
            if (cursorWrapper.moveToNext()) {
                j17 = cursorWrapper.getLong(0);
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.e) o17).close();
            } else {
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.e) o17).close();
                j17 = 0;
            }
            oVar.f423777b = j17;
            o17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f218914f.o(java.lang.String.format("SELECT count(docid) FROM %s WHERE type = %d AND subtype = %d", "FTS5MetaContact", 131075, 38), null);
            try {
                android.database.CursorWrapper cursorWrapper2 = (android.database.CursorWrapper) o17;
                if (cursorWrapper2.moveToNext()) {
                    j18 = cursorWrapper2.getLong(0);
                } else {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.fts.e) o17).close();
                    j18 = 0;
                }
                oVar.f423778c = j18;
                o17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f218914f.o(java.lang.String.format("SELECT count(docid) FROM %s WHERE subtype = %d", "FTS5MetaFavorite", 9), null);
                try {
                    android.database.CursorWrapper cursorWrapper3 = (android.database.CursorWrapper) o17;
                    if (cursorWrapper3.moveToNext()) {
                        j19 = cursorWrapper3.getLong(0);
                    } else {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.e) o17).close();
                        j19 = 0;
                    }
                    oVar.f423780e = j19;
                    o17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f218914f.o(java.lang.String.format("SELECT count(docid) FROM %s", "FTS5MetaMessage"), null);
                    try {
                        android.database.CursorWrapper cursorWrapper4 = (android.database.CursorWrapper) o17;
                        long j27 = cursorWrapper4.moveToNext() ? cursorWrapper4.getLong(0) : 0L;
                        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.e) o17).close();
                        oVar.f423779d = j27;
                        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f218914f.q(-301L, oVar.f423777b);
                        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f218914f.q(-302L, oVar.f423778c);
                        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f218914f.q(-303L, oVar.f423780e);
                        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f218914f.q(-304L, oVar.f423779d);
                        p13.v vVar = new p13.v(this.f219270n);
                        if (this.f219270n.f432684m != null) {
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.w3(this, vVar));
                        }
                        return true;
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }
}
