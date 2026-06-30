package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class z2 extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final boolean f219290q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.e3 f219291r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.e3 e3Var, p13.u uVar, boolean z17) {
        super(uVar);
        this.f219291r = e3Var;
        this.f219290q = false;
        this.f219290q = z17;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "SearchMessageTask";
    }

    @Override // p13.c
    public int k() {
        return 34;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.database.CursorWrapper, android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, p13.y, p13.z] */
    @Override // p13.t
    public void p(p13.v vVar) {
        ?? r07;
        o("start");
        p13.r c17 = p13.r.c(this.f432668n.f432674c, false, this.f219291r.f219055p);
        vVar.f432692d = c17;
        if (this.f219290q) {
            w13.j jVar = this.f219291r.f219050h;
            java.lang.String str = this.f432668n.f432675d;
            jVar.getClass();
            java.lang.String f17 = c17.f();
            java.lang.String r17 = jVar.r();
            java.lang.String o17 = jVar.o();
            r07 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) jVar.f423731f).o("SELECT " + r17 + ".docid, type, subtype, entity_id, aux_index, timestamp, talker FROM " + r17 + " JOIN " + o17 + " ON (" + r17 + ".docid = " + o17 + ".rowid) WHERE " + o17 + " MATCH '" + f17 + "' AND aux_index = '" + str + "' AND status >= 0 ORDER BY timestamp desc;", null);
        } else {
            r07 = this.f219291r.f219050h.O(c17, this.f432668n.f432675d);
        }
        do {
            r07 = (android.database.CursorWrapper) r07;
            if (!r07.moveToNext()) {
                break;
            }
            ?? zVar = new p13.z();
            zVar.d(r07);
            zVar.f432730o = 1;
            vVar.f432693e.add(zVar);
        } while (vVar.f432693e.size() <= 100);
        r07.close();
        java.util.Collections.sort(vVar.f432693e, this.f432668n.f432683l);
        o("findMessage");
    }
}
