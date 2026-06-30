package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class e0 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f219041n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f219042o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f219043p = false;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l f219044q;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar, java.lang.String str) {
        this.f219044q = lVar;
        this.f219041n = str;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "MarkContactDirtyTask";
    }

    @Override // p13.c
    public boolean i() {
        java.lang.String str = this.f219041n;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchContactLogic", "Dirty Contact %s", str);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar = this.f219044q;
        if (lVar.f219124m.containsKey(str)) {
            this.f219042o = true;
            return true;
        }
        lVar.f219121g.J(str);
        java.util.List w17 = lVar.f219121g.w(o13.d.f423757j, str, 1);
        lVar.f219124m.put(str, w17);
        if (((java.util.ArrayList) w17).isEmpty()) {
            this.f219043p = true;
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) lVar.f219119e).b(65556, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.a0(lVar, str));
            return true;
        }
        android.database.Cursor o17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) lVar.f219121g.f423731f).o("SELECT DISTINCT chatroom FROM FTS5ChatRoomMembers WHERE member=?;", new java.lang.String[]{str});
        java.util.HashSet hashSet = new java.util.HashSet();
        while (true) {
            android.database.CursorWrapper cursorWrapper = (android.database.CursorWrapper) o17;
            if (!cursorWrapper.moveToNext()) {
                break;
            }
            hashSet.add(cursorWrapper.getString(0));
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.e) o17).close();
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            lVar.f219121g.J(str2);
            if (!lVar.f219124m.containsKey(str2)) {
                lVar.f219124m.put(str2, lVar.f219121g.w(o13.d.f423757j, str2, 1));
            }
        }
        lVar.f219123i.remove(str);
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.fts.d0.class)).ij().j(str);
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{username: %s cached: %b isSkipped: %b}", this.f219041n, java.lang.Boolean.valueOf(this.f219042o), java.lang.Boolean.valueOf(this.f219043p));
    }

    @Override // p13.c
    public int k() {
        return 17;
    }
}
