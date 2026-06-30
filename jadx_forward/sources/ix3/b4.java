package ix3;

/* loaded from: classes.dex */
public final class b4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.c4 f376902d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(ix3.c4 c4Var) {
        super(1);
        this.f376902d = c4Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        hx3.b state = (hx3.b) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof hx3.e)) {
            hx3.e eVar = (hx3.e) dVar;
            ix3.c4 c4Var = this.f376902d;
            p3325xe03a0797.p3326xc267989b.r2 r2Var = c4Var.f376912d;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O6 = c4Var.O6();
            c4Var.f376912d = O6 != null ? v65.i.b(O6, null, new ix3.a4(eVar, c4Var, null), 1, null) : null;
        }
        return jz5.f0.f384359a;
    }
}
