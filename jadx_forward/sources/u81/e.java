package u81;

/* loaded from: classes7.dex */
public class e extends u81.f0 {

    /* renamed from: J, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f506944J;
    public final /* synthetic */ u81.h K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(u81.h hVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f22) {
        super(c11510xdd90c2f2);
        this.K = hVar;
        this.f506944J = c11510xdd90c2f22;
    }

    @Override // u81.f0
    public void v(u81.b bVar, u81.b bVar2) {
        u81.f[] fVarArr;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppRunningStateController", "runtime : %d appid : %s running state did change from %s to %s", java.lang.Integer.valueOf(this.f506944J.hashCode()), this.f506944J.f156336n, bVar == null ? "null" : bVar.name().toLowerCase(), u81.b.DESTROYED == bVar2 ? "terminated" : bVar2.name().toLowerCase());
        u81.h hVar = this.K;
        synchronized (hVar.f506967c) {
            x.b bVar3 = hVar.f506967c;
            fVarArr = (u81.f[]) ((x.j) bVar3.keySet()).toArray(new u81.f[bVar3.f532379f]);
        }
        for (u81.f fVar : fVarArr) {
            fVar.D(hVar.f506966b.f156336n, bVar2);
        }
    }

    @Override // u81.f0
    public void w() {
        u81.f[] fVarArr;
        boolean P1 = this.K.f506966b.P1();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppRunningStateController", "onSuspendTimeout, %s, shouldHandle?:%b", this.K.f506966b, java.lang.Boolean.valueOf(P1));
        if (P1) {
            this.K.f506966b.l0();
            u81.h hVar = this.K;
            u81.d dVar = new u81.d(this);
            synchronized (hVar.f506967c) {
                x.b bVar = hVar.f506967c;
                fVarArr = (u81.f[]) ((x.j) bVar.keySet()).toArray(new u81.f[bVar.f532379f]);
            }
            for (u81.f fVar : fVarArr) {
                if (fVar instanceof u81.g) {
                    dVar.mo1850x58b836e((u81.g) fVar);
                }
            }
        }
    }
}
