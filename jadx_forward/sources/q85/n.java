package q85;

/* loaded from: classes14.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q85.s f442353d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e0.f1 f442354e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q85.s sVar, e0.f1 f1Var) {
        super(1);
        this.f442353d = sVar;
        this.f442354e = f1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        e1.e0 graphicsLayer = (e1.e0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(graphicsLayer, "$this$graphicsLayer");
        q85.s sVar = this.f442353d;
        sVar.getClass();
        e0.f1 lazyListState = this.f442354e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lazyListState, "lazyListState");
        int d17 = lazyListState.d();
        p012xc85e97e9.p093xedfae76a.j0 j0Var = sVar.f442366c;
        if (d17 == 0) {
            int e17 = lazyListState.e() - sVar.f442364a;
            if (e17 >= 0) {
                float f17 = e17 / sVar.f442365b;
                if (f17 > 1.0d) {
                    j0Var.mo523x53d8522f(java.lang.Float.valueOf(1.0f));
                } else {
                    j0Var.mo523x53d8522f(java.lang.Float.valueOf(f17));
                }
            } else {
                j0Var.mo523x53d8522f(java.lang.Float.valueOf(0.0f));
            }
        }
        java.lang.Float f18 = (java.lang.Float) j0Var.mo3195x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f18);
        ((e1.x0) graphicsLayer).f327830f = f18.floatValue();
        return jz5.f0.f384359a;
    }
}
