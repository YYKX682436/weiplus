package te2;

/* loaded from: classes10.dex */
public abstract class jc implements te2.kc {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f499682d;

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f499683e;

    /* renamed from: f, reason: collision with root package name */
    public final qo0.c f499684f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f499685g;

    /* renamed from: h, reason: collision with root package name */
    public te2.lc f499686h;

    /* renamed from: i, reason: collision with root package name */
    public bm2.x8 f499687i;

    public jc(android.content.Context context, gk2.e liveData, qo0.c statusMonitor, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        this.f499682d = context;
        this.f499683e = liveData;
        this.f499684f = statusMonitor;
        this.f499685g = basePlugin;
    }

    @Override // te2.l0
    public boolean D2(int i17, r45.xg7 xg7Var) {
        return false;
    }

    public abstract java.lang.String c();

    public abstract void f(yz5.l lVar);

    @Override // fs2.a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo56536x3b13c504(te2.lc callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c(), "onAttach - start");
        this.f499686h = callback;
        callback.b();
        h();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c(), "onAttach - complete");
    }

    public abstract void h();

    public final void i(java.lang.String songName, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songName, "songName");
        gk2.e eVar = this.f499683e;
        if (!((mm2.c1) eVar.a(mm2.c1.class)).m7()) {
            android.content.Context context = this.f499682d;
            db5.t7.g(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d5j));
            return;
        }
        ((mm2.s2) eVar.a(mm2.s2.class)).f410940i.mo7808x76db6cb1(java.lang.Boolean.FALSE);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("PARAM_FINDER_LIVE_SING_SONG_NAME", songName);
        if (lVar != null) {
            lVar.mo146xb9724478(bundle);
        }
        this.f499685g.f194858g.mo46557x60d69242(qo0.b.S1, bundle);
    }

    public void m() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c(), "showMusicView - start load data");
        te2.l0.A0(this, false, null, new te2.ic(this), 3, null);
        te2.lc lcVar = this.f499686h;
        if (lcVar != null) {
            lcVar.c(true);
        }
    }

    @Override // fs2.a
    /* renamed from: onDetach */
    public void mo979x3f5eee52() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c(), "onDetach");
        this.f499686h = null;
        this.f499687i = null;
    }

    @Override // te2.l0
    public void u5(boolean z17, r45.xg7 xg7Var, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (this.f499685g.W0() == null) {
            callback.mo146xb9724478(0);
        } else {
            f(callback);
        }
    }
}
