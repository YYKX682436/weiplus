package tl4;

/* loaded from: classes11.dex */
public abstract class e extends p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.v {

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p3118xeeebfacc.C26845xac206036 f501834f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f501835g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final int f501836h = 3000;

    /* renamed from: i, reason: collision with root package name */
    public final int f501837i = 10;

    /* renamed from: j, reason: collision with root package name */
    public bw5.jq0 f501838j;

    public e(com.p314xaae8f345.p3118xeeebfacc.C26845xac206036 c26845xac206036) {
        this.f501834f = c26845xac206036;
    }

    @Override // p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.v
    public void d() {
        if (!l()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingPlayAppBaseMediaSessionCallBack", "onPause call too much, just return");
            return;
        }
        b66.n n17 = n();
        if ((n17 != null ? ((b66.q) n17).n() : null) == bw5.pq0.Idle) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingPlayAppBaseMediaSessionCallBack", "onPause call but now is idle");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingPlayAppBaseMediaSessionCallBack", "onPause");
            d75.b.g(new tl4.b(this));
        }
    }

    @Override // p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.v
    public void e() {
        if (!l()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingPlayAppBaseMediaSessionCallBack", "onPlay call too much, just return");
            return;
        }
        b66.n n17 = n();
        if ((n17 != null ? ((b66.q) n17).n() : null) == bw5.pq0.Idle) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingPlayAppBaseMediaSessionCallBack", "onPlay call but now is idle");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingPlayAppBaseMediaSessionCallBack", "onPlay");
            d75.b.g(new tl4.c(this));
        }
    }

    @Override // p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.v
    public void f(java.lang.String str, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingPlayAppBaseMediaSessionCallBack", "onPlayFromMediaId mediaId: " + str);
    }

    @Override // p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.v
    public void j() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingPlayAppBaseMediaSessionCallBack", "onStop");
        d75.b.g(new tl4.d(this));
    }

    public final synchronized boolean l() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        while (!this.f501835g.isEmpty()) {
            java.lang.Object first = this.f501835g.getFirst();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(first, "getFirst(...)");
            if (java.lang.Math.abs(currentTimeMillis - ((java.lang.Number) first).longValue()) <= this.f501836h) {
                break;
            }
            this.f501835g.removeFirst();
        }
        if (this.f501835g.size() >= this.f501837i) {
            return false;
        }
        this.f501835g.addLast(java.lang.Long.valueOf(currentTimeMillis));
        return true;
    }

    public abstract bw5.eq0 m();

    public b66.n n() {
        b66.g gVar;
        com.p314xaae8f345.p3118xeeebfacc.C26845xac206036 c26845xac206036 = this.f501834f;
        if (c26845xac206036 == null || (gVar = (b66.g) c26845xac206036.m106052x32c52b()) == null) {
            return null;
        }
        return ((b66.i) gVar).a();
    }
}
