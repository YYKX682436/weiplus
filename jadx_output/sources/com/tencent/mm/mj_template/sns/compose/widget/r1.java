package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes5.dex */
public final class r1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.k96 f70207d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(r45.k96 k96Var) {
        super(0);
        this.f70207d = k96Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.k96 k96Var = this.f70207d;
        java.util.LinkedList linkedList = k96Var.f378522i;
        if (linkedList == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : linkedList) {
            if (((r45.l96) obj).f379257d >= k96Var.f378519f) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((r45.l96) it.next()).f379258e);
        }
        return arrayList2;
    }
}
