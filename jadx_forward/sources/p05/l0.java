package p05;

/* loaded from: classes3.dex */
public final class l0 implements p05.q0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f432108a;

    /* renamed from: b, reason: collision with root package name */
    public rh0.d0 f432109b;

    /* renamed from: c, reason: collision with root package name */
    public long f432110c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f432111d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f432112e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public long f432113f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.a f432114g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f432115h;

    @Override // p05.e2
    public int a() {
        return 0;
    }

    @Override // p05.e2
    public void b(rh0.d0 d0Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("attach WeVision=");
        if (tq5.i.f502802a == 0) {
            tq5.i.f502802a = 2014500;
        }
        sb6.append(tq5.i.f502802a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveGestureRenderEffect", sb6.toString());
        if (this.f432108a && d0Var != null && ((p05.l4) d0Var).f432126f != this.f432110c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveGestureRenderEffect", "Cannot attach twice!");
            return;
        }
        rh0.d0 d0Var2 = this.f432109b;
        if (d0Var2 != null) {
            ((p05.l4) d0Var2).u(this);
        }
        this.f432109b = d0Var;
        if (d0Var != null) {
            ((p05.l4) d0Var).f(this);
        }
        if (d0Var != null) {
            long j17 = ((p05.l4) d0Var).f432126f;
            this.f432110c = j17;
            if (j17 == 0) {
                return;
            }
            this.f432108a = true;
            return;
        }
        c(kz5.p0.f395529d, null, null);
        long j18 = this.f432113f;
        if (j18 != 0) {
            rh0.d0 d0Var3 = this.f432109b;
            if (d0Var3 != null) {
                ((p05.l4) d0Var3).z(j18, null);
            }
            this.f432113f = 0L;
        }
        this.f432110c = 0L;
        this.f432108a = false;
    }

    public final void c(java.util.List list, yz5.a aVar, yz5.a aVar2) {
        this.f432114g = aVar;
        this.f432115h = aVar2;
        java.util.List list2 = this.f432111d;
        ((java.util.ArrayList) list2).clear();
        ((java.util.ArrayList) list2).addAll(list);
        if (!this.f432108a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveGestureRenderEffect", "This effect is not attached!");
        }
        if (this.f432108a) {
            java.util.ArrayList<jz5.o> arrayList = this.f432112e;
            for (jz5.o oVar : arrayList) {
                rh0.d0 d0Var = this.f432109b;
                if (d0Var != null) {
                    ((p05.l4) d0Var).t(((java.lang.Number) oVar.f384374d).longValue());
                }
            }
            arrayList.clear();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                jz5.l lVar = (jz5.l) it.next();
                rh0.d0 d0Var2 = this.f432109b;
                java.lang.Long valueOf = d0Var2 != null ? java.lang.Long.valueOf(((p05.l4) d0Var2).d((java.lang.String) lVar.f384367e)) : null;
                if (valueOf != null && valueOf.longValue() != -1) {
                    arrayList.add(new jz5.o(valueOf, lVar.f384366d, lVar.f384367e));
                }
            }
        }
    }

    public boolean d(int i17) {
        java.lang.Object obj;
        java.util.Iterator it = this.f432112e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((java.lang.Number) ((jz5.o) obj).f384374d).longValue() == ((long) i17)) {
                break;
            }
        }
        return obj != null;
    }
}
