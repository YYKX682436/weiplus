package uf5;

/* loaded from: classes10.dex */
public class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f508735d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22348x7c995a79 f508736e;

    public b1(com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22348x7c995a79 activityC22348x7c995a79, java.util.List list) {
        this.f508736e = activityC22348x7c995a79;
        this.f508735d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22348x7c995a79 activityC22348x7c995a79 = this.f508736e;
        activityC22348x7c995a79.A = true;
        for (java.lang.String str : this.f508735d) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str, true);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa();
                c19782x23db1cfa.m76240x66bc2758(n17.d1());
                c19782x23db1cfa.m76207x552f0f81(n17.f318124z1);
                arrayList.add(c19782x23db1cfa);
            }
        }
        activityC22348x7c995a79.f288653J = activityC22348x7c995a79.G.j(arrayList, null);
    }
}
