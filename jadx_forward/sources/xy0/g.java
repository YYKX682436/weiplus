package xy0;

/* loaded from: classes5.dex */
public final class g extends g4.b4 {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f539675c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f539676d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f539677e;

    public g(java.lang.String keyword) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyword, "keyword");
        this.f539675c = keyword;
        this.f539676d = new java.util.ArrayList();
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // g4.b4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(g4.x3 r12, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r13) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xy0.g.b(g4.x3, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
