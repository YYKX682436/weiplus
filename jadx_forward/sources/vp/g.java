package vp;

/* loaded from: classes16.dex */
public class g implements vp.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vp.d f520305a;

    public g(vp.d dVar) {
        this.f520305a = dVar;
    }

    @Override // vp.c0
    public void a(wp.a aVar) {
        vp.t tVar = this.f520305a.f520279i;
        tVar.c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuDataSource", "addNow: danmaku = " + aVar);
        zp.l lVar = tVar.f520364b;
        if (aVar == null) {
            lVar.getClass();
        } else {
            zp.j jVar = lVar.f556451a;
            zp.j jVar2 = jVar.f556449b;
            while (jVar2 != jVar) {
                if (lVar.f556452b.compare(jVar2.f556448a, aVar) >= 0) {
                    break;
                } else {
                    jVar2 = jVar2.f556449b;
                }
            }
            if (!aVar.m174282xb2c87fbf(jVar2.f556448a)) {
                zp.j jVar3 = jVar2.f556450c;
                zp.j jVar4 = new zp.j(aVar, jVar2, jVar3);
                jVar3.f556449b = jVar4;
                jVar2.f556450c = jVar4;
                lVar.f556454d++;
            }
        }
        tVar.e();
    }
}
