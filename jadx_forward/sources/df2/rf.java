package df2;

/* loaded from: classes3.dex */
public final class rf extends if2.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        java.util.Collections.synchronizedList(new java.util.ArrayList());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
        super.mo8997x8001c97e();
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveDeactivate */
    public void mo14860x9606ce3f() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List list = ((mm2.x4) getStore().m56796xbba4bfc0(mm2.x4.class)).f411061f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-msgList>(...)");
        arrayList.addAll(list);
        dk2.q5 q5Var = dk2.q5.f315472a;
        pm0.v.w(new dk2.m5(((mm2.e1) getStore().m56796xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0), arrayList));
        super.mo14860x9606ce3f();
    }
}
