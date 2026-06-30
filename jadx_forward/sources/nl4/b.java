package nl4;

/* loaded from: classes11.dex */
public final class b implements com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nl4.d f419727d;

    public b(nl4.d dVar) {
        this.f419727d = dVar;
    }

    @Override // com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1
    /* renamed from: onNetStatus */
    public void mo15382x3bee38d0(android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1
    /* renamed from: onPlayEvent */
    public void mo15376x8cd414a7(int i17, android.os.Bundle bundle) {
        nl4.d dVar = this.f419727d;
        if (i17 != 2012) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(dVar.f419736h, "onPlayEvent event=" + i17);
        }
        if (i17 == -2301) {
            mn0.b0.C(dVar.f419734f, false, false, false, 6, null);
            ll4.a aVar = dVar.f419729a;
            if (aVar != null) {
                ll4.a.a(aVar, 12, null, 2, null);
                return;
            }
            return;
        }
        if (i17 == 2004) {
            if (dVar.f419733e) {
                dVar.f419733e = false;
                ll4.a aVar2 = dVar.f419729a;
                if (aVar2 != null) {
                    ll4.a.a(aVar2, 8, null, 2, null);
                    return;
                }
                return;
            }
            yz5.l lVar = dVar.f419737i;
            if (lVar != null) {
                lVar.mo146xb9724478(dVar);
            }
            ll4.a aVar3 = dVar.f419729a;
            if (aVar3 != null) {
                ll4.a.a(aVar3, 3, null, 2, null);
                return;
            }
            return;
        }
        if (i17 == 2103) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
            if (ko0.t.f391436a.f(i17, bundle)) {
                if (dVar.f419733e) {
                    ll4.a aVar4 = dVar.f419729a;
                    if (aVar4 != null) {
                        ll4.a.a(aVar4, 8, null, 2, null);
                    }
                    dVar.f419733e = false;
                }
                ll4.a aVar5 = dVar.f419729a;
                if (aVar5 != null) {
                    ll4.a.a(aVar5, 4, null, 2, null);
                }
                mn0.b0.C(dVar.f419734f, false, false, false, 6, null);
                return;
            }
            return;
        }
        if (i17 == 2006) {
            ll4.a aVar6 = dVar.f419729a;
            if (aVar6 != null) {
                ll4.a.a(aVar6, 4, null, 2, null);
                return;
            }
            return;
        }
        if (i17 == 2007 && !dVar.f419733e) {
            dVar.f419733e = true;
            ll4.a aVar7 = dVar.f419729a;
            if (aVar7 != null) {
                ll4.a.a(aVar7, 7, null, 2, null);
            }
        }
    }
}
