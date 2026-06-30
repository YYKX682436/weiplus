package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class y extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f219271n;

    /* renamed from: o, reason: collision with root package name */
    public int f219272o = 0;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l f219273p;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar, java.lang.String str) {
        this.f219273p = lVar;
        this.f219271n = str;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "DeleteContactTask";
    }

    @Override // p13.c
    public boolean i() {
        java.lang.String str = this.f219271n;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchContactLogic", "Delete Contact %s", str);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar = this.f219273p;
        w13.b bVar = lVar.f219121g;
        int[] iArr = o13.d.f423757j;
        bVar.m0(iArr, str);
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.fts.d0.class)).ij().f219167g.m0(iArr, str);
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
            if (!lVar.f219124m.containsKey(str2)) {
                lVar.f219124m.put(str2, lVar.f219121g.w(o13.d.f423757j, str2, 1));
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.fts.d0.class)).ij().j(str2);
                this.f219272o++;
            }
        }
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{username: %s mDirtyCount: %d}", this.f219271n, java.lang.Integer.valueOf(this.f219272o));
    }
}
