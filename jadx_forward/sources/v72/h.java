package v72;

/* loaded from: classes12.dex */
public class h extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ v72.i f515196q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(v72.i iVar, p13.u uVar) {
        super(uVar);
        this.f515196q = iVar;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "SearchTopFavoriteTask";
    }

    @Override // p13.c
    public int k() {
        return 9;
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        android.database.Cursor o17;
        p13.r b17 = p13.r.b(this.f432668n.f432674c, true);
        vVar.f432692d = b17;
        v72.a aVar = this.f515196q.f515200h;
        int i17 = this.f432668n.f432680i + 1;
        aVar.getClass();
        if (b17.a()) {
            o17 = new d95.d();
        } else {
            o17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) aVar.f423731f).o(java.lang.String.format("SELECT %s.docid, type, subtype, entity_id, aux_index, timestamp FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' ORDER BY -timestamp, subtype limit " + (i17 + 1) + ";", aVar.r(), aVar.r(), aVar.o(), aVar.r(), aVar.o(), aVar.o(), b17.f()), null);
        }
        vVar.f432693e = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet();
        while (o17.moveToNext()) {
            if (hashSet.add(java.lang.String.valueOf(o17.getLong(3)))) {
                p13.z zVar = new p13.z();
                zVar.c(o17);
                vVar.f432693e.add(zVar);
                if (vVar.f432693e.size() > this.f432668n.f432680i) {
                    break;
                }
                if (java.lang.Thread.interrupted() || this.f432599f) {
                    o17.close();
                    throw new java.lang.InterruptedException();
                }
            }
        }
        o17.close();
    }
}
