package sf1;

/* loaded from: classes5.dex */
public interface g {
    static /* synthetic */ void c(sf1.g gVar, java.lang.String str, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onConnectFailure");
        }
        if ((i17 & 1) != 0) {
            str = "";
        }
        gVar.b(str);
    }

    void a();

    void b(java.lang.String str);
}
