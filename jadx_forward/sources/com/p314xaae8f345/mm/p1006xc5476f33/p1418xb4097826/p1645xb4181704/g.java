package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes10.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f211779a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0 f211780b;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0 o0Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        this.f211780b = o0Var;
        this.f211779a = recyclerView;
    }

    public final void a(long j17, long j18, boolean z17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f211779a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0 o0Var = this.f211780b;
        if (j17 != 0) {
            int e17 = o0Var.f211859h.e();
            java.util.ArrayList arrayList = o0Var.f211859h.f211875a;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = arrayList.iterator();
            int i17 = -1;
            int i18 = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                jv2.d dVar = (jv2.d) next;
                if (dVar.f383740d.t0() == j17) {
                    i17 = i18;
                }
                if (dVar.f383740d.t0() == j17 || dVar.f383740d.A0() == j17) {
                    arrayList2.add(next);
                }
                i18 = i19;
            }
            int size = arrayList2.size();
            arrayList.removeAll(arrayList2);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(size);
            if (z17 && valueOf.intValue() >= 0 && valueOf.intValue() + valueOf2.intValue() <= e17 && (mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19()) != null) {
                mo7946xf939df19.m8154xdb81fc7f(valueOf.intValue(), valueOf2.intValue());
            }
        } else {
            java.util.ArrayList arrayList3 = o0Var.f211859h.f211875a;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.util.Iterator it6 = arrayList3.iterator();
            while (it6.hasNext()) {
                java.lang.Object next2 = it6.next();
                if (((jv2.d) next2).f383740d.f67480xf609be94 == j18) {
                    arrayList4.add(next2);
                }
            }
            arrayList3.removeAll(arrayList4);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192 = c1163xf1deaba4.mo7946xf939df19();
        if (mo7946xf939df192 != null) {
            mo7946xf939df192.m8146xced61ae5();
        }
    }
}
