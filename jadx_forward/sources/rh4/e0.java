package rh4;

/* loaded from: classes8.dex */
public class e0 implements cl1.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.p2259x756f7ee5.p2261x6bc5093.C18566x5b11ed80 f477248a;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.p2259x756f7ee5.p2261x6bc5093.C18566x5b11ed80 c18566x5b11ed80) {
        this.f477248a = c18566x5b11ed80;
    }

    @Override // cl1.k0
    public void a(float f17, float f18) {
        this.f477248a.p1(f17, f18);
    }

    @Override // cl1.k0
    public void b(java.lang.Object obj, int i17) {
        if (obj instanceof cl1.n0) {
            this.f477248a.s1(i17);
        }
    }

    @Override // cl1.k0
    public void c(int i17, int i18, java.lang.Object obj) {
        rh4.j0 j0Var;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_weapp_reorder, 1) != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarSectionWeAppRecyclerView", "jacob reorder forbidden");
            return;
        }
        if (i17 == i18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarSectionWeAppRecyclerView", "jacob reorder false start = end");
            return;
        }
        boolean z17 = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarSectionWeAppRecyclerView", "jacob reorderCollection %d", 0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("jacob before reorder showlist ");
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.p2259x756f7ee5.p2261x6bc5093.C18566x5b11ed80 c18566x5b11ed80 = this.f477248a;
        sb6.append(g(c18566x5b11ed80.f254244f2));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarSectionWeAppRecyclerView", sb6.toString());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarSectionWeAppRecyclerView", "jacob before reorder datalist " + g(c18566x5b11ed80.f254243e2));
        if (c18566x5b11ed80 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.p2259x756f7ee5.p2261x6bc5093.C18565x166dd6f4) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int size = c18566x5b11ed80.f254243e2.size();
            if (size >= c18566x5b11ed80.mo71638x92a0b781()) {
                size = c18566x5b11ed80.mo71638x92a0b781();
            }
            java.util.List subList = c18566x5b11ed80.f254243e2.subList(0, size);
            java.util.ArrayList arrayList2 = (java.util.ArrayList) c18566x5b11ed80.f254244f2;
            if (arrayList2.size() >= c18566x5b11ed80.mo71638x92a0b781()) {
                c18566x5b11ed80.f254243e2.removeAll(subList);
                c18566x5b11ed80.f254243e2.addAll(0, arrayList2);
                java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(c18566x5b11ed80.f254243e2);
                c18566x5b11ed80.f254243e2.clear();
                java.util.Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    c18566x5b11ed80.f254243e2.add((cl1.n0) it.next());
                }
            } else {
                c18566x5b11ed80.f254243e2 = arrayList2;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarSectionWeAppRecyclerView", "jacob after reorder showlist " + g(arrayList2));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarSectionWeAppRecyclerView", "jacob after reorder datalist " + g(c18566x5b11ed80.f254243e2));
            for (int i19 = 0; i19 < c18566x5b11ed80.f254243e2.size(); i19++) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e4 = ((cl1.n0) c18566x5b11ed80.f254243e2.get(i19)).f124421a;
                if (c11714x918fd2e4 != null) {
                    arrayList.add(c11714x918fd2e4);
                }
            }
            ((et.e) ((ft.u3) i95.n0.c(ft.u3.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.h a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.v.f173600a.a();
            if (a17 != null && !(z17 = a17.Lg(arrayList, 0))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TaskBarSectionWeAppRecyclerView", "jacob reorederCollection failed, needProcessResult: %b");
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarSectionWeAppRecyclerView", "jacob reorder false");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarSectionWeAppRecyclerView", "jacob collection reorderCollection result: %b, startPos: %d, endPos: %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        cl1.n0 n0Var = (cl1.n0) obj;
        if (i17 != i18 && (j0Var = c18566x5b11ed80.f254248j2) != null && z17) {
            j0Var.b(n0Var.f124421a, i17, i18);
        }
        c18566x5b11ed80.m1();
    }

    @Override // cl1.k0
    public void d(java.lang.Object obj, int i17) {
        if (obj instanceof cl1.n0) {
            this.f477248a.s1(i17);
        }
    }

    @Override // cl1.k0
    public void e(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarSectionWeAppRecyclerView", "onAddCollection");
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.p2259x756f7ee5.p2261x6bc5093.C18566x5b11ed80 c18566x5b11ed80 = this.f477248a;
        if (c18566x5b11ed80.f254248j2.o()) {
            cl1.n0 n0Var = (cl1.n0) obj;
            boolean g17 = c18566x5b11ed80.g1(n0Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarSectionWeAppRecyclerView", "addStarImpl %d， add:%b", 0, java.lang.Boolean.valueOf(g17));
            if (g17) {
                c18566x5b11ed80.f254248j2.d(0, n0Var);
            }
        }
    }

    @Override // cl1.k0
    public void f(int i17, boolean z17, boolean z18) {
        this.f477248a.o1(i17, z17, z18);
    }

    public final java.lang.String g(java.util.List list) {
        java.util.Iterator it = list.iterator();
        java.lang.String str = "";
        while (it.hasNext()) {
            str = str + ((cl1.n0) it.next()).f124421a.f157898h + " ";
        }
        return str;
    }
}
