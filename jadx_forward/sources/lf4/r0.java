package lf4;

/* loaded from: classes4.dex */
public final class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf4.j1 f400010d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f400011e;

    public r0(lf4.j1 j1Var, int i17) {
        this.f400010d = j1Var;
        this.f400011e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lf4.j1 j1Var = this.f400010d;
        java.util.ArrayList arrayList = j1Var.f399956m;
        int i17 = this.f400011e;
        if (((lf4.i) arrayList.get(i17)).f399945a != 2) {
            j1Var.f399957n.add(j1Var.f399964u.get(i17));
        }
        int i18 = i17 + 1;
        if (i18 < j1Var.f399964u.size()) {
            j1Var.f399957n.add(j1Var.f399964u.get(i18));
            j1Var.n();
        }
    }
}
