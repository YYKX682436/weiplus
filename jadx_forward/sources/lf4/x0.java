package lf4;

/* loaded from: classes4.dex */
public final class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf4.j1 f400033d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f400034e;

    public x0(lf4.j1 j1Var, int i17) {
        this.f400033d = j1Var;
        this.f400034e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lf4.j1 j1Var = this.f400033d;
        java.util.ArrayList arrayList = j1Var.f399956m;
        int i17 = this.f400034e;
        if (((lf4.i) arrayList.get(i17)).f399945a != 2) {
            j1Var.f399957n.add(j1Var.f399964u.get(i17));
        }
        int i18 = i17 + 1;
        if (i18 < j1Var.f399964u.size()) {
            j1Var.f399957n.add(j1Var.f399964u.get(i18));
            j1Var.n();
        }
        j1Var.getClass();
        ef4.w.f334001t.l().mo50293x3498a0(new lf4.e1(j1Var));
    }
}
