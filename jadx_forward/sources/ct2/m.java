package ct2;

/* loaded from: classes3.dex */
public final class m extends pf5.k0 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f303822d = "";

    /* renamed from: e, reason: collision with root package name */
    public int f303823e;

    /* renamed from: f, reason: collision with root package name */
    public wu5.c f303824f;

    /* renamed from: g, reason: collision with root package name */
    public long f303825g;

    public final void N6(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveReplayTransitionPreloadSlice", "cancelPreloadTask source:" + i17 + ",preloadId:" + this.f303823e + '!');
        wu5.c cVar = this.f303824f;
        if (cVar != null) {
            cVar.cancel(true);
        }
        this.f303823e = 0;
        this.f303824f = null;
    }

    public final void O6(java.lang.String str, r45.gv gvVar, r45.gn1 gn1Var) {
        java.lang.String str2 = gvVar.f457070e;
        long m75942xfb822ef2 = gn1Var.m75942xfb822ef2(7);
        this.f303825g = m75942xfb822ef2;
        long currentTimeMillis = (m75942xfb822ef2 * 1000) - java.lang.System.currentTimeMillis();
        if (currentTimeMillis < 0) {
            currentTimeMillis = 0;
        }
        this.f303822d = str;
        this.f303824f = ((ku5.t0) ku5.t0.f394148d).k(new ct2.k(this, str, str2, gn1Var), currentTimeMillis);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveReplayTransitionPreloadSlice", "execPreloadTask taskId(replayTransitionId):" + this.f303822d + ", preloadUrl:" + str2 + " ,lastWorkExcuteTime:" + this.f303825g + ",delayTime:" + currentTimeMillis + '!');
    }

    public final java.lang.String P6() {
        return "taskId:" + this.f303822d + ",preloadId:" + this.f303823e + ",preloadWork is null:true";
    }

    @Override // pf5.e, p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveReplayTransitionPreloadSlice", "onCleared " + P6());
        N6(5);
        super.mo528x82b764cd();
    }
}
