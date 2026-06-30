package lr0;

/* loaded from: classes11.dex */
public interface c {
    static /* synthetic */ boolean b(lr0.c cVar, boolean z17, int i17, yz5.l lVar, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pull");
        }
        if ((i18 & 1) != 0) {
            z17 = false;
        }
        if ((i18 & 2) != 0) {
            i17 = -1;
        }
        if ((i18 & 4) != 0) {
            lVar = null;
        }
        return cVar.a(z17, i17, lVar);
    }

    boolean a(boolean z17, int i17, yz5.l lVar);
}
