package ze5;

/* loaded from: classes9.dex */
public final class t8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze5.w8 f553744d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f553745e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rd5.d f553746f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8(ze5.w8 w8Var, yb5.d dVar, rd5.d dVar2) {
        super(1);
        this.f553744d = w8Var;
        this.f553745e = dVar;
        this.f553746f = dVar2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ze5.n8 it = (ze5.n8) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.widget.LinearLayout linearLayout = it.f553647f;
        if (linearLayout != null) {
            ze5.y8.b(this.f553744d.e0(it), linearLayout, this.f553745e, this.f553746f, it);
        }
        return jz5.f0.f384359a;
    }
}
