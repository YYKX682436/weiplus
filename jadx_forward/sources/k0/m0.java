package k0;

/* loaded from: classes14.dex */
public final class m0 implements s1.t0 {

    /* renamed from: a, reason: collision with root package name */
    public static final k0.m0 f384483a = new k0.m0();

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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(Layout, "$this$Layout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurables, "measurables");
        java.util.ArrayList arrayList = new java.util.ArrayList(measurables.size());
        int size = measurables.size();
        java.lang.Integer num = 0;
        for (int i17 = 0; i17 < size; i17++) {
            arrayList.add(((s1.r0) measurables.get(i17)).m(j17));
        }
        int size2 = arrayList.size();
        java.lang.Integer num2 = num;
        for (int i18 = 0; i18 < size2; i18++) {
            num2 = java.lang.Integer.valueOf(java.lang.Math.max(num2.intValue(), ((s1.o1) arrayList.get(i18)).f483583d));
        }
        int intValue = num2.intValue();
        int size3 = arrayList.size();
        for (int i19 = 0; i19 < size3; i19++) {
            num = java.lang.Integer.valueOf(java.lang.Math.max(num.intValue(), ((s1.o1) arrayList.get(i19)).f483584e));
        }
        return s1.v0.b(Layout, intValue, num.intValue(), null, new k0.l0(arrayList), 4, null);
    }

    @Override // s1.t0
    public int e(s1.u uVar, java.util.List list, int i17) {
        return s1.s0.b(this, uVar, list, i17);
    }
}
