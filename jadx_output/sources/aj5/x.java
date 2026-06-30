package aj5;

/* loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aj5.a0 f5525d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aj5.y f5526e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(aj5.a0 a0Var, aj5.y yVar) {
        super(1);
        this.f5525d = a0Var;
        this.f5526e = yVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List it = (java.util.List) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactRecommendUIC", "relatedUserSearchResultListener: resultSize: " + it.size());
        aj5.a0 a0Var = this.f5525d;
        com.tencent.mm.view.recyclerview.WxRecyclerView k17 = a0Var.V6().k();
        kotlin.jvm.internal.o.f(k17, "getSelectContactRv(...)");
        com.tencent.mm.plugin.mvvmlist.MvvmList a17 = xm3.u0.a(k17);
        if (a17 != null) {
            a17.z(this.f5526e);
        }
        java.util.List f17 = g95.e.f269801a.f(it);
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
            com.tencent.mm.storage.z3 z3Var = (com.tencent.mm.storage.z3) next;
            if (hashSet.add(z3Var.d1())) {
                ti5.d dVar = new ti5.d(null, null, 0, 0, i17, 0, null, false, 239, null);
                ri5.h hVar = ri5.j.I;
                int i19 = ri5.j.Q;
                java.lang.String d17 = z3Var.d1();
                kotlin.jvm.internal.o.f(d17, "getUsername(...)");
                ri5.j b17 = ti5.d.f419663i.b(a0Var.getActivity(), hVar.a(d17, i19, i17), z3Var, i19, dVar);
                if (dVar.f419668e == 0) {
                    b17.f396118o = true;
                    java.lang.String string = a0Var.getActivity().getString(com.tencent.mm.R.string.ifw);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                    b17.f396119p = string;
                }
                arrayList.add(b17);
            }
            i17 = i18;
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView k18 = a0Var.V6().k();
        kotlin.jvm.internal.o.f(k18, "getSelectContactRv(...)");
        com.tencent.mm.plugin.mvvmlist.MvvmList a18 = xm3.u0.a(k18);
        if (a18 != null) {
            a18.n(arrayList, false);
        }
        return jz5.f0.f302826a;
    }
}
