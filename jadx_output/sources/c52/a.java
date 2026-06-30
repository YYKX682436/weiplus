package c52;

/* loaded from: classes8.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final void a(int i17, long j17) {
        try {
            java.lang.String str = "hell_mlprocseq_" + i17;
            if (android.text.TextUtils.isEmpty(str)) {
                return;
            }
            c52.c.b().putLong(str, j17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.HellMultiProcessSeqGenerator", e17, "HellMultiProcessSeqGenerator.writeback", new java.lang.Object[0]);
        }
    }
}
