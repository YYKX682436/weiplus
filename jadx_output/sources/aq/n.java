package aq;

/* loaded from: classes14.dex */
public final class n {

    /* renamed from: c, reason: collision with root package name */
    public int f12908c;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f12910e;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.lifecycle.j0 f12912g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.lifecycle.g0 f12913h;

    /* renamed from: i, reason: collision with root package name */
    public kotlinx.coroutines.flow.i2 f12914i;

    /* renamed from: j, reason: collision with root package name */
    public kotlinx.coroutines.flow.i2 f12915j;

    /* renamed from: a, reason: collision with root package name */
    public volatile aq.b f12906a = aq.b.f12835d;

    /* renamed from: b, reason: collision with root package name */
    public volatile fn5.p0 f12907b = fn5.p0.f264747d;

    /* renamed from: d, reason: collision with root package name */
    public int f12909d = -2;

    /* renamed from: f, reason: collision with root package name */
    public final o75.a f12911f = new aq.e(this);

    public n() {
        androidx.lifecycle.j0 j0Var = new androidx.lifecycle.j0(aq.c.f12842d);
        this.f12912g = j0Var;
        this.f12913h = j0Var;
    }

    public final void a(androidx.appcompat.app.AppCompatActivity activity) {
        androidx.lifecycle.c1 a17;
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f12908c = 0;
        this.f12909d = -2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addClsDbObserver >> dataType: ");
        sb6.append(this.f12906a);
        sb6.append(", currentIdentifyType: ");
        aq.r0 r0Var = aq.r0.f12940a;
        sb6.append(aq.r0.f12953n);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageDataManager", sb6.toString());
        if (this.f12906a == aq.b.f12836e || aq.r0.f12953n == aq.c.f12845g) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageDataManager", "go to addClsDbObserver");
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(com.tencent.mm.storage.n8.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(com.tencent.mm.storage.n8.class);
        }
        ((com.tencent.mm.storage.h3) ((com.tencent.mm.storage.n8) a17).P6(com.tencent.mm.storage.h3.class)).Q6(activity, this.f12911f);
    }

    public final void b(o75.c cVar) {
        java.util.HashMap hashMap;
        androidx.lifecycle.c1 a17;
        o75.b bVar = cVar.f343587a;
        o75.b bVar2 = o75.b.f343581b;
        if (kotlin.jvm.internal.o.b(bVar, o75.b.f343582c)) {
            com.tencent.mm.storage.g3 g3Var = (com.tencent.mm.storage.g3) cVar.f343590d;
            if (g3Var != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ImageDataManager", "observe insert cls >> labelId: " + g3Var.field_label_id + ", cropLabelId: " + g3Var.field_crop_label_id);
                return;
            }
            return;
        }
        if (!kotlin.jvm.internal.o.b(bVar, o75.b.f343583d)) {
            if (kotlin.jvm.internal.o.b(bVar, o75.b.f343584e)) {
                return;
            } else {
                if (!kotlin.jvm.internal.o.b(bVar, o75.b.f343585f) || (hashMap = cVar.f343591e) == null) {
                    return;
                }
                java.util.Iterator it = hashMap.entrySet().iterator();
                while (it.hasNext()) {
                    b((o75.c) ((java.util.Map.Entry) it.next()).getValue());
                }
                return;
            }
        }
        if (((com.tencent.mm.storage.g3) cVar.f343590d) != null) {
            java.lang.String str = aq.o.f12921b;
            synchronized (jm0.k.f300270i) {
                gm0.j1.b().c();
                if (!jm0.k.class.isAssignableFrom(com.tencent.mm.storage.n8.class)) {
                    throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
                a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(com.tencent.mm.storage.n8.class);
            }
            java.util.List Y6 = ((com.tencent.mm.storage.h3) ((com.tencent.mm.storage.n8) a17).P6(com.tencent.mm.storage.h3.class)).Y6(str, "0", 0, 1);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isExitNoRecImage >> ");
            sb6.append(str);
            sb6.append(' ');
            java.util.ArrayList arrayList = (java.util.ArrayList) Y6;
            sb6.append(!arrayList.isEmpty());
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryStorage", sb6.toString());
            pm0.v.X(new aq.k(this, !arrayList.isEmpty()));
        }
    }

    public final java.lang.Object c(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, kotlin.coroutines.Continuation continuation) {
        boolean z17 = this.f12910e;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageDataManager", "startIdentify >> isDoingWork");
            return f0Var;
        }
        this.f12910e = true;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        f65.p.f259935b = currentTimeMillis;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryConsumeTimeReporter", "setStartTimeStamp >> " + currentTimeMillis);
        f65.m.f259897b = currentTimeMillis;
        f65.p.f259950q = (long) 2;
        f65.p.f259939f = arrayList.size();
        f65.p.f259940g = arrayList2.size();
        if (arrayList.isEmpty() && arrayList2.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageDataManager", "startIdentifyWithNoRecData >> no new image need to rec");
            this.f12906a = aq.b.f12836e;
            this.f12912g.postValue(aq.c.f12845g);
            f65.p.f259934a.a(6, 0, 0L);
            return f0Var;
        }
        this.f12906a = aq.b.f12837f;
        this.f12912g.postValue(aq.c.f12843e);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageDataManager", "startIdentifyWithNoRecData >> data: " + arrayList.size() + " oldNoRecData: " + arrayList2.size() + ", " + java.lang.Thread.currentThread());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.storage.s8.f195314a.c((com.tencent.mm.api.QueryImageData) it.next(), aq.o.f12921b);
        }
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new aq.l(arrayList, arrayList2, null), continuation);
        return g17 == pz5.a.f359186d ? g17 : f0Var;
    }

    public final void d() {
        androidx.lifecycle.c1 a17;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageDataManager", "stopCurrentRoomIdentify");
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(com.tencent.mm.storage.n8.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(com.tencent.mm.storage.n8.class);
        }
        com.tencent.mm.storage.h3 h3Var = (com.tencent.mm.storage.h3) ((com.tencent.mm.storage.n8) a17).P6(com.tencent.mm.storage.h3.class);
        if (h3Var.P6().hasObserver()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageDataManager", "removeClsDbObserver");
            o75.a observer = this.f12911f;
            kotlin.jvm.internal.o.g(observer, "observer");
            h3Var.P6().removeObserver(observer);
        }
        this.f12914i = null;
        this.f12915j = null;
    }
}
