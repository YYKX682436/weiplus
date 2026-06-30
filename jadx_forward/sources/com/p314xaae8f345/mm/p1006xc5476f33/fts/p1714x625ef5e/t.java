package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class t extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public int f219210n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f219211o = 0;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l f219212p;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.m mVar) {
        this.f219212p = lVar;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "BuildChatroomIndexTask";
    }

    @Override // p13.c
    public boolean i() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchContactLogic", "Start building chatroom index.");
        java.util.HashSet hashSet = new java.util.HashSet();
        android.database.Cursor o17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f219212p.f219121g.f423731f).o("SELECT DISTINCT chatroom FROM FTS5ChatRoomMembers;", null);
        while (true) {
            android.database.CursorWrapper cursorWrapper = (android.database.CursorWrapper) o17;
            if (!cursorWrapper.moveToNext()) {
                break;
            }
            hashSet.add(cursorWrapper.getString(0));
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.e) o17).close();
        android.database.Cursor e17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.p) this.f219212p.f219122h).e("SELECT chatroomname, memberlist FROM chatroom;", null, 2);
        int i17 = 5;
        while (e17.moveToNext()) {
            if (java.lang.Thread.interrupted() || this.f432599f) {
                e17.close();
                this.f219212p.f219121g.j();
                throw new java.lang.InterruptedException();
            }
            java.lang.String string = e17.getString(0);
            java.lang.String string2 = e17.getString(1);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                java.lang.String[] split = o13.c.f423741a.split(string2);
                this.f219212p.f219125n.put(string, split);
                if (!hashSet.remove(string)) {
                    if (i17 >= 5) {
                        this.f219212p.f219121g.j();
                        this.f219212p.f219121g.h();
                        i17 = 0;
                    }
                    this.f219212p.f219121g.N(string, split);
                    i17++;
                    this.f219210n++;
                }
            }
        }
        e17.close();
        this.f219212p.f219121g.j();
        java.util.Iterator it = hashSet.iterator();
        int i18 = 5;
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (i18 >= 5) {
                this.f219212p.f219121g.j();
                this.f219212p.f219121g.h();
                i18 = 0;
            }
            w13.b bVar = this.f219212p.f219121g;
            bVar.f523738t.m107801x35198eae(1, str);
            bVar.f523738t.m107867xb158f775();
            i18++;
            this.f219211o++;
        }
        this.f219212p.f219121g.j();
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{new: %d removed: %d}", java.lang.Integer.valueOf(this.f219210n), java.lang.Integer.valueOf(this.f219211o));
    }

    @Override // p13.c
    public int k() {
        return 3;
    }
}
