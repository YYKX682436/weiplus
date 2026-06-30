package s2;

/* loaded from: classes14.dex */
public final class u implements s1.t0 {

    /* renamed from: a, reason: collision with root package name */
    public static final s2.u f483786a = new s2.u();

    @Override // s1.t0
    public int a(s1.u uVar, java.util.List list, int i17) {
        return s1.s0.d(this, uVar, list, i17);
    }

    @Override // s1.t0
    public int b(s1.u uVar, java.util.List list, int i17) {
        return s1.s0.a(this, uVar, list, i17);
    }

    @Override // s1.t0
    public int c(s1.u uVar, java.util.List list, int i17) {
        return s1.s0.c(this, uVar, list, i17);
    }

    @Override // s1.t0
    public final s1.u0 d(s1.x0 Layout, java.util.List measurables, long j17) {
        int i17;
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(Layout, "$this$Layout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurables, "measurables");
        int size = measurables.size();
        if (size == 0) {
            return s1.v0.b(Layout, 0, 0, null, s2.r.f483783d, 4, null);
        }
        int i19 = 0;
        if (size == 1) {
            s1.o1 m17 = ((s1.r0) measurables.get(0)).m(j17);
            return s1.v0.b(Layout, m17.f483583d, m17.f483584e, null, new s2.s(m17), 4, null);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(measurables.size());
        int size2 = measurables.size();
        for (int i27 = 0; i27 < size2; i27++) {
            arrayList.add(((s1.r0) measurables.get(i27)).m(j17));
        }
        int h17 = kz5.c0.h(arrayList);
        if (h17 >= 0) {
            int i28 = 0;
            int i29 = 0;
            while (true) {
                s1.o1 o1Var = (s1.o1) arrayList.get(i19);
                i28 = java.lang.Math.max(i28, o1Var.f483583d);
                i29 = java.lang.Math.max(i29, o1Var.f483584e);
                if (i19 == h17) {
                    break;
                }
                i19++;
            }
            i17 = i28;
            i18 = i29;
        } else {
            i17 = 0;
            i18 = 0;
        }
        return s1.v0.b(Layout, i17, i18, null, new s2.t(arrayList), 4, null);
    }

    @Override // s1.t0
    public int e(s1.u uVar, java.util.List list, int i17) {
        return s1.s0.b(this, uVar, list, i17);
    }
}
