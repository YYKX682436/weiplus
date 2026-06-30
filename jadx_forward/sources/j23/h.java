package j23;

/* loaded from: classes12.dex */
public class h extends com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a {

    /* renamed from: p, reason: collision with root package name */
    public boolean f378805p;

    public h(android.content.Context context, t13.j jVar, int i17) {
        super(context, jVar, i17);
        this.f378805p = false;
    }

    @Override // t13.k
    /* renamed from: getType */
    public int mo9548xfb85f7b0() {
        return 4112;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public u13.g o(int i17, t13.i iVar) {
        e23.u1 u1Var;
        int i18 = (i17 - iVar.f496098a) - 1;
        if (i18 >= iVar.f496103f.size() || i18 < 0) {
            u1Var = null;
        } else {
            p13.y yVar = (p13.y) iVar.f496103f.get(i18);
            u1Var = new e23.u1(i17);
            u1Var.f328372q = yVar;
            u1Var.f505295e = iVar.f496104g;
            u1Var.n(yVar.f432717b, yVar.f432718c);
        }
        if (u1Var != null) {
            u1Var.f505300j = i18 + 1;
        }
        return u1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public p13.c q(com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var, java.util.HashSet hashSet) {
        p13.u uVar = new p13.u();
        java.lang.String str = this.f219540i;
        uVar.f432674c = str;
        uVar.f432678g = new int[]{131072, 131081};
        uVar.f432683l = r13.b.f450135d;
        uVar.f432681j = hashSet;
        uVar.f432684m = this;
        uVar.f432685n = n3Var;
        if (this.f378805p) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSContactDetailUIUnit", "fts: search by pinyin: %s", str);
            uVar.f432673b = 18;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSContactDetailUIUnit", "fts: search: %s", str);
            uVar.f432673b = 16;
        }
        return ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public void s(p13.v vVar, java.util.HashSet hashSet) {
        if (k(vVar.f432693e)) {
            t13.i iVar = new t13.i();
            iVar.f496102e = -4;
            iVar.f496103f = vVar.f432693e;
            iVar.f496104g = vVar.f432692d;
            iVar.f496101d = false;
            this.f219542n.add(iVar);
        }
    }
}
