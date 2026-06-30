package bw0;

/* loaded from: classes5.dex */
public final class e implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw0.a f106312d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw0.l f106313e;

    public e(bw0.a aVar, bw0.l lVar) {
        this.f106312d = aVar;
        this.f106313e = lVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        sw0.e eVar = (sw0.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
        this.f106312d.m11427x142ed2a9(eVar);
        sw0.m mVar = eVar.f494961c;
        if (mVar instanceof sw0.k ? true : mVar instanceof sw0.l ? true : mVar instanceof sw0.i) {
            bw0.l lVar = this.f106313e;
            lVar.getClass();
            sw0.d dVar = (sw0.d) kz5.n0.a0(eVar.f494959a, eVar.f494960b.f494968b);
            sw0.b bVar = null;
            if (zu0.i.f557209f == (dVar != null ? dVar.f494956b : null)) {
                java.lang.String str = dVar.f494955a.f129757b;
                ex0.o oVar = lVar.f106326q;
                if (oVar != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4188xeef5596e c4188xeef5596e = oVar.f338687q;
                    c4188xeef5596e.getClass();
                    java.lang.Boolean bool = java.lang.Boolean.FALSE;
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4188xeef5596e.D();
                    if (D != null) {
                        bool = com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4188xeef5596e.B1(c4188xeef5596e, str, D);
                    }
                    bool.booleanValue();
                }
                sw0.b bVar2 = lVar.f106325p;
                if (bVar2 != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    bVar = sw0.b.a(bVar2, null, null, str, null, null, 27, null);
                }
                lVar.f106325p = bVar;
                lVar.n7();
            }
        }
    }
}
