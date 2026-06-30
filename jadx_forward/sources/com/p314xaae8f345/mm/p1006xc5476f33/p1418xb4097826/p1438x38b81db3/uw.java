package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes8.dex */
public final class uw implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f186277a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f186278b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f186279c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f186280d;

    public uw(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.util.ArrayList arrayList, com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00, android.content.Context context) {
        this.f186277a = h0Var;
        this.f186278b = arrayList;
        this.f186279c = c22801x87cbdc00;
        this.f186280d = context;
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
            this.f186277a.f391656d = n81Var.m75934xbce7f2f(2);
            java.util.ArrayList arrayList = this.f186278b;
            int size = arrayList.size();
            r45.wg2 wg2Var = (r45.wg2) ((r45.n81) fVar.f152151d).m75936x14adae67(1);
            int i17 = 0;
            if (wg2Var != null && (m75941xfb8219143 = wg2Var.m75941xfb821914(0)) != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (r45.pg2 pg2Var : m75941xfb8219143) {
                    cu2.a0 a0Var = cu2.b0.f303904a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(pg2Var);
                    arrayList2.add(a0Var.k(1, pg2Var, xy2.c.e(this.f186280d)));
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(new so2.y((dm.pd) it.next()));
                }
                arrayList.addAll(arrayList3);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadmore mentionList: ");
            r45.wg2 wg2Var2 = (r45.wg2) ((r45.n81) fVar.f152151d).m75936x14adae67(1);
            sb6.append((wg2Var2 == null || (m75941xfb8219142 = wg2Var2.m75941xfb821914(0)) == null) ? null : java.lang.Integer.valueOf(m75941xfb8219142.size()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSupportAggregatedMsgConvert", sb6.toString());
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f186279c;
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
