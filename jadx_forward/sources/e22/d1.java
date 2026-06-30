package e22;

/* loaded from: classes14.dex */
public final class d1 extends p012xc85e97e9.p093xedfae76a.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f328166d = p3325xe03a0797.p3326xc267989b.z0.b();

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f328167e;

    /* renamed from: f, reason: collision with root package name */
    public final n0.v2 f328168f;

    /* renamed from: g, reason: collision with root package name */
    public final n0.v2 f328169g;

    /* renamed from: h, reason: collision with root package name */
    public final x0.i0 f328170h;

    /* renamed from: i, reason: collision with root package name */
    public final n0.v2 f328171i;

    /* renamed from: m, reason: collision with root package name */
    public final x0.i0 f328172m;

    public d1() {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.f328168f = n0.s4.c(bool, null, 2, null);
        this.f328169g = n0.s4.c(bool, null, 2, null);
        this.f328170h = new x0.i0();
        this.f328171i = n0.s4.c(bool, null, 2, null);
        this.f328172m = new x0.i0();
        P6();
    }

    public static final java.util.List N6(e22.d1 d1Var, java.util.List list) {
        d1Var.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) next).m76802x2dd01666();
            if (m76802x2dd01666 != null && m76802x2dd01666.m76964x7f025288() == 4) {
                arrayList.add(next);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            java.lang.Object next2 = it6.next();
            if (((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) next2).m76815x4f546659() == 0) {
                arrayList2.add(next2);
            }
        }
        return arrayList2;
    }

    public final void O6() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("next, isEnded: ");
        n0.v2 v2Var = this.f328168f;
        sb6.append(v2Var);
        sb6.append(", isLoading: ");
        n0.v2 v2Var2 = this.f328169g;
        sb6.append(v2Var2);
        ot5.g.c("MicroMsg.FindersFeedViewModel", sb6.toString());
        if (((java.lang.Boolean) ((n0.q4) v2Var).mo128745x754a37bb()).booleanValue() || ((java.lang.Boolean) ((n0.q4) v2Var2).mo128745x754a37bb()).booleanValue()) {
            return;
        }
        ((n0.q4) v2Var2).mo148714x53d8522f(java.lang.Boolean.TRUE);
        p3325xe03a0797.p3326xc267989b.l.d(this.f328166d, null, null, new e22.b1(this, null), 3, null);
    }

    public final void P6() {
        this.f328169g.mo148714x53d8522f(java.lang.Boolean.TRUE);
        this.f328171i.mo148714x53d8522f(java.lang.Boolean.FALSE);
        p3325xe03a0797.p3326xc267989b.l.d(this.f328166d, null, null, new e22.c1(this, null), 3, null);
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        super.mo528x82b764cd();
        p3325xe03a0797.p3326xc267989b.z0.e(this.f328166d, null, 1, null);
    }
}
