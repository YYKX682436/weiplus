package d26;

/* loaded from: classes16.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d26.x f307568d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(d26.x xVar) {
        super(0);
        this.f307568d = xVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        d26.x xVar = this.f307568d;
        i16.o oVar = xVar.f307586h;
        if ((oVar.f369174f & 4) == 4) {
            o06.j e17 = xVar.u0().e(b26.t0.b(xVar.f307593r.f99049b, oVar.f369177i), w06.d.f523485m);
            if (e17 instanceof o06.g) {
                return (o06.g) e17;
            }
        }
        return null;
    }
}
