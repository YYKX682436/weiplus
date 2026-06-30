package pk2;

/* loaded from: classes3.dex */
public final class b5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f437111d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437112e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v65.n f437113f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(boolean z17, pk2.o9 o9Var, v65.n nVar) {
        super(2);
        this.f437111d = z17;
        this.f437112e = o9Var;
        this.f437113f = nVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        if (booleanValue) {
            boolean z17 = this.f437111d;
            if (!z17) {
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f437112e.f437611d;
                db5.t7.h(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dwt));
            }
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.T8((zy2.zb) c17, z17 ? ml2.t1.B : ml2.t1.C, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f409449f), null, null, null, null, false, 124, null);
            if (z17) {
                i95.m c18 = i95.n0.c(ml2.r0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                ml2.r0.rj((ml2.r0) c18, 4, null, 2, null);
            } else {
                i95.m c19 = i95.n0.c(ml2.r0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
                ml2.r0.rj((ml2.r0) c19, 3, null, 2, null);
            }
        }
        this.f437113f.a(java.lang.Boolean.valueOf(booleanValue));
        return jz5.f0.f384359a;
    }
}
