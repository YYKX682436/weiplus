package kk5;

/* loaded from: classes.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk5.w f390225d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(kk5.w wVar) {
        super(1);
        this.f390225d = wVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof wi5.o)) {
            wi5.o oVar = (wi5.o) dVar;
            kk5.w wVar = this.f390225d;
            com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O6 = wVar.O6();
            if (O6 != null) {
                v65.i.b(O6, null, new kk5.u(wVar, oVar, null), 1, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
