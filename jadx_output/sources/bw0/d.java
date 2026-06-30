package bw0;

/* loaded from: classes5.dex */
public final class d implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw0.a f24777d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw0.l f24778e;

    public d(bw0.a aVar, bw0.l lVar) {
        this.f24777d = aVar;
        this.f24778e = lVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        sw0.e eVar = (sw0.e) obj;
        kotlin.jvm.internal.o.d(eVar);
        this.f24777d.setFontDataList(eVar);
        sw0.m mVar = eVar.f413428c;
        if (mVar instanceof sw0.k ? true : mVar instanceof sw0.l ? true : mVar instanceof sw0.i) {
            bw0.l lVar = this.f24778e;
            lVar.getClass();
            sw0.d dVar = (sw0.d) kz5.n0.a0(eVar.f413426a, eVar.f413427b.f413435b);
            sw0.b bVar = null;
            if (zu0.i.f475676f == (dVar != null ? dVar.f413423b : null)) {
                java.lang.String str = dVar.f413422a.f48224b;
                ex0.o oVar = lVar.f24793q;
                if (oVar != null) {
                    kotlin.jvm.internal.o.d(str);
                    com.tencent.maas.moviecomposing.segments.MusicSegment musicSegment = oVar.f257154q;
                    musicSegment.getClass();
                    java.lang.Boolean bool = java.lang.Boolean.FALSE;
                    com.tencent.maas.moviecomposing.Timeline D = musicSegment.D();
                    if (D != null) {
                        bool = com.tencent.maas.moviecomposing.segments.MusicSegment.L1(musicSegment, str, D);
                    }
                    bool.booleanValue();
                }
                sw0.b bVar2 = lVar.f24792p;
                if (bVar2 != null) {
                    kotlin.jvm.internal.o.d(str);
                    bVar = sw0.b.a(bVar2, null, null, null, str, null, 23, null);
                }
                lVar.f24792p = bVar;
                lVar.o7();
            }
        }
    }
}
