package o20;

/* loaded from: classes14.dex */
public final class i implements o20.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final kk4.b f423915a;

    /* renamed from: b, reason: collision with root package name */
    public final q20.l f423916b;

    /* renamed from: c, reason: collision with root package name */
    public o20.t f423917c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f423918d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f423919e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f423920f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f423921g;

    /* renamed from: h, reason: collision with root package name */
    public final o20.h f423922h;

    public i() {
        df0.q qVar = (df0.q) i95.n0.c(df0.q.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        kk4.b Ai = ((cf0.q) qVar).Ai(context);
        this.f423915a = Ai;
        this.f423916b = new q20.j();
        this.f423917c = o20.l.f423925a;
        this.f423918d = new java.util.concurrent.CopyOnWriteArrayList();
        this.f423919e = new java.util.concurrent.CopyOnWriteArrayList();
        this.f423920f = new java.util.concurrent.CopyOnWriteArrayList();
        this.f423921g = jz5.h.b(o20.g.f423913d);
        ((kk4.v) Ai).f390118j = true;
        kk4.v vVar = (kk4.v) Ai;
        vVar.G(new o20.a(this));
        vVar.f390129u = new o20.b(this);
        vVar.f390130v = new o20.c(this);
        vVar.f390128t = new o20.d(this);
        vVar.D(new o20.e(this));
        vVar.K = new o20.f(this);
        this.f423922h = new o20.h(this);
    }

    public void a() {
        if (kz5.z.G(new o20.t[]{o20.q.f423930a}, this.f423917c)) {
            c(this.f423922h);
        }
        kk4.b.i(this.f423915a, false, false, 3, null);
    }

    public void b() {
        ((kk4.v) this.f423915a).mo143590x408b7293();
        this.f423918d.clear();
        this.f423920f.clear();
        f(o20.r.f423931a);
        ((q20.j) this.f423916b).b();
    }

    public void c(o20.u listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f423918d;
        if (copyOnWriteArrayList.contains(listener)) {
            copyOnWriteArrayList.remove(listener);
        }
    }

    public void d(bw5.w9 videoInfo) {
        java.lang.Object obj;
        bw5.v9 v9Var;
        java.lang.Object obj2;
        java.lang.Object obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoInfo, "videoInfo");
        java.util.LinkedList linkedList = videoInfo.f116147d;
        jz5.f0 f0Var = null;
        if (((java.lang.Boolean) ((jz5.n) this.f423921g).mo141623x754a37bb()).booleanValue()) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(linkedList);
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it.next();
                    if (((bw5.v9) obj2).f115755g == 2) {
                        break;
                    }
                }
            }
            v9Var = (bw5.v9) obj2;
            if (v9Var == null) {
                java.util.Iterator it6 = linkedList.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj3 = null;
                        break;
                    } else {
                        obj3 = it6.next();
                        if (((bw5.v9) obj3).f115755g == 1) {
                            break;
                        }
                    }
                }
                v9Var = (bw5.v9) obj3;
                if (v9Var == null) {
                    v9Var = (bw5.v9) kz5.n0.Z(linkedList);
                }
            }
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(linkedList);
            java.util.Iterator it7 = linkedList.iterator();
            while (true) {
                if (!it7.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it7.next();
                    if (((bw5.v9) obj).f115755g == 1) {
                        break;
                    }
                }
            }
            v9Var = (bw5.v9) obj;
            if (v9Var == null) {
                v9Var = (bw5.v9) kz5.n0.Z(linkedList);
            }
        }
        if (v9Var != null) {
            java.lang.String str = v9Var.f115758m[1] ? v9Var.f115752d : "";
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getUrl(...)");
            p20.j jVar = new p20.j(str);
            ((kk4.v) this.f423915a).B(new dk4.a(jVar.b(), jVar.a(), jVar.f432956a, 0, 0));
            f(o20.m.f423926a);
            int i17 = v9Var.f115754f;
            int i18 = v9Var.f115753e;
            java.util.Iterator it8 = this.f423919e.iterator();
            while (it8.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18693x84c11749) ((com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p737xc53e9ae1.C10556x2b36b1cb) ((o20.w) it8.next())).f147466d).m(i17, i18);
            }
            java.lang.String str2 = videoInfo.f116149f[2] ? videoInfo.f116148e : "";
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getVideoHeadImg(...)");
            java.util.Iterator it9 = this.f423920f.iterator();
            while (it9.hasNext()) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p737xc53e9ae1.C10556x2b36b1cb) ((o20.v) it9.next())).b(str2);
            }
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EcsPlayer", "未找到合适的视频数据源");
            f(new o20.k(new o20.d0(-1, -1, "未找到合适的视频数据源", null, 8, null)));
        }
    }

    public void e() {
        ((q20.j) this.f423916b).mo144931xb05099c3();
        kk4.v vVar = (kk4.v) this.f423915a;
        if (!(vVar.f390112d == 3)) {
            vVar.O();
            return;
        }
        o20.h listener = this.f423922h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f423918d.add(listener);
    }

    public final void f(o20.t tVar) {
        o20.t tVar2 = this.f423917c;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tVar2, tVar)) {
            return;
        }
        this.f423917c = tVar;
        java.util.Iterator it = this.f423918d.iterator();
        while (it.hasNext()) {
            ((o20.u) it.next()).a(tVar2, tVar);
        }
    }
}
