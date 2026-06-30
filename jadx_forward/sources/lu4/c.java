package lu4;

/* loaded from: classes7.dex */
public interface c extends lu4.b {
    static /* synthetic */ void u(lu4.c cVar, java.lang.String str, java.lang.String str2, android.webkit.ValueCallback valueCallback, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatch");
        }
        if ((i17 & 2) != 0) {
            str2 = "{}";
        }
        if ((i17 & 4) != 0) {
            valueCallback = null;
        }
        cVar.t(str, str2, valueCallback);
    }

    void t(java.lang.String str, java.lang.String str2, android.webkit.ValueCallback valueCallback);
}
