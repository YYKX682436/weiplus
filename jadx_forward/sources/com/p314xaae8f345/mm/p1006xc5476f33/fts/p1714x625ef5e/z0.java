package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class z0 extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l f219286q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar, p13.u uVar) {
        super(uVar);
        this.f219286q = lVar;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "SearchTopContactInnerRankTaskByPinyin";
    }

    @Override // p13.c
    public int k() {
        return 50;
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        p13.u uVar = this.f432668n;
        p13.u a17 = uVar.a();
        a17.f432684m = null;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar = this.f219286q;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.y0 y0Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.y0(lVar, a17);
        y0Var.h();
        p13.v vVar2 = y0Var.f432669o;
        p13.u a18 = uVar.a();
        a18.f432674c = o13.n.j(uVar.f432674c);
        a18.f432684m = null;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.y0 y0Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.y0(lVar, a18);
        y0Var2.h();
        p13.v vVar3 = y0Var2.f432669o;
        vVar.f432692d = vVar2.f432692d;
        java.util.List list = vVar2.f432693e;
        java.util.List list2 = vVar3.f432693e;
        if (list == null || list.isEmpty()) {
            list = list2;
        } else if (list2 != null && !list2.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size() + list2.size());
            arrayList.addAll(list);
            java.util.HashSet hashSet = new java.util.HashSet();
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                p13.y yVar = (p13.y) arrayList.get(i17);
                if (yVar != null) {
                    hashSet.add(yVar.f432720e);
                }
            }
            for (int i18 = 0; i18 < list2.size(); i18++) {
                p13.y yVar2 = (p13.y) list2.get(i18);
                if (!hashSet.contains(yVar2.f432720e)) {
                    arrayList.add(yVar2);
                }
            }
            list = arrayList;
        }
        vVar.f432693e = list;
    }
}
