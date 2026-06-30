package cd0;

/* loaded from: classes5.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final cd0.c0 f122061a = new cd0.c0();

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0033, code lost:
    
        if (r6 > 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(int r15, com.p314xaae8f345.mm.p2621x8fb0427b.f9 r16, int r17) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cd0.c0.b(int, com.tencent.mm.storage.f9, int):void");
    }

    public final void a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, int i17) {
        w11.b1 b1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = pt0.f0.f439742b1.n(msg.Q0(), msg.m124847x74d37ac6());
        w11.c1 c1Var = w11.c1.f523522a;
        java.util.HashMap hashMap = w11.c1.f523523b;
        synchronized (hashMap) {
            b1Var = n17 != null ? (w11.b1) hashMap.get(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(n17.m124847x74d37ac6(), n17.Q0())) : null;
        }
        boolean z17 = false;
        if (b1Var != null && b1Var.f523519d) {
            z17 = true;
        }
        b(z17 ? 3 : 2, n17, i17);
    }
}
