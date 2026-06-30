package wb5;

/* loaded from: classes.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wb5.i f525982d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(wb5.i iVar) {
        super(1);
        this.f525982d = iVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof wi5.o)) {
            wi5.o oVar = (wi5.o) dVar;
            wb5.i iVar = this.f525982d;
            com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O6 = iVar.O6();
            if (O6 != null) {
                v65.i.b(O6, null, new wb5.d(iVar, oVar, null), 1, null);
            }
            com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O62 = iVar.O6();
            if (O62 != null) {
                v65.i.b(O62, null, new wb5.g(iVar, oVar, state, null), 1, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
