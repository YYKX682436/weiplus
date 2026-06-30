package fa3;

/* loaded from: classes10.dex */
public class g implements bi3.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.g f342290a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fa3.b f342291b;

    public g(fa3.b bVar, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.g gVar) {
        this.f342291b = bVar;
        this.f342290a = gVar;
    }

    @Override // bi3.e
    public void a() {
        float[] fArr;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppCameraManager", "LiteAppCamera InitDoneCallback");
        fa3.b bVar = this.f342291b;
        bVar.f342262o = true;
        java.util.HashMap hashMap = new java.util.HashMap();
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.api.C16529x1336da53 c16529x1336da53 = bVar.f342257j;
        if (c16529x1336da53 != null) {
            fArr = c16529x1336da53.m66783xa63a1d3c();
            bVar.h();
        } else {
            fArr = null;
        }
        if (fArr != null && fArr.length > 0) {
            bVar.f342263p = fArr[fArr.length - 1];
        }
        hashMap.put("maxZoom", java.lang.Float.valueOf(bVar.f342263p));
        this.f342290a.f(hashMap);
        if (bVar.f342273z) {
            bVar.j(bVar.A, bVar.B);
        }
    }
}
