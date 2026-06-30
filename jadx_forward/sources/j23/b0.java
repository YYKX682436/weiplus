package j23;

/* loaded from: classes12.dex */
public class b0 extends j23.q {

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f378803q;

    @Override // j23.q, t13.b, t13.k
    public boolean a(android.view.View view, u13.g gVar, boolean z17) {
        super.a(view, gVar, z17);
        if (gVar instanceof e23.i) {
            int i17 = 0;
            while (true) {
                java.util.List list = this.f219542n;
                if (i17 >= list.size()) {
                    break;
                }
                t13.i iVar = (t13.i) list.get(i17);
                if (iVar.f496100c == gVar.f505292b) {
                    iVar.f496105h = !iVar.f496105h;
                    break;
                }
                i17++;
            }
        }
        return true;
    }

    @Override // j23.q, t13.k
    /* renamed from: getType */
    public int mo9548xfb85f7b0() {
        return 176;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a, t13.k
    public int j(int i17) {
        java.util.List list = this.f219542n;
        int size = list.size();
        for (int i18 = 0; i18 < size; i18++) {
            t13.i iVar = (t13.i) list.get(i18);
            iVar.f496098a = i17;
            if (iVar.f496099b) {
                i17++;
            }
            if (iVar.f496103f.size() > 3) {
                i17 = iVar.f496105h ? i17 + 3 : i17 + iVar.f496103f.size();
                iVar.f496100c = i17;
                if (iVar.f496101d) {
                    i17++;
                }
            } else {
                i17 += iVar.f496103f.size();
                iVar.f496100c = i17;
            }
        }
        return i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public e23.g0 m(int i17, t13.i iVar) {
        e23.n1 n1Var = new e23.n1(i17);
        p13.y yVar = iVar.f496106i;
        n1Var.A = yVar;
        n1Var.f505295e = yVar.f432736u;
        return n1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public e23.s0 n(int i17, t13.i iVar) {
        e23.i iVar2 = new e23.i(i17);
        iVar2.f328401s = com.p314xaae8f345.mm.R.C30867xcad56011.ffy;
        iVar2.f328402t = iVar.f496105h;
        return iVar2;
    }

    @Override // j23.q, com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public u13.g o(int i17, t13.i iVar) {
        int i18 = iVar.f496099b ? (i17 - iVar.f496098a) - 1 : i17 - iVar.f496098a;
        if (i18 < 0 || i18 >= iVar.f496103f.size()) {
            return null;
        }
        p13.y yVar = (p13.y) iVar.f496103f.get(i18);
        if (yVar.f432720e.equals("no_result\u200b")) {
            return new e23.j0(i17);
        }
        e23.p1 p1Var = new e23.p1(i17);
        p1Var.f328458q = yVar;
        p1Var.B = iVar.f496106i;
        p1Var.f505295e = yVar.f432736u;
        p1Var.f505297g = -14;
        p1Var.C = 2;
        p1Var.n(yVar.f432717b, yVar.f432718c);
        return p1Var;
    }

    @Override // j23.q, com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public p13.c q(com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var, java.util.HashSet hashSet) {
        this.f378812p = false;
        p13.u uVar = new p13.u();
        uVar.f432674c = this.f219540i;
        uVar.f432683l = r13.e.f450138d;
        uVar.f432676e = this.f378803q;
        uVar.f432684m = this;
        uVar.f432685n = n3Var;
        uVar.f432673b = 10;
        return ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(3, uVar);
    }

    @Override // j23.q, com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public void s(p13.v vVar, java.util.HashSet hashSet) {
        if (vVar.f432691c != 0) {
            return;
        }
        int size = vVar.f432693e.size();
        java.util.List list = this.f219542n;
        if (size <= 0) {
            t13.i iVar = new t13.i();
            iVar.f496102e = -2;
            iVar.f496104g = vVar.f432692d;
            iVar.f496099b = false;
            p13.y yVar = new p13.y();
            yVar.f432720e = "no_result\u200b";
            java.util.ArrayList arrayList = new java.util.ArrayList();
            iVar.f496103f = arrayList;
            arrayList.add(yVar);
            list.add(iVar);
            return;
        }
        for (int i17 = 0; i17 < vVar.f432693e.size(); i17++) {
            t13.i iVar2 = new t13.i();
            iVar2.f496099b = true;
            p13.y yVar2 = (p13.y) vVar.f432693e.get(i17);
            iVar2.f496106i = yVar2;
            iVar2.f496104g = vVar.f432692d;
            java.util.List list2 = (java.util.List) yVar2.f432730o;
            iVar2.f496103f = list2;
            if (list2.size() <= 3 || i17 == vVar.f432693e.size() - 1) {
                iVar2.f496105h = false;
                iVar2.f496101d = false;
            } else {
                iVar2.f496105h = true;
                iVar2.f496101d = true;
            }
            list.add(iVar2);
        }
    }

    @Override // j23.q
    public int t() {
        return 2;
    }
}
