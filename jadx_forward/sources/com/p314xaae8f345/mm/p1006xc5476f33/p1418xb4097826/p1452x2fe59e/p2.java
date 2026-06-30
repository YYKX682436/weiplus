package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class p2 {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f190227a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 f190228b;

    public p2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        this.f190228b = a7Var;
        this.f190227a = recyclerView;
    }

    public final void a(long j17, long j18, boolean z17) {
        yw2.a0 a0Var;
        yw2.a0 a0Var2;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f190227a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var = this.f190228b;
        if (j17 != 0) {
            int h17 = a7Var.f187743g.h();
            jz5.l c17 = a7Var.f187743g.c(j17);
            if (z17) {
                java.lang.Object obj = c17.f384366d;
                if (((java.lang.Number) obj).intValue() >= 0) {
                    int intValue = ((java.lang.Number) obj).intValue();
                    java.lang.Object obj2 = c17.f384367e;
                    if (intValue + ((java.lang.Number) obj2).intValue() <= h17 && (mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19()) != null) {
                        mo7946xf939df19.m8154xdb81fc7f(((java.lang.Number) obj).intValue(), ((java.lang.Number) obj2).intValue());
                    }
                }
            }
        } else {
            java.util.ArrayList arrayList = a7Var.f187743g.f190002d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                if (((so2.y0) next).f492236d.f68961xf609be94 == j18) {
                    arrayList2.add(next);
                }
            }
            arrayList.removeAll(arrayList2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.y yVar = a7Var.f187743g;
        if (yVar.f190001c == null) {
            if (yVar.h() == 0 && (a0Var2 = a7Var.f187749o) != null) {
                a0Var2.x();
            }
        } else if (yVar.h() == 1 && (a0Var = a7Var.f187749o) != null) {
            a0Var.x();
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192 = c1163xf1deaba4.mo7946xf939df19();
        if (mo7946xf939df192 != null) {
            mo7946xf939df192.m8146xced61ae5();
        }
    }

    public final boolean b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 target, int i17) {
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.y yVar = this.f190228b.f187743g;
        yVar.getClass();
        long t07 = target.t0();
        java.util.ArrayList arrayList = yVar.f190002d;
        if (t07 == 0) {
            java.util.Iterator it = arrayList.iterator();
            i18 = 0;
            while (it.hasNext()) {
                if (((so2.y0) it.next()).f492236d.f68961xf609be94 == target.f68961xf609be94) {
                    break;
                }
                i18++;
            }
            i18 = -1;
        } else {
            java.util.Iterator it6 = arrayList.iterator();
            i18 = 0;
            while (it6.hasNext()) {
                if (((so2.y0) it6.next()).f492236d.t0() == target.t0()) {
                    break;
                }
                i18++;
            }
            i18 = -1;
        }
        if (i18 >= 0 && i18 < arrayList.size()) {
            so2.y0 y0Var = (so2.y0) arrayList.get(i18);
            y0Var.getClass();
            y0Var.f492236d = target;
        }
        int intValue = java.lang.Integer.valueOf(i18).intValue();
        if (intValue >= 0) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f190227a;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19();
            if (intValue < (mo7946xf939df19 != null ? mo7946xf939df19.mo1894x7e414b06() : 0)) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192 = c1163xf1deaba4.mo7946xf939df19();
                if (mo7946xf939df192 != null) {
                    mo7946xf939df192.m8148xed6e4d18(intValue, java.lang.Integer.valueOf(i17));
                }
                return true;
            }
        }
        return false;
    }
}
