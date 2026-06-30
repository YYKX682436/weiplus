package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1;

/* loaded from: classes2.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.e0 f186820d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qj2 f186821e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.e0 e0Var, r45.qj2 qj2Var) {
        super(1);
        this.f186820d = e0Var;
        this.f186821e = qj2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.e0 e0Var;
        r45.yj2 resp = (r45.yj2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.util.Iterator it = resp.m75941xfb821914(1).iterator();
        int i17 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            e0Var = this.f186820d;
            if (!hasNext) {
                break;
            }
            int i18 = i17 + 1;
            r45.kt4 kt4Var = (r45.kt4) it.next();
            java.util.LinkedList m75941xfb821914 = kt4Var.m75941xfb821914(3);
            if (m75941xfb821914 != null) {
                pm0.v.d0(m75941xfb821914, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.y(this.f186821e));
            }
            if (!(m75941xfb821914 == null || m75941xfb821914.isEmpty())) {
                java.util.ArrayList arrayList = e0Var.f186760q;
                int m75939xb282bd08 = kt4Var.m75939xb282bd08(0);
                java.lang.String string = m75939xb282bd08 != 1 ? m75939xb282bd08 != 2 ? "" : e0Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.oxe) : e0Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.oxd);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                arrayList.add(new zb2.d(null, true, string, i17, kt4Var.m75939xb282bd08(0)));
                java.util.ArrayList arrayList2 = e0Var.f186760q;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m75941xfb821914);
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
                java.util.Iterator it6 = m75941xfb821914.iterator();
                while (it6.hasNext()) {
                    arrayList3.add(new zb2.d((r45.fl5) it6.next(), false, "", 0L, kt4Var.m75939xb282bd08(0)));
                }
                arrayList2.addAll(arrayList3);
            }
            i17 = i18;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = e0Var.f186756m;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recommendRv");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19();
        if (mo7946xf939df19 != null) {
            mo7946xf939df19.m8146xced61ae5();
        }
        return jz5.f0.f384359a;
    }
}
