package s1;

/* loaded from: classes14.dex */
public final class w1 extends u1.d0 {

    /* renamed from: b, reason: collision with root package name */
    public static final s1.w1 f483623b = new s1.w1();

    public w1() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // s1.t0
    public s1.u0 d(s1.x0 measure, java.util.List measurables, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measure, "$this$measure");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurables, "measurables");
        if (measurables.isEmpty()) {
            return s1.v0.b(measure, p2.c.j(j17), p2.c.i(j17), null, s1.t1.f483608d, 4, null);
        }
        if (measurables.size() == 1) {
            s1.o1 m17 = ((s1.r0) measurables.get(0)).m(j17);
            return s1.v0.b(measure, p2.d.e(j17, m17.f483583d), p2.d.d(j17, m17.f483584e), null, new s1.u1(m17), 4, null);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(measurables.size());
        int size = measurables.size();
        for (int i17 = 0; i17 < size; i17++) {
            arrayList.add(((s1.r0) measurables.get(i17)).m(j17));
        }
        int size2 = arrayList.size();
        int i18 = 0;
        int i19 = 0;
        for (int i27 = 0; i27 < size2; i27++) {
            s1.o1 o1Var = (s1.o1) arrayList.get(i27);
            i18 = java.lang.Math.max(o1Var.f483583d, i18);
            i19 = java.lang.Math.max(o1Var.f483584e, i19);
        }
        return s1.v0.b(measure, p2.d.e(j17, i18), p2.d.d(j17, i19), null, new s1.v1(arrayList), 4, null);
    }
}
