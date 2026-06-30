package od2;

/* loaded from: classes12.dex */
public class i extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ od2.k f426150q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(od2.k kVar, p13.u uVar) {
        super(uVar);
        this.f426150q = kVar;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "SearchFinderFollowTask";
    }

    @Override // p13.c
    public int k() {
        return 47;
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchFinderFollowerLogic", "execSearch, isTeenModeAndViewNothing.");
            return;
        }
        p13.u uVar = this.f432668n;
        vVar.f432692d = p13.r.b(uVar.f432674c, true);
        vVar.f432693e = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet();
        android.database.Cursor H = this.f426150q.f426154f.H(vVar.f432692d, o13.d.f423753f, uVar.f432679h, null, true, true);
        while (H.moveToNext()) {
            try {
                p13.z zVar = new p13.z();
                zVar.c(H);
                if (!hashSet.contains(java.lang.Long.valueOf(zVar.f432719d)) && !uVar.f432681j.contains(zVar.f432720e)) {
                    zVar.a();
                    vVar.f432693e.add(zVar);
                    hashSet.add(java.lang.Long.valueOf(zVar.f432719d));
                }
            } catch (java.lang.Throwable th6) {
                try {
                    throw th6;
                } catch (java.lang.Throwable th7) {
                    H.close();
                    throw th7;
                }
            }
        }
        H.close();
        java.util.Comparator comparator = uVar.f432683l;
        if (comparator != null) {
            java.util.Collections.sort(vVar.f432693e, comparator);
        }
    }
}
