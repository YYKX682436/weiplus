package jn3;

/* loaded from: classes8.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn3.m f382322d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(jn3.m mVar) {
        super(1);
        this.f382322d = mVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        ra0.b0 state = (ra0.b0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        jn3.m mVar = this.f382322d;
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof sa0.k)) {
            sa0.k kVar = (sa0.k) dVar;
            int i17 = kVar.f486789c;
            int i18 = kVar.f486790d;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = kVar.f486788b;
            if (gVar == null || (str = gVar.toString()) == null) {
                str = "";
            }
            mVar.T6(4, i17, i18, false, str);
        }
        jn3.m mVar2 = this.f382322d;
        j75.d dVar2 = state.f379599d;
        if (dVar2 != null && (dVar2 instanceof sa0.j)) {
            mVar2.T6(4, 1005, 3, true, null);
        }
        jn3.m mVar3 = this.f382322d;
        j75.d dVar3 = state.f379599d;
        if (dVar3 != null && (dVar3 instanceof sa0.m)) {
            mVar3.T6(4, ((sa0.m) dVar3).f486791b, 3, true, null);
        }
        jn3.m mVar4 = this.f382322d;
        j75.d dVar4 = state.f379599d;
        if (dVar4 != null && (dVar4 instanceof sa0.l)) {
            mVar4.T6(4, 1008, 7, true, null);
        }
        return jz5.f0.f384359a;
    }
}
