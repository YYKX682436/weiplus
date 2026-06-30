package i52;

/* loaded from: classes9.dex */
public abstract class f {
    public static r45.y43 a() {
        byte[] a17 = c52.c.a("hell_mmkv_fbm__");
        if (a17 != null && a17.length > 0) {
            r45.y43 y43Var = new r45.y43();
            try {
                y43Var.mo11468x92b714fd(a17);
                return y43Var;
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.FragmentFrontBackMonitor", e17, "FragmentFrontBack, _read, crash: %s", e17.getMessage());
            }
        }
        return null;
    }

    public static void b(r45.y43 y43Var) {
        if (y43Var == null) {
            return;
        }
        try {
            c52.c.d("hell_mmkv_fbm__", y43Var.mo14344x5f01b1f6());
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.FragmentFrontBackMonitor", e17, "HellMsgQDao, _write, crash: %s", e17.getMessage());
        }
    }
}
