package fa3;

/* loaded from: classes10.dex */
public class m implements bi3.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f342302a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.g f342303b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fa3.b f342304c;

    public m(fa3.b bVar, java.util.Map map, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.g gVar) {
        this.f342304c = bVar;
        this.f342302a = map;
        this.f342303b = gVar;
    }

    @Override // bi3.j
    public void a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppCameraManager", "LiteAppCamera onRecordFinish error %b", java.lang.Boolean.valueOf(z17));
        fa3.b bVar = this.f342304c;
        bVar.f342265r = 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.api.C16529x1336da53 c16529x1336da53 = bVar.f342257j;
        if (c16529x1336da53 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppCameraManager", "LiteAppCamera onRecordFinish recordView is null");
            this.f342302a.put("error", "recordView is null");
            this.f342303b.a(this.f342302a);
            this.f342304c.f342267t = false;
            return;
        }
        bVar.f342260m = c16529x1336da53.m66784x819e39a6();
        if (z17) {
            this.f342302a.put("error", "stopRecord error");
            this.f342303b.a(this.f342302a);
            this.f342304c.f342267t = false;
            return;
        }
        fa3.b bVar2 = this.f342304c;
        if (bVar2.f342264q) {
            java.lang.String str = bVar2.f342260m;
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.g gVar = this.f342303b;
            bVar2.getClass();
            ((ku5.t0) ku5.t0.f394148d).g(new fa3.d(bVar2, str, gVar));
        } else {
            fa3.b.a(bVar2, bVar2.f342260m, this.f342303b);
        }
        fa3.b bVar3 = this.f342304c;
        bVar3.f342267t = false;
        bVar3.i();
        fa3.b bVar4 = this.f342304c;
        bVar4.f342257j.m66800x1474a01a(bVar4.f342260m);
    }
}
