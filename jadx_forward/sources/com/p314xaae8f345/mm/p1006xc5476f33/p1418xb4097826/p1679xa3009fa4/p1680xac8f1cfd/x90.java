package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class x90 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34 f217960d;

    public x90(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34 c15482x9b531b34) {
        this.f217960d = c15482x9b531b34;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFinish createdVideoViews ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34 c15482x9b531b34 = this.f217960d;
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = c15482x9b531b34.f215210m;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(concurrentLinkedQueue, 10));
        java.util.Iterator it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((java.lang.ref.WeakReference) it.next()).hashCode()));
        }
        sb6.append(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoRecycler", sb6.toString());
        c15482x9b531b34.f215210m.size();
        c15482x9b531b34.getClass();
        java.util.List S0 = kz5.n0.S0(c15482x9b531b34.f215210m);
        c15482x9b531b34.f215210m.clear();
        java.util.Iterator it6 = S0.iterator();
        while (it6.hasNext()) {
            cw2.da daVar = (cw2.da) ((java.lang.ref.WeakReference) it6.next()).get();
            if (daVar != null) {
                daVar.d();
                daVar.b();
            }
        }
        c15482x9b531b34.f215209i.clear();
    }
}
