package g40;

/* loaded from: classes12.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public h40.b f350226a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f350227b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p947xba6de98f.c1 f350228c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f350229d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f350230e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f350231f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f350232g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f350233h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 f350234i;

    public l(h40.b downloadFromScene, java.lang.String dataId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downloadFromScene, "downloadFromScene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataId, "dataId");
        this.f350226a = downloadFromScene;
        this.f350227b = dataId;
        this.f350228c = new g40.i(this);
        this.f350229d = new java.util.ArrayList();
    }

    public final void a(i40.a aVar) {
        if (aVar != null) {
            java.util.ArrayList arrayList = this.f350229d;
            boolean z17 = false;
            if (!(arrayList instanceof java.util.Collection) || !arrayList.isEmpty()) {
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((java.lang.ref.WeakReference) it.next()).get(), aVar)) {
                        z17 = true;
                        break;
                    }
                }
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileRecordMsgDownloadHelper", "callback: isExist");
            } else {
                arrayList.add(new java.lang.ref.WeakReference(aVar));
            }
        }
    }

    public final r45.gp0 b(java.util.LinkedList linkedList, java.lang.String str) {
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.gp0 gp0Var = (r45.gp0) it.next();
            if (gp0Var.I == 17) {
                java.util.LinkedList dataList = gp0Var.f456984y2.f452497f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(dataList, "dataList");
                r45.gp0 b17 = b(dataList, str);
                if (b17 != null) {
                    return b17;
                }
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gp0Var.T, str)) {
                return gp0Var;
            }
        }
        return null;
    }

    public final void c() {
        this.f350230e = false;
        java.util.ArrayList arrayList = this.f350229d;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i40.a aVar = (i40.a) ((java.lang.ref.WeakReference) it.next()).get();
            if (aVar != null) {
                aVar.e();
            }
        }
        kz5.h0.B(arrayList, g40.k.f350225d);
        f();
    }

    public final void d(int i17, int i18, java.lang.String errMsg, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        this.f350230e = false;
        java.util.ArrayList arrayList = this.f350229d;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i40.a aVar = (i40.a) ((java.lang.ref.WeakReference) it.next()).get();
            if (aVar != null) {
                aVar.d(i17, i18, errMsg, z17);
            }
        }
        kz5.h0.B(arrayList, g40.k.f350225d);
        f();
    }

    public final void e(long j17, long j18) {
        java.util.ArrayList arrayList = this.f350229d;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i40.a aVar = (i40.a) ((java.lang.ref.WeakReference) it.next()).get();
            if (aVar != null) {
                aVar.a(j17, j18);
            }
        }
        kz5.h0.B(arrayList, g40.k.f350225d);
    }

    public final void f() {
        java.lang.String str;
        g40.l lVar;
        ((rx.j) ((sx.c0) i95.n0.c(sx.c0.class))).Bi(this.f350228c);
        if (((d40.q) i95.n0.c(d40.q.class)) != null && (str = this.f350232g) != null) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f40.i.f340963i.a().f340966h;
            if (concurrentHashMap.containsKey(str) && (lVar = (g40.l) concurrentHashMap.get(str)) != null) {
                lVar.f350229d.clear();
            }
            concurrentHashMap.remove(str);
        }
        this.f350230e = false;
    }
}
