package c52;

/* loaded from: classes8.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(int i17, long j17) {
        try {
            java.lang.String str = "hell_mlprocseq_" + i17;
            if (android.text.TextUtils.isEmpty(str)) {
                return;
            }
            c52.c.b().putLong(str, j17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.HellMultiProcessSeqGenerator", e17, "HellMultiProcessSeqGenerator.writeback", new java.lang.Object[0]);
        }
    }
}
