package sc3;

/* loaded from: classes7.dex */
public final class i1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f487991d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(sc3.k1 k1Var) {
        super(1);
        this.f487991d = k1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.List descriptors = (java.util.List) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(descriptors, "descriptors");
        sc3.k1 k1Var = this.f487991d;
        java.lang.String str = k1Var.Q;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mainScriptProvided with descriptors: ");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(descriptors, 10));
        java.util.Iterator it = descriptors.iterator();
        while (it.hasNext()) {
            arrayList.add(((lc3.g0) it.next()).toString());
        }
        sb6.append(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (!k1Var.O0()) {
            k1Var.N0();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("not parallel mode. manually trigger load config ");
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b c16416x87606a7b = k1Var.f488015n;
            if (c16416x87606a7b == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("config");
                throw null;
            }
            sb7.append(c16416x87606a7b.f229352f);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k1Var.Q, sb7.toString());
        }
        k1Var.M0().Z(new sc3.x0(k1Var));
        k1Var.M0().C(-8);
        k1Var.M0().mo171468xc84dc82d();
        k1Var.M0().mo51545x3498a0(new sc3.h1(k1Var, descriptors));
        return jz5.f0.f384359a;
    }
}
