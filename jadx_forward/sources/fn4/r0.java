package fn4;

/* loaded from: classes15.dex */
public class r0 {

    /* renamed from: a, reason: collision with root package name */
    public fn4.b f346133a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f346134b;

    /* renamed from: e, reason: collision with root package name */
    public int f346137e = 0;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f346135c = java.util.Collections.synchronizedMap(new java.util.HashMap());

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f346136d = java.util.Collections.synchronizedSet(new java.util.HashSet());

    public final long a(long j17, long j18) {
        if (j18 != 0) {
            return (j17 * 100) / j18;
        }
        return 0L;
    }

    public void b() {
        java.util.Iterator it = this.f346136d.iterator();
        while (it.hasNext()) {
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di((java.lang.String) it.next());
        }
    }

    public void c(fn4.b bVar) {
        int i17 = this.f346137e + 1;
        this.f346137e = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryPreloadMgr", "onUICreate %d", java.lang.Integer.valueOf(i17));
        this.f346133a = bVar;
        this.f346134b = pm4.w.j(bVar.r0().f469045r);
    }

    public void d() {
        int i17 = this.f346137e - 1;
        this.f346137e = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryPreloadMgr", "onUIDestroy %d", java.lang.Integer.valueOf(i17));
        if (this.f346137e <= 0) {
            b();
            this.f346136d.clear();
            s75.d.b(new fn4.o0(this, this.f346134b), "TopStory.DeleteVideoFolderTask");
            this.f346133a = null;
        }
    }
}
