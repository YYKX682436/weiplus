package du2;

@j95.b
/* loaded from: classes2.dex */
public final class n extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public du2.w f325017d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f325018e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f325019f;

    /* renamed from: g, reason: collision with root package name */
    public p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.r f325020g;

    /* renamed from: h, reason: collision with root package name */
    public p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.m f325021h;

    /* renamed from: i, reason: collision with root package name */
    public volatile du2.l f325022i = du2.l.f325013d;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f325023m = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: n, reason: collision with root package name */
    public final android.os.Bundle f325024n = new android.os.Bundle();

    public static /* synthetic */ fu2.c Ai(du2.n nVar, du2.l lVar, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            lVar = nVar.f325022i;
        }
        return nVar.wi(lVar);
    }

    public final void Bi() {
        fu2.c Ai = Ai(this, null, 1, null);
        if (Ai != null) {
            eu2.j jVar = (eu2.j) Ai;
            jVar.f338326d.f338300q = true;
            jVar.b(false);
        }
    }

    public final void Di() {
        fu2.c Ai = Ai(this, null, 1, null);
        if (Ai != null) {
            eu2.j jVar = (eu2.j) Ai;
            eu2.b0 b0Var = jVar.f338326d;
            if (b0Var.f338293g == eu2.k.f338327d) {
                f25.m0 m0Var = b0Var.f338303t;
                if (!(m0Var != null && ((g25.e) m0Var).f349513c)) {
                    b0Var.wi();
                    i95.m c17 = i95.n0.c(f25.n0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    b0Var.f338303t = ((f25.n0) c17).m9(f25.n.f340640c, new eu2.i(jVar));
                    jVar.b(true);
                    return;
                }
            }
            jVar.b(true);
        }
    }

    public final boolean Ni(du2.l lVar) {
        if (lVar != null) {
            this.f325022i = lVar;
        }
        if (Ai(this, null, 1, null) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerManager", "depend is null, currentBusinessType = " + this.f325022i + ", businessMap = " + this.f325023m);
            return false;
        }
        if (this.f325020g != null) {
            Ri();
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerManager", "service is not ready, try to connect service, businessType = " + lVar + ", businessMap = " + this.f325023m);
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.m mVar = this.f325021h;
        if (mVar != null && ((p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.g) mVar.f90470a).f90460b.isConnected()) {
            Ri();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerManager", "[connectService] Already connected, skip");
            return true;
        }
        fu2.c Ai = Ai(this, null, 1, null);
        if ((Ai != null ? ((eu2.j) Ai).f338326d.f338291e : null) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerManager", "[connectService], currentMediaInfo is null");
            return false;
        }
        if (this.f325019f) {
            return true;
        }
        this.f325019f = true;
        du2.m mVar2 = new du2.m(this);
        this.f325018e = true;
        this.f325021h = new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.m(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, new android.content.ComponentName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1637x7c6522f1.ServiceC15002xfa6c787f.class), mVar2, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerManager", "connectService");
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.m mVar3 = this.f325021h;
        if (mVar3 == null) {
            return true;
        }
        ((p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.g) mVar3.f90470a).f90460b.connect();
        return true;
    }

    public final void Ri() {
        boolean z17;
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.r rVar = this.f325020g;
        if (rVar != null) {
            rVar.a("COMMAND_UPDATE_INFO", null, null);
        }
        boolean z18 = true;
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            z17 = false;
        }
        if (!z17 && !z65.c.a()) {
            kb2.b bVar = kb2.b.f387758a;
            z18 = false;
        }
        if (z18) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("FinderSystemPlayerManager", "[sendUpdateInfoCommand] update successfully!", new java.lang.Object[0]);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerManager", "[sendUpdateInfoCommand] update successfully!");
        }
    }

    public final void Ui(boolean z17, du2.l type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        if (type != this.f325022i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerManager", "[setMediaSessionActive] failed, isActive = " + z17 + ", type = " + type + ", currentBusinessType = " + this.f325022i);
            return;
        }
        android.os.Bundle bundle = this.f325024n;
        bundle.putBoolean("key_set_session_active", z17);
        bundle.putBoolean("key_need_cancel_notification", false);
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.r rVar = this.f325020g;
        if (rVar != null) {
            rVar.a("COMMAND_SET_ACTIVE_AND_CANCEL_NOTIFICATION", this.f325024n, null);
        }
    }

    public final fu2.c wi(du2.l businessType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(businessType, "businessType");
        return (fu2.c) this.f325023m.get(businessType);
    }
}
