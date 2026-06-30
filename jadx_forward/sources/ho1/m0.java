package ho1;

/* loaded from: classes5.dex */
public final class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho1.a1 f364286d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f364287e;

    public m0(ho1.a1 a1Var, long j17) {
        this.f364286d = a1Var;
        this.f364287e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List j17 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a.j(true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = j17.iterator();
        while (it.hasNext()) {
            arrayList.add(((po1.d) it.next()).e());
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.e0 e0Var = this.f364286d.f364156b;
        if (e0Var != null) {
            e0Var.B0(this.f364287e, arrayList);
        }
    }
}
