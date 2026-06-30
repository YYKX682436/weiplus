package c00;

/* loaded from: classes9.dex */
public interface e3 extends i95.m {
    static void n9(c00.e3 e3Var, android.content.Context context, java.util.Map params, yz5.a aVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openEcsGiftReceivePageWithLoading");
        }
        if ((i17 & 4) != 0) {
            aVar = null;
        }
        j00.k1 k1Var = (j00.k1) e3Var;
        k1Var.getClass();
        kotlin.jvm.internal.o.g(params, "params");
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "openEcsGiftReceivePageWithLoading, open with loading");
        k1Var.sj(context, params, new j00.v0(aVar), new j00.w0(k1Var, context, aVar));
    }
}
