package z;

/* loaded from: classes14.dex */
public final class c2 {

    /* renamed from: a, reason: collision with root package name */
    public final z.w2 f550149a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f550150b;

    /* renamed from: c, reason: collision with root package name */
    public z.b2 f550151c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z.l2 f550152d;

    public c2(z.l2 l2Var, z.w2 typeConverter, java.lang.String label) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeConverter, "typeConverter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(label, "label");
        this.f550152d = l2Var;
        this.f550149a = typeConverter;
        this.f550150b = label;
    }

    public final n0.e5 a(yz5.l transitionSpec, yz5.l targetValueByState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transitionSpec, "transitionSpec");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetValueByState, "targetValueByState");
        z.b2 b2Var = this.f550151c;
        z.l2 l2Var = this.f550152d;
        if (b2Var == null) {
            b2Var = new z.b2(this, new z.f2(l2Var, targetValueByState.mo146xb9724478(l2Var.b()), z.s.c(this.f550149a, targetValueByState.mo146xb9724478(l2Var.b())), this.f550149a, this.f550150b), transitionSpec, targetValueByState);
            this.f550151c = b2Var;
            z.f2 animation = b2Var.f550128d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
            l2Var.f550261h.add(animation);
        }
        b2Var.f550130f = targetValueByState;
        b2Var.f550129e = transitionSpec;
        b2Var.b(l2Var.c());
        return b2Var;
    }
}
