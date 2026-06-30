package ow0;

/* loaded from: classes5.dex */
public final class c implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ow0.g f430827d;

    public c(ow0.g gVar) {
        this.f430827d = gVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.Object obj2;
        kw0.e eVar = (kw0.e) obj;
        sw0.f fVar = sw0.f.f494964f;
        java.util.Iterator it = this.f430827d.F.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it.next();
                if (((sw0.n) obj2).f494977b == fVar) {
                    break;
                }
            }
        }
        sw0.n nVar = (sw0.n) obj2;
        android.view.View view = nVar != null ? nVar.f494978c : null;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10947x71306f3b c10947x71306f3b = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10947x71306f3b) (view instanceof com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10947x71306f3b ? view : null);
        if (c10947x71306f3b == null || eVar.f394334a.isEmpty()) {
            return;
        }
        kw0.f fVar2 = kw0.f.f394337a;
        kw0.k kVar = eVar.f394336c;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(kVar, fVar2)) {
            return;
        }
        boolean z17 = kVar instanceof kw0.g;
        java.util.List<kw0.a> list = eVar.f394334a;
        if (!z17) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(kVar, kw0.i.f394339a)) {
                c10947x71306f3b.m47153xe131cdea(list);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.b(kVar, kw0.j.f394340a);
                return;
            }
        }
        kw0.g gVar = (kw0.g) kVar;
        kw0.a aVar = (kw0.a) kz5.n0.a0(list, gVar.f394338a);
        if (aVar != null) {
            c10947x71306f3b.a(gVar.f394338a, aVar);
        }
    }
}
