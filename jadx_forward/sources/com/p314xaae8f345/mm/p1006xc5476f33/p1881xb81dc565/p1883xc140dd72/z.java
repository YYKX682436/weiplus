package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes14.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.a0 f231398d;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.a0 a0Var) {
        this.f231398d = a0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = true;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE.f231170n != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Multitalk.ILinkMemberMgr", "hy: not in room, ignore speaker change");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(5);
        java.util.Iterator it = this.f231398d.f231038d.f231050a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.w wVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.w) it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE.getClass();
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.g0.f231118c.m119991x7be9e6cb(wVar.f231373a) > 0) {
                arrayList.add(wVar);
            }
        }
        java.util.Collections.sort(arrayList, new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.y(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.c0 c0Var = this.f231398d.f231038d;
        if (c0Var.f231059j != null) {
            if (arrayList.size() == c0Var.f231059j.size()) {
                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                    if (((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.w) arrayList.get(i17)).f231373a == ((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.w) c0Var.f231059j.get(i17)).f231373a) {
                    }
                }
            }
            z17 = false;
            break;
        }
        if (!z17) {
            synchronized (this.f231398d.f231038d.f231060k) {
                java.util.Iterator it6 = this.f231398d.f231038d.f231060k.iterator();
                while (it6.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.j2 j2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.j2) ((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.b0) it6.next());
                    j2Var.getClass();
                    j2Var.f231196a.J(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i2(j2Var, arrayList));
                }
            }
        }
        this.f231398d.f231038d.f231059j = arrayList;
    }
}
