package com.p314xaae8f345.p3210x3857dc;

/* loaded from: classes13.dex */
public class m0 extends com.p314xaae8f345.p3210x3857dc.i0 {
    @Override // com.p314xaae8f345.p3210x3857dc.i0
    public void a(com.p314xaae8f345.p3210x3857dc.e0 e0Var, java.util.concurrent.Executor executor, java.lang.Runnable runnable) {
        java.util.List unmodifiableList = java.util.Collections.unmodifiableList(e0Var.f301791a);
        java.util.List unmodifiableList2 = java.util.Collections.unmodifiableList(e0Var.f301792b);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i17 = 0; i17 < unmodifiableList.size(); i17++) {
            if (((com.p314xaae8f345.p3210x3857dc.d0) unmodifiableList.get(i17)).f301770a.equals("http")) {
                arrayList.add(new y4.c("http", ((com.p314xaae8f345.p3210x3857dc.d0) unmodifiableList.get(i17)).f301771b));
            }
            if (((com.p314xaae8f345.p3210x3857dc.d0) unmodifiableList.get(i17)).f301770a.equals("https")) {
                arrayList.add(new y4.c("https", ((com.p314xaae8f345.p3210x3857dc.d0) unmodifiableList.get(i17)).f301771b));
            }
            if (((com.p314xaae8f345.p3210x3857dc.d0) unmodifiableList.get(i17)).f301770a.equals("*")) {
                arrayList.add(new y4.c("*", ((com.p314xaae8f345.p3210x3857dc.d0) unmodifiableList.get(i17)).f301771b));
            }
        }
        for (int i18 = 0; i18 < unmodifiableList2.size(); i18++) {
            arrayList2.add((java.lang.String) unmodifiableList2.get(i18));
        }
        if (!y4.n.a("PROXY_OVERRIDE")) {
            throw new java.lang.UnsupportedOperationException("Proxy override not supported");
        }
        z4.v vVar = (z4.v) y4.d.f540807a;
        z4.d dVar = z4.e0.f551595d;
        z4.d dVar2 = z4.e0.f551597f;
        java.util.List unmodifiableList3 = java.util.Collections.unmodifiableList(arrayList);
        java.lang.String[][] strArr = (java.lang.String[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.String.class, unmodifiableList3.size(), 2);
        for (int i19 = 0; i19 < unmodifiableList3.size(); i19++) {
            strArr[i19][0] = ((y4.c) unmodifiableList3.get(i19)).f540805a;
            strArr[i19][1] = ((y4.c) unmodifiableList3.get(i19)).f540806b;
        }
        java.lang.String[] strArr2 = (java.lang.String[]) java.util.Collections.unmodifiableList(arrayList2).toArray(new java.lang.String[0]);
        if (dVar.b()) {
            if (vVar.f551610a == null) {
                vVar.f551610a = z4.g0.f551600a.mo178385xcc222a74();
            }
            vVar.f551610a.m154356x60051f18(strArr, strArr2, runnable, executor);
        } else {
            if (!dVar.b() || !dVar2.b()) {
                throw z4.e0.a();
            }
            if (vVar.f551610a == null) {
                vVar.f551610a = z4.g0.f551600a.mo178385xcc222a74();
            }
            vVar.f551610a.m154357x60051f18(strArr, strArr2, runnable, executor, false);
        }
    }
}
