package rk4;

/* loaded from: classes.dex */
public final class j {
    public j(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.lang.String a(qk.ia iaVar) {
        int ordinal;
        if (iaVar == null || (ordinal = iaVar.ordinal()) == 0) {
            return "idle";
        }
        if (ordinal == 1) {
            return "playing";
        }
        if (ordinal == 2) {
            return "loading";
        }
        if (ordinal == 3) {
            return "paused";
        }
        throw new jz5.j();
    }
}
