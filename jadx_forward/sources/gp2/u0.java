package gp2;

/* loaded from: classes10.dex */
public final class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gp2.v0 f355857d;

    public u0(gp2.v0 v0Var) {
        this.f355857d = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFinish createdViews ");
        gp2.v0 v0Var = this.f355857d;
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = v0Var.f355862e;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(concurrentLinkedQueue, 10));
        java.util.Iterator it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((java.lang.ref.WeakReference) it.next()).hashCode()));
        }
        sb6.append(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLivePlayerViewRecycler", sb6.toString());
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue2 = v0Var.f355862e;
        java.util.Iterator it6 = concurrentLinkedQueue2.iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 c14522x8ffd8962 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962) ((java.lang.ref.WeakReference) it6.next()).get();
            if (c14522x8ffd8962 != null) {
                c14522x8ffd8962.mo58404x360802();
                c14522x8ffd8962.mo58389x41012807();
                c14522x8ffd8962.r("completelyQuit");
                mn0.b0 b0Var = c14522x8ffd8962.player;
                if (b0Var != null) {
                    ((mn0.y) b0Var).w();
                }
            }
        }
        concurrentLinkedQueue2.clear();
        v0Var.f355861d.clear();
        v0Var.f355863f.mo50302x6b17ad39(null);
    }
}
