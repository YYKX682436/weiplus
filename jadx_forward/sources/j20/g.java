package j20;

/* loaded from: classes9.dex */
public final class g implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f378757d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Runnable f378758e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f378759f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j20.o f378760g;

    public g(j20.o oVar, int i17, yz5.l lVar) {
        this.f378760g = oVar;
        this.f378757d = lVar;
    }

    public final synchronized void a(int i17, float f17, float f18) {
        if (this.f378759f) {
            return;
        }
        this.f378759f = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsPoiService", "result:" + i17 + ",fLongitude:" + f17 + ",fLatitude:" + f18 + ",callback:" + this.f378757d);
        yz5.l lVar = this.f378757d;
        if (lVar != null) {
            lVar.mo146xb9724478(this.f378760g.Ai(i17, f17, f18, c01.id.c()));
        }
        java.util.List wi6 = j20.o.wi(this.f378760g);
        if (wi6 != null) {
            wi6.remove(this);
        }
    }

    @Override // i11.c
    /* renamed from: onGetLocation */
    public boolean mo630x9b865cc(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        java.lang.Runnable runnable = this.f378758e;
        j20.o oVar = this.f378760g;
        if (runnable != null) {
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) oVar.f378771e).mo141623x754a37bb()).mo50300x3fa464aa(runnable);
        }
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h.e().m(this);
        if (z17) {
            oVar.Ni(f17, f18);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onGetLocation] longitude=");
            sb6.append(f17);
            sb6.append(" latitude=");
            sb6.append(f18);
            sb6.append(", listener size=");
            java.util.List wi6 = j20.o.wi(oVar);
            sb6.append(wi6 != null ? java.lang.Integer.valueOf(wi6.size()) : null);
            sb6.append('}');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsPoiService", sb6.toString());
            a(1, f17, f18);
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[onGetLocation] from cache. longitude=");
            sb7.append(f17);
            sb7.append(" latitude=");
            sb7.append(f18);
            sb7.append(", listener size=");
            java.util.List wi7 = j20.o.wi(oVar);
            sb7.append(wi7 != null ? java.lang.Integer.valueOf(wi7.size()) : null);
            sb7.append('}');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsPoiService", sb7.toString());
            a(102, f17, f18);
        }
        return true;
    }
}
