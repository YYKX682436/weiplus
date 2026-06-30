package o13;

/* loaded from: classes12.dex */
public abstract class b implements o13.w {

    /* renamed from: d, reason: collision with root package name */
    public boolean f423740d;

    public b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.BaseFTS5SearchLogic", "Create %s", mo9545xfb82e301());
    }

    @Override // o13.w
    public void a() {
    }

    @Override // o13.w
    public void c(java.lang.String str, java.lang.String str2) {
    }

    @Override // o13.w
    public void d(java.lang.String str, p13.y yVar, int i17, java.util.HashMap hashMap) {
    }

    @Override // o13.w
    public void e(java.lang.String str) {
    }

    public synchronized void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.BaseFTS5SearchLogic", "OnCreate %s | isCreated =%b", mo9545xfb82e301(), java.lang.Boolean.valueOf(this.f423740d));
        if (!this.f423740d && h()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.BaseFTS5SearchLogic", "SetCreated");
            this.f423740d = true;
        }
    }

    public void g() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.BaseFTS5SearchLogic", "OnDestroy %s | isCreated %b", mo9545xfb82e301(), java.lang.Boolean.valueOf(this.f423740d));
        if (this.f423740d && i()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.BaseFTS5SearchLogic", "SetDestroyed");
            this.f423740d = false;
        }
    }

    public abstract boolean h();

    public abstract boolean i();
}
