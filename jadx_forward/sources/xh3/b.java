package xh3;

/* loaded from: classes12.dex */
public abstract class b implements java.lang.Runnable {

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f536100n = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: d, reason: collision with root package name */
    public final rh3.p f536101d;

    /* renamed from: e, reason: collision with root package name */
    public final wh3.d f536102e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f536103f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f536104g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f536105h;

    /* renamed from: i, reason: collision with root package name */
    public xh3.a f536106i;

    /* renamed from: m, reason: collision with root package name */
    public final qh3.a f536107m;

    static {
        new java.util.concurrent.atomic.AtomicInteger(0);
    }

    public b(rh3.p onePlayContext, wh3.d mediaSource) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onePlayContext, "onePlayContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaSource, "mediaSource");
        this.f536101d = onePlayContext;
        this.f536102e = mediaSource;
        this.f536103f = "AbsMMMarsDownloaderTask";
        java.lang.String str2 = mediaSource.f527498a;
        this.f536104g = str2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str2);
        sb6.append('_');
        if (this instanceof yh3.d) {
            str = "mmdownload_" + f536100n.getAndIncrement();
        } else {
            str = com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
        }
        sb6.append(str);
        this.f536105h = sb6.toString();
        this.f536106i = xh3.a.f536093d;
        this.f536107m = ((rh3.q) onePlayContext).e();
    }

    public final void a(xh3.a toState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toState, "toState");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b(), "changeTaskState from " + this.f536106i + " to " + toState);
        this.f536106i = toState;
    }

    public java.lang.String b() {
        return ((rh3.q) this.f536101d).f(this.f536103f);
    }

    public final boolean c() {
        yh3.c cVar;
        boolean z17 = false;
        if (this.f536106i == xh3.a.f536095f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(b(), "startDownload return for state:" + this.f536106i);
            return false;
        }
        if (this.f536107m.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(b(), "startDownload return for cacheCompete");
            return false;
        }
        dn.o oVar = this.f536102e.f527505c;
        if (oVar.f69591xf9dbbe9c == null) {
            oVar.f69591xf9dbbe9c = "";
        }
        if (oVar.f69575xf11df5f5 == null) {
            oVar.f69575xf11df5f5 = "";
        }
        oVar.f323319e = false;
        yh3.d dVar = (yh3.d) this;
        rh3.p pVar = dVar.f536101d;
        if (((xh3.h) pVar.c()).e(dVar)) {
            oVar.f323348c2 = dVar;
            dVar.f543938s = pVar.a();
            java.util.List c17 = ((xh3.h) pVar.c()).c(dVar.f536104g);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) c17).iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                if (true ^ p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((xh3.b) next).f536105h, dVar.f536105h)) {
                    arrayList.add(next);
                }
            }
            boolean z18 = !arrayList.isEmpty();
            wh3.d dVar2 = dVar.f536102e;
            rh3.f fVar = dVar.f543934o;
            if (z18) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    java.lang.Object next2 = it6.next();
                    if (next2 instanceof yh3.d) {
                        arrayList2.add(next2);
                    }
                }
                yh3.d dVar3 = (yh3.d) kz5.n0.X(arrayList2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(dVar.b(), "syncDownloadTaskState source:" + dVar + " x[isMoovReady:" + dVar.f543936q + " taskState:" + dVar.f536106i + "] to target:" + dVar3 + " x[isMoovReady:" + dVar3.f543936q + " taskState:" + dVar3.f536106i + ']');
                boolean z19 = dVar3.f543936q;
                if (z19 && !dVar.f543936q && (cVar = dVar3.f543937r) != null) {
                    dVar.f543937r = cVar;
                }
                dVar.f543936q = z19;
                xh3.a aVar = dVar3.f536106i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar, "<set-?>");
                dVar.f536106i = aVar;
                dVar.f543935p = dVar3.f543935p;
                if (dVar.f543937r != null) {
                    java.lang.String b17 = dVar.b();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onMoovReady rePlay offset=");
                    yh3.c cVar2 = dVar.f543937r;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar2);
                    sb6.append(cVar2.f543932a);
                    sb6.append(" length=");
                    yh3.c cVar3 = dVar.f543937r;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar3);
                    sb6.append(cVar3.f543933b);
                    sb6.append(' ');
                    sb6.append(dVar);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b17, sb6.toString());
                    if (fVar != null) {
                        yh3.c cVar4 = dVar.f543937r;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar4);
                        int i17 = (int) cVar4.f543932a;
                        yh3.c cVar5 = dVar.f543937r;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar5);
                        fVar.f(dVar2, i17, (int) cVar5.f543933b, false);
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(dVar.b(), "startDownloadInternal sync task:" + dVar + " list:" + arrayList);
            } else {
                yh3.b bVar = dVar.f543938s;
                int d17 = bVar != null ? bVar.d(oVar, oVar.H1) : -111;
                if (d17 == -21006) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(dVar.b(), "startDownloadInternal duplicate download ret:" + d17 + " task:" + oVar);
                    dVar.d();
                    yh3.b bVar2 = dVar.f543938s;
                    d17 = bVar2 != null ? bVar2.d(oVar, oVar.H1) : -1111;
                    ((xh3.h) pVar.c()).e(dVar);
                }
                if (d17 != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(dVar.b(), "startDownloadInternal failed ret:" + d17 + " task:" + oVar);
                }
            }
            if (fVar != null) {
                fVar.k(dVar2);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(dVar.b(), "startDownloadInternal success task:" + oVar);
            z17 = true;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(dVar.b(), "startDownloadInternal failed for submitTask task:" + oVar);
        }
        if (z17) {
            a(xh3.a.f536095f);
        } else {
            a(xh3.a.f536098i);
        }
        return z17;
    }

    /* renamed from: toString */
    public java.lang.String m175559x9616526c() {
        return ((rh3.q) this.f536101d).f(this.f536103f) + '.' + this.f536105h;
    }
}
