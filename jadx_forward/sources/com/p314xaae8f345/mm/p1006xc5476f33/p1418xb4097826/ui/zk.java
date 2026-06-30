package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes8.dex */
public final class zk implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f211643a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15084x4121bf5 f211644b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f211645c;

    public zk(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15084x4121bf5 activityC15084x4121bf5, com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00) {
        this.f211643a = h0Var;
        this.f211644b = activityC15084x4121bf5;
        this.f211645c = c22801x87cbdc00;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.util.LinkedList m75941xfb821914;
        java.util.LinkedList m75941xfb8219142;
        java.util.LinkedList<r45.pg2> m75941xfb8219143;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            r45.n81 n81Var = (r45.n81) fVar.f152151d;
            this.f211643a.f391656d = n81Var.m75934xbce7f2f(2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15084x4121bf5 activityC15084x4121bf5 = this.f211644b;
            int size = activityC15084x4121bf5.f210332t.size();
            r45.wg2 wg2Var = (r45.wg2) ((r45.n81) fVar.f152151d).m75936x14adae67(1);
            java.util.ArrayList arrayList = activityC15084x4121bf5.f210332t;
            int i17 = 0;
            if (wg2Var != null && (m75941xfb8219143 = wg2Var.m75941xfb821914(0)) != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (r45.pg2 pg2Var : m75941xfb8219143) {
                    cu2.a0 a0Var = cu2.b0.f303904a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(pg2Var);
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC15084x4121bf5.mo55332x76847179();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
                    arrayList2.add(a0Var.k(1, pg2Var, xy2.c.e(mo55332x76847179)));
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(new so2.o3((dm.pd) it.next()));
                }
                arrayList.addAll(arrayList3);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadmore mentionList: ");
            r45.wg2 wg2Var2 = (r45.wg2) ((r45.n81) fVar.f152151d).m75936x14adae67(1);
            sb6.append((wg2Var2 == null || (m75941xfb8219142 = wg2Var2.m75941xfb821914(0)) == null) ? null : java.lang.Integer.valueOf(m75941xfb8219142.size()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSupportAggregatedMsgConvert", sb6.toString());
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f211645c;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c22801x87cbdc00.m82555x4905e9fa().mo7946xf939df19();
            if (mo7946xf939df19 != null) {
                mo7946xf939df19.m8153xd399a4d9(size, arrayList.size() - size);
            }
            if (n81Var.m75939xb282bd08(6) == 1) {
                r45.wg2 wg2Var3 = (r45.wg2) n81Var.m75936x14adae67(1);
                if (wg2Var3 != null && (m75941xfb821914 = wg2Var3.m75941xfb821914(0)) != null) {
                    i17 = m75941xfb821914.size();
                }
                c22801x87cbdc00.N(i17);
            } else {
                com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.I(c22801x87cbdc00, null, 1, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
