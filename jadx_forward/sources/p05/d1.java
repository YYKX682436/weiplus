package p05;

/* loaded from: classes3.dex */
public final class d1 implements p05.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final p05.z0 f432012a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f432013b;

    /* renamed from: c, reason: collision with root package name */
    public rh0.d0 f432014c;

    /* renamed from: d, reason: collision with root package name */
    public long f432015d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f432016e;

    /* renamed from: f, reason: collision with root package name */
    public p05.r0 f432017f;

    /* renamed from: g, reason: collision with root package name */
    public final p05.c1 f432018g;

    public d1(p05.z0 weVisionJsonCallbackBucket) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weVisionJsonCallbackBucket, "weVisionJsonCallbackBucket");
        this.f432012a = weVisionJsonCallbackBucket;
        this.f432016e = new java.util.ArrayList();
        this.f432018g = new p05.c1(this);
    }

    @Override // p05.e2
    public int a() {
        return 0;
    }

    @Override // p05.e2
    public void b(rh0.d0 d0Var) {
        if (this.f432013b && d0Var != null && ((p05.l4) d0Var).f432126f != this.f432015d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("InteractiveGiftEffect", "Cannot attach twice!");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("attach WeVision=");
        if (tq5.i.f502802a == 0) {
            tq5.i.f502802a = 2014500;
        }
        sb6.append(tq5.i.f502802a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("InteractiveGiftEffect", sb6.toString());
        rh0.d0 d0Var2 = this.f432014c;
        if (d0Var2 != null) {
            ((p05.l4) d0Var2).u(this);
        }
        this.f432014c = d0Var;
        if (d0Var != null) {
            ((p05.l4) d0Var).f(this);
        }
        p05.c1 c17 = this.f432018g;
        p05.z0 z0Var = this.f432012a;
        if (d0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("InteractiveGiftEffect", "#destroy");
            z0Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
            z0Var.f432272a.remove(c17);
            this.f432017f = null;
            this.f432015d = 0L;
            this.f432013b = false;
            return;
        }
        long j17 = ((p05.l4) d0Var).f432126f;
        this.f432015d = j17;
        if (j17 == 0) {
            return;
        }
        z0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        z0Var.f432272a.add(c17);
        this.f432013b = true;
    }

    public void c(java.lang.String path, p05.r0 r0Var) {
        com.p314xaae8f345.mm.vfs.x1 x1Var;
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        if (!this.f432013b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("InteractiveGiftEffect", "This effect is not attached!");
        }
        if (this.f432013b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("InteractiveGiftEffect", "#change path=".concat(path));
            java.util.ArrayList arrayList = this.f432016e;
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p05.a1 a1Var = (p05.a1) it.next();
                rh0.d0 d0Var = this.f432014c;
                if (d0Var != null) {
                    ((p05.l4) d0Var).t(a1Var.f431969a);
                }
                rh0.d0 d0Var2 = this.f432014c;
                if (d0Var2 != null) {
                    ((p05.l4) d0Var2).z(a1Var.f431969a, null);
                }
            }
            arrayList.clear();
            if (path.length() == 0) {
                return;
            }
            java.lang.Iterable s17 = com.p314xaae8f345.mm.vfs.w6.s(path, false);
            if (s17 != null) {
                java.util.Iterator it6 = s17.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it6.next();
                    com.p314xaae8f345.mm.vfs.x1 x1Var2 = (com.p314xaae8f345.mm.vfs.x1) obj;
                    if (x1Var2.f294769f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(x1Var2.f294765b, "Lua")) {
                        break;
                    }
                }
                x1Var = (com.p314xaae8f345.mm.vfs.x1) obj;
            } else {
                x1Var = null;
            }
            if (x1Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("InteractiveGiftEffect", "#change new way");
                rh0.d0 d0Var3 = this.f432014c;
                java.lang.Long valueOf = d0Var3 != null ? java.lang.Long.valueOf(((p05.l4) d0Var3).d(path.concat("/Lua"))) : null;
                if (valueOf != null) {
                    this.f432017f = r0Var;
                    arrayList.add(new p05.a1(valueOf.longValue(), path.concat("/Lua")));
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("InteractiveGiftEffect", "#change ptr=" + valueOf);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("InteractiveGiftEffect", "#change old way");
            long[] m83718x62437256 = com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83718x62437256(this.f432015d, path);
            if (m83718x62437256 != null) {
                for (long j17 : m83718x62437256) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("InteractiveGiftEffect", "#change ptr=" + j17);
                    if (j17 > 0) {
                        this.f432017f = r0Var;
                        arrayList.add(new p05.a1(j17, path));
                        rh0.d0 d0Var4 = this.f432014c;
                        if (d0Var4 != null) {
                            ((p05.l4) d0Var4).z(j17, new p05.b1(this));
                        }
                    }
                }
            }
        }
    }
}
