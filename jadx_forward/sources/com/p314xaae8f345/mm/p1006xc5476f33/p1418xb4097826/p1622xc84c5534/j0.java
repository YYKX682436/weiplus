package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes10.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.j0 f206616a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.j0();

    /* renamed from: b, reason: collision with root package name */
    public static final android.util.ArrayMap f206617b = new android.util.ArrayMap();

    /* renamed from: c, reason: collision with root package name */
    public static long f206618c;

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f a(android.view.View view) {
        if (view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f) view;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f c15343x638a173f = null;
        android.view.ViewGroup viewGroup = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.j0 j0Var = f206616a;
                android.view.View childAt = viewGroup.getChildAt(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(childAt, "getChildAt(...)");
                c15343x638a173f = j0Var.a(childAt);
                if (c15343x638a173f != null) {
                    break;
                }
            }
        }
        return c15343x638a173f;
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 b(android.view.View view) {
        if (view instanceof com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) {
            return (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) view;
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = null;
        android.view.ViewGroup viewGroup = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.j0 j0Var = f206616a;
                android.view.View childAt = viewGroup.getChildAt(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(childAt, "getChildAt(...)");
                c22801x87cbdc00 = j0Var.b(childAt);
                if (c22801x87cbdc00 != null) {
                    break;
                }
            }
        }
        return c22801x87cbdc00;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.g0 c(int i17, boolean z17) {
        android.util.ArrayMap arrayMap = f206617b;
        if (!z17) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.g0) arrayMap.get(java.lang.Integer.valueOf(i17));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.g0 g0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.g0();
        arrayMap.put(java.lang.Integer.valueOf(i17), g0Var);
        return g0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(int r21, android.app.Activity r22) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.j0.d(int, android.app.Activity):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if ((r7.f206572e == 0 || r7.f206573f == 0) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(int r7) {
        /*
            r6 = this;
            r0 = 0
            com.tencent.mm.plugin.finder.report.g0 r7 = r6.c(r7, r0)
            r1 = 0
            if (r7 == 0) goto L1a
            long r2 = r7.f206572e
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L16
            long r2 = r7.f206573f
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L17
        L16:
            r0 = 1
        L17:
            if (r0 == 0) goto L1a
            goto L1b
        L1a:
            r7 = r1
        L1b:
            if (r7 != 0) goto L1e
            goto L24
        L1e:
            long r0 = c01.id.c()
            r7.f206573f = r0
        L24:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.j0.e(int):void");
    }

    public final void f(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.g0 c17 = c(i17, false);
        if (c17 != null) {
            if (!(c17.f206572e == 0)) {
                c17 = null;
            }
            if (c17 != null) {
                c17.f206572e = c01.id.c();
                c17.f206573f = 0L;
            }
        }
    }

    public final void g(android.view.View parentView, android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentView, "parentView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 b17 = b(parentView);
        if (b17 != null) {
            b17.m82705x43329a9b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.i0(activity));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f a17 = a(parentView);
        if (a17 != null) {
            a17.m62369x9b8c960c(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.h0(activity));
        }
    }
}
