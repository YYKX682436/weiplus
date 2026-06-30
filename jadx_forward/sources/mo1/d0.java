package mo1;

/* loaded from: classes5.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f411807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f411808e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(java.util.List list, yz5.p pVar) {
        super(1);
        this.f411807d = list;
        this.f411808e = pVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        e0.u0 LazyColumn = (e0.u0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(LazyColumn, "$this$LazyColumn");
        mo1.a0 a0Var = mo1.a0.f411799d;
        java.util.List list = this.f411807d;
        ((e0.y0) LazyColumn).b(list.size(), null, new mo1.b0(a0Var, list), u0.j.c(-632812321, true, new mo1.c0(list, this.f411808e)));
        return jz5.f0.f384359a;
    }
}
