package bm5;

/* loaded from: classes12.dex */
public abstract class d0 {
    public static java.lang.String a(com.tencent.mm.storage.f9 f9Var, bm5.f0 resType, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        boolean z19 = (i17 & 2) != 0 ? false : z17;
        boolean z27 = (i17 & 4) != 0 ? false : z18;
        kotlin.jvm.internal.o.g(f9Var, "<this>");
        kotlin.jvm.internal.o.g(resType, "resType");
        boolean z28 = f9Var.I0() == 0;
        return bm5.c0.f22550a.k(bm5.w.a(f9Var), resType, f9Var.Q0(), z28, z28 ? f9Var.getMsgId() : f9Var.I0(), null, z19, z27);
    }

    public static final java.lang.String b(com.tencent.mm.storage.f9 f9Var, bm5.f0 resType) {
        kotlin.jvm.internal.o.g(f9Var, "<this>");
        kotlin.jvm.internal.o.g(resType, "resType");
        java.lang.String m17 = bm5.c0.m(bm5.c0.f22550a, bm5.w.a(f9Var), resType, f9Var.Q0(), true, f9Var.getMsgId(), null, false, false, 96, null);
        if (com.tencent.mm.vfs.w6.j(m17)) {
            java.lang.String a17 = a(f9Var, resType, false, true, 2, null);
            if (!kotlin.jvm.internal.o.b(m17, a17)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.C2CPath", "move c2c temp file, src[" + m17 + "] -> dst[" + a17 + "], businessType: " + bm5.w.a(f9Var) + ", resType: " + resType + ", talker: " + f9Var.Q0() + ", localId: " + f9Var.getMsgId() + ", svrId: " + f9Var.I0() + ", ret: " + com.tencent.mm.vfs.w6.x(m17, a17, true));
                return a17;
            }
        }
        return m17;
    }
}
