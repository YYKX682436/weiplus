package vo4;

/* loaded from: classes10.dex */
public final class w implements ph3.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vo4.x f520228a;

    public w(vo4.x xVar) {
        this.f520228a = xVar;
    }

    @Override // ph3.d
    public void a(int i17, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogVideoPlayer", this.f520228a.hashCode() + " video size changed size[%d, %d] degrees[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
    }

    @Override // ph3.d
    /* renamed from: onCompletion */
    public void mo75862xa6db431b() {
    }

    @Override // ph3.d
    /* renamed from: onError */
    public void mo75863xaf8aa769(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogVideoPlayer", this.f520228a.hashCode() + " onError what:" + i17 + " error :" + i18);
    }

    @Override // ph3.d
    /* renamed from: onPrepared */
    public void mo75864x58d5b73c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogVideoPlayer", this.f520228a.hashCode() + " onPrepared, canPlaying:" + this.f520228a.f520235v + ", notify all");
        this.f520228a.f520236w = true;
        vo4.x xVar = this.f520228a;
        synchronized (xVar.f520233t) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogVideoPlayer", xVar.hashCode() + " onPrepared notifyAll");
                xVar.f520233t.notifyAll();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VLogVideoPlayer", e17, "prepare lock notify error", new java.lang.Object[0]);
            }
        }
    }

    @Override // ph3.d
    /* renamed from: onSeekComplete */
    public void mo75865xe1fdf750() {
        this.f520228a.hashCode();
        ph3.k kVar = this.f520228a.f520231r;
        if (kVar != null) {
            kVar.m();
        }
        vo4.x xVar = this.f520228a;
        synchronized (xVar.f520234u) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogVideoPlayer", xVar.hashCode() + " player seek notifyAll");
                xVar.f520234u.notifyAll();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VLogVideoPlayer", e17, xVar.hashCode() + " notify seekLock error", new java.lang.Object[0]);
            }
        }
    }
}
