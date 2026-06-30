package gp2;

/* loaded from: classes10.dex */
public final class v0 extends pf5.k0 implements ws5.e {

    /* renamed from: g, reason: collision with root package name */
    public boolean f355864g;

    /* renamed from: h, reason: collision with root package name */
    public int f355865h;

    /* renamed from: i, reason: collision with root package name */
    public int f355866i;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f355861d = new java.util.HashSet();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f355862e = new java.util.concurrent.ConcurrentLinkedQueue();

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f355863f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashSet f355867m = new java.util.HashSet();

    public void N6(final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (this.f355866i == 0) {
            this.f355864g = false;
            this.f355865h = this.f355861d.size();
            android.os.Looper.getMainLooper().getQueue().addIdleHandler(new gp2.t0(this));
        }
        if (this.f355867m.add(java.lang.Integer.valueOf(activity.hashCode()))) {
            this.f355866i++;
            activity.mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.mm.plugin.finder.nearby.live.play.NearbyLivePlayerViewRecycler$attach$1
                @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
                /* renamed from: onDestroy */
                public final void m58371xac79a11b() {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDestroy activityCount:");
                    gp2.v0 v0Var = gp2.v0.this;
                    sb6.append(v0Var.f355866i);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLivePlayerViewRecycler", sb6.toString());
                    int i17 = v0Var.f355866i - 1;
                    v0Var.f355866i = i17;
                    java.util.HashSet hashSet = v0Var.f355867m;
                    if (i17 == 0) {
                        hashSet.clear();
                        v0Var.f355864g = true;
                        v0Var.f355863f.mo50293x3498a0(new gp2.u0(v0Var));
                    }
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = activity;
                    hashSet.remove(java.lang.Integer.valueOf(activityC0065xcd7aa112.hashCode()));
                    activityC0065xcd7aa112.mo273xed6858b4().c(this);
                }
            });
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 O6() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 c14522x8ffd8962 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962(context);
        this.f355862e.add(new java.lang.ref.WeakReference(c14522x8ffd8962));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLivePlayerViewRecycler", "createView view:" + c14522x8ffd8962);
        return c14522x8ffd8962;
    }

    @Override // pf5.e, p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        super.mo528x82b764cd();
        this.f355867m.clear();
        this.f355864g = true;
        this.f355863f.mo50293x3498a0(new gp2.u0(this));
    }
}
