package ou4;

/* loaded from: classes8.dex */
public interface b0 {
    static /* synthetic */ void c(ou4.b0 b0Var, java.util.Map map, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: success");
        }
        if ((i17 & 1) != 0) {
            map = null;
        }
        b0Var.a(map);
    }

    void a(java.util.Map map);

    void b(java.lang.String str, java.lang.String str2);
}
