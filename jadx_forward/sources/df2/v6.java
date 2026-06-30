package df2;

/* loaded from: classes3.dex */
public final class v6 extends if2.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
        r45.xc2 xc2Var = new r45.xc2();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        sg2.a0 a0Var = sg2.a0.f489415a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(sg2.a0.f489417c);
        linkedList.addAll(arrayList);
        xc2Var.set(0, linkedList);
        if (tq5.i.f502802a == 0) {
            tq5.i.f502802a = 2014500;
        }
        xc2Var.set(1, java.lang.Long.valueOf(tq5.i.f502802a));
        dk2.ef.f314925k.e(18, xc2Var, new df2.u6(r45.yc2.class), false);
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveDeactivate */
    public void mo14860x9606ce3f() {
        super.mo14860x9606ce3f();
        dk2.ef.f314925k.f(18);
    }
}
