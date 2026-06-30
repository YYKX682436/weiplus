package pe3;

/* loaded from: classes5.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f435209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pe3.g0 f435210e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(java.util.List list, pe3.g0 g0Var) {
        super(1);
        this.f435209d = list;
        this.f435210e = g0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        e0.u0 LazyColumn = (e0.u0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(LazyColumn, "$this$LazyColumn");
        pe3.p pVar = pe3.p.f435204d;
        java.util.List list = this.f435209d;
        ((e0.y0) LazyColumn).b(list.size(), new pe3.q(pVar, list), new pe3.r(list), u0.j.c(-1091073711, true, new pe3.s(list, this.f435210e)));
        return jz5.f0.f384359a;
    }
}
