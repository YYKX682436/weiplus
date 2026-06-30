package fj1;

/* loaded from: classes7.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fj1.y f344673d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(fj1.y yVar) {
        super(0);
        this.f344673d = yVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ej1.g gVar = this.f344673d.f334811a;
        ej1.g gVar2 = ej1.g.DESTROYED;
        if (gVar.compareTo(gVar2) < 0) {
            fj1.y.a(this.f344673d, ej1.g.PAUSED);
            fj1.y.a(this.f344673d, gVar2);
        }
        return jz5.f0.f384359a;
    }
}
