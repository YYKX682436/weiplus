package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class t3 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13870xa7616360 f189896d;

    public t3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13870xa7616360 c13870xa7616360) {
        this.f189896d = c13870xa7616360;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.util.List list;
        java.lang.Iterable iterable;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa c13920xa5f564aa = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa) ((jz5.l) obj).f384366d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13870xa7616360 c13870xa7616360 = this.f189896d;
        synchronized (c13870xa7616360.f189024p) {
            yz5.a aVar = c13870xa7616360.f193260e;
            if (aVar == null || (list = (java.util.List) aVar.mo152xb9724478()) == null) {
                list = kz5.p0.f395529d;
            }
            km2.m mVar = (km2.m) kz5.n0.k0(list);
            if (mVar == null) {
                return;
            }
            java.util.Iterator<T> it = c13920xa5f564aa.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                } else if (((so2.j5) it.next()).mo2128x1ed62e84() == mVar.f390662d.f150082s) {
                    break;
                } else {
                    i17++;
                }
            }
            if (i17 < 0) {
                return;
            }
            int i18 = i17 + 1;
            java.lang.Iterable subList = c13920xa5f564aa.size() <= i18 ? kz5.p0.f395529d : c13920xa5f564aa.subList(i18, c13920xa5f564aa.size());
            yz5.a aVar2 = c13870xa7616360.f193260e;
            if (aVar2 == null || (iterable = (java.util.List) aVar2.mo152xb9724478()) == null) {
                iterable = kz5.p0.f395529d;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(iterable, 10));
            java.util.Iterator it6 = iterable.iterator();
            while (it6.hasNext()) {
                arrayList.add(java.lang.Long.valueOf(((km2.m) it6.next()).f390662d.f150082s));
            }
            java.util.Set X0 = kz5.n0.X0(arrayList);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : subList) {
                if (!X0.contains(java.lang.Long.valueOf(((so2.j5) obj2).mo2128x1ed62e84()))) {
                    arrayList2.add(obj2);
                }
            }
            java.util.List f17 = c13870xa7616360.f(arrayList2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c13870xa7616360.getF204960d(), "FinderGlobalVMStore getViewModel mergeExternalData:" + c13870xa7616360.f189023o);
            ey2.u e17 = c13870xa7616360.e();
            if (e17 != null) {
                if (!((java.util.ArrayList) f17).isEmpty()) {
                    boolean z17 = !e17.f339064m;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.w3 w3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.w3(0, 0, "", false, 8, null);
                    w3Var.m56420x2a5f836b(new java.util.ArrayList(f17));
                    w3Var.m56419xdac5ee4d(z17);
                    c13870xa7616360.mo55587xb461ee3d(w3Var);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.w3 w3Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.w3(0, 0, "", false, 8, null);
                    w3Var2.m56420x2a5f836b(null);
                    w3Var2.m56419xdac5ee4d(false);
                    c13870xa7616360.mo55587xb461ee3d(w3Var2);
                }
            }
        }
    }
}
