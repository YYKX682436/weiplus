package p05;

/* loaded from: classes3.dex */
public final class i0 implements p05.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final p05.z0 f432073a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f432074b;

    /* renamed from: c, reason: collision with root package name */
    public rh0.d0 f432075c;

    /* renamed from: d, reason: collision with root package name */
    public long f432076d;

    /* renamed from: e, reason: collision with root package name */
    public qu5.a f432077e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f432078f;

    /* renamed from: g, reason: collision with root package name */
    public p05.n0 f432079g;

    /* renamed from: h, reason: collision with root package name */
    public final p05.h0 f432080h;

    public i0(p05.z0 weVisionJsonCallbackBucket) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weVisionJsonCallbackBucket, "weVisionJsonCallbackBucket");
        this.f432073a = weVisionJsonCallbackBucket;
        this.f432078f = new java.util.ArrayList();
        this.f432080h = new p05.h0(this);
    }

    @Override // p05.e2
    public int a() {
        return 0;
    }

    @Override // p05.e2
    public void b(rh0.d0 d0Var) {
        if (this.f432074b && d0Var != null && ((p05.l4) d0Var).f432126f != this.f432076d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLive.FallingGiftEffect", "Cannot attach twice!");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("attach WeVision=");
        if (tq5.i.f502802a == 0) {
            tq5.i.f502802a = 2014500;
        }
        sb6.append(tq5.i.f502802a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLive.FallingGiftEffect", sb6.toString());
        rh0.d0 d0Var2 = this.f432075c;
        if (d0Var2 != null) {
            ((p05.l4) d0Var2).u(this);
        }
        this.f432075c = d0Var;
        if (d0Var != null) {
            ((p05.l4) d0Var).f(this);
        }
        p05.h0 c17 = this.f432080h;
        p05.z0 z0Var = this.f432073a;
        if (d0Var != null) {
            long j17 = ((p05.l4) d0Var).f432126f;
            this.f432076d = j17;
            if (j17 == 0) {
                return;
            }
            z0Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
            z0Var.f432272a.add(c17);
            this.f432074b = true;
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLive.FallingGiftEffect", "#destroy");
        z0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        z0Var.f432272a.remove(c17);
        this.f432079g = null;
        this.f432077e = null;
        this.f432076d = 0L;
        this.f432074b = false;
    }

    public void c(p05.m0 m0Var, qu5.a aVar, p05.n0 n0Var) {
        java.lang.Object obj;
        java.lang.String str;
        java.lang.String str2;
        if (!this.f432074b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLive.FallingGiftEffect", "This effect is not attached!");
        }
        if (this.f432074b) {
            java.lang.String str3 = "";
            java.lang.String str4 = (m0Var == null || (str2 = m0Var.f432150c) == null) ? "" : str2;
            this.f432077e = aVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLive.FallingGiftEffect", "#change path=".concat(str4));
            java.util.ArrayList arrayList = this.f432078f;
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                p05.d0 d0Var = (p05.d0) it.next();
                rh0.d0 d0Var2 = this.f432075c;
                if (d0Var2 != null) {
                    ((p05.l4) d0Var2).t(d0Var.f432010a);
                }
                rh0.d0 d0Var3 = this.f432075c;
                if (d0Var3 != null) {
                    ((p05.l4) d0Var3).z(d0Var.f432010a, null);
                }
            }
            arrayList.clear();
            if (m0Var != null && (str = m0Var.f432149b) != null) {
                str3 = str;
            }
            boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(str3);
            if (m0Var != null) {
                if (!(str4.length() == 0)) {
                    if (!(m0Var.f432149b.length() == 0) && j17 && m0Var.f432148a > 0) {
                        java.lang.Iterable s17 = com.p314xaae8f345.mm.vfs.w6.s(str4, false);
                        if (s17 != null) {
                            java.util.Iterator it6 = s17.iterator();
                            while (true) {
                                if (!it6.hasNext()) {
                                    break;
                                }
                                java.lang.Object next = it6.next();
                                com.p314xaae8f345.mm.vfs.x1 x1Var = (com.p314xaae8f345.mm.vfs.x1) next;
                                if (x1Var.f294769f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(x1Var.f294765b, "Lua")) {
                                    obj = next;
                                    break;
                                }
                            }
                            obj = (com.p314xaae8f345.mm.vfs.x1) obj;
                        }
                        if (obj != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLive.FallingGiftEffect", "#change new way, data = " + m0Var);
                            rh0.d0 d0Var4 = this.f432075c;
                            long d17 = d0Var4 != null ? ((p05.l4) d0Var4).d(str4.concat("/Lua")) : -1L;
                            final p05.f0 f0Var = new p05.f0(java.lang.System.currentTimeMillis(), 100L, new p05.e0(this, d17, n0Var, str4, m0Var));
                            qu5.a aVar2 = this.f432077e;
                            if (aVar2 != null) {
                                aVar2.mo50297x7c4d7ca2(new java.lang.Runnable(f0Var) { // from class: p05.g0

                                    /* renamed from: d, reason: collision with root package name */
                                    public final /* synthetic */ yz5.a f432056d;

                                    {
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(f0Var, "function");
                                        this.f432056d = f0Var;
                                    }

                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        this.f432056d.mo152xb9724478();
                                    }
                                }, 100L);
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLive.FallingGiftEffect", "#glThread holy.. where is your threadHandler");
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLive.FallingGiftEffect", "#change ptr=" + d17);
                            return;
                        }
                        return;
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLive.FallingGiftEffect", "[change] return. " + m0Var);
        }
    }
}
