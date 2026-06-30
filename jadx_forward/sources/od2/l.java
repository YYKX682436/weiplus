package od2;

/* loaded from: classes12.dex */
public class l extends com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a {

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f426157p;

    public l(android.content.Context context, t13.j jVar, int i17) {
        super(context, jVar, i17);
        this.f426157p = new java.util.ArrayList();
    }

    @Override // t13.k
    /* renamed from: getType */
    public int mo9548xfb85f7b0() {
        return 8224;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public u13.g o(int i17, t13.i iVar) {
        od2.o oVar;
        int i18 = (i17 - iVar.f496098a) - 1;
        if (i18 >= iVar.f496103f.size() || i18 < 0) {
            oVar = null;
        } else {
            p13.y yVar = (p13.y) iVar.f496103f.get(i18);
            oVar = new od2.o(i17);
            oVar.f426167s = yVar;
            oVar.f505295e = iVar.f496104g;
            oVar.n(yVar.f432717b, yVar.f432718c);
        }
        if (oVar != null) {
            oVar.f505300j = i18 + 1;
        }
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
        return ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(13, uVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public void s(p13.v vVar, java.util.HashSet hashSet) {
        java.util.List list = vVar.f432693e;
        java.util.ArrayList arrayList = this.f426157p;
        arrayList.clear();
        if (k(vVar.f432693e)) {
            t13.i iVar = new t13.i();
            iVar.f496102e = -23;
            iVar.f496104g = vVar.f432692d;
            iVar.f496103f = vVar.f432693e;
            this.f219542n.add(iVar);
            java.util.Iterator it = iVar.f496103f.iterator();
            while (it.hasNext()) {
                java.lang.String str = ((p13.y) it.next()).f432720e;
                if (str != null) {
                    arrayList.add(str);
                }
            }
        }
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).Vi(arrayList, ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_search_finder_follow_expired_time_threshold, 300000L), null);
    }
}
