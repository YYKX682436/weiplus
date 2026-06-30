package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes8.dex */
public final class y7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13991x36464073 f192291d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13991x36464073 activityC13991x36464073) {
        super(3);
        this.f192291d = activityC13991x36464073;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        ((java.lang.Number) obj).intValue();
        ((java.lang.Number) obj2).intValue();
        r45.vl3 resp = (r45.vl3) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13991x36464073 activityC13991x36464073 = this.f192291d;
        bm2.f1 f1Var = activityC13991x36464073.f190878z;
        java.util.LinkedList m75941xfb821914 = resp.m75941xfb821914(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getList(...)");
        f1Var.getClass();
        int size = f1Var.f103414d.size();
        f1Var.f103414d.addAll(m75941xfb821914);
        f1Var.m8153xd399a4d9(size, m75941xfb821914.size());
        com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x22587864 = activityC13991x36464073.f190874v;
        if (c22851x22587864 != null) {
            c22851x22587864.e(true);
            return jz5.f0.f384359a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("refreshLayout");
        throw null;
    }
}
