package aj5;

/* loaded from: classes.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aj5.r f87018d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aj5.p f87019e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(aj5.r rVar, aj5.p pVar) {
        super(1);
        this.f87018d = rVar;
        this.f87019e = pVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.List it = (java.util.List) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactAddressBookRecommendStrictDupUIC", "relatedUserSearchResultListener: resultSize: " + it.size());
        aj5.r rVar = this.f87018d;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k17 = rVar.V6().k();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "getSelectContactRv(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe a17 = xm3.u0.a(k17);
        if (a17 != null) {
            a17.z(this.f87019e);
        }
        java.util.List f17 = g95.e.f351334a.f(it);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it6 = ((java.util.ArrayList) f17).iterator();
        int i17 = 0;
        while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) next;
            if (hashSet.add(z3Var.d1())) {
                ti5.d dVar = new ti5.d(null, null, 0, 0, i17, 0, null, false, 239, null);
                ri5.h hVar = ri5.j.I;
                int i19 = ri5.j.Q;
                java.lang.String d17 = z3Var.d1();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
                ri5.j b17 = ti5.d.f501196i.b(rVar.m158354x19263085(), hVar.a(d17, i19, i17), z3Var, i19, dVar);
                if (dVar.f501201e == 0) {
                    b17.f477651o = true;
                    java.lang.String string = rVar.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ifw);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                    b17.f477652p = string;
                }
                arrayList.add(b17);
            }
            i17 = i18;
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k18 = rVar.V6().k();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k18, "getSelectContactRv(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe a18 = xm3.u0.a(k18);
        if (a18 != null) {
            a18.n(arrayList, false);
        }
        return jz5.f0.f384359a;
    }
}
