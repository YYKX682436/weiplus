package w0;

/* loaded from: classes14.dex */
public final class m implements n0.a2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w0.l f523378a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0.p f523379b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f523380c;

    public m(w0.l lVar, w0.p pVar, java.lang.Object obj) {
        this.f523378a = lVar;
        this.f523379b = pVar;
        this.f523380c = obj;
    }

    @Override // n0.a2
    /* renamed from: dispose */
    public void mo158x63a5261f() {
        w0.p pVar = this.f523379b;
        java.util.Map map = pVar.f523389a;
        w0.l lVar = this.f523378a;
        lVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(map, "map");
        if (lVar.f523376b) {
            map.put(lVar.f523375a, ((w0.u) lVar.f523377c).a());
        }
        pVar.f523390b.remove(this.f523380c);
    }
}
