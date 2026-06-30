package ru2;

/* loaded from: classes2.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final ru2.d f481269d = new ru2.d();

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34 c15482x9b531b34 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nb0) pf5.u.f435469a.e(zy2.b6.class).c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nb0.class));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("releaseAllView before createdVideoViews:");
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = c15482x9b531b34.f215210m;
        sb6.append(concurrentLinkedQueue.size());
        sb6.append(" recycledVideoViews:");
        java.util.HashSet hashSet = c15482x9b531b34.f215209i;
        sb6.append(hashSet.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoRecycler", sb6.toString());
        java.util.Iterator it = concurrentLinkedQueue.iterator();
        while (true) {
            if (!it.hasNext()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoRecycler", "releaseAllView after createdVideoViews:" + concurrentLinkedQueue.size() + " recycledVideoViews:" + hashSet.size());
                ru2.j.f481278h = null;
                return;
            }
            cw2.da daVar = (cw2.da) ((java.lang.ref.WeakReference) it.next()).get();
            if (daVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoRecycler", "releaseAllView view:" + daVar + " mediaid:" + daVar.mo56696x9040359a());
                daVar.d();
                daVar.b();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(daVar, c15482x9b531b34.f215218u)) {
                    android.view.ViewParent parent = daVar.mo56698x4ee17f0a().getParent();
                    cw2.v9 v9Var = parent instanceof cw2.v9 ? (cw2.v9) parent : null;
                    cw2.h8 playInfo = v9Var != null ? v9Var.getPlayInfo() : null;
                    if (playInfo != null) {
                        playInfo.f305286i = false;
                    }
                }
                c15482x9b531b34.e7(daVar.mo56698x4ee17f0a());
                it.remove();
            }
        }
    }
}
