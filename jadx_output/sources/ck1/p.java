package ck1;

/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f42360a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f42361b;

    public p(r45.uf7 usageInfo) {
        java.util.ArrayList arrayList;
        ck1.n nVar;
        kotlin.jvm.internal.o.g(usageInfo, "usageInfo");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.f42361b = arrayList2;
        r45.vf7 wxa_item = usageInfo.f387341d;
        kotlin.jvm.internal.o.f(wxa_item, "wxa_item");
        arrayList2.add(new ck1.l(wxa_item));
        java.util.LinkedList<r45.kv5> linkedList = usageInfo.f387341d.f388196g;
        if (linkedList != null) {
            for (r45.kv5 kv5Var : linkedList) {
                if (kv5Var != null) {
                    java.util.ArrayList arrayList3 = this.f42361b;
                    r45.vf7 wxa_item2 = usageInfo.f387341d;
                    kotlin.jvm.internal.o.f(wxa_item2, "wxa_item");
                    arrayList3.add(new ck1.n(new ck1.t0(wxa_item2, null, kv5Var)));
                }
            }
        }
        java.util.LinkedList<r45.vf7> linkedList2 = usageInfo.f387342e;
        if (linkedList2 != null) {
            for (r45.vf7 vf7Var : linkedList2) {
                if (vf7Var != null) {
                    java.util.LinkedList<r45.kv5> linkedList3 = vf7Var.f388196g;
                    if (linkedList3 != null) {
                        arrayList = new java.util.ArrayList();
                        for (r45.kv5 kv5Var2 : linkedList3) {
                            if (kv5Var2 != null) {
                                r45.vf7 wxa_item3 = usageInfo.f387341d;
                                kotlin.jvm.internal.o.f(wxa_item3, "wxa_item");
                                nVar = new ck1.n(new ck1.t0(wxa_item3, vf7Var, kv5Var2));
                            } else {
                                nVar = null;
                            }
                            if (nVar != null) {
                                arrayList.add(nVar);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    if (!(arrayList == null || arrayList.isEmpty())) {
                        java.util.ArrayList arrayList4 = this.f42361b;
                        java.lang.String str = vf7Var.f388194e;
                        arrayList4.add(new ck1.m(str == null ? "" : str));
                        this.f42361b.addAll(arrayList);
                    }
                }
            }
        }
        this.f42360a = this.f42361b.size();
    }
}
