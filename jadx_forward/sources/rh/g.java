package rh;

/* loaded from: classes12.dex */
public abstract class g extends rh.a {

    /* renamed from: f, reason: collision with root package name */
    public wh.f2 f476927f;

    /* renamed from: g, reason: collision with root package name */
    public rh.w f476928g;

    /* renamed from: h, reason: collision with root package name */
    public rh.d2 f476929h;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f476923b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f476924c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f476925d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final android.util.SparseArray f476926e = new android.util.SparseArray();

    /* renamed from: i, reason: collision with root package name */
    public int f476930i = 200;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.Runnable f476931j = new rh.b(this);

    @Override // rh.a, rh.e3
    public void c() {
        super.c();
    }

    @Override // rh.a, rh.e3
    public void e() {
        super.e();
        ((java.util.concurrent.ConcurrentHashMap) this.f476924c).clear();
        synchronized (this.f476925d) {
            ((java.util.concurrent.ConcurrentHashMap) this.f476925d).clear();
        }
        synchronized (this.f476923b) {
            ((java.util.ArrayList) this.f476923b).clear();
        }
        synchronized (this.f476926e) {
            this.f476926e.clear();
        }
    }

    @Override // rh.a, rh.e3
    public void h(qh.f0 f0Var) {
        super.h(f0Var);
        this.f476928g = (rh.w) f0Var.i(rh.w.class);
        this.f476929h = (rh.d2) f0Var.i(rh.d2.class);
        this.f476927f = new wh.f2("thread_pool@idle", 0L);
        this.f476930i = java.lang.Math.max(f0Var.f444868d.f444822h, this.f476930i);
    }

    @Override // rh.a
    public java.lang.String i() {
        return "Matrix.battery.AbsTaskMonitorFeature";
    }

    public void k() {
        android.os.Handler handler = this.f476827a.f444870f;
        java.lang.Runnable runnable = this.f476931j;
        handler.removeCallbacks(runnable);
        this.f476827a.f444870f.postDelayed(runnable, 1000L);
    }

    public void l() {
        synchronized (this.f476923b) {
            ((java.util.ArrayList) this.f476923b).clear();
        }
    }

    public rh.f m(java.lang.String str, int i17) {
        rh.f fVar = new rh.f();
        fVar.f476907d = i17;
        fVar.f476908e = str;
        fVar.f476911h = wh.m.d(this.f476827a.d(), this.f476827a.f444876o);
        fVar.f476912i = wh.m.r(this.f476827a.d());
        try {
            java.util.concurrent.Callable callable = this.f476827a.f444868d.f444817c;
            fVar.f476913j = callable == null ? "" : (java.lang.String) callable.call();
        } catch (java.lang.Exception unused) {
            fVar.f476913j = "";
        }
        if (this.f476827a.f444868d.f444834t && i17 == android.os.Process.myTid()) {
            fVar.f476910g = rh.x2.b(java.lang.Long.valueOf(android.os.SystemClock.currentThreadTimeMillis() / 10));
            return fVar;
        }
        int myPid = android.os.Process.myPid();
        wh.t1 e17 = wh.u1.e(myPid, i17);
        if (e17 != null) {
            fVar.f476910g = rh.x2.b(java.lang.Long.valueOf(e17.a()));
            return fVar;
        }
        oj.j.f("Matrix.battery.AbsTaskMonitorFeature", "parse task procStat fail, name = " + str + ", tid = " + i17, new java.lang.Object[0]);
        q(str, myPid, i17);
        return null;
    }

    public java.util.List n(long j17) {
        java.util.ArrayList arrayList;
        synchronized (this.f476923b) {
            if (j17 <= 0) {
                arrayList = new java.util.ArrayList(this.f476923b);
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                long uptimeMillis = android.os.SystemClock.uptimeMillis() - j17;
                java.util.Iterator it = ((java.util.ArrayList) this.f476923b).iterator();
                while (it.hasNext()) {
                    rh.o2 o2Var = (rh.o2) it.next();
                    if (((rh.f) o2Var.f477017a).f476896a >= uptimeMillis) {
                        arrayList2.add(o2Var);
                    }
                }
                arrayList = arrayList2;
            }
        }
        java.util.Collections.sort(arrayList, new rh.c(this));
        return arrayList;
    }

    public wh.i2 o(int i17, long j17, long j18) {
        synchronized (this.f476926e) {
            if (j17 >= 0) {
                try {
                    if (this.f476926e.get(i17) != null) {
                        return wh.j2.a((java.util.List) this.f476926e.get(i17), j17, 10L, new rh.d(this, j18));
                    }
                } catch (java.lang.Throwable th6) {
                    throw th6;
                }
            }
            wh.i2 i2Var = new wh.i2();
            i2Var.f527337c = false;
            return i2Var;
        }
    }

