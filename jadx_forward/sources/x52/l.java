package x52;

/* loaded from: classes15.dex */
public final class l {
    public l(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final r45.k16 a() {
        byte[] a17 = c52.c.a("mmkv_sionId_table_hell");
        if (a17 != null) {
            if (!(a17.length == 0)) {
                r45.k16 k16Var = new r45.k16();
                try {
                    k16Var.mo11468x92b714fd(a17);
                    return k16Var;
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.FuzzyMatchedBackup", e17, "SessionTable, _read: %s", e17.getMessage());
                }
            }
        }
        return null;
    }
}
