package nu0;

/* loaded from: classes5.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu0.q0 f421656d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f421657e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f421658f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(nu0.q0 q0Var, int i17, int i18) {
        super(1);
        this.f421656d = q0Var;
        this.f421657e = i17;
        this.f421658f = i18;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String path = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        nu0.q0 q0Var = this.f421656d;
        ((java.util.ArrayList) q0Var.f421610t).add(path);
        if (this.f421657e == this.f421658f) {
            nu0.q0.W6(q0Var);
        }
        return jz5.f0.f384359a;
    }
}
