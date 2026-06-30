package t10;

/* loaded from: classes9.dex */
public final class b extends com.p314xaae8f345.p3118xeeebfacc.AbstractC26825x3e3f5190 implements y02.f0 {

    /* renamed from: d, reason: collision with root package name */
    public final t10.c f496082d;

    public b(t10.c router) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(router, "router");
        this.f496082d = router;
    }

    @Override // y02.f0
    public void Y2(bw5.x7 jumpInfo, y02.d0 d0Var, bw5.l8 preloadConfig, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfo, "jumpInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preloadConfig, "preloadConfig");
        t10.d dVar = new t10.d();
        t10.c cVar = this.f496082d;
        java.lang.String str = cVar.f496083a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        dVar.f496085a = str;
        dVar.f496086b = "preload";
        dVar.f496087c = jumpInfo;
        dVar.f496088d = lVar;
        cVar.c(a(d0Var), jumpInfo, preloadConfig, dVar);
    }

    public final pq.a a(y02.d0 d0Var) {
        pq.a aVar;
        java.lang.String str;
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28624x6307ecb0 m137439x2173b36a;
        if (d0Var != null) {
            aVar = r10.j.b(d0Var);
        } else {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            aVar = new pq.a(context);
        }
        if (d0Var != null) {
            y02.e0 e0Var = (y02.e0) d0Var;
            y02.z a17 = e0Var.a();
            if ((a17 != null ? ((y02.a0) a17).a() : null) == bw5.k8.EcsOpenPlatform_Flutter) {
                y02.z a18 = e0Var.a();
                if (a18 != null) {
                    y02.a0 a0Var = (y02.a0) a18;
                    synchronized (a0Var) {
                        if (a0Var.f540125d[1]) {
                            str = a0Var.f540127f;
                        } else {
                            str = p3380x6a61f93.p3387xf51c6630.C30619x21b24a1c.m170312x21b89873(a0Var.m105978x2737f10());
                            synchronized (a0Var) {
                                a0Var.f540127f = str;
                                a0Var.f540125d[1] = true;
                            }
                        }
                    }
                } else {
                    str = null;
                }
                if (str == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ECS_O.BaseRouter", "handlerOpen From Flutter, but engineId is null");
                } else {
                    io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e = io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28582x3d2c20c4.m137465x9cf0d20b().get(str);
                    io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f interfaceC28623x7c9e3e4f = (c28580x69eec95e == null || (m137439x2173b36a = c28580x69eec95e.m137439x2173b36a()) == null) ? null : m137439x2173b36a.get(pi0.t.class);
                    pi0.t tVar = interfaceC28623x7c9e3e4f instanceof pi0.t ? (pi0.t) interfaceC28623x7c9e3e4f : null;
                    android.app.Activity activity = tVar != null ? tVar.f436259d : null;
                    if (activity == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ECS_O.BaseRouter", "handlerOpen From Flutter, but activity is null");
                    } else {
                        aVar.f439084a = new java.lang.ref.WeakReference(activity);
                    }
                }
            }
        }
        return aVar;
    }

    @Override // y02.f0
    public void j0(bw5.x7 jumpInfo, y02.d0 d0Var, yz5.l lVar) {
        y02.z a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfo, "jumpInfo");
        java.lang.String str = null;
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, 0, s00.a.class, null);
        if (d0Var != null && (a17 = ((y02.e0) d0Var).a()) != null) {
            str = java.lang.Long.valueOf(((y02.a0) a17).d()).toString();
        }
        z20.e eVar = z20.e.f551076e;
        z20.b bVar = new z20.b();
        bVar.f551070a = eVar;
        bw5.q9 q9Var = new bw5.q9();
        q9Var.f113532d = "ecso_open";
        q9Var.f113546u[1] = true;
        q9Var.c(java.lang.System.currentTimeMillis());
        q9Var.b(2);
        bVar.f551071b = q9Var;
        bVar.f(str);
        bVar.c("native_handler_start");
        bVar.b("native_handler");
        bVar.a();
        t10.d dVar = new t10.d();
        t10.c cVar = this.f496082d;
        java.lang.String str2 = cVar.f496083a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str2, "<set-?>");
        dVar.f496085a = str2;
        dVar.f496086b = "open";
        dVar.f496087c = jumpInfo;
        dVar.f496088d = new t10.a(lVar, str);
        cVar.b(a(d0Var), jumpInfo, dVar);
    }

    @Override // y02.f0
    /* renamed from: name */
    public java.lang.String mo165603x337a8b() {
        return this.f496082d.f496083a;
    }

    @Override // y02.f0
    public boolean r6(bw5.x7 jumpInfo, y02.d0 d0Var) {
        pq.a aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfo, "jumpInfo");
        if (d0Var != null) {
            aVar = r10.j.b(d0Var);
        } else {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            aVar = new pq.a(context);
        }
        return this.f496082d.a(aVar, jumpInfo);
    }
}
