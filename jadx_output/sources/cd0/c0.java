package cd0;

/* loaded from: classes5.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final cd0.c0 f40528a = new cd0.c0();

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0033, code lost:
    
        if (r6 > 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(int r15, com.tencent.mm.storage.f9 r16, int r17) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cd0.c0.b(int, com.tencent.mm.storage.f9, int):void");
    }

    public final void a(com.tencent.mm.storage.f9 msg, int i17) {
        w11.b1 b1Var;
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(msg.Q0(), msg.getMsgId());
        w11.c1 c1Var = w11.c1.f441989a;
        java.util.HashMap hashMap = w11.c1.f441990b;
        synchronized (hashMap) {
            b1Var = n17 != null ? (w11.b1) hashMap.get(new com.tencent.mm.plugin.msg.MsgIdTalker(n17.getMsgId(), n17.Q0())) : null;
        }
        boolean z17 = false;
        if (b1Var != null && b1Var.f441986d) {
            z17 = true;
        }
        b(z17 ? 3 : 2, n17, i17);
    }
}
