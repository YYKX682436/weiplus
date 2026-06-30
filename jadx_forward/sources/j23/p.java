package j23;

/* loaded from: classes12.dex */
public class p extends j23.q {
    @Override // j23.q, t13.k
    /* renamed from: getType */
    public int mo9548xfb85f7b0() {
        return 4176;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j23.q, com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public u13.g o(int i17, t13.i iVar) {
        u13.g gVar;
        e23.m0 m0Var;
        int i18 = i17 - iVar.f496098a;
        if (iVar.f496099b) {
            i18--;
        }
        if (i18 >= iVar.f496103f.size() || i18 < 0) {
            gVar = null;
        } else {
            p13.y yVar = (p13.y) iVar.f496103f.get(i18);
            if (yVar.f432720e.equals("create_talker_message\u200b")) {
                gVar = new e23.a0(i17);
                gVar.f505294d = false;
                this.f378812p = true;
            } else if (yVar.f432720e.equals("no_result\u200b")) {
                gVar = new e23.j0(i17);
            } else {
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.o4(yVar.f432720e) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.C3(yVar.f432720e)) {
                    e23.m0 m0Var2 = new e23.m0(i17);
                    m0Var2.f328427q = yVar;
                    m0Var2.n(yVar.f432717b, yVar.f432718c);
                    m0Var = m0Var2;
                } else {
                    e23.p0 p0Var = new e23.p0(i17);
                    p0Var.f328458q = yVar;
                    p0Var.n(yVar.f432717b, yVar.f432718c);
                    m0Var = p0Var;
                }
                gVar = m0Var;
            }
        }
        if (gVar != null) {
            gVar.f505300j = i18 + 1;
            gVar.f505295e = iVar.f496104g;
        }
        return gVar;
    }

    @Override // j23.q, com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public p13.c q(com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var, java.util.HashSet hashSet) {
        this.f378812p = false;
        p13.u uVar = new p13.u();
        uVar.f432674c = this.f219540i;
        uVar.f432681j = hashSet;
        uVar.f432684m = this;
        uVar.f432685n = n3Var;
        return ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(3, uVar);
    }

    @Override // j23.q, com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public void s(p13.v vVar, java.util.HashSet hashSet) {
        java.util.List list = vVar.f432693e;
        if (k(list)) {
            int size = list.size();
            java.util.List list2 = this.f219542n;
            if (size > 0) {
                p13.y yVar = (p13.y) list.get(0);
                if (yVar.f432720e.equals("create_talker_message\u200b")) {
                    t13.i iVar = new t13.i();
                    iVar.f496099b = false;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    iVar.f496103f = arrayList;
                    arrayList.add(yVar);
                    iVar.f496104g = vVar.f432692d;
                    iVar.f496102e = -2;
                    list2.add(iVar);
                    list.remove(0);
                }
            }
            t13.i iVar2 = new t13.i();
            iVar2.f496102e = -2;
            iVar2.f496104g = vVar.f432692d;
            if (list.size() == 0) {
                iVar2.f496099b = false;
                p13.y yVar2 = new p13.y();
                yVar2.f432720e = "no_result\u200b";
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                iVar2.f496103f = arrayList2;
                arrayList2.add(yVar2);
            } else {
                iVar2.f496103f = list;
            }
            list2.add(iVar2);
        }
    }
}
