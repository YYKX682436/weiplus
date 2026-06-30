package sc2;

/* loaded from: classes2.dex */
public final class j7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487532d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ec2.f f487533e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7(in5.s0 s0Var, ec2.f fVar) {
        super(1);
        this.f487532d = s0Var;
        this.f487533e = fVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ad2.h observer = (ad2.h) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        xc2.p0 p0Var = observer.f84680h;
        android.view.View view = observer.f84676d;
        if (p0Var != null && view != null) {
            observer.y(this.f487532d, view, p0Var, this.f487533e);
        }
        return jz5.f0.f384359a;
    }
}
