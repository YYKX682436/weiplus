package ne1;

/* loaded from: classes7.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ne1.d f418045d;

    public a(ne1.d dVar) {
        this.f418045d = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4;
        ne1.d dVar = this.f418045d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 t37 = dVar.f418049e.f418050a.t3();
        wg1.b bVar = wg1.b.f527246f;
        if (t37 == null || (c11809xbc286be4 = dVar.f418048d) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.RuntimeRestartHelper", "restart skip with Null runtime");
        } else {
            t37.m(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ze(t37, bVar, c11809xbc286be4));
        }
    }
}
