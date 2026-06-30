package pm0;

/* loaded from: classes10.dex */
public interface z {
    static /* synthetic */ void a(pm0.z zVar, java.lang.String str, boolean z17, pm0.w wVar, java.lang.String str2, boolean z18, boolean z19, yz5.a aVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: assertFalse");
        }
        zVar.d(str, z17, (i17 & 4) != 0 ? pm0.w.f438337e : wVar, (i17 & 8) != 0 ? null : str2, (i17 & 16) != 0 ? true : z18, (i17 & 32) != 0 ? false : z19, (i17 & 64) != 0 ? pm0.x.f438342d : aVar);
    }

    static /* synthetic */ void b(pm0.z zVar, java.lang.String str, boolean z17, pm0.w wVar, java.lang.String str2, boolean z18, boolean z19, yz5.a aVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: assertTrue");
        }
        zVar.c(str, z17, (i17 & 4) != 0 ? pm0.w.f438337e : wVar, (i17 & 8) != 0 ? null : str2, (i17 & 16) != 0 ? true : z18, (i17 & 32) != 0 ? false : z19, (i17 & 64) != 0 ? pm0.y.f438343d : aVar);
    }

    void c(java.lang.String str, boolean z17, pm0.w wVar, java.lang.String str2, boolean z18, boolean z19, yz5.a aVar);

    void d(java.lang.String str, boolean z17, pm0.w wVar, java.lang.String str2, boolean z18, boolean z19, yz5.a aVar);
}
