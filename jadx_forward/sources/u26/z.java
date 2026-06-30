package u26;

/* loaded from: classes14.dex */
public abstract class z {
    public static u26.w a(int i17, u26.u uVar, yz5.l lVar, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            i17 = 0;
        }
        int i19 = i18 & 2;
        u26.u uVar2 = u26.u.SUSPEND;
        if (i19 != 0) {
            uVar = uVar2;
        }
        if ((i18 & 4) != 0) {
            lVar = null;
        }
        int i27 = 1;
        if (i17 == -2) {
            if (uVar == uVar2) {
                u26.w.f505733j1.getClass();
                i27 = u26.v.f505732b;
            }
            return new u26.r(i27, uVar, lVar);
        }
        if (i17 != -1) {
            return i17 != 0 ? i17 != Integer.MAX_VALUE ? (i17 == 1 && uVar == u26.u.DROP_OLDEST) ? new u26.l0(lVar) : new u26.r(i17, uVar, lVar) : new u26.m0(lVar) : uVar == uVar2 ? new u26.v0(lVar) : new u26.r(1, uVar, lVar);
        }
        if (uVar == uVar2) {
            return new u26.l0(lVar);
        }
        throw new java.lang.IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
    }
}
