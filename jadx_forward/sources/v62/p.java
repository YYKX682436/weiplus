package v62;

/* loaded from: classes12.dex */
public class p {

    /* renamed from: b, reason: collision with root package name */
    public static v62.p f515060b;

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f515061a = null;

    public static void a(java.lang.String str, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14869, str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    public static v62.p b() {
        v62.p pVar;
        v62.p pVar2 = f515060b;
        if (pVar2 != null) {
            return pVar2;
        }
        synchronized (v62.p.class) {
            if (f515060b == null) {
                f515060b = new v62.p();
            }
            pVar = f515060b;
        }
        return pVar;
    }

    public static void c(java.lang.String str, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14868, str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    public final v62.o d(v62.i iVar) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        v62.o oVar = (v62.o) new v62.l(this, 5000L, new v62.o(true), true, iVar).a(new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()));
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = oVar != null ? oVar.m171197x9616526c() : "null";
        objArr[1] = java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtQrCodeHandler", "hy: resolved qrcode: %s, using: %d ms", objArr);
        return oVar;
    }
}
