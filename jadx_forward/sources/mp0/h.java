package mp0;

/* loaded from: classes15.dex */
public abstract class h extends fp0.d {

    /* renamed from: f, reason: collision with root package name */
    public final ip0.a f411973f;

    /* renamed from: g, reason: collision with root package name */
    public final cp0.f f411974g;

    /* renamed from: h, reason: collision with root package name */
    public final vo0.h f411975h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.w1 f411976i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f411977m;

    /* renamed from: n, reason: collision with root package name */
    public fp0.u f411978n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f411979o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f411980p;

    /* renamed from: q, reason: collision with root package name */
    public hp0.e f411981q;

    public h(ip0.a url, cp0.f target, vo0.h REAPER, com.p314xaae8f345.mm.sdk.p2603x2137b148.w1 w1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(REAPER, "REAPER");
        this.f411973f = url;
        this.f411974g = target;
        this.f411975h = REAPER;
        this.f411976i = w1Var;
        this.f411977m = "MicroMsg.Loader.ImageLoader.ImageLoadTask";
        this.f411978n = fp0.u.f346821d;
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f411979o = concurrentLinkedQueue;
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue2 = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f411980p = concurrentLinkedQueue2;
        ep0.c cVar = REAPER.f520010g;
        if (cVar != null) {
            concurrentLinkedQueue.add(cVar);
        }
        concurrentLinkedQueue2.add(REAPER.f520007d);
    }

    @Override // fp0.d
    public void a() {
        java.lang.System.currentTimeMillis();
        yo0.h fileType = this.f411975h.f520005b.f545632d;
        mp0.g gVar = new mp0.g(this);
        mp0.e eVar = (mp0.e) this;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileType, "fileType");
        try {
            eVar.h(fileType, gVar);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Loader.ImageLoadWorkTask", e17, "[ImageLoader execute] " + e17.getMessage() + " run error " + eVar.f411973f + " [debug info null]", new java.lang.Object[0]);
            gVar.b();
        }
    }

    @Override // fp0.d
    public boolean c(fp0.d newTask) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newTask, "newTask");
        boolean z17 = !(this.f411974g instanceof cp0.a);
        synchronized (this) {
            if (!z17) {
                if (newTask instanceof mp0.h) {
                    if (this.f411981q != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f411977m, "[isCanReplaceCallback] task has end! url=" + this.f411973f);
                        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = ((mp0.h) newTask).f411979o;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        for (java.lang.Object obj : concurrentLinkedQueue) {
                            if (obj instanceof ep0.c) {
                                arrayList.add(obj);
                            }
                        }
                        java.util.Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((ep0.c) it.next()).a(this.f411973f, this.f411974g.f302278a, this.f411981q);
                        }
                        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue2 = ((mp0.h) newTask).f411980p;
                        java.util.ArrayList<ep0.e> arrayList2 = new java.util.ArrayList();
                        for (java.lang.Object obj2 : concurrentLinkedQueue2) {
                            if (obj2 instanceof ep0.e) {
                                arrayList2.add(obj2);
                            }
                        }
                        for (ep0.e eVar : arrayList2) {
                            ip0.a aVar = this.f411973f;
                            cp0.n nVar = this.f411974g.f302278a;
                            hp0.e eVar2 = this.f411981q;
                            eVar.a(aVar, nVar, eVar2 != null ? eVar2.f364443b : null);
                        }
                    } else {
                        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue3 = this.f411979o;
                        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue4 = ((mp0.h) newTask).f411979o;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        for (java.lang.Object obj3 : concurrentLinkedQueue4) {
                            if (obj3 instanceof ep0.c) {
                                arrayList3.add(obj3);
                            }
                        }
                        concurrentLinkedQueue3.addAll(arrayList3);
                        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue5 = this.f411980p;
                        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue6 = ((mp0.h) newTask).f411980p;
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        for (java.lang.Object obj4 : concurrentLinkedQueue6) {
                            if (obj4 instanceof ep0.e) {
                                arrayList4.add(obj4);
                            }
                        }
                        concurrentLinkedQueue5.addAll(arrayList4);
                    }
                }
            }
        }
        return z17;
    }

    @Override // fp0.d
    public java.lang.String d() {
        java.lang.String m139674x9616526c = this.f411973f.m139674x9616526c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m139674x9616526c, "toString(...)");
        return m139674x9616526c;
    }

    public final void e(hp0.i httpResponse, hp0.g source, hp0.g gVar, mp0.h task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(httpResponse, "httpResponse");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        vo0.h hVar = this.f411975h;
        yo0.i iVar = hVar.f520005b;
        if (iVar.f545630b) {
            hVar.f520013j.f(this.f411973f, httpResponse, source, gVar, iVar, hVar);
        }
    }

    public final void f(hp0.e eVar) {
        synchronized (this) {
            this.f411981q = eVar;
            java.util.Iterator it = this.f411979o.iterator();
            while (it.hasNext()) {
                ((ep0.c) it.next()).a(this.f411973f, this.f411974g.f302278a, eVar);
            }
            java.util.Iterator it6 = this.f411980p.iterator();
            while (it6.hasNext()) {
                ((ep0.e) it6.next()).a(this.f411973f, this.f411974g.f302278a, eVar != null ? eVar.f364443b : null);
            }
        }
    }

    public final void g(hp0.e resultData) {
        vo0.h hVar;
        ep0.d dVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resultData, "resultData");
        if (!resultData.a()) {
            resultData = null;
        }
        if (resultData == null || (dVar = (hVar = this.f411975h).f520008e) == null) {
            return;
        }
        pm0.v.X(new ap0.f((ap0.g) dVar, hVar.a().f302278a));
    }
}
