package ru2;

/* loaded from: classes2.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final ru2.f f481271d = new ru2.f();

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34 c15482x9b531b34 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nb0) pf5.u.f435469a.e(zy2.b6.class).c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nb0.class));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("releaseUnFocusView before createdVideoViews:");
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = c15482x9b531b34.f215210m;
        sb6.append(concurrentLinkedQueue.size());
        sb6.append(" recycledVideoViews:");
        java.util.HashSet hashSet = c15482x9b531b34.f215209i;
        sb6.append(hashSet.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoRecycler", sb6.toString());
        java.util.Iterator it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            cw2.da daVar = (cw2.da) ((java.lang.ref.WeakReference) it.next()).get();
            if (daVar != null) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(daVar, c15482x9b531b34.f215218u)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoRecycler", "releaseUnFocusView return for view:" + daVar + " mediaid:" + daVar.mo56696x9040359a());
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoRecycler", "releaseUnFocusView view:" + daVar + " mediaid:" + daVar.mo56696x9040359a());
                    daVar.d();
                    daVar.b();
                    c15482x9b531b34.e7(daVar.mo56698x4ee17f0a());
                    it.remove();
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoRecycler", "releaseUnFocusView after createdVideoViews:" + concurrentLinkedQueue.size() + " recycledVideoViews:" + hashSet.size());
        ru2.j.f481276f = null;
    }
}
