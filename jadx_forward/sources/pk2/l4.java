package pk2;

/* loaded from: classes3.dex */
public final class l4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437484d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f437485e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pk2.n4 f437486f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v65.n f437487g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(pk2.o9 o9Var, boolean z17, pk2.n4 n4Var, v65.n nVar) {
        super(2);
        this.f437484d = o9Var;
        this.f437485e = z17;
        this.f437486f = n4Var;
        this.f437487g = nVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        pk2.o9 o9Var = this.f437484d;
        mm2.o4 o4Var = (mm2.o4) o9Var.c(mm2.o4.class);
        boolean z17 = this.f437485e;
        o4Var.G = z17;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = o9Var.f437611d;
        if (booleanValue) {
            java.lang.String string = z17 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jnq) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574834jo0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            if (this.f437486f.n()) {
                if (z17) {
                    qf2.z3 z3Var = (qf2.z3) o9Var.e(qf2.z3.class);
                    if (z3Var != null) {
                        if (z3Var.f444212m == null) {
                            z3Var.f444212m = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.k8(z3Var.O6(), z3Var);
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.k8 k8Var = z3Var.f444212m;
                        if (k8Var != null) {
                            k8Var.h0(false);
                        }
                    }
                } else {
                    qf2.z3 z3Var2 = (qf2.z3) o9Var.e(qf2.z3.class);
                    if (z3Var2 != null) {
                        z3Var2.b7("", "SwitchClose");
                    }
                }
            }
            db5.t7.h(abstractActivityC21394xb3d2c0cf, string);
        } else {
            db5.t7.b(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572973d36));
        }
        this.f437487g.a(java.lang.Boolean.valueOf(booleanValue));
        return jz5.f0.f384359a;
    }
}
