package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes2.dex */
public final class v4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f206937a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f206938b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f206939c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f206940d;

    public v4(java.util.LinkedList linkedList, java.util.LinkedList linkedList2, r45.qt2 qt2Var, int i17) {
        this.f206937a = linkedList;
        this.f206938b = linkedList2;
        this.f206939c = qt2Var;
        this.f206940d = i17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152149b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.w4 w4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.w4.f206955a;
        r45.qt2 qt2Var = this.f206939c;
        java.util.LinkedList linkedList = this.f206938b;
        java.util.LinkedList linkedList2 = this.f206937a;
        if (i17 == 0 && fVar.f152148a == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.StatLogicReporter", "successfully! size=" + linkedList2.size());
            w4Var.b(linkedList, qt2Var, 0);
        } else {
            int i18 = this.f206940d;
            if (i18 <= 2) {
                linkedList.addAll(0, linkedList2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.StatLogicReporter", "failure! try next time, size=" + linkedList2.size());
                w4Var.b(linkedList, qt2Var, i18 + 1);
            } else {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tryCount=");
                sb6.append(i18);
                sb6.append(", throw this sendList=");
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList2, 10));
                java.util.Iterator it = linkedList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(pm0.v.u(((r45.vd6) it.next()).m75942xfb822ef2(0)));
                }
                sb6.append(arrayList);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.StatLogicReporter", sb6.toString());
            }
        }
        return jz5.f0.f384359a;
    }
}
