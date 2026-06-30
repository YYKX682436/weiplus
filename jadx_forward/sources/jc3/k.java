package jc3;

/* loaded from: classes7.dex */
public interface k {
    static /* synthetic */ void b(jc3.k kVar, lc3.z zVar, java.lang.Object obj, int i17, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onResult");
        }
        if ((i17 & 2) != 0) {
            obj = null;
        }
        kVar.a(zVar, obj);
    }

    void a(lc3.z zVar, java.lang.Object obj);
}
