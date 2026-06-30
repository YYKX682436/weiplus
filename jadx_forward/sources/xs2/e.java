package xs2;

/* loaded from: classes10.dex */
public abstract class e implements xs2.o {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f537847a;

    /* renamed from: b, reason: collision with root package name */
    public final gk2.e f537848b;

    /* renamed from: c, reason: collision with root package name */
    public xs2.f0 f537849c;

    /* renamed from: d, reason: collision with root package name */
    public vp.x f537850d;

    /* renamed from: e, reason: collision with root package name */
    public long f537851e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f537852f;

    /* renamed from: g, reason: collision with root package name */
    public vp.w f537853g;

    public e(android.view.View bullet, gk2.e business, xs2.f0 config) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bullet, "bullet");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(business, "business");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        this.f537847a = bullet;
        this.f537848b = business;
        this.f537849c = config;
        this.f537851e = -1L;
        xp.i f17 = xp.d.f();
        f17.f537384h = true;
        xp.a aVar = this.f537849c.f537861c;
        f17.f537378b = aVar != null ? aVar.f537345j : 0;
        f17.f537390n = xp.i.a(0.0f);
        f17.f537391o = xp.i.a(0.0f);
        xp.a aVar2 = this.f537849c.f537861c;
        if ((aVar2 != null ? aVar2.f537346k : 0) != 0) {
            f17.f537380d = aVar2 != null ? aVar2.f537346k : ym5.x.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 6.0f);
        } else {
            f17.f537380d = xp.i.a(6.0f);
        }
        f17.f537381e = xp.i.a(24);
        f17.b(bullet.getContext().getResources().getConfiguration().orientation == 1);
        xs2.f0 f0Var = this.f537849c;
        boolean z17 = f17.f537392p;
        boolean z18 = !z17;
        xp.a aVar3 = f0Var.f537861c;
        if (z18) {
            if (aVar3 != null) {
                i17 = aVar3.f537337b;
            }
            i17 = 2;
        } else {
            if (aVar3 != null) {
                i17 = aVar3.f537336a;
            }
            i17 = 2;
        }
        f17.f537379c = i17;
        f17.f537394r = i17;
        f17.f537377a = f0Var.a(z17, f17.f537393q);
        xp.c cVar = new xp.c(null);
        cVar.f537356a = new xs2.a(this);
        xs2.f0 f0Var2 = this.f537849c;
        cVar.f537359d = f0Var2.f537859a;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        ((java.util.ArrayList) cVar.f537358c).add(f0Var2.f537860b.a(context, business));
        cVar.f537357b = xs2.b.f537840a;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        cVar.f537361f = this.f537849c.f537861c;
        this.f537850d = new vp.x(bullet, new xp.d(cVar, null), false);
    }

    @Override // xs2.o
    public void a(int i17) {
    }

    @Override // xs2.o
    public vp.x b() {
        return i();
    }

    @Override // xs2.o
    public void d(java.util.List list) {
        java.lang.String j17 = j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAttach: ");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = ((mm2.c1) this.f537848b.a(mm2.c1.class)).f410379n;
        sb6.append(c19792x256d2725 != null ? cm2.a.f124861a.x(c19792x256d2725, -1) : null);
        sb6.append("， this=");
        sb6.append(hashCode());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j17, sb6.toString());
        mo175869x3f5eee52();
        boolean z17 = true;
        l(true);
        vp.w wVar = this.f537853g;
        if (wVar != null) {
            i().f520385d.i6(wVar);
        }
        i().f520385d.f0(false);
        if (list != null && !list.isEmpty()) {
            z17 = false;
        }
        if (z17) {
            return;
        }
        i().f520385d.mo172408x5a5b64d();
        c(list, "onAttach");
    }

    @Override // xs2.o
    public void e(float f17, boolean z17) {
    }

    @Override // xs2.o
    public void f(long j17, long j18) {
    }

    @Override // xs2.o
    public void g(java.util.List list, long j17, boolean z17) {
    }

    public long h() {
        return this.f537851e;
    }

    public final vp.x i() {
        vp.x xVar = this.f537850d;
        if (xVar != null) {
            return xVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("danmakuManager");
        throw null;
    }

    public abstract java.lang.String j();

    public void k(boolean z17) {
        int i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j(), "onConfigurationChange: isLandscape=" + z17);
        xp.i f17 = xp.d.f();
        xp.a aVar = this.f537849c.f537861c;
        if (z17) {
            if (aVar != null) {
                i17 = aVar.f537337b;
            }
            i17 = 2;
        } else {
            if (aVar != null) {
                i17 = aVar.f537336a;
            }
            i17 = 2;
        }
        f17.f537379c = i17;
        f17.f537394r = i17;
        f17.b(!z17);
        f17.f537377a = this.f537849c.a(f17.f537392p, f17.f537393q);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j(), "setDanmakuRow: rowCount=" + f17.f537379c + ", isVertical=" + f17.f537392p + ", duration=" + f17.f537377a + ", playSpeedRatio=" + f17.f537393q);
        xp.c cVar = new xp.c(null);
        cVar.f537356a = new xs2.c(this);
        xs2.f0 f0Var = this.f537849c;
        cVar.f537361f = f0Var.f537861c;
        cVar.f537359d = f0Var.f537859a;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        ((java.util.ArrayList) cVar.f537358c).add(f0Var.f537860b.a(context, this.f537848b));
        cVar.f537357b = xs2.d.f537845a;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        i().f520385d.Z4(new xp.d(cVar, null));
    }

    public final void l(boolean z17) {
        if (z17 != this.f537852f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j(), hashCode() + " isAttached from " + this.f537852f + " to " + z17);
        }
        this.f537852f = z17;
    }

    public void m(long j17) {
        if (j17 >= 0) {
            j17 += this.f537849c.f537861c != null ? r0.f537341f : 0;
        }
        this.f537851e = j17;
    }

    public void n() {
        if (this.f537852f) {
            java.lang.String j17 = j();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stop: ");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = ((mm2.c1) this.f537848b.a(mm2.c1.class)).f410379n;
            sb6.append(c19792x256d2725 != null ? cm2.a.f124861a.x(c19792x256d2725, -1) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j17, sb6.toString());
            i().f520385d.h5();
            i().f520385d.mo172408x5a5b64d();
            i().f520385d.mo172411x35224f();
        }
    }

    @Override // xs2.o
    /* renamed from: onDetach */
    public void mo175869x3f5eee52() {
        if (this.f537852f) {
            l(false);
            m(-1L);
            java.lang.String j17 = j();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetach: ");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = ((mm2.c1) this.f537848b.a(mm2.c1.class)).f410379n;
            sb6.append(c19792x256d2725 != null ? cm2.a.f124861a.x(c19792x256d2725, -1) : null);
            sb6.append("， this=");
            sb6.append(hashCode());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j17, sb6.toString());
            i().f520385d.mo172412x41012807();
        }
    }
}
