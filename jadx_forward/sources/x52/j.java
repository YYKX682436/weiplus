package x52;

/* loaded from: classes15.dex */
public final class j {
    public j(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final r45.h16 a() {
        byte[] a17 = c52.c.a("mmkv_sionpairD_table_hell");
        if (a17 != null) {
            if (!(a17.length == 0)) {
                r45.h16 h16Var = new r45.h16();
                try {
                    h16Var.mo11468x92b714fd(a17);
                    return h16Var;
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.SessionPairDao", e17, "SessionPair, _read: %s", e17.getMessage());
                }
            }
        }
        return null;
    }

    public final void b(r45.h16 h16Var) {
        if (h16Var == null) {
            return;
        }
        try {
            byte[] mo14344x5f01b1f6 = h16Var.mo14344x5f01b1f6();
            if (mo14344x5f01b1f6 == null) {
                return;
            }
            c52.c.d("mmkv_sionpairD_table_hell", mo14344x5f01b1f6);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.SessionPairDao", e17, "SessionPair, _write: %s", e17.getMessage());
        }
    }
}
