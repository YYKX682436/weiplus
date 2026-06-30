package kj5;

/* loaded from: classes.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kj5.f f389989d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(kj5.f fVar) {
        super(1);
        this.f389989d = fVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        kj5.f fVar = this.f389989d;
        if (dVar != null && (dVar instanceof wi5.h0)) {
            fVar.getClass();
            d75.b.g(new kj5.e(fVar));
            fVar.T6().n().setOnClickListener(new kj5.a(fVar));
        }
        j75.d dVar2 = state.f379599d;
        if (dVar2 != null && (dVar2 instanceof wi5.d0)) {
            wi5.d0 d0Var = (wi5.d0) dVar2;
            if (fVar.f389994q > 0 && d0Var.f527819c && ((rd0.v0) i95.n0.c(rd0.v0.class)) != null) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = fVar.m158354x19263085();
                java.lang.String str = d0Var.f527818b;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.x3.i(m158354x19263085, str, true, str);
            }
        }
        return jz5.f0.f384359a;
    }
}
