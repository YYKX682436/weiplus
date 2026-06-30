package nu4;

/* loaded from: classes7.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final nu4.h f421785d = new nu4.h();

    @Override // java.lang.Runnable
    public final void run() {
        java.util.HashMap hashMap = nu4.b0.V;
        synchronized (hashMap) {
            java.util.Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.u3 u3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.u3) ((java.util.Map.Entry) it.next()).getValue();
                if (u3Var instanceof java.io.Closeable) {
                    com.p314xaae8f345.p519xbf8bc95e.p536x4beb0e9c.p538x696c9db.IO.m37447xbb07de6b((java.io.Closeable) u3Var);
                }
            }
            nu4.b0.V.clear();
        }
    }
}
