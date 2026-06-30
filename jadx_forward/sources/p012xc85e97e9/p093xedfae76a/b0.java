package p012xc85e97e9.p093xedfae76a;

/* loaded from: classes13.dex */
public class b0 extends p012xc85e97e9.p093xedfae76a.o {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f93139d;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f93144i;

    /* renamed from: b, reason: collision with root package name */
    public final q.a f93137b = new q.a();

    /* renamed from: e, reason: collision with root package name */
    public int f93140e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f93141f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f93142g = false;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f93143h = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public p012xc85e97e9.p093xedfae76a.n f93138c = p012xc85e97e9.p093xedfae76a.n.INITIALIZED;

    public b0(p012xc85e97e9.p093xedfae76a.y yVar, boolean z17) {
        this.f93139d = new java.lang.ref.WeakReference(yVar);
        this.f93144i = z17;
    }

    @Override // p012xc85e97e9.p093xedfae76a.o
    public void a(p012xc85e97e9.p093xedfae76a.x xVar) {
        p012xc85e97e9.p093xedfae76a.y yVar;
        e("addObserver");
        p012xc85e97e9.p093xedfae76a.n nVar = this.f93138c;
        p012xc85e97e9.p093xedfae76a.n nVar2 = p012xc85e97e9.p093xedfae76a.n.DESTROYED;
        if (nVar != nVar2) {
            nVar2 = p012xc85e97e9.p093xedfae76a.n.INITIALIZED;
        }
        p012xc85e97e9.p093xedfae76a.a0 a0Var = new p012xc85e97e9.p093xedfae76a.a0(xVar, nVar2);
        q.a aVar = this.f93137b;
        if (((p012xc85e97e9.p093xedfae76a.a0) aVar.e(xVar, a0Var)) == null && (yVar = (p012xc85e97e9.p093xedfae76a.y) this.f93139d.get()) != null) {
            boolean z17 = this.f93140e != 0 || this.f93141f;
            p012xc85e97e9.p093xedfae76a.n d17 = d(xVar);
            this.f93140e++;
            while (a0Var.f93131a.compareTo(d17) < 0 && aVar.f440734h.containsKey(xVar)) {
                p012xc85e97e9.p093xedfae76a.n nVar3 = a0Var.f93131a;
                java.util.ArrayList arrayList = this.f93143h;
                arrayList.add(nVar3);
                int i17 = p012xc85e97e9.p093xedfae76a.l.f93167a[a0Var.f93131a.ordinal()];
                p012xc85e97e9.p093xedfae76a.m mVar = i17 != 1 ? i17 != 2 ? i17 != 5 ? null : p012xc85e97e9.p093xedfae76a.m.ON_CREATE : p012xc85e97e9.p093xedfae76a.m.ON_RESUME : p012xc85e97e9.p093xedfae76a.m.ON_START;
                if (mVar == null) {
                    throw new java.lang.IllegalStateException("no event up from " + a0Var.f93131a);
                }
                a0Var.a(yVar, mVar);
                arrayList.remove(arrayList.size() - 1);
                d17 = d(xVar);
            }
            if (!z17) {
                j();
            }
            this.f93140e--;
        }
    }

    @Override // p012xc85e97e9.p093xedfae76a.o
    public p012xc85e97e9.p093xedfae76a.n b() {
        return this.f93138c;
    }

    @Override // p012xc85e97e9.p093xedfae76a.o
    public void c(p012xc85e97e9.p093xedfae76a.x xVar) {
        e("removeObserver");
        this.f93137b.g(xVar);
    }

    public final p012xc85e97e9.p093xedfae76a.n d(p012xc85e97e9.p093xedfae76a.x xVar) {
        q.a aVar = this.f93137b;
        q.d dVar = aVar.f440734h.containsKey(xVar) ? ((q.d) aVar.f440734h.get(xVar)).f440738g : null;
        p012xc85e97e9.p093xedfae76a.n nVar = dVar != null ? ((p012xc85e97e9.p093xedfae76a.a0) dVar.f440736e).f93131a : null;
        java.util.ArrayList arrayList = this.f93143h;
        p012xc85e97e9.p093xedfae76a.n nVar2 = arrayList.isEmpty() ? null : (p012xc85e97e9.p093xedfae76a.n) arrayList.get(arrayList.size() - 1);
        p012xc85e97e9.p093xedfae76a.n nVar3 = this.f93138c;
        if (nVar == null || nVar.compareTo(nVar3) >= 0) {
            nVar = nVar3;
        }
        return (nVar2 == null || nVar2.compareTo(nVar) >= 0) ? nVar : nVar2;
    }

    public final void e(java.lang.String str) {
        if (this.f93144i) {
            ((p.d) p.b.a().f431868a).getClass();
            if (android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread()) {
                return;
            }
            throw new java.lang.IllegalStateException("Method " + str + " must be called on the main thread");
        }
    }

    public void f(p012xc85e97e9.p093xedfae76a.m mVar) {
        e("handleLifecycleEvent");
        h(mVar.h());
    }

    public void g(p012xc85e97e9.p093xedfae76a.n nVar) {
        e("markState");
        i(nVar);
    }

    public final void h(p012xc85e97e9.p093xedfae76a.n nVar) {
        if (this.f93138c == nVar) {
            return;
        }
        this.f93138c = nVar;
        if (this.f93141f || this.f93140e != 0) {
            this.f93142g = true;
            return;
        }
        this.f93141f = true;
        j();
        this.f93141f = false;
    }

    public void i(p012xc85e97e9.p093xedfae76a.n nVar) {
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
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p093xedfae76a.b0.j():void");
    }
}
