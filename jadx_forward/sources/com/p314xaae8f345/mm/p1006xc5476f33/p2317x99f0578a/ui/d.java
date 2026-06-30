package com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui;

/* loaded from: classes5.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.e f256949d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f256950e;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.e eVar, int i17) {
        this.f256949d = eVar;
        this.f256950e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/transvoice/ui/LanguageChoiceDialog$updateSelectedType$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.e eVar = this.f256949d;
        eVar.f256955i = this.f256950e;
        eVar.D();
        com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.e eVar2 = this.f256949d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.a aVar = eVar2.f256960q;
        if (aVar != null) {
            int i17 = eVar2.f256955i;
            com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.b0 b0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.b0) aVar;
            com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.e eVar3 = b0Var.f256946a.f257011J;
            if (eVar3 != null) {
                eVar3.dismiss();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0 v0Var = b0Var.f256946a;
            v0Var.N.edit().putInt(v0Var.M, i17).apply();
            com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0 v0Var2 = b0Var.f256946a;
            if (i17 != v0Var2.f257028x) {
                if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(v0Var2.getContext())) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0 v0Var3 = b0Var.f256946a;
                    v0Var3.f257014h = false;
                    v0Var3.P = false;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.p2318x633fb29.e eVar4 = v0Var3.f257012f;
                    eVar4.f256923n = v0Var3.f257013g;
                    eVar4.f256926q = 0;
                    eVar4.f256927r = 0L;
                    eVar4.f256928s = 0;
                    eVar4.f256931v = 0;
                    eVar4.f256932w = 0;
                    eVar4.f256933x = 0;
                    v0Var3.L();
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = v0Var3.L;
                    if (n3Var != null) {
                        n3Var.mo50307xb9e94560(5000, 5000L);
                    }
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = v0Var3.H;
                    if (b4Var != null) {
                        b4Var.c(500L, 500L);
                    }
                    v0Var3.f257028x = i17;
                    long nanoTime = java.lang.System.nanoTime() & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
                    if (nanoTime < 0) {
                        nanoTime = java.lang.Math.abs(nanoTime);
                    }
                    z21.a0 a0Var = new z21.a0(java.lang.String.valueOf(nanoTime));
                    z21.a0 a0Var2 = v0Var3.f257030y;
                    if (a0Var2 != null) {
                        ((java.util.concurrent.locks.ReentrantReadWriteLock) a0Var2.f551086d).readLock().lock();
                        for (z21.z zVar : a0Var2.f551085c.values()) {
                            z21.z zVar2 = new z21.z(a0Var2, a0Var.f551083a);
                            zVar2.f551238d = zVar.f551238d;
                            a0Var.f551085c.put(zVar2.f551235a, zVar2);
                        }
                        ((java.util.concurrent.locks.ReentrantReadWriteLock) a0Var2.f551086d).readLock().unlock();
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.p2318x633fb29.c cVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.p2318x633fb29.c(a0Var, i17, new com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.u0(v0Var3));
                    v0Var3.f257027w = cVar;
                    cVar.d();
                } else {
                    android.content.Context context = b0Var.f256946a.getContext();
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
                    aVar2.f293262s = b0Var.f256946a.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572033wu);
                    aVar2.f293265v = b0Var.f256946a.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h7x);
                    aVar2.W = b0Var.f256946a.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c);
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
                    j0Var.e(aVar2);
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar2.f293256m;
                    if (d0Var != null) {
                        d0Var.a(j0Var.f293370r);
                    }
                    j0Var.show();
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/transvoice/ui/LanguageChoiceDialog$updateSelectedType$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
