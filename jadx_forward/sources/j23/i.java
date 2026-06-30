package j23;

/* loaded from: classes12.dex */
public class i extends com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a {

    /* renamed from: p, reason: collision with root package name */
    public boolean f378806p;

    public i(android.content.Context context, t13.j jVar, int i17) {
        super(context, jVar, i17);
        this.f378806p = false;
    }

    @Override // t13.k
    /* renamed from: getType */
    public int mo9548xfb85f7b0() {
        return 32;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public p13.e l(int i17, long j17, t13.i iVar) {
        if (i17 >= iVar.f496103f.size() || i17 < 0) {
            return null;
        }
        p13.y yVar = (p13.y) iVar.f496103f.get(i17);
        p13.e eVar = new p13.e();
        eVar.f432612g = java.lang.String.valueOf(yVar.hashCode());
        int i18 = yVar.f432717b;
        if (i18 != 131072 && i18 != 131081) {
            return null;
        }
        eVar.f432608c = 3;
        return eVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public u13.g o(int i17, t13.i iVar) {
        int i18;
        u13.g gVar = null;
        if (iVar.f496099b) {
            i18 = (i17 - iVar.f496098a) - 1;
            if (i18 < iVar.f496103f.size() && i18 >= 0) {
                p13.y yVar = (p13.y) iVar.f496103f.get(i18);
                u13.g p17 = p(yVar.f432717b, i17, yVar, iVar);
                if (p17 != null) {
                    p17.n(yVar.f432717b, yVar.f432718c);
                }
                gVar = p17;
            }
        } else {
            i18 = 0;
        }
        if (gVar != null) {
            gVar.f505300j = i18 + 1;
            if (i18 == iVar.f496103f.size() - 1) {
                gVar.f505294d = false;
            }
        }
        return gVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public u13.g p(int i17, int i18, p13.y yVar, t13.i iVar) {
        int i19 = yVar.f432717b;
        if (i19 != 131072 && i19 != 131081) {
            return null;
        }
        e23.u1 u1Var = new e23.u1(i18);
        u1Var.f328372q = yVar;
        u1Var.f505295e = iVar.f496104g;
        u1Var.n(yVar.f432717b, yVar.f432718c);
        return u1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public p13.c q(com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var, java.util.HashSet hashSet) {
        p13.u uVar = new p13.u();
        if (this.f378806p) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSContactUIUnit", "fts: search by pinyin: %s", this.f219540i);
            uVar.f432673b = 65;
        } else {
            uVar.f432673b = 64;
        }
        uVar.f432674c = this.f219540i;
        uVar.f432683l = r13.b.f450135d;
        uVar.f432678g = new int[]{131072, 131081};
        uVar.f432680i = 3;
        uVar.f432681j = hashSet;
        uVar.f432684m = this;
        uVar.f432685n = n3Var;
        this.f219543o = hashSet;
        return ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public void s(p13.v vVar, java.util.HashSet hashSet) {
        java.util.Set Ui = ((vh0.f3) ((vh0.n1) i95.n0.c(vh0.n1.class))).Ui();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (p13.y yVar : vVar.f432693e) {
            java.lang.String str = yVar.f432720e;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            if (!((java.util.HashSet) Ui).contains(str)) {
                arrayList.add(yVar);
            }
        }
        t13.i iVar = new t13.i();
        iVar.f496102e = -4;
        iVar.f496103f = arrayList;
        iVar.f496099b = k(arrayList);
        iVar.f496104g = vVar.f432692d;
        if (iVar.f496103f.size() > 3) {
            iVar.f496101d = true;
            iVar.f496103f = new java.util.ArrayList(iVar.f496103f.subList(0, 3));
        }
        if (k(arrayList)) {
            this.f219542n.add(iVar);
        }
    }
}
