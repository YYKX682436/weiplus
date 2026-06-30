package p05;

/* loaded from: classes14.dex */
public final class f1 implements p05.u0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f432048a;

    /* renamed from: b, reason: collision with root package name */
    public rh0.d0 f432049b;

    /* renamed from: c, reason: collision with root package name */
    public long f432050c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f432051d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f432052e = new java.util.ArrayList();

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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenEffect", sb6.toString());
        if (this.f432048a && d0Var != null && ((p05.l4) d0Var).f432126f != this.f432050c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenEffect", "Cannot attach twice!");
            return;
        }
        rh0.d0 d0Var2 = this.f432049b;
        if (d0Var2 != null) {
            ((p05.l4) d0Var2).u(this);
        }
        this.f432049b = d0Var;
        if (d0Var != null) {
            ((p05.l4) d0Var).f(this);
        }
        if (d0Var == null) {
            c(kz5.p0.f395529d);
            this.f432050c = 0L;
            this.f432048a = false;
        } else {
            long j17 = ((p05.l4) d0Var).f432126f;
            this.f432050c = j17;
            if (j17 == 0) {
                return;
            }
            this.f432048a = true;
        }
    }

    public final void c(java.util.List list) {
        java.util.List list2 = this.f432051d;
        ((java.util.ArrayList) list2).clear();
        ((java.util.ArrayList) list2).addAll(list);
        if (!this.f432048a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenEffect", "This effect is not attached!");
        }
        if (this.f432048a) {
            java.util.ArrayList arrayList = this.f432052e;
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83740xed30d0c0(this.f432050c, ((java.lang.Number) ((jz5.o) it.next()).f384374d).longValue());
            }
            arrayList.clear();
            java.util.Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                jz5.l lVar = (jz5.l) it6.next();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenEffect", "#changeInner " + ((java.lang.String) lVar.f384367e));
                long j17 = this.f432050c;
                java.lang.Object obj = lVar.f384367e;
                long[] m83718x62437256 = com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83718x62437256(j17, (java.lang.String) obj);
                if (m83718x62437256 != null) {
                    for (long j18 : m83718x62437256) {
                        arrayList.add(new jz5.o(java.lang.Long.valueOf(j18), lVar.f384366d, obj));
                    }
                }
            }
        }
    }
}
