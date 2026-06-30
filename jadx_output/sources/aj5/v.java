package aj5;

/* loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aj5.a0 f5521d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aj5.w f5522e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(aj5.a0 a0Var, aj5.w wVar) {
        super(1);
        this.f5521d = a0Var;
        this.f5522e = wVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List it = (java.util.List) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactRecommendUIC", "commonChatroomSearchResultListener: resultSize: " + it.size());
        aj5.a0 a0Var = this.f5521d;
        com.tencent.mm.view.recyclerview.WxRecyclerView k17 = a0Var.V6().k();
        kotlin.jvm.internal.o.f(k17, "getSelectContactRv(...)");
        com.tencent.mm.plugin.mvvmlist.MvvmList a17 = xm3.u0.a(k17);
        if (a17 != null) {
            a17.z(this.f5522e);
        }
        java.util.List f17 = g95.e.f269801a.f(it);
        java.util.List a18 = g95.b.f269794a.a(it);
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
            com.tencent.mm.storage.a3 a3Var = (com.tencent.mm.storage.a3) kz5.n0.a0(a18, i17);
            if (a3Var != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.lang.String P0 = z3Var.P0();
                if (P0 == null) {
                    P0 = "";
                }
                sb6.append(P0);
                sb6.append(a3Var.field_memberlist);
                if (hashSet.add(sb6.toString())) {
                    ti5.d dVar = new ti5.d(null, null, 0, 0, i17, 0, null, false, 239, null);
                    ri5.h hVar = ri5.j.I;
                    int i19 = ri5.j.P;
                    java.lang.String d17 = z3Var.d1();
                    kotlin.jvm.internal.o.f(d17, "getUsername(...)");
                    ri5.j b17 = ti5.d.f419663i.b(a0Var.getActivity(), hVar.a(d17, i19, i17), z3Var, i19, dVar);
                    if (dVar.f419668e == 0) {
                        b17.f396118o = true;
                        java.lang.String string = a0Var.getActivity().getString(com.tencent.mm.R.string.ifx);
                        kotlin.jvm.internal.o.f(string, "getString(...)");
                        b17.f396119p = string;
                    }
                    arrayList.add(b17);
                }
            }
            i17 = i18;
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView k18 = a0Var.V6().k();
        kotlin.jvm.internal.o.f(k18, "getSelectContactRv(...)");
        com.tencent.mm.plugin.mvvmlist.MvvmList a19 = xm3.u0.a(k18);
        if (a19 != null) {
            a19.n(arrayList, false);
        }
        return jz5.f0.f302826a;
    }
}
