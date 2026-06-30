package h52;

/* loaded from: classes15.dex */
public final class d extends h52.a {
    public final r45.x1 a() {
        byte[] a17 = c52.c.a("hell_aty_action_mmkv_key");
        if (a17 == null || a17.length <= 0) {
            return null;
        }
        r45.x1 x1Var = new r45.x1();
        try {
            x1Var.mo11468x92b714fd(a17);
            return x1Var;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.ActivityDao_MMKV", e17, "HellhoundDao _doRead parse", new java.lang.Object[0]);
            return null;
        }
    }

    public final void b(r45.x1 x1Var) {
        try {
            c52.c.d("hell_aty_action_mmkv_key", x1Var.mo14344x5f01b1f6());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.ActivityDao_MMKV", e17, "HellhoundDao writeBack", new java.lang.Object[0]);
        }
    }
}
