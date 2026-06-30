package sc2;

/* loaded from: classes2.dex */
public final class v7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487848d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f487849e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(in5.s0 s0Var, int i17) {
        super(1);
        this.f487848d = s0Var;
        this.f487849e = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ad2.h observer = (ad2.h) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        xc2.p0 p0Var = observer.f84680h;
        android.view.View view = observer.f84676d;
        if (p0Var != null && view != null) {
            in5.s0 holder = this.f487848d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
            xc2.z2 z2Var = observer.f84684o;
            if (z2Var != null) {
                z2Var.b(holder, this.f487849e);
            }
        }
        return jz5.f0.f384359a;
    }
}
