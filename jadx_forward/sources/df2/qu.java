package df2;

/* loaded from: classes3.dex */
public final class qu extends if2.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qu(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        r45.zc2 zc2Var = new r45.zc2();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (dk2.ef.f314905a.e() != null) {
            linkedList.add(4);
            linkedList.add(5);
            linkedList.add(6);
        }
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        zc2Var.set(0, linkedList);
        dk2.ef.f314925k.e(29, zc2Var, new df2.pu(this, r45.ad2.class), false);
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        dk2.ef.f314925k.f(29);
    }
}
