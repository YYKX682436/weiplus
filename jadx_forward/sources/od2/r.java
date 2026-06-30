package od2;

/* loaded from: classes12.dex */
public class r extends com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a {

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f426174p;

    /* renamed from: q, reason: collision with root package name */
    public int f426175q;

    public r(android.content.Context context, t13.j jVar, int i17) {
        super(context, jVar, i17);
        this.f426174p = new java.util.ArrayList();
        this.f426175q = 0;
    }

    @Override // t13.k
    /* renamed from: getType */
    public int mo9548xfb85f7b0() {
        return 133;
    }

    @Override // t13.b, t13.k
    public int i() {
        return this.f426175q;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public p13.e l(int i17, long j17, t13.i iVar) {
        if (i17 >= iVar.f496103f.size() || i17 < 0) {
            return null;
        }
        p13.y yVar = (p13.y) iVar.f496103f.get(i17);
        p13.e eVar = new p13.e();
        eVar.f432612g = java.lang.String.valueOf(yVar.hashCode());
        eVar.f432608c = 31;
        eVar.f432615j = yVar.f432720e;
        return eVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public u13.g o(int i17, t13.i iVar) {
        int i18 = (i17 - iVar.f496098a) - 1;
        u13.g p17 = (i18 >= iVar.f496103f.size() || i18 < 0) ? null : p(589824, i17, (p13.y) iVar.f496103f.get(i18), iVar);
        if (p17 != null) {
            p17.f505300j = i18 + 1;
            if (i18 == iVar.f496103f.size() - 1) {
                p17.f505294d = false;
            }
        }
        return p17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public u13.g p(int i17, int i18, p13.y yVar, t13.i iVar) {
        od2.o oVar = new od2.o(i18);
        oVar.f426167s = yVar;
        oVar.f505295e = iVar.f496104g;
        if (yVar.f432737v) {
            oVar.f426171w = this.f496092e.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ito);
        }
        oVar.n(yVar.f432717b, yVar.f432718c);
        return oVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public p13.c q(com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var, java.util.HashSet hashSet) {
        p13.u uVar = new p13.u();
        uVar.f432674c = this.f219540i;
        uVar.f432683l = r13.d.f450137d;
        uVar.f432684m = this;
        uVar.f432685n = n3Var;
        uVar.f432681j = hashSet;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFinderFollowerUIUnit", "doSearch, request.query = " + uVar.f432674c);
        return ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(13, uVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public void s(p13.v vVar, java.util.HashSet hashSet) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFinderFollowerUIUnit", "setResult, ftsResult.");
        java.util.ArrayList arrayList = this.f426174p;
        arrayList.clear();
        if (k(vVar.f432693e)) {
            this.f426175q = vVar.f432693e.size();
            t13.i iVar = new t13.i();
            iVar.f496102e = -23;
            java.util.List list = vVar.f432693e;
            iVar.f496103f = list;
            iVar.f496104g = vVar.f432692d;
            if (list.size() > 1) {
                iVar.f496101d = true;
                iVar.f496103f = new java.util.ArrayList(iVar.f496103f.subList(0, 1));
            }
            this.f219542n.add(iVar);
            java.util.Iterator it = iVar.f496103f.iterator();
            while (it.hasNext()) {
                arrayList.add(((p13.y) it.next()).f432720e);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFinderFollowerUIUnit", "setResult, userNames = " + arrayList);
        }
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).Vi(arrayList, ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_search_finder_follow_expired_time_threshold, 300000L), null);
    }
}
