package x31;

/* loaded from: classes7.dex */
public interface a {
    static /* synthetic */ void a(x31.a aVar, int i17, java.lang.String str, java.lang.String str2, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: callback");
        }
        if ((i18 & 4) != 0) {
            str2 = "";
        }
        aVar.b(i17, str, str2);
    }

    void b(int i17, java.lang.String str, java.lang.String str2);
}