    public java.util.ArrayList p(int i17) {
        synchronized (this.f476926e) {
            java.util.List list = (java.util.List) this.f476926e.get(i17);
            if (list == null) {
                return null;
            }
            return new java.util.ArrayList(list);
        }
    }

    public void q(java.lang.String str, int i17, int i18) {
    }

    public void r(int i17, java.lang.String str, long j17) {
        synchronized (this.f476926e) {
            java.util.List list = (java.util.List) this.f476926e.get(i17);
            java.util.List list2 = list;
            if (list == null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(0, this.f476927f);
                this.f476926e.put(i17, arrayList);
                list2 = arrayList;
            }
            list2.add(0, new wh.f2(str, j17));
        }
        k();
    }

    public void s(java.util.List list) {
    }

    public boolean t(rh.o2 o2Var) {
        return o2Var.f477020d > 1000 && ((java.lang.Long) ((rh.f) o2Var.f477019c).f476910g.f477085a).longValue() / java.lang.Math.max(1L, o2Var.f477020d / 60000) > 100;
    }

    public void u(rh.f fVar, rh.f fVar2) {
        long j17;
        if (fVar2.f476907d != fVar.f476907d) {
            oj.j.f("Matrix.battery.AbsTaskMonitorFeature", "task tid mismatch: " + fVar + " vs " + fVar2, new java.lang.Object[0]);
            return;
        }
        if (!fVar2.f476908e.equals(fVar.f476908e)) {
            oj.j.f("Matrix.battery.AbsTaskMonitorFeature", "task name mismatch: " + fVar + " vs " + fVar2, new java.lang.Object[0]);
            return;
        }
        rh.e eVar = new rh.e(fVar2, fVar, fVar2);
        if (t(eVar)) {
            rh.d3 d3Var = eVar.f477019c;
            java.lang.String str = ((rh.f) d3Var).f476908e;
            java.lang.Number number = ((rh.f) d3Var).f476910g.f477085a;
            long j18 = eVar.f477020d;
            oj.j.c("Matrix.battery.AbsTaskMonitorFeature", "onTaskReport: %s, jiffies = %s, millis = %s", str, number, java.lang.Long.valueOf(j18));
            rh.w wVar = this.f476928g;
            if (wVar != null) {
                rh.v k17 = wVar.k(j18);
                if (!k17.f476898c) {
                    fVar2.f476898c = false;
                    ((rh.f) d3Var).f476898c = false;
                }
                java.lang.String str2 = ((rh.f) d3Var).f476913j;
                wh.h2 b17 = this.f476928g.l(j18).b();
                if (b17 != null) {
                    j17 = b17.f527330b;
                    str2 = b17.f527329a;
                } else {
                    j17 = 100;
                }
                ((rh.f) d3Var).f476915l = ((java.lang.Long) k17.f477053f.f477085a).longValue();
                ((rh.f) d3Var).f476913j = str2;
                ((rh.f) d3Var).f476917n = j17;
            }
            rh.d2 d2Var = this.f476929h;
            if (d2Var != null) {
                rh.a2 m17 = d2Var.m(j18);
                if (!m17.f476898c) {
                    fVar2.f476898c = false;
                    ((rh.f) d3Var).f476898c = false;
                }
                ((rh.f) d3Var).f476916m = ((java.lang.Long) m17.f476833e.f477085a).longValue();
            }
            v(eVar);
            java.util.List list = this.f476923b;
            if (((java.util.ArrayList) list).size() >= this.f476930i) {
                oj.j.f("Matrix.battery.AbsTaskMonitorFeature", "task list overheat, size = " + ((java.util.ArrayList) list).size(), new java.lang.Object[0]);
                k();
            }
        }
    }

    public void v(rh.o2 o2Var) {
        synchronized (this.f476923b) {
            java.util.Iterator it = ((java.util.ArrayList) this.f476923b).iterator();
            while (it.hasNext()) {
                rh.o2 o2Var2 = (rh.o2) it.next();
                if (((rh.f) o2Var2.f477019c).f476908e.equals(((rh.f) o2Var.f477019c).f476908e)) {
                    rh.d3 d3Var = o2Var2.f477019c;
                    if (((rh.f) d3Var).f476907d == ((rh.f) o2Var.f477019c).f476907d && !((rh.f) d3Var).f476914k) {
                        it.remove();
                    }
                }
            }
            ((java.util.ArrayList) this.f476923b).add(o2Var);
        }
    }
}
