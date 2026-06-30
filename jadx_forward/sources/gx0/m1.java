package gx0;

/* loaded from: classes5.dex */
public final class m1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.r1 f358223d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 f358224e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ex0.k0 f358225f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 f358226g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(gx0.r1 r1Var, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78, ex0.k0 k0Var, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553) {
        super(1);
        this.f358223d = r1Var;
        this.f358224e = c3971x241f78;
        this.f358225f = k0Var;
        this.f358226g = c4129xdee64553;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.ze2 ze2Var = (r45.ze2) obj;
        gx0.r1 r1Var = this.f358223d;
        if (ze2Var == null) {
            com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 o76 = r1Var.s7().o7();
            if (o76 != null) {
                o76.w(this.f358224e);
            }
        } else {
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4186x9bb007e5 b17 = by0.h.b(ze2Var);
            ex0.k0 k0Var = this.f358225f;
            k0Var.A(b17);
            gx0.kc r76 = r1Var.r7();
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 = k0Var.f338700a;
            com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = c4190xd8dd3713.f130065a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c3971x241f78, "getSegmentID(...)");
            r76.W6(c3971x241f78, this.f358226g, new gx0.j1(c4190xd8dd3713, r1Var));
        }
        return jz5.f0.f384359a;
    }
}
