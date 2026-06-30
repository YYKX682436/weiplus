package dh2;

/* loaded from: classes10.dex */
public final class h implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dh2.x f313977d;

    public h(dh2.x xVar) {
        this.f313977d = xVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        int intValue = ((java.lang.Number) obj).intValue();
        dh2.x xVar = this.f313977d;
        boolean S6 = ((om2.g) xVar.f314001e.a(om2.g.class)).S6();
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (S6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KTVSongPlayManager", "audioRouteChange: " + intValue);
            gk2.e eVar = xVar.f314001e;
            p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = ((om2.e) eVar.a(om2.e.class)).f427828n;
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).k(java.lang.Boolean.valueOf(intValue == 2));
            ah2.c cVar = xVar.f314006m;
            if (cVar != null) {
                double d17 = (intValue == 2 || intValue == 4) ? 1.0d : 0.8d;
                jh2.c cVar2 = ((dh2.b0) cVar).f313959f;
                if (cVar2 != null) {
                    cVar2.d(d17);
                }
            }
        }
        return f0Var;
    }
}
