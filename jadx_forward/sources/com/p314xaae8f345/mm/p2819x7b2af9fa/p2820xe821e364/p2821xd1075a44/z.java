package com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44;

/* loaded from: classes15.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.ThreadLocal f296255h = new java.lang.ThreadLocal();

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.Comparator f296256i = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.w();

    /* renamed from: e, reason: collision with root package name */
    public long f296258e;

    /* renamed from: f, reason: collision with root package name */
    public long f296259f;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f296257d = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f296260g = new java.util.ArrayList();

    public void a(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4, int i17, int i18) {
        if (c22949xf1deaba4.isAttachedToWindow()) {
            if (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.Y1 && !this.f296257d.contains(c22949xf1deaba4)) {
                throw new java.lang.IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f296258e == 0) {
                this.f296258e = c22949xf1deaba4.m83602xebd10517();
                c22949xf1deaba4.post(this);
            }
        }
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.x xVar = c22949xf1deaba4.E1;
        xVar.f296219a = i17;
        xVar.f296220b = i18;
    }

    public void b(long j17) {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y yVar;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba42;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y yVar2;
        java.util.ArrayList arrayList = this.f296257d;
        int size = arrayList.size();
        int i17 = 0;
        for (int i18 = 0; i18 < size; i18++) {
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba43 = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4) arrayList.get(i18);
            if (c22949xf1deaba43.getWindowVisibility() == 0) {
                com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.x xVar = c22949xf1deaba43.E1;
                xVar.b(c22949xf1deaba43, false);
                i17 += xVar.f296222d;
            }
        }
        java.util.ArrayList arrayList2 = this.f296260g;
        arrayList2.ensureCapacity(i17);
        int i19 = 0;
        for (int i27 = 0; i27 < size; i27++) {
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba44 = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4) arrayList.get(i27);
            if (c22949xf1deaba44.getWindowVisibility() == 0) {
                com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.x xVar2 = c22949xf1deaba44.E1;
                int abs = java.lang.Math.abs(xVar2.f296219a) + java.lang.Math.abs(xVar2.f296220b);
                for (int i28 = 0; i28 < xVar2.f296222d * 2; i28 += 2) {
                    if (i19 >= arrayList2.size()) {
                        yVar2 = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y();
                        arrayList2.add(yVar2);
                    } else {
                        yVar2 = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y) arrayList2.get(i19);
                    }
                    int[] iArr = xVar2.f296221c;
                    int i29 = iArr[i28 + 1];
                    yVar2.f296230a = i29 <= abs;
                    yVar2.f296231b = abs;
                    yVar2.f296232c = i29;
                    yVar2.f296233d = c22949xf1deaba44;
                    yVar2.f296234e = iArr[i28];
                    i19++;
                }
            }
        }
        java.util.Collections.sort(arrayList2, f296256i);
        for (int i37 = 0; i37 < arrayList2.size() && (c22949xf1deaba4 = (yVar = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y) arrayList2.get(i37)).f296233d) != null; i37++) {
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 c17 = c(c22949xf1deaba4, yVar.f296234e, yVar.f296230a ? com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697 : j17);
            if (c17 != null && c17.f296237e != null && c17.h() && !c17.j() && (c22949xf1deaba42 = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4) c17.f296237e.get()) != null) {
                if (c22949xf1deaba42.I && c22949xf1deaba42.f295935i.h() != 0) {
                    com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.b1 b1Var = c22949xf1deaba42.S;
                    if (b1Var != null) {
                        b1Var.e();
                    }
                    com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.g1 g1Var = c22949xf1deaba42.f295946t;
                    com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.n1 n1Var = c22949xf1deaba42.f295932f;
                    if (g1Var != null) {
                        g1Var.v(n1Var);
                        c22949xf1deaba42.f295946t.w(n1Var);
                    }
                    n1Var.f296121a.clear();
                    n1Var.e();
                }
                com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.x xVar3 = c22949xf1deaba42.E1;
                xVar3.b(c22949xf1deaba42, true);
                if (xVar3.f296222d != 0) {
                    try {
                        java.lang.reflect.Method method = j3.v.f378876b;
                        j3.t.a("RV Nested Prefetch");
                        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.u1 u1Var = c22949xf1deaba42.F1;
                        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.u0 u0Var = c22949xf1deaba42.f295945s;
                        u1Var.f296182d = 1;
                        u1Var.f296183e = u0Var.a();
                        u1Var.f296185g = false;
                        u1Var.f296186h = false;
                        u1Var.f296187i = false;
                        for (int i38 = 0; i38 < xVar3.f296222d * 2; i38 += 2) {
                            c(c22949xf1deaba42, xVar3.f296221c[i38], j17);
                        }
                        j3.t.b();
                        yVar.f296230a = false;
                        yVar.f296231b = 0;
                        yVar.f296232c = 0;
                        yVar.f296233d = null;
                        yVar.f296234e = 0;
                    } catch (java.lang.Throwable th6) {
                        java.lang.reflect.Method method2 = j3.v.f378876b;
                        j3.t.b();
                        throw th6;
                    }
                }
            }
            yVar.f296230a = false;
            yVar.f296231b = 0;
            yVar.f296232c = 0;
            yVar.f296233d = null;
            yVar.f296234e = 0;
        }
    }

    public final com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 c(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4, int i17, long j17) {
        boolean z17;
        int h17 = c22949xf1deaba4.f295935i.h();
        int i18 = 0;
        while (true) {
            if (i18 >= h17) {
                z17 = false;
                break;
            }
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 K = com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.K(c22949xf1deaba4.f295935i.g(i18));
            if (K.f296238f == i17 && !K.j()) {
                z17 = true;
                break;
            }
            i18++;
        }
        if (z17) {
            return null;
        }
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.n1 n1Var = c22949xf1deaba4.f295932f;
        try {
            c22949xf1deaba4.P();
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 j18 = n1Var.j(i17, false, j17);
            if (j18 != null) {
                if (!j18.h() || j18.j()) {
                    n1Var.a(j18, false);
                } else {
                    n1Var.g(j18.f296236d);
                }
            }
            return j18;
        } finally {
            c22949xf1deaba4.Q(false);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            java.lang.reflect.Method method = j3.v.f378876b;
            j3.t.a("RV Prefetch");
            java.util.ArrayList arrayList = this.f296257d;
            if (arrayList.isEmpty()) {
                this.f296258e = 0L;
                j3.t.b();
                return;
            }
            int size = arrayList.size();
            long j17 = 0;
            for (int i17 = 0; i17 < size; i17++) {
                com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4) arrayList.get(i17);
                if (c22949xf1deaba4.getWindowVisibility() == 0) {
                    j17 = java.lang.Math.max(c22949xf1deaba4.getDrawingTime(), j17);
                }
            }
            if (j17 == 0) {
                this.f296258e = 0L;
                j3.t.b();
            } else {
                b(java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(j17) + this.f296259f);
                this.f296258e = 0L;
                j3.t.b();
            }
        } catch (java.lang.Throwable th6) {
            this.f296258e = 0L;
            java.lang.reflect.Method method2 = j3.v.f378876b;
            j3.t.b();
            throw th6;
        }
    }
}
