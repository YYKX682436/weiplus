package d23;

/* loaded from: classes.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d23.g f307413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d23.h f307414e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d23.g gVar, d23.h hVar) {
        super(1);
        this.f307413d = gVar;
        this.f307414e = hVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        b23.a state = (b23.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof b23.c)) {
            d23.g gVar = this.f307413d;
            gVar.e(this.f307414e.mo9090x86b9ebe3(), ((b23.c) dVar).f98919b / a06.d.b(i65.a.g(gVar.f307428h)));
        }
        return jz5.f0.f384359a;
    }
}
