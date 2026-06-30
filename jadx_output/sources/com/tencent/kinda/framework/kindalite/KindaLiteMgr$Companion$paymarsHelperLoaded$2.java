package com.tencent.kinda.framework.kindalite;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class KindaLiteMgr$Companion$paymarsHelperLoaded$2 extends kotlin.jvm.internal.q implements yz5.a {
    public static final com.tencent.kinda.framework.kindalite.KindaLiteMgr$Companion$paymarsHelperLoaded$2 INSTANCE = new com.tencent.kinda.framework.kindalite.KindaLiteMgr$Companion$paymarsHelperLoaded$2();

    public KindaLiteMgr$Companion$paymarsHelperLoaded$2() {
        super(0);
    }

    @Override // yz5.a
    public final java.lang.Boolean invoke() {
        boolean z17;
        try {
            fp.d0.o("paymarshelper");
            com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.kindalite.KindaLiteMgr.TAG, "loadLibrary paymarshelper success");
            z17 = true;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e(com.tencent.kinda.framework.kindalite.KindaLiteMgr.TAG, "loadLibrary paymarshelper failed: " + th6.getMessage());
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
