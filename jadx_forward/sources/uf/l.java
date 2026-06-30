package uf;

/* loaded from: classes7.dex */
public interface l {
    static /* synthetic */ void b(uf.l lVar, uf.a aVar, int i17, java.lang.String str, java.lang.String str2, boolean z17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleReport");
        }
        lVar.a(aVar, (i18 & 2) != 0 ? 0 : i17, (i18 & 4) != 0 ? "" : str, (i18 & 8) != 0 ? "" : str2, (i18 & 16) != 0 ? false : z17);
    }

    void a(uf.a aVar, int i17, java.lang.String str, java.lang.String str2, boolean z17);
}
