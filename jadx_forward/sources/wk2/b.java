package wk2;

/* loaded from: classes3.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wk2.c f528467d;

    public b(wk2.c cVar) {
        this.f528467d = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFinish createdViews ");
        wk2.c cVar = this.f528467d;
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = cVar.f528469b;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(concurrentLinkedQueue, 10));
        java.util.Iterator it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((java.lang.ref.WeakReference) it.next()).hashCode()));
        }
        sb6.append(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePlayerViewRecycler", sb6.toString());
        java.util.Iterator it6 = cVar.f528469b.iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.p1523x6580a04.p1524xed08e3c8.C14263xfb9026d4 c14263xfb9026d4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.p1523x6580a04.p1524xed08e3c8.C14263xfb9026d4) ((java.lang.ref.WeakReference) it6.next()).get();
            if (c14263xfb9026d4 != null) {
                c14263xfb9026d4.d();
            }
        }
        cVar.f528469b.clear();
        cVar.f528468a.clear();
        cVar.f528470c.mo50302x6b17ad39(null);
    }
}
