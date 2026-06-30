package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class q implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13853x7a09fceb f189793d;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13853x7a09fceb c13853x7a09fceb) {
        this.f189793d = c13853x7a09fceb;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa c13920xa5f564aa = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa) ((jz5.l) obj).f384366d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13853x7a09fceb c13853x7a09fceb = this.f189793d;
        synchronized (c13853x7a09fceb.f188929e) {
            java.util.ArrayList m56387xe6796cde = c13853x7a09fceb.m56387xe6796cde();
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m56387xe6796cde, 10));
            java.util.Iterator it = m56387xe6796cde.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Long.valueOf(((so2.j5) it.next()).mo2128x1ed62e84()));
            }
            java.util.Set X0 = kz5.n0.X0(arrayList);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator<T> it6 = c13920xa5f564aa.iterator();
            while (it6.hasNext()) {
                java.lang.Object next = it6.next();
                if (!X0.contains(java.lang.Long.valueOf(((so2.j5) next).mo2128x1ed62e84()))) {
                    arrayList2.add(next);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c13853x7a09fceb.getF204960d(), "FinderGlobalVMStore getViewModel mergeExternalData:" + c13853x7a09fceb.f188928d);
            ey2.u uVar = (ey2.u) ey2.l0.f338955a.a(c13853x7a09fceb.f188928d, ey2.u.class, null);
            if (uVar != null) {
                if (uVar.f339064m) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.s(0, 0, "", false, 8, null);
                    sVar.m56420x2a5f836b(null);
                    sVar.m56419xdac5ee4d(false);
                    c13853x7a09fceb.mo55587xb461ee3d(sVar);
                } else if (!arrayList2.isEmpty()) {
                    int size = c13853x7a09fceb.m56387xe6796cde().size();
                    c13853x7a09fceb.m56387xe6796cde().addAll(arrayList2);
                    int size2 = arrayList2.size();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.s sVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.s(0, 0, "", false, 8, null);
                    sVar2.m56420x2a5f836b(c13853x7a09fceb.m56387xe6796cde().subList(size, size2 + size));
                    sVar2.m56419xdac5ee4d(true);
                    c13853x7a09fceb.mo55587xb461ee3d(sVar2);
                }
            }
        }
    }
}
