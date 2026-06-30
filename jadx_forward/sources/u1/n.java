package u1;

/* loaded from: classes14.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u1.o f505162d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(u1.o oVar) {
        super(0);
        this.f505162d = oVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        u1.o oVar = this.f505162d;
        b1.f fVar = oVar.f505181h;
        if (fVar != null) {
            b1.b params = oVar.f505182i;
            b1.g gVar = (b1.g) fVar;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
            b1.c cVar = gVar.f98526d;
            cVar.getClass();
            cVar.f98523d = params;
            cVar.f98524e = null;
            gVar.f98527e.mo146xb9724478(cVar);
            if (cVar.f98524e == null) {
                throw new java.lang.IllegalStateException("DrawResult not defined, did you forget to call onDraw?".toString());
            }
        }
        oVar.f505183m = false;
        return jz5.f0.f384359a;
    }
}
