package androidx.lifecycle;

/* loaded from: classes13.dex */
public class b0 extends androidx.lifecycle.o {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f11606d;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f11611i;

    /* renamed from: b, reason: collision with root package name */
    public final q.a f11604b = new q.a();

    /* renamed from: e, reason: collision with root package name */
    public int f11607e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11608f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11609g = false;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f11610h = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public androidx.lifecycle.n f11605c = androidx.lifecycle.n.INITIALIZED;

    public b0(androidx.lifecycle.y yVar, boolean z17) {
        this.f11606d = new java.lang.ref.WeakReference(yVar);
        this.f11611i = z17;
    }

    @Override // androidx.lifecycle.o
    public void a(androidx.lifecycle.x xVar) {
        androidx.lifecycle.y yVar;
        e("addObserver");
        androidx.lifecycle.n nVar = this.f11605c;
        androidx.lifecycle.n nVar2 = androidx.lifecycle.n.DESTROYED;
        if (nVar != nVar2) {
            nVar2 = androidx.lifecycle.n.INITIALIZED;
        }
        androidx.lifecycle.a0 a0Var = new androidx.lifecycle.a0(xVar, nVar2);
        q.a aVar = this.f11604b;
        if (((androidx.lifecycle.a0) aVar.e(xVar, a0Var)) == null && (yVar = (androidx.lifecycle.y) this.f11606d.get()) != null) {
            boolean z17 = this.f11607e != 0 || this.f11608f;
            androidx.lifecycle.n d17 = d(xVar);
            this.f11607e++;
            while (a0Var.f11598a.compareTo(d17) < 0 && aVar.f359201h.containsKey(xVar)) {
                androidx.lifecycle.n nVar3 = a0Var.f11598a;
                java.util.ArrayList arrayList = this.f11610h;
                arrayList.add(nVar3);
                int i17 = androidx.lifecycle.l.f11634a[a0Var.f11598a.ordinal()];
                androidx.lifecycle.m mVar = i17 != 1 ? i17 != 2 ? i17 != 5 ? null : androidx.lifecycle.m.ON_CREATE : androidx.lifecycle.m.ON_RESUME : androidx.lifecycle.m.ON_START;
                if (mVar == null) {
                    throw new java.lang.IllegalStateException("no event up from " + a0Var.f11598a);
                }
                a0Var.a(yVar, mVar);
                arrayList.remove(arrayList.size() - 1);
                d17 = d(xVar);
            }
            if (!z17) {
                j();
            }
            this.f11607e--;
        }
    }

    @Override // androidx.lifecycle.o
    public androidx.lifecycle.n b() {
        return this.f11605c;
    }

    @Override // androidx.lifecycle.o
    public void c(androidx.lifecycle.x xVar) {
        e("removeObserver");
        this.f11604b.g(xVar);
    }

    public final androidx.lifecycle.n d(androidx.lifecycle.x xVar) {
        q.a aVar = this.f11604b;
        q.d dVar = aVar.f359201h.containsKey(xVar) ? ((q.d) aVar.f359201h.get(xVar)).f359205g : null;
        androidx.lifecycle.n nVar = dVar != null ? ((androidx.lifecycle.a0) dVar.f359203e).f11598a : null;
        java.util.ArrayList arrayList = this.f11610h;
        androidx.lifecycle.n nVar2 = arrayList.isEmpty() ? null : (androidx.lifecycle.n) arrayList.get(arrayList.size() - 1);
        androidx.lifecycle.n nVar3 = this.f11605c;
        if (nVar == null || nVar.compareTo(nVar3) >= 0) {
            nVar = nVar3;
        }
        return (nVar2 == null || nVar2.compareTo(nVar) >= 0) ? nVar : nVar2;
    }

    public final void e(java.lang.String str) {
        if (this.f11611i) {
            ((p.d) p.b.a().f350335a).getClass();
            if (android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread()) {
                return;
            }
            throw new java.lang.IllegalStateException("Method " + str + " must be called on the main thread");
        }
    }

    public void f(androidx.lifecycle.m mVar) {
        e("handleLifecycleEvent");
        h(mVar.h());
    }

    public void g(androidx.lifecycle.n nVar) {
        e("markState");
        i(nVar);
    }

    public final void h(androidx.lifecycle.n nVar) {
        if (this.f11605c == nVar) {
            return;
        }
        this.f11605c = nVar;
        if (this.f11608f || this.f11607e != 0) {
            this.f11609g = true;
            return;
        }
        this.f11608f = true;
        j();
        this.f11608f = false;
    }

    public void i(androidx.lifecycle.n nVar) {
        e("setCurrentState");
        h(nVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.b0.j():void");
    }
}
