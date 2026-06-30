package kz0;

/* loaded from: classes5.dex */
public final class i extends g4.b4 {

    /* renamed from: c, reason: collision with root package name */
    public final dz0.g f395270c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f395271d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f395272e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f395273f;

    public i(dz0.g recommendInfoHolder, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recommendInfoHolder, "recommendInfoHolder");
        this.f395270c = recommendInfoHolder;
        this.f395271d = z17;
    }

    @Override // g4.b4
    public java.lang.Object a(g4.c4 state) {
        java.lang.Integer num;
        int intValue;
        java.lang.Integer num2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        java.lang.Integer num3 = state.f349775b;
        if (num3 != null) {
            g4.z3 a17 = state.a(num3.intValue());
            if (a17 != null && (num2 = (java.lang.Integer) a17.f350187b) != null) {
                intValue = num2.intValue() + 1;
            } else if (a17 != null && (num = (java.lang.Integer) a17.f350188c) != null) {
                intValue = num.intValue() - 1;
            }
            return java.lang.Integer.valueOf(intValue);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x012e A[LOOP:0: B:22:0x0128->B:24:0x012e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // g4.b4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(g4.x3 r12, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r13) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kz0.i.b(g4.x3, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
