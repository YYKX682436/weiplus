package p05;

/* loaded from: classes14.dex */
public final class e1 implements p05.t0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f432036a;

    /* renamed from: b, reason: collision with root package name */
    public rh0.d0 f432037b;

    /* renamed from: c, reason: collision with root package name */
    public long f432038c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f432039d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f432040e = new java.util.ArrayList();

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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLiveElementEffect", sb6.toString());
        if (this.f432036a && d0Var != null && ((p05.l4) d0Var).f432126f != this.f432038c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLiveElementEffect", "Cannot attach twice!");
            return;
        }
        rh0.d0 d0Var2 = this.f432037b;
        if (d0Var2 != null) {
            ((p05.l4) d0Var2).u(this);
        }
        this.f432037b = d0Var;
        if (d0Var != null) {
            ((p05.l4) d0Var).f(this);
        }
        if (d0Var == null) {
            c(kz5.p0.f395529d);
            this.f432038c = 0L;
            this.f432036a = false;
        } else {
            long j17 = ((p05.l4) d0Var).f432126f;
            this.f432038c = j17;
            if (j17 == 0) {
                return;
            }
            this.f432036a = true;
        }
    }

    public final void c(java.util.List list) {
        java.util.List list2 = this.f432039d;
        ((java.util.ArrayList) list2).clear();
        ((java.util.ArrayList) list2).addAll(list);
        if (!this.f432036a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLiveElementEffect", "This effect is not attached!");
        }
        if (this.f432036a) {
            java.util.ArrayList arrayList = this.f432040e;
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83740xed30d0c0(this.f432038c, ((java.lang.Number) ((jz5.o) it.next()).f384374d).longValue());
            }
            arrayList.clear();
            java.util.Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                jz5.l lVar = (jz5.l) it6.next();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLiveElementEffect", "#changeInner path=" + ((java.lang.String) lVar.f384367e));
                long j17 = this.f432038c;
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
