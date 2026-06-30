package t52;

/* loaded from: classes11.dex */
public final class f {
    public f(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final r45.r53 a() {
        byte[] a17 = c52.c.a("mmkv_fuzzy_matched_bckup");
        if (a17 != null) {
            if (!(a17.length == 0)) {
                r45.r53 r53Var = new r45.r53();
                try {
                    r53Var.mo11468x92b714fd(a17);
                    return r53Var;
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.FuzzyMatchedBackup", e17, "FuzzyMatchedBackup, _read: %s", e17.getMessage());
                }
            }
        }
        return null;
    }

    public final void b(r45.r53 r53Var) {
        if (r53Var == null || r53Var.f466084d.isEmpty()) {
            return;
        }
        try {
            byte[] mo14344x5f01b1f6 = r53Var.mo14344x5f01b1f6();
            if (mo14344x5f01b1f6 == null) {
                return;
            }
            c52.c.d("mmkv_fuzzy_matched_bckup", mo14344x5f01b1f6);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.FuzzyMatchedBackup", e17, "FuzzyMatchedBackup, _write: %s", e17.getMessage());
        }
    }
}
