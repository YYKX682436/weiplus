package ey2;

/* loaded from: classes2.dex */
public final class e2 extends pf5.o0 {

    /* renamed from: i, reason: collision with root package name */
    public static final ey2.d2 f338889i = new ey2.d2(null);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f338890e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f338891f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f338892g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashSet f338893h = new java.util.HashSet();

    public final void N6(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.StreamCardVM", "clearAlbumReadFeeds... size=" + this.f338892g.size());
        synchronized (this.f338892g) {
            this.f338892g.clear();
            if (z17) {
                this.f338893h.clear();
            }
        }
    }
}
