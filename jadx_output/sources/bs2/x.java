package bs2;

/* loaded from: classes2.dex */
public final class x {
    public x(kotlin.jvm.internal.i iVar) {
    }

    public final r45.xs2 a(int i17, zy2.fa redDotManager) {
        r45.xs2 xs2Var;
        kotlin.jvm.internal.o.g(redDotManager, "redDotManager");
        java.lang.String a17 = com.tencent.mm.plugin.finder.extension.reddot.ba.a(i17);
        r45.xs2 Q = redDotManager.Q(a17);
        if (Q != null && (Q.getLong(3) != 0 || Q.getByteString(7) != null)) {
            return Q;
        }
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = redDotManager.L0("FinderEntrance");
        if (L0 != null && (xs2Var = L0.N) != null) {
            if (!(xs2Var.getLong(3) != 0 && xs2Var.getInteger(9) == i17)) {
                xs2Var = null;
            }
            if (xs2Var != null) {
                return xs2Var;
            }
        }
        com.tencent.mm.plugin.finder.extension.reddot.jb L02 = redDotManager.L0(a17);
        if (L02 != null) {
            return L02.N;
        }
        return null;
    }
}
