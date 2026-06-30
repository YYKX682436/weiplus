package p05;

/* loaded from: classes3.dex */
public final class j0 implements p05.p0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f432086a;

    /* renamed from: b, reason: collision with root package name */
    public rh0.d0 f432087b;

    /* renamed from: c, reason: collision with root package name */
    public long f432088c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f432089d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f432090e = new java.util.ArrayList();

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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveGestureIdentificationEffect", sb6.toString());
        if (this.f432086a && d0Var != null && ((p05.l4) d0Var).f432126f != this.f432088c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveGestureIdentificationEffect", "Cannot attach twice!");
            return;
        }
        rh0.d0 d0Var2 = this.f432087b;
        if (d0Var2 != null) {
            ((p05.l4) d0Var2).u(this);
        }
        this.f432087b = d0Var;
        if (d0Var != null) {
            ((p05.l4) d0Var).f(this);
        }
        if (d0Var == null) {
            c(kz5.p0.f395529d);
            this.f432088c = 0L;
            this.f432086a = false;
        } else {
            long j17 = ((p05.l4) d0Var).f432126f;
            this.f432088c = j17;
            if (j17 == 0) {
                return;
            }
            this.f432086a = true;
        }
    }

    public final void c(java.util.List list) {
        java.util.List list2 = this.f432089d;
        ((java.util.ArrayList) list2).clear();
        ((java.util.ArrayList) list2).addAll(list);
        if (!this.f432086a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveGestureIdentificationEffect", "This effect is not attached!");
        }
        if (this.f432086a) {
            java.util.ArrayList<jz5.o> arrayList = this.f432090e;
            for (jz5.o oVar : arrayList) {
                rh0.d0 d0Var = this.f432087b;
                if (d0Var != null) {
                    ((p05.l4) d0Var).t(((java.lang.Number) oVar.f384374d).longValue());
                }
            }
            arrayList.clear();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                jz5.l lVar = (jz5.l) it.next();
                rh0.d0 d0Var2 = this.f432087b;
                java.lang.Long valueOf = d0Var2 != null ? java.lang.Long.valueOf(((p05.l4) d0Var2).d((java.lang.String) lVar.f384367e)) : null;
                if (valueOf != null && valueOf.longValue() != -1) {
                    arrayList.add(new jz5.o(valueOf, lVar.f384366d, lVar.f384367e));
                }
            }
        }
    }
}
